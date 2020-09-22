import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class conveyor_controller extends ClockDomain{
  public conveyor_controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos1c = new Signal("bottleAtPos1c", Signal.INPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.INPUT);
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.OUTPUT);
  public output_Channel readyConveyor_o = new output_Channel();
  private int S6191 = 1;
  private int S6190 = 1;
  private int S3854 = 1;
  private int S3849 = 1;
  private int S3915 = 1;
  private int S3877 = 1;
  private int S3872 = 1;
  private int S3948 = 1;
  private int S3943 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S6191){
        case 0 : 
          S6191=0;
          break RUN;
        
        case 1 : 
          S6191=2;
          S6191=2;
          S6190=0;
          S3854=0;
          if(!readyConveyor_o.isPartnerPresent() || readyConveyor_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 10, column: 2
            readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 2
            S3854=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S3849=0;
            if(readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 2
              readyConveyor_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 10, column: 2
              S3849=1;
              if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 2
                readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 2
                ends[1]=2;
                ;//sysj\conveyor_controller.sysj line: 10, column: 2
                S6190=1;
                S3915=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            }
            else {
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
        
        case 2 : 
          switch(S6190){
            case 0 : 
              switch(S3854){
                case 0 : 
                  if(!readyConveyor_o.isPartnerPresent() || readyConveyor_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 10, column: 2
                    readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 2
                    S3854=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S3849){
                      case 0 : 
                        if(readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 2
                          readyConveyor_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 10, column: 2
                          S3849=1;
                          if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 2
                            readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 2
                            ends[1]=2;
                            ;//sysj\conveyor_controller.sysj line: 10, column: 2
                            S6190=1;
                            S3915=0;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 2
                          readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 2
                          ends[1]=2;
                          ;//sysj\conveyor_controller.sysj line: 10, column: 2
                          S6190=1;
                          S3915=0;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3854=1;
                  S3854=0;
                  if(!readyConveyor_o.isPartnerPresent() || readyConveyor_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 10, column: 2
                    readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 2
                    S3854=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S3849=0;
                    if(readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 2
                      readyConveyor_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 10, column: 2
                      S3849=1;
                      if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 10, column: 2
                        readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 10, column: 2
                        ends[1]=2;
                        ;//sysj\conveyor_controller.sysj line: 10, column: 2
                        S6190=1;
                        S3915=0;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              switch(S3915){
                case 0 : 
                  if(!bottleLeftPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 13, column: 10
                    S3915=1;
                    S3877=0;
                    if(!readyConveyor_o.isPartnerPresent() || readyConveyor_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 14, column: 3
                      readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 3
                      S3877=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S3872=0;
                      if(readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 3
                        readyConveyor_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 14, column: 3
                        S3872=1;
                        if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 3
                          readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 3
                          ends[1]=2;
                          ;//sysj\conveyor_controller.sysj line: 14, column: 3
                          S3915=2;
                          motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 16, column: 4
                          currsigs.addElement(motConveyorOnOff);
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  switch(S3877){
                    case 0 : 
                      if(!readyConveyor_o.isPartnerPresent() || readyConveyor_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 14, column: 3
                        readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 3
                        S3877=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S3872){
                          case 0 : 
                            if(readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 3
                              readyConveyor_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 14, column: 3
                              S3872=1;
                              if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 3
                                readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 3
                                ends[1]=2;
                                ;//sysj\conveyor_controller.sysj line: 14, column: 3
                                S3915=2;
                                motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 16, column: 4
                                currsigs.addElement(motConveyorOnOff);
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          
                          case 1 : 
                            if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 3
                              readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 3
                              ends[1]=2;
                              ;//sysj\conveyor_controller.sysj line: 14, column: 3
                              S3915=2;
                              motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 16, column: 4
                              currsigs.addElement(motConveyorOnOff);
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          
                        }
                      }
                      break;
                    
                    case 1 : 
                      S3877=1;
                      S3877=0;
                      if(!readyConveyor_o.isPartnerPresent() || readyConveyor_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 14, column: 3
                        readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 3
                        S3877=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S3872=0;
                        if(readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 3
                          readyConveyor_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 14, column: 3
                          S3872=1;
                          if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 14, column: 3
                            readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 14, column: 3
                            ends[1]=2;
                            ;//sysj\conveyor_controller.sysj line: 14, column: 3
                            S3915=2;
                            motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 16, column: 4
                            currsigs.addElement(motConveyorOnOff);
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    
                  }
                  break;
                
                case 2 : 
                  if(bottleAtPos1c.getprestatus()){//sysj\conveyor_controller.sysj line: 15, column: 9
                    S3915=3;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 16, column: 4
                    currsigs.addElement(motConveyorOnOff);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 3 : 
                  if(bottleLeftPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 19, column: 10
                    S3915=4;
                    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 21, column: 4
                    currsigs.addElement(motConveyorOnOff);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 4 : 
                  if(!bottleLeftPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 20, column: 9
                    S3915=5;
                    S3948=0;
                    if(!readyConveyor_o.isPartnerPresent() || readyConveyor_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 23, column: 3
                      readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 3
                      S3948=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S3943=0;
                      if(readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 3
                        readyConveyor_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 23, column: 3
                        S3943=1;
                        if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 3
                          readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 3
                          ends[1]=2;
                          ;//sysj\conveyor_controller.sysj line: 23, column: 3
                          S3915=0;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                  }
                  else {
                    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 21, column: 4
                    currsigs.addElement(motConveyorOnOff);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 5 : 
                  switch(S3948){
                    case 0 : 
                      if(!readyConveyor_o.isPartnerPresent() || readyConveyor_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 23, column: 3
                        readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 3
                        S3948=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S3943){
                          case 0 : 
                            if(readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 3
                              readyConveyor_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 23, column: 3
                              S3943=1;
                              if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 3
                                readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 3
                                ends[1]=2;
                                ;//sysj\conveyor_controller.sysj line: 23, column: 3
                                S3915=0;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          
                          case 1 : 
                            if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 3
                              readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 3
                              ends[1]=2;
                              ;//sysj\conveyor_controller.sysj line: 23, column: 3
                              S3915=0;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          
                        }
                      }
                      break;
                    
                    case 1 : 
                      S3948=1;
                      S3948=0;
                      if(!readyConveyor_o.isPartnerPresent() || readyConveyor_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 23, column: 3
                        readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 3
                        S3948=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S3943=0;
                        if(readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 3
                          readyConveyor_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 23, column: 3
                          S3943=1;
                          if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 23, column: 3
                            readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 23, column: 3
                            ends[1]=2;
                            ;//sysj\conveyor_controller.sysj line: 23, column: 3
                            S3915=0;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    
                  }
                  break;
                
              }
              break;
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1};
    char [] paused1 = {0, 0};
    char [] suspended1 = {0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          readyConveyor_o.gethook();
          bottleAtPos1c.gethook();
          bottleLeftPos5.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos1c.setpreclear();
      bottleLeftPos5.setpreclear();
      motConveyorOnOff.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos1c.getStatus() ? bottleAtPos1c.setprepresent() : bottleAtPos1c.setpreclear();
      bottleAtPos1c.setpreval(bottleAtPos1c.getValue());
      bottleAtPos1c.setClear();
      dummyint = bottleLeftPos5.getStatus() ? bottleLeftPos5.setprepresent() : bottleLeftPos5.setpreclear();
      bottleLeftPos5.setpreval(bottleLeftPos5.getValue());
      bottleLeftPos5.setClear();
      motConveyorOnOff.sethook();
      motConveyorOnOff.setClear();
      readyConveyor_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        readyConveyor_o.gethook();
        bottleAtPos1c.gethook();
        bottleLeftPos5.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
