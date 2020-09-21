import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.util.ArrayList;//sysj/filler_controller.sysj line: 4, column: 1

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
  public Signal ready = new Signal("ready", Signal.OUTPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  public input_Channel liquidData_in = new input_Channel();
  public output_Channel nozzleSelect_o = new output_Channel();
  private Signal done_1;
  private Signal liquidAmount_1;
  private long __start_thread_6;//sysj/filler_controller.sysj line: 59, column: 7
  private int i_thread_1;//sysj/filler_controller.sysj line: 31, column: 3
  private int S27819 = 1;
  private int S46 = 1;
  private int S8 = 1;
  private int S3 = 1;
  private int S95 = 1;
  private int S57 = 1;
  private int S52 = 1;
  private int S224 = 1;
  private int S100 = 1;
  private int S105 = 1;
  private int S111 = 1;
  private int S116 = 1;
  private int S144 = 1;
  private int S143 = 1;
  private int S118 = 1;
  
  private int[] ends = new int[7];
  private int[] tdone = new int[7];
  
  public void thread27849(int [] tdone, int [] ends){
        S105=1;
    dosUnitValveRetract.setPresent();//sysj/filler_controller.sysj line: 46, column: 8
    currsigs.addElement(dosUnitValveRetract);
    System.out.println("Emitted dosUnitValveRetract");
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread27848(int [] tdone, int [] ends){
        S100=1;
    valveInjectorOnOff.setPresent();//sysj/filler_controller.sysj line: 42, column: 8
    currsigs.addElement(valveInjectorOnOff);
    System.out.println("Emitted valveInjectorOnOff");
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread27846(int [] tdone, int [] ends){
        switch(S144){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S143){
          case 0 : 
            switch(S118){
              case 0 : 
                S118=0;
                if(com.systemj.Timer.getMs() - __start_thread_6 >= 100 / (liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj/filler_controller.sysj line: 59, column: 7
                  ends[6]=3;
                  ;//sysj/filler_controller.sysj line: 59, column: 7
                  S143=1;
                  done_1.setPresent();//sysj/filler_controller.sysj line: 61, column: 8
                  currsigs.addElement(done_1);
                  System.out.println("Emitted done_1");
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S118=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                break;
              
              case 1 : 
                S118=1;
                S118=0;
                if(com.systemj.Timer.getMs() - __start_thread_6 >= 100 / (liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj/filler_controller.sysj line: 59, column: 7
                  ends[6]=3;
                  ;//sysj/filler_controller.sysj line: 59, column: 7
                  S143=1;
                  done_1.setPresent();//sysj/filler_controller.sysj line: 61, column: 8
                  currsigs.addElement(done_1);
                  System.out.println("Emitted done_1");
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S118=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            done_1.setPresent();//sysj/filler_controller.sysj line: 61, column: 8
            currsigs.addElement(done_1);
            System.out.println("Emitted done_1");
            active[6]=1;
            ends[6]=1;
            tdone[6]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread27845(int [] tdone, int [] ends){
        switch(S116){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj/filler_controller.sysj line: 56, column: 8
        currsigs.addElement(dosUnitValveExtend);
        System.out.println("Emitted dosUnitValveExtend");
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread27844(int [] tdone, int [] ends){
        switch(S111){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj/filler_controller.sysj line: 51, column: 8
        currsigs.addElement(valveInletOnOff);
        System.out.println("Emitted valveInletOnOff");
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread27842(int [] tdone, int [] ends){
        S144=1;
    S143=0;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj/filler_controller.sysj line: 59, column: 7
    S118=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= 100 / (liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj/filler_controller.sysj line: 59, column: 7
      ends[6]=3;
      ;//sysj/filler_controller.sysj line: 59, column: 7
      S143=1;
      done_1.setPresent();//sysj/filler_controller.sysj line: 61, column: 8
      currsigs.addElement(done_1);
      System.out.println("Emitted done_1");
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S118=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread27841(int [] tdone, int [] ends){
        S116=1;
    dosUnitValveExtend.setPresent();//sysj/filler_controller.sysj line: 56, column: 8
    currsigs.addElement(dosUnitValveExtend);
    System.out.println("Emitted dosUnitValveExtend");
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread27840(int [] tdone, int [] ends){
        S111=1;
    valveInletOnOff.setPresent();//sysj/filler_controller.sysj line: 51, column: 8
    currsigs.addElement(valveInletOnOff);
    System.out.println("Emitted valveInletOnOff");
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread27838(int [] tdone, int [] ends){
        switch(S105){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj/filler_controller.sysj line: 46, column: 8
        currsigs.addElement(dosUnitValveRetract);
        System.out.println("Emitted dosUnitValveRetract");
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread27837(int [] tdone, int [] ends){
        switch(S100){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj/filler_controller.sysj line: 42, column: 8
        currsigs.addElement(valveInjectorOnOff);
        System.out.println("Emitted valveInjectorOnOff");
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread27835(int [] tdone, int [] ends){
        S144=1;
    S143=0;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj/filler_controller.sysj line: 59, column: 7
    S118=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= 100 / (liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj/filler_controller.sysj line: 59, column: 7
      ends[6]=3;
      ;//sysj/filler_controller.sysj line: 59, column: 7
      S143=1;
      done_1.setPresent();//sysj/filler_controller.sysj line: 61, column: 8
      currsigs.addElement(done_1);
      System.out.println("Emitted done_1");
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S118=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread27834(int [] tdone, int [] ends){
        S116=1;
    dosUnitValveExtend.setPresent();//sysj/filler_controller.sysj line: 56, column: 8
    currsigs.addElement(dosUnitValveExtend);
    System.out.println("Emitted dosUnitValveExtend");
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread27833(int [] tdone, int [] ends){
        S111=1;
    valveInletOnOff.setPresent();//sysj/filler_controller.sysj line: 51, column: 8
    currsigs.addElement(valveInletOnOff);
    System.out.println("Emitted valveInletOnOff");
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread27831(int [] tdone, int [] ends){
        S105=1;
    dosUnitValveRetract.setPresent();//sysj/filler_controller.sysj line: 46, column: 8
    currsigs.addElement(dosUnitValveRetract);
    System.out.println("Emitted dosUnitValveRetract");
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread27830(int [] tdone, int [] ends){
        S100=1;
    valveInjectorOnOff.setPresent();//sysj/filler_controller.sysj line: 42, column: 8
    currsigs.addElement(valveInjectorOnOff);
    System.out.println("Emitted valveInjectorOnOff");
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread27828(int [] tdone, int [] ends){
        S105=1;
    dosUnitValveRetract.setPresent();//sysj/filler_controller.sysj line: 46, column: 8
    currsigs.addElement(dosUnitValveRetract);
    System.out.println("Emitted dosUnitValveRetract");
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread27827(int [] tdone, int [] ends){
        S100=1;
    valveInjectorOnOff.setPresent();//sysj/filler_controller.sysj line: 42, column: 8
    currsigs.addElement(valveInjectorOnOff);
    System.out.println("Emitted valveInjectorOnOff");
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread27825(int [] tdone, int [] ends){
        S105=1;
    dosUnitValveRetract.setPresent();//sysj/filler_controller.sysj line: 46, column: 8
    currsigs.addElement(dosUnitValveRetract);
    System.out.println("Emitted dosUnitValveRetract");
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread27824(int [] tdone, int [] ends){
        S100=1;
    valveInjectorOnOff.setPresent();//sysj/filler_controller.sysj line: 42, column: 8
    currsigs.addElement(valveInjectorOnOff);
    System.out.println("Emitted valveInjectorOnOff");
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread27822(int [] tdone, int [] ends){
        S105=1;
    dosUnitValveRetract.setPresent();//sysj/filler_controller.sysj line: 46, column: 8
    currsigs.addElement(dosUnitValveRetract);
    System.out.println("Emitted dosUnitValveRetract");
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread27821(int [] tdone, int [] ends){
        S100=1;
    valveInjectorOnOff.setPresent();//sysj/filler_controller.sysj line: 42, column: 8
    currsigs.addElement(valveInjectorOnOff);
    System.out.println("Emitted valveInjectorOnOff");
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
      switch(S27819){
        case 0 : 
          S27819=0;
          break RUN;
        
        case 1 : 
          S27819=2;
          S27819=2;
          done_1.setClear();//sysj/filler_controller.sysj line: 28, column: 2
          liquidAmount_1.setClear();//sysj/filler_controller.sysj line: 29, column: 2
          i_thread_1 = 0;//sysj/filler_controller.sysj line: 31, column: 3
          S46=0;
          S8=0;
          if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj/filler_controller.sysj line: 32, column: 3
            liquidData_in.setACK(false);//sysj/filler_controller.sysj line: 32, column: 3
            S8=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S3=0;
            if(!liquidData_in.isREQ()){//sysj/filler_controller.sysj line: 32, column: 3
              liquidData_in.setACK(true);//sysj/filler_controller.sysj line: 32, column: 3
              S3=1;
              if(liquidData_in.isREQ()){//sysj/filler_controller.sysj line: 32, column: 3
                liquidData_in.setACK(false);//sysj/filler_controller.sysj line: 32, column: 3
                ends[1]=2;
                ;//sysj/filler_controller.sysj line: 32, column: 3
                S46=1;
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
          done_1.setClear();//sysj/filler_controller.sysj line: 28, column: 2
          liquidAmount_1.setClear();//sysj/filler_controller.sysj line: 29, column: 2
          switch(S46){
            case 0 : 
              switch(S8){
                case 0 : 
                  if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj/filler_controller.sysj line: 32, column: 3
                    liquidData_in.setACK(false);//sysj/filler_controller.sysj line: 32, column: 3
                    S8=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S3){
                      case 0 : 
                        if(!liquidData_in.isREQ()){//sysj/filler_controller.sysj line: 32, column: 3
                          liquidData_in.setACK(true);//sysj/filler_controller.sysj line: 32, column: 3
                          S3=1;
                          if(liquidData_in.isREQ()){//sysj/filler_controller.sysj line: 32, column: 3
                            liquidData_in.setACK(false);//sysj/filler_controller.sysj line: 32, column: 3
                            ends[1]=2;
                            ;//sysj/filler_controller.sysj line: 32, column: 3
                            S46=1;
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
                        if(liquidData_in.isREQ()){//sysj/filler_controller.sysj line: 32, column: 3
                          liquidData_in.setACK(false);//sysj/filler_controller.sysj line: 32, column: 3
                          ends[1]=2;
                          ;//sysj/filler_controller.sysj line: 32, column: 3
                          S46=1;
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
                  S8=1;
                  S8=0;
                  if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj/filler_controller.sysj line: 32, column: 3
                    liquidData_in.setACK(false);//sysj/filler_controller.sysj line: 32, column: 3
                    S8=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S3=0;
                    if(!liquidData_in.isREQ()){//sysj/filler_controller.sysj line: 32, column: 3
                      liquidData_in.setACK(true);//sysj/filler_controller.sysj line: 32, column: 3
                      S3=1;
                      if(liquidData_in.isREQ()){//sysj/filler_controller.sysj line: 32, column: 3
                        liquidData_in.setACK(false);//sysj/filler_controller.sysj line: 32, column: 3
                        ends[1]=2;
                        ;//sysj/filler_controller.sysj line: 32, column: 3
                        S46=1;
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
              if(bottleAtPos2.getprestatus()){//sysj/filler_controller.sysj line: 33, column: 9
                S46=2;
                liquidAmount_1.setPresent();//sysj/filler_controller.sysj line: 36, column: 5
                currsigs.addElement(liquidAmount_1);
                liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj/filler_controller.sysj line: 36, column: 5
                System.out.println("Emitted liquidAmount_1");
                S95=0;
                S57=0;
                if(!nozzleSelect_o.isPartnerPresent() || nozzleSelect_o.isPartnerPreempted()){//sysj/filler_controller.sysj line: 37, column: 5
                  nozzleSelect_o.setREQ(false);//sysj/filler_controller.sysj line: 37, column: 5
                  S57=1;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S52=0;
                  if(nozzleSelect_o.isACK()){//sysj/filler_controller.sysj line: 37, column: 5
                    nozzleSelect_o.setVal(i_thread_1);//sysj/filler_controller.sysj line: 37, column: 5
                    S52=1;
                    if(!nozzleSelect_o.isACK()){//sysj/filler_controller.sysj line: 37, column: 5
                      nozzleSelect_o.setREQ(false);//sysj/filler_controller.sysj line: 37, column: 5
                      ends[1]=2;
                      ;//sysj/filler_controller.sysj line: 37, column: 5
                      S95=1;
                      if((liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue()) != 0){//sysj/filler_controller.sysj line: 39, column: 9
                        S224=0;
                        thread27821(tdone,ends);
                        thread27822(tdone,ends);
                        int biggest27823 = 0;
                        if(ends[2]>=biggest27823){
                          biggest27823=ends[2];
                        }
                        if(ends[3]>=biggest27823){
                          biggest27823=ends[3];
                        }
                        if(biggest27823 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        if(i_thread_1 == 3){//sysj/filler_controller.sysj line: 66, column: 9
                          nozzleSelect_o.setPreempted();//sysj/filler_controller.sysj line: 67, column: 6
                          ends[1]=2;
                          ;//sysj/filler_controller.sysj line: 34, column: 3
                          i_thread_1 = 0;//sysj/filler_controller.sysj line: 31, column: 3
                          S46=0;
                          S8=0;
                          if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj/filler_controller.sysj line: 32, column: 3
                            liquidData_in.setACK(false);//sysj/filler_controller.sysj line: 32, column: 3
                            S8=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S3=0;
                            if(!liquidData_in.isREQ()){//sysj/filler_controller.sysj line: 32, column: 3
                              liquidData_in.setACK(true);//sysj/filler_controller.sysj line: 32, column: 3
                              S3=1;
                              if(liquidData_in.isREQ()){//sysj/filler_controller.sysj line: 32, column: 3
                                liquidData_in.setACK(false);//sysj/filler_controller.sysj line: 32, column: 3
                                ends[1]=2;
                                ;//sysj/filler_controller.sysj line: 32, column: 3
                                S46=1;
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
                          i_thread_1 = i_thread_1 + 1;//sysj/filler_controller.sysj line: 69, column: 6
                          S95=2;
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
              switch(S95){
                case 0 : 
                  switch(S57){
                    case 0 : 
                      if(!nozzleSelect_o.isPartnerPresent() || nozzleSelect_o.isPartnerPreempted()){//sysj/filler_controller.sysj line: 37, column: 5
                        nozzleSelect_o.setREQ(false);//sysj/filler_controller.sysj line: 37, column: 5
                        S57=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S52){
                          case 0 : 
                            if(nozzleSelect_o.isACK()){//sysj/filler_controller.sysj line: 37, column: 5
                              nozzleSelect_o.setVal(i_thread_1);//sysj/filler_controller.sysj line: 37, column: 5
                              S52=1;
                              if(!nozzleSelect_o.isACK()){//sysj/filler_controller.sysj line: 37, column: 5
                                nozzleSelect_o.setREQ(false);//sysj/filler_controller.sysj line: 37, column: 5
                                ends[1]=2;
                                ;//sysj/filler_controller.sysj line: 37, column: 5
                                S95=1;
                                if((liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue()) != 0){//sysj/filler_controller.sysj line: 39, column: 9
                                  S224=0;
                                  thread27824(tdone,ends);
                                  thread27825(tdone,ends);
                                  int biggest27826 = 0;
                                  if(ends[2]>=biggest27826){
                                    biggest27826=ends[2];
                                  }
                                  if(ends[3]>=biggest27826){
                                    biggest27826=ends[3];
                                  }
                                  if(biggest27826 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  if(i_thread_1 == 3){//sysj/filler_controller.sysj line: 66, column: 9
                                    nozzleSelect_o.setPreempted();//sysj/filler_controller.sysj line: 67, column: 6
                                    ends[1]=2;
                                    ;//sysj/filler_controller.sysj line: 34, column: 3
                                    i_thread_1 = 0;//sysj/filler_controller.sysj line: 31, column: 3
                                    S46=0;
                                    S8=0;
                                    if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj/filler_controller.sysj line: 32, column: 3
                                      liquidData_in.setACK(false);//sysj/filler_controller.sysj line: 32, column: 3
                                      S8=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S3=0;
                                      if(!liquidData_in.isREQ()){//sysj/filler_controller.sysj line: 32, column: 3
                                        liquidData_in.setACK(true);//sysj/filler_controller.sysj line: 32, column: 3
                                        S3=1;
                                        if(liquidData_in.isREQ()){//sysj/filler_controller.sysj line: 32, column: 3
                                          liquidData_in.setACK(false);//sysj/filler_controller.sysj line: 32, column: 3
                                          ends[1]=2;
                                          ;//sysj/filler_controller.sysj line: 32, column: 3
                                          S46=1;
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
                                    i_thread_1 = i_thread_1 + 1;//sysj/filler_controller.sysj line: 69, column: 6
                                    S95=2;
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
                            if(!nozzleSelect_o.isACK()){//sysj/filler_controller.sysj line: 37, column: 5
                              nozzleSelect_o.setREQ(false);//sysj/filler_controller.sysj line: 37, column: 5
                              ends[1]=2;
                              ;//sysj/filler_controller.sysj line: 37, column: 5
                              S95=1;
                              if((liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue()) != 0){//sysj/filler_controller.sysj line: 39, column: 9
                                S224=0;
                                thread27827(tdone,ends);
                                thread27828(tdone,ends);
                                int biggest27829 = 0;
                                if(ends[2]>=biggest27829){
                                  biggest27829=ends[2];
                                }
                                if(ends[3]>=biggest27829){
                                  biggest27829=ends[3];
                                }
                                if(biggest27829 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                if(i_thread_1 == 3){//sysj/filler_controller.sysj line: 66, column: 9
                                  nozzleSelect_o.setPreempted();//sysj/filler_controller.sysj line: 67, column: 6
                                  ends[1]=2;
                                  ;//sysj/filler_controller.sysj line: 34, column: 3
                                  i_thread_1 = 0;//sysj/filler_controller.sysj line: 31, column: 3
                                  S46=0;
                                  S8=0;
                                  if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj/filler_controller.sysj line: 32, column: 3
                                    liquidData_in.setACK(false);//sysj/filler_controller.sysj line: 32, column: 3
                                    S8=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S3=0;
                                    if(!liquidData_in.isREQ()){//sysj/filler_controller.sysj line: 32, column: 3
                                      liquidData_in.setACK(true);//sysj/filler_controller.sysj line: 32, column: 3
                                      S3=1;
                                      if(liquidData_in.isREQ()){//sysj/filler_controller.sysj line: 32, column: 3
                                        liquidData_in.setACK(false);//sysj/filler_controller.sysj line: 32, column: 3
                                        ends[1]=2;
                                        ;//sysj/filler_controller.sysj line: 32, column: 3
                                        S46=1;
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
                                  i_thread_1 = i_thread_1 + 1;//sysj/filler_controller.sysj line: 69, column: 6
                                  S95=2;
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
                      S57=1;
                      S57=0;
                      if(!nozzleSelect_o.isPartnerPresent() || nozzleSelect_o.isPartnerPreempted()){//sysj/filler_controller.sysj line: 37, column: 5
                        nozzleSelect_o.setREQ(false);//sysj/filler_controller.sysj line: 37, column: 5
                        S57=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S52=0;
                        if(nozzleSelect_o.isACK()){//sysj/filler_controller.sysj line: 37, column: 5
                          nozzleSelect_o.setVal(i_thread_1);//sysj/filler_controller.sysj line: 37, column: 5
                          S52=1;
                          if(!nozzleSelect_o.isACK()){//sysj/filler_controller.sysj line: 37, column: 5
                            nozzleSelect_o.setREQ(false);//sysj/filler_controller.sysj line: 37, column: 5
                            ends[1]=2;
                            ;//sysj/filler_controller.sysj line: 37, column: 5
                            S95=1;
                            if((liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue()) != 0){//sysj/filler_controller.sysj line: 39, column: 9
                              S224=0;
                              thread27830(tdone,ends);
                              thread27831(tdone,ends);
                              int biggest27832 = 0;
                              if(ends[2]>=biggest27832){
                                biggest27832=ends[2];
                              }
                              if(ends[3]>=biggest27832){
                                biggest27832=ends[3];
                              }
                              if(biggest27832 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              if(i_thread_1 == 3){//sysj/filler_controller.sysj line: 66, column: 9
                                nozzleSelect_o.setPreempted();//sysj/filler_controller.sysj line: 67, column: 6
                                ends[1]=2;
                                ;//sysj/filler_controller.sysj line: 34, column: 3
                                i_thread_1 = 0;//sysj/filler_controller.sysj line: 31, column: 3
                                S46=0;
                                S8=0;
                                if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj/filler_controller.sysj line: 32, column: 3
                                  liquidData_in.setACK(false);//sysj/filler_controller.sysj line: 32, column: 3
                                  S8=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S3=0;
                                  if(!liquidData_in.isREQ()){//sysj/filler_controller.sysj line: 32, column: 3
                                    liquidData_in.setACK(true);//sysj/filler_controller.sysj line: 32, column: 3
                                    S3=1;
                                    if(liquidData_in.isREQ()){//sysj/filler_controller.sysj line: 32, column: 3
                                      liquidData_in.setACK(false);//sysj/filler_controller.sysj line: 32, column: 3
                                      ends[1]=2;
                                      ;//sysj/filler_controller.sysj line: 32, column: 3
                                      S46=1;
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
                                i_thread_1 = i_thread_1 + 1;//sysj/filler_controller.sysj line: 69, column: 6
                                S95=2;
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
                  switch(S224){
                    case 0 : 
                      if(dosUnitFilled.getprestatus()){//sysj/filler_controller.sysj line: 40, column: 12
                        S224=1;
                        thread27833(tdone,ends);
                        thread27834(tdone,ends);
                        thread27835(tdone,ends);
                        int biggest27836 = 0;
                        if(ends[4]>=biggest27836){
                          biggest27836=ends[4];
                        }
                        if(ends[5]>=biggest27836){
                          biggest27836=ends[5];
                        }
                        if(ends[6]>=biggest27836){
                          biggest27836=ends[6];
                        }
                        if(biggest27836 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        thread27837(tdone,ends);
                        thread27838(tdone,ends);
                        int biggest27839 = 0;
                        if(ends[2]>=biggest27839){
                          biggest27839=ends[2];
                        }
                        if(ends[3]>=biggest27839){
                          biggest27839=ends[3];
                        }
                        if(biggest27839 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest27839 == 0){
                          S224=1;
                          thread27840(tdone,ends);
                          thread27841(tdone,ends);
                          thread27842(tdone,ends);
                          int biggest27843 = 0;
                          if(ends[4]>=biggest27843){
                            biggest27843=ends[4];
                          }
                          if(ends[5]>=biggest27843){
                            biggest27843=ends[5];
                          }
                          if(ends[6]>=biggest27843){
                            biggest27843=ends[6];
                          }
                          if(biggest27843 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                      }
                    
                    case 1 : 
                      if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj/filler_controller.sysj line: 49, column: 12
                        if(i_thread_1 == 3){//sysj/filler_controller.sysj line: 66, column: 9
                          nozzleSelect_o.setPreempted();//sysj/filler_controller.sysj line: 67, column: 6
                          ends[1]=2;
                          ;//sysj/filler_controller.sysj line: 34, column: 3
                          i_thread_1 = 0;//sysj/filler_controller.sysj line: 31, column: 3
                          S46=0;
                          S8=0;
                          if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj/filler_controller.sysj line: 32, column: 3
                            liquidData_in.setACK(false);//sysj/filler_controller.sysj line: 32, column: 3
                            S8=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S3=0;
                            if(!liquidData_in.isREQ()){//sysj/filler_controller.sysj line: 32, column: 3
                              liquidData_in.setACK(true);//sysj/filler_controller.sysj line: 32, column: 3
                              S3=1;
                              if(liquidData_in.isREQ()){//sysj/filler_controller.sysj line: 32, column: 3
                                liquidData_in.setACK(false);//sysj/filler_controller.sysj line: 32, column: 3
                                ends[1]=2;
                                ;//sysj/filler_controller.sysj line: 32, column: 3
                                S46=1;
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
                          i_thread_1 = i_thread_1 + 1;//sysj/filler_controller.sysj line: 69, column: 6
                          S95=2;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        thread27844(tdone,ends);
                        thread27845(tdone,ends);
                        thread27846(tdone,ends);
                        int biggest27847 = 0;
                        if(ends[4]>=biggest27847){
                          biggest27847=ends[4];
                        }
                        if(ends[5]>=biggest27847){
                          biggest27847=ends[5];
                        }
                        if(ends[6]>=biggest27847){
                          biggest27847=ends[6];
                        }
                        if(biggest27847 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest27847 == 0){
                          if(i_thread_1 == 3){//sysj/filler_controller.sysj line: 66, column: 9
                            nozzleSelect_o.setPreempted();//sysj/filler_controller.sysj line: 67, column: 6
                            ends[1]=2;
                            ;//sysj/filler_controller.sysj line: 34, column: 3
                            i_thread_1 = 0;//sysj/filler_controller.sysj line: 31, column: 3
                            S46=0;
                            S8=0;
                            if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj/filler_controller.sysj line: 32, column: 3
                              liquidData_in.setACK(false);//sysj/filler_controller.sysj line: 32, column: 3
                              S8=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S3=0;
                              if(!liquidData_in.isREQ()){//sysj/filler_controller.sysj line: 32, column: 3
                                liquidData_in.setACK(true);//sysj/filler_controller.sysj line: 32, column: 3
                                S3=1;
                                if(liquidData_in.isREQ()){//sysj/filler_controller.sysj line: 32, column: 3
                                  liquidData_in.setACK(false);//sysj/filler_controller.sysj line: 32, column: 3
                                  ends[1]=2;
                                  ;//sysj/filler_controller.sysj line: 32, column: 3
                                  S46=1;
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
                            i_thread_1 = i_thread_1 + 1;//sysj/filler_controller.sysj line: 69, column: 6
                            S95=2;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                      }
                    
                  }
                  break;
                
                case 2 : 
                  S95=2;
                  liquidAmount_1.setPresent();//sysj/filler_controller.sysj line: 36, column: 5
                  currsigs.addElement(liquidAmount_1);
                  liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj/filler_controller.sysj line: 36, column: 5
                  System.out.println("Emitted liquidAmount_1");
                  S95=0;
                  S57=0;
                  if(!nozzleSelect_o.isPartnerPresent() || nozzleSelect_o.isPartnerPreempted()){//sysj/filler_controller.sysj line: 37, column: 5
                    nozzleSelect_o.setREQ(false);//sysj/filler_controller.sysj line: 37, column: 5
                    S57=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S52=0;
                    if(nozzleSelect_o.isACK()){//sysj/filler_controller.sysj line: 37, column: 5
                      nozzleSelect_o.setVal(i_thread_1);//sysj/filler_controller.sysj line: 37, column: 5
                      S52=1;
                      if(!nozzleSelect_o.isACK()){//sysj/filler_controller.sysj line: 37, column: 5
                        nozzleSelect_o.setREQ(false);//sysj/filler_controller.sysj line: 37, column: 5
                        ends[1]=2;
                        ;//sysj/filler_controller.sysj line: 37, column: 5
                        S95=1;
                        if((liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue()) != 0){//sysj/filler_controller.sysj line: 39, column: 9
                          S224=0;
                          thread27848(tdone,ends);
                          thread27849(tdone,ends);
                          int biggest27850 = 0;
                          if(ends[2]>=biggest27850){
                            biggest27850=ends[2];
                          }
                          if(ends[3]>=biggest27850){
                            biggest27850=ends[3];
                          }
                          if(biggest27850 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          if(i_thread_1 == 3){//sysj/filler_controller.sysj line: 66, column: 9
                            nozzleSelect_o.setPreempted();//sysj/filler_controller.sysj line: 67, column: 6
                            ends[1]=2;
                            ;//sysj/filler_controller.sysj line: 34, column: 3
                            i_thread_1 = 0;//sysj/filler_controller.sysj line: 31, column: 3
                            S46=0;
                            S8=0;
                            if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj/filler_controller.sysj line: 32, column: 3
                              liquidData_in.setACK(false);//sysj/filler_controller.sysj line: 32, column: 3
                              S8=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S3=0;
                              if(!liquidData_in.isREQ()){//sysj/filler_controller.sysj line: 32, column: 3
                                liquidData_in.setACK(true);//sysj/filler_controller.sysj line: 32, column: 3
                                S3=1;
                                if(liquidData_in.isREQ()){//sysj/filler_controller.sysj line: 32, column: 3
                                  liquidData_in.setACK(false);//sysj/filler_controller.sysj line: 32, column: 3
                                  ends[1]=2;
                                  ;//sysj/filler_controller.sysj line: 32, column: 3
                                  S46=1;
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
                            i_thread_1 = i_thread_1 + 1;//sysj/filler_controller.sysj line: 69, column: 6
                            S95=2;
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
          nozzleSelect_o.gethook();
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
      ready.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
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
      ready.sethook();
      ready.setClear();
      valveInjectorOnOff.sethook();
      valveInjectorOnOff.setClear();
      valveInletOnOff.sethook();
      valveInletOnOff.setClear();
      dosUnitValveRetract.sethook();
      dosUnitValveRetract.setClear();
      dosUnitValveExtend.sethook();
      dosUnitValveExtend.setClear();
      done_1.setClear();
      liquidAmount_1.setClear();
      liquidData_in.sethook();
      nozzleSelect_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        liquidData_in.gethook();
        nozzleSelect_o.gethook();
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
