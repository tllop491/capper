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
  private long __start_thread_6;//sysj\filler_controller.sysj line: 61, column: 7
  private int i_thread_1;//sysj\filler_controller.sysj line: 32, column: 3
  private int S117734 = 1;
  private int S117733 = 1;
  private int S6225 = 1;
  private int S6220 = 1;
  private int S6285 = 1;
  private int S6247 = 1;
  private int S6242 = 1;
  private int S6296 = 1;
  private int S6291 = 1;
  private int S6334 = 1;
  private int S6454 = 1;
  private int S6339 = 1;
  private int S6344 = 1;
  private int S6350 = 1;
  private int S6355 = 1;
  private int S6371 = 1;
  private int S6357 = 1;
  
  private int[] ends = new int[7];
  private int[] tdone = new int[7];
  
  public void thread117784(int [] tdone, int [] ends){
        S6344=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 48, column: 8
    currsigs.addElement(dosUnitValveRetract);
    System.out.println("Emitted dosUnitValveRetract");
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread117783(int [] tdone, int [] ends){
        S6339=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 44, column: 8
    currsigs.addElement(valveInjectorOnOff);
    System.out.println("Emitted valveInjectorOnOff");
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread117781(int [] tdone, int [] ends){
        S6371=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 61, column: 7
    S6357=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 61, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 61, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 63, column: 8
      currsigs.addElement(done_1);
      System.out.println("Emitted done_1");
      S6371=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S6357=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread117780(int [] tdone, int [] ends){
        S6355=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 58, column: 8
    currsigs.addElement(dosUnitValveExtend);
    System.out.println("Emitted dosUnitValveExtend");
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread117779(int [] tdone, int [] ends){
        S6350=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 53, column: 8
    currsigs.addElement(valveInletOnOff);
    System.out.println("Emitted valveInletOnOff");
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread117777(int [] tdone, int [] ends){
        switch(S6371){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S6357){
          case 0 : 
            S6357=0;
            if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 61, column: 7
              ends[6]=3;
              ;//sysj\filler_controller.sysj line: 61, column: 7
              done_1.setPresent();//sysj\filler_controller.sysj line: 63, column: 8
              currsigs.addElement(done_1);
              System.out.println("Emitted done_1");
              S6371=0;
              active[6]=0;
              ends[6]=0;
              tdone[6]=1;
            }
            else {
              S6357=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
          case 1 : 
            S6357=1;
            S6357=0;
            if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 61, column: 7
              ends[6]=3;
              ;//sysj\filler_controller.sysj line: 61, column: 7
              done_1.setPresent();//sysj\filler_controller.sysj line: 63, column: 8
              currsigs.addElement(done_1);
              System.out.println("Emitted done_1");
              S6371=0;
              active[6]=0;
              ends[6]=0;
              tdone[6]=1;
            }
            else {
              S6357=1;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread117776(int [] tdone, int [] ends){
        switch(S6355){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 58, column: 8
        currsigs.addElement(dosUnitValveExtend);
        System.out.println("Emitted dosUnitValveExtend");
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread117775(int [] tdone, int [] ends){
        switch(S6350){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 53, column: 8
        currsigs.addElement(valveInletOnOff);
        System.out.println("Emitted valveInletOnOff");
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread117773(int [] tdone, int [] ends){
        S6371=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 61, column: 7
    S6357=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 61, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 61, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 63, column: 8
      currsigs.addElement(done_1);
      System.out.println("Emitted done_1");
      S6371=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S6357=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread117772(int [] tdone, int [] ends){
        S6355=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 58, column: 8
    currsigs.addElement(dosUnitValveExtend);
    System.out.println("Emitted dosUnitValveExtend");
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread117771(int [] tdone, int [] ends){
        S6350=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 53, column: 8
    currsigs.addElement(valveInletOnOff);
    System.out.println("Emitted valveInletOnOff");
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread117769(int [] tdone, int [] ends){
        switch(S6344){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 48, column: 8
        currsigs.addElement(dosUnitValveRetract);
        System.out.println("Emitted dosUnitValveRetract");
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread117768(int [] tdone, int [] ends){
        switch(S6339){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 44, column: 8
        currsigs.addElement(valveInjectorOnOff);
        System.out.println("Emitted valveInjectorOnOff");
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread117766(int [] tdone, int [] ends){
        S6371=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 61, column: 7
    S6357=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 61, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 61, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 63, column: 8
      currsigs.addElement(done_1);
      System.out.println("Emitted done_1");
      S6371=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S6357=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread117765(int [] tdone, int [] ends){
        S6355=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 58, column: 8
    currsigs.addElement(dosUnitValveExtend);
    System.out.println("Emitted dosUnitValveExtend");
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread117764(int [] tdone, int [] ends){
        S6350=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 53, column: 8
    currsigs.addElement(valveInletOnOff);
    System.out.println("Emitted valveInletOnOff");
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread117762(int [] tdone, int [] ends){
        S6344=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 48, column: 8
    currsigs.addElement(dosUnitValveRetract);
    System.out.println("Emitted dosUnitValveRetract");
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread117761(int [] tdone, int [] ends){
        S6339=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 44, column: 8
    currsigs.addElement(valveInjectorOnOff);
    System.out.println("Emitted valveInjectorOnOff");
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread117759(int [] tdone, int [] ends){
        S6371=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 61, column: 7
    S6357=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 61, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 61, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 63, column: 8
      currsigs.addElement(done_1);
      System.out.println("Emitted done_1");
      S6371=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S6357=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread117758(int [] tdone, int [] ends){
        S6355=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 58, column: 8
    currsigs.addElement(dosUnitValveExtend);
    System.out.println("Emitted dosUnitValveExtend");
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread117757(int [] tdone, int [] ends){
        S6350=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 53, column: 8
    currsigs.addElement(valveInletOnOff);
    System.out.println("Emitted valveInletOnOff");
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread117755(int [] tdone, int [] ends){
        S6344=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 48, column: 8
    currsigs.addElement(dosUnitValveRetract);
    System.out.println("Emitted dosUnitValveRetract");
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread117754(int [] tdone, int [] ends){
        S6339=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 44, column: 8
    currsigs.addElement(valveInjectorOnOff);
    System.out.println("Emitted valveInjectorOnOff");
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread117752(int [] tdone, int [] ends){
        S6371=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 61, column: 7
    S6357=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 61, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 61, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 63, column: 8
      currsigs.addElement(done_1);
      System.out.println("Emitted done_1");
      S6371=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S6357=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread117751(int [] tdone, int [] ends){
        S6355=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 58, column: 8
    currsigs.addElement(dosUnitValveExtend);
    System.out.println("Emitted dosUnitValveExtend");
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread117750(int [] tdone, int [] ends){
        S6350=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 53, column: 8
    currsigs.addElement(valveInletOnOff);
    System.out.println("Emitted valveInletOnOff");
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread117748(int [] tdone, int [] ends){
        S6344=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 48, column: 8
    currsigs.addElement(dosUnitValveRetract);
    System.out.println("Emitted dosUnitValveRetract");
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread117747(int [] tdone, int [] ends){
        S6339=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 44, column: 8
    currsigs.addElement(valveInjectorOnOff);
    System.out.println("Emitted valveInjectorOnOff");
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread117745(int [] tdone, int [] ends){
        S6371=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 61, column: 7
    S6357=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 61, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 61, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 63, column: 8
      currsigs.addElement(done_1);
      System.out.println("Emitted done_1");
      S6371=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S6357=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread117744(int [] tdone, int [] ends){
        S6355=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 58, column: 8
    currsigs.addElement(dosUnitValveExtend);
    System.out.println("Emitted dosUnitValveExtend");
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread117743(int [] tdone, int [] ends){
        S6350=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 53, column: 8
    currsigs.addElement(valveInletOnOff);
    System.out.println("Emitted valveInletOnOff");
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread117741(int [] tdone, int [] ends){
        S6344=1;
    dosUnitValveRetract.setPresent();//sysj\filler_controller.sysj line: 48, column: 8
    currsigs.addElement(dosUnitValveRetract);
    System.out.println("Emitted dosUnitValveRetract");
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread117740(int [] tdone, int [] ends){
        S6339=1;
    valveInjectorOnOff.setPresent();//sysj\filler_controller.sysj line: 44, column: 8
    currsigs.addElement(valveInjectorOnOff);
    System.out.println("Emitted valveInjectorOnOff");
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread117738(int [] tdone, int [] ends){
        S6371=1;
    __start_thread_6 = com.systemj.Timer.getMs();//sysj\filler_controller.sysj line: 61, column: 7
    S6357=0;
    if(com.systemj.Timer.getMs() - __start_thread_6 >= (int)(liquidAmount_1.getpreval() == null ? 0 : ((Integer)liquidAmount_1.getpreval()).intValue())){//sysj\filler_controller.sysj line: 61, column: 7
      ends[6]=3;
      ;//sysj\filler_controller.sysj line: 61, column: 7
      done_1.setPresent();//sysj\filler_controller.sysj line: 63, column: 8
      currsigs.addElement(done_1);
      System.out.println("Emitted done_1");
      S6371=0;
      active[6]=0;
      ends[6]=0;
      tdone[6]=1;
    }
    else {
      S6357=1;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread117737(int [] tdone, int [] ends){
        S6355=1;
    dosUnitValveExtend.setPresent();//sysj\filler_controller.sysj line: 58, column: 8
    currsigs.addElement(dosUnitValveExtend);
    System.out.println("Emitted dosUnitValveExtend");
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread117736(int [] tdone, int [] ends){
        S6350=1;
    valveInletOnOff.setPresent();//sysj\filler_controller.sysj line: 53, column: 8
    currsigs.addElement(valveInletOnOff);
    System.out.println("Emitted valveInletOnOff");
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
      switch(S117734){
        case 0 : 
          S117734=0;
          break RUN;
        
        case 1 : 
          S117734=2;
          S117734=2;
          done_1.setClear();//sysj\filler_controller.sysj line: 28, column: 2
          liquidAmount_1.setClear();//sysj\filler_controller.sysj line: 29, column: 2
          S117733=0;
          S6225=0;
          if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 30, column: 2
            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
            S6225=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S6220=0;
            if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
              readyFiller_o.setVal(true);//sysj\filler_controller.sysj line: 30, column: 2
              S6220=1;
              if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                ends[1]=2;
                ;//sysj\filler_controller.sysj line: 30, column: 2
                S117733=1;
                i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                S6285=0;
                S6247=0;
                if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                  S6247=1;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S6242=0;
                  if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                    liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                    S6242=1;
                    if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                      ends[1]=2;
                      ;//sysj\filler_controller.sysj line: 33, column: 3
                      S6285=1;
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
          switch(S117733){
            case 0 : 
              switch(S6225){
                case 0 : 
                  if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 30, column: 2
                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                    S6225=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S6220){
                      case 0 : 
                        if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                          readyFiller_o.setVal(true);//sysj\filler_controller.sysj line: 30, column: 2
                          S6220=1;
                          if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                            ends[1]=2;
                            ;//sysj\filler_controller.sysj line: 30, column: 2
                            S117733=1;
                            i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                            S6285=0;
                            S6247=0;
                            if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                              S6247=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            else {
                              S6242=0;
                              if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                S6242=1;
                                if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 33, column: 3
                                  S6285=1;
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
                          S117733=1;
                          i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                          S6285=0;
                          S6247=0;
                          if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                            S6247=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S6242=0;
                            if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                              liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                              S6242=1;
                              if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 33, column: 3
                                S6285=1;
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
                  S6225=1;
                  S6225=0;
                  if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 30, column: 2
                    readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                    S6225=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S6220=0;
                    if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                      readyFiller_o.setVal(true);//sysj\filler_controller.sysj line: 30, column: 2
                      S6220=1;
                      if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 30, column: 2
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 30, column: 2
                        ends[1]=2;
                        ;//sysj\filler_controller.sysj line: 30, column: 2
                        S117733=1;
                        i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                        S6285=0;
                        S6247=0;
                        if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                          S6247=1;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        else {
                          S6242=0;
                          if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                            liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                            S6242=1;
                            if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 33, column: 3
                              S6285=1;
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
              switch(S6285){
                case 0 : 
                  switch(S6247){
                    case 0 : 
                      if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                        S6247=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S6242){
                          case 0 : 
                            if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                              liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                              S6242=1;
                              if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 33, column: 3
                                S6285=1;
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
                              S6285=1;
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
                      S6247=1;
                      S6247=0;
                      if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                        S6247=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S6242=0;
                        if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                          liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                          S6242=1;
                          if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                            ends[1]=2;
                            ;//sysj\filler_controller.sysj line: 33, column: 3
                            S6285=1;
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
                  if(bottleAtPos2.getprestatus()){//sysj\filler_controller.sysj line: 34, column: 9
                    S6285=2;
                    S6296=0;
                    if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 35, column: 3
                      readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 35, column: 3
                      S6296=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      S6291=0;
                      if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 35, column: 3
                        readyFiller_o.setVal(false);//sysj\filler_controller.sysj line: 35, column: 3
                        S6291=1;
                        if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 35, column: 3
                          readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 35, column: 3
                          ends[1]=2;
                          ;//sysj\filler_controller.sysj line: 35, column: 3
                          S6285=3;
                          liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 38, column: 5
                          currsigs.addElement(liquidAmount_1);
                          liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 38, column: 5
                          System.out.println("Emitted liquidAmount_1");
                          nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 39, column: 5
                          currsigs.addElement(nozzleSelect);
                          nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 39, column: 5
                          System.out.println("Emitted nozzleSelect");
                          S6334=0;
                          if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 41, column: 9
                            S6454=0;
                            if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 42, column: 22
                              S6454=1;
                              if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 51, column: 22
                                if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 68, column: 9
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 36, column: 3
                                  i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                  S6285=0;
                                  S6247=0;
                                  if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                    S6247=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S6242=0;
                                    if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                      S6242=1;
                                      if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 33, column: 3
                                        S6285=1;
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
                                  i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 71, column: 6
                                  S6334=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                thread117736(tdone,ends);
                                thread117737(tdone,ends);
                                thread117738(tdone,ends);
                                int biggest117739 = 0;
                                if(ends[4]>=biggest117739){
                                  biggest117739=ends[4];
                                }
                                if(ends[5]>=biggest117739){
                                  biggest117739=ends[5];
                                }
                                if(ends[6]>=biggest117739){
                                  biggest117739=ends[6];
                                }
                                if(biggest117739 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              thread117740(tdone,ends);
                              thread117741(tdone,ends);
                              int biggest117742 = 0;
                              if(ends[2]>=biggest117742){
                                biggest117742=ends[2];
                              }
                              if(ends[3]>=biggest117742){
                                biggest117742=ends[3];
                              }
                              if(biggest117742 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 68, column: 9
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 36, column: 3
                              i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                              S6285=0;
                              S6247=0;
                              if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                S6247=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S6242=0;
                                if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                  S6242=1;
                                  if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 33, column: 3
                                    S6285=1;
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
                              i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 71, column: 6
                              S6334=1;
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
                  switch(S6296){
                    case 0 : 
                      if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 35, column: 3
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 35, column: 3
                        S6296=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        switch(S6291){
                          case 0 : 
                            if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 35, column: 3
                              readyFiller_o.setVal(false);//sysj\filler_controller.sysj line: 35, column: 3
                              S6291=1;
                              if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 35, column: 3
                                readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 35, column: 3
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 35, column: 3
                                S6285=3;
                                liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 38, column: 5
                                currsigs.addElement(liquidAmount_1);
                                liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 38, column: 5
                                System.out.println("Emitted liquidAmount_1");
                                nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 39, column: 5
                                currsigs.addElement(nozzleSelect);
                                nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 39, column: 5
                                System.out.println("Emitted nozzleSelect");
                                S6334=0;
                                if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 41, column: 9
                                  S6454=0;
                                  if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 42, column: 22
                                    S6454=1;
                                    if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 51, column: 22
                                      if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 68, column: 9
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 36, column: 3
                                        i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                        S6285=0;
                                        S6247=0;
                                        if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                          S6247=1;
                                          active[1]=1;
                                          ends[1]=1;
                                          break RUN;
                                        }
                                        else {
                                          S6242=0;
                                          if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                            liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                            S6242=1;
                                            if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                              liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                              ends[1]=2;
                                              ;//sysj\filler_controller.sysj line: 33, column: 3
                                              S6285=1;
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
                                        i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 71, column: 6
                                        S6334=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      thread117743(tdone,ends);
                                      thread117744(tdone,ends);
                                      thread117745(tdone,ends);
                                      int biggest117746 = 0;
                                      if(ends[4]>=biggest117746){
                                        biggest117746=ends[4];
                                      }
                                      if(ends[5]>=biggest117746){
                                        biggest117746=ends[5];
                                      }
                                      if(ends[6]>=biggest117746){
                                        biggest117746=ends[6];
                                      }
                                      if(biggest117746 == 1){
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                  else {
                                    thread117747(tdone,ends);
                                    thread117748(tdone,ends);
                                    int biggest117749 = 0;
                                    if(ends[2]>=biggest117749){
                                      biggest117749=ends[2];
                                    }
                                    if(ends[3]>=biggest117749){
                                      biggest117749=ends[3];
                                    }
                                    if(biggest117749 == 1){
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 68, column: 9
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 36, column: 3
                                    i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                    S6285=0;
                                    S6247=0;
                                    if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                      S6247=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S6242=0;
                                      if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                        S6242=1;
                                        if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                          ends[1]=2;
                                          ;//sysj\filler_controller.sysj line: 33, column: 3
                                          S6285=1;
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
                                    i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 71, column: 6
                                    S6334=1;
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
                            if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 35, column: 3
                              readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 35, column: 3
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 35, column: 3
                              S6285=3;
                              liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 38, column: 5
                              currsigs.addElement(liquidAmount_1);
                              liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 38, column: 5
                              System.out.println("Emitted liquidAmount_1");
                              nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 39, column: 5
                              currsigs.addElement(nozzleSelect);
                              nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 39, column: 5
                              System.out.println("Emitted nozzleSelect");
                              S6334=0;
                              if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 41, column: 9
                                S6454=0;
                                if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 42, column: 22
                                  S6454=1;
                                  if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 51, column: 22
                                    if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 68, column: 9
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 36, column: 3
                                      i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                      S6285=0;
                                      S6247=0;
                                      if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                        S6247=1;
                                        active[1]=1;
                                        ends[1]=1;
                                        break RUN;
                                      }
                                      else {
                                        S6242=0;
                                        if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                          liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                          S6242=1;
                                          if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                            ends[1]=2;
                                            ;//sysj\filler_controller.sysj line: 33, column: 3
                                            S6285=1;
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
                                      i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 71, column: 6
                                      S6334=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    thread117750(tdone,ends);
                                    thread117751(tdone,ends);
                                    thread117752(tdone,ends);
                                    int biggest117753 = 0;
                                    if(ends[4]>=biggest117753){
                                      biggest117753=ends[4];
                                    }
                                    if(ends[5]>=biggest117753){
                                      biggest117753=ends[5];
                                    }
                                    if(ends[6]>=biggest117753){
                                      biggest117753=ends[6];
                                    }
                                    if(biggest117753 == 1){
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  thread117754(tdone,ends);
                                  thread117755(tdone,ends);
                                  int biggest117756 = 0;
                                  if(ends[2]>=biggest117756){
                                    biggest117756=ends[2];
                                  }
                                  if(ends[3]>=biggest117756){
                                    biggest117756=ends[3];
                                  }
                                  if(biggest117756 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 68, column: 9
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 36, column: 3
                                  i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                  S6285=0;
                                  S6247=0;
                                  if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                    S6247=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S6242=0;
                                    if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                      S6242=1;
                                      if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 33, column: 3
                                        S6285=1;
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
                                  i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 71, column: 6
                                  S6334=1;
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
                      S6296=1;
                      S6296=0;
                      if(!readyFiller_o.isPartnerPresent() || readyFiller_o.isPartnerPreempted()){//sysj\filler_controller.sysj line: 35, column: 3
                        readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 35, column: 3
                        S6296=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      else {
                        S6291=0;
                        if(readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 35, column: 3
                          readyFiller_o.setVal(false);//sysj\filler_controller.sysj line: 35, column: 3
                          S6291=1;
                          if(!readyFiller_o.isACK()){//sysj\filler_controller.sysj line: 35, column: 3
                            readyFiller_o.setREQ(false);//sysj\filler_controller.sysj line: 35, column: 3
                            ends[1]=2;
                            ;//sysj\filler_controller.sysj line: 35, column: 3
                            S6285=3;
                            liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 38, column: 5
                            currsigs.addElement(liquidAmount_1);
                            liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 38, column: 5
                            System.out.println("Emitted liquidAmount_1");
                            nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 39, column: 5
                            currsigs.addElement(nozzleSelect);
                            nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 39, column: 5
                            System.out.println("Emitted nozzleSelect");
                            S6334=0;
                            if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 41, column: 9
                              S6454=0;
                              if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 42, column: 22
                                S6454=1;
                                if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 51, column: 22
                                  if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 68, column: 9
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 36, column: 3
                                    i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                    S6285=0;
                                    S6247=0;
                                    if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                      S6247=1;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    else {
                                      S6242=0;
                                      if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                        S6242=1;
                                        if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                          liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                          ends[1]=2;
                                          ;//sysj\filler_controller.sysj line: 33, column: 3
                                          S6285=1;
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
                                    i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 71, column: 6
                                    S6334=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  thread117757(tdone,ends);
                                  thread117758(tdone,ends);
                                  thread117759(tdone,ends);
                                  int biggest117760 = 0;
                                  if(ends[4]>=biggest117760){
                                    biggest117760=ends[4];
                                  }
                                  if(ends[5]>=biggest117760){
                                    biggest117760=ends[5];
                                  }
                                  if(ends[6]>=biggest117760){
                                    biggest117760=ends[6];
                                  }
                                  if(biggest117760 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                thread117761(tdone,ends);
                                thread117762(tdone,ends);
                                int biggest117763 = 0;
                                if(ends[2]>=biggest117763){
                                  biggest117763=ends[2];
                                }
                                if(ends[3]>=biggest117763){
                                  biggest117763=ends[3];
                                }
                                if(biggest117763 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 68, column: 9
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 36, column: 3
                                i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                S6285=0;
                                S6247=0;
                                if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                  S6247=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S6242=0;
                                  if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                    S6242=1;
                                    if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 33, column: 3
                                      S6285=1;
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
                                i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 71, column: 6
                                S6334=1;
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
                  switch(S6334){
                    case 0 : 
                      switch(S6454){
                        case 0 : 
                          if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 42, column: 22
                            S6454=1;
                            if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 51, column: 22
                              if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 68, column: 9
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 36, column: 3
                                i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                S6285=0;
                                S6247=0;
                                if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                  S6247=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S6242=0;
                                  if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                    S6242=1;
                                    if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 33, column: 3
                                      S6285=1;
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
                                i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 71, column: 6
                                S6334=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              thread117764(tdone,ends);
                              thread117765(tdone,ends);
                              thread117766(tdone,ends);
                              int biggest117767 = 0;
                              if(ends[4]>=biggest117767){
                                biggest117767=ends[4];
                              }
                              if(ends[5]>=biggest117767){
                                biggest117767=ends[5];
                              }
                              if(ends[6]>=biggest117767){
                                biggest117767=ends[6];
                              }
                              if(biggest117767 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            thread117768(tdone,ends);
                            thread117769(tdone,ends);
                            int biggest117770 = 0;
                            if(ends[2]>=biggest117770){
                              biggest117770=ends[2];
                            }
                            if(ends[3]>=biggest117770){
                              biggest117770=ends[3];
                            }
                            if(biggest117770 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest117770 == 0){
                              S6454=1;
                              if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 51, column: 22
                                if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 68, column: 9
                                  ends[1]=2;
                                  ;//sysj\filler_controller.sysj line: 36, column: 3
                                  i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                  S6285=0;
                                  S6247=0;
                                  if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                    S6247=1;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  else {
                                    S6242=0;
                                    if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                      S6242=1;
                                      if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                        liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                        ends[1]=2;
                                        ;//sysj\filler_controller.sysj line: 33, column: 3
                                        S6285=1;
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
                                  i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 71, column: 6
                                  S6334=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                thread117771(tdone,ends);
                                thread117772(tdone,ends);
                                thread117773(tdone,ends);
                                int biggest117774 = 0;
                                if(ends[4]>=biggest117774){
                                  biggest117774=ends[4];
                                }
                                if(ends[5]>=biggest117774){
                                  biggest117774=ends[5];
                                }
                                if(ends[6]>=biggest117774){
                                  biggest117774=ends[6];
                                }
                                if(biggest117774 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                            }
                          }
                        
                        case 1 : 
                          if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 51, column: 22
                            if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 68, column: 9
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 36, column: 3
                              i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                              S6285=0;
                              S6247=0;
                              if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                S6247=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S6242=0;
                                if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                  S6242=1;
                                  if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 33, column: 3
                                    S6285=1;
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
                              i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 71, column: 6
                              S6334=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            thread117775(tdone,ends);
                            thread117776(tdone,ends);
                            thread117777(tdone,ends);
                            int biggest117778 = 0;
                            if(ends[4]>=biggest117778){
                              biggest117778=ends[4];
                            }
                            if(ends[5]>=biggest117778){
                              biggest117778=ends[5];
                            }
                            if(ends[6]>=biggest117778){
                              biggest117778=ends[6];
                            }
                            if(biggest117778 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest117778 == 0){
                              if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 68, column: 9
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 36, column: 3
                                i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                                S6285=0;
                                S6247=0;
                                if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                  S6247=1;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                else {
                                  S6242=0;
                                  if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                    S6242=1;
                                    if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                      liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                      ends[1]=2;
                                      ;//sysj\filler_controller.sysj line: 33, column: 3
                                      S6285=1;
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
                                i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 71, column: 6
                                S6334=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                          }
                        
                      }
                      break;
                    
                    case 1 : 
                      S6334=1;
                      liquidAmount_1.setPresent();//sysj\filler_controller.sysj line: 38, column: 5
                      currsigs.addElement(liquidAmount_1);
                      liquidAmount_1.setValue((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1));//sysj\filler_controller.sysj line: 38, column: 5
                      System.out.println("Emitted liquidAmount_1");
                      nozzleSelect.setPresent();//sysj\filler_controller.sysj line: 39, column: 5
                      currsigs.addElement(nozzleSelect);
                      nozzleSelect.setValue(i_thread_1);//sysj\filler_controller.sysj line: 39, column: 5
                      System.out.println("Emitted nozzleSelect");
                      S6334=0;
                      if((int)(liquidData_in.getVal() == null ? null : ((ArrayList)liquidData_in.getVal())).get(i_thread_1) != 0){//sysj\filler_controller.sysj line: 41, column: 9
                        S6454=0;
                        if(dosUnitFilled.getprestatus()){//sysj\filler_controller.sysj line: 42, column: 22
                          S6454=1;
                          if(dosUnitEvac.getprestatus() || done_1.getprestatus()){//sysj\filler_controller.sysj line: 51, column: 22
                            if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 68, column: 9
                              ends[1]=2;
                              ;//sysj\filler_controller.sysj line: 36, column: 3
                              i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                              S6285=0;
                              S6247=0;
                              if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                S6247=1;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              else {
                                S6242=0;
                                if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                  liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                                  S6242=1;
                                  if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                    liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                    ends[1]=2;
                                    ;//sysj\filler_controller.sysj line: 33, column: 3
                                    S6285=1;
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
                              i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 71, column: 6
                              S6334=1;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            thread117779(tdone,ends);
                            thread117780(tdone,ends);
                            thread117781(tdone,ends);
                            int biggest117782 = 0;
                            if(ends[4]>=biggest117782){
                              biggest117782=ends[4];
                            }
                            if(ends[5]>=biggest117782){
                              biggest117782=ends[5];
                            }
                            if(ends[6]>=biggest117782){
                              biggest117782=ends[6];
                            }
                            if(biggest117782 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          thread117783(tdone,ends);
                          thread117784(tdone,ends);
                          int biggest117785 = 0;
                          if(ends[2]>=biggest117785){
                            biggest117785=ends[2];
                          }
                          if(ends[3]>=biggest117785){
                            biggest117785=ends[3];
                          }
                          if(biggest117785 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        if(i_thread_1 == 3){//sysj\filler_controller.sysj line: 68, column: 9
                          ends[1]=2;
                          ;//sysj\filler_controller.sysj line: 36, column: 3
                          i_thread_1 = 0;//sysj\filler_controller.sysj line: 32, column: 3
                          S6285=0;
                          S6247=0;
                          if(!liquidData_in.isPartnerPresent() || liquidData_in.isPartnerPreempted()){//sysj\filler_controller.sysj line: 33, column: 3
                            liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                            S6247=1;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          else {
                            S6242=0;
                            if(!liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                              liquidData_in.setACK(true);//sysj\filler_controller.sysj line: 33, column: 3
                              S6242=1;
                              if(liquidData_in.isREQ()){//sysj\filler_controller.sysj line: 33, column: 3
                                liquidData_in.setACK(false);//sysj\filler_controller.sysj line: 33, column: 3
                                ends[1]=2;
                                ;//sysj\filler_controller.sysj line: 33, column: 3
                                S6285=1;
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
                          i_thread_1 = i_thread_1 + 1;//sysj\filler_controller.sysj line: 71, column: 6
                          S6334=1;
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
