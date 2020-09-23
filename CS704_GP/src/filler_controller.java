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
  private int S118042 = 1;
  private int S118041 = 1;
  private int S6533 = 1;
  private int S6528 = 1;
  private int S6593 = 1;
  private int S6555 = 1;
  private int S6550 = 1;
  private int S6604 = 1;
  private int S6599 = 1;
  private int S6642 = 1;
  private int S6762 = 1;
  private int S6647 = 1;
  private int S6652 = 1;
  private int S6658 = 1;
  private int S6663 = 1;
  private int S6679 = 1;
  private int S6665 = 1;
  
  private int[] ends = new int[7];
  private int[] tdone = new int[7];
  
  public void thread118092(int [] tdone, int [] ends){
        S6652=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread118091(int [] tdone, int [] ends){
        S6647=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 45, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread118089(int [] tdone, int [] ends){
        S6679=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 62, column: 7
    S6665=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 62, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
      currsigs.addElement(done_1);
      S6679=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S6665=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread118088(int [] tdone, int [] ends){
        S6663=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread118087(int [] tdone, int [] ends){
        S6658=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 54, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread118085(int [] tdone, int [] ends){
        switch(S6679){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S6665){
          case 0 : 
            S6665=0;
            if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
              ends[6]=3;
              ;//sysj\filler_controller.sysj line: 62, column: 7
              done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
              currsigs.addElement(done_1);
              S6679=0;
              active[6]=0;
              ends[6]=0;
              tdone[6]=1;
            }
            else {
              S6665=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            S6665=1;
            S6665=0;
            if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
              ends[6]=3;
              ;//sysj\filler_controller.sysj line: 62, column: 7
              done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
              currsigs.addElement(done_1);
              S6679=0;
              active[6]=0;
              ends[6]=0;
              tdone[6]=1;
            }
            else {
              S6665=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread118084(int [] tdone, int [] ends){
        switch(S6663){
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

  public void thread118083(int [] tdone, int [] ends){
        switch(S6658){
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

  public void thread118081(int [] tdone, int [] ends){
        S6679=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 62, column: 7
    S6665=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 62, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
      currsigs.addElement(done_1);
      S6679=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S6665=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread118080(int [] tdone, int [] ends){
        S6663=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread118079(int [] tdone, int [] ends){
        S6658=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 54, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread118077(int [] tdone, int [] ends){
        switch(S6652){
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

  public void thread118076(int [] tdone, int [] ends){
        switch(S6647){
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

  public void thread118074(int [] tdone, int [] ends){
        S6679=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 62, column: 7
    S6665=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 62, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
      currsigs.addElement(done_1);
      S6679=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S6665=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread118073(int [] tdone, int [] ends){
        S6663=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread118072(int [] tdone, int [] ends){
        S6658=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 54, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread118070(int [] tdone, int [] ends){
        S6652=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread118069(int [] tdone, int [] ends){
        S6647=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 45, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread118067(int [] tdone, int [] ends){
        S6679=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 62, column: 7
    S6665=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 62, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
      currsigs.addElement(done_1);
      S6679=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S6665=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread118066(int [] tdone, int [] ends){
        S6663=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread118065(int [] tdone, int [] ends){
        S6658=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 54, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread118063(int [] tdone, int [] ends){
        S6652=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread118062(int [] tdone, int [] ends){
        S6647=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 45, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread118060(int [] tdone, int [] ends){
        S6679=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 62, column: 7
    S6665=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 62, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
      currsigs.addElement(done_1);
      S6679=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S6665=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread118059(int [] tdone, int [] ends){
        S6663=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread118058(int [] tdone, int [] ends){
        S6658=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 54, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread118056(int [] tdone, int [] ends){
        S6652=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread118055(int [] tdone, int [] ends){
        S6647=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 45, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread118053(int [] tdone, int [] ends){
        S6679=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 62, column: 7
    S6665=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 62, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
      currsigs.addElement(done_1);
      S6679=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S6665=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread118052(int [] tdone, int [] ends){
        S6663=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread118051(int [] tdone, int [] ends){
        S6658=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 54, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread118049(int [] tdone, int [] ends){
        S6652=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread118048(int [] tdone, int [] ends){
        S6647=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 45, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread118046(int [] tdone, int [] ends){
        S6679=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 62, column: 7
    S6665=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 62, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
      currsigs.addElement(done_1);
      S6679=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S6665=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread118045(int [] tdone, int [] ends){
        S6663=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread118044(int [] tdone, int [] ends){
        S6658=1;
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
      switch(S118042){
        case 0 : 
          S118042=0;
          break RUN;
        
        case 1 : 
          S118042=2;
          S118042=2;
          done_1.setClear();//sysj\filler_controller.sysj line: 28, column: 2
          liquidAmount_1.setClear();//sysj\filler_controller.sysj line: 29, column: 2
          S118041=0;
          S6533=0;
          if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 30, column: 2
            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
            S6533=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S6528=0;
            if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
              readyFiller_o.setVal(true);//sysj\filler_controller.sysj line: 30, column: 2
              S6528=1;
              if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                ends[1]=2;
                ;//sysj\filler_controller.sysj line: 30, column: 2
                S118041=1;
                i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                S6593=0;
                S6555=0;
                if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                  S6555=1;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S6550=0;
                  if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                    liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                    S6550=1;
                    if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                      ends[1]=2;
                      ;//sysj\filler_controller.sysj line: 33, column: 3
                      System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                      S6593=1;
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
          switch(S118041){
            case 0 : 
              switch(S6533){
                case 0 : 
                  if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 30, column: 2
                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                    S6533=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S6528){
                      case 0 : 
                        if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                          readyFiller_o.setVal(true);//sysj\filler_controller.sysj line: 30, column: 2
                          S6528=1;
                          if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                            ends[1]=2;
                            ;//sysj\filler_controller.sysj line: 30, column: 2
                            S118041=1;
                            i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                            S6593=0;
                            S6555=0;
                            if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                              S6555=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S6550=0;
                              if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                S6550=1;
                                if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 33, column: 3
                                  System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                  S6593=1;
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
                          S118041=1;
                          i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                          S6593=0;
                          S6555=0;
                          if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                            S6555=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S6550=0;
                            if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                              liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                              S6550=1;
                              if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 33, column: 3
                                System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                S6593=1;
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
                  S6533=1;
                  S6533=0;
                  if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 30, column: 2
                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                    S6533=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S6528=0;
                    if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                      readyFiller_o.setVal(true);//sysj\filler_controller.sysj line: 30, column: 2
                      S6528=1;
                      if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                        ends[1]=2;
                        ;//sysj\filler_controller.sysj line: 30, column: 2
                        S118041=1;
                        i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                        S6593=0;
                        S6555=0;
                        if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                          S6555=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S6550=0;
                          if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                            liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                            S6550=1;
                            if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 33, column: 3
                              System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                              S6593=1;
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
              switch(S6593){
                case 0 : 
                  switch(S6555){
                    case 0 : 
                      if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                        S6555=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S6550){
                          case 0 : 
                            if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                              liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                              S6550=1;
                              if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 33, column: 3
                                System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                S6593=1;
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
                              S6593=1;
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
                      S6555=1;
                      S6555=0;
                      if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                        S6555=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S6550=0;
                        if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                          liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                          S6550=1;
                          if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                            ends[1]=2;
                            ;//sysj\filler_controller.sysj line: 33, column: 3
                            System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                            S6593=1;
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
                    S6593=2;
                    S6604=0;
                    if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 36, column: 3
                      readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 36, column: 3
                      S6604=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S6599=0;
                      if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 36, column: 3
                        readyFiller_o.setVal(false);//sysj\filler_controller.sysj line: 36, column: 3
                        S6599=1;
                        if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 36, column: 3
                          readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 36, column: 3
                          ends[1]=2;
                          ;//sysj\filler_controller.sysj line: 36, column: 3
                          S6593=3;
                          liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 39, column: 5
                          currsigs.addElement(liquidAmount_1);
                          liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 39, column: 5
                          nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 40, column: 5
                          currsigs.addElement(nozzleSelect);
                          nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 40, column: 5
                          S6642=0;
                          if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 42, column: 9
                            S6762=0;
                            if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 43, column: 22
                              S6762=1;
                              if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 52, column: 22
                                System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                                if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 37, column: 3
                                  i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                  S6593=0;
                                  S6555=0;
                                  if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                    S6555=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S6550=0;
                                    if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                      S6550=1;
                                      if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 33, column: 3
                                        System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                        S6593=1;
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
                                  S6642=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                thread118044(tdone,ends);
                                thread118045(tdone,ends);
                                thread118046(tdone,ends);
                                int biggest118047 = 0;
                                if(ends[4]>=biggest118047){
                                  biggest118047=ends[4];
                                }
                                if(ends[5]>=biggest118047){
                                  biggest118047=ends[5];
                                }
                                if(ends[6]>=biggest118047){
                                  biggest118047=ends[6];
                                }
                                if(biggest118047 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              thread118048(tdone,ends);
                              thread118049(tdone,ends);
                              int biggest118050 = 0;
                              if(ends[2]>=biggest118050){
                                biggest118050=ends[2];
                              }
                              if(ends[3]>=biggest118050){
                                biggest118050=ends[3];
                              }
                              if(biggest118050 == 1){
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
                              S6593=0;
                              S6555=0;
                              if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                S6555=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S6550=0;
                                if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                  S6550=1;
                                  if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 33, column: 3
                                    System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                    S6593=1;
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
                              S6642=1;
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
                  switch(S6604){
                    case 0 : 
                      if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 36, column: 3
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 36, column: 3
                        S6604=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S6599){
                          case 0 : 
                            if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 36, column: 3
                              readyFiller_o.setVal(false);//sysj\filler_controller.sysj line: 36, column: 3
                              S6599=1;
                              if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 36, column: 3
                                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 36, column: 3
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 36, column: 3
                                S6593=3;
                                liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 39, column: 5
                                currsigs.addElement(liquidAmount_1);
                                liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 39, column: 5
                                nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 40, column: 5
                                currsigs.addElement(nozzleSelect);
                                nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 40, column: 5
                                S6642=0;
                                if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 42, column: 9
                                  S6762=0;
                                  if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 43, column: 22
                                    S6762=1;
                                    if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 52, column: 22
                                      System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                                      if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 37, column: 3
                                        i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                        S6593=0;
                                        S6555=0;
                                        if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                          S6555=1;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          S6550=0;
                                          if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                            liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                            S6550=1;
                                            if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                              ends[1]=2;
                                              ;//sysj\filler_controller.sysj line: 33, column: 3
                                              System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                              S6593=1;
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
                                        S6642=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      thread118051(tdone,ends);
                                      thread118052(tdone,ends);
                                      thread118053(tdone,ends);
                                      int biggest118054 = 0;
                                      if(ends[4]>=biggest118054){
                                        biggest118054=ends[4];
                                      }
                                      if(ends[5]>=biggest118054){
                                        biggest118054=ends[5];
                                      }
                                      if(ends[6]>=biggest118054){
                                        biggest118054=ends[6];
                                      }
                                      if(biggest118054 == 1){
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                  else {
                                    thread118055(tdone,ends);
                                    thread118056(tdone,ends);
                                    int biggest118057 = 0;
                                    if(ends[2]>=biggest118057){
                                      biggest118057=ends[2];
                                    }
                                    if(ends[3]>=biggest118057){
                                      biggest118057=ends[3];
                                    }
                                    if(biggest118057 == 1){
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
                                    S6593=0;
                                    S6555=0;
                                    if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                      S6555=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S6550=0;
                                      if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                        S6550=1;
                                        if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                          ends[1]=2;
                                          ;//sysj\filler_controller.sysj line: 33, column: 3
                                          System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                          S6593=1;
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
                                    S6642=1;
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
                              S6593=3;
                              liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 39, column: 5
                              currsigs.addElement(liquidAmount_1);
                              liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 39, column: 5
                              nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 40, column: 5
                              currsigs.addElement(nozzleSelect);
                              nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 40, column: 5
                              S6642=0;
                              if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 42, column: 9
                                S6762=0;
                                if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 43, column: 22
                                  S6762=1;
                                  if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 52, column: 22
                                    System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                                    if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 37, column: 3
                                      i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                      S6593=0;
                                      S6555=0;
                                      if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                        S6555=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S6550=0;
                                        if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                          liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                          S6550=1;
                                          if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                            ends[1]=2;
                                            ;//sysj\filler_controller.sysj line: 33, column: 3
                                            System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                            S6593=1;
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
                                      S6642=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    thread118058(tdone,ends);
                                    thread118059(tdone,ends);
                                    thread118060(tdone,ends);
                                    int biggest118061 = 0;
                                    if(ends[4]>=biggest118061){
                                      biggest118061=ends[4];
                                    }
                                    if(ends[5]>=biggest118061){
                                      biggest118061=ends[5];
                                    }
                                    if(ends[6]>=biggest118061){
                                      biggest118061=ends[6];
                                    }
                                    if(biggest118061 == 1){
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  thread118062(tdone,ends);
                                  thread118063(tdone,ends);
                                  int biggest118064 = 0;
                                  if(ends[2]>=biggest118064){
                                    biggest118064=ends[2];
                                  }
                                  if(ends[3]>=biggest118064){
                                    biggest118064=ends[3];
                                  }
                                  if(biggest118064 == 1){
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
                                  S6593=0;
                                  S6555=0;
                                  if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                    S6555=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S6550=0;
                                    if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                      S6550=1;
                                      if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 33, column: 3
                                        System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                        S6593=1;
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
                                  S6642=1;
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
                      S6604=1;
                      S6604=0;
                      if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 36, column: 3
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 36, column: 3
                        S6604=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S6599=0;
                        if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 36, column: 3
                          readyFiller_o.setVal(false);//sysj\filler_controller.sysj line: 36, column: 3
                          S6599=1;
                          if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 36, column: 3
                            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 36, column: 3
                            ends[1]=2;
                            ;//sysj\filler_controller.sysj line: 36, column: 3
                            S6593=3;
                            liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 39, column: 5
                            currsigs.addElement(liquidAmount_1);
                            liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 39, column: 5
                            nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 40, column: 5
                            currsigs.addElement(nozzleSelect);
                            nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 40, column: 5
                            S6642=0;
                            if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 42, column: 9
                              S6762=0;
                              if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 43, column: 22
                                S6762=1;
                                if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 52, column: 22
                                  System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                                  if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 37, column: 3
                                    i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                    S6593=0;
                                    S6555=0;
                                    if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                      S6555=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S6550=0;
                                      if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                        S6550=1;
                                        if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                          ends[1]=2;
                                          ;//sysj\filler_controller.sysj line: 33, column: 3
                                          System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                          S6593=1;
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
                                    S6642=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  thread118065(tdone,ends);
                                  thread118066(tdone,ends);
                                  thread118067(tdone,ends);
                                  int biggest118068 = 0;
                                  if(ends[4]>=biggest118068){
                                    biggest118068=ends[4];
                                  }
                                  if(ends[5]>=biggest118068){
                                    biggest118068=ends[5];
                                  }
                                  if(ends[6]>=biggest118068){
                                    biggest118068=ends[6];
                                  }
                                  if(biggest118068 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                thread118069(tdone,ends);
                                thread118070(tdone,ends);
                                int biggest118071 = 0;
                                if(ends[2]>=biggest118071){
                                  biggest118071=ends[2];
                                }
                                if(ends[3]>=biggest118071){
                                  biggest118071=ends[3];
                                }
                                if(biggest118071 == 1){
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
                                S6593=0;
                                S6555=0;
                                if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                  S6555=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S6550=0;
                                  if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                    S6550=1;
                                    if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 33, column: 3
                                      System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                      S6593=1;
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
                                S6642=1;
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
                  switch(S6642){
                    case 0 : 
                      switch(S6762){
                        case 0 : 
                          if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 43, column: 22
                            S6762=1;
                            if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 52, column: 22
                              System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                              if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 37, column: 3
                                i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                S6593=0;
                                S6555=0;
                                if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                  S6555=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S6550=0;
                                  if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                    S6550=1;
                                    if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 33, column: 3
                                      System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                      S6593=1;
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
                                S6642=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              thread118072(tdone,ends);
                              thread118073(tdone,ends);
                              thread118074(tdone,ends);
                              int biggest118075 = 0;
                              if(ends[4]>=biggest118075){
                                biggest118075=ends[4];
                              }
                              if(ends[5]>=biggest118075){
                                biggest118075=ends[5];
                              }
                              if(ends[6]>=biggest118075){
                                biggest118075=ends[6];
                              }
                              if(biggest118075 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            thread118076(tdone,ends);
                            thread118077(tdone,ends);
                            int biggest118078 = 0;
                            if(ends[2]>=biggest118078){
                              biggest118078=ends[2];
                            }
                            if(ends[3]>=biggest118078){
                              biggest118078=ends[3];
                            }
                            if(biggest118078 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest118078 == 0){
                              S6762=1;
                              if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 52, column: 22
                                System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                                if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 37, column: 3
                                  i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                  S6593=0;
                                  S6555=0;
                                  if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                    S6555=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S6550=0;
                                    if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                      S6550=1;
                                      if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 33, column: 3
                                        System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                        S6593=1;
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
                                  S6642=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                thread118079(tdone,ends);
                                thread118080(tdone,ends);
                                thread118081(tdone,ends);
                                int biggest118082 = 0;
                                if(ends[4]>=biggest118082){
                                  biggest118082=ends[4];
                                }
                                if(ends[5]>=biggest118082){
                                  biggest118082=ends[5];
                                }
                                if(ends[6]>=biggest118082){
                                  biggest118082=ends[6];
                                }
                                if(biggest118082 == 1){
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
                              S6593=0;
                              S6555=0;
                              if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                S6555=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S6550=0;
                                if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                  S6550=1;
                                  if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 33, column: 3
                                    System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                    S6593=1;
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
                              S6642=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            thread118083(tdone,ends);
                            thread118084(tdone,ends);
                            thread118085(tdone,ends);
                            int biggest118086 = 0;
                            if(ends[4]>=biggest118086){
                              biggest118086=ends[4];
                            }
                            if(ends[5]>=biggest118086){
                              biggest118086=ends[5];
                            }
                            if(ends[6]>=biggest118086){
                              biggest118086=ends[6];
                            }
                            if(biggest118086 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest118086 == 0){
                              System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                              if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 37, column: 3
                                i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                S6593=0;
                                S6555=0;
                                if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                  S6555=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S6550=0;
                                  if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                    S6550=1;
                                    if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 33, column: 3
                                      System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                      S6593=1;
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
                                S6642=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                        
                      }
                      break;
                    
                    case 1 : 
                      S6642=1;
                      liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 39, column: 5
                      currsigs.addElement(liquidAmount_1);
                      liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 39, column: 5
                      nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 40, column: 5
                      currsigs.addElement(nozzleSelect);
                      nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 40, column: 5
                      S6642=0;
                      if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 42, column: 9
                        S6762=0;
                        if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 43, column: 22
                          S6762=1;
                          if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 52, column: 22
                            System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                            if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 37, column: 3
                              i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                              S6593=0;
                              S6555=0;
                              if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                S6555=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S6550=0;
                                if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                  S6550=1;
                                  if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 33, column: 3
                                    System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                    S6593=1;
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
                              S6642=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            thread118087(tdone,ends);
                            thread118088(tdone,ends);
                            thread118089(tdone,ends);
                            int biggest118090 = 0;
                            if(ends[4]>=biggest118090){
                              biggest118090=ends[4];
                            }
                            if(ends[5]>=biggest118090){
                              biggest118090=ends[5];
                            }
                            if(ends[6]>=biggest118090){
                              biggest118090=ends[6];
                            }
                            if(biggest118090 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          thread118091(tdone,ends);
                          thread118092(tdone,ends);
                          int biggest118093 = 0;
                          if(ends[2]>=biggest118093){
                            biggest118093=ends[2];
                          }
                          if(ends[3]>=biggest118093){
                            biggest118093=ends[3];
                          }
                          if(biggest118093 == 1){
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
                          S6593=0;
                          S6555=0;
                          if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                            S6555=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S6550=0;
                            if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                              liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                              S6550=1;
                              if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 33, column: 3
                                System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
                                S6593=1;
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
                          S6642=1;
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
