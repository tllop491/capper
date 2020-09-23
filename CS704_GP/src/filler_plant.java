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
  private int S127003 = 1;
  private int S121093 = 1;
  private int S119616 = 1;
  private int S118508 = 1;
  private int S118483 = 1;
  private int S118255 = 1;
  private int S118169 = 1;
  private int S118144 = 1;
  private int S118197 = 1;
  private int S118491 = 1;
  private int S118499 = 1;
  private int S119615 = 1;
  private int S118876 = 1;
  private int S118851 = 1;
  private int S118623 = 1;
  private int S118537 = 1;
  private int S118565 = 1;
  private int S118859 = 1;
  private int S118867 = 1;
  private int S119614 = 1;
  private int S119244 = 1;
  private int S119219 = 1;
  private int S118991 = 1;
  private int S118905 = 1;
  private int S118933 = 1;
  private int S119227 = 1;
  private int S119235 = 1;
  private int S119612 = 1;
  private int S119587 = 1;
  private int S119359 = 1;
  private int S119273 = 1;
  private int S119301 = 1;
  private int S119595 = 1;
  private int S119603 = 1;
  
  private int[] ends = new int[26];
  private int[] tdone = new int[26];
  
  public void thread127066(int [] tdone, int [] ends){
        active[25]=0;
    ends[25]=0;
    tdone[25]=1;
  }

  public void thread127065(int [] tdone, int [] ends){
        switch(S119603){
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

  public void thread127064(int [] tdone, int [] ends){
        switch(S119595){
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

  public void thread127063(int [] tdone, int [] ends){
        switch(S119587){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S119359){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S119359=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S119359=2;
                active[22]=1;
                ends[22]=1;
                tdone[22]=1;
              }
              else {
                S119301=0;
                __start_thread_22 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[22]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S119301=1;
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
              switch(S119273){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                    ends[22]=4;
                    ;//sysj\filler_plant.sysj line: 14, column: 44
                    S119273=1;
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
              S119359=2;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              switch(S119301){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                    ends[22]=3;
                    ;//sysj\filler_plant.sysj line: 18, column: 42
                    S119301=1;
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
            S119359=2;
            S119359=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S119359=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S119359=2;
                active[22]=1;
                ends[22]=1;
                tdone[22]=1;
              }
              else {
                S119301=0;
                __start_thread_22 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[22]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S119301=1;
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
              S119273=0;
              __start_thread_22 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                ends[22]=4;
                ;//sysj\filler_plant.sysj line: 14, column: 44
                S119273=1;
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

  public void thread127062(int [] tdone, int [] ends){
        switch(S119612){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        thread127063(tdone,ends);
        thread127064(tdone,ends);
        thread127065(tdone,ends);
        thread127066(tdone,ends);
        int biggest127067 = 0;
        if(ends[22]>=biggest127067){
          biggest127067=ends[22];
        }
        if(ends[23]>=biggest127067){
          biggest127067=ends[23];
        }
        if(ends[24]>=biggest127067){
          biggest127067=ends[24];
        }
        if(ends[25]>=biggest127067){
          biggest127067=ends[25];
        }
        if(biggest127067 == 1){
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        //FINXME code
        if(biggest127067 == 0){
          S119612=0;
          active[21]=0;
          ends[21]=0;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread127061(int [] tdone, int [] ends){
        active[20]=0;
    ends[20]=0;
    tdone[20]=1;
  }

  public void thread127058(int [] tdone, int [] ends){
        active[19]=0;
    ends[19]=0;
    tdone[19]=1;
  }

  public void thread127057(int [] tdone, int [] ends){
        switch(S119235){
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

  public void thread127056(int [] tdone, int [] ends){
        switch(S119227){
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

  public void thread127055(int [] tdone, int [] ends){
        switch(S119219){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S118991){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S118991=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S118991=2;
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
              else {
                S118933=0;
                __start_thread_16 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[16]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S118933=1;
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
              switch(S118905){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                    ends[16]=4;
                    ;//sysj\filler_plant.sysj line: 14, column: 44
                    S118905=1;
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
              S118991=2;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              switch(S118933){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                    ends[16]=3;
                    ;//sysj\filler_plant.sysj line: 18, column: 42
                    S118933=1;
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
            S118991=2;
            S118991=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S118991=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S118991=2;
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
              else {
                S118933=0;
                __start_thread_16 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[16]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S118933=1;
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
              S118905=0;
              __start_thread_16 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                ends[16]=4;
                ;//sysj\filler_plant.sysj line: 14, column: 44
                S118905=1;
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

  public void thread127054(int [] tdone, int [] ends){
        switch(S119244){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        thread127055(tdone,ends);
        thread127056(tdone,ends);
        thread127057(tdone,ends);
        thread127058(tdone,ends);
        int biggest127059 = 0;
        if(ends[16]>=biggest127059){
          biggest127059=ends[16];
        }
        if(ends[17]>=biggest127059){
          biggest127059=ends[17];
        }
        if(ends[18]>=biggest127059){
          biggest127059=ends[18];
        }
        if(ends[19]>=biggest127059){
          biggest127059=ends[19];
        }
        if(biggest127059 == 1){
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        //FINXME code
        if(biggest127059 == 0){
          S119244=0;
          active[15]=0;
          ends[15]=0;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread127053(int [] tdone, int [] ends){
        active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread127050(int [] tdone, int [] ends){
        active[13]=0;
    ends[13]=0;
    tdone[13]=1;
  }

  public void thread127049(int [] tdone, int [] ends){
        switch(S118867){
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

  public void thread127048(int [] tdone, int [] ends){
        switch(S118859){
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

  public void thread127047(int [] tdone, int [] ends){
        switch(S118851){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S118623){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S118623=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S118623=2;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S118565=0;
                __start_thread_10 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[10]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S118565=1;
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
              switch(S118537){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                    ends[10]=4;
                    ;//sysj\filler_plant.sysj line: 14, column: 44
                    S118537=1;
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
              S118623=2;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              switch(S118565){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                    ends[10]=3;
                    ;//sysj\filler_plant.sysj line: 18, column: 42
                    S118565=1;
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
            S118623=2;
            S118623=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S118623=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S118623=2;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S118565=0;
                __start_thread_10 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[10]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S118565=1;
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
              S118537=0;
              __start_thread_10 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                ends[10]=4;
                ;//sysj\filler_plant.sysj line: 14, column: 44
                S118537=1;
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

  public void thread127046(int [] tdone, int [] ends){
        switch(S118876){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        thread127047(tdone,ends);
        thread127048(tdone,ends);
        thread127049(tdone,ends);
        thread127050(tdone,ends);
        int biggest127051 = 0;
        if(ends[10]>=biggest127051){
          biggest127051=ends[10];
        }
        if(ends[11]>=biggest127051){
          biggest127051=ends[11];
        }
        if(ends[12]>=biggest127051){
          biggest127051=ends[12];
        }
        if(ends[13]>=biggest127051){
          biggest127051=ends[13];
        }
        if(biggest127051 == 1){
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        //FINXME code
        if(biggest127051 == 0){
          S118876=0;
          active[9]=0;
          ends[9]=0;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread127045(int [] tdone, int [] ends){
        active[8]=0;
    ends[8]=0;
    tdone[8]=1;
  }

  public void thread127042(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread127041(int [] tdone, int [] ends){
        switch(S118499){
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

  public void thread127040(int [] tdone, int [] ends){
        switch(S118491){
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

  public void thread127039(int [] tdone, int [] ends){
        switch(S118483){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S118255){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S118255=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S118255=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S118197=0;
                __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[4]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S118197=1;
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
              switch(S118169){
                case 0 : 
                  switch(S118144){
                    case 0 : 
                      S118144=0;
                      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                        ends[4]=4;
                        ;//sysj\filler_plant.sysj line: 14, column: 44
                        S118169=1;
                        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                        currsigs.addElement(dosUnitFilled);
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S118144=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                    case 1 : 
                      S118144=1;
                      S118144=0;
                      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                        ends[4]=4;
                        ;//sysj\filler_plant.sysj line: 14, column: 44
                        S118169=1;
                        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                        currsigs.addElement(dosUnitFilled);
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S118144=1;
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
              S118255=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              switch(S118197){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                    ends[4]=3;
                    ;//sysj\filler_plant.sysj line: 18, column: 42
                    S118197=1;
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
            S118255=2;
            S118255=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S118255=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S118255=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S118197=0;
                __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[4]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S118197=1;
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
              S118169=0;
              __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
              S118144=0;
              if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                ends[4]=4;
                ;//sysj\filler_plant.sysj line: 14, column: 44
                S118169=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                currsigs.addElement(dosUnitFilled);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S118144=1;
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

  public void thread127038(int [] tdone, int [] ends){
        switch(S118508){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread127039(tdone,ends);
        thread127040(tdone,ends);
        thread127041(tdone,ends);
        thread127042(tdone,ends);
        int biggest127043 = 0;
        if(ends[4]>=biggest127043){
          biggest127043=ends[4];
        }
        if(ends[5]>=biggest127043){
          biggest127043=ends[5];
        }
        if(ends[6]>=biggest127043){
          biggest127043=ends[6];
        }
        if(ends[7]>=biggest127043){
          biggest127043=ends[7];
        }
        if(biggest127043 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest127043 == 0){
          S118508=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread127037(int [] tdone, int [] ends){
        active[2]=0;
    ends[2]=0;
    tdone[2]=1;
  }

  public void thread127034(int [] tdone, int [] ends){
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

  public void thread127033(int [] tdone, int [] ends){
        S119603=1;
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

  public void thread127032(int [] tdone, int [] ends){
        S119595=1;
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

  public void thread127031(int [] tdone, int [] ends){
        S119587=1;
    S119359=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
      S119359=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
        S119359=2;
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
      }
      else {
        S119301=0;
        __start_thread_22 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
          ends[22]=3;
          ;//sysj\filler_plant.sysj line: 18, column: 42
          S119301=1;
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
      S119273=0;
      __start_thread_22 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
        ends[22]=4;
        ;//sysj\filler_plant.sysj line: 14, column: 44
        S119273=1;
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

  public void thread127030(int [] tdone, int [] ends){
        S119612=1;
    thread127031(tdone,ends);
    thread127032(tdone,ends);
    thread127033(tdone,ends);
    thread127034(tdone,ends);
    int biggest127035 = 0;
    if(ends[22]>=biggest127035){
      biggest127035=ends[22];
    }
    if(ends[23]>=biggest127035){
      biggest127035=ends[23];
    }
    if(ends[24]>=biggest127035){
      biggest127035=ends[24];
    }
    if(ends[25]>=biggest127035){
      biggest127035=ends[25];
    }
    if(biggest127035 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest127035 == 2){
      ends[21]=2;
      ;//sysj\filler_plant.sysj line: 11, column: 2
      S119612=0;
      active[21]=0;
      ends[21]=0;
      tdone[21]=1;
    }
  }

  public void thread127029(int [] tdone, int [] ends){
        active[20]=0;
    ends[20]=0;
    tdone[20]=1;
  }

  public void thread127026(int [] tdone, int [] ends){
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

  public void thread127025(int [] tdone, int [] ends){
        S119235=1;
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

  public void thread127024(int [] tdone, int [] ends){
        S119227=1;
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

  public void thread127023(int [] tdone, int [] ends){
        S119219=1;
    S118991=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
      S118991=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
        S118991=2;
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
      else {
        S118933=0;
        __start_thread_16 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
          ends[16]=3;
          ;//sysj\filler_plant.sysj line: 18, column: 42
          S118933=1;
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
      S118905=0;
      __start_thread_16 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
        ends[16]=4;
        ;//sysj\filler_plant.sysj line: 14, column: 44
        S118905=1;
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

  public void thread127022(int [] tdone, int [] ends){
        S119244=1;
    thread127023(tdone,ends);
    thread127024(tdone,ends);
    thread127025(tdone,ends);
    thread127026(tdone,ends);
    int biggest127027 = 0;
    if(ends[16]>=biggest127027){
      biggest127027=ends[16];
    }
    if(ends[17]>=biggest127027){
      biggest127027=ends[17];
    }
    if(ends[18]>=biggest127027){
      biggest127027=ends[18];
    }
    if(ends[19]>=biggest127027){
      biggest127027=ends[19];
    }
    if(biggest127027 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    if(biggest127027 == 2){
      ends[15]=2;
      ;//sysj\filler_plant.sysj line: 11, column: 2
      S119244=0;
      active[15]=0;
      ends[15]=0;
      tdone[15]=1;
    }
  }

  public void thread127021(int [] tdone, int [] ends){
        active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread127018(int [] tdone, int [] ends){
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

  public void thread127017(int [] tdone, int [] ends){
        S118867=1;
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

  public void thread127016(int [] tdone, int [] ends){
        S118859=1;
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

  public void thread127015(int [] tdone, int [] ends){
        S118851=1;
    S118623=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
      S118623=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
        S118623=2;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S118565=0;
        __start_thread_10 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
          ends[10]=3;
          ;//sysj\filler_plant.sysj line: 18, column: 42
          S118565=1;
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
      S118537=0;
      __start_thread_10 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
        ends[10]=4;
        ;//sysj\filler_plant.sysj line: 14, column: 44
        S118537=1;
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

  public void thread127014(int [] tdone, int [] ends){
        S118876=1;
    thread127015(tdone,ends);
    thread127016(tdone,ends);
    thread127017(tdone,ends);
    thread127018(tdone,ends);
    int biggest127019 = 0;
    if(ends[10]>=biggest127019){
      biggest127019=ends[10];
    }
    if(ends[11]>=biggest127019){
      biggest127019=ends[11];
    }
    if(ends[12]>=biggest127019){
      biggest127019=ends[12];
    }
    if(ends[13]>=biggest127019){
      biggest127019=ends[13];
    }
    if(biggest127019 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    if(biggest127019 == 2){
      ends[9]=2;
      ;//sysj\filler_plant.sysj line: 11, column: 2
      S118876=0;
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
  }

  public void thread127013(int [] tdone, int [] ends){
        active[8]=0;
    ends[8]=0;
    tdone[8]=1;
  }

  public void thread127010(int [] tdone, int [] ends){
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

  public void thread127009(int [] tdone, int [] ends){
        S118499=1;
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

  public void thread127008(int [] tdone, int [] ends){
        S118491=1;
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

  public void thread127007(int [] tdone, int [] ends){
        S118483=1;
    S118255=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
      S118255=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
        S118255=2;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S118197=0;
        __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
          ends[4]=3;
          ;//sysj\filler_plant.sysj line: 18, column: 42
          S118197=1;
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
      S118169=0;
      __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
      S118144=0;
      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
        ends[4]=4;
        ;//sysj\filler_plant.sysj line: 14, column: 44
        S118169=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
        currsigs.addElement(dosUnitFilled);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S118144=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
  }

  public void thread127006(int [] tdone, int [] ends){
        S118508=1;
    thread127007(tdone,ends);
    thread127008(tdone,ends);
    thread127009(tdone,ends);
    thread127010(tdone,ends);
    int biggest127011 = 0;
    if(ends[4]>=biggest127011){
      biggest127011=ends[4];
    }
    if(ends[5]>=biggest127011){
      biggest127011=ends[5];
    }
    if(ends[6]>=biggest127011){
      biggest127011=ends[6];
    }
    if(ends[7]>=biggest127011){
      biggest127011=ends[7];
    }
    if(biggest127011 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest127011 == 2){
      ends[3]=2;
      ;//sysj\filler_plant.sysj line: 11, column: 2
      S118508=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread127005(int [] tdone, int [] ends){
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
      switch(S127003){
        case 0 : 
          S127003=0;
          break RUN;
        
        case 1 : 
          S127003=2;
          S127003=2;
          S121093=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S121093){
            case 0 : 
              if(nozzleSelect.getprestatus()){//sysj\filler_plant.sysj line: 55, column: 10
                S121093=1;
                if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 0){//sysj\filler_plant.sysj line: 58, column: 5
                  S119616=0;
                  thread127005(tdone,ends);
                  thread127006(tdone,ends);
                  int biggest127012 = 0;
                  if(ends[2]>=biggest127012){
                    biggest127012=ends[2];
                  }
                  if(ends[3]>=biggest127012){
                    biggest127012=ends[3];
                  }
                  if(biggest127012 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest127012 == 0){
                    S121093=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S119616=1;
                  if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 1){//sysj\filler_plant.sysj line: 62, column: 5
                    S119615=0;
                    thread127013(tdone,ends);
                    thread127014(tdone,ends);
                    int biggest127020 = 0;
                    if(ends[8]>=biggest127020){
                      biggest127020=ends[8];
                    }
                    if(ends[9]>=biggest127020){
                      biggest127020=ends[9];
                    }
                    if(biggest127020 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest127020 == 0){
                      S121093=2;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S119615=1;
                    if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 2){//sysj\filler_plant.sysj line: 66, column: 5
                      S119614=0;
                      thread127021(tdone,ends);
                      thread127022(tdone,ends);
                      int biggest127028 = 0;
                      if(ends[14]>=biggest127028){
                        biggest127028=ends[14];
                      }
                      if(ends[15]>=biggest127028){
                        biggest127028=ends[15];
                      }
                      if(biggest127028 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest127028 == 0){
                        S121093=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S119614=1;
                      if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 3){//sysj\filler_plant.sysj line: 70, column: 5
                        thread127029(tdone,ends);
                        thread127030(tdone,ends);
                        int biggest127036 = 0;
                        if(ends[20]>=biggest127036){
                          biggest127036=ends[20];
                        }
                        if(ends[21]>=biggest127036){
                          biggest127036=ends[21];
                        }
                        if(biggest127036 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest127036 == 0){
                          S121093=2;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S121093=2;
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
              switch(S119616){
                case 0 : 
                  thread127037(tdone,ends);
                  thread127038(tdone,ends);
                  int biggest127044 = 0;
                  if(ends[2]>=biggest127044){
                    biggest127044=ends[2];
                  }
                  if(ends[3]>=biggest127044){
                    biggest127044=ends[3];
                  }
                  if(biggest127044 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest127044 == 0){
                    S121093=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  switch(S119615){
                    case 0 : 
                      thread127045(tdone,ends);
                      thread127046(tdone,ends);
                      int biggest127052 = 0;
                      if(ends[8]>=biggest127052){
                        biggest127052=ends[8];
                      }
                      if(ends[9]>=biggest127052){
                        biggest127052=ends[9];
                      }
                      if(biggest127052 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest127052 == 0){
                        S121093=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      switch(S119614){
                        case 0 : 
                          thread127053(tdone,ends);
                          thread127054(tdone,ends);
                          int biggest127060 = 0;
                          if(ends[14]>=biggest127060){
                            biggest127060=ends[14];
                          }
                          if(ends[15]>=biggest127060){
                            biggest127060=ends[15];
                          }
                          if(biggest127060 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          //FINXME code
                          if(biggest127060 == 0){
                            S121093=2;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          thread127061(tdone,ends);
                          thread127062(tdone,ends);
                          int biggest127068 = 0;
                          if(ends[20]>=biggest127068){
                            biggest127068=ends[20];
                          }
                          if(ends[21]>=biggest127068){
                            biggest127068=ends[21];
                          }
                          if(biggest127068 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          //FINXME code
                          if(biggest127068 == 0){
                            S121093=2;
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
              S121093=2;
              S121093=0;
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
