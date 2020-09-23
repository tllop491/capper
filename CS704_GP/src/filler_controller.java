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
  private long __start_thread_6;//sysj\filler_controller.sysj line: 62, column: 7
  private int i_thread_1;//sysj\filler_controller.sysj line: 32, column: 3
  private int S118088 = 1;
  private int S118087 = 1;
  private int S6579 = 1;
  private int S6574 = 1;
  private int S6639 = 1;
  private int S6601 = 1;
  private int S6596 = 1;
  private int S6650 = 1;
  private int S6645 = 1;
  private int S6688 = 1;
  private int S6808 = 1;
  private int S6693 = 1;
  private int S6698 = 1;
  private int S6704 = 1;
  private int S6709 = 1;
  private int S6725 = 1;
  private int S6711 = 1;
  
  private int[] ends = new int[7];
  private int[] tdone = new int[7];
  
  public void thread118138(int [] tdone, int [] ends){
        S6698=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread118137(int [] tdone, int [] ends){
        S6693=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 45, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread118135(int [] tdone, int [] ends){
        S6725=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 62, column: 7
    S6711=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 62, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
      currsigs.addElement(done_1);
      S6725=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S6711=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread118134(int [] tdone, int [] ends){
        S6709=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread118133(int [] tdone, int [] ends){
        S6704=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 54, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread118131(int [] tdone, int [] ends){
        switch(S6725){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S6711){
          case 0 : 
            S6711=0;
            if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
              ends[6]=3;
              ;//sysj\filler_controller.sysj line: 62, column: 7
              done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
              currsigs.addElement(done_1);
              S6725=0;
              active[6]=0;
              ends[6]=0;
              tdone[6]=1;
            }
            else {
              S6711=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            S6711=1;
            S6711=0;
            if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
              ends[6]=3;
              ;//sysj\filler_controller.sysj line: 62, column: 7
              done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
              currsigs.addElement(done_1);
              S6725=0;
              active[6]=0;
              ends[6]=0;
              tdone[6]=1;
            }
            else {
              S6711=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread118130(int [] tdone, int [] ends){
        switch(S6709){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
        currsigs.addElement(dosUnitValveExtend);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread118129(int [] tdone, int [] ends){
        switch(S6704){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 54, column: 8
        currsigs.addElement(valveInletOnOff);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread118127(int [] tdone, int [] ends){
        S6725=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 62, column: 7
    S6711=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 62, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
      currsigs.addElement(done_1);
      S6725=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S6711=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread118126(int [] tdone, int [] ends){
        S6709=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread118125(int [] tdone, int [] ends){
        S6704=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 54, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread118123(int [] tdone, int [] ends){
        switch(S6698){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
        currsigs.addElement(dosUnitValveRetract);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread118122(int [] tdone, int [] ends){
        switch(S6693){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 45, column: 8
        currsigs.addElement(valveInjectorOnOff);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread118120(int [] tdone, int [] ends){
        S6725=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 62, column: 7
    S6711=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 62, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
      currsigs.addElement(done_1);
      S6725=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S6711=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread118119(int [] tdone, int [] ends){
        S6709=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread118118(int [] tdone, int [] ends){
        S6704=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 54, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread118116(int [] tdone, int [] ends){
        S6698=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread118115(int [] tdone, int [] ends){
        S6693=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 45, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread118113(int [] tdone, int [] ends){
        S6725=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 62, column: 7
    S6711=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 62, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
      currsigs.addElement(done_1);
      S6725=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S6711=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread118112(int [] tdone, int [] ends){
        S6709=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread118111(int [] tdone, int [] ends){
        S6704=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 54, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread118109(int [] tdone, int [] ends){
        S6698=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread118108(int [] tdone, int [] ends){
        S6693=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 45, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread118106(int [] tdone, int [] ends){
        S6725=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 62, column: 7
    S6711=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 62, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
      currsigs.addElement(done_1);
      S6725=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S6711=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread118105(int [] tdone, int [] ends){
        S6709=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread118104(int [] tdone, int [] ends){
        S6704=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 54, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread118102(int [] tdone, int [] ends){
        S6698=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread118101(int [] tdone, int [] ends){
        S6693=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 45, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread118099(int [] tdone, int [] ends){
        S6725=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 62, column: 7
    S6711=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 62, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
      currsigs.addElement(done_1);
      S6725=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S6711=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread118098(int [] tdone, int [] ends){
        S6709=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread118097(int [] tdone, int [] ends){
        S6704=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 54, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread118095(int [] tdone, int [] ends){
        S6698=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread118094(int [] tdone, int [] ends){
        S6693=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 45, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread118092(int [] tdone, int [] ends){
        S6725=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 62, column: 7
    S6711=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 62, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
      currsigs.addElement(done_1);
      S6725=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S6711=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread118091(int [] tdone, int [] ends){
        S6709=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread118090(int [] tdone, int [] ends){
        S6704=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 54, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S118088){
        case 0 : 
          S118088=0;
          break RUN;
        
        case 1 : 
          S118088=2;
          S118088=2;
          done_1.setClear();//sysj\filler_controller.sysj line: 28, column: 2
          liquidAmount_1.setClear();//sysj\filler_controller.sysj line: 29, column: 2
          S118087=0;
          S6579=0;
          if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 30, column: 2
            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
            S6579=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S6574=0;
            if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
              readyFiller_o.setVal(true);//sysj\filler_controller.sysj line: 30, column: 2
              S6574=1;
              if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                ends[1]=2;
                ;//sysj\filler_controller.sysj line: 30, column: 2
                S118087=1;
                i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                S6639=0;
                S6601=0;
                if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                  S6601=1;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S6596=0;
                  if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                    liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                    S6596=1;
                    if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                      ends[1]=2;
                      ;//sysj\filler_controller.sysj line: 33, column: 3
                      System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                      S6639=1;
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
          switch(S118087){
            case 0 : 
              switch(S6579){
                case 0 : 
                  if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 30, column: 2
                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                    S6579=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S6574){
                      case 0 : 
                        if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                          readyFiller_o.setVal(true);//sysj\filler_controller.sysj line: 30, column: 2
                          S6574=1;
                          if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                            ends[1]=2;
                            ;//sysj\filler_controller.sysj line: 30, column: 2
                            S118087=1;
                            i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                            S6639=0;
                            S6601=0;
                            if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                              S6601=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S6596=0;
                              if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                S6596=1;
                                if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 33, column: 3
                                  System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                  S6639=1;
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
                        if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                          readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                          ends[1]=2;
                          ;//sysj\filler_controller.sysj line: 30, column: 2
                          S118087=1;
                          i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                          S6639=0;
                          S6601=0;
                          if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                            S6601=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S6596=0;
                            if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                              liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                              S6596=1;
                              if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 33, column: 3
                                System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                S6639=1;
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
                  S6579=1;
                  S6579=0;
                  if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 30, column: 2
                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                    S6579=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S6574=0;
                    if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                      readyFiller_o.setVal(true);//sysj\filler_controller.sysj line: 30, column: 2
                      S6574=1;
                      if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                        ends[1]=2;
                        ;//sysj\filler_controller.sysj line: 30, column: 2
                        S118087=1;
                        i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                        S6639=0;
                        S6601=0;
                        if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                          S6601=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S6596=0;
                          if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                            liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                            S6596=1;
                            if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 33, column: 3
                              System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                              S6639=1;
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
              switch(S6639){
                case 0 : 
                  switch(S6601){
                    case 0 : 
                      if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                        S6601=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S6596){
                          case 0 : 
                            if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                              liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                              S6596=1;
                              if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 33, column: 3
                                System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                S6639=1;
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
                            if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 33, column: 3
                              System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                              S6639=1;
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
                      S6601=1;
                      S6601=0;
                      if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                        S6601=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S6596=0;
                        if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                          liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                          S6596=1;
                          if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                            ends[1]=2;
                            ;//sysj\filler_controller.sysj line: 33, column: 3
                            System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                            S6639=1;
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
                  if(bottleAtPos2.getprestatus()){//sysj\filler_controller.sysj line: 35, column: 9
                    S6639=2;
                    S6650=0;
                    if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 36, column: 3
                      readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 36, column: 3
                      S6650=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S6645=0;
                      if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 36, column: 3
                        readyFiller_o.setVal(false);//sysj\filler_controller.sysj line: 36, column: 3
                        S6645=1;
                        if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 36, column: 3
                          readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 36, column: 3
                          ends[1]=2;
                          ;//sysj\filler_controller.sysj line: 36, column: 3
                          S6639=3;
                          liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 39, column: 5
                          currsigs.addElement(liquidAmount_1);
                          liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 39, column: 5
                          nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 40, column: 5
                          currsigs.addElement(nozzleSelect);
                          nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 40, column: 5
                          S6688=0;
                          if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 42, column: 9
                            S6808=0;
                            if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 43, column: 22
                              S6808=1;
                              if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 52, column: 22
                                System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                                if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 37, column: 3
                                  i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                  S6639=0;
                                  S6601=0;
                                  if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                    S6601=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S6596=0;
                                    if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                      S6596=1;
                                      if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 33, column: 3
                                        System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                        S6639=1;
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
                                  i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                                  S6688=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                thread118090(tdone,ends);
                                thread118091(tdone,ends);
                                thread118092(tdone,ends);
                                int biggest118093 = 0;
                                if(ends[4]>=biggest118093){
                                  biggest118093=ends[4];
                                }
                                if(ends[5]>=biggest118093){
                                  biggest118093=ends[5];
                                }
                                if(ends[6]>=biggest118093){
                                  biggest118093=ends[6];
                                }
                                if(biggest118093 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              thread118094(tdone,ends);
                              thread118095(tdone,ends);
                              int biggest118096 = 0;
                              if(ends[2]>=biggest118096){
                                biggest118096=ends[2];
                              }
                              if(ends[3]>=biggest118096){
                                biggest118096=ends[3];
                              }
                              if(biggest118096 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                            if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 37, column: 3
                              i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                              S6639=0;
                              S6601=0;
                              if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                S6601=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S6596=0;
                                if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                  S6596=1;
                                  if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 33, column: 3
                                    System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                    S6639=1;
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
                              i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                              S6688=1;
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
                  switch(S6650){
                    case 0 : 
                      if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 36, column: 3
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 36, column: 3
                        S6650=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S6645){
                          case 0 : 
                            if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 36, column: 3
                              readyFiller_o.setVal(false);//sysj\filler_controller.sysj line: 36, column: 3
                              S6645=1;
                              if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 36, column: 3
                                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 36, column: 3
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 36, column: 3
                                S6639=3;
                                liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 39, column: 5
                                currsigs.addElement(liquidAmount_1);
                                liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 39, column: 5
                                nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 40, column: 5
                                currsigs.addElement(nozzleSelect);
                                nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 40, column: 5
                                S6688=0;
                                if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 42, column: 9
                                  S6808=0;
                                  if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 43, column: 22
                                    S6808=1;
                                    if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 52, column: 22
                                      System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                                      if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 37, column: 3
                                        i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                        S6639=0;
                                        S6601=0;
                                        if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                          S6601=1;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          S6596=0;
                                          if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                            liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                            S6596=1;
                                            if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                              ends[1]=2;
                                              ;//sysj\filler_controller.sysj line: 33, column: 3
                                              System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                              S6639=1;
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
                                        i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                                        S6688=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      thread118097(tdone,ends);
                                      thread118098(tdone,ends);
                                      thread118099(tdone,ends);
                                      int biggest118100 = 0;
                                      if(ends[4]>=biggest118100){
                                        biggest118100=ends[4];
                                      }
                                      if(ends[5]>=biggest118100){
                                        biggest118100=ends[5];
                                      }
                                      if(ends[6]>=biggest118100){
                                        biggest118100=ends[6];
                                      }
                                      if(biggest118100 == 1){
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                  else {
                                    thread118101(tdone,ends);
                                    thread118102(tdone,ends);
                                    int biggest118103 = 0;
                                    if(ends[2]>=biggest118103){
                                      biggest118103=ends[2];
                                    }
                                    if(ends[3]>=biggest118103){
                                      biggest118103=ends[3];
                                    }
                                    if(biggest118103 == 1){
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                                  if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 37, column: 3
                                    i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                    S6639=0;
                                    S6601=0;
                                    if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                      S6601=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S6596=0;
                                      if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                        S6596=1;
                                        if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                          ends[1]=2;
                                          ;//sysj\filler_controller.sysj line: 33, column: 3
                                          System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                          S6639=1;
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
                                    i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                                    S6688=1;
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
                            if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 36, column: 3
                              readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 36, column: 3
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 36, column: 3
                              S6639=3;
                              liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 39, column: 5
                              currsigs.addElement(liquidAmount_1);
                              liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 39, column: 5
                              nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 40, column: 5
                              currsigs.addElement(nozzleSelect);
                              nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 40, column: 5
                              S6688=0;
                              if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 42, column: 9
                                S6808=0;
                                if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 43, column: 22
                                  S6808=1;
                                  if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 52, column: 22
                                    System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                                    if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 37, column: 3
                                      i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                      S6639=0;
                                      S6601=0;
                                      if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                        S6601=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S6596=0;
                                        if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                          liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                          S6596=1;
                                          if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                            ends[1]=2;
                                            ;//sysj\filler_controller.sysj line: 33, column: 3
                                            System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                            S6639=1;
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
                                      i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                                      S6688=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    thread118104(tdone,ends);
                                    thread118105(tdone,ends);
                                    thread118106(tdone,ends);
                                    int biggest118107 = 0;
                                    if(ends[4]>=biggest118107){
                                      biggest118107=ends[4];
                                    }
                                    if(ends[5]>=biggest118107){
                                      biggest118107=ends[5];
                                    }
                                    if(ends[6]>=biggest118107){
                                      biggest118107=ends[6];
                                    }
                                    if(biggest118107 == 1){
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  thread118108(tdone,ends);
                                  thread118109(tdone,ends);
                                  int biggest118110 = 0;
                                  if(ends[2]>=biggest118110){
                                    biggest118110=ends[2];
                                  }
                                  if(ends[3]>=biggest118110){
                                    biggest118110=ends[3];
                                  }
                                  if(biggest118110 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                                if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 37, column: 3
                                  i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                  S6639=0;
                                  S6601=0;
                                  if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                    S6601=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S6596=0;
                                    if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                      S6596=1;
                                      if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 33, column: 3
                                        System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                        S6639=1;
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
                                  i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                                  S6688=1;
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
                      S6650=1;
                      S6650=0;
                      if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 36, column: 3
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 36, column: 3
                        S6650=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S6645=0;
                        if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 36, column: 3
                          readyFiller_o.setVal(false);//sysj\filler_controller.sysj line: 36, column: 3
                          S6645=1;
                          if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 36, column: 3
                            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 36, column: 3
                            ends[1]=2;
                            ;//sysj\filler_controller.sysj line: 36, column: 3
                            S6639=3;
                            liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 39, column: 5
                            currsigs.addElement(liquidAmount_1);
                            liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 39, column: 5
                            nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 40, column: 5
                            currsigs.addElement(nozzleSelect);
                            nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 40, column: 5
                            S6688=0;
                            if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 42, column: 9
                              S6808=0;
                              if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 43, column: 22
                                S6808=1;
                                if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 52, column: 22
                                  System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                                  if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 37, column: 3
                                    i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                    S6639=0;
                                    S6601=0;
                                    if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                      S6601=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S6596=0;
                                      if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                        S6596=1;
                                        if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                          ends[1]=2;
                                          ;//sysj\filler_controller.sysj line: 33, column: 3
                                          System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                          S6639=1;
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
                                    i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                                    S6688=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  thread118111(tdone,ends);
                                  thread118112(tdone,ends);
                                  thread118113(tdone,ends);
                                  int biggest118114 = 0;
                                  if(ends[4]>=biggest118114){
                                    biggest118114=ends[4];
                                  }
                                  if(ends[5]>=biggest118114){
                                    biggest118114=ends[5];
                                  }
                                  if(ends[6]>=biggest118114){
                                    biggest118114=ends[6];
                                  }
                                  if(biggest118114 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                thread118115(tdone,ends);
                                thread118116(tdone,ends);
                                int biggest118117 = 0;
                                if(ends[2]>=biggest118117){
                                  biggest118117=ends[2];
                                }
                                if(ends[3]>=biggest118117){
                                  biggest118117=ends[3];
                                }
                                if(biggest118117 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                              if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 37, column: 3
                                i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                S6639=0;
                                S6601=0;
                                if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                  S6601=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S6596=0;
                                  if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                    S6596=1;
                                    if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 33, column: 3
                                      System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                      S6639=1;
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
                                i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                                S6688=1;
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
                  switch(S6688){
                    case 0 : 
                      switch(S6808){
                        case 0 : 
                          if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 43, column: 22
                            S6808=1;
                            if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 52, column: 22
                              System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                              if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 37, column: 3
                                i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                S6639=0;
                                S6601=0;
                                if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                  S6601=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S6596=0;
                                  if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                    S6596=1;
                                    if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 33, column: 3
                                      System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                      S6639=1;
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
                                i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                                S6688=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              thread118118(tdone,ends);
                              thread118119(tdone,ends);
                              thread118120(tdone,ends);
                              int biggest118121 = 0;
                              if(ends[4]>=biggest118121){
                                biggest118121=ends[4];
                              }
                              if(ends[5]>=biggest118121){
                                biggest118121=ends[5];
                              }
                              if(ends[6]>=biggest118121){
                                biggest118121=ends[6];
                              }
                              if(biggest118121 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            thread118122(tdone,ends);
                            thread118123(tdone,ends);
                            int biggest118124 = 0;
                            if(ends[2]>=biggest118124){
                              biggest118124=ends[2];
                            }
                            if(ends[3]>=biggest118124){
                              biggest118124=ends[3];
                            }
                            if(biggest118124 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest118124 == 0){
                              S6808=1;
                              if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 52, column: 22
                                System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                                if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 37, column: 3
                                  i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                  S6639=0;
                                  S6601=0;
                                  if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                    S6601=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S6596=0;
                                    if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                      S6596=1;
                                      if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 33, column: 3
                                        System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                        S6639=1;
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
                                  i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                                  S6688=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                thread118125(tdone,ends);
                                thread118126(tdone,ends);
                                thread118127(tdone,ends);
                                int biggest118128 = 0;
                                if(ends[4]>=biggest118128){
                                  biggest118128=ends[4];
                                }
                                if(ends[5]>=biggest118128){
                                  biggest118128=ends[5];
                                }
                                if(ends[6]>=biggest118128){
                                  biggest118128=ends[6];
                                }
                                if(biggest118128 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                          }
                        
                        case 1 : 
                          if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 52, column: 22
                            System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                            if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 37, column: 3
                              i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                              S6639=0;
                              S6601=0;
                              if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                S6601=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S6596=0;
                                if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                  S6596=1;
                                  if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 33, column: 3
                                    System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                    S6639=1;
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
                              i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                              S6688=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            thread118129(tdone,ends);
                            thread118130(tdone,ends);
                            thread118131(tdone,ends);
                            int biggest118132 = 0;
                            if(ends[4]>=biggest118132){
                              biggest118132=ends[4];
                            }
                            if(ends[5]>=biggest118132){
                              biggest118132=ends[5];
                            }
                            if(ends[6]>=biggest118132){
                              biggest118132=ends[6];
                            }
                            if(biggest118132 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest118132 == 0){
                              System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                              if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 37, column: 3
                                i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                S6639=0;
                                S6601=0;
                                if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                  S6601=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S6596=0;
                                  if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                    S6596=1;
                                    if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 33, column: 3
                                      System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                      S6639=1;
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
                                i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                                S6688=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                        
                      }
                      break;
                    
                    case 1 : 
                      S6688=1;
                      liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 39, column: 5
                      currsigs.addElement(liquidAmount_1);
                      liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 39, column: 5
                      nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 40, column: 5
                      currsigs.addElement(nozzleSelect);
                      nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 40, column: 5
                      S6688=0;
                      if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 42, column: 9
                        S6808=0;
                        if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 43, column: 22
                          S6808=1;
                          if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 52, column: 22
                            System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                            if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 37, column: 3
                              i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                              S6639=0;
                              S6601=0;
                              if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                S6601=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S6596=0;
                                if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                  S6596=1;
                                  if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 33, column: 3
                                    System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                    S6639=1;
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
                              i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                              S6688=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            thread118133(tdone,ends);
                            thread118134(tdone,ends);
                            thread118135(tdone,ends);
                            int biggest118136 = 0;
                            if(ends[4]>=biggest118136){
                              biggest118136=ends[4];
                            }
                            if(ends[5]>=biggest118136){
                              biggest118136=ends[5];
                            }
                            if(ends[6]>=biggest118136){
                              biggest118136=ends[6];
                            }
                            if(biggest118136 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          thread118137(tdone,ends);
                          thread118138(tdone,ends);
                          int biggest118139 = 0;
                          if(ends[2]>=biggest118139){
                            biggest118139=ends[2];
                          }
                          if(ends[3]>=biggest118139){
                            biggest118139=ends[3];
                          }
                          if(biggest118139 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                        if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                          ends[1]=2;
                          ;//sysj\filler_controller.sysj line: 37, column: 3
                          i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                          S6639=0;
                          S6601=0;
                          if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                            S6601=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S6596=0;
                            if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                              liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                              S6596=1;
                              if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 33, column: 3
                                System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                S6639=1;
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
                          i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                          S6688=1;
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
