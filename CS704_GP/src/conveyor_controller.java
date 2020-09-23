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
  private int S6557 = 1;
  private int S6556 = 1;
  private int S3900 = 1;
  private int S3895 = 1;
  private int S3961 = 1;
  private int S3923 = 1;
  private int S3918 = 1;
  private int S4010 = 1;
  private int S4005 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S6557){
        case 0 : 
          S6557=0;
          break RUN;
        
        case 1 : 
          S6557=2;
          S6557=2;
          S6556=0;
          S3900=0;
          if(!readyConveyor_o.isPartnerPresent() || readyConveyor_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 11, column: 2
            readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 11, column: 2
            S3900=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S3895=0;
            if(readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 11, column: 2
              readyConveyor_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 11, column: 2
              S3895=1;
              if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 11, column: 2
                readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 11, column: 2
                ends[1]=2;
                ;//sysj\conveyor_controller.sysj line: 11, column: 2
                S6556=1;
                S3961=0;
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
          switch(S6556){
            case 0 : 
              switch(S3900){
                case 0 : 
                  if(!readyConveyor_o.isPartnerPresent() || readyConveyor_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 11, column: 2
                    readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 11, column: 2
                    S3900=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S3895){
                      case 0 : 
                        if(readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 11, column: 2
                          readyConveyor_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 11, column: 2
                          S3895=1;
                          if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 11, column: 2
                            readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 11, column: 2
                            ends[1]=2;
                            ;//sysj\conveyor_controller.sysj line: 11, column: 2
                            S6556=1;
                            S3961=0;
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
                        if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 11, column: 2
                          readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 11, column: 2
                          ends[1]=2;
                          ;//sysj\conveyor_controller.sysj line: 11, column: 2
                          S6556=1;
                          S3961=0;
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
                  S3900=1;
                  S3900=0;
                  if(!readyConveyor_o.isPartnerPresent() || readyConveyor_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 11, column: 2
                    readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 11, column: 2
                    S3900=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S3895=0;
                    if(readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 11, column: 2
                      readyConveyor_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 11, column: 2
                      S3895=1;
                      if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 11, column: 2
                        readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 11, column: 2
                        ends[1]=2;
                        ;//sysj\conveyor_controller.sysj line: 11, column: 2
                        S6556=1;
                        S3961=0;
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
              switch(S3961){
                case 0 : 
                  if(!bottleLeftPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 14, column: 10
                    S3961=1;
                    S3923=0;
                    if(!readyConveyor_o.isPartnerPresent() || readyConveyor_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 15, column: 3
                      readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 15, column: 3
                      S3923=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S3918=0;
                      if(readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 15, column: 3
                        readyConveyor_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 15, column: 3
                        S3918=1;
                        if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 15, column: 3
                          readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 15, column: 3
                          ends[1]=2;
                          ;//sysj\conveyor_controller.sysj line: 15, column: 3
                          System.out.println("CONVEYOR NOT RUNNING");//sysj\conveyor_controller.sysj line: 16, column: 3
                          S3961=2;
                          System.out.println("CONVEYOR RUNNING");//sysj\conveyor_controller.sysj line: 18, column: 4
                          motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 19, column: 4
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
                  switch(S3923){
                    case 0 : 
                      if(!readyConveyor_o.isPartnerPresent() || readyConveyor_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 15, column: 3
                        readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 15, column: 3
                        S3923=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S3918){
                          case 0 : 
                            if(readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 15, column: 3
                              readyConveyor_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 15, column: 3
                              S3918=1;
                              if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 15, column: 3
                                readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 15, column: 3
                                ends[1]=2;
                                ;//sysj\conveyor_controller.sysj line: 15, column: 3
                                System.out.println("CONVEYOR NOT RUNNING");//sysj\conveyor_controller.sysj line: 16, column: 3
                                S3961=2;
                                System.out.println("CONVEYOR RUNNING");//sysj\conveyor_controller.sysj line: 18, column: 4
                                motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 19, column: 4
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
                            if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 15, column: 3
                              readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 15, column: 3
                              ends[1]=2;
                              ;//sysj\conveyor_controller.sysj line: 15, column: 3
                              System.out.println("CONVEYOR NOT RUNNING");//sysj\conveyor_controller.sysj line: 16, column: 3
                              S3961=2;
                              System.out.println("CONVEYOR RUNNING");//sysj\conveyor_controller.sysj line: 18, column: 4
                              motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 19, column: 4
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
                      S3923=1;
                      S3923=0;
                      if(!readyConveyor_o.isPartnerPresent() || readyConveyor_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 15, column: 3
                        readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 15, column: 3
                        S3923=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S3918=0;
                        if(readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 15, column: 3
                          readyConveyor_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 15, column: 3
                          S3918=1;
                          if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 15, column: 3
                            readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 15, column: 3
                            ends[1]=2;
                            ;//sysj\conveyor_controller.sysj line: 15, column: 3
                            System.out.println("CONVEYOR NOT RUNNING");//sysj\conveyor_controller.sysj line: 16, column: 3
                            S3961=2;
                            System.out.println("CONVEYOR RUNNING");//sysj\conveyor_controller.sysj line: 18, column: 4
                            motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 19, column: 4
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
                  if(bottleAtPos1c.getprestatus()){//sysj\conveyor_controller.sysj line: 17, column: 9
                    S3961=3;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 19, column: 4
                    currsigs.addElement(motConveyorOnOff);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 3 : 
                  if(bottleLeftPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 22, column: 10
                    S3961=4;
                    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 24, column: 4
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
                  if(!bottleLeftPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 23, column: 9
                    S3961=5;
                    S4010=0;
                    if(!readyConveyor_o.isPartnerPresent() || readyConveyor_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 26, column: 3
                      readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 26, column: 3
                      S4010=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S4005=0;
                      if(readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 26, column: 3
                        readyConveyor_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 26, column: 3
                        S4005=1;
                        if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 26, column: 3
                          readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 26, column: 3
                          ends[1]=2;
                          ;//sysj\conveyor_controller.sysj line: 26, column: 3
                          S3961=0;
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
                    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 24, column: 4
                    currsigs.addElement(motConveyorOnOff);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 5 : 
                  switch(S4010){
                    case 0 : 
                      if(!readyConveyor_o.isPartnerPresent() || readyConveyor_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 26, column: 3
                        readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 26, column: 3
                        S4010=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S4005){
                          case 0 : 
                            if(readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 26, column: 3
                              readyConveyor_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 26, column: 3
                              S4005=1;
                              if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 26, column: 3
                                readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 26, column: 3
                                ends[1]=2;
                                ;//sysj\conveyor_controller.sysj line: 26, column: 3
                                S3961=0;
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
                            if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 26, column: 3
                              readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 26, column: 3
                              ends[1]=2;
                              ;//sysj\conveyor_controller.sysj line: 26, column: 3
                              S3961=0;
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
                      S4010=1;
                      S4010=0;
                      if(!readyConveyor_o.isPartnerPresent() || readyConveyor_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 26, column: 3
                        readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 26, column: 3
                        S4010=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S4005=0;
                        if(readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 26, column: 3
                          readyConveyor_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 26, column: 3
                          S4005=1;
                          if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 26, column: 3
                            readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 26, column: 3
                            ends[1]=2;
                            ;//sysj\conveyor_controller.sysj line: 26, column: 3
                            S3961=0;
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
