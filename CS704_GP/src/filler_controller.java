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
  private int i_thread_1;//sysj\filler_controller.sysj line: 32, column: 3
  private int S148094 = 1;
  private int S148093 = 1;
  private int S4065 = 1;
  private int S4060 = 1;
  private int S4125 = 1;
  private int S4087 = 1;
  private int S4082 = 1;
  private int S4136 = 1;
  private int S4131 = 1;
  private int S4174 = 1;
  private int S4186 = 1;
  private int S4179 = 1;
  private int S4184 = 1;
  private int S4191 = 1;
  private int S4196 = 1;
  private int S4212 = 1;
  private int S4198 = 1;
  private int S7184 = 1;
  private int S7179 = 1;
  
  private int[] ends = new int[7];
  private int[] tdone = new int[7];
  
  public void thread148144(int [] tdone, int [] ends){
        S4184=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 51, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread148143(int [] tdone, int [] ends){
        S4179=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 47, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread148141(int [] tdone, int [] ends){
        S4212=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 65, column: 7
    S4198=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 65, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 65, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 67, column: 8
      currsigs.addElement(done_1);
      S4212=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S4198=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread148140(int [] tdone, int [] ends){
        S4196=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 62, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread148139(int [] tdone, int [] ends){
        S4191=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 57, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread148137(int [] tdone, int [] ends){
        switch(S4212){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S4198){
          case 0 : 
            S4198=0;
            if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 65, column: 7
              ends[6]=3;
              ;//sysj\filler_controller.sysj line: 65, column: 7
              done_1.setPresent();//sysj\filler_controller.sysj line: 67, column: 8
              currsigs.addElement(done_1);
              S4212=0;
              active[6]=0;
              ends[6]=0;
              tdone[6]=1;
            }
            else {
              S4198=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            S4198=1;
            S4198=0;
            if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 65, column: 7
              ends[6]=3;
              ;//sysj\filler_controller.sysj line: 65, column: 7
              done_1.setPresent();//sysj\filler_controller.sysj line: 67, column: 8
              currsigs.addElement(done_1);
              S4212=0;
              active[6]=0;
              ends[6]=0;
              tdone[6]=1;
            }
            else {
              S4198=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread148136(int [] tdone, int [] ends){
        switch(S4196){
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

  public void thread148135(int [] tdone, int [] ends){
        switch(S4191){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 57, column: 8
        currsigs.addElement(valveInletOnOff);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread148133(int [] tdone, int [] ends){
        S4212=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 65, column: 7
    S4198=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 65, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 65, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 67, column: 8
      currsigs.addElement(done_1);
      S4212=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S4198=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread148132(int [] tdone, int [] ends){
        S4196=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 62, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread148131(int [] tdone, int [] ends){
        S4191=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 57, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread148129(int [] tdone, int [] ends){
        switch(S4184){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 51, column: 8
        currsigs.addElement(dosUnitValveRetract);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread148128(int [] tdone, int [] ends){
        switch(S4179){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 47, column: 8
        currsigs.addElement(valveInjectorOnOff);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread148126(int [] tdone, int [] ends){
        S4212=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 65, column: 7
    S4198=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 65, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 65, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 67, column: 8
      currsigs.addElement(done_1);
      S4212=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S4198=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread148125(int [] tdone, int [] ends){
        S4196=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 62, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread148124(int [] tdone, int [] ends){
        S4191=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 57, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread148122(int [] tdone, int [] ends){
        S4184=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 51, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread148121(int [] tdone, int [] ends){
        S4179=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 47, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread148119(int [] tdone, int [] ends){
        S4212=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 65, column: 7
    S4198=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 65, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 65, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 67, column: 8
      currsigs.addElement(done_1);
      S4212=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S4198=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread148118(int [] tdone, int [] ends){
        S4196=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 62, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread148117(int [] tdone, int [] ends){
        S4191=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 57, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread148115(int [] tdone, int [] ends){
        S4184=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 51, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread148114(int [] tdone, int [] ends){
        S4179=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 47, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread148112(int [] tdone, int [] ends){
        S4212=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 65, column: 7
    S4198=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 65, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 65, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 67, column: 8
      currsigs.addElement(done_1);
      S4212=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S4198=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread148111(int [] tdone, int [] ends){
        S4196=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 62, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread148110(int [] tdone, int [] ends){
        S4191=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 57, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread148108(int [] tdone, int [] ends){
        S4184=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 51, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread148107(int [] tdone, int [] ends){
        S4179=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 47, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread148105(int [] tdone, int [] ends){
        S4212=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 65, column: 7
    S4198=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 65, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 65, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 67, column: 8
      currsigs.addElement(done_1);
      S4212=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S4198=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread148104(int [] tdone, int [] ends){
        S4196=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 62, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread148103(int [] tdone, int [] ends){
        S4191=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 57, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread148101(int [] tdone, int [] ends){
        S4184=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 51, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread148100(int [] tdone, int [] ends){
        S4179=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 47, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread148098(int [] tdone, int [] ends){
        S4212=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 65, column: 7
    S4198=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 65, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 65, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 67, column: 8
      currsigs.addElement(done_1);
      S4212=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S4198=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread148097(int [] tdone, int [] ends){
        S4196=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 62, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread148096(int [] tdone, int [] ends){
        S4191=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 57, column: 8
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
      switch(S148094){
        case 0 : 
          S148094=0;
          break RUN;
        
        case 1 : 
          S148094=2;
          S148094=2;
          done_1.setClear();//sysj\filler_controller.sysj line: 28, column: 2
          liquidAmount_1.setClear();//sysj\filler_controller.sysj line: 29, column: 2
          S148093=0;
          S4065=0;
          if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 30, column: 2
            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
            S4065=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S4060=0;
            if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
              readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 30, column: 2
              S4060=1;
              if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                ends[1]=2;
                ;//sysj\filler_controller.sysj line: 30, column: 2
                S148093=1;
                i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                S4125=0;
                S4087=0;
                if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                  S4087=1;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S4082=0;
                  if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                    liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                    S4082=1;
                    if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                      ends[1]=2;
                      ;//sysj\filler_controller.sysj line: 33, column: 3
                      System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                      S4125=1;
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
          switch(S148093){
            case 0 : 
              switch(S4065){
                case 0 : 
                  if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 30, column: 2
                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                    S4065=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S4060){
                      case 0 : 
                        if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                          readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 30, column: 2
                          S4060=1;
                          if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                            ends[1]=2;
                            ;//sysj\filler_controller.sysj line: 30, column: 2
                            S148093=1;
                            i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                            S4125=0;
                            S4087=0;
                            if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                              S4087=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S4082=0;
                              if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                S4082=1;
                                if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 33, column: 3
                                  System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                                  S4125=1;
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
                          S148093=1;
                          i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                          S4125=0;
                          S4087=0;
                          if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                            S4087=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S4082=0;
                            if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                              liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                              S4082=1;
                              if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 33, column: 3
                                System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                                S4125=1;
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
                  S4065=1;
                  S4065=0;
                  if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 30, column: 2
                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                    S4065=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S4060=0;
                    if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                      readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 30, column: 2
                      S4060=1;
                      if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                        ends[1]=2;
                        ;//sysj\filler_controller.sysj line: 30, column: 2
                        S148093=1;
                        i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                        S4125=0;
                        S4087=0;
                        if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                          S4087=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S4082=0;
                          if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                            liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                            S4082=1;
                            if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 33, column: 3
                              System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                              S4125=1;
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
              switch(S4125){
                case 0 : 
                  switch(S4087){
                    case 0 : 
                      if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                        S4087=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S4082){
                          case 0 : 
                            if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                              liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                              S4082=1;
                              if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 33, column: 3
                                System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                                S4125=1;
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
                              System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                              S4125=1;
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
                      S4087=1;
                      S4087=0;
                      if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                        S4087=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S4082=0;
                        if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                          liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                          S4082=1;
                          if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                            ends[1]=2;
                            ;//sysj\filler_controller.sysj line: 33, column: 3
                            System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                            S4125=1;
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
                    System.out.println("FILLER RECEIVED BOTTLEATPOS2");//sysj\filler_controller.sysj line: 36, column: 3
                    S4125=2;
                    S4136=0;
                    if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 37, column: 3
                      readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 37, column: 3
                      S4136=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S4131=0;
                      if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 37, column: 3
                        readyFiller_o.setVal(Boolean.FALSE);//sysj\filler_controller.sysj line: 37, column: 3
                        S4131=1;
                        if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 37, column: 3
                          readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 37, column: 3
                          ends[1]=2;
                          ;//sysj\filler_controller.sysj line: 37, column: 3
                          System.out.println("FILLER SEND FALSE");//sysj\filler_controller.sysj line: 38, column: 3
                          S4125=3;
                          liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 41, column: 5
                          currsigs.addElement(liquidAmount_1);
                          liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 41, column: 5
                          nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 42, column: 5
                          currsigs.addElement(nozzleSelect);
                          nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 42, column: 5
                          S4174=0;
                          if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 44, column: 9
                            S4186=0;
                            if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 45, column: 22
                              System.out.println("TURN OFF VALVE INJECTOR");//sysj\filler_controller.sysj line: 54, column: 6
                              S4186=1;
                              if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 55, column: 22
                                System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 71, column: 5
                                if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 72, column: 9
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 39, column: 3
                                  S4125=4;
                                  S7184=0;
                                  if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 80, column: 5
                                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                    S7184=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S7179=0;
                                    if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                      readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 80, column: 5
                                      S7179=1;
                                      if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 80, column: 5
                                        i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                        S4125=0;
                                        S4087=0;
                                        if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                          S4087=1;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          S4082=0;
                                          if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                            liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                            S4082=1;
                                            if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                              ends[1]=2;
                                              ;//sysj\filler_controller.sysj line: 33, column: 3
                                              System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                                              S4125=1;
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
                                  i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 75, column: 6
                                  S4174=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                thread148096(tdone,ends);
                                thread148097(tdone,ends);
                                thread148098(tdone,ends);
                                int biggest148099 = 0;
                                if(ends[4]>=biggest148099){
                                  biggest148099=ends[4];
                                }
                                if(ends[5]>=biggest148099){
                                  biggest148099=ends[5];
                                }
                                if(ends[6]>=biggest148099){
                                  biggest148099=ends[6];
                                }
                                if(biggest148099 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              thread148100(tdone,ends);
                              thread148101(tdone,ends);
                              int biggest148102 = 0;
                              if(ends[2]>=biggest148102){
                                biggest148102=ends[2];
                              }
                              if(ends[3]>=biggest148102){
                                biggest148102=ends[3];
                              }
                              if(biggest148102 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 71, column: 5
                            if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 72, column: 9
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 39, column: 3
                              S4125=4;
                              S7184=0;
                              if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 80, column: 5
                                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                S7184=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S7179=0;
                                if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                  readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 80, column: 5
                                  S7179=1;
                                  if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 80, column: 5
                                    i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                    S4125=0;
                                    S4087=0;
                                    if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                      S4087=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S4082=0;
                                      if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                        S4082=1;
                                        if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                          ends[1]=2;
                                          ;//sysj\filler_controller.sysj line: 33, column: 3
                                          System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                                          S4125=1;
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
                              i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 75, column: 6
                              S4174=1;
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
                  switch(S4136){
                    case 0 : 
                      if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 37, column: 3
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 37, column: 3
                        S4136=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S4131){
                          case 0 : 
                            if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 37, column: 3
                              readyFiller_o.setVal(Boolean.FALSE);//sysj\filler_controller.sysj line: 37, column: 3
                              S4131=1;
                              if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 37, column: 3
                                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 37, column: 3
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 37, column: 3
                                System.out.println("FILLER SEND FALSE");//sysj\filler_controller.sysj line: 38, column: 3
                                S4125=3;
                                liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 41, column: 5
                                currsigs.addElement(liquidAmount_1);
                                liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 41, column: 5
                                nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 42, column: 5
                                currsigs.addElement(nozzleSelect);
                                nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 42, column: 5
                                S4174=0;
                                if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 44, column: 9
                                  S4186=0;
                                  if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 45, column: 22
                                    System.out.println("TURN OFF VALVE INJECTOR");//sysj\filler_controller.sysj line: 54, column: 6
                                    S4186=1;
                                    if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 55, column: 22
                                      System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 71, column: 5
                                      if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 72, column: 9
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 39, column: 3
                                        S4125=4;
                                        S7184=0;
                                        if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 80, column: 5
                                          readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                          S7184=1;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          S7179=0;
                                          if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                            readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 80, column: 5
                                            S7179=1;
                                            if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                              readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                              ends[1]=2;
                                              ;//sysj\filler_controller.sysj line: 80, column: 5
                                              i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                              S4125=0;
                                              S4087=0;
                                              if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                                S4087=1;
                                                active[1]=1;
                                                ends[1]=1;
                                                break RUN;
                                              }
                                              else {
                                                S4082=0;
                                                if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                                  liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                                  S4082=1;
                                                  if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                                    liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                                    ends[1]=2;
                                                    ;//sysj\filler_controller.sysj line: 33, column: 3
                                                    System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                                                    S4125=1;
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
                                        i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 75, column: 6
                                        S4174=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      thread148103(tdone,ends);
                                      thread148104(tdone,ends);
                                      thread148105(tdone,ends);
                                      int biggest148106 = 0;
                                      if(ends[4]>=biggest148106){
                                        biggest148106=ends[4];
                                      }
                                      if(ends[5]>=biggest148106){
                                        biggest148106=ends[5];
                                      }
                                      if(ends[6]>=biggest148106){
                                        biggest148106=ends[6];
                                      }
                                      if(biggest148106 == 1){
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                  else {
                                    thread148107(tdone,ends);
                                    thread148108(tdone,ends);
                                    int biggest148109 = 0;
                                    if(ends[2]>=biggest148109){
                                      biggest148109=ends[2];
                                    }
                                    if(ends[3]>=biggest148109){
                                      biggest148109=ends[3];
                                    }
                                    if(biggest148109 == 1){
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 71, column: 5
                                  if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 72, column: 9
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 39, column: 3
                                    S4125=4;
                                    S7184=0;
                                    if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 80, column: 5
                                      readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                      S7184=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S7179=0;
                                      if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                        readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 80, column: 5
                                        S7179=1;
                                        if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                          readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                          ends[1]=2;
                                          ;//sysj\filler_controller.sysj line: 80, column: 5
                                          i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                          S4125=0;
                                          S4087=0;
                                          if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                            S4087=1;
                                            active[1]=1;
                                            ends[1]=1;
                                            break RUN;
                                          }
                                          else {
                                            S4082=0;
                                            if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                              liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                              S4082=1;
                                              if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                                ends[1]=2;
                                                ;//sysj\filler_controller.sysj line: 33, column: 3
                                                System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                                                S4125=1;
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
                                    i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 75, column: 6
                                    S4174=1;
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
                            if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 37, column: 3
                              readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 37, column: 3
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 37, column: 3
                              System.out.println("FILLER SEND FALSE");//sysj\filler_controller.sysj line: 38, column: 3
                              S4125=3;
                              liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 41, column: 5
                              currsigs.addElement(liquidAmount_1);
                              liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 41, column: 5
                              nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 42, column: 5
                              currsigs.addElement(nozzleSelect);
                              nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 42, column: 5
                              S4174=0;
                              if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 44, column: 9
                                S4186=0;
                                if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 45, column: 22
                                  System.out.println("TURN OFF VALVE INJECTOR");//sysj\filler_controller.sysj line: 54, column: 6
                                  S4186=1;
                                  if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 55, column: 22
                                    System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 71, column: 5
                                    if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 72, column: 9
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 39, column: 3
                                      S4125=4;
                                      S7184=0;
                                      if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 80, column: 5
                                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                        S7184=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S7179=0;
                                        if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                          readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 80, column: 5
                                          S7179=1;
                                          if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                            ends[1]=2;
                                            ;//sysj\filler_controller.sysj line: 80, column: 5
                                            i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                            S4125=0;
                                            S4087=0;
                                            if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                              S4087=1;
                                              active[1]=1;
                                              ends[1]=1;
                                              break RUN;
                                            }
                                            else {
                                              S4082=0;
                                              if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                                liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                                S4082=1;
                                                if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                                  ends[1]=2;
                                                  ;//sysj\filler_controller.sysj line: 33, column: 3
                                                  System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                                                  S4125=1;
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
                                      i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 75, column: 6
                                      S4174=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    thread148110(tdone,ends);
                                    thread148111(tdone,ends);
                                    thread148112(tdone,ends);
                                    int biggest148113 = 0;
                                    if(ends[4]>=biggest148113){
                                      biggest148113=ends[4];
                                    }
                                    if(ends[5]>=biggest148113){
                                      biggest148113=ends[5];
                                    }
                                    if(ends[6]>=biggest148113){
                                      biggest148113=ends[6];
                                    }
                                    if(biggest148113 == 1){
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  thread148114(tdone,ends);
                                  thread148115(tdone,ends);
                                  int biggest148116 = 0;
                                  if(ends[2]>=biggest148116){
                                    biggest148116=ends[2];
                                  }
                                  if(ends[3]>=biggest148116){
                                    biggest148116=ends[3];
                                  }
                                  if(biggest148116 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 71, column: 5
                                if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 72, column: 9
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 39, column: 3
                                  S4125=4;
                                  S7184=0;
                                  if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 80, column: 5
                                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                    S7184=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S7179=0;
                                    if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                      readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 80, column: 5
                                      S7179=1;
                                      if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 80, column: 5
                                        i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                        S4125=0;
                                        S4087=0;
                                        if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                          S4087=1;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          S4082=0;
                                          if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                            liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                            S4082=1;
                                            if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                              ends[1]=2;
                                              ;//sysj\filler_controller.sysj line: 33, column: 3
                                              System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                                              S4125=1;
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
                                  i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 75, column: 6
                                  S4174=1;
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
                      S4136=1;
                      S4136=0;
                      if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 37, column: 3
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 37, column: 3
                        S4136=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S4131=0;
                        if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 37, column: 3
                          readyFiller_o.setVal(Boolean.FALSE);//sysj\filler_controller.sysj line: 37, column: 3
                          S4131=1;
                          if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 37, column: 3
                            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 37, column: 3
                            ends[1]=2;
                            ;//sysj\filler_controller.sysj line: 37, column: 3
                            System.out.println("FILLER SEND FALSE");//sysj\filler_controller.sysj line: 38, column: 3
                            S4125=3;
                            liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 41, column: 5
                            currsigs.addElement(liquidAmount_1);
                            liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 41, column: 5
                            nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 42, column: 5
                            currsigs.addElement(nozzleSelect);
                            nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 42, column: 5
                            S4174=0;
                            if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 44, column: 9
                              S4186=0;
                              if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 45, column: 22
                                System.out.println("TURN OFF VALVE INJECTOR");//sysj\filler_controller.sysj line: 54, column: 6
                                S4186=1;
                                if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 55, column: 22
                                  System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 71, column: 5
                                  if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 72, column: 9
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 39, column: 3
                                    S4125=4;
                                    S7184=0;
                                    if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 80, column: 5
                                      readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                      S7184=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S7179=0;
                                      if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                        readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 80, column: 5
                                        S7179=1;
                                        if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                          readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                          ends[1]=2;
                                          ;//sysj\filler_controller.sysj line: 80, column: 5
                                          i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                          S4125=0;
                                          S4087=0;
                                          if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                            S4087=1;
                                            active[1]=1;
                                            ends[1]=1;
                                            break RUN;
                                          }
                                          else {
                                            S4082=0;
                                            if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                              liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                              S4082=1;
                                              if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                                ends[1]=2;
                                                ;//sysj\filler_controller.sysj line: 33, column: 3
                                                System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                                                S4125=1;
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
                                    i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 75, column: 6
                                    S4174=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  thread148117(tdone,ends);
                                  thread148118(tdone,ends);
                                  thread148119(tdone,ends);
                                  int biggest148120 = 0;
                                  if(ends[4]>=biggest148120){
                                    biggest148120=ends[4];
                                  }
                                  if(ends[5]>=biggest148120){
                                    biggest148120=ends[5];
                                  }
                                  if(ends[6]>=biggest148120){
                                    biggest148120=ends[6];
                                  }
                                  if(biggest148120 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                thread148121(tdone,ends);
                                thread148122(tdone,ends);
                                int biggest148123 = 0;
                                if(ends[2]>=biggest148123){
                                  biggest148123=ends[2];
                                }
                                if(ends[3]>=biggest148123){
                                  biggest148123=ends[3];
                                }
                                if(biggest148123 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 71, column: 5
                              if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 72, column: 9
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 39, column: 3
                                S4125=4;
                                S7184=0;
                                if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 80, column: 5
                                  readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                  S7184=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S7179=0;
                                  if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                    readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 80, column: 5
                                    S7179=1;
                                    if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                      readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 80, column: 5
                                      i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                      S4125=0;
                                      S4087=0;
                                      if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                        S4087=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S4082=0;
                                        if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                          liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                          S4082=1;
                                          if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                            ends[1]=2;
                                            ;//sysj\filler_controller.sysj line: 33, column: 3
                                            System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                                            S4125=1;
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
                                i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 75, column: 6
                                S4174=1;
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
                  switch(S4174){
                    case 0 : 
                      switch(S4186){
                        case 0 : 
                          if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 45, column: 22
                            System.out.println("TURN OFF VALVE INJECTOR");//sysj\filler_controller.sysj line: 54, column: 6
                            S4186=1;
                            if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 55, column: 22
                              System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 71, column: 5
                              if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 72, column: 9
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 39, column: 3
                                S4125=4;
                                S7184=0;
                                if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 80, column: 5
                                  readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                  S7184=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S7179=0;
                                  if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                    readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 80, column: 5
                                    S7179=1;
                                    if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                      readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 80, column: 5
                                      i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                      S4125=0;
                                      S4087=0;
                                      if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                        S4087=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S4082=0;
                                        if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                          liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                          S4082=1;
                                          if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                            ends[1]=2;
                                            ;//sysj\filler_controller.sysj line: 33, column: 3
                                            System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                                            S4125=1;
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
                                i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 75, column: 6
                                S4174=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              thread148124(tdone,ends);
                              thread148125(tdone,ends);
                              thread148126(tdone,ends);
                              int biggest148127 = 0;
                              if(ends[4]>=biggest148127){
                                biggest148127=ends[4];
                              }
                              if(ends[5]>=biggest148127){
                                biggest148127=ends[5];
                              }
                              if(ends[6]>=biggest148127){
                                biggest148127=ends[6];
                              }
                              if(biggest148127 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            thread148128(tdone,ends);
                            thread148129(tdone,ends);
                            int biggest148130 = 0;
                            if(ends[2]>=biggest148130){
                              biggest148130=ends[2];
                            }
                            if(ends[3]>=biggest148130){
                              biggest148130=ends[3];
                            }
                            if(biggest148130 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest148130 == 0){
                              System.out.println("TURN OFF VALVE INJECTOR");//sysj\filler_controller.sysj line: 54, column: 6
                              S4186=1;
                              if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 55, column: 22
                                System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 71, column: 5
                                if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 72, column: 9
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 39, column: 3
                                  S4125=4;
                                  S7184=0;
                                  if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 80, column: 5
                                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                    S7184=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S7179=0;
                                    if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                      readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 80, column: 5
                                      S7179=1;
                                      if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 80, column: 5
                                        i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                        S4125=0;
                                        S4087=0;
                                        if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                          S4087=1;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          S4082=0;
                                          if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                            liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                            S4082=1;
                                            if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                              ends[1]=2;
                                              ;//sysj\filler_controller.sysj line: 33, column: 3
                                              System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                                              S4125=1;
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
                                  i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 75, column: 6
                                  S4174=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                thread148131(tdone,ends);
                                thread148132(tdone,ends);
                                thread148133(tdone,ends);
                                int biggest148134 = 0;
                                if(ends[4]>=biggest148134){
                                  biggest148134=ends[4];
                                }
                                if(ends[5]>=biggest148134){
                                  biggest148134=ends[5];
                                }
                                if(ends[6]>=biggest148134){
                                  biggest148134=ends[6];
                                }
                                if(biggest148134 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                          }
                        
                        case 1 : 
                          if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 55, column: 22
                            System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 71, column: 5
                            if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 72, column: 9
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 39, column: 3
                              S4125=4;
                              S7184=0;
                              if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 80, column: 5
                                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                S7184=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S7179=0;
                                if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                  readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 80, column: 5
                                  S7179=1;
                                  if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 80, column: 5
                                    i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                    S4125=0;
                                    S4087=0;
                                    if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                      S4087=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S4082=0;
                                      if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                        S4082=1;
                                        if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                          ends[1]=2;
                                          ;//sysj\filler_controller.sysj line: 33, column: 3
                                          System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                                          S4125=1;
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
                              i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 75, column: 6
                              S4174=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            thread148135(tdone,ends);
                            thread148136(tdone,ends);
                            thread148137(tdone,ends);
                            int biggest148138 = 0;
                            if(ends[4]>=biggest148138){
                              biggest148138=ends[4];
                            }
                            if(ends[5]>=biggest148138){
                              biggest148138=ends[5];
                            }
                            if(ends[6]>=biggest148138){
                              biggest148138=ends[6];
                            }
                            if(biggest148138 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest148138 == 0){
                              System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 71, column: 5
                              if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 72, column: 9
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 39, column: 3
                                S4125=4;
                                S7184=0;
                                if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 80, column: 5
                                  readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                  S7184=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S7179=0;
                                  if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                    readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 80, column: 5
                                    S7179=1;
                                    if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                      readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 80, column: 5
                                      i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                      S4125=0;
                                      S4087=0;
                                      if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                        S4087=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S4082=0;
                                        if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                          liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                          S4082=1;
                                          if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                            ends[1]=2;
                                            ;//sysj\filler_controller.sysj line: 33, column: 3
                                            System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                                            S4125=1;
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
                                i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 75, column: 6
                                S4174=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                        
                      }
                      break;
                    
                    case 1 : 
                      S4174=1;
                      liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 41, column: 5
                      currsigs.addElement(liquidAmount_1);
                      liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 41, column: 5
                      nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 42, column: 5
                      currsigs.addElement(nozzleSelect);
                      nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 42, column: 5
                      S4174=0;
                      if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 44, column: 9
                        S4186=0;
                        if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 45, column: 22
                          System.out.println("TURN OFF VALVE INJECTOR");//sysj\filler_controller.sysj line: 54, column: 6
                          S4186=1;
                          if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 55, column: 22
                            System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 71, column: 5
                            if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 72, column: 9
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 39, column: 3
                              S4125=4;
                              S7184=0;
                              if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 80, column: 5
                                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                S7184=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S7179=0;
                                if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                  readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 80, column: 5
                                  S7179=1;
                                  if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 80, column: 5
                                    i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                    S4125=0;
                                    S4087=0;
                                    if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                      S4087=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S4082=0;
                                      if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                        S4082=1;
                                        if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                          ends[1]=2;
                                          ;//sysj\filler_controller.sysj line: 33, column: 3
                                          System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                                          S4125=1;
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
                              i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 75, column: 6
                              S4174=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            thread148139(tdone,ends);
                            thread148140(tdone,ends);
                            thread148141(tdone,ends);
                            int biggest148142 = 0;
                            if(ends[4]>=biggest148142){
                              biggest148142=ends[4];
                            }
                            if(ends[5]>=biggest148142){
                              biggest148142=ends[5];
                            }
                            if(ends[6]>=biggest148142){
                              biggest148142=ends[6];
                            }
                            if(biggest148142 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          thread148143(tdone,ends);
                          thread148144(tdone,ends);
                          int biggest148145 = 0;
                          if(ends[2]>=biggest148145){
                            biggest148145=ends[2];
                          }
                          if(ends[3]>=biggest148145){
                            biggest148145=ends[3];
                          }
                          if(biggest148145 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 71, column: 5
                        if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 72, column: 9
                          ends[1]=2;
                          ;//sysj\filler_controller.sysj line: 39, column: 3
                          S4125=4;
                          S7184=0;
                          if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 80, column: 5
                            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                            S7184=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S7179=0;
                            if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                              readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 80, column: 5
                              S7179=1;
                              if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 80, column: 5
                                i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                S4125=0;
                                S4087=0;
                                if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                  S4087=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S4082=0;
                                  if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                    S4082=1;
                                    if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 33, column: 3
                                      System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                                      S4125=1;
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
                          i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 75, column: 6
                          S4174=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    
                  }
                  break;
                
                case 4 : 
                  switch(S7184){
                    case 0 : 
                      if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 80, column: 5
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                        S7184=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S7179){
                          case 0 : 
                            if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                              readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 80, column: 5
                              S7179=1;
                              if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 80, column: 5
                                i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                S4125=0;
                                S4087=0;
                                if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                  S4087=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S4082=0;
                                  if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                    S4082=1;
                                    if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 33, column: 3
                                      System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                                      S4125=1;
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
                            if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                              readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 80, column: 5
                              i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                              S4125=0;
                              S4087=0;
                              if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                S4087=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S4082=0;
                                if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                  S4082=1;
                                  if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 33, column: 3
                                    System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                                    S4125=1;
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
                      S7184=1;
                      S7184=0;
                      if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 80, column: 5
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                        S7184=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S7179=0;
                        if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                          readyFiller_o.setVal(Boolean.TRUE);//sysj\filler_controller.sysj line: 80, column: 5
                          S7179=1;
                          if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 80, column: 5
                            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 80, column: 5
                            ends[1]=2;
                            ;//sysj\filler_controller.sysj line: 80, column: 5
                            i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                            S4125=0;
                            S4087=0;
                            if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                              S4087=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S4082=0;
                              if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                S4082=1;
                                if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 33, column: 3
                                  System.out.println("FILLER RECEIVED LIQUID DATA: " + (int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 34, column: 3
                                  S4125=1;
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
