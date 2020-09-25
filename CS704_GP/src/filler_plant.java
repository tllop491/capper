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
  private long __start_thread_4;//sysj\filler_plant.sysj line: 17, column: 44
  private long __start_thread_11;//sysj\filler_plant.sysj line: 17, column: 44
  private long __start_thread_18;//sysj\filler_plant.sysj line: 17, column: 44
  private long __start_thread_25;//sysj\filler_plant.sysj line: 17, column: 44
  private int S157050 = 1;
  private int S151076 = 1;
  private int S149583 = 1;
  private int S148463 = 1;
  private int S148434 = 1;
  private int S148206 = 1;
  private int S148120 = 1;
  private int S148095 = 1;
  private int S148148 = 1;
  private int S148442 = 1;
  private int S148450 = 1;
  private int S148455 = 1;
  private int S148460 = 1;
  private int S148459 = 1;
  private int S149582 = 1;
  private int S148835 = 1;
  private int S148806 = 1;
  private int S148578 = 1;
  private int S148492 = 1;
  private int S148520 = 1;
  private int S148814 = 1;
  private int S148822 = 1;
  private int S148827 = 1;
  private int S148832 = 1;
  private int S148831 = 1;
  private int S149581 = 1;
  private int S149207 = 1;
  private int S149178 = 1;
  private int S148950 = 1;
  private int S148864 = 1;
  private int S148892 = 1;
  private int S149186 = 1;
  private int S149194 = 1;
  private int S149199 = 1;
  private int S149204 = 1;
  private int S149203 = 1;
  private int S149579 = 1;
  private int S149550 = 1;
  private int S149322 = 1;
  private int S149236 = 1;
  private int S149264 = 1;
  private int S149558 = 1;
  private int S149566 = 1;
  private int S149571 = 1;
  private int S149576 = 1;
  private int S149575 = 1;
  
  private int[] ends = new int[30];
  private int[] tdone = new int[30];
  
  public void thread157121(int [] tdone, int [] ends){
        switch(S149576){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        switch(S149575){
          case 0 : 
            if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 42, column: 10
              S149575=1;
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
            if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 43, column: 10
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

  public void thread157120(int [] tdone, int [] ends){
        switch(S149571){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        nozzle3Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
        currsigs.addElement(nozzle3Engaged);
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
        break;
      
    }
  }

  public void thread157119(int [] tdone, int [] ends){
        switch(S149566){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
          inlet3Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
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

  public void thread157118(int [] tdone, int [] ends){
        switch(S149558){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
          injector3Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
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

  public void thread157117(int [] tdone, int [] ends){
        switch(S149550){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        switch(S149322){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S149322=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S149322=2;
                active[25]=1;
                ends[25]=1;
                tdone[25]=1;
              }
              else {
                S149264=0;
                __start_thread_25 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_25 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[25]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S149264=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
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
              switch(S149236){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_25 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                    ends[25]=4;
                    ;//sysj\filler_plant.sysj line: 17, column: 44
                    S149236=1;
                    dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
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
                  dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                  currsigs.addElement(dosUnitFilled);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
              S149322=2;
              active[25]=1;
              ends[25]=1;
              tdone[25]=1;
            }
            else {
              switch(S149264){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_25 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                    ends[25]=3;
                    ;//sysj\filler_plant.sysj line: 21, column: 42
                    S149264=1;
                    dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
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
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[25]=1;
                  ends[25]=1;
                  tdone[25]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S149322=2;
            S149322=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S149322=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S149322=2;
                active[25]=1;
                ends[25]=1;
                tdone[25]=1;
              }
              else {
                S149264=0;
                __start_thread_25 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_25 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[25]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S149264=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
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
              S149236=0;
              __start_thread_25 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_25 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                ends[25]=4;
                ;//sysj\filler_plant.sysj line: 17, column: 44
                S149236=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
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

  public void thread157116(int [] tdone, int [] ends){
        switch(S149579){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        thread157117(tdone,ends);
        thread157118(tdone,ends);
        thread157119(tdone,ends);
        thread157120(tdone,ends);
        thread157121(tdone,ends);
        int biggest157122 = 0;
        if(ends[25]>=biggest157122){
          biggest157122=ends[25];
        }
        if(ends[26]>=biggest157122){
          biggest157122=ends[26];
        }
        if(ends[27]>=biggest157122){
          biggest157122=ends[27];
        }
        if(ends[28]>=biggest157122){
          biggest157122=ends[28];
        }
        if(ends[29]>=biggest157122){
          biggest157122=ends[29];
        }
        if(biggest157122 == 1){
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        if(biggest157122 == 2){
          ends[24]=2;
          ;//sysj\filler_plant.sysj line: 14, column: 2
          S149579=0;
          active[24]=0;
          ends[24]=0;
          tdone[24]=1;
        }
        //FINXME code
        if(biggest157122 == 0){
          S149579=0;
          active[24]=0;
          ends[24]=0;
          tdone[24]=1;
        }
        break;
      
    }
  }

  public void thread157115(int [] tdone, int [] ends){
        active[23]=0;
    ends[23]=0;
    tdone[23]=1;
  }

  public void thread157112(int [] tdone, int [] ends){
        switch(S149204){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S149203){
          case 0 : 
            if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 42, column: 10
              S149203=1;
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
            if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 43, column: 10
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

  public void thread157111(int [] tdone, int [] ends){
        switch(S149199){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        nozzle2Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
        currsigs.addElement(nozzle2Engaged);
        active[21]=1;
        ends[21]=1;
        tdone[21]=1;
        break;
      
    }
  }

  public void thread157110(int [] tdone, int [] ends){
        switch(S149194){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
          inlet2Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
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

  public void thread157109(int [] tdone, int [] ends){
        switch(S149186){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
          injector2Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
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

  public void thread157108(int [] tdone, int [] ends){
        switch(S149178){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S148950){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S148950=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S148950=2;
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
              }
              else {
                S148892=0;
                __start_thread_18 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_18 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[18]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S148892=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
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
              switch(S148864){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_18 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                    ends[18]=4;
                    ;//sysj\filler_plant.sysj line: 17, column: 44
                    S148864=1;
                    dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
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
                  dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                  currsigs.addElement(dosUnitFilled);
                  active[18]=1;
                  ends[18]=1;
                  tdone[18]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
              S148950=2;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            else {
              switch(S148892){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_18 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                    ends[18]=3;
                    ;//sysj\filler_plant.sysj line: 21, column: 42
                    S148892=1;
                    dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
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
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[18]=1;
                  ends[18]=1;
                  tdone[18]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S148950=2;
            S148950=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S148950=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S148950=2;
                active[18]=1;
                ends[18]=1;
                tdone[18]=1;
              }
              else {
                S148892=0;
                __start_thread_18 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_18 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[18]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S148892=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
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
              S148864=0;
              __start_thread_18 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_18 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                ends[18]=4;
                ;//sysj\filler_plant.sysj line: 17, column: 44
                S148864=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
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

  public void thread157107(int [] tdone, int [] ends){
        switch(S149207){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        thread157108(tdone,ends);
        thread157109(tdone,ends);
        thread157110(tdone,ends);
        thread157111(tdone,ends);
        thread157112(tdone,ends);
        int biggest157113 = 0;
        if(ends[18]>=biggest157113){
          biggest157113=ends[18];
        }
        if(ends[19]>=biggest157113){
          biggest157113=ends[19];
        }
        if(ends[20]>=biggest157113){
          biggest157113=ends[20];
        }
        if(ends[21]>=biggest157113){
          biggest157113=ends[21];
        }
        if(ends[22]>=biggest157113){
          biggest157113=ends[22];
        }
        if(biggest157113 == 1){
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        if(biggest157113 == 2){
          ends[17]=2;
          ;//sysj\filler_plant.sysj line: 14, column: 2
          S149207=0;
          active[17]=0;
          ends[17]=0;
          tdone[17]=1;
        }
        //FINXME code
        if(biggest157113 == 0){
          S149207=0;
          active[17]=0;
          ends[17]=0;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread157106(int [] tdone, int [] ends){
        active[16]=0;
    ends[16]=0;
    tdone[16]=1;
  }

  public void thread157103(int [] tdone, int [] ends){
        switch(S148832){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        switch(S148831){
          case 0 : 
            if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 42, column: 10
              S148831=1;
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
            if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 43, column: 10
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

  public void thread157102(int [] tdone, int [] ends){
        switch(S148827){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        nozzle1Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
        currsigs.addElement(nozzle1Engaged);
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
        break;
      
    }
  }

  public void thread157101(int [] tdone, int [] ends){
        switch(S148822){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
          inlet1Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
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

  public void thread157100(int [] tdone, int [] ends){
        switch(S148814){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
          injector1Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
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

  public void thread157099(int [] tdone, int [] ends){
        switch(S148806){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        switch(S148578){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S148578=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S148578=2;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S148520=0;
                __start_thread_11 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_11 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[11]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S148520=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
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
              switch(S148492){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_11 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                    ends[11]=4;
                    ;//sysj\filler_plant.sysj line: 17, column: 44
                    S148492=1;
                    dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
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
                  dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                  currsigs.addElement(dosUnitFilled);
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
              S148578=2;
              active[11]=1;
              ends[11]=1;
              tdone[11]=1;
            }
            else {
              switch(S148520){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_11 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                    ends[11]=3;
                    ;//sysj\filler_plant.sysj line: 21, column: 42
                    S148520=1;
                    dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
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
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[11]=1;
                  ends[11]=1;
                  tdone[11]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S148578=2;
            S148578=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S148578=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S148578=2;
                active[11]=1;
                ends[11]=1;
                tdone[11]=1;
              }
              else {
                S148520=0;
                __start_thread_11 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_11 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[11]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S148520=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
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
              S148492=0;
              __start_thread_11 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_11 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                ends[11]=4;
                ;//sysj\filler_plant.sysj line: 17, column: 44
                S148492=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
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

  public void thread157098(int [] tdone, int [] ends){
        switch(S148835){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        thread157099(tdone,ends);
        thread157100(tdone,ends);
        thread157101(tdone,ends);
        thread157102(tdone,ends);
        thread157103(tdone,ends);
        int biggest157104 = 0;
        if(ends[11]>=biggest157104){
          biggest157104=ends[11];
        }
        if(ends[12]>=biggest157104){
          biggest157104=ends[12];
        }
        if(ends[13]>=biggest157104){
          biggest157104=ends[13];
        }
        if(ends[14]>=biggest157104){
          biggest157104=ends[14];
        }
        if(ends[15]>=biggest157104){
          biggest157104=ends[15];
        }
        if(biggest157104 == 1){
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        if(biggest157104 == 2){
          ends[10]=2;
          ;//sysj\filler_plant.sysj line: 14, column: 2
          S148835=0;
          active[10]=0;
          ends[10]=0;
          tdone[10]=1;
        }
        //FINXME code
        if(biggest157104 == 0){
          S148835=0;
          active[10]=0;
          ends[10]=0;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread157097(int [] tdone, int [] ends){
        active[9]=0;
    ends[9]=0;
    tdone[9]=1;
  }

  public void thread157094(int [] tdone, int [] ends){
        switch(S148460){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S148459){
          case 0 : 
            if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 42, column: 10
              S148459=1;
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
            if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 43, column: 10
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

  public void thread157093(int [] tdone, int [] ends){
        switch(S148455){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        nozzle0Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
        currsigs.addElement(nozzle0Engaged);
        active[7]=1;
        ends[7]=1;
        tdone[7]=1;
        break;
      
    }
  }

  public void thread157092(int [] tdone, int [] ends){
        switch(S148450){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
          inlet0Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
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

  public void thread157091(int [] tdone, int [] ends){
        switch(S148442){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
          injector0Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
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

  public void thread157090(int [] tdone, int [] ends){
        switch(S148434){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S148206){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S148206=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S148206=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S148148=0;
                __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[4]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S148148=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
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
              switch(S148120){
                case 0 : 
                  switch(S148095){
                    case 0 : 
                      S148095=0;
                      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                        ends[4]=4;
                        ;//sysj\filler_plant.sysj line: 17, column: 44
                        S148120=1;
                        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                        currsigs.addElement(dosUnitFilled);
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S148095=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                    case 1 : 
                      S148095=1;
                      S148095=0;
                      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                        ends[4]=4;
                        ;//sysj\filler_plant.sysj line: 17, column: 44
                        S148120=1;
                        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                        currsigs.addElement(dosUnitFilled);
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S148095=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                  currsigs.addElement(dosUnitFilled);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
              S148206=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              switch(S148148){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                    ends[4]=3;
                    ;//sysj\filler_plant.sysj line: 21, column: 42
                    S148148=1;
                    dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
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
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S148206=2;
            S148206=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S148206=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S148206=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S148148=0;
                __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[4]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S148148=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
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
              S148120=0;
              __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
              S148095=0;
              if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                ends[4]=4;
                ;//sysj\filler_plant.sysj line: 17, column: 44
                S148120=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                currsigs.addElement(dosUnitFilled);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S148095=1;
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

  public void thread157089(int [] tdone, int [] ends){
        switch(S148463){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread157090(tdone,ends);
        thread157091(tdone,ends);
        thread157092(tdone,ends);
        thread157093(tdone,ends);
        thread157094(tdone,ends);
        int biggest157095 = 0;
        if(ends[4]>=biggest157095){
          biggest157095=ends[4];
        }
        if(ends[5]>=biggest157095){
          biggest157095=ends[5];
        }
        if(ends[6]>=biggest157095){
          biggest157095=ends[6];
        }
        if(ends[7]>=biggest157095){
          biggest157095=ends[7];
        }
        if(ends[8]>=biggest157095){
          biggest157095=ends[8];
        }
        if(biggest157095 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        if(biggest157095 == 2){
          ends[3]=2;
          ;//sysj\filler_plant.sysj line: 14, column: 2
          S148463=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest157095 == 0){
          S148463=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread157088(int [] tdone, int [] ends){
        active[2]=0;
    ends[2]=0;
    tdone[2]=1;
  }

  public void thread157085(int [] tdone, int [] ends){
        S149576=1;
    S149575=0;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread157084(int [] tdone, int [] ends){
        S149571=1;
    nozzle3Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle3Engaged);
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread157083(int [] tdone, int [] ends){
        S149566=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
      inlet3Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
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

  public void thread157082(int [] tdone, int [] ends){
        S149558=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
      injector3Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
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

  public void thread157081(int [] tdone, int [] ends){
        S149550=1;
    S149322=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S149322=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S149322=2;
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
      }
      else {
        S149264=0;
        __start_thread_25 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_25 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[25]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S149264=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
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
      S149236=0;
      __start_thread_25 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_25 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[25]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S149236=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
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

  public void thread157080(int [] tdone, int [] ends){
        S149579=1;
    thread157081(tdone,ends);
    thread157082(tdone,ends);
    thread157083(tdone,ends);
    thread157084(tdone,ends);
    thread157085(tdone,ends);
    int biggest157086 = 0;
    if(ends[25]>=biggest157086){
      biggest157086=ends[25];
    }
    if(ends[26]>=biggest157086){
      biggest157086=ends[26];
    }
    if(ends[27]>=biggest157086){
      biggest157086=ends[27];
    }
    if(ends[28]>=biggest157086){
      biggest157086=ends[28];
    }
    if(ends[29]>=biggest157086){
      biggest157086=ends[29];
    }
    if(biggest157086 == 1){
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
  }

  public void thread157079(int [] tdone, int [] ends){
        active[23]=0;
    ends[23]=0;
    tdone[23]=1;
  }

  public void thread157076(int [] tdone, int [] ends){
        S149204=1;
    S149203=0;
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread157075(int [] tdone, int [] ends){
        S149199=1;
    nozzle2Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle2Engaged);
    active[21]=1;
    ends[21]=1;
    tdone[21]=1;
  }

  public void thread157074(int [] tdone, int [] ends){
        S149194=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
      inlet2Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
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

  public void thread157073(int [] tdone, int [] ends){
        S149186=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
      injector2Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
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

  public void thread157072(int [] tdone, int [] ends){
        S149178=1;
    S148950=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S148950=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S148950=2;
        active[18]=1;
        ends[18]=1;
        tdone[18]=1;
      }
      else {
        S148892=0;
        __start_thread_18 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_18 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[18]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S148892=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
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
      S148864=0;
      __start_thread_18 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_18 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[18]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S148864=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
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

  public void thread157071(int [] tdone, int [] ends){
        S149207=1;
    thread157072(tdone,ends);
    thread157073(tdone,ends);
    thread157074(tdone,ends);
    thread157075(tdone,ends);
    thread157076(tdone,ends);
    int biggest157077 = 0;
    if(ends[18]>=biggest157077){
      biggest157077=ends[18];
    }
    if(ends[19]>=biggest157077){
      biggest157077=ends[19];
    }
    if(ends[20]>=biggest157077){
      biggest157077=ends[20];
    }
    if(ends[21]>=biggest157077){
      biggest157077=ends[21];
    }
    if(ends[22]>=biggest157077){
      biggest157077=ends[22];
    }
    if(biggest157077 == 1){
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread157070(int [] tdone, int [] ends){
        active[16]=0;
    ends[16]=0;
    tdone[16]=1;
  }

  public void thread157067(int [] tdone, int [] ends){
        S148832=1;
    S148831=0;
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread157066(int [] tdone, int [] ends){
        S148827=1;
    nozzle1Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle1Engaged);
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread157065(int [] tdone, int [] ends){
        S148822=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
      inlet1Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
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

  public void thread157064(int [] tdone, int [] ends){
        S148814=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
      injector1Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
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

  public void thread157063(int [] tdone, int [] ends){
        S148806=1;
    S148578=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S148578=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S148578=2;
        active[11]=1;
        ends[11]=1;
        tdone[11]=1;
      }
      else {
        S148520=0;
        __start_thread_11 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_11 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[11]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S148520=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
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
      S148492=0;
      __start_thread_11 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_11 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[11]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S148492=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
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

  public void thread157062(int [] tdone, int [] ends){
        S148835=1;
    thread157063(tdone,ends);
    thread157064(tdone,ends);
    thread157065(tdone,ends);
    thread157066(tdone,ends);
    thread157067(tdone,ends);
    int biggest157068 = 0;
    if(ends[11]>=biggest157068){
      biggest157068=ends[11];
    }
    if(ends[12]>=biggest157068){
      biggest157068=ends[12];
    }
    if(ends[13]>=biggest157068){
      biggest157068=ends[13];
    }
    if(ends[14]>=biggest157068){
      biggest157068=ends[14];
    }
    if(ends[15]>=biggest157068){
      biggest157068=ends[15];
    }
    if(biggest157068 == 1){
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread157061(int [] tdone, int [] ends){
        active[9]=0;
    ends[9]=0;
    tdone[9]=1;
  }

  public void thread157058(int [] tdone, int [] ends){
        S148460=1;
    S148459=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread157057(int [] tdone, int [] ends){
        S148455=1;
    nozzle0Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle0Engaged);
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread157056(int [] tdone, int [] ends){
        S148450=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
      inlet0Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
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

  public void thread157055(int [] tdone, int [] ends){
        S148442=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
      injector0Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
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

  public void thread157054(int [] tdone, int [] ends){
        S148434=1;
    S148206=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S148206=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S148206=2;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S148148=0;
        __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[4]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S148148=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
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
      S148120=0;
      __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      S148095=0;
      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[4]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S148120=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
        currsigs.addElement(dosUnitFilled);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S148095=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
  }

  public void thread157053(int [] tdone, int [] ends){
        S148463=1;
    thread157054(tdone,ends);
    thread157055(tdone,ends);
    thread157056(tdone,ends);
    thread157057(tdone,ends);
    thread157058(tdone,ends);
    int biggest157059 = 0;
    if(ends[4]>=biggest157059){
      biggest157059=ends[4];
    }
    if(ends[5]>=biggest157059){
      biggest157059=ends[5];
    }
    if(ends[6]>=biggest157059){
      biggest157059=ends[6];
    }
    if(ends[7]>=biggest157059){
      biggest157059=ends[7];
    }
    if(ends[8]>=biggest157059){
      biggest157059=ends[8];
    }
    if(biggest157059 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread157052(int [] tdone, int [] ends){
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
      switch(S157050){
        case 0 : 
          S157050=0;
          break RUN;
        
        case 1 : 
          S157050=2;
          S157050=2;
          S151076=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S151076){
            case 0 : 
              if(nozzleSelect.getprestatus()){//sysj\filler_plant.sysj line: 62, column: 10
                S151076=1;
                if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 0){//sysj\filler_plant.sysj line: 65, column: 5
                  S149583=0;
                  thread157052(tdone,ends);
                  thread157053(tdone,ends);
                  int biggest157060 = 0;
                  if(ends[2]>=biggest157060){
                    biggest157060=ends[2];
                  }
                  if(ends[3]>=biggest157060){
                    biggest157060=ends[3];
                  }
                  if(biggest157060 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S149583=1;
                  if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 1){//sysj\filler_plant.sysj line: 69, column: 5
                    S149582=0;
                    thread157061(tdone,ends);
                    thread157062(tdone,ends);
                    int biggest157069 = 0;
                    if(ends[9]>=biggest157069){
                      biggest157069=ends[9];
                    }
                    if(ends[10]>=biggest157069){
                      biggest157069=ends[10];
                    }
                    if(biggest157069 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S149582=1;
                    if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 2){//sysj\filler_plant.sysj line: 73, column: 5
                      S149581=0;
                      thread157070(tdone,ends);
                      thread157071(tdone,ends);
                      int biggest157078 = 0;
                      if(ends[16]>=biggest157078){
                        biggest157078=ends[16];
                      }
                      if(ends[17]>=biggest157078){
                        biggest157078=ends[17];
                      }
                      if(biggest157078 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S149581=1;
                      if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 3){//sysj\filler_plant.sysj line: 77, column: 5
                        thread157079(tdone,ends);
                        thread157080(tdone,ends);
                        int biggest157087 = 0;
                        if(ends[23]>=biggest157087){
                          biggest157087=ends[23];
                        }
                        if(ends[24]>=biggest157087){
                          biggest157087=ends[24];
                        }
                        if(biggest157087 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S151076=2;
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
              switch(S149583){
                case 0 : 
                  thread157088(tdone,ends);
                  thread157089(tdone,ends);
                  int biggest157096 = 0;
                  if(ends[2]>=biggest157096){
                    biggest157096=ends[2];
                  }
                  if(ends[3]>=biggest157096){
                    biggest157096=ends[3];
                  }
                  if(biggest157096 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest157096 == 0){
                    S151076=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  switch(S149582){
                    case 0 : 
                      thread157097(tdone,ends);
                      thread157098(tdone,ends);
                      int biggest157105 = 0;
                      if(ends[9]>=biggest157105){
                        biggest157105=ends[9];
                      }
                      if(ends[10]>=biggest157105){
                        biggest157105=ends[10];
                      }
                      if(biggest157105 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest157105 == 0){
                        S151076=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      switch(S149581){
                        case 0 : 
                          thread157106(tdone,ends);
                          thread157107(tdone,ends);
                          int biggest157114 = 0;
                          if(ends[16]>=biggest157114){
                            biggest157114=ends[16];
                          }
                          if(ends[17]>=biggest157114){
                            biggest157114=ends[17];
                          }
                          if(biggest157114 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          //FINXME code
                          if(biggest157114 == 0){
                            S151076=2;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          thread157115(tdone,ends);
                          thread157116(tdone,ends);
                          int biggest157123 = 0;
                          if(ends[23]>=biggest157123){
                            biggest157123=ends[23];
                          }
                          if(ends[24]>=biggest157123){
                            biggest157123=ends[24];
                          }
                          if(biggest157123 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          //FINXME code
                          if(biggest157123 == 0){
                            S151076=2;
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
              S151076=2;
              S151076=0;
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
