import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class capper_controller extends ClockDomain{
  public capper_controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.INPUT);
  public Signal gripperZAxisLowered = new Signal("gripperZAxisLowered", Signal.INPUT);
  public Signal gripperZAxisLifted = new Signal("gripperZAxisLifted", Signal.INPUT);
  public Signal gripperTurnHomePos = new Signal("gripperTurnHomePos", Signal.INPUT);
  public Signal gripperTurnFinalPos = new Signal("gripperTurnFinalPos", Signal.INPUT);
  public Signal cylPos5ZaxisExtend = new Signal("cylPos5ZaxisExtend", Signal.OUTPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.OUTPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.OUTPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.OUTPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.OUTPUT);
  public output_Channel readyCapper_o = new output_Channel();
  private int S3703 = 1;
  private int S3702 = 1;
  private int S6 = 1;
  private int S1 = 1;
  private int S67 = 1;
  private int S29 = 1;
  private int S24 = 1;
  private int S84 = 1;
  private int S89 = 1;
  private int S112 = 1;
  private int S111 = 1;
  private int S95 = 1;
  private int S100 = 1;
  private int S168 = 1;
  private int S163 = 1;
  
  private int[] ends = new int[7];
  private int[] tdone = new int[7];
  
  public void thread3716(int [] tdone, int [] ends){
        switch(S100){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\capper_controller.sysj line: 30, column: 6
        currsigs.addElement(gripperTurnExtend);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread3715(int [] tdone, int [] ends){
        switch(S95){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\capper_controller.sysj line: 28, column: 6
        currsigs.addElement(capGripperPos5Extend);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread3713(int [] tdone, int [] ends){
        S100=1;
    gripperTurnExtend.setPresent();//sysj\capper_controller.sysj line: 30, column: 6
    currsigs.addElement(gripperTurnExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread3712(int [] tdone, int [] ends){
        S95=1;
    capGripperPos5Extend.setPresent();//sysj\capper_controller.sysj line: 28, column: 6
    currsigs.addElement(capGripperPos5Extend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread3711(int [] tdone, int [] ends){
        switch(S112){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S111){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\capper_controller.sysj line: 27, column: 11
              S111=1;
              thread3712(tdone,ends);
              thread3713(tdone,ends);
              int biggest3714 = 0;
              if(ends[5]>=biggest3714){
                biggest3714=ends[5];
              }
              if(ends[6]>=biggest3714){
                biggest3714=ends[6];
              }
              if(biggest3714 == 1){
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            thread3715(tdone,ends);
            thread3716(tdone,ends);
            int biggest3717 = 0;
            if(ends[5]>=biggest3717){
              biggest3717=ends[5];
            }
            if(ends[6]>=biggest3717){
              biggest3717=ends[6];
            }
            if(biggest3717 == 1){
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            //FINXME code
            if(biggest3717 == 0){
              S112=0;
              active[4]=0;
              ends[4]=0;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread3710(int [] tdone, int [] ends){
        switch(S89){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\capper_controller.sysj line: 23, column: 5
        currsigs.addElement(cylPos5ZaxisExtend);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread3709(int [] tdone, int [] ends){
        switch(S84){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\capper_controller.sysj line: 19, column: 5
        currsigs.addElement(cylClampBottleExtend);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread3707(int [] tdone, int [] ends){
        S112=1;
    S111=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread3706(int [] tdone, int [] ends){
        S89=1;
    cylPos5ZaxisExtend.setPresent();//sysj\capper_controller.sysj line: 23, column: 5
    currsigs.addElement(cylPos5ZaxisExtend);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread3705(int [] tdone, int [] ends){
        S84=1;
    cylClampBottleExtend.setPresent();//sysj\capper_controller.sysj line: 19, column: 5
    currsigs.addElement(cylClampBottleExtend);
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
      switch(S3703){
        case 0 : 
          S3703=0;
          break RUN;
        
        case 1 : 
          S3703=2;
          S3703=2;
          S3702=0;
          S6=0;
          if(!readyCapper_o.isPartnerPresent() || readyCapper_o.isPartnerPreempted()){//sysj\capper_controller.sysj line: 11, column: 2
            readyCapper_o.setREQ(false);//sysj\capper_controller.sysj line: 11, column: 2
            S6=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S1=0;
            if(readyCapper_o.isACK()){//sysj\capper_controller.sysj line: 11, column: 2
              readyCapper_o.setVal(Boolean.TRUE);//sysj\capper_controller.sysj line: 11, column: 2
              S1=1;
              if(!readyCapper_o.isACK()){//sysj\capper_controller.sysj line: 11, column: 2
                readyCapper_o.setREQ(false);//sysj\capper_controller.sysj line: 11, column: 2
                ends[1]=2;
                ;//sysj\capper_controller.sysj line: 11, column: 2
                S3702=1;
                S67=0;
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
          switch(S3702){
            case 0 : 
              switch(S6){
                case 0 : 
                  if(!readyCapper_o.isPartnerPresent() || readyCapper_o.isPartnerPreempted()){//sysj\capper_controller.sysj line: 11, column: 2
                    readyCapper_o.setREQ(false);//sysj\capper_controller.sysj line: 11, column: 2
                    S6=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S1){
                      case 0 : 
                        if(readyCapper_o.isACK()){//sysj\capper_controller.sysj line: 11, column: 2
                          readyCapper_o.setVal(Boolean.TRUE);//sysj\capper_controller.sysj line: 11, column: 2
                          S1=1;
                          if(!readyCapper_o.isACK()){//sysj\capper_controller.sysj line: 11, column: 2
                            readyCapper_o.setREQ(false);//sysj\capper_controller.sysj line: 11, column: 2
                            ends[1]=2;
                            ;//sysj\capper_controller.sysj line: 11, column: 2
                            S3702=1;
                            S67=0;
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
                        if(!readyCapper_o.isACK()){//sysj\capper_controller.sysj line: 11, column: 2
                          readyCapper_o.setREQ(false);//sysj\capper_controller.sysj line: 11, column: 2
                          ends[1]=2;
                          ;//sysj\capper_controller.sysj line: 11, column: 2
                          S3702=1;
                          S67=0;
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
                  S6=1;
                  S6=0;
                  if(!readyCapper_o.isPartnerPresent() || readyCapper_o.isPartnerPreempted()){//sysj\capper_controller.sysj line: 11, column: 2
                    readyCapper_o.setREQ(false);//sysj\capper_controller.sysj line: 11, column: 2
                    S6=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1=0;
                    if(readyCapper_o.isACK()){//sysj\capper_controller.sysj line: 11, column: 2
                      readyCapper_o.setVal(Boolean.TRUE);//sysj\capper_controller.sysj line: 11, column: 2
                      S1=1;
                      if(!readyCapper_o.isACK()){//sysj\capper_controller.sysj line: 11, column: 2
                        readyCapper_o.setREQ(false);//sysj\capper_controller.sysj line: 11, column: 2
                        ends[1]=2;
                        ;//sysj\capper_controller.sysj line: 11, column: 2
                        S3702=1;
                        S67=0;
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
              switch(S67){
                case 0 : 
                  if(bottleAtPos4.getprestatus()){//sysj\capper_controller.sysj line: 13, column: 9
                    S67=1;
                    S29=0;
                    if(!readyCapper_o.isPartnerPresent() || readyCapper_o.isPartnerPreempted()){//sysj\capper_controller.sysj line: 14, column: 3
                      readyCapper_o.setREQ(false);//sysj\capper_controller.sysj line: 14, column: 3
                      S29=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S24=0;
                      if(readyCapper_o.isACK()){//sysj\capper_controller.sysj line: 14, column: 3
                        readyCapper_o.setVal(Boolean.FALSE);//sysj\capper_controller.sysj line: 14, column: 3
                        S24=1;
                        if(!readyCapper_o.isACK()){//sysj\capper_controller.sysj line: 14, column: 3
                          readyCapper_o.setREQ(false);//sysj\capper_controller.sysj line: 14, column: 3
                          ends[1]=2;
                          ;//sysj\capper_controller.sysj line: 14, column: 3
                          S67=2;
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
                  switch(S29){
                    case 0 : 
                      if(!readyCapper_o.isPartnerPresent() || readyCapper_o.isPartnerPreempted()){//sysj\capper_controller.sysj line: 14, column: 3
                        readyCapper_o.setREQ(false);//sysj\capper_controller.sysj line: 14, column: 3
                        S29=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S24){
                          case 0 : 
                            if(readyCapper_o.isACK()){//sysj\capper_controller.sysj line: 14, column: 3
                              readyCapper_o.setVal(Boolean.FALSE);//sysj\capper_controller.sysj line: 14, column: 3
                              S24=1;
                              if(!readyCapper_o.isACK()){//sysj\capper_controller.sysj line: 14, column: 3
                                readyCapper_o.setREQ(false);//sysj\capper_controller.sysj line: 14, column: 3
                                ends[1]=2;
                                ;//sysj\capper_controller.sysj line: 14, column: 3
                                S67=2;
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
                            if(!readyCapper_o.isACK()){//sysj\capper_controller.sysj line: 14, column: 3
                              readyCapper_o.setREQ(false);//sysj\capper_controller.sysj line: 14, column: 3
                              ends[1]=2;
                              ;//sysj\capper_controller.sysj line: 14, column: 3
                              S67=2;
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
                      S29=1;
                      S29=0;
                      if(!readyCapper_o.isPartnerPresent() || readyCapper_o.isPartnerPreempted()){//sysj\capper_controller.sysj line: 14, column: 3
                        readyCapper_o.setREQ(false);//sysj\capper_controller.sysj line: 14, column: 3
                        S29=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S24=0;
                        if(readyCapper_o.isACK()){//sysj\capper_controller.sysj line: 14, column: 3
                          readyCapper_o.setVal(Boolean.FALSE);//sysj\capper_controller.sysj line: 14, column: 3
                          S24=1;
                          if(!readyCapper_o.isACK()){//sysj\capper_controller.sysj line: 14, column: 3
                            readyCapper_o.setREQ(false);//sysj\capper_controller.sysj line: 14, column: 3
                            ends[1]=2;
                            ;//sysj\capper_controller.sysj line: 14, column: 3
                            S67=2;
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
                  if(gripperZAxisLifted.getprestatus()){//sysj\capper_controller.sysj line: 15, column: 9
                    S67=3;
                    gripperTurnRetract.setPresent();//sysj\capper_controller.sysj line: 16, column: 29
                    currsigs.addElement(gripperTurnRetract);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 3 : 
                  if(gripperTurnHomePos.getprestatus()){//sysj\capper_controller.sysj line: 16, column: 9
                    S67=4;
                    thread3705(tdone,ends);
                    thread3706(tdone,ends);
                    thread3707(tdone,ends);
                    int biggest3708 = 0;
                    if(ends[2]>=biggest3708){
                      biggest3708=ends[2];
                    }
                    if(ends[3]>=biggest3708){
                      biggest3708=ends[3];
                    }
                    if(ends[4]>=biggest3708){
                      biggest3708=ends[4];
                    }
                    if(biggest3708 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    gripperTurnRetract.setPresent();//sysj\capper_controller.sysj line: 16, column: 29
                    currsigs.addElement(gripperTurnRetract);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 4 : 
                  if(gripperTurnFinalPos.getprestatus()){//sysj\capper_controller.sysj line: 17, column: 9
                    S67=5;
                    gripperTurnRetract.setPresent();//sysj\capper_controller.sysj line: 34, column: 29
                    currsigs.addElement(gripperTurnRetract);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    thread3709(tdone,ends);
                    thread3710(tdone,ends);
                    thread3711(tdone,ends);
                    int biggest3718 = 0;
                    if(ends[2]>=biggest3718){
                      biggest3718=ends[2];
                    }
                    if(ends[3]>=biggest3718){
                      biggest3718=ends[3];
                    }
                    if(ends[4]>=biggest3718){
                      biggest3718=ends[4];
                    }
                    if(biggest3718 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest3718 == 0){
                      S67=5;
                      gripperTurnRetract.setPresent();//sysj\capper_controller.sysj line: 34, column: 29
                      currsigs.addElement(gripperTurnRetract);
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                
                case 5 : 
                  if(gripperTurnHomePos.getprestatus()){//sysj\capper_controller.sysj line: 34, column: 9
                    S67=6;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    gripperTurnRetract.setPresent();//sysj\capper_controller.sysj line: 34, column: 29
                    currsigs.addElement(gripperTurnRetract);
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 6 : 
                  if(gripperZAxisLifted.getprestatus()){//sysj\capper_controller.sysj line: 35, column: 9
                    S67=7;
                    S168=0;
                    if(!readyCapper_o.isPartnerPresent() || readyCapper_o.isPartnerPreempted()){//sysj\capper_controller.sysj line: 36, column: 3
                      readyCapper_o.setREQ(false);//sysj\capper_controller.sysj line: 36, column: 3
                      S168=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S163=0;
                      if(readyCapper_o.isACK()){//sysj\capper_controller.sysj line: 36, column: 3
                        readyCapper_o.setVal(Boolean.TRUE);//sysj\capper_controller.sysj line: 36, column: 3
                        S163=1;
                        if(!readyCapper_o.isACK()){//sysj\capper_controller.sysj line: 36, column: 3
                          readyCapper_o.setREQ(false);//sysj\capper_controller.sysj line: 36, column: 3
                          ends[1]=2;
                          ;//sysj\capper_controller.sysj line: 36, column: 3
                          S67=0;
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
                
                case 7 : 
                  switch(S168){
                    case 0 : 
                      if(!readyCapper_o.isPartnerPresent() || readyCapper_o.isPartnerPreempted()){//sysj\capper_controller.sysj line: 36, column: 3
                        readyCapper_o.setREQ(false);//sysj\capper_controller.sysj line: 36, column: 3
                        S168=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S163){
                          case 0 : 
                            if(readyCapper_o.isACK()){//sysj\capper_controller.sysj line: 36, column: 3
                              readyCapper_o.setVal(Boolean.TRUE);//sysj\capper_controller.sysj line: 36, column: 3
                              S163=1;
                              if(!readyCapper_o.isACK()){//sysj\capper_controller.sysj line: 36, column: 3
                                readyCapper_o.setREQ(false);//sysj\capper_controller.sysj line: 36, column: 3
                                ends[1]=2;
                                ;//sysj\capper_controller.sysj line: 36, column: 3
                                S67=0;
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
                            if(!readyCapper_o.isACK()){//sysj\capper_controller.sysj line: 36, column: 3
                              readyCapper_o.setREQ(false);//sysj\capper_controller.sysj line: 36, column: 3
                              ends[1]=2;
                              ;//sysj\capper_controller.sysj line: 36, column: 3
                              S67=0;
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
                      S168=1;
                      S168=0;
                      if(!readyCapper_o.isPartnerPresent() || readyCapper_o.isPartnerPreempted()){//sysj\capper_controller.sysj line: 36, column: 3
                        readyCapper_o.setREQ(false);//sysj\capper_controller.sysj line: 36, column: 3
                        S168=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S163=0;
                        if(readyCapper_o.isACK()){//sysj\capper_controller.sysj line: 36, column: 3
                          readyCapper_o.setVal(Boolean.TRUE);//sysj\capper_controller.sysj line: 36, column: 3
                          S163=1;
                          if(!readyCapper_o.isACK()){//sysj\capper_controller.sysj line: 36, column: 3
                            readyCapper_o.setREQ(false);//sysj\capper_controller.sysj line: 36, column: 3
                            ends[1]=2;
                            ;//sysj\capper_controller.sysj line: 36, column: 3
                            S67=0;
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
    char [] active1 = {1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0};
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
          readyCapper_o.gethook();
          bottleAtPos4.gethook();
          gripperZAxisLowered.gethook();
          gripperZAxisLifted.gethook();
          gripperTurnHomePos.gethook();
          gripperTurnFinalPos.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos4.setpreclear();
      gripperZAxisLowered.setpreclear();
      gripperZAxisLifted.setpreclear();
      gripperTurnHomePos.setpreclear();
      gripperTurnFinalPos.setpreclear();
      cylPos5ZaxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos4.getStatus() ? bottleAtPos4.setprepresent() : bottleAtPos4.setpreclear();
      bottleAtPos4.setpreval(bottleAtPos4.getValue());
      bottleAtPos4.setClear();
      dummyint = gripperZAxisLowered.getStatus() ? gripperZAxisLowered.setprepresent() : gripperZAxisLowered.setpreclear();
      gripperZAxisLowered.setpreval(gripperZAxisLowered.getValue());
      gripperZAxisLowered.setClear();
      dummyint = gripperZAxisLifted.getStatus() ? gripperZAxisLifted.setprepresent() : gripperZAxisLifted.setpreclear();
      gripperZAxisLifted.setpreval(gripperZAxisLifted.getValue());
      gripperZAxisLifted.setClear();
      dummyint = gripperTurnHomePos.getStatus() ? gripperTurnHomePos.setprepresent() : gripperTurnHomePos.setpreclear();
      gripperTurnHomePos.setpreval(gripperTurnHomePos.getValue());
      gripperTurnHomePos.setClear();
      dummyint = gripperTurnFinalPos.getStatus() ? gripperTurnFinalPos.setprepresent() : gripperTurnFinalPos.setpreclear();
      gripperTurnFinalPos.setpreval(gripperTurnFinalPos.getValue());
      gripperTurnFinalPos.setClear();
      cylPos5ZaxisExtend.sethook();
      cylPos5ZaxisExtend.setClear();
      gripperTurnRetract.sethook();
      gripperTurnRetract.setClear();
      gripperTurnExtend.sethook();
      gripperTurnExtend.setClear();
      capGripperPos5Extend.sethook();
      capGripperPos5Extend.setClear();
      cylClampBottleExtend.sethook();
      cylClampBottleExtend.setClear();
      readyCapper_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        readyCapper_o.gethook();
        bottleAtPos4.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
