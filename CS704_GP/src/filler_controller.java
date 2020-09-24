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
  private int S115574 = 1;
  private int S115573 = 1;
  private int S4065 = 1;
  private int S4060 = 1;
  private int S4125 = 1;
  private int S4087 = 1;
  private int S4082 = 1;
  private int S4136 = 1;
  private int S4131 = 1;
  private int S4174 = 1;
  private int S4294 = 1;
  private int S4179 = 1;
  private int S4184 = 1;
  private int S4190 = 1;
  private int S4195 = 1;
  private int S4211 = 1;
  private int S4197 = 1;
  
  private int[] ends = new int[7];
  private int[] tdone = new int[7];
  
  public void thread115624(int [] tdone, int [] ends){
        S4184=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread115623(int [] tdone, int [] ends){
        S4179=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 45, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread115621(int [] tdone, int [] ends){
        S4211=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 62, column: 7
    S4197=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 62, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
      currsigs.addElement(done_1);
      S4211=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S4197=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread115620(int [] tdone, int [] ends){
        S4195=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread115619(int [] tdone, int [] ends){
        S4190=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 54, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread115617(int [] tdone, int [] ends){
        switch(S4211){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S4197){
          case 0 : 
            S4197=0;
            if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
              ends[6]=3;
              ;//sysj\filler_controller.sysj line: 62, column: 7
              done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
              currsigs.addElement(done_1);
              S4211=0;
              active[6]=0;
              ends[6]=0;
              tdone[6]=1;
            }
            else {
              S4197=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            S4197=1;
            S4197=0;
            if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
              ends[6]=3;
              ;//sysj\filler_controller.sysj line: 62, column: 7
              done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
              currsigs.addElement(done_1);
              S4211=0;
              active[6]=0;
              ends[6]=0;
              tdone[6]=1;
            }
            else {
              S4197=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread115616(int [] tdone, int [] ends){
        switch(S4195){
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

  public void thread115615(int [] tdone, int [] ends){
        switch(S4190){
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

  public void thread115613(int [] tdone, int [] ends){
        S4211=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 62, column: 7
    S4197=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 62, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
      currsigs.addElement(done_1);
      S4211=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S4197=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread115612(int [] tdone, int [] ends){
        S4195=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread115611(int [] tdone, int [] ends){
        S4190=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 54, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread115609(int [] tdone, int [] ends){
        switch(S4184){
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

  public void thread115608(int [] tdone, int [] ends){
        switch(S4179){
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

  public void thread115606(int [] tdone, int [] ends){
        S4211=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 62, column: 7
    S4197=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 62, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
      currsigs.addElement(done_1);
      S4211=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S4197=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread115605(int [] tdone, int [] ends){
        S4195=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread115604(int [] tdone, int [] ends){
        S4190=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 54, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread115602(int [] tdone, int [] ends){
        S4184=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread115601(int [] tdone, int [] ends){
        S4179=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 45, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread115599(int [] tdone, int [] ends){
        S4211=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 62, column: 7
    S4197=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 62, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
      currsigs.addElement(done_1);
      S4211=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S4197=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread115598(int [] tdone, int [] ends){
        S4195=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread115597(int [] tdone, int [] ends){
        S4190=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 54, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread115595(int [] tdone, int [] ends){
        S4184=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread115594(int [] tdone, int [] ends){
        S4179=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 45, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread115592(int [] tdone, int [] ends){
        S4211=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 62, column: 7
    S4197=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 62, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
      currsigs.addElement(done_1);
      S4211=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S4197=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread115591(int [] tdone, int [] ends){
        S4195=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread115590(int [] tdone, int [] ends){
        S4190=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 54, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread115588(int [] tdone, int [] ends){
        S4184=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread115587(int [] tdone, int [] ends){
        S4179=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 45, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread115585(int [] tdone, int [] ends){
        S4211=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 62, column: 7
    S4197=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 62, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
      currsigs.addElement(done_1);
      S4211=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S4197=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread115584(int [] tdone, int [] ends){
        S4195=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread115583(int [] tdone, int [] ends){
        S4190=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 54, column: 8
    currsigs.addElement(valveInletOnOff);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread115581(int [] tdone, int [] ends){
        S4184=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 49, column: 8
    currsigs.addElement(dosUnitValveRetract);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread115580(int [] tdone, int [] ends){
        S4179=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 45, column: 8
    currsigs.addElement(valveInjectorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread115578(int [] tdone, int [] ends){
        S4211=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 62, column: 7
    S4197=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 62, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 62, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 64, column: 8
      currsigs.addElement(done_1);
      S4211=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S4197=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread115577(int [] tdone, int [] ends){
        S4195=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 59, column: 8
    currsigs.addElement(dosUnitValveExtend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread115576(int [] tdone, int [] ends){
        S4190=1;
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
      switch(S115574){
        case 0 : 
          S115574=0;
          break RUN;
        
        case 1 : 
          S115574=2;
          S115574=2;
          done_1.setClear();//sysj\filler_controller.sysj line: 28, column: 2
          liquidAmount_1.setClear();//sysj\filler_controller.sysj line: 29, column: 2
          S115573=0;
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
              readyFiller_o.setVal(true);//sysj\filler_controller.sysj line: 30, column: 2
              S4060=1;
              if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                ends[1]=2;
                ;//sysj\filler_controller.sysj line: 30, column: 2
                S115573=1;
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
                      System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
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
          switch(S115573){
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
                          readyFiller_o.setVal(true);//sysj\filler_controller.sysj line: 30, column: 2
                          S4060=1;
                          if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                            ends[1]=2;
                            ;//sysj\filler_controller.sysj line: 30, column: 2
                            S115573=1;
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
                                  System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
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
                          S115573=1;
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
                                System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
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
                      readyFiller_o.setVal(true);//sysj\filler_controller.sysj line: 30, column: 2
                      S4060=1;
                      if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                        ends[1]=2;
                        ;//sysj\filler_controller.sysj line: 30, column: 2
                        S115573=1;
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
                              System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
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
                                System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
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
                              System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
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
                            System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
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
                    S4125=2;
                    S4136=0;
                    if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 36, column: 3
                      readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 36, column: 3
                      S4136=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S4131=0;
                      if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 36, column: 3
                        readyFiller_o.setVal(false);//sysj\filler_controller.sysj line: 36, column: 3
                        S4131=1;
                        if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 36, column: 3
                          readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 36, column: 3
                          ends[1]=2;
                          ;//sysj\filler_controller.sysj line: 36, column: 3
                          S4125=3;
                          liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 39, column: 5
                          currsigs.addElement(liquidAmount_1);
                          liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 39, column: 5
                          nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 40, column: 5
                          currsigs.addElement(nozzleSelect);
                          nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 40, column: 5
                          S4174=0;
                          if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 42, column: 9
                            S4294=0;
                            if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 43, column: 22
                              S4294=1;
                              if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 52, column: 22
                                System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                                if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 37, column: 3
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
                                        System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
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
                                  i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                                  S4174=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                thread115576(tdone,ends);
                                thread115577(tdone,ends);
                                thread115578(tdone,ends);
                                int biggest115579 = 0;
                                if(ends[4]>=biggest115579){
                                  biggest115579=ends[4];
                                }
                                if(ends[5]>=biggest115579){
                                  biggest115579=ends[5];
                                }
                                if(ends[6]>=biggest115579){
                                  biggest115579=ends[6];
                                }
                                if(biggest115579 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              thread115580(tdone,ends);
                              thread115581(tdone,ends);
                              int biggest115582 = 0;
                              if(ends[2]>=biggest115582){
                                biggest115582=ends[2];
                              }
                              if(ends[3]>=biggest115582){
                                biggest115582=ends[3];
                              }
                              if(biggest115582 == 1){
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
                                    System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
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
                              i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
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
                      if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 36, column: 3
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 36, column: 3
                        S4136=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S4131){
                          case 0 : 
                            if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 36, column: 3
                              readyFiller_o.setVal(false);//sysj\filler_controller.sysj line: 36, column: 3
                              S4131=1;
                              if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 36, column: 3
                                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 36, column: 3
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 36, column: 3
                                S4125=3;
                                liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 39, column: 5
                                currsigs.addElement(liquidAmount_1);
                                liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 39, column: 5
                                nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 40, column: 5
                                currsigs.addElement(nozzleSelect);
                                nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 40, column: 5
                                S4174=0;
                                if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 42, column: 9
                                  S4294=0;
                                  if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 43, column: 22
                                    S4294=1;
                                    if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 52, column: 22
                                      System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                                      if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 37, column: 3
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
                                              System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
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
                                        i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                                        S4174=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      thread115583(tdone,ends);
                                      thread115584(tdone,ends);
                                      thread115585(tdone,ends);
                                      int biggest115586 = 0;
                                      if(ends[4]>=biggest115586){
                                        biggest115586=ends[4];
                                      }
                                      if(ends[5]>=biggest115586){
                                        biggest115586=ends[5];
                                      }
                                      if(ends[6]>=biggest115586){
                                        biggest115586=ends[6];
                                      }
                                      if(biggest115586 == 1){
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                  else {
                                    thread115587(tdone,ends);
                                    thread115588(tdone,ends);
                                    int biggest115589 = 0;
                                    if(ends[2]>=biggest115589){
                                      biggest115589=ends[2];
                                    }
                                    if(ends[3]>=biggest115589){
                                      biggest115589=ends[3];
                                    }
                                    if(biggest115589 == 1){
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
                                          System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
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
                                    i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
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
                            if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 36, column: 3
                              readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 36, column: 3
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 36, column: 3
                              S4125=3;
                              liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 39, column: 5
                              currsigs.addElement(liquidAmount_1);
                              liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 39, column: 5
                              nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 40, column: 5
                              currsigs.addElement(nozzleSelect);
                              nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 40, column: 5
                              S4174=0;
                              if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 42, column: 9
                                S4294=0;
                                if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 43, column: 22
                                  S4294=1;
                                  if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 52, column: 22
                                    System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                                    if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 37, column: 3
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
                                            System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
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
                                      i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                                      S4174=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    thread115590(tdone,ends);
                                    thread115591(tdone,ends);
                                    thread115592(tdone,ends);
                                    int biggest115593 = 0;
                                    if(ends[4]>=biggest115593){
                                      biggest115593=ends[4];
                                    }
                                    if(ends[5]>=biggest115593){
                                      biggest115593=ends[5];
                                    }
                                    if(ends[6]>=biggest115593){
                                      biggest115593=ends[6];
                                    }
                                    if(biggest115593 == 1){
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  thread115594(tdone,ends);
                                  thread115595(tdone,ends);
                                  int biggest115596 = 0;
                                  if(ends[2]>=biggest115596){
                                    biggest115596=ends[2];
                                  }
                                  if(ends[3]>=biggest115596){
                                    biggest115596=ends[3];
                                  }
                                  if(biggest115596 == 1){
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
                                        System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
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
                                  i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
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
                      if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 36, column: 3
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 36, column: 3
                        S4136=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S4131=0;
                        if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 36, column: 3
                          readyFiller_o.setVal(false);//sysj\filler_controller.sysj line: 36, column: 3
                          S4131=1;
                          if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 36, column: 3
                            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 36, column: 3
                            ends[1]=2;
                            ;//sysj\filler_controller.sysj line: 36, column: 3
                            S4125=3;
                            liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 39, column: 5
                            currsigs.addElement(liquidAmount_1);
                            liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 39, column: 5
                            nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 40, column: 5
                            currsigs.addElement(nozzleSelect);
                            nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 40, column: 5
                            S4174=0;
                            if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 42, column: 9
                              S4294=0;
                              if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 43, column: 22
                                S4294=1;
                                if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 52, column: 22
                                  System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                                  if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 37, column: 3
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
                                          System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
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
                                    i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                                    S4174=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  thread115597(tdone,ends);
                                  thread115598(tdone,ends);
                                  thread115599(tdone,ends);
                                  int biggest115600 = 0;
                                  if(ends[4]>=biggest115600){
                                    biggest115600=ends[4];
                                  }
                                  if(ends[5]>=biggest115600){
                                    biggest115600=ends[5];
                                  }
                                  if(ends[6]>=biggest115600){
                                    biggest115600=ends[6];
                                  }
                                  if(biggest115600 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                thread115601(tdone,ends);
                                thread115602(tdone,ends);
                                int biggest115603 = 0;
                                if(ends[2]>=biggest115603){
                                  biggest115603=ends[2];
                                }
                                if(ends[3]>=biggest115603){
                                  biggest115603=ends[3];
                                }
                                if(biggest115603 == 1){
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
                                      System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
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
                                i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
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
                      switch(S4294){
                        case 0 : 
                          if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 43, column: 22
                            S4294=1;
                            if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 52, column: 22
                              System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                              if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 37, column: 3
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
                                      System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
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
                                i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                                S4174=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              thread115604(tdone,ends);
                              thread115605(tdone,ends);
                              thread115606(tdone,ends);
                              int biggest115607 = 0;
                              if(ends[4]>=biggest115607){
                                biggest115607=ends[4];
                              }
                              if(ends[5]>=biggest115607){
                                biggest115607=ends[5];
                              }
                              if(ends[6]>=biggest115607){
                                biggest115607=ends[6];
                              }
                              if(biggest115607 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            thread115608(tdone,ends);
                            thread115609(tdone,ends);
                            int biggest115610 = 0;
                            if(ends[2]>=biggest115610){
                              biggest115610=ends[2];
                            }
                            if(ends[3]>=biggest115610){
                              biggest115610=ends[3];
                            }
                            if(biggest115610 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest115610 == 0){
                              S4294=1;
                              if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 52, column: 22
                                System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                                if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 37, column: 3
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
                                        System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
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
                                  i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                                  S4174=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                thread115611(tdone,ends);
                                thread115612(tdone,ends);
                                thread115613(tdone,ends);
                                int biggest115614 = 0;
                                if(ends[4]>=biggest115614){
                                  biggest115614=ends[4];
                                }
                                if(ends[5]>=biggest115614){
                                  biggest115614=ends[5];
                                }
                                if(ends[6]>=biggest115614){
                                  biggest115614=ends[6];
                                }
                                if(biggest115614 == 1){
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
                                    System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
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
                              i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                              S4174=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            thread115615(tdone,ends);
                            thread115616(tdone,ends);
                            thread115617(tdone,ends);
                            int biggest115618 = 0;
                            if(ends[4]>=biggest115618){
                              biggest115618=ends[4];
                            }
                            if(ends[5]>=biggest115618){
                              biggest115618=ends[5];
                            }
                            if(ends[6]>=biggest115618){
                              biggest115618=ends[6];
                            }
                            if(biggest115618 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest115618 == 0){
                              System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                              if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 37, column: 3
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
                                      System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
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
                                i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
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
                      liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 39, column: 5
                      currsigs.addElement(liquidAmount_1);
                      liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 39, column: 5
                      nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 40, column: 5
                      currsigs.addElement(nozzleSelect);
                      nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 40, column: 5
                      S4174=0;
                      if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 42, column: 9
                        S4294=0;
                        if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 43, column: 22
                          S4294=1;
                          if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 52, column: 22
                            System.out.println("NOZZLE " + i_thread_1 + " DONE");//sysj\filler_controller.sysj line: 68, column: 5
                            if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 69, column: 9
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 37, column: 3
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
                                    System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
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
                              i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                              S4174=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            thread115619(tdone,ends);
                            thread115620(tdone,ends);
                            thread115621(tdone,ends);
                            int biggest115622 = 0;
                            if(ends[4]>=biggest115622){
                              biggest115622=ends[4];
                            }
                            if(ends[5]>=biggest115622){
                              biggest115622=ends[5];
                            }
                            if(ends[6]>=biggest115622){
                              biggest115622=ends[6];
                            }
                            if(biggest115622 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          thread115623(tdone,ends);
                          thread115624(tdone,ends);
                          int biggest115625 = 0;
                          if(ends[2]>=biggest115625){
                            biggest115625=ends[2];
                          }
                          if(ends[3]>=biggest115625){
                            biggest115625=ends[3];
                          }
                          if(biggest115625 == 1){
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
                                System.out.println("FILLER RECEIVED LIQUID DATA");//sysj\filler_controller.sysj line: 34, column: 3
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
                          i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 72, column: 6
                          S4174=1;
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
