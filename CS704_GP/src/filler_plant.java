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
  private long __start_thread_11;//sysj\filler_plant.sysj line: 14, column: 44
  private long __start_thread_18;//sysj\filler_plant.sysj line: 14, column: 44
  private long __start_thread_25;//sysj\filler_plant.sysj line: 14, column: 44
  private int S157105 = 1;
  private int S151131 = 1;
  private int S149638 = 1;
  private int S148518 = 1;
  private int S148489 = 1;
  private int S148261 = 1;
  private int S148175 = 1;
  private int S148150 = 1;
  private int S148203 = 1;
  private int S148497 = 1;
  private int S148505 = 1;
  private int S148510 = 1;
  private int S148515 = 1;
  private int S148514 = 1;
  private int S149637 = 1;
  private int S148890 = 1;
  private int S148861 = 1;
  private int S148633 = 1;
  private int S148547 = 1;
  private int S148575 = 1;
  private int S148869 = 1;
  private int S148877 = 1;
  private int S148882 = 1;
  private int S148887 = 1;
  private int S148886 = 1;
  private int S149636 = 1;
  private int S149262 = 1;
  private int S149233 = 1;
  private int S149005 = 1;
  private int S148919 = 1;
  private int S148947 = 1;
  private int S149241 = 1;
  private int S149249 = 1;
  private int S149254 = 1;
  private int S149259 = 1;
  private int S149258 = 1;
  private int S149634 = 1;
  private int S149605 = 1;
  private int S149377 = 1;
  private int S149291 = 1;
  private int S149319 = 1;
  private int S149613 = 1;
  private int S149621 = 1;
  private int S149626 = 1;
  private int S149631 = 1;
  private int S149630 = 1;
  
  private int[] ends = new int[30];
  private int[] tdone = new int[30];
  
  public void thread157176(int [] tdone, int [] ends){
        switch(S149631){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        switch(S149630){
          case 0 : 
            if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 39, column: 10
              S149630=1;
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            else {
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 40, column: 10
              ends[29]=2;
              tdone[29]=1;
            }
            else {
              active[29]=1;
              ends[29]=1;
              tdone[29]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread157175(int [] tdone, int [] ends){
        switch(S149626){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        nozzle3Engaged.setPresent();//sysj\filler_plant.sysj line: 35, column: 4
        currsigs.addElement(nozzle3Engaged);
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
        break;
      
    }
  }

  public void thread157174(int [] tdone, int [] ends){
        switch(S149621){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 24
          inlet3Engaged.setPresent();//sysj\filler_plant.sysj line: 31, column: 41
          currsigs.addElement(inlet3Engaged);
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        else {
          active[27]=1;
          ends[27]=1;
          tdone[27]=1;
        }
        break;
      
    }
  }

  public void thread157173(int [] tdone, int [] ends){
        switch(S149613){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 24
          injector3Engaged.setPresent();//sysj\filler_plant.sysj line: 27, column: 44
          currsigs.addElement(injector3Engaged);
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        else {
          active[26]=1;
          ends[26]=1;
          tdone[26]=1;
        }
        break;
      
    }
  }

  public void thread157172(int [] tdone, int [] ends){
        switch(S149605){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S149377){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S149377=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S149377=2;
                active[25]=1;
                ends[25]=1;
                tdone[25]=1;
              }
              else {
                S149319=0;
                __start_thread_25 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_25 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[25]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S149319=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
            }
            else {
              switch(S149291){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_25 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                    ends[25]=4;
                    ;//sysj\filler_plant.sysj line: 14, column: 44
                    S149291=1;
                    dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                    currsigs.addElement(dosUnitFilled);
                    active[25]=1;
                    ends[25]=1;
                    tdone[25]=1;
                  }
                  else {
                    active[25]=1;
                    ends[25]=1;
                    tdone[25]=1;
                  }
                  break;
                
                case 1 : 
                  dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                  currsigs.addElement(dosUnitFilled);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
              S149377=2;
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              switch(S149319){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_25 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                    ends[25]=3;
                    ;//sysj\filler_plant.sysj line: 18, column: 42
                    S149319=1;
                    dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                    currsigs.addElement(dosUnitEvac);
                    active[25]=1;
                    ends[25]=1;
                    tdone[25]=1;
                  }
                  else {
                    active[25]=1;
                    ends[25]=1;
                    tdone[25]=1;
                  }
                  break;
                
                case 1 : 
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S149377=2;
            S149377=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S149377=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S149377=2;
                active[25]=1;
                ends[25]=1;
                tdone[25]=1;
              }
              else {
                S149319=0;
                __start_thread_25 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_25 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[25]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S149319=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
                else {
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                }
              }
            }
            else {
              S149291=0;
              __start_thread_25 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_25 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                ends[25]=4;
                ;//sysj\filler_plant.sysj line: 14, column: 44
                S149291=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                currsigs.addElement(dosUnitFilled);
                active[25]=1;
                ends[25]=1;
                tdone[25]=1;
              }
              else {
                active[25]=1;
                ends[25]=1;
                tdone[25]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread157171(int [] tdone, int [] ends){
        switch(S149634){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        thread157172(tdone,ends);
        thread157173(tdone,ends);
        thread157174(tdone,ends);
        thread157175(tdone,ends);
        thread157176(tdone,ends);
        int biggest157177 = 0;
        if(ends[25]>=biggest157177){
          biggest157177=ends[25];
        }
        if(ends[26]>=biggest157177){
          biggest157177=ends[26];
        }
        if(ends[27]>=biggest157177){
          biggest157177=ends[27];
        }
        if(ends[28]>=biggest157177){
          biggest157177=ends[28];
        }
        if(ends[29]>=biggest157177){
          biggest157177=ends[29];
        }
        if(biggest157177 == 1){
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        if(biggest157177 == 2){
          ends[24]=2;
          ;//sysj\filler_plant.sysj line: 11, column: 2
          S149634=0;
          active[24]=0;
          ends[24]=0;
          tdone[24]=1;
        }
        //FINXME code
        if(biggest157177 == 0){
          S149634=0;
          active[24]=0;
          ends[24]=0;
          tdone[24]=1;
        }
        break;
      
    }
  }

  public void thread157170(int [] tdone, int [] ends){
        active[23]=0;
    ends[23]=0;
    tdone[23]=1;
  }

  public void thread157167(int [] tdone, int [] ends){
        switch(S149259){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S149258){
          case 0 : 
            if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 39, column: 10
              S149258=1;
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
            if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 40, column: 10
              ends[22]=2;
              tdone[22]=1;
            }
            else {
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread157166(int [] tdone, int [] ends){
        switch(S149254){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        nozzle2Engaged.setPresent();//sysj\filler_plant.sysj line: 35, column: 4
        currsigs.addElement(nozzle2Engaged);
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
        break;
      
    }
  }

  public void thread157165(int [] tdone, int [] ends){
        switch(S149249){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 24
          inlet2Engaged.setPresent();//sysj\filler_plant.sysj line: 31, column: 41
          currsigs.addElement(inlet2Engaged);
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        else {
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread157164(int [] tdone, int [] ends){
        switch(S149241){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 24
          injector2Engaged.setPresent();//sysj\filler_plant.sysj line: 27, column: 44
          currsigs.addElement(injector2Engaged);
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        else {
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        break;
      
    }
  }

  public void thread157163(int [] tdone, int [] ends){
        switch(S149233){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S149005){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S149005=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S149005=2;
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
              }
              else {
                S148947=0;
                __start_thread_18 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_18 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[18]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S148947=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
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
            }
            else {
              switch(S148919){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_18 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                    ends[18]=4;
                    ;//sysj\filler_plant.sysj line: 14, column: 44
                    S148919=1;
                    dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                    currsigs.addElement(dosUnitFilled);
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
                
                case 1 : 
                  dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                  currsigs.addElement(dosUnitFilled);
                  active[18]=1;
                  ends[18]=1;
                  tdone[18]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
              S149005=2;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              switch(S148947){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_18 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                    ends[18]=3;
                    ;//sysj\filler_plant.sysj line: 18, column: 42
                    S148947=1;
                    dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                    currsigs.addElement(dosUnitEvac);
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
                
                case 1 : 
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[18]=1;
                  ends[18]=1;
                  tdone[18]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S149005=2;
            S149005=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S149005=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S149005=2;
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
              }
              else {
                S148947=0;
                __start_thread_18 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_18 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[18]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S148947=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
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
            }
            else {
              S148919=0;
              __start_thread_18 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_18 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                ends[18]=4;
                ;//sysj\filler_plant.sysj line: 14, column: 44
                S148919=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                currsigs.addElement(dosUnitFilled);
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
            break;
          
        }
        break;
      
    }
  }

  public void thread157162(int [] tdone, int [] ends){
        switch(S149262){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        thread157163(tdone,ends);
        thread157164(tdone,ends);
        thread157165(tdone,ends);
        thread157166(tdone,ends);
        thread157167(tdone,ends);
        int biggest157168 = 0;
        if(ends[18]>=biggest157168){
          biggest157168=ends[18];
        }
        if(ends[19]>=biggest157168){
          biggest157168=ends[19];
        }
        if(ends[20]>=biggest157168){
          biggest157168=ends[20];
        }
        if(ends[21]>=biggest157168){
          biggest157168=ends[21];
        }
        if(ends[22]>=biggest157168){
          biggest157168=ends[22];
        }
        if(biggest157168 == 1){
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        if(biggest157168 == 2){
          ends[17]=2;
          ;//sysj\filler_plant.sysj line: 11, column: 2
          S149262=0;
          active[17]=0;
          ends[17]=0;
          tdone[17]=1;
        }
        //FINXME code
        if(biggest157168 == 0){
          S149262=0;
          active[17]=0;
          ends[17]=0;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread157161(int [] tdone, int [] ends){
        active[16]=0;
    ends[16]=0;
    tdone[16]=1;
  }

  public void thread157158(int [] tdone, int [] ends){
        switch(S148887){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S148886){
          case 0 : 
            if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 39, column: 10
              S148886=1;
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            else {
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 40, column: 10
              ends[15]=2;
              tdone[15]=1;
            }
            else {
              active[15]=1;
              ends[15]=1;
              tdone[15]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread157157(int [] tdone, int [] ends){
        switch(S148882){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        nozzle1Engaged.setPresent();//sysj\filler_plant.sysj line: 35, column: 4
        currsigs.addElement(nozzle1Engaged);
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread157156(int [] tdone, int [] ends){
        switch(S148877){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 24
          inlet1Engaged.setPresent();//sysj\filler_plant.sysj line: 31, column: 41
          currsigs.addElement(inlet1Engaged);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread157155(int [] tdone, int [] ends){
        switch(S148869){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 24
          injector1Engaged.setPresent();//sysj\filler_plant.sysj line: 27, column: 44
          currsigs.addElement(injector1Engaged);
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

  public void thread157154(int [] tdone, int [] ends){
        switch(S148861){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S148633){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S148633=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S148633=2;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S148575=0;
                __start_thread_11 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_11 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[11]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S148575=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
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
            }
            else {
              switch(S148547){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_11 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                    ends[11]=4;
                    ;//sysj\filler_plant.sysj line: 14, column: 44
                    S148547=1;
                    dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                    currsigs.addElement(dosUnitFilled);
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
                
                case 1 : 
                  dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                  currsigs.addElement(dosUnitFilled);
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
              S148633=2;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              switch(S148575){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_11 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                    ends[11]=3;
                    ;//sysj\filler_plant.sysj line: 18, column: 42
                    S148575=1;
                    dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                    currsigs.addElement(dosUnitEvac);
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
                
                case 1 : 
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S148633=2;
            S148633=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S148633=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S148633=2;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S148575=0;
                __start_thread_11 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_11 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[11]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S148575=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
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
            }
            else {
              S148547=0;
              __start_thread_11 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_11 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                ends[11]=4;
                ;//sysj\filler_plant.sysj line: 14, column: 44
                S148547=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                currsigs.addElement(dosUnitFilled);
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
            break;
          
        }
        break;
      
    }
  }

  public void thread157153(int [] tdone, int [] ends){
        switch(S148890){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        thread157154(tdone,ends);
        thread157155(tdone,ends);
        thread157156(tdone,ends);
        thread157157(tdone,ends);
        thread157158(tdone,ends);
        int biggest157159 = 0;
        if(ends[11]>=biggest157159){
          biggest157159=ends[11];
        }
        if(ends[12]>=biggest157159){
          biggest157159=ends[12];
        }
        if(ends[13]>=biggest157159){
          biggest157159=ends[13];
        }
        if(ends[14]>=biggest157159){
          biggest157159=ends[14];
        }
        if(ends[15]>=biggest157159){
          biggest157159=ends[15];
        }
        if(biggest157159 == 1){
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        if(biggest157159 == 2){
          ends[10]=2;
          ;//sysj\filler_plant.sysj line: 11, column: 2
          S148890=0;
          active[10]=0;
          ends[10]=0;
          tdone[10]=1;
        }
        //FINXME code
        if(biggest157159 == 0){
          S148890=0;
          active[10]=0;
          ends[10]=0;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread157152(int [] tdone, int [] ends){
        active[9]=0;
    ends[9]=0;
    tdone[9]=1;
  }

  public void thread157149(int [] tdone, int [] ends){
        switch(S148515){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S148514){
          case 0 : 
            if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 39, column: 10
              S148514=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 40, column: 10
              ends[8]=2;
              tdone[8]=1;
            }
            else {
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread157148(int [] tdone, int [] ends){
        switch(S148510){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        nozzle0Engaged.setPresent();//sysj\filler_plant.sysj line: 35, column: 4
        currsigs.addElement(nozzle0Engaged);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread157147(int [] tdone, int [] ends){
        switch(S148505){
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

  public void thread157146(int [] tdone, int [] ends){
        switch(S148497){
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

  public void thread157145(int [] tdone, int [] ends){
        switch(S148489){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S148261){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S148261=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S148261=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S148203=0;
                __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[4]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S148203=1;
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
              switch(S148175){
                case 0 : 
                  switch(S148150){
                    case 0 : 
                      S148150=0;
                      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                        ends[4]=4;
                        ;//sysj\filler_plant.sysj line: 14, column: 44
                        S148175=1;
                        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                        currsigs.addElement(dosUnitFilled);
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S148150=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                    case 1 : 
                      S148150=1;
                      S148150=0;
                      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                        ends[4]=4;
                        ;//sysj\filler_plant.sysj line: 14, column: 44
                        S148175=1;
                        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                        currsigs.addElement(dosUnitFilled);
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S148150=1;
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
              S148261=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              switch(S148203){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                    ends[4]=3;
                    ;//sysj\filler_plant.sysj line: 18, column: 42
                    S148203=1;
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
            S148261=2;
            S148261=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S148261=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S148261=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S148203=0;
                __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[4]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S148203=1;
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
              S148175=0;
              __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
              S148150=0;
              if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                ends[4]=4;
                ;//sysj\filler_plant.sysj line: 14, column: 44
                S148175=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                currsigs.addElement(dosUnitFilled);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S148150=1;
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

  public void thread157144(int [] tdone, int [] ends){
        switch(S148518){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread157145(tdone,ends);
        thread157146(tdone,ends);
        thread157147(tdone,ends);
        thread157148(tdone,ends);
        thread157149(tdone,ends);
        int biggest157150 = 0;
        if(ends[4]>=biggest157150){
          biggest157150=ends[4];
        }
        if(ends[5]>=biggest157150){
          biggest157150=ends[5];
        }
        if(ends[6]>=biggest157150){
          biggest157150=ends[6];
        }
        if(ends[7]>=biggest157150){
          biggest157150=ends[7];
        }
        if(ends[8]>=biggest157150){
          biggest157150=ends[8];
        }
        if(biggest157150 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        if(biggest157150 == 2){
          ends[3]=2;
          ;//sysj\filler_plant.sysj line: 11, column: 2
          S148518=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest157150 == 0){
          S148518=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread157143(int [] tdone, int [] ends){
        active[2]=0;
    ends[2]=0;
    tdone[2]=1;
  }

  public void thread157140(int [] tdone, int [] ends){
        S149631=1;
    S149630=0;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread157139(int [] tdone, int [] ends){
        S149626=1;
    nozzle3Engaged.setPresent();//sysj\filler_plant.sysj line: 35, column: 4
    currsigs.addElement(nozzle3Engaged);
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread157138(int [] tdone, int [] ends){
        S149621=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 24
      inlet3Engaged.setPresent();//sysj\filler_plant.sysj line: 31, column: 41
      currsigs.addElement(inlet3Engaged);
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
    else {
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread157137(int [] tdone, int [] ends){
        S149613=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 24
      injector3Engaged.setPresent();//sysj\filler_plant.sysj line: 27, column: 44
      currsigs.addElement(injector3Engaged);
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
    else {
      active[26]=1;
      ends[26]=1;
      tdone[26]=1;
    }
  }

  public void thread157136(int [] tdone, int [] ends){
        S149605=1;
    S149377=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
      S149377=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
        S149377=2;
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
      else {
        S149319=0;
        __start_thread_25 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_25 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
          ends[25]=3;
          ;//sysj\filler_plant.sysj line: 18, column: 42
          S149319=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
          currsigs.addElement(dosUnitEvac);
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
      }
    }
    else {
      S149291=0;
      __start_thread_25 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_25 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
        ends[25]=4;
        ;//sysj\filler_plant.sysj line: 14, column: 44
        S149291=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
        currsigs.addElement(dosUnitFilled);
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
      else {
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
    }
  }

  public void thread157135(int [] tdone, int [] ends){
        S149634=1;
    thread157136(tdone,ends);
    thread157137(tdone,ends);
    thread157138(tdone,ends);
    thread157139(tdone,ends);
    thread157140(tdone,ends);
    int biggest157141 = 0;
    if(ends[25]>=biggest157141){
      biggest157141=ends[25];
    }
    if(ends[26]>=biggest157141){
      biggest157141=ends[26];
    }
    if(ends[27]>=biggest157141){
      biggest157141=ends[27];
    }
    if(ends[28]>=biggest157141){
      biggest157141=ends[28];
    }
    if(ends[29]>=biggest157141){
      biggest157141=ends[29];
    }
    if(biggest157141 == 1){
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread157134(int [] tdone, int [] ends){
        active[23]=0;
    ends[23]=0;
    tdone[23]=1;
  }

  public void thread157131(int [] tdone, int [] ends){
        S149259=1;
    S149258=0;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread157130(int [] tdone, int [] ends){
        S149254=1;
    nozzle2Engaged.setPresent();//sysj\filler_plant.sysj line: 35, column: 4
    currsigs.addElement(nozzle2Engaged);
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread157129(int [] tdone, int [] ends){
        S149249=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 24
      inlet2Engaged.setPresent();//sysj\filler_plant.sysj line: 31, column: 41
      currsigs.addElement(inlet2Engaged);
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread157128(int [] tdone, int [] ends){
        S149241=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 24
      injector2Engaged.setPresent();//sysj\filler_plant.sysj line: 27, column: 44
      currsigs.addElement(injector2Engaged);
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }

  public void thread157127(int [] tdone, int [] ends){
        S149233=1;
    S149005=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
      S149005=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
        S149005=2;
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
      else {
        S148947=0;
        __start_thread_18 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_18 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
          ends[18]=3;
          ;//sysj\filler_plant.sysj line: 18, column: 42
          S148947=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
          currsigs.addElement(dosUnitEvac);
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
    }
    else {
      S148919=0;
      __start_thread_18 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_18 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
        ends[18]=4;
        ;//sysj\filler_plant.sysj line: 14, column: 44
        S148919=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
        currsigs.addElement(dosUnitFilled);
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
  }

  public void thread157126(int [] tdone, int [] ends){
        S149262=1;
    thread157127(tdone,ends);
    thread157128(tdone,ends);
    thread157129(tdone,ends);
    thread157130(tdone,ends);
    thread157131(tdone,ends);
    int biggest157132 = 0;
    if(ends[18]>=biggest157132){
      biggest157132=ends[18];
    }
    if(ends[19]>=biggest157132){
      biggest157132=ends[19];
    }
    if(ends[20]>=biggest157132){
      biggest157132=ends[20];
    }
    if(ends[21]>=biggest157132){
      biggest157132=ends[21];
    }
    if(ends[22]>=biggest157132){
      biggest157132=ends[22];
    }
    if(biggest157132 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread157125(int [] tdone, int [] ends){
        active[16]=0;
    ends[16]=0;
    tdone[16]=1;
  }

  public void thread157122(int [] tdone, int [] ends){
        S148887=1;
    S148886=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread157121(int [] tdone, int [] ends){
        S148882=1;
    nozzle1Engaged.setPresent();//sysj\filler_plant.sysj line: 35, column: 4
    currsigs.addElement(nozzle1Engaged);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread157120(int [] tdone, int [] ends){
        S148877=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 24
      inlet1Engaged.setPresent();//sysj\filler_plant.sysj line: 31, column: 41
      currsigs.addElement(inlet1Engaged);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread157119(int [] tdone, int [] ends){
        S148869=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 24
      injector1Engaged.setPresent();//sysj\filler_plant.sysj line: 27, column: 44
      currsigs.addElement(injector1Engaged);
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

  public void thread157118(int [] tdone, int [] ends){
        S148861=1;
    S148633=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
      S148633=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
        S148633=2;
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
      else {
        S148575=0;
        __start_thread_11 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_11 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
          ends[11]=3;
          ;//sysj\filler_plant.sysj line: 18, column: 42
          S148575=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
          currsigs.addElement(dosUnitEvac);
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
    }
    else {
      S148547=0;
      __start_thread_11 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_11 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
        ends[11]=4;
        ;//sysj\filler_plant.sysj line: 14, column: 44
        S148547=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
        currsigs.addElement(dosUnitFilled);
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
  }

  public void thread157117(int [] tdone, int [] ends){
        S148890=1;
    thread157118(tdone,ends);
    thread157119(tdone,ends);
    thread157120(tdone,ends);
    thread157121(tdone,ends);
    thread157122(tdone,ends);
    int biggest157123 = 0;
    if(ends[11]>=biggest157123){
      biggest157123=ends[11];
    }
    if(ends[12]>=biggest157123){
      biggest157123=ends[12];
    }
    if(ends[13]>=biggest157123){
      biggest157123=ends[13];
    }
    if(ends[14]>=biggest157123){
      biggest157123=ends[14];
    }
    if(ends[15]>=biggest157123){
      biggest157123=ends[15];
    }
    if(biggest157123 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread157116(int [] tdone, int [] ends){
        active[9]=0;
    ends[9]=0;
    tdone[9]=1;
  }

  public void thread157113(int [] tdone, int [] ends){
        S148515=1;
    S148514=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread157112(int [] tdone, int [] ends){
        S148510=1;
    nozzle0Engaged.setPresent();//sysj\filler_plant.sysj line: 35, column: 4
    currsigs.addElement(nozzle0Engaged);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread157111(int [] tdone, int [] ends){
        S148505=1;
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

  public void thread157110(int [] tdone, int [] ends){
        S148497=1;
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

  public void thread157109(int [] tdone, int [] ends){
        S148489=1;
    S148261=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
      S148261=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
        S148261=2;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S148203=0;
        __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
          ends[4]=3;
          ;//sysj\filler_plant.sysj line: 18, column: 42
          S148203=1;
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
      S148175=0;
      __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
      S148150=0;
      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
        ends[4]=4;
        ;//sysj\filler_plant.sysj line: 14, column: 44
        S148175=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
        currsigs.addElement(dosUnitFilled);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S148150=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
  }

  public void thread157108(int [] tdone, int [] ends){
        S148518=1;
    thread157109(tdone,ends);
    thread157110(tdone,ends);
    thread157111(tdone,ends);
    thread157112(tdone,ends);
    thread157113(tdone,ends);
    int biggest157114 = 0;
    if(ends[4]>=biggest157114){
      biggest157114=ends[4];
    }
    if(ends[5]>=biggest157114){
      biggest157114=ends[5];
    }
    if(ends[6]>=biggest157114){
      biggest157114=ends[6];
    }
    if(ends[7]>=biggest157114){
      biggest157114=ends[7];
    }
    if(ends[8]>=biggest157114){
      biggest157114=ends[8];
    }
    if(biggest157114 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread157107(int [] tdone, int [] ends){
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
      switch(S157105){
        case 0 : 
          S157105=0;
          break RUN;
        
        case 1 : 
          S157105=2;
          S157105=2;
          S151131=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S151131){
            case 0 : 
              if(nozzleSelect.getprestatus()){//sysj\filler_plant.sysj line: 59, column: 10
                S151131=1;
                if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 0){//sysj\filler_plant.sysj line: 62, column: 5
                  S149638=0;
                  thread157107(tdone,ends);
                  thread157108(tdone,ends);
                  int biggest157115 = 0;
                  if(ends[2]>=biggest157115){
                    biggest157115=ends[2];
                  }
                  if(ends[3]>=biggest157115){
                    biggest157115=ends[3];
                  }
                  if(biggest157115 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S149638=1;
                  if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 1){//sysj\filler_plant.sysj line: 66, column: 5
                    S149637=0;
                    thread157116(tdone,ends);
                    thread157117(tdone,ends);
                    int biggest157124 = 0;
                    if(ends[9]>=biggest157124){
                      biggest157124=ends[9];
                    }
                    if(ends[10]>=biggest157124){
                      biggest157124=ends[10];
                    }
                    if(biggest157124 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S149637=1;
                    if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 2){//sysj\filler_plant.sysj line: 70, column: 5
                      S149636=0;
                      thread157125(tdone,ends);
                      thread157126(tdone,ends);
                      int biggest157133 = 0;
                      if(ends[16]>=biggest157133){
                        biggest157133=ends[16];
                      }
                      if(ends[17]>=biggest157133){
                        biggest157133=ends[17];
                      }
                      if(biggest157133 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S149636=1;
                      if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 3){//sysj\filler_plant.sysj line: 74, column: 5
                        thread157134(tdone,ends);
                        thread157135(tdone,ends);
                        int biggest157142 = 0;
                        if(ends[23]>=biggest157142){
                          biggest157142=ends[23];
                        }
                        if(ends[24]>=biggest157142){
                          biggest157142=ends[24];
                        }
                        if(biggest157142 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S151131=2;
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
              switch(S149638){
                case 0 : 
                  thread157143(tdone,ends);
                  thread157144(tdone,ends);
                  int biggest157151 = 0;
                  if(ends[2]>=biggest157151){
                    biggest157151=ends[2];
                  }
                  if(ends[3]>=biggest157151){
                    biggest157151=ends[3];
                  }
                  if(biggest157151 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest157151 == 0){
                    S151131=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  switch(S149637){
                    case 0 : 
                      thread157152(tdone,ends);
                      thread157153(tdone,ends);
                      int biggest157160 = 0;
                      if(ends[9]>=biggest157160){
                        biggest157160=ends[9];
                      }
                      if(ends[10]>=biggest157160){
                        biggest157160=ends[10];
                      }
                      if(biggest157160 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest157160 == 0){
                        S151131=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      switch(S149636){
                        case 0 : 
                          thread157161(tdone,ends);
                          thread157162(tdone,ends);
                          int biggest157169 = 0;
                          if(ends[16]>=biggest157169){
                            biggest157169=ends[16];
                          }
                          if(ends[17]>=biggest157169){
                            biggest157169=ends[17];
                          }
                          if(biggest157169 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          //FINXME code
                          if(biggest157169 == 0){
                            S151131=2;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          thread157170(tdone,ends);
                          thread157171(tdone,ends);
                          int biggest157178 = 0;
                          if(ends[23]>=biggest157178){
                            biggest157178=ends[23];
                          }
                          if(ends[24]>=biggest157178){
                            biggest157178=ends[24];
                          }
                          if(biggest157178 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          //FINXME code
                          if(biggest157178 == 0){
                            S151131=2;
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
              S151131=2;
              S151131=0;
              active[1]=1;
              ends[1]=1;
              break RUN;
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
