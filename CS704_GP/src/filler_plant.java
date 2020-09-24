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
  private int S124489 = 1;
  private int S118579 = 1;
  private int S117102 = 1;
  private int S115994 = 1;
  private int S115969 = 1;
  private int S115741 = 1;
  private int S115655 = 1;
  private int S115630 = 1;
  private int S115683 = 1;
  private int S115977 = 1;
  private int S115985 = 1;
  private int S117101 = 1;
  private int S116362 = 1;
  private int S116337 = 1;
  private int S116109 = 1;
  private int S116023 = 1;
  private int S116051 = 1;
  private int S116345 = 1;
  private int S116353 = 1;
  private int S117100 = 1;
  private int S116730 = 1;
  private int S116705 = 1;
  private int S116477 = 1;
  private int S116391 = 1;
  private int S116419 = 1;
  private int S116713 = 1;
  private int S116721 = 1;
  private int S117098 = 1;
  private int S117073 = 1;
  private int S116845 = 1;
  private int S116759 = 1;
  private int S116787 = 1;
  private int S117081 = 1;
  private int S117089 = 1;
  
  private int[] ends = new int[26];
  private int[] tdone = new int[26];
  
  public void thread124552(int [] tdone, int [] ends){
        active[25]=0;
    ends[25]=0;
    tdone[25]=1;
  }

  public void thread124551(int [] tdone, int [] ends){
        switch(S117089){
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

  public void thread124550(int [] tdone, int [] ends){
        switch(S117081){
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

  public void thread124549(int [] tdone, int [] ends){
        switch(S117073){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S116845){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S116845=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S116845=2;
                active[22]=1;
                ends[22]=1;
                tdone[22]=1;
              }
              else {
                S116787=0;
                __start_thread_22 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[22]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S116787=1;
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
              switch(S116759){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                    ends[22]=4;
                    ;//sysj\filler_plant.sysj line: 14, column: 44
                    S116759=1;
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
              S116845=2;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              switch(S116787){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                    ends[22]=3;
                    ;//sysj\filler_plant.sysj line: 18, column: 42
                    S116787=1;
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
            S116845=2;
            S116845=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S116845=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S116845=2;
                active[22]=1;
                ends[22]=1;
                tdone[22]=1;
              }
              else {
                S116787=0;
                __start_thread_22 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[22]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S116787=1;
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
              S116759=0;
              __start_thread_22 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                ends[22]=4;
                ;//sysj\filler_plant.sysj line: 14, column: 44
                S116759=1;
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

  public void thread124548(int [] tdone, int [] ends){
        switch(S117098){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        thread124549(tdone,ends);
        thread124550(tdone,ends);
        thread124551(tdone,ends);
        thread124552(tdone,ends);
        int biggest124553 = 0;
        if(ends[22]>=biggest124553){
          biggest124553=ends[22];
        }
        if(ends[23]>=biggest124553){
          biggest124553=ends[23];
        }
        if(ends[24]>=biggest124553){
          biggest124553=ends[24];
        }
        if(ends[25]>=biggest124553){
          biggest124553=ends[25];
        }
        if(biggest124553 == 1){
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        //FINXME code
        if(biggest124553 == 0){
          S117098=0;
          active[21]=0;
          ends[21]=0;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread124547(int [] tdone, int [] ends){
        active[20]=0;
    ends[20]=0;
    tdone[20]=1;
  }

  public void thread124544(int [] tdone, int [] ends){
        active[19]=0;
    ends[19]=0;
    tdone[19]=1;
  }

  public void thread124543(int [] tdone, int [] ends){
        switch(S116721){
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

  public void thread124542(int [] tdone, int [] ends){
        switch(S116713){
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

  public void thread124541(int [] tdone, int [] ends){
        switch(S116705){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S116477){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S116477=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S116477=2;
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
              else {
                S116419=0;
                __start_thread_16 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[16]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S116419=1;
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
              switch(S116391){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                    ends[16]=4;
                    ;//sysj\filler_plant.sysj line: 14, column: 44
                    S116391=1;
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
              S116477=2;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              switch(S116419){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                    ends[16]=3;
                    ;//sysj\filler_plant.sysj line: 18, column: 42
                    S116419=1;
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
            S116477=2;
            S116477=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S116477=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S116477=2;
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
              else {
                S116419=0;
                __start_thread_16 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[16]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S116419=1;
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
              S116391=0;
              __start_thread_16 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                ends[16]=4;
                ;//sysj\filler_plant.sysj line: 14, column: 44
                S116391=1;
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

  public void thread124540(int [] tdone, int [] ends){
        switch(S116730){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        thread124541(tdone,ends);
        thread124542(tdone,ends);
        thread124543(tdone,ends);
        thread124544(tdone,ends);
        int biggest124545 = 0;
        if(ends[16]>=biggest124545){
          biggest124545=ends[16];
        }
        if(ends[17]>=biggest124545){
          biggest124545=ends[17];
        }
        if(ends[18]>=biggest124545){
          biggest124545=ends[18];
        }
        if(ends[19]>=biggest124545){
          biggest124545=ends[19];
        }
        if(biggest124545 == 1){
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        //FINXME code
        if(biggest124545 == 0){
          S116730=0;
          active[15]=0;
          ends[15]=0;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread124539(int [] tdone, int [] ends){
        active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread124536(int [] tdone, int [] ends){
        active[13]=0;
    ends[13]=0;
    tdone[13]=1;
  }

  public void thread124535(int [] tdone, int [] ends){
        switch(S116353){
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

  public void thread124534(int [] tdone, int [] ends){
        switch(S116345){
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

  public void thread124533(int [] tdone, int [] ends){
        switch(S116337){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S116109){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S116109=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S116109=2;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S116051=0;
                __start_thread_10 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[10]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S116051=1;
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
              switch(S116023){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                    ends[10]=4;
                    ;//sysj\filler_plant.sysj line: 14, column: 44
                    S116023=1;
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
              S116109=2;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              switch(S116051){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                    ends[10]=3;
                    ;//sysj\filler_plant.sysj line: 18, column: 42
                    S116051=1;
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
            S116109=2;
            S116109=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S116109=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S116109=2;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S116051=0;
                __start_thread_10 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[10]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S116051=1;
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
              S116023=0;
              __start_thread_10 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                ends[10]=4;
                ;//sysj\filler_plant.sysj line: 14, column: 44
                S116023=1;
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

  public void thread124532(int [] tdone, int [] ends){
        switch(S116362){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        thread124533(tdone,ends);
        thread124534(tdone,ends);
        thread124535(tdone,ends);
        thread124536(tdone,ends);
        int biggest124537 = 0;
        if(ends[10]>=biggest124537){
          biggest124537=ends[10];
        }
        if(ends[11]>=biggest124537){
          biggest124537=ends[11];
        }
        if(ends[12]>=biggest124537){
          biggest124537=ends[12];
        }
        if(ends[13]>=biggest124537){
          biggest124537=ends[13];
        }
        if(biggest124537 == 1){
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        //FINXME code
        if(biggest124537 == 0){
          S116362=0;
          active[9]=0;
          ends[9]=0;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread124531(int [] tdone, int [] ends){
        active[8]=0;
    ends[8]=0;
    tdone[8]=1;
  }

  public void thread124528(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread124527(int [] tdone, int [] ends){
        switch(S115985){
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

  public void thread124526(int [] tdone, int [] ends){
        switch(S115977){
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

  public void thread124525(int [] tdone, int [] ends){
        switch(S115969){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S115741){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S115741=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S115741=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S115683=0;
                __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[4]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S115683=1;
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
              switch(S115655){
                case 0 : 
                  switch(S115630){
                    case 0 : 
                      S115630=0;
                      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                        ends[4]=4;
                        ;//sysj\filler_plant.sysj line: 14, column: 44
                        S115655=1;
                        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                        currsigs.addElement(dosUnitFilled);
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S115630=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                    case 1 : 
                      S115630=1;
                      S115630=0;
                      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                        ends[4]=4;
                        ;//sysj\filler_plant.sysj line: 14, column: 44
                        S115655=1;
                        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                        currsigs.addElement(dosUnitFilled);
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S115630=1;
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
              S115741=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              switch(S115683){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                    ends[4]=3;
                    ;//sysj\filler_plant.sysj line: 18, column: 42
                    S115683=1;
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
            S115741=2;
            S115741=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S115741=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S115741=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S115683=0;
                __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[4]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S115683=1;
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
              S115655=0;
              __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
              S115630=0;
              if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                ends[4]=4;
                ;//sysj\filler_plant.sysj line: 14, column: 44
                S115655=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                currsigs.addElement(dosUnitFilled);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S115630=1;
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

  public void thread124524(int [] tdone, int [] ends){
        switch(S115994){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread124525(tdone,ends);
        thread124526(tdone,ends);
        thread124527(tdone,ends);
        thread124528(tdone,ends);
        int biggest124529 = 0;
        if(ends[4]>=biggest124529){
          biggest124529=ends[4];
        }
        if(ends[5]>=biggest124529){
          biggest124529=ends[5];
        }
        if(ends[6]>=biggest124529){
          biggest124529=ends[6];
        }
        if(ends[7]>=biggest124529){
          biggest124529=ends[7];
        }
        if(biggest124529 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest124529 == 0){
          S115994=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread124523(int [] tdone, int [] ends){
        active[2]=0;
    ends[2]=0;
    tdone[2]=1;
  }

  public void thread124520(int [] tdone, int [] ends){
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

  public void thread124519(int [] tdone, int [] ends){
        S117089=1;
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

  public void thread124518(int [] tdone, int [] ends){
        S117081=1;
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

  public void thread124517(int [] tdone, int [] ends){
        S117073=1;
    S116845=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
      S116845=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
        S116845=2;
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
      }
      else {
        S116787=0;
        __start_thread_22 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
          ends[22]=3;
          ;//sysj\filler_plant.sysj line: 18, column: 42
          S116787=1;
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
      S116759=0;
      __start_thread_22 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
        ends[22]=4;
        ;//sysj\filler_plant.sysj line: 14, column: 44
        S116759=1;
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

  public void thread124516(int [] tdone, int [] ends){
        S117098=1;
    thread124517(tdone,ends);
    thread124518(tdone,ends);
    thread124519(tdone,ends);
    thread124520(tdone,ends);
    int biggest124521 = 0;
    if(ends[22]>=biggest124521){
      biggest124521=ends[22];
    }
    if(ends[23]>=biggest124521){
      biggest124521=ends[23];
    }
    if(ends[24]>=biggest124521){
      biggest124521=ends[24];
    }
    if(ends[25]>=biggest124521){
      biggest124521=ends[25];
    }
    if(biggest124521 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest124521 == 2){
      ends[21]=2;
      ;//sysj\filler_plant.sysj line: 11, column: 2
      S117098=0;
      active[21]=0;
      ends[21]=0;
      tdone[21]=1;
    }
  }

  public void thread124515(int [] tdone, int [] ends){
        active[20]=0;
    ends[20]=0;
    tdone[20]=1;
  }

  public void thread124512(int [] tdone, int [] ends){
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

  public void thread124511(int [] tdone, int [] ends){
        S116721=1;
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

  public void thread124510(int [] tdone, int [] ends){
        S116713=1;
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

  public void thread124509(int [] tdone, int [] ends){
        S116705=1;
    S116477=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
      S116477=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
        S116477=2;
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
      else {
        S116419=0;
        __start_thread_16 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
          ends[16]=3;
          ;//sysj\filler_plant.sysj line: 18, column: 42
          S116419=1;
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
      S116391=0;
      __start_thread_16 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
        ends[16]=4;
        ;//sysj\filler_plant.sysj line: 14, column: 44
        S116391=1;
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

  public void thread124508(int [] tdone, int [] ends){
        S116730=1;
    thread124509(tdone,ends);
    thread124510(tdone,ends);
    thread124511(tdone,ends);
    thread124512(tdone,ends);
    int biggest124513 = 0;
    if(ends[16]>=biggest124513){
      biggest124513=ends[16];
    }
    if(ends[17]>=biggest124513){
      biggest124513=ends[17];
    }
    if(ends[18]>=biggest124513){
      biggest124513=ends[18];
    }
    if(ends[19]>=biggest124513){
      biggest124513=ends[19];
    }
    if(biggest124513 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    if(biggest124513 == 2){
      ends[15]=2;
      ;//sysj\filler_plant.sysj line: 11, column: 2
      S116730=0;
      active[15]=0;
      ends[15]=0;
      tdone[15]=1;
    }
  }

  public void thread124507(int [] tdone, int [] ends){
        active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread124504(int [] tdone, int [] ends){
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

  public void thread124503(int [] tdone, int [] ends){
        S116353=1;
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

  public void thread124502(int [] tdone, int [] ends){
        S116345=1;
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

  public void thread124501(int [] tdone, int [] ends){
        S116337=1;
    S116109=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
      S116109=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
        S116109=2;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S116051=0;
        __start_thread_10 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
          ends[10]=3;
          ;//sysj\filler_plant.sysj line: 18, column: 42
          S116051=1;
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
      S116023=0;
      __start_thread_10 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
        ends[10]=4;
        ;//sysj\filler_plant.sysj line: 14, column: 44
        S116023=1;
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

  public void thread124500(int [] tdone, int [] ends){
        S116362=1;
    thread124501(tdone,ends);
    thread124502(tdone,ends);
    thread124503(tdone,ends);
    thread124504(tdone,ends);
    int biggest124505 = 0;
    if(ends[10]>=biggest124505){
      biggest124505=ends[10];
    }
    if(ends[11]>=biggest124505){
      biggest124505=ends[11];
    }
    if(ends[12]>=biggest124505){
      biggest124505=ends[12];
    }
    if(ends[13]>=biggest124505){
      biggest124505=ends[13];
    }
    if(biggest124505 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    if(biggest124505 == 2){
      ends[9]=2;
      ;//sysj\filler_plant.sysj line: 11, column: 2
      S116362=0;
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
  }

  public void thread124499(int [] tdone, int [] ends){
        active[8]=0;
    ends[8]=0;
    tdone[8]=1;
  }

  public void thread124496(int [] tdone, int [] ends){
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

  public void thread124495(int [] tdone, int [] ends){
        S115985=1;
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

  public void thread124494(int [] tdone, int [] ends){
        S115977=1;
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

  public void thread124493(int [] tdone, int [] ends){
        S115969=1;
    S115741=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
      S115741=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
        S115741=2;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S115683=0;
        __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
          ends[4]=3;
          ;//sysj\filler_plant.sysj line: 18, column: 42
          S115683=1;
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
      S115655=0;
      __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
      S115630=0;
      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
        ends[4]=4;
        ;//sysj\filler_plant.sysj line: 14, column: 44
        S115655=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
        currsigs.addElement(dosUnitFilled);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S115630=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
  }

  public void thread124492(int [] tdone, int [] ends){
        S115994=1;
    thread124493(tdone,ends);
    thread124494(tdone,ends);
    thread124495(tdone,ends);
    thread124496(tdone,ends);
    int biggest124497 = 0;
    if(ends[4]>=biggest124497){
      biggest124497=ends[4];
    }
    if(ends[5]>=biggest124497){
      biggest124497=ends[5];
    }
    if(ends[6]>=biggest124497){
      biggest124497=ends[6];
    }
    if(ends[7]>=biggest124497){
      biggest124497=ends[7];
    }
    if(biggest124497 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest124497 == 2){
      ends[3]=2;
      ;//sysj\filler_plant.sysj line: 11, column: 2
      S115994=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread124491(int [] tdone, int [] ends){
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
      switch(S124489){
        case 0 : 
          S124489=0;
          break RUN;
        
        case 1 : 
          S124489=2;
          S124489=2;
          S118579=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S118579){
            case 0 : 
              if(nozzleSelect.getprestatus()){//sysj\filler_plant.sysj line: 55, column: 10
                S118579=1;
                if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 0){//sysj\filler_plant.sysj line: 58, column: 5
                  S117102=0;
                  thread124491(tdone,ends);
                  thread124492(tdone,ends);
                  int biggest124498 = 0;
                  if(ends[2]>=biggest124498){
                    biggest124498=ends[2];
                  }
                  if(ends[3]>=biggest124498){
                    biggest124498=ends[3];
                  }
                  if(biggest124498 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest124498 == 0){
                    S118579=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S117102=1;
                  if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 1){//sysj\filler_plant.sysj line: 62, column: 5
                    S117101=0;
                    thread124499(tdone,ends);
                    thread124500(tdone,ends);
                    int biggest124506 = 0;
                    if(ends[8]>=biggest124506){
                      biggest124506=ends[8];
                    }
                    if(ends[9]>=biggest124506){
                      biggest124506=ends[9];
                    }
                    if(biggest124506 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest124506 == 0){
                      S118579=2;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S117101=1;
                    if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 2){//sysj\filler_plant.sysj line: 66, column: 5
                      S117100=0;
                      thread124507(tdone,ends);
                      thread124508(tdone,ends);
                      int biggest124514 = 0;
                      if(ends[14]>=biggest124514){
                        biggest124514=ends[14];
                      }
                      if(ends[15]>=biggest124514){
                        biggest124514=ends[15];
                      }
                      if(biggest124514 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest124514 == 0){
                        S118579=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S117100=1;
                      if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 3){//sysj\filler_plant.sysj line: 70, column: 5
                        thread124515(tdone,ends);
                        thread124516(tdone,ends);
                        int biggest124522 = 0;
                        if(ends[20]>=biggest124522){
                          biggest124522=ends[20];
                        }
                        if(ends[21]>=biggest124522){
                          biggest124522=ends[21];
                        }
                        if(biggest124522 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest124522 == 0){
                          S118579=2;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S118579=2;
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
              switch(S117102){
                case 0 : 
                  thread124523(tdone,ends);
                  thread124524(tdone,ends);
                  int biggest124530 = 0;
                  if(ends[2]>=biggest124530){
                    biggest124530=ends[2];
                  }
                  if(ends[3]>=biggest124530){
                    biggest124530=ends[3];
                  }
                  if(biggest124530 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest124530 == 0){
                    S118579=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  switch(S117101){
                    case 0 : 
                      thread124531(tdone,ends);
                      thread124532(tdone,ends);
                      int biggest124538 = 0;
                      if(ends[8]>=biggest124538){
                        biggest124538=ends[8];
                      }
                      if(ends[9]>=biggest124538){
                        biggest124538=ends[9];
                      }
                      if(biggest124538 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest124538 == 0){
                        S118579=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      switch(S117100){
                        case 0 : 
                          thread124539(tdone,ends);
                          thread124540(tdone,ends);
                          int biggest124546 = 0;
                          if(ends[14]>=biggest124546){
                            biggest124546=ends[14];
                          }
                          if(ends[15]>=biggest124546){
                            biggest124546=ends[15];
                          }
                          if(biggest124546 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          //FINXME code
                          if(biggest124546 == 0){
                            S118579=2;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          thread124547(tdone,ends);
                          thread124548(tdone,ends);
                          int biggest124554 = 0;
                          if(ends[20]>=biggest124554){
                            biggest124554=ends[20];
                          }
                          if(ends[21]>=biggest124554){
                            biggest124554=ends[21];
                          }
                          if(biggest124554 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          //FINXME code
                          if(biggest124554 == 0){
                            S118579=2;
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
              S118579=2;
              S118579=0;
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
