import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

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
  public Signal en = new Signal("en", Signal.INPUT);
  public Signal liquidData = new Signal("liquidData", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  public Signal nozzleSelect = new Signal("nozzleSelect", Signal.OUTPUT);
  public Signal status = new Signal("status", Signal.OUTPUT);
  private int S178 = 1;
  private int S58 = 1;
  private int S23 = 1;
  private int S5 = 1;
  private int S10 = 1;
  private int S28 = 1;
  private int S33 = 1;
  
  private int[] ends = new int[6];
  private int[] tdone = new int[6];
  
  public void thread193(int [] tdone, int [] ends){
        switch(S33){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj/filler_controller.sysj line: 40, column: 6
        currsigs.addElement(dosUnitValveExtend);
        System.out.println("Emitted dosUnitValveExtend");
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread192(int [] tdone, int [] ends){
        switch(S28){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj/filler_controller.sysj line: 36, column: 6
        currsigs.addElement(valveInletOnOff);
        System.out.println("Emitted valveInletOnOff");
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread190(int [] tdone, int [] ends){
        S33=1;
    dosUnitValveExtend.setPresent();//sysj/filler_controller.sysj line: 40, column: 6
    currsigs.addElement(dosUnitValveExtend);
    System.out.println("Emitted dosUnitValveExtend");
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread189(int [] tdone, int [] ends){
        S28=1;
    valveInletOnOff.setPresent();//sysj/filler_controller.sysj line: 36, column: 6
    currsigs.addElement(valveInletOnOff);
    System.out.println("Emitted valveInletOnOff");
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread187(int [] tdone, int [] ends){
        switch(S10){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj/filler_controller.sysj line: 31, column: 6
        currsigs.addElement(dosUnitValveRetract);
        System.out.println("Emitted dosUnitValveRetract");
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread186(int [] tdone, int [] ends){
        switch(S5){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj/filler_controller.sysj line: 27, column: 6
        currsigs.addElement(valveInjectorOnOff);
        System.out.println("Emitted valveInjectorOnOff");
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread184(int [] tdone, int [] ends){
        S33=1;
    dosUnitValveExtend.setPresent();//sysj/filler_controller.sysj line: 40, column: 6
    currsigs.addElement(dosUnitValveExtend);
    System.out.println("Emitted dosUnitValveExtend");
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread183(int [] tdone, int [] ends){
        S28=1;
    valveInletOnOff.setPresent();//sysj/filler_controller.sysj line: 36, column: 6
    currsigs.addElement(valveInletOnOff);
    System.out.println("Emitted valveInletOnOff");
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread181(int [] tdone, int [] ends){
        S10=1;
    dosUnitValveRetract.setPresent();//sysj/filler_controller.sysj line: 31, column: 6
    currsigs.addElement(dosUnitValveRetract);
    System.out.println("Emitted dosUnitValveRetract");
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread180(int [] tdone, int [] ends){
        S5=1;
    valveInjectorOnOff.setPresent();//sysj/filler_controller.sysj line: 27, column: 6
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
      switch(S178){
        case 0 : 
          S178=0;
          break RUN;
        
        case 1 : 
          S178=2;
          S178=2;
          S58=0;
          S23=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S58){
            case 0 : 
              if(!en.getprestatus()){//sysj/filler_controller.sysj line: 23, column: 9
                S58=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                switch(S23){
                  case 0 : 
                    if(bottleAtPos2.getprestatus()){//sysj/filler_controller.sysj line: 24, column: 10
                      S23=1;
                      thread180(tdone,ends);
                      thread181(tdone,ends);
                      int biggest182 = 0;
                      if(ends[2]>=biggest182){
                        biggest182=ends[2];
                      }
                      if(ends[3]>=biggest182){
                        biggest182=ends[3];
                      }
                      if(biggest182 == 1){
                        active[1]=1;
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
                    if(dosUnitFilled.getprestatus()){//sysj/filler_controller.sysj line: 25, column: 10
                      S23=2;
                      thread183(tdone,ends);
                      thread184(tdone,ends);
                      int biggest185 = 0;
                      if(ends[4]>=biggest185){
                        biggest185=ends[4];
                      }
                      if(ends[5]>=biggest185){
                        biggest185=ends[5];
                      }
                      if(biggest185 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      thread186(tdone,ends);
                      thread187(tdone,ends);
                      int biggest188 = 0;
                      if(ends[2]>=biggest188){
                        biggest188=ends[2];
                      }
                      if(ends[3]>=biggest188){
                        biggest188=ends[3];
                      }
                      if(biggest188 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest188 == 0){
                        S23=2;
                        thread189(tdone,ends);
                        thread190(tdone,ends);
                        int biggest191 = 0;
                        if(ends[4]>=biggest191){
                          biggest191=ends[4];
                        }
                        if(ends[5]>=biggest191){
                          biggest191=ends[5];
                        }
                        if(biggest191 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                    }
                  
                  case 2 : 
                    if(dosUnitEvac.getprestatus()){//sysj/filler_controller.sysj line: 34, column: 10
                      S58=1;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    else {
                      thread192(tdone,ends);
                      thread193(tdone,ends);
                      int biggest194 = 0;
                      if(ends[4]>=biggest194){
                        biggest194=ends[4];
                      }
                      if(ends[5]>=biggest194){
                        biggest194=ends[5];
                      }
                      if(biggest194 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest194 == 0){
                        S58=1;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                  
                }
              }
              break;
            
            case 1 : 
              S58=1;
              S58=0;
              S23=0;
              active[1]=1;
              ends[1]=1;
              break RUN;
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0};
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
          bottleAtPos2.gethook();
          dosUnitEvac.gethook();
          dosUnitFilled.gethook();
          en.gethook();
          liquidData.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      en.setpreclear();
      liquidData.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      nozzleSelect.setpreclear();
      status.setpreclear();
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
      dummyint = en.getStatus() ? en.setprepresent() : en.setpreclear();
      en.setpreval(en.getValue());
      en.setClear();
      dummyint = liquidData.getStatus() ? liquidData.setprepresent() : liquidData.setpreclear();
      liquidData.setpreval(liquidData.getValue());
      liquidData.setClear();
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
      status.sethook();
      status.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        bottleAtPos2.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
        en.gethook();
        liquidData.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
