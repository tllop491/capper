import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class lidloader_controller extends ClockDomain{
  public lidloader_controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.INPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.INPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.INPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.INPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.INPUT);
  public Signal empty = new Signal("empty", Signal.INPUT);
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.INPUT);
  public Signal pusherExtend = new Signal("pusherExtend", Signal.OUTPUT);
  public Signal vacOn = new Signal("vacOn", Signal.OUTPUT);
  public Signal armSource = new Signal("armSource", Signal.OUTPUT);
  public Signal armDest = new Signal("armDest", Signal.OUTPUT);
  public output_Channel readyLidLoader_o = new output_Channel();
  private int S159163 = 1;
  private int S159162 = 1;
  private int S157130 = 1;
  private int S157125 = 1;
  private int S157191 = 1;
  private int S157153 = 1;
  private int S157148 = 1;
  private int S157236 = 1;
  private int S157233 = 1;
  private int S157242 = 1;
  private int S157276 = 1;
  private int S157271 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread159169(int [] tdone, int [] ends){
        switch(S157242){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\lidloader_controller.sysj line: 35, column: 10
          S157242=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        else {
          vacOn.setPresent();//sysj\lidloader_controller.sysj line: 36, column: 5
          currsigs.addElement(vacOn);
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread159168(int [] tdone, int [] ends){
        switch(S157236){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\lidloader_controller.sysj line: 28, column: 10
          S157236=0;
          active[2]=0;
          ends[2]=0;
          tdone[2]=1;
        }
        else {
          switch(S157233){
            case 0 : 
              if(WPgripped.getprestatus()){//sysj\lidloader_controller.sysj line: 29, column: 11
                S157233=1;
                armDest.setPresent();//sysj\lidloader_controller.sysj line: 30, column: 5
                currsigs.addElement(armDest);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              break;
            
            case 1 : 
              armDest.setPresent();//sysj\lidloader_controller.sysj line: 30, column: 5
              currsigs.addElement(armDest);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
              break;
            
          }
        }
        break;
      
    }
  }

  public void thread159166(int [] tdone, int [] ends){
        S157242=1;
    vacOn.setPresent();//sysj\lidloader_controller.sysj line: 36, column: 5
    currsigs.addElement(vacOn);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread159165(int [] tdone, int [] ends){
        S157236=1;
    S157233=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S159163){
        case 0 : 
          S159163=0;
          break RUN;
        
        case 1 : 
          S159163=2;
          S159163=2;
          S159162=0;
          S157130=0;
          if(!readyLidLoader_o.isPartnerPresent() || readyLidLoader_o.isPartnerPreempted()){//sysj\lidloader_controller.sysj line: 12, column: 2
            readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 12, column: 2
            S157130=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S157125=0;
            if(readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 12, column: 2
              readyLidLoader_o.setVal(Boolean.TRUE);//sysj\lidloader_controller.sysj line: 12, column: 2
              S157125=1;
              if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 12, column: 2
                readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 12, column: 2
                ends[1]=2;
                ;//sysj\lidloader_controller.sysj line: 12, column: 2
                S159162=1;
                S157191=0;
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
          switch(S159162){
            case 0 : 
              switch(S157130){
                case 0 : 
                  if(!readyLidLoader_o.isPartnerPresent() || readyLidLoader_o.isPartnerPreempted()){//sysj\lidloader_controller.sysj line: 12, column: 2
                    readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 12, column: 2
                    S157130=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S157125){
                      case 0 : 
                        if(readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 12, column: 2
                          readyLidLoader_o.setVal(Boolean.TRUE);//sysj\lidloader_controller.sysj line: 12, column: 2
                          S157125=1;
                          if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 12, column: 2
                            readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 12, column: 2
                            ends[1]=2;
                            ;//sysj\lidloader_controller.sysj line: 12, column: 2
                            S159162=1;
                            S157191=0;
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
                        if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 12, column: 2
                          readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 12, column: 2
                          ends[1]=2;
                          ;//sysj\lidloader_controller.sysj line: 12, column: 2
                          S159162=1;
                          S157191=0;
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
                  S157130=1;
                  S157130=0;
                  if(!readyLidLoader_o.isPartnerPresent() || readyLidLoader_o.isPartnerPreempted()){//sysj\lidloader_controller.sysj line: 12, column: 2
                    readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 12, column: 2
                    S157130=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S157125=0;
                    if(readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 12, column: 2
                      readyLidLoader_o.setVal(Boolean.TRUE);//sysj\lidloader_controller.sysj line: 12, column: 2
                      S157125=1;
                      if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 12, column: 2
                        readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 12, column: 2
                        ends[1]=2;
                        ;//sysj\lidloader_controller.sysj line: 12, column: 2
                        S159162=1;
                        S157191=0;
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
              switch(S157191){
                case 0 : 
                  if(bottleAtPos3.getprestatus() && !empty.getprestatus()){//sysj\lidloader_controller.sysj line: 14, column: 9
                    S157191=1;
                    S157153=0;
                    if(!readyLidLoader_o.isPartnerPresent() || readyLidLoader_o.isPartnerPreempted()){//sysj\lidloader_controller.sysj line: 15, column: 3
                      readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 15, column: 3
                      S157153=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S157148=0;
                      if(readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 15, column: 3
                        readyLidLoader_o.setVal(Boolean.FALSE);//sysj\lidloader_controller.sysj line: 15, column: 3
                        S157148=1;
                        if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 15, column: 3
                          readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 15, column: 3
                          ends[1]=2;
                          ;//sysj\lidloader_controller.sysj line: 15, column: 3
                          S157191=2;
                          armDest.setPresent();//sysj\lidloader_controller.sysj line: 17, column: 4
                          currsigs.addElement(armDest);
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
                  switch(S157153){
                    case 0 : 
                      if(!readyLidLoader_o.isPartnerPresent() || readyLidLoader_o.isPartnerPreempted()){//sysj\lidloader_controller.sysj line: 15, column: 3
                        readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 15, column: 3
                        S157153=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S157148){
                          case 0 : 
                            if(readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 15, column: 3
                              readyLidLoader_o.setVal(Boolean.FALSE);//sysj\lidloader_controller.sysj line: 15, column: 3
                              S157148=1;
                              if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 15, column: 3
                                readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 15, column: 3
                                ends[1]=2;
                                ;//sysj\lidloader_controller.sysj line: 15, column: 3
                                S157191=2;
                                armDest.setPresent();//sysj\lidloader_controller.sysj line: 17, column: 4
                                currsigs.addElement(armDest);
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
                            if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 15, column: 3
                              readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 15, column: 3
                              ends[1]=2;
                              ;//sysj\lidloader_controller.sysj line: 15, column: 3
                              S157191=2;
                              armDest.setPresent();//sysj\lidloader_controller.sysj line: 17, column: 4
                              currsigs.addElement(armDest);
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
                      S157153=1;
                      S157153=0;
                      if(!readyLidLoader_o.isPartnerPresent() || readyLidLoader_o.isPartnerPreempted()){//sysj\lidloader_controller.sysj line: 15, column: 3
                        readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 15, column: 3
                        S157153=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S157148=0;
                        if(readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 15, column: 3
                          readyLidLoader_o.setVal(Boolean.FALSE);//sysj\lidloader_controller.sysj line: 15, column: 3
                          S157148=1;
                          if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 15, column: 3
                            readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 15, column: 3
                            ends[1]=2;
                            ;//sysj\lidloader_controller.sysj line: 15, column: 3
                            S157191=2;
                            armDest.setPresent();//sysj\lidloader_controller.sysj line: 17, column: 4
                            currsigs.addElement(armDest);
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
                  if(armAtDest.getprestatus()){//sysj\lidloader_controller.sysj line: 16, column: 9
                    S157191=3;
                    pusherExtend.setPresent();//sysj\lidloader_controller.sysj line: 20, column: 4
                    currsigs.addElement(pusherExtend);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    armDest.setPresent();//sysj\lidloader_controller.sysj line: 17, column: 4
                    currsigs.addElement(armDest);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 3 : 
                  if(pusherExtended.getprestatus()){//sysj\lidloader_controller.sysj line: 19, column: 9
                    S157191=4;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    pusherExtend.setPresent();//sysj\lidloader_controller.sysj line: 20, column: 4
                    currsigs.addElement(pusherExtend);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 4 : 
                  if(pusherRetracted.getprestatus()){//sysj\lidloader_controller.sysj line: 22, column: 9
                    S157191=5;
                    armSource.setPresent();//sysj\lidloader_controller.sysj line: 24, column: 4
                    currsigs.addElement(armSource);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 5 : 
                  if(armAtSource.getprestatus()){//sysj\lidloader_controller.sysj line: 23, column: 9
                    S157191=6;
                    thread159165(tdone,ends);
                    thread159166(tdone,ends);
                    int biggest159167 = 0;
                    if(ends[2]>=biggest159167){
                      biggest159167=ends[2];
                    }
                    if(ends[3]>=biggest159167){
                      biggest159167=ends[3];
                    }
                    if(biggest159167 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    armSource.setPresent();//sysj\lidloader_controller.sysj line: 24, column: 4
                    currsigs.addElement(armSource);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 6 : 
                  thread159168(tdone,ends);
                  thread159169(tdone,ends);
                  int biggest159170 = 0;
                  if(ends[2]>=biggest159170){
                    biggest159170=ends[2];
                  }
                  if(ends[3]>=biggest159170){
                    biggest159170=ends[3];
                  }
                  if(biggest159170 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest159170 == 0){
                    S157191=7;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 7 : 
                  if(!WPgripped.getprestatus()){//sysj\lidloader_controller.sysj line: 40, column: 9
                    S157191=8;
                    armSource.setPresent();//sysj\lidloader_controller.sysj line: 42, column: 4
                    currsigs.addElement(armSource);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 8 : 
                  if(armAtSource.getprestatus()){//sysj\lidloader_controller.sysj line: 41, column: 9
                    S157191=9;
                    S157276=0;
                    if(!readyLidLoader_o.isPartnerPresent() || readyLidLoader_o.isPartnerPreempted()){//sysj\lidloader_controller.sysj line: 45, column: 3
                      readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 45, column: 3
                      S157276=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S157271=0;
                      if(readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 45, column: 3
                        readyLidLoader_o.setVal(Boolean.TRUE);//sysj\lidloader_controller.sysj line: 45, column: 3
                        S157271=1;
                        if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 45, column: 3
                          readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 45, column: 3
                          ends[1]=2;
                          ;//sysj\lidloader_controller.sysj line: 45, column: 3
                          S157191=10;
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
                    armSource.setPresent();//sysj\lidloader_controller.sysj line: 42, column: 4
                    currsigs.addElement(armSource);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 9 : 
                  switch(S157276){
                    case 0 : 
                      if(!readyLidLoader_o.isPartnerPresent() || readyLidLoader_o.isPartnerPreempted()){//sysj\lidloader_controller.sysj line: 45, column: 3
                        readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 45, column: 3
                        S157276=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S157271){
                          case 0 : 
                            if(readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 45, column: 3
                              readyLidLoader_o.setVal(Boolean.TRUE);//sysj\lidloader_controller.sysj line: 45, column: 3
                              S157271=1;
                              if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 45, column: 3
                                readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 45, column: 3
                                ends[1]=2;
                                ;//sysj\lidloader_controller.sysj line: 45, column: 3
                                S157191=10;
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
                            if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 45, column: 3
                              readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 45, column: 3
                              ends[1]=2;
                              ;//sysj\lidloader_controller.sysj line: 45, column: 3
                              S157191=10;
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
                      S157276=1;
                      S157276=0;
                      if(!readyLidLoader_o.isPartnerPresent() || readyLidLoader_o.isPartnerPreempted()){//sysj\lidloader_controller.sysj line: 45, column: 3
                        readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 45, column: 3
                        S157276=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S157271=0;
                        if(readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 45, column: 3
                          readyLidLoader_o.setVal(Boolean.TRUE);//sysj\lidloader_controller.sysj line: 45, column: 3
                          S157271=1;
                          if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 45, column: 3
                            readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 45, column: 3
                            ends[1]=2;
                            ;//sysj\lidloader_controller.sysj line: 45, column: 3
                            S157191=10;
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
                
                case 10 : 
                  S157191=10;
                  S157191=0;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                
              }
              break;
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0};
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
          readyLidLoader_o.gethook();
          pusherRetracted.gethook();
          pusherExtended.gethook();
          WPgripped.gethook();
          armAtSource.gethook();
          armAtDest.gethook();
          empty.gethook();
          bottleAtPos3.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      bottleAtPos3.setpreclear();
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherRetracted.getStatus() ? pusherRetracted.setprepresent() : pusherRetracted.setpreclear();
      pusherRetracted.setpreval(pusherRetracted.getValue());
      pusherRetracted.setClear();
      dummyint = pusherExtended.getStatus() ? pusherExtended.setprepresent() : pusherExtended.setpreclear();
      pusherExtended.setpreval(pusherExtended.getValue());
      pusherExtended.setClear();
      dummyint = WPgripped.getStatus() ? WPgripped.setprepresent() : WPgripped.setpreclear();
      WPgripped.setpreval(WPgripped.getValue());
      WPgripped.setClear();
      dummyint = armAtSource.getStatus() ? armAtSource.setprepresent() : armAtSource.setpreclear();
      armAtSource.setpreval(armAtSource.getValue());
      armAtSource.setClear();
      dummyint = armAtDest.getStatus() ? armAtDest.setprepresent() : armAtDest.setpreclear();
      armAtDest.setpreval(armAtDest.getValue());
      armAtDest.setClear();
      dummyint = empty.getStatus() ? empty.setprepresent() : empty.setpreclear();
      empty.setpreval(empty.getValue());
      empty.setClear();
      dummyint = bottleAtPos3.getStatus() ? bottleAtPos3.setprepresent() : bottleAtPos3.setpreclear();
      bottleAtPos3.setpreval(bottleAtPos3.getValue());
      bottleAtPos3.setClear();
      pusherExtend.sethook();
      pusherExtend.setClear();
      vacOn.sethook();
      vacOn.setClear();
      armSource.sethook();
      armSource.setClear();
      armDest.sethook();
      armDest.setClear();
      readyLidLoader_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        readyLidLoader_o.gethook();
        pusherRetracted.gethook();
        pusherExtended.gethook();
        WPgripped.gethook();
        armAtSource.gethook();
        armAtDest.gethook();
        empty.gethook();
        bottleAtPos3.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
