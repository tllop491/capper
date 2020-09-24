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
  private int S159218 = 1;
  private int S159217 = 1;
  private int S157185 = 1;
  private int S157180 = 1;
  private int S157246 = 1;
  private int S157208 = 1;
  private int S157203 = 1;
  private int S157291 = 1;
  private int S157288 = 1;
  private int S157297 = 1;
  private int S157331 = 1;
  private int S157326 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread159224(int [] tdone, int [] ends){
        switch(S157297){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\lidloader_controller.sysj line: 33, column: 10
          S157297=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        else {
          vacOn.setPresent();//sysj\lidloader_controller.sysj line: 34, column: 5
          currsigs.addElement(vacOn);
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread159223(int [] tdone, int [] ends){
        switch(S157291){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\lidloader_controller.sysj line: 26, column: 10
          S157291=0;
          active[2]=0;
          ends[2]=0;
          tdone[2]=1;
        }
        else {
          switch(S157288){
            case 0 : 
              if(WPgripped.getprestatus()){//sysj\lidloader_controller.sysj line: 27, column: 11
                S157288=1;
                armDest.setPresent();//sysj\lidloader_controller.sysj line: 28, column: 5
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
              armDest.setPresent();//sysj\lidloader_controller.sysj line: 28, column: 5
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

  public void thread159221(int [] tdone, int [] ends){
        S157297=1;
    vacOn.setPresent();//sysj\lidloader_controller.sysj line: 34, column: 5
    currsigs.addElement(vacOn);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread159220(int [] tdone, int [] ends){
        S157291=1;
    S157288=0;
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
      switch(S159218){
        case 0 : 
          S159218=0;
          break RUN;
        
        case 1 : 
          S159218=2;
          S159218=2;
          S159217=0;
          S157185=0;
          if(!readyLidLoader_o.isPartnerPresent() || readyLidLoader_o.isPartnerPreempted()){//sysj\lidloader_controller.sysj line: 10, column: 2
            readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 10, column: 2
            S157185=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S157180=0;
            if(readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 10, column: 2
              readyLidLoader_o.setVal(true);//sysj\lidloader_controller.sysj line: 10, column: 2
              S157180=1;
              if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 10, column: 2
                readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 10, column: 2
                ends[1]=2;
                ;//sysj\lidloader_controller.sysj line: 10, column: 2
                S159217=1;
                S157246=0;
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
          switch(S159217){
            case 0 : 
              switch(S157185){
                case 0 : 
                  if(!readyLidLoader_o.isPartnerPresent() || readyLidLoader_o.isPartnerPreempted()){//sysj\lidloader_controller.sysj line: 10, column: 2
                    readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 10, column: 2
                    S157185=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S157180){
                      case 0 : 
                        if(readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 10, column: 2
                          readyLidLoader_o.setVal(true);//sysj\lidloader_controller.sysj line: 10, column: 2
                          S157180=1;
                          if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 10, column: 2
                            readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 10, column: 2
                            ends[1]=2;
                            ;//sysj\lidloader_controller.sysj line: 10, column: 2
                            S159217=1;
                            S157246=0;
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
                        if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 10, column: 2
                          readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 10, column: 2
                          ends[1]=2;
                          ;//sysj\lidloader_controller.sysj line: 10, column: 2
                          S159217=1;
                          S157246=0;
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
                  S157185=1;
                  S157185=0;
                  if(!readyLidLoader_o.isPartnerPresent() || readyLidLoader_o.isPartnerPreempted()){//sysj\lidloader_controller.sysj line: 10, column: 2
                    readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 10, column: 2
                    S157185=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S157180=0;
                    if(readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 10, column: 2
                      readyLidLoader_o.setVal(true);//sysj\lidloader_controller.sysj line: 10, column: 2
                      S157180=1;
                      if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 10, column: 2
                        readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 10, column: 2
                        ends[1]=2;
                        ;//sysj\lidloader_controller.sysj line: 10, column: 2
                        S159217=1;
                        S157246=0;
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
              switch(S157246){
                case 0 : 
                  if(bottleAtPos3.getprestatus() && !empty.getprestatus()){//sysj\lidloader_controller.sysj line: 12, column: 9
                    S157246=1;
                    S157208=0;
                    if(!readyLidLoader_o.isPartnerPresent() || readyLidLoader_o.isPartnerPreempted()){//sysj\lidloader_controller.sysj line: 13, column: 3
                      readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 13, column: 3
                      S157208=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S157203=0;
                      if(readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 13, column: 3
                        readyLidLoader_o.setVal(false);//sysj\lidloader_controller.sysj line: 13, column: 3
                        S157203=1;
                        if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 13, column: 3
                          readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 13, column: 3
                          ends[1]=2;
                          ;//sysj\lidloader_controller.sysj line: 13, column: 3
                          S157246=2;
                          armDest.setPresent();//sysj\lidloader_controller.sysj line: 15, column: 4
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
                  switch(S157208){
                    case 0 : 
                      if(!readyLidLoader_o.isPartnerPresent() || readyLidLoader_o.isPartnerPreempted()){//sysj\lidloader_controller.sysj line: 13, column: 3
                        readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 13, column: 3
                        S157208=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S157203){
                          case 0 : 
                            if(readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 13, column: 3
                              readyLidLoader_o.setVal(false);//sysj\lidloader_controller.sysj line: 13, column: 3
                              S157203=1;
                              if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 13, column: 3
                                readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 13, column: 3
                                ends[1]=2;
                                ;//sysj\lidloader_controller.sysj line: 13, column: 3
                                S157246=2;
                                armDest.setPresent();//sysj\lidloader_controller.sysj line: 15, column: 4
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
                            if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 13, column: 3
                              readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 13, column: 3
                              ends[1]=2;
                              ;//sysj\lidloader_controller.sysj line: 13, column: 3
                              S157246=2;
                              armDest.setPresent();//sysj\lidloader_controller.sysj line: 15, column: 4
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
                      S157208=1;
                      S157208=0;
                      if(!readyLidLoader_o.isPartnerPresent() || readyLidLoader_o.isPartnerPreempted()){//sysj\lidloader_controller.sysj line: 13, column: 3
                        readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 13, column: 3
                        S157208=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S157203=0;
                        if(readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 13, column: 3
                          readyLidLoader_o.setVal(false);//sysj\lidloader_controller.sysj line: 13, column: 3
                          S157203=1;
                          if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 13, column: 3
                            readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 13, column: 3
                            ends[1]=2;
                            ;//sysj\lidloader_controller.sysj line: 13, column: 3
                            S157246=2;
                            armDest.setPresent();//sysj\lidloader_controller.sysj line: 15, column: 4
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
                  if(armAtDest.getprestatus()){//sysj\lidloader_controller.sysj line: 14, column: 9
                    S157246=3;
                    pusherExtend.setPresent();//sysj\lidloader_controller.sysj line: 18, column: 4
                    currsigs.addElement(pusherExtend);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    armDest.setPresent();//sysj\lidloader_controller.sysj line: 15, column: 4
                    currsigs.addElement(armDest);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 3 : 
                  if(pusherExtended.getprestatus()){//sysj\lidloader_controller.sysj line: 17, column: 9
                    S157246=4;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    pusherExtend.setPresent();//sysj\lidloader_controller.sysj line: 18, column: 4
                    currsigs.addElement(pusherExtend);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 4 : 
                  if(pusherRetracted.getprestatus()){//sysj\lidloader_controller.sysj line: 20, column: 9
                    S157246=5;
                    armSource.setPresent();//sysj\lidloader_controller.sysj line: 22, column: 4
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
                  if(armAtSource.getprestatus()){//sysj\lidloader_controller.sysj line: 21, column: 9
                    S157246=6;
                    thread159220(tdone,ends);
                    thread159221(tdone,ends);
                    int biggest159222 = 0;
                    if(ends[2]>=biggest159222){
                      biggest159222=ends[2];
                    }
                    if(ends[3]>=biggest159222){
                      biggest159222=ends[3];
                    }
                    if(biggest159222 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    armSource.setPresent();//sysj\lidloader_controller.sysj line: 22, column: 4
                    currsigs.addElement(armSource);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 6 : 
                  thread159223(tdone,ends);
                  thread159224(tdone,ends);
                  int biggest159225 = 0;
                  if(ends[2]>=biggest159225){
                    biggest159225=ends[2];
                  }
                  if(ends[3]>=biggest159225){
                    biggest159225=ends[3];
                  }
                  if(biggest159225 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest159225 == 0){
                    S157246=7;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 7 : 
                  if(!WPgripped.getprestatus()){//sysj\lidloader_controller.sysj line: 38, column: 9
                    S157246=8;
                    armSource.setPresent();//sysj\lidloader_controller.sysj line: 40, column: 4
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
                  if(armAtSource.getprestatus()){//sysj\lidloader_controller.sysj line: 39, column: 9
                    S157246=9;
                    S157331=0;
                    if(!readyLidLoader_o.isPartnerPresent() || readyLidLoader_o.isPartnerPreempted()){//sysj\lidloader_controller.sysj line: 43, column: 3
                      readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 43, column: 3
                      S157331=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S157326=0;
                      if(readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 43, column: 3
                        readyLidLoader_o.setVal(true);//sysj\lidloader_controller.sysj line: 43, column: 3
                        S157326=1;
                        if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 43, column: 3
                          readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 43, column: 3
                          ends[1]=2;
                          ;//sysj\lidloader_controller.sysj line: 43, column: 3
                          S157246=10;
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
                    armSource.setPresent();//sysj\lidloader_controller.sysj line: 40, column: 4
                    currsigs.addElement(armSource);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 9 : 
                  switch(S157331){
                    case 0 : 
                      if(!readyLidLoader_o.isPartnerPresent() || readyLidLoader_o.isPartnerPreempted()){//sysj\lidloader_controller.sysj line: 43, column: 3
                        readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 43, column: 3
                        S157331=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S157326){
                          case 0 : 
                            if(readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 43, column: 3
                              readyLidLoader_o.setVal(true);//sysj\lidloader_controller.sysj line: 43, column: 3
                              S157326=1;
                              if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 43, column: 3
                                readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 43, column: 3
                                ends[1]=2;
                                ;//sysj\lidloader_controller.sysj line: 43, column: 3
                                S157246=10;
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
                            if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 43, column: 3
                              readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 43, column: 3
                              ends[1]=2;
                              ;//sysj\lidloader_controller.sysj line: 43, column: 3
                              S157246=10;
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
                      S157331=1;
                      S157331=0;
                      if(!readyLidLoader_o.isPartnerPresent() || readyLidLoader_o.isPartnerPreempted()){//sysj\lidloader_controller.sysj line: 43, column: 3
                        readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 43, column: 3
                        S157331=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S157326=0;
                        if(readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 43, column: 3
                          readyLidLoader_o.setVal(true);//sysj\lidloader_controller.sysj line: 43, column: 3
                          S157326=1;
                          if(!readyLidLoader_o.isACK()){//sysj\lidloader_controller.sysj line: 43, column: 3
                            readyLidLoader_o.setREQ(false);//sysj\lidloader_controller.sysj line: 43, column: 3
                            ends[1]=2;
                            ;//sysj\lidloader_controller.sysj line: 43, column: 3
                            S157246=10;
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
                  S157246=10;
                  S157246=0;
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
