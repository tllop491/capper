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
  private long __start_thread_6;//sysj\filler_controller.sysj line: 67, column: 7
  private int i_thread_1;//sysj\filler_controller.sysj line: 34, column: 3
  private int S148039 = 1;
  private int S148038 = 1;
  private int S4010 = 1;
  private int S4005 = 1;
  private int S4070 = 1;
  private int S4032 = 1;
  private int S4027 = 1;
  private int S4081 = 1;
  private int S4076 = 1;
  private int S4119 = 1;
  private int S4131 = 1;
  private int S4124 = 1;
  private int S4129 = 1;
  private int S4136 = 1;
  private int S4141 = 1;
  private int S4157 = 1;
  private int S4156 = 1;
  private int S4143 = 1;
  private int S7129 = 1;
  private int S7124 = 1;
  
  private int[] ends = new int[7];
  private int[] tdone = new int[7];
  
  public void thread148089(int [] tdone, int [] ends){
        S4129=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 53, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread148088(int [] tdone, int [] ends){
        S4124=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread148086(int [] tdone, int [] ends){
        S4157=1;
    S4156=0;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 67, column: 7
    S4143=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 67, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 67, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 69, column: 8
      currsigs.addElement(done_1);
      S4156=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S4143=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread148085(int [] tdone, int [] ends){
        S4141=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread148084(int [] tdone, int [] ends){
        S4136=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread148082(int [] tdone, int [] ends){
        switch(S4157){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S4156){
          case 0 : 
            switch(S4143){
              case 0 : 
                S4143=0;
                if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 67, column: 7
                  ends[6]=3;
                  ;//sysj\filler_controller.sysj line: 67, column: 7
                  done_1.setPresent();//sysj\filler_controller.sysj line: 69, column: 8
                  currsigs.addElement(done_1);
                  S4156=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S4143=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                break;
              
              case 1 : 
                S4143=1;
                S4143=0;
                if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 67, column: 7
                  ends[6]=3;
                  ;//sysj\filler_controller.sysj line: 67, column: 7
                  done_1.setPresent();//sysj\filler_controller.sysj line: 69, column: 8
                  currsigs.addElement(done_1);
                  S4156=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                else {
                  S4143=1;
                  active[6]=1;
                  ends[6]=1;
                  tdone[6]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S4156=1;
            S4157=0;
            active[6]=0;
            ends[6]=0;
            tdone[6]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread148081(int [] tdone, int [] ends){
        switch(S4141){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
        currsigs.addElement(dosUnitValveExtend);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread148080(int [] tdone, int [] ends){
        switch(S4136){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
        currsigs.addElement(valveInletOnOff);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread148078(int [] tdone, int [] ends){
        S4157=1;
    S4156=0;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 67, column: 7
    S4143=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 67, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 67, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 69, column: 8
      currsigs.addElement(done_1);
      S4156=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S4143=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread148077(int [] tdone, int [] ends){
        S4141=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread148076(int [] tdone, int [] ends){
        S4136=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread148074(int [] tdone, int [] ends){
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

  public void thread148073(int [] tdone, int [] ends){
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

  public void thread148071(int [] tdone, int [] ends){
        S4157=1;
    S4156=0;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 67, column: 7
    S4143=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 67, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 67, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 69, column: 8
      currsigs.addElement(done_1);
      S4156=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S4143=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread148070(int [] tdone, int [] ends){
        S4141=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread148069(int [] tdone, int [] ends){
        S4136=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread148067(int [] tdone, int [] ends){
        S4129=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 53, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread148066(int [] tdone, int [] ends){
        S4124=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread148064(int [] tdone, int [] ends){
        S4157=1;
    S4156=0;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 67, column: 7
    S4143=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 67, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 67, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 69, column: 8
      currsigs.addElement(done_1);
      S4156=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S4143=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread148063(int [] tdone, int [] ends){
        S4141=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread148062(int [] tdone, int [] ends){
        S4136=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread148060(int [] tdone, int [] ends){
        S4129=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 53, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread148059(int [] tdone, int [] ends){
        S4124=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread148057(int [] tdone, int [] ends){
        S4157=1;
    S4156=0;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 67, column: 7
    S4143=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 67, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 67, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 69, column: 8
      currsigs.addElement(done_1);
      S4156=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S4143=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread148056(int [] tdone, int [] ends){
        S4141=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread148055(int [] tdone, int [] ends){
        S4136=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread148053(int [] tdone, int [] ends){
        S4129=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 53, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread148052(int [] tdone, int [] ends){
        S4124=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread148050(int [] tdone, int [] ends){
        S4157=1;
    S4156=0;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 67, column: 7
    S4143=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 67, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 67, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 69, column: 8
      currsigs.addElement(done_1);
      S4156=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S4143=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread148049(int [] tdone, int [] ends){
        S4141=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread148048(int [] tdone, int [] ends){
        S4136=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread148046(int [] tdone, int [] ends){
        S4129=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 53, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread148045(int [] tdone, int [] ends){
        S4124=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread148043(int [] tdone, int [] ends){
        S4157=1;
    S4156=0;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 67, column: 7
    S4143=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 67, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 67, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 69, column: 8
      currsigs.addElement(done_1);
      S4156=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      S4143=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread148042(int [] tdone, int [] ends){
        S4141=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread148041(int [] tdone, int [] ends){
        S4136=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
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
      switch(S148039){
        case 0 : 
          S148039=0;
          break RUN;
        
        case 1 : 
          S148039=2;
          S148039=2;
          done_1.setClear();//sysj\filler_controller.sysj line: 28, column: 2
          liquidAmount_1.setClear();//sysj\filler_controller.sysj line: 29, column: 2
          S148038=0;
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
                S148038=1;
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
          switch(S148038){
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
                            S148038=1;
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
                          S148038=1;
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
                        S148038=1;
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
                          liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 43, column: 5
                          currsigs.addElement(liquidAmount_1);
                          liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 43, column: 5
                          nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 44, column: 5
                          currsigs.addElement(nozzleSelect);
                          nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 44, column: 5
                          S4119=0;
                          if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 46, column: 9
                            S4131=0;
                            if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 47, column: 22
                              System.out.println("TURN OFF VALVE INJECTOR");//sysj\filler_controller.sysj line: 56, column: 6
                              S4131=1;
                              if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 57, column: 22
                                System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 75, column: 5
                                if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 76, column: 9
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 41, column: 3
                                  S4070=4;
                                  S7129=0;
                                  if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 84, column: 5
                                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                    S7129=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S7124=0;
                                    if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                      readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 84, column: 5
                                      S7124=1;
                                      if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 84, column: 5
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
                                  i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 79, column: 6
                                  S4119=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                thread148041(tdone,ends);
                                thread148042(tdone,ends);
                                thread148043(tdone,ends);
                                int biggest148044 = 0;
                                if(ends[4]>=biggest148044){
                                  biggest148044=ends[4];
                                }
                                if(ends[5]>=biggest148044){
                                  biggest148044=ends[5];
                                }
                                if(ends[6]>=biggest148044){
                                  biggest148044=ends[6];
                                }
                                if(biggest148044 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              thread148045(tdone,ends);
                              thread148046(tdone,ends);
                              int biggest148047 = 0;
                              if(ends[2]>=biggest148047){
                                biggest148047=ends[2];
                              }
                              if(ends[3]>=biggest148047){
                                biggest148047=ends[3];
                              }
                              if(biggest148047 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 75, column: 5
                            if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 76, column: 9
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 41, column: 3
                              S4070=4;
                              S7129=0;
                              if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 84, column: 5
                                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                S7129=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S7124=0;
                                if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                  readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 84, column: 5
                                  S7124=1;
                                  if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 84, column: 5
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
                              i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 79, column: 6
                              S4119=1;
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
                                liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 43, column: 5
                                currsigs.addElement(liquidAmount_1);
                                liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 43, column: 5
                                nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 44, column: 5
                                currsigs.addElement(nozzleSelect);
                                nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 44, column: 5
                                S4119=0;
                                if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 46, column: 9
                                  S4131=0;
                                  if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 47, column: 22
                                    System.out.println("TURN OFF VALVE INJECTOR");//sysj\filler_controller.sysj line: 56, column: 6
                                    S4131=1;
                                    if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 57, column: 22
                                      System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 75, column: 5
                                      if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 76, column: 9
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 41, column: 3
                                        S4070=4;
                                        S7129=0;
                                        if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 84, column: 5
                                          readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                          S7129=1;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          S7124=0;
                                          if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                            readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 84, column: 5
                                            S7124=1;
                                            if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                              readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                              ends[1]=2;
                                              ;//sysj\filler_controller.sysj line: 84, column: 5
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
                                        i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 79, column: 6
                                        S4119=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      thread148048(tdone,ends);
                                      thread148049(tdone,ends);
                                      thread148050(tdone,ends);
                                      int biggest148051 = 0;
                                      if(ends[4]>=biggest148051){
                                        biggest148051=ends[4];
                                      }
                                      if(ends[5]>=biggest148051){
                                        biggest148051=ends[5];
                                      }
                                      if(ends[6]>=biggest148051){
                                        biggest148051=ends[6];
                                      }
                                      if(biggest148051 == 1){
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                  else {
                                    thread148052(tdone,ends);
                                    thread148053(tdone,ends);
                                    int biggest148054 = 0;
                                    if(ends[2]>=biggest148054){
                                      biggest148054=ends[2];
                                    }
                                    if(ends[3]>=biggest148054){
                                      biggest148054=ends[3];
                                    }
                                    if(biggest148054 == 1){
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 75, column: 5
                                  if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 76, column: 9
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 41, column: 3
                                    S4070=4;
                                    S7129=0;
                                    if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 84, column: 5
                                      readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                      S7129=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S7124=0;
                                      if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                        readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 84, column: 5
                                        S7124=1;
                                        if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                          readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                          ends[1]=2;
                                          ;//sysj\filler_controller.sysj line: 84, column: 5
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
                                    i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 79, column: 6
                                    S4119=1;
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
                              liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 43, column: 5
                              currsigs.addElement(liquidAmount_1);
                              liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 43, column: 5
                              nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 44, column: 5
                              currsigs.addElement(nozzleSelect);
                              nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 44, column: 5
                              S4119=0;
                              if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 46, column: 9
                                S4131=0;
                                if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 47, column: 22
                                  System.out.println("TURN OFF VALVE INJECTOR");//sysj\filler_controller.sysj line: 56, column: 6
                                  S4131=1;
                                  if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 57, column: 22
                                    System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 75, column: 5
                                    if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 76, column: 9
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 41, column: 3
                                      S4070=4;
                                      S7129=0;
                                      if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 84, column: 5
                                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                        S7129=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S7124=0;
                                        if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                          readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 84, column: 5
                                          S7124=1;
                                          if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                            ends[1]=2;
                                            ;//sysj\filler_controller.sysj line: 84, column: 5
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
                                      i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 79, column: 6
                                      S4119=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    thread148055(tdone,ends);
                                    thread148056(tdone,ends);
                                    thread148057(tdone,ends);
                                    int biggest148058 = 0;
                                    if(ends[4]>=biggest148058){
                                      biggest148058=ends[4];
                                    }
                                    if(ends[5]>=biggest148058){
                                      biggest148058=ends[5];
                                    }
                                    if(ends[6]>=biggest148058){
                                      biggest148058=ends[6];
                                    }
                                    if(biggest148058 == 1){
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  thread148059(tdone,ends);
                                  thread148060(tdone,ends);
                                  int biggest148061 = 0;
                                  if(ends[2]>=biggest148061){
                                    biggest148061=ends[2];
                                  }
                                  if(ends[3]>=biggest148061){
                                    biggest148061=ends[3];
                                  }
                                  if(biggest148061 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 75, column: 5
                                if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 76, column: 9
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 41, column: 3
                                  S4070=4;
                                  S7129=0;
                                  if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 84, column: 5
                                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                    S7129=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S7124=0;
                                    if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                      readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 84, column: 5
                                      S7124=1;
                                      if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 84, column: 5
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
                                  i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 79, column: 6
                                  S4119=1;
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
                            liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 43, column: 5
                            currsigs.addElement(liquidAmount_1);
                            liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 43, column: 5
                            nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 44, column: 5
                            currsigs.addElement(nozzleSelect);
                            nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 44, column: 5
                            S4119=0;
                            if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 46, column: 9
                              S4131=0;
                              if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 47, column: 22
                                System.out.println("TURN OFF VALVE INJECTOR");//sysj\filler_controller.sysj line: 56, column: 6
                                S4131=1;
                                if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 57, column: 22
                                  System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 75, column: 5
                                  if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 76, column: 9
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 41, column: 3
                                    S4070=4;
                                    S7129=0;
                                    if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 84, column: 5
                                      readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                      S7129=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S7124=0;
                                      if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                        readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 84, column: 5
                                        S7124=1;
                                        if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                          readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                          ends[1]=2;
                                          ;//sysj\filler_controller.sysj line: 84, column: 5
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
                                    i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 79, column: 6
                                    S4119=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  thread148062(tdone,ends);
                                  thread148063(tdone,ends);
                                  thread148064(tdone,ends);
                                  int biggest148065 = 0;
                                  if(ends[4]>=biggest148065){
                                    biggest148065=ends[4];
                                  }
                                  if(ends[5]>=biggest148065){
                                    biggest148065=ends[5];
                                  }
                                  if(ends[6]>=biggest148065){
                                    biggest148065=ends[6];
                                  }
                                  if(biggest148065 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                thread148066(tdone,ends);
                                thread148067(tdone,ends);
                                int biggest148068 = 0;
                                if(ends[2]>=biggest148068){
                                  biggest148068=ends[2];
                                }
                                if(ends[3]>=biggest148068){
                                  biggest148068=ends[3];
                                }
                                if(biggest148068 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 75, column: 5
                              if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 76, column: 9
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 41, column: 3
                                S4070=4;
                                S7129=0;
                                if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 84, column: 5
                                  readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                  S7129=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S7124=0;
                                  if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                    readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 84, column: 5
                                    S7124=1;
                                    if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                      readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 84, column: 5
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
                                i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 79, column: 6
                                S4119=1;
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
                  switch(S4119){
                    case 0 : 
                      switch(S4131){
                        case 0 : 
                          if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 47, column: 22
                            System.out.println("TURN OFF VALVE INJECTOR");//sysj\filler_controller.sysj line: 56, column: 6
                            S4131=1;
                            if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 57, column: 22
                              System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 75, column: 5
                              if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 76, column: 9
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 41, column: 3
                                S4070=4;
                                S7129=0;
                                if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 84, column: 5
                                  readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                  S7129=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S7124=0;
                                  if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                    readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 84, column: 5
                                    S7124=1;
                                    if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                      readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 84, column: 5
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
                                i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 79, column: 6
                                S4119=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              thread148069(tdone,ends);
                              thread148070(tdone,ends);
                              thread148071(tdone,ends);
                              int biggest148072 = 0;
                              if(ends[4]>=biggest148072){
                                biggest148072=ends[4];
                              }
                              if(ends[5]>=biggest148072){
                                biggest148072=ends[5];
                              }
                              if(ends[6]>=biggest148072){
                                biggest148072=ends[6];
                              }
                              if(biggest148072 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            thread148073(tdone,ends);
                            thread148074(tdone,ends);
                            int biggest148075 = 0;
                            if(ends[2]>=biggest148075){
                              biggest148075=ends[2];
                            }
                            if(ends[3]>=biggest148075){
                              biggest148075=ends[3];
                            }
                            if(biggest148075 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest148075 == 0){
                              System.out.println("TURN OFF VALVE INJECTOR");//sysj\filler_controller.sysj line: 56, column: 6
                              S4131=1;
                              if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 57, column: 22
                                System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 75, column: 5
                                if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 76, column: 9
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 41, column: 3
                                  S4070=4;
                                  S7129=0;
                                  if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 84, column: 5
                                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                    S7129=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S7124=0;
                                    if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                      readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 84, column: 5
                                      S7124=1;
                                      if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 84, column: 5
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
                                  i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 79, column: 6
                                  S4119=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                thread148076(tdone,ends);
                                thread148077(tdone,ends);
                                thread148078(tdone,ends);
                                int biggest148079 = 0;
                                if(ends[4]>=biggest148079){
                                  biggest148079=ends[4];
                                }
                                if(ends[5]>=biggest148079){
                                  biggest148079=ends[5];
                                }
                                if(ends[6]>=biggest148079){
                                  biggest148079=ends[6];
                                }
                                if(biggest148079 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                          }
                        
                        case 1 : 
                          if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 57, column: 22
                            System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 75, column: 5
                            if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 76, column: 9
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 41, column: 3
                              S4070=4;
                              S7129=0;
                              if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 84, column: 5
                                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                S7129=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S7124=0;
                                if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                  readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 84, column: 5
                                  S7124=1;
                                  if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 84, column: 5
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
                              i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 79, column: 6
                              S4119=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            thread148080(tdone,ends);
                            thread148081(tdone,ends);
                            thread148082(tdone,ends);
                            int biggest148083 = 0;
                            if(ends[4]>=biggest148083){
                              biggest148083=ends[4];
                            }
                            if(ends[5]>=biggest148083){
                              biggest148083=ends[5];
                            }
                            if(ends[6]>=biggest148083){
                              biggest148083=ends[6];
                            }
                            if(biggest148083 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest148083 == 0){
                              System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 75, column: 5
                              if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 76, column: 9
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 41, column: 3
                                S4070=4;
                                S7129=0;
                                if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 84, column: 5
                                  readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                  S7129=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S7124=0;
                                  if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                    readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 84, column: 5
                                    S7124=1;
                                    if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                      readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 84, column: 5
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
                                i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 79, column: 6
                                S4119=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                        
                      }
                      break;
                    
                    case 1 : 
                      S4119=1;
                      liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 43, column: 5
                      currsigs.addElement(liquidAmount_1);
                      liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 43, column: 5
                      nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 44, column: 5
                      currsigs.addElement(nozzleSelect);
                      nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 44, column: 5
                      S4119=0;
                      if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 46, column: 9
                        S4131=0;
                        if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 47, column: 22
                          System.out.println("TURN OFF VALVE INJECTOR");//sysj\filler_controller.sysj line: 56, column: 6
                          S4131=1;
                          if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 57, column: 22
                            System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 75, column: 5
                            if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 76, column: 9
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 41, column: 3
                              S4070=4;
                              S7129=0;
                              if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 84, column: 5
                                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                S7129=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S7124=0;
                                if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                  readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 84, column: 5
                                  S7124=1;
                                  if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 84, column: 5
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
                              i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 79, column: 6
                              S4119=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            thread148084(tdone,ends);
                            thread148085(tdone,ends);
                            thread148086(tdone,ends);
                            int biggest148087 = 0;
                            if(ends[4]>=biggest148087){
                              biggest148087=ends[4];
                            }
                            if(ends[5]>=biggest148087){
                              biggest148087=ends[5];
                            }
                            if(ends[6]>=biggest148087){
                              biggest148087=ends[6];
                            }
                            if(biggest148087 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          thread148088(tdone,ends);
                          thread148089(tdone,ends);
                          int biggest148090 = 0;
                          if(ends[2]>=biggest148090){
                            biggest148090=ends[2];
                          }
                          if(ends[3]>=biggest148090){
                            biggest148090=ends[3];
                          }
                          if(biggest148090 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 75, column: 5
                        if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 76, column: 9
                          ends[1]=2;
                          ;//sysj\filler_controller.sysj line: 41, column: 3
                          S4070=4;
                          S7129=0;
                          if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 84, column: 5
                            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                            S7129=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S7124=0;
                            if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                              readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 84, column: 5
                              S7124=1;
                              if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 84, column: 5
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
                          i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 79, column: 6
                          S4119=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    
                  }
                  break;
                
                case 4 : 
                  switch(S7129){
                    case 0 : 
                      if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 84, column: 5
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                        S7129=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S7124){
                          case 0 : 
                            if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                              readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 84, column: 5
                              S7124=1;
                              if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 84, column: 5
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
                            if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                              readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 84, column: 5
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
                      S7129=1;
                      S7129=0;
                      if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 84, column: 5
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                        S7129=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S7124=0;
                        if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                          readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 84, column: 5
                          S7124=1;
                          if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 84, column: 5
                            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 84, column: 5
                            ends[1]=2;
                            ;//sysj\filler_controller.sysj line: 84, column: 5
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
