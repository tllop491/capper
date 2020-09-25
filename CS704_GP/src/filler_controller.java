import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.ArrayList;//sysj\filler_controller.sysj line: 4, column: 1

public class filler_controller extends ClockDomain{
  public filler_controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.INPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.INPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  public Signal nozzleSelect = new Signal("nozzleSelect", Signal.OUTPUT);
  public input_Channel liquidData_in = new input_Channel();
  public output_Channel readyFiller_o = new output_Channel();
  private Signal done_1;
  private Signal liquidAmount_1;
  private long __start_thread_6;//sysj\filler_controller.sysj line: 65, column: 7
  private int i_thread_1;//sysj\filler_controller.sysj line: 34, column: 3
  private int S75175 = 1;
  private int S75174 = 1;
  private int S4010 = 1;
  private int S4005 = 1;
  private int S4070 = 1;
  private int S4032 = 1;
  private int S4027 = 1;
  private int S4081 = 1;
  private int S4076 = 1;
  private int S4224 = 1;
  private int S4119 = 1;
  private int S4124 = 1;
  private int S4129 = 1;
  private int S4146 = 1;
  private int S4151 = 1;
  private int S4167 = 1;
  private int S4166 = 1;
  private int S4153 = 1;
  private int S5473 = 1;
  private int S5468 = 1;
  
  private int[] ends = new int[7];
  private int[] tdone = new int[7];
  
  public void thread75193(int [] tdone, int [] ends){
        switch(S4167){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S4166){
          case 0 : 
            switch(S4153){
              case 0 : 
                S4153=0;
                if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 65, column: 7
                  ends[6]=3;
                  ;//sysj\filler_controller.sysj line: 65, column: 7
                  done_1.setPresent();//sysj\filler_controller.sysj line: 67, column: 8
                  currsigs.addElement(done_1);
                  S4166=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S4153=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                break;
              
              case 1 : 
                S4153=1;
                S4153=0;
                if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 65, column: 7
                  ends[6]=3;
                  ;//sysj\filler_controller.sysj line: 65, column: 7
                  done_1.setPresent();//sysj\filler_controller.sysj line: 67, column: 8
                  currsigs.addElement(done_1);
                  S4166=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S4153=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S4166=1;
            S4167=0;
            active[6]=0;
            ends[6]=0;
            tdone[6]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread75192(int [] tdone, int [] ends){
        switch(S4151){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 62, column: 8
        currsigs.addElement(dosUnitValveExtend);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread75191(int [] tdone, int [] ends){
        switch(S4146){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 58, column: 8
        currsigs.addElement(valveInletOnOff);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread75189(int [] tdone, int [] ends){
        S4167=1;
    S4166=0;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 65, column: 7
    S4153=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 65, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 65, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 67, column: 8
      currsigs.addElement(done_1);
      S4166=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S4153=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread75188(int [] tdone, int [] ends){
        S4151=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 62, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread75187(int [] tdone, int [] ends){
        S4146=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 58, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread75185(int [] tdone, int [] ends){
        switch(S4129){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 53, column: 8
        currsigs.addElement(dosUnitValveRetract);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread75184(int [] tdone, int [] ends){
        switch(S4124){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
        currsigs.addElement(valveInjectorOnOff);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread75182(int [] tdone, int [] ends){
        S4167=1;
    S4166=0;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 65, column: 7
    S4153=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 65, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 65, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 67, column: 8
      currsigs.addElement(done_1);
      S4166=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S4153=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread75181(int [] tdone, int [] ends){
        S4151=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 62, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread75180(int [] tdone, int [] ends){
        S4146=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 58, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread75178(int [] tdone, int [] ends){
        S4129=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 53, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread75177(int [] tdone, int [] ends){
        S4124=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
    currsigs.addElement(valveInjectorOnOff);
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
      switch(S75175){
        case 0 : 
          S75175=0;
          break RUN;
        
        case 1 : 
          S75175=2;
          S75175=2;
          done_1.setClear();//sysj\filler_controller.sysj line: 28, column: 2
          liquidAmount_1.setClear();//sysj\filler_controller.sysj line: 29, column: 2
          S75174=0;
          S4010=0;
          if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 31, column: 2
            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 31, column: 2
            S4010=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S4005=0;
            if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 31, column: 2
              readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 31, column: 2
              S4005=1;
              if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 31, column: 2
                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 31, column: 2
                ends[1]=2;
                ;//sysj\filler_controller.sysj line: 31, column: 2
                S75174=1;
                i_thread_1 = 0;//sysj\filler_controller.sysj line: 34, column: 3
                S4070=0;
                S4032=0;
                if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 35, column: 3
                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                  S4032=1;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S4027=0;
                  if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                    liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 35, column: 3
                    S4027=1;
                    if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                      ends[1]=2;
                      ;//sysj\filler_controller.sysj line: 35, column: 3
                      System.out.println("FILLER RECEIVED LIQUID");//sysj\filler_controller.sysj line: 36, column: 3
                      S4070=1;
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
            }
            else {
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
        
        case 2 : 
          done_1.setClear();//sysj\filler_controller.sysj line: 28, column: 2
          liquidAmount_1.setClear();//sysj\filler_controller.sysj line: 29, column: 2
          switch(S75174){
            case 0 : 
              switch(S4010){
                case 0 : 
                  if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 31, column: 2
                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 31, column: 2
                    S4010=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S4005){
                      case 0 : 
                        if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 31, column: 2
                          readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 31, column: 2
                          S4005=1;
                          if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 31, column: 2
                            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 31, column: 2
                            ends[1]=2;
                            ;//sysj\filler_controller.sysj line: 31, column: 2
                            S75174=1;
                            i_thread_1 = 0;//sysj\filler_controller.sysj line: 34, column: 3
                            S4070=0;
                            S4032=0;
                            if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 35, column: 3
                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                              S4032=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S4027=0;
                              if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 35, column: 3
                                S4027=1;
                                if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 35, column: 3
                                  System.out.println("FILLER RECEIVED LIQUID");//sysj\filler_controller.sysj line: 36, column: 3
                                  S4070=1;
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
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 31, column: 2
                          readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 31, column: 2
                          ends[1]=2;
                          ;//sysj\filler_controller.sysj line: 31, column: 2
                          S75174=1;
                          i_thread_1 = 0;//sysj\filler_controller.sysj line: 34, column: 3
                          S4070=0;
                          S4032=0;
                          if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 35, column: 3
                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                            S4032=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S4027=0;
                            if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                              liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 35, column: 3
                              S4027=1;
                              if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 35, column: 3
                                System.out.println("FILLER RECEIVED LIQUID");//sysj\filler_controller.sysj line: 36, column: 3
                                S4070=1;
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
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S4010=1;
                  S4010=0;
                  if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 31, column: 2
                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 31, column: 2
                    S4010=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S4005=0;
                    if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 31, column: 2
                      readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 31, column: 2
                      S4005=1;
                      if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 31, column: 2
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 31, column: 2
                        ends[1]=2;
                        ;//sysj\filler_controller.sysj line: 31, column: 2
                        S75174=1;
                        i_thread_1 = 0;//sysj\filler_controller.sysj line: 34, column: 3
                        S4070=0;
                        S4032=0;
                        if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 35, column: 3
                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                          S4032=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S4027=0;
                          if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                            liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 35, column: 3
                            S4027=1;
                            if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 35, column: 3
                              System.out.println("FILLER RECEIVED LIQUID");//sysj\filler_controller.sysj line: 36, column: 3
                              S4070=1;
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
              switch(S4070){
                case 0 : 
                  switch(S4032){
                    case 0 : 
                      if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 35, column: 3
                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                        S4032=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S4027){
                          case 0 : 
                            if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                              liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 35, column: 3
                              S4027=1;
                              if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 35, column: 3
                                System.out.println("FILLER RECEIVED LIQUID");//sysj\filler_controller.sysj line: 36, column: 3
                                S4070=1;
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
                            if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 35, column: 3
                              System.out.println("FILLER RECEIVED LIQUID");//sysj\filler_controller.sysj line: 36, column: 3
                              S4070=1;
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
                      S4032=1;
                      S4032=0;
                      if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 35, column: 3
                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                        S4032=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S4027=0;
                        if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                          liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 35, column: 3
                          S4027=1;
                          if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                            ends[1]=2;
                            ;//sysj\filler_controller.sysj line: 35, column: 3
                            System.out.println("FILLER RECEIVED LIQUID");//sysj\filler_controller.sysj line: 36, column: 3
                            S4070=1;
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
                  if(bottleAtPos2.getprestatus()){//sysj\filler_controller.sysj line: 37, column: 9
                    System.out.println("FILLER RECEIVED BOTTLEATPOS2");//sysj\filler_controller.sysj line: 38, column: 3
                    S4070=2;
                    S4081=0;
                    if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 39, column: 3
                      readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 39, column: 3
                      S4081=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S4076=0;
                      if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 39, column: 3
                        readyFiller_o.setVal(Boolean.FALSE);//sysj\filler_controller.sysj line: 39, column: 3
                        S4076=1;
                        if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 39, column: 3
                          readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 39, column: 3
                          ends[1]=2;
                          ;//sysj\filler_controller.sysj line: 39, column: 3
                          System.out.println("FILLER SEND FALSE");//sysj\filler_controller.sysj line: 40, column: 3
                          S4070=3;
                          S4224=0;
                          if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 43, column: 9
                            liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 44, column: 6
                            currsigs.addElement(liquidAmount_1);
                            liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 44, column: 6
                            nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 45, column: 6
                            currsigs.addElement(nozzleSelect);
                            nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 45, column: 6
                            S4119=0;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            System.out.println("NOZZLE " + i_thread_1 + " DONE: ");//sysj\filler_controller.sysj line: 73, column: 5
                            if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 74, column: 9
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 41, column: 3
                              S4070=4;
                              S5473=0;
                              if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 82, column: 5
                                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                                S5473=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S5468=0;
                                if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                                  readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 82, column: 5
                                  S5468=1;
                                  if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 82, column: 5
                                    i_thread_1 = 0;//sysj\filler_controller.sysj line: 34, column: 3
                                    S4070=0;
                                    S4032=0;
                                    if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 35, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                      S4032=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S4027=0;
                                      if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                        liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 35, column: 3
                                        S4027=1;
                                        if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                          ends[1]=2;
                                          ;//sysj\filler_controller.sysj line: 35, column: 3
                                          System.out.println("FILLER RECEIVED LIQUID");//sysj\filler_controller.sysj line: 36, column: 3
                                          S4070=1;
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
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 77, column: 6
                              S4224=1;
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
                
                case 2 : 
                  switch(S4081){
                    case 0 : 
                      if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 39, column: 3
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 39, column: 3
                        S4081=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S4076){
                          case 0 : 
                            if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 39, column: 3
                              readyFiller_o.setVal(Boolean.FALSE);//sysj\filler_controller.sysj line: 39, column: 3
                              S4076=1;
                              if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 39, column: 3
                                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 39, column: 3
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 39, column: 3
                                System.out.println("FILLER SEND FALSE");//sysj\filler_controller.sysj line: 40, column: 3
                                S4070=3;
                                S4224=0;
                                if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 43, column: 9
                                  liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 44, column: 6
                                  currsigs.addElement(liquidAmount_1);
                                  liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 44, column: 6
                                  nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 45, column: 6
                                  currsigs.addElement(nozzleSelect);
                                  nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 45, column: 6
                                  S4119=0;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  System.out.println("NOZZLE " + i_thread_1 + " DONE: ");//sysj\filler_controller.sysj line: 73, column: 5
                                  if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 74, column: 9
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 41, column: 3
                                    S4070=4;
                                    S5473=0;
                                    if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 82, column: 5
                                      readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                                      S5473=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S5468=0;
                                      if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                                        readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 82, column: 5
                                        S5468=1;
                                        if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                                          readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                                          ends[1]=2;
                                          ;//sysj\filler_controller.sysj line: 82, column: 5
                                          i_thread_1 = 0;//sysj\filler_controller.sysj line: 34, column: 3
                                          S4070=0;
                                          S4032=0;
                                          if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 35, column: 3
                                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                            S4032=1;
                                            active[1]=1;
                                            ends[1]=1;
                                            break RUN;
                                          }
                                          else {
                                            S4027=0;
                                            if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                              liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 35, column: 3
                                              S4027=1;
                                              if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                                ends[1]=2;
                                                ;//sysj\filler_controller.sysj line: 35, column: 3
                                                System.out.println("FILLER RECEIVED LIQUID");//sysj\filler_controller.sysj line: 36, column: 3
                                                S4070=1;
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
                                      }
                                      else {
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                  else {
                                    i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 77, column: 6
                                    S4224=1;
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
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          
                          case 1 : 
                            if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 39, column: 3
                              readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 39, column: 3
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 39, column: 3
                              System.out.println("FILLER SEND FALSE");//sysj\filler_controller.sysj line: 40, column: 3
                              S4070=3;
                              S4224=0;
                              if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 43, column: 9
                                liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 44, column: 6
                                currsigs.addElement(liquidAmount_1);
                                liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 44, column: 6
                                nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 45, column: 6
                                currsigs.addElement(nozzleSelect);
                                nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 45, column: 6
                                S4119=0;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                System.out.println("NOZZLE " + i_thread_1 + " DONE: ");//sysj\filler_controller.sysj line: 73, column: 5
                                if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 74, column: 9
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 41, column: 3
                                  S4070=4;
                                  S5473=0;
                                  if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 82, column: 5
                                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                                    S5473=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S5468=0;
                                    if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                                      readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 82, column: 5
                                      S5468=1;
                                      if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 82, column: 5
                                        i_thread_1 = 0;//sysj\filler_controller.sysj line: 34, column: 3
                                        S4070=0;
                                        S4032=0;
                                        if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 35, column: 3
                                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                          S4032=1;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          S4027=0;
                                          if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                            liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 35, column: 3
                                            S4027=1;
                                            if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                              ends[1]=2;
                                              ;//sysj\filler_controller.sysj line: 35, column: 3
                                              System.out.println("FILLER RECEIVED LIQUID");//sysj\filler_controller.sysj line: 36, column: 3
                                              S4070=1;
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
                                    }
                                    else {
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 77, column: 6
                                  S4224=1;
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
                          
                        }
                      }
                      break;
                    
                    case 1 : 
                      S4081=1;
                      S4081=0;
                      if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 39, column: 3
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 39, column: 3
                        S4081=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S4076=0;
                        if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 39, column: 3
                          readyFiller_o.setVal(Boolean.FALSE);//sysj\filler_controller.sysj line: 39, column: 3
                          S4076=1;
                          if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 39, column: 3
                            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 39, column: 3
                            ends[1]=2;
                            ;//sysj\filler_controller.sysj line: 39, column: 3
                            System.out.println("FILLER SEND FALSE");//sysj\filler_controller.sysj line: 40, column: 3
                            S4070=3;
                            S4224=0;
                            if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 43, column: 9
                              liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 44, column: 6
                              currsigs.addElement(liquidAmount_1);
                              liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 44, column: 6
                              nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 45, column: 6
                              currsigs.addElement(nozzleSelect);
                              nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 45, column: 6
                              S4119=0;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              System.out.println("NOZZLE " + i_thread_1 + " DONE: ");//sysj\filler_controller.sysj line: 73, column: 5
                              if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 74, column: 9
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 41, column: 3
                                S4070=4;
                                S5473=0;
                                if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 82, column: 5
                                  readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                                  S5473=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S5468=0;
                                  if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                                    readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 82, column: 5
                                    S5468=1;
                                    if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                                      readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 82, column: 5
                                      i_thread_1 = 0;//sysj\filler_controller.sysj line: 34, column: 3
                                      S4070=0;
                                      S4032=0;
                                      if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 35, column: 3
                                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                        S4032=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S4027=0;
                                        if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                          liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 35, column: 3
                                          S4027=1;
                                          if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                            ends[1]=2;
                                            ;//sysj\filler_controller.sysj line: 35, column: 3
                                            System.out.println("FILLER RECEIVED LIQUID");//sysj\filler_controller.sysj line: 36, column: 3
                                            S4070=1;
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
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 77, column: 6
                                S4224=1;
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
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    
                  }
                  break;
                
                case 3 : 
                  switch(S4224){
                    case 0 : 
                      switch(S4119){
                        case 0 : 
                          S4119=0;
                          S4119=1;
                          thread75177(tdone,ends);
                          thread75178(tdone,ends);
                          int biggest75179 = 0;
                          if(ends[2]>=biggest75179){
                            biggest75179=ends[2];
                          }
                          if(ends[3]>=biggest75179){
                            biggest75179=ends[3];
                          }
                          if(biggest75179 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 47, column: 12
                            S4119=2;
                            if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 56, column: 22
                              System.out.println("NOZZLE " + i_thread_1 + " DONE: ");//sysj\filler_controller.sysj line: 73, column: 5
                              if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 74, column: 9
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 41, column: 3
                                S4070=4;
                                S5473=0;
                                if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 82, column: 5
                                  readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                                  S5473=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S5468=0;
                                  if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                                    readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 82, column: 5
                                    S5468=1;
                                    if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                                      readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 82, column: 5
                                      i_thread_1 = 0;//sysj\filler_controller.sysj line: 34, column: 3
                                      S4070=0;
                                      S4032=0;
                                      if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 35, column: 3
                                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                        S4032=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S4027=0;
                                        if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                          liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 35, column: 3
                                          S4027=1;
                                          if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                            ends[1]=2;
                                            ;//sysj\filler_controller.sysj line: 35, column: 3
                                            System.out.println("FILLER RECEIVED LIQUID");//sysj\filler_controller.sysj line: 36, column: 3
                                            S4070=1;
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
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 77, column: 6
                                S4224=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              thread75180(tdone,ends);
                              thread75181(tdone,ends);
                              thread75182(tdone,ends);
                              int biggest75183 = 0;
                              if(ends[4]>=biggest75183){
                                biggest75183=ends[4];
                              }
                              if(ends[5]>=biggest75183){
                                biggest75183=ends[5];
                              }
                              if(ends[6]>=biggest75183){
                                biggest75183=ends[6];
                              }
                              if(biggest75183 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            thread75184(tdone,ends);
                            thread75185(tdone,ends);
                            int biggest75186 = 0;
                            if(ends[2]>=biggest75186){
                              biggest75186=ends[2];
                            }
                            if(ends[3]>=biggest75186){
                              biggest75186=ends[3];
                            }
                            if(biggest75186 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest75186 == 0){
                              S4119=2;
                              if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 56, column: 22
                                System.out.println("NOZZLE " + i_thread_1 + " DONE: ");//sysj\filler_controller.sysj line: 73, column: 5
                                if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 74, column: 9
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 41, column: 3
                                  S4070=4;
                                  S5473=0;
                                  if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 82, column: 5
                                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                                    S5473=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S5468=0;
                                    if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                                      readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 82, column: 5
                                      S5468=1;
                                      if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 82, column: 5
                                        i_thread_1 = 0;//sysj\filler_controller.sysj line: 34, column: 3
                                        S4070=0;
                                        S4032=0;
                                        if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 35, column: 3
                                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                          S4032=1;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          S4027=0;
                                          if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                            liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 35, column: 3
                                            S4027=1;
                                            if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                              ends[1]=2;
                                              ;//sysj\filler_controller.sysj line: 35, column: 3
                                              System.out.println("FILLER RECEIVED LIQUID");//sysj\filler_controller.sysj line: 36, column: 3
                                              S4070=1;
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
                                    }
                                    else {
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 77, column: 6
                                  S4224=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                thread75187(tdone,ends);
                                thread75188(tdone,ends);
                                thread75189(tdone,ends);
                                int biggest75190 = 0;
                                if(ends[4]>=biggest75190){
                                  biggest75190=ends[4];
                                }
                                if(ends[5]>=biggest75190){
                                  biggest75190=ends[5];
                                }
                                if(ends[6]>=biggest75190){
                                  biggest75190=ends[6];
                                }
                                if(biggest75190 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                          }
                        
                        case 2 : 
                          if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 56, column: 22
                            System.out.println("NOZZLE " + i_thread_1 + " DONE: ");//sysj\filler_controller.sysj line: 73, column: 5
                            if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 74, column: 9
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 41, column: 3
                              S4070=4;
                              S5473=0;
                              if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 82, column: 5
                                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                                S5473=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S5468=0;
                                if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                                  readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 82, column: 5
                                  S5468=1;
                                  if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 82, column: 5
                                    i_thread_1 = 0;//sysj\filler_controller.sysj line: 34, column: 3
                                    S4070=0;
                                    S4032=0;
                                    if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 35, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                      S4032=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S4027=0;
                                      if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                        liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 35, column: 3
                                        S4027=1;
                                        if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                          ends[1]=2;
                                          ;//sysj\filler_controller.sysj line: 35, column: 3
                                          System.out.println("FILLER RECEIVED LIQUID");//sysj\filler_controller.sysj line: 36, column: 3
                                          S4070=1;
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
                                }
                                else {
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 77, column: 6
                              S4224=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            thread75191(tdone,ends);
                            thread75192(tdone,ends);
                            thread75193(tdone,ends);
                            int biggest75194 = 0;
                            if(ends[4]>=biggest75194){
                              biggest75194=ends[4];
                            }
                            if(ends[5]>=biggest75194){
                              biggest75194=ends[5];
                            }
                            if(ends[6]>=biggest75194){
                              biggest75194=ends[6];
                            }
                            if(biggest75194 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest75194 == 0){
                              System.out.println("NOZZLE " + i_thread_1 + " DONE: ");//sysj\filler_controller.sysj line: 73, column: 5
                              if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 74, column: 9
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 41, column: 3
                                S4070=4;
                                S5473=0;
                                if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 82, column: 5
                                  readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                                  S5473=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S5468=0;
                                  if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                                    readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 82, column: 5
                                    S5468=1;
                                    if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                                      readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 82, column: 5
                                      i_thread_1 = 0;//sysj\filler_controller.sysj line: 34, column: 3
                                      S4070=0;
                                      S4032=0;
                                      if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 35, column: 3
                                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                        S4032=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S4027=0;
                                        if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                          liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 35, column: 3
                                          S4027=1;
                                          if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                            ends[1]=2;
                                            ;//sysj\filler_controller.sysj line: 35, column: 3
                                            System.out.println("FILLER RECEIVED LIQUID");//sysj\filler_controller.sysj line: 36, column: 3
                                            S4070=1;
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
                                  }
                                  else {
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 77, column: 6
                                S4224=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                        
                      }
                      break;
                    
                    case 1 : 
                      S4224=1;
                      S4224=0;
                      if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 43, column: 9
                        liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 44, column: 6
                        currsigs.addElement(liquidAmount_1);
                        liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 44, column: 6
                        nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 45, column: 6
                        currsigs.addElement(nozzleSelect);
                        nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 45, column: 6
                        S4119=0;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        System.out.println("NOZZLE " + i_thread_1 + " DONE: ");//sysj\filler_controller.sysj line: 73, column: 5
                        if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 74, column: 9
                          ends[1]=2;
                          ;//sysj\filler_controller.sysj line: 41, column: 3
                          S4070=4;
                          S5473=0;
                          if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 82, column: 5
                            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                            S5473=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S5468=0;
                            if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                              readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 82, column: 5
                              S5468=1;
                              if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 82, column: 5
                                i_thread_1 = 0;//sysj\filler_controller.sysj line: 34, column: 3
                                S4070=0;
                                S4032=0;
                                if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 35, column: 3
                                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                  S4032=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S4027=0;
                                  if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                    liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 35, column: 3
                                    S4027=1;
                                    if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 35, column: 3
                                      System.out.println("FILLER RECEIVED LIQUID");//sysj\filler_controller.sysj line: 36, column: 3
                                      S4070=1;
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
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 77, column: 6
                          S4224=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    
                  }
                  break;
                
                case 4 : 
                  switch(S5473){
                    case 0 : 
                      if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 82, column: 5
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                        S5473=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S5468){
                          case 0 : 
                            if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                              readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 82, column: 5
                              S5468=1;
                              if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 82, column: 5
                                i_thread_1 = 0;//sysj\filler_controller.sysj line: 34, column: 3
                                S4070=0;
                                S4032=0;
                                if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 35, column: 3
                                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                  S4032=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S4027=0;
                                  if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                    liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 35, column: 3
                                    S4027=1;
                                    if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 35, column: 3
                                      System.out.println("FILLER RECEIVED LIQUID");//sysj\filler_controller.sysj line: 36, column: 3
                                      S4070=1;
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
                            }
                            else {
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          
                          case 1 : 
                            if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                              readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 82, column: 5
                              i_thread_1 = 0;//sysj\filler_controller.sysj line: 34, column: 3
                              S4070=0;
                              S4032=0;
                              if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 35, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                S4032=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S4027=0;
                                if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                  liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 35, column: 3
                                  S4027=1;
                                  if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                    liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 35, column: 3
                                    System.out.println("FILLER RECEIVED LIQUID");//sysj\filler_controller.sysj line: 36, column: 3
                                    S4070=1;
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
                          
                        }
                      }
                      break;
                    
                    case 1 : 
                      S5473=1;
                      S5473=0;
                      if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 82, column: 5
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                        S5473=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S5468=0;
                        if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                          readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 82, column: 5
                          S5468=1;
                          if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 82, column: 5
                            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 82, column: 5
                            ends[1]=2;
                            ;//sysj\filler_controller.sysj line: 82, column: 5
                            i_thread_1 = 0;//sysj\filler_controller.sysj line: 34, column: 3
                            S4070=0;
                            S4032=0;
                            if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 35, column: 3
                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                              S4032=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S4027=0;
                              if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 35, column: 3
                                S4027=1;
                                if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 35, column: 3
                                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 35, column: 3
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 35, column: 3
                                  System.out.println("FILLER RECEIVED LIQUID");//sysj\filler_controller.sysj line: 36, column: 3
                                  S4070=1;
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
    done_1 = new Signal();
    liquidAmount_1 = new Signal();
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
          liquidData_in.gethook();
          readyFiller_o.gethook();
          bottleAtPos2.gethook();
          dosUnitEvac.gethook();
          dosUnitFilled.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      nozzleSelect.setpreclear();
      done_1.setpreclear();
      liquidAmount_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos2.getStatus() ? bottleAtPos2.setprepresent() : bottleAtPos2.setpreclear();
      bottleAtPos2.setpreval(bottleAtPos2.getValue());
      bottleAtPos2.setClear();
      dummyint = dosUnitEvac.getStatus() ? dosUnitEvac.setprepresent() : dosUnitEvac.setpreclear();
      dosUnitEvac.setpreval(dosUnitEvac.getValue());
      dosUnitEvac.setClear();
      dummyint = dosUnitFilled.getStatus() ? dosUnitFilled.setprepresent() : dosUnitFilled.setpreclear();
      dosUnitFilled.setpreval(dosUnitFilled.getValue());
      dosUnitFilled.setClear();
      valveInjectorOnOff.sethook();
      valveInjectorOnOff.setClear();
      valveInletOnOff.sethook();
      valveInletOnOff.setClear();
      dosUnitValveRetract.sethook();
      dosUnitValveRetract.setClear();
      dosUnitValveExtend.sethook();
      dosUnitValveExtend.setClear();
      nozzleSelect.sethook();
      nozzleSelect.setClear();
      done_1.setClear();
      liquidAmount_1.setClear();
      liquidData_in.sethook();
      readyFiller_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        liquidData_in.gethook();
        readyFiller_o.gethook();
        bottleAtPos2.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
