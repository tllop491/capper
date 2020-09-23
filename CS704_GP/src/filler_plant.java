import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class filler_plant extends ClockDomain{
  public filler_plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.INPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.INPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.INPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.INPUT);
  public Signal nozzleSelect = new Signal("nozzleSelect", Signal.INPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.OUTPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.OUTPUT);
  public Signal nozzle0Engaged = new Signal("nozzle0Engaged", Signal.OUTPUT);
  public Signal nozzle1Engaged = new Signal("nozzle1Engaged", Signal.OUTPUT);
  public Signal nozzle2Engaged = new Signal("nozzle2Engaged", Signal.OUTPUT);
  public Signal nozzle3Engaged = new Signal("nozzle3Engaged", Signal.OUTPUT);
  public Signal injector0Engaged = new Signal("injector0Engaged", Signal.OUTPUT);
  public Signal injector1Engaged = new Signal("injector1Engaged", Signal.OUTPUT);
  public Signal injector2Engaged = new Signal("injector2Engaged", Signal.OUTPUT);
  public Signal injector3Engaged = new Signal("injector3Engaged", Signal.OUTPUT);
  public Signal inlet0Engaged = new Signal("inlet0Engaged", Signal.OUTPUT);
  public Signal inlet1Engaged = new Signal("inlet1Engaged", Signal.OUTPUT);
  public Signal inlet2Engaged = new Signal("inlet2Engaged", Signal.OUTPUT);
  public Signal inlet3Engaged = new Signal("inlet3Engaged", Signal.OUTPUT);
  private long __start_thread_4;//sysj\filler_plant.sysj line: 14, column: 44
  private long __start_thread_10;//sysj\filler_plant.sysj line: 14, column: 44
  private long __start_thread_16;//sysj\filler_plant.sysj line: 14, column: 44
  private long __start_thread_22;//sysj\filler_plant.sysj line: 14, column: 44
  private int S126957 = 1;
  private int S121047 = 1;
  private int S119570 = 1;
  private int S118462 = 1;
  private int S118437 = 1;
  private int S118209 = 1;
  private int S118123 = 1;
  private int S118098 = 1;
  private int S118151 = 1;
  private int S118445 = 1;
  private int S118453 = 1;
  private int S119569 = 1;
  private int S118830 = 1;
  private int S118805 = 1;
  private int S118577 = 1;
  private int S118491 = 1;
  private int S118519 = 1;
  private int S118813 = 1;
  private int S118821 = 1;
  private int S119568 = 1;
  private int S119198 = 1;
  private int S119173 = 1;
  private int S118945 = 1;
  private int S118859 = 1;
  private int S118887 = 1;
  private int S119181 = 1;
  private int S119189 = 1;
  private int S119566 = 1;
  private int S119541 = 1;
  private int S119313 = 1;
  private int S119227 = 1;
  private int S119255 = 1;
  private int S119549 = 1;
  private int S119557 = 1;
  
  private int[] ends = new int[26];
  private int[] tdone = new int[26];
  
  public void thread127020(int [] tdone, int [] ends){
        active[25]=0;
    ends[25]=0;
    tdone[25]=1;
  }

  public void thread127019(int [] tdone, int [] ends){
        switch(S119557){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 24
          inlet3Engaged.setPresent();//sysj\filler_plant.sysj line: 31, column: 41
          currsigs.addElement(inlet3Engaged);
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        else {
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        break;
      
    }
  }

  public void thread127018(int [] tdone, int [] ends){
        switch(S119549){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 24
          injector3Engaged.setPresent();//sysj\filler_plant.sysj line: 27, column: 44
          currsigs.addElement(injector3Engaged);
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        else {
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        break;
      
    }
  }

  public void thread127017(int [] tdone, int [] ends){
        switch(S119541){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S119313){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S119313=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S119313=2;
                active[22]=1;
                ends[22]=1;
                tdone[22]=1;
              }
              else {
                S119255=0;
                __start_thread_22 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[22]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S119255=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
              }
            }
            else {
              switch(S119227){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                    ends[22]=4;
                    ;//sysj\filler_plant.sysj line: 14, column: 44
                    S119227=1;
                    dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                    currsigs.addElement(dosUnitFilled);
                    active[22]=1;
                    ends[22]=1;
                    tdone[22]=1;
                  }
                  else {
                    active[22]=1;
                    ends[22]=1;
                    tdone[22]=1;
                  }
                  break;
                
                case 1 : 
                  dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                  currsigs.addElement(dosUnitFilled);
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
              S119313=2;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              switch(S119255){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                    ends[22]=3;
                    ;//sysj\filler_plant.sysj line: 18, column: 42
                    S119255=1;
                    dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                    currsigs.addElement(dosUnitEvac);
                    active[22]=1;
                    ends[22]=1;
                    tdone[22]=1;
                  }
                  else {
                    active[22]=1;
                    ends[22]=1;
                    tdone[22]=1;
                  }
                  break;
                
                case 1 : 
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S119313=2;
            S119313=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S119313=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S119313=2;
                active[22]=1;
                ends[22]=1;
                tdone[22]=1;
              }
              else {
                S119255=0;
                __start_thread_22 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[22]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S119255=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
                else {
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                }
              }
            }
            else {
              S119227=0;
              __start_thread_22 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                ends[22]=4;
                ;//sysj\filler_plant.sysj line: 14, column: 44
                S119227=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                currsigs.addElement(dosUnitFilled);
                active[22]=1;
                ends[22]=1;
                tdone[22]=1;
              }
              else {
                active[22]=1;
                ends[22]=1;
                tdone[22]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread127016(int [] tdone, int [] ends){
        switch(S119566){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        thread127017(tdone,ends);
        thread127018(tdone,ends);
        thread127019(tdone,ends);
        thread127020(tdone,ends);
        int biggest127021 = 0;
        if(ends[22]>=biggest127021){
          biggest127021=ends[22];
        }
        if(ends[23]>=biggest127021){
          biggest127021=ends[23];
        }
        if(ends[24]>=biggest127021){
          biggest127021=ends[24];
        }
        if(ends[25]>=biggest127021){
          biggest127021=ends[25];
        }
        if(biggest127021 == 1){
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        //FINXME code
        if(biggest127021 == 0){
          S119566=0;
          active[21]=0;
          ends[21]=0;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread127015(int [] tdone, int [] ends){
        active[20]=0;
    ends[20]=0;
    tdone[20]=1;
  }

  public void thread127012(int [] tdone, int [] ends){
        active[19]=0;
    ends[19]=0;
    tdone[19]=1;
  }

  public void thread127011(int [] tdone, int [] ends){
        switch(S119189){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 24
          inlet2Engaged.setPresent();//sysj\filler_plant.sysj line: 31, column: 41
          currsigs.addElement(inlet2Engaged);
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        else {
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread127010(int [] tdone, int [] ends){
        switch(S119181){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 24
          injector2Engaged.setPresent();//sysj\filler_plant.sysj line: 27, column: 44
          currsigs.addElement(injector2Engaged);
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        else {
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread127009(int [] tdone, int [] ends){
        switch(S119173){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S118945){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S118945=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S118945=2;
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
              else {
                S118887=0;
                __start_thread_16 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[16]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S118887=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[16]=1;
                  ends[16]=1;
                  tdone[16]=1;
                }
                else {
                  active[16]=1;
                  ends[16]=1;
                  tdone[16]=1;
                }
              }
            }
            else {
              switch(S118859){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                    ends[16]=4;
                    ;//sysj\filler_plant.sysj line: 14, column: 44
                    S118859=1;
                    dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                    currsigs.addElement(dosUnitFilled);
                    active[16]=1;
                    ends[16]=1;
                    tdone[16]=1;
                  }
                  else {
                    active[16]=1;
                    ends[16]=1;
                    tdone[16]=1;
                  }
                  break;
                
                case 1 : 
                  dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                  currsigs.addElement(dosUnitFilled);
                  active[16]=1;
                  ends[16]=1;
                  tdone[16]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
              S118945=2;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              switch(S118887){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                    ends[16]=3;
                    ;//sysj\filler_plant.sysj line: 18, column: 42
                    S118887=1;
                    dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                    currsigs.addElement(dosUnitEvac);
                    active[16]=1;
                    ends[16]=1;
                    tdone[16]=1;
                  }
                  else {
                    active[16]=1;
                    ends[16]=1;
                    tdone[16]=1;
                  }
                  break;
                
                case 1 : 
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[16]=1;
                  ends[16]=1;
                  tdone[16]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S118945=2;
            S118945=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S118945=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S118945=2;
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
              else {
                S118887=0;
                __start_thread_16 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[16]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S118887=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[16]=1;
                  ends[16]=1;
                  tdone[16]=1;
                }
                else {
                  active[16]=1;
                  ends[16]=1;
                  tdone[16]=1;
                }
              }
            }
            else {
              S118859=0;
              __start_thread_16 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                ends[16]=4;
                ;//sysj\filler_plant.sysj line: 14, column: 44
                S118859=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                currsigs.addElement(dosUnitFilled);
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
              else {
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread127008(int [] tdone, int [] ends){
        switch(S119198){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        thread127009(tdone,ends);
        thread127010(tdone,ends);
        thread127011(tdone,ends);
        thread127012(tdone,ends);
        int biggest127013 = 0;
        if(ends[16]>=biggest127013){
          biggest127013=ends[16];
        }
        if(ends[17]>=biggest127013){
          biggest127013=ends[17];
        }
        if(ends[18]>=biggest127013){
          biggest127013=ends[18];
        }
        if(ends[19]>=biggest127013){
          biggest127013=ends[19];
        }
        if(biggest127013 == 1){
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        //FINXME code
        if(biggest127013 == 0){
          S119198=0;
          active[15]=0;
          ends[15]=0;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread127007(int [] tdone, int [] ends){
        active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread127004(int [] tdone, int [] ends){
        active[13]=0;
    ends[13]=0;
    tdone[13]=1;
  }

  public void thread127003(int [] tdone, int [] ends){
        switch(S118821){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 24
          inlet1Engaged.setPresent();//sysj\filler_plant.sysj line: 31, column: 41
          currsigs.addElement(inlet1Engaged);
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread127002(int [] tdone, int [] ends){
        switch(S118813){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 24
          injector1Engaged.setPresent();//sysj\filler_plant.sysj line: 27, column: 44
          currsigs.addElement(injector1Engaged);
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread127001(int [] tdone, int [] ends){
        switch(S118805){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S118577){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S118577=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S118577=2;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S118519=0;
                __start_thread_10 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[10]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S118519=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
              }
            }
            else {
              switch(S118491){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                    ends[10]=4;
                    ;//sysj\filler_plant.sysj line: 14, column: 44
                    S118491=1;
                    dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                    currsigs.addElement(dosUnitFilled);
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                  else {
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                  break;
                
                case 1 : 
                  dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                  currsigs.addElement(dosUnitFilled);
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
              S118577=2;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              switch(S118519){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                    ends[10]=3;
                    ;//sysj\filler_plant.sysj line: 18, column: 42
                    S118519=1;
                    dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                    currsigs.addElement(dosUnitEvac);
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                  else {
                    active[10]=1;
                    ends[10]=1;
                    tdone[10]=1;
                  }
                  break;
                
                case 1 : 
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S118577=2;
            S118577=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S118577=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S118577=2;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S118519=0;
                __start_thread_10 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[10]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S118519=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
                else {
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                }
              }
            }
            else {
              S118491=0;
              __start_thread_10 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                ends[10]=4;
                ;//sysj\filler_plant.sysj line: 14, column: 44
                S118491=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                currsigs.addElement(dosUnitFilled);
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread127000(int [] tdone, int [] ends){
        switch(S118830){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        thread127001(tdone,ends);
        thread127002(tdone,ends);
        thread127003(tdone,ends);
        thread127004(tdone,ends);
        int biggest127005 = 0;
        if(ends[10]>=biggest127005){
          biggest127005=ends[10];
        }
        if(ends[11]>=biggest127005){
          biggest127005=ends[11];
        }
        if(ends[12]>=biggest127005){
          biggest127005=ends[12];
        }
        if(ends[13]>=biggest127005){
          biggest127005=ends[13];
        }
        if(biggest127005 == 1){
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        //FINXME code
        if(biggest127005 == 0){
          S118830=0;
          active[9]=0;
          ends[9]=0;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread126999(int [] tdone, int [] ends){
        active[8]=0;
    ends[8]=0;
    tdone[8]=1;
  }

  public void thread126996(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread126995(int [] tdone, int [] ends){
        switch(S118453){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 24
          inlet0Engaged.setPresent();//sysj\filler_plant.sysj line: 31, column: 41
          currsigs.addElement(inlet0Engaged);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread126994(int [] tdone, int [] ends){
        switch(S118445){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 24
          injector0Engaged.setPresent();//sysj\filler_plant.sysj line: 27, column: 44
          currsigs.addElement(injector0Engaged);
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread126993(int [] tdone, int [] ends){
        switch(S118437){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S118209){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S118209=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S118209=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S118151=0;
                __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[4]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S118151=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
              }
            }
            else {
              switch(S118123){
                case 0 : 
                  switch(S118098){
                    case 0 : 
                      S118098=0;
                      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                        ends[4]=4;
                        ;//sysj\filler_plant.sysj line: 14, column: 44
                        S118123=1;
                        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                        currsigs.addElement(dosUnitFilled);
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S118098=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                    case 1 : 
                      S118098=1;
                      S118098=0;
                      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                        ends[4]=4;
                        ;//sysj\filler_plant.sysj line: 14, column: 44
                        S118123=1;
                        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                        currsigs.addElement(dosUnitFilled);
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S118098=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                  currsigs.addElement(dosUnitFilled);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
              S118209=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              switch(S118151){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                    ends[4]=3;
                    ;//sysj\filler_plant.sysj line: 18, column: 42
                    S118151=1;
                    dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                    currsigs.addElement(dosUnitEvac);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  break;
                
                case 1 : 
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S118209=2;
            S118209=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S118209=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S118209=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S118151=0;
                __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[4]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S118151=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
              }
            }
            else {
              S118123=0;
              __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
              S118098=0;
              if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                ends[4]=4;
                ;//sysj\filler_plant.sysj line: 14, column: 44
                S118123=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                currsigs.addElement(dosUnitFilled);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S118098=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread126992(int [] tdone, int [] ends){
        switch(S118462){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread126993(tdone,ends);
        thread126994(tdone,ends);
        thread126995(tdone,ends);
        thread126996(tdone,ends);
        int biggest126997 = 0;
        if(ends[4]>=biggest126997){
          biggest126997=ends[4];
        }
        if(ends[5]>=biggest126997){
          biggest126997=ends[5];
        }
        if(ends[6]>=biggest126997){
          biggest126997=ends[6];
        }
        if(ends[7]>=biggest126997){
          biggest126997=ends[7];
        }
        if(biggest126997 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest126997 == 0){
          S118462=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread126991(int [] tdone, int [] ends){
        active[2]=0;
    ends[2]=0;
    tdone[2]=1;
  }

  public void thread126988(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 35, column: 12
      ;//sysj\filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 36, column: 12
        ;//sysj\filler_plant.sysj line: 36, column: 52
        ends[25]=2;
        tdone[25]=1;
      }
      else {
        ends[25]=2;
        tdone[25]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 36, column: 12
        ;//sysj\filler_plant.sysj line: 36, column: 52
        ends[25]=2;
        tdone[25]=1;
      }
      else {
        ends[25]=2;
        tdone[25]=1;
      }
    }
  }

  public void thread126987(int [] tdone, int [] ends){
        S119557=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 24
      inlet3Engaged.setPresent();//sysj\filler_plant.sysj line: 31, column: 41
      currsigs.addElement(inlet3Engaged);
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread126986(int [] tdone, int [] ends){
        S119549=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 24
      injector3Engaged.setPresent();//sysj\filler_plant.sysj line: 27, column: 44
      currsigs.addElement(injector3Engaged);
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
    else {
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread126985(int [] tdone, int [] ends){
        S119541=1;
    S119313=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
      S119313=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
        S119313=2;
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
      }
      else {
        S119255=0;
        __start_thread_22 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
          ends[22]=3;
          ;//sysj\filler_plant.sysj line: 18, column: 42
          S119255=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
          currsigs.addElement(dosUnitEvac);
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
        else {
          active[22]=1;
          ends[22]=1;
          tdone[22]=1;
        }
      }
    }
    else {
      S119227=0;
      __start_thread_22 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
        ends[22]=4;
        ;//sysj\filler_plant.sysj line: 14, column: 44
        S119227=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
        currsigs.addElement(dosUnitFilled);
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
      }
      else {
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
      }
    }
  }

  public void thread126984(int [] tdone, int [] ends){
        S119566=1;
    thread126985(tdone,ends);
    thread126986(tdone,ends);
    thread126987(tdone,ends);
    thread126988(tdone,ends);
    int biggest126989 = 0;
    if(ends[22]>=biggest126989){
      biggest126989=ends[22];
    }
    if(ends[23]>=biggest126989){
      biggest126989=ends[23];
    }
    if(ends[24]>=biggest126989){
      biggest126989=ends[24];
    }
    if(ends[25]>=biggest126989){
      biggest126989=ends[25];
    }
    if(biggest126989 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest126989 == 2){
      ends[21]=2;
      ;//sysj\filler_plant.sysj line: 11, column: 2
      S119566=0;
      active[21]=0;
      ends[21]=0;
      tdone[21]=1;
    }
  }

  public void thread126983(int [] tdone, int [] ends){
        active[20]=0;
    ends[20]=0;
    tdone[20]=1;
  }

  public void thread126980(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 35, column: 12
      ;//sysj\filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 36, column: 12
        ;//sysj\filler_plant.sysj line: 36, column: 52
        ends[19]=2;
        tdone[19]=1;
      }
      else {
        ends[19]=2;
        tdone[19]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 36, column: 12
        ;//sysj\filler_plant.sysj line: 36, column: 52
        ends[19]=2;
        tdone[19]=1;
      }
      else {
        ends[19]=2;
        tdone[19]=1;
      }
    }
  }

  public void thread126979(int [] tdone, int [] ends){
        S119189=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 24
      inlet2Engaged.setPresent();//sysj\filler_plant.sysj line: 31, column: 41
      currsigs.addElement(inlet2Engaged);
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
    else {
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread126978(int [] tdone, int [] ends){
        S119181=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 24
      injector2Engaged.setPresent();//sysj\filler_plant.sysj line: 27, column: 44
      currsigs.addElement(injector2Engaged);
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread126977(int [] tdone, int [] ends){
        S119173=1;
    S118945=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
      S118945=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
        S118945=2;
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
      else {
        S118887=0;
        __start_thread_16 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
          ends[16]=3;
          ;//sysj\filler_plant.sysj line: 18, column: 42
          S118887=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
          currsigs.addElement(dosUnitEvac);
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        else {
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
      }
    }
    else {
      S118859=0;
      __start_thread_16 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
        ends[16]=4;
        ;//sysj\filler_plant.sysj line: 14, column: 44
        S118859=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
        currsigs.addElement(dosUnitFilled);
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
      else {
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
    }
  }

  public void thread126976(int [] tdone, int [] ends){
        S119198=1;
    thread126977(tdone,ends);
    thread126978(tdone,ends);
    thread126979(tdone,ends);
    thread126980(tdone,ends);
    int biggest126981 = 0;
    if(ends[16]>=biggest126981){
      biggest126981=ends[16];
    }
    if(ends[17]>=biggest126981){
      biggest126981=ends[17];
    }
    if(ends[18]>=biggest126981){
      biggest126981=ends[18];
    }
    if(ends[19]>=biggest126981){
      biggest126981=ends[19];
    }
    if(biggest126981 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    if(biggest126981 == 2){
      ends[15]=2;
      ;//sysj\filler_plant.sysj line: 11, column: 2
      S119198=0;
      active[15]=0;
      ends[15]=0;
      tdone[15]=1;
    }
  }

  public void thread126975(int [] tdone, int [] ends){
        active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread126972(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 35, column: 12
      ;//sysj\filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 36, column: 12
        ;//sysj\filler_plant.sysj line: 36, column: 52
        ends[13]=2;
        tdone[13]=1;
      }
      else {
        ends[13]=2;
        tdone[13]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 36, column: 12
        ;//sysj\filler_plant.sysj line: 36, column: 52
        ends[13]=2;
        tdone[13]=1;
      }
      else {
        ends[13]=2;
        tdone[13]=1;
      }
    }
  }

  public void thread126971(int [] tdone, int [] ends){
        S118821=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 24
      inlet1Engaged.setPresent();//sysj\filler_plant.sysj line: 31, column: 41
      currsigs.addElement(inlet1Engaged);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread126970(int [] tdone, int [] ends){
        S118813=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 24
      injector1Engaged.setPresent();//sysj\filler_plant.sysj line: 27, column: 44
      currsigs.addElement(injector1Engaged);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread126969(int [] tdone, int [] ends){
        S118805=1;
    S118577=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
      S118577=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
        S118577=2;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S118519=0;
        __start_thread_10 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
          ends[10]=3;
          ;//sysj\filler_plant.sysj line: 18, column: 42
          S118519=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
          currsigs.addElement(dosUnitEvac);
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
      }
    }
    else {
      S118491=0;
      __start_thread_10 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
        ends[10]=4;
        ;//sysj\filler_plant.sysj line: 14, column: 44
        S118491=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
        currsigs.addElement(dosUnitFilled);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
    }
  }

  public void thread126968(int [] tdone, int [] ends){
        S118830=1;
    thread126969(tdone,ends);
    thread126970(tdone,ends);
    thread126971(tdone,ends);
    thread126972(tdone,ends);
    int biggest126973 = 0;
    if(ends[10]>=biggest126973){
      biggest126973=ends[10];
    }
    if(ends[11]>=biggest126973){
      biggest126973=ends[11];
    }
    if(ends[12]>=biggest126973){
      biggest126973=ends[12];
    }
    if(ends[13]>=biggest126973){
      biggest126973=ends[13];
    }
    if(biggest126973 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    if(biggest126973 == 2){
      ends[9]=2;
      ;//sysj\filler_plant.sysj line: 11, column: 2
      S118830=0;
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
  }

  public void thread126967(int [] tdone, int [] ends){
        active[8]=0;
    ends[8]=0;
    tdone[8]=1;
  }

  public void thread126964(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 35, column: 12
      ;//sysj\filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 36, column: 12
        ;//sysj\filler_plant.sysj line: 36, column: 52
        ends[7]=2;
        tdone[7]=1;
      }
      else {
        ends[7]=2;
        tdone[7]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 36, column: 12
        ;//sysj\filler_plant.sysj line: 36, column: 52
        ends[7]=2;
        tdone[7]=1;
      }
      else {
        ends[7]=2;
        tdone[7]=1;
      }
    }
  }

  public void thread126963(int [] tdone, int [] ends){
        S118453=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 24
      inlet0Engaged.setPresent();//sysj\filler_plant.sysj line: 31, column: 41
      currsigs.addElement(inlet0Engaged);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread126962(int [] tdone, int [] ends){
        S118445=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 24
      injector0Engaged.setPresent();//sysj\filler_plant.sysj line: 27, column: 44
      currsigs.addElement(injector0Engaged);
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
    else {
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread126961(int [] tdone, int [] ends){
        S118437=1;
    S118209=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
      S118209=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
        S118209=2;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S118151=0;
        __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
          ends[4]=3;
          ;//sysj\filler_plant.sysj line: 18, column: 42
          S118151=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
          currsigs.addElement(dosUnitEvac);
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        else {
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
      }
    }
    else {
      S118123=0;
      __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
      S118098=0;
      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
        ends[4]=4;
        ;//sysj\filler_plant.sysj line: 14, column: 44
        S118123=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
        currsigs.addElement(dosUnitFilled);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S118098=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
  }

  public void thread126960(int [] tdone, int [] ends){
        S118462=1;
    thread126961(tdone,ends);
    thread126962(tdone,ends);
    thread126963(tdone,ends);
    thread126964(tdone,ends);
    int biggest126965 = 0;
    if(ends[4]>=biggest126965){
      biggest126965=ends[4];
    }
    if(ends[5]>=biggest126965){
      biggest126965=ends[5];
    }
    if(ends[6]>=biggest126965){
      biggest126965=ends[6];
    }
    if(ends[7]>=biggest126965){
      biggest126965=ends[7];
    }
    if(biggest126965 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest126965 == 2){
      ends[3]=2;
      ;//sysj\filler_plant.sysj line: 11, column: 2
      S118462=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread126959(int [] tdone, int [] ends){
        active[2]=0;
    ends[2]=0;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S126957){
        case 0 : 
          S126957=0;
          break RUN;
        
        case 1 : 
          S126957=2;
          S126957=2;
          S121047=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S121047){
            case 0 : 
              if(nozzleSelect.getprestatus()){//sysj\filler_plant.sysj line: 55, column: 10
                S121047=1;
                if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 0){//sysj\filler_plant.sysj line: 58, column: 5
                  S119570=0;
                  thread126959(tdone,ends);
                  thread126960(tdone,ends);
                  int biggest126966 = 0;
                  if(ends[2]>=biggest126966){
                    biggest126966=ends[2];
                  }
                  if(ends[3]>=biggest126966){
                    biggest126966=ends[3];
                  }
                  if(biggest126966 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest126966 == 0){
                    S121047=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S119570=1;
                  if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 1){//sysj\filler_plant.sysj line: 62, column: 5
                    S119569=0;
                    thread126967(tdone,ends);
                    thread126968(tdone,ends);
                    int biggest126974 = 0;
                    if(ends[8]>=biggest126974){
                      biggest126974=ends[8];
                    }
                    if(ends[9]>=biggest126974){
                      biggest126974=ends[9];
                    }
                    if(biggest126974 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest126974 == 0){
                      S121047=2;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S119569=1;
                    if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 2){//sysj\filler_plant.sysj line: 66, column: 5
                      S119568=0;
                      thread126975(tdone,ends);
                      thread126976(tdone,ends);
                      int biggest126982 = 0;
                      if(ends[14]>=biggest126982){
                        biggest126982=ends[14];
                      }
                      if(ends[15]>=biggest126982){
                        biggest126982=ends[15];
                      }
                      if(biggest126982 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest126982 == 0){
                        S121047=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S119568=1;
                      if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 3){//sysj\filler_plant.sysj line: 70, column: 5
                        thread126983(tdone,ends);
                        thread126984(tdone,ends);
                        int biggest126990 = 0;
                        if(ends[20]>=biggest126990){
                          biggest126990=ends[20];
                        }
                        if(ends[21]>=biggest126990){
                          biggest126990=ends[21];
                        }
                        if(biggest126990 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest126990 == 0){
                          S121047=2;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S121047=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                  }
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              switch(S119570){
                case 0 : 
                  thread126991(tdone,ends);
                  thread126992(tdone,ends);
                  int biggest126998 = 0;
                  if(ends[2]>=biggest126998){
                    biggest126998=ends[2];
                  }
                  if(ends[3]>=biggest126998){
                    biggest126998=ends[3];
                  }
                  if(biggest126998 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest126998 == 0){
                    S121047=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  switch(S119569){
                    case 0 : 
                      thread126999(tdone,ends);
                      thread127000(tdone,ends);
                      int biggest127006 = 0;
                      if(ends[8]>=biggest127006){
                        biggest127006=ends[8];
                      }
                      if(ends[9]>=biggest127006){
                        biggest127006=ends[9];
                      }
                      if(biggest127006 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest127006 == 0){
                        S121047=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      switch(S119568){
                        case 0 : 
                          thread127007(tdone,ends);
                          thread127008(tdone,ends);
                          int biggest127014 = 0;
                          if(ends[14]>=biggest127014){
                            biggest127014=ends[14];
                          }
                          if(ends[15]>=biggest127014){
                            biggest127014=ends[15];
                          }
                          if(biggest127014 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          //FINXME code
                          if(biggest127014 == 0){
                            S121047=2;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          thread127015(tdone,ends);
                          thread127016(tdone,ends);
                          int biggest127022 = 0;
                          if(ends[20]>=biggest127022){
                            biggest127022=ends[20];
                          }
                          if(ends[21]>=biggest127022){
                            biggest127022=ends[21];
                          }
                          if(biggest127022 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          //FINXME code
                          if(biggest127022 == 0){
                            S121047=2;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                      }
                      break;
                    
                  }
                  break;
                
              }
              break;
            
            case 2 : 
              S121047=2;
              S121047=0;
              active[1]=1;
              ends[1]=1;
              break RUN;
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          valveInjectorOnOff.gethook();
          valveInletOnOff.gethook();
          dosUnitValveRetract.gethook();
          dosUnitValveExtend.gethook();
          nozzleSelect.gethook();
          df = true;
        }
        runClockDomain();
      }
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      nozzleSelect.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      nozzle0Engaged.setpreclear();
      nozzle1Engaged.setpreclear();
      nozzle2Engaged.setpreclear();
      nozzle3Engaged.setpreclear();
      injector0Engaged.setpreclear();
      injector1Engaged.setpreclear();
      injector2Engaged.setpreclear();
      injector3Engaged.setpreclear();
      inlet0Engaged.setpreclear();
      inlet1Engaged.setpreclear();
      inlet2Engaged.setpreclear();
      inlet3Engaged.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = valveInjectorOnOff.getStatus() ? valveInjectorOnOff.setprepresent() : valveInjectorOnOff.setpreclear();
      valveInjectorOnOff.setpreval(valveInjectorOnOff.getValue());
      valveInjectorOnOff.setClear();
      dummyint = valveInletOnOff.getStatus() ? valveInletOnOff.setprepresent() : valveInletOnOff.setpreclear();
      valveInletOnOff.setpreval(valveInletOnOff.getValue());
      valveInletOnOff.setClear();
      dummyint = dosUnitValveRetract.getStatus() ? dosUnitValveRetract.setprepresent() : dosUnitValveRetract.setpreclear();
      dosUnitValveRetract.setpreval(dosUnitValveRetract.getValue());
      dosUnitValveRetract.setClear();
      dummyint = dosUnitValveExtend.getStatus() ? dosUnitValveExtend.setprepresent() : dosUnitValveExtend.setpreclear();
      dosUnitValveExtend.setpreval(dosUnitValveExtend.getValue());
      dosUnitValveExtend.setClear();
      dummyint = nozzleSelect.getStatus() ? nozzleSelect.setprepresent() : nozzleSelect.setpreclear();
      nozzleSelect.setpreval(nozzleSelect.getValue());
      nozzleSelect.setClear();
      dosUnitEvac.sethook();
      dosUnitEvac.setClear();
      dosUnitFilled.sethook();
      dosUnitFilled.setClear();
      nozzle0Engaged.sethook();
      nozzle0Engaged.setClear();
      nozzle1Engaged.sethook();
      nozzle1Engaged.setClear();
      nozzle2Engaged.sethook();
      nozzle2Engaged.setClear();
      nozzle3Engaged.sethook();
      nozzle3Engaged.setClear();
      injector0Engaged.sethook();
      injector0Engaged.setClear();
      injector1Engaged.sethook();
      injector1Engaged.setClear();
      injector2Engaged.sethook();
      injector2Engaged.setClear();
      injector3Engaged.sethook();
      injector3Engaged.setClear();
      inlet0Engaged.sethook();
      inlet0Engaged.setClear();
      inlet1Engaged.sethook();
      inlet1Engaged.setClear();
      inlet2Engaged.sethook();
      inlet2Engaged.setClear();
      inlet3Engaged.sethook();
      inlet3Engaged.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
        nozzleSelect.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
