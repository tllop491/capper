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
  private int S126649 = 1;
  private int S120739 = 1;
  private int S119262 = 1;
  private int S118154 = 1;
  private int S118129 = 1;
  private int S117901 = 1;
  private int S117815 = 1;
  private int S117790 = 1;
  private int S117843 = 1;
  private int S118137 = 1;
  private int S118145 = 1;
  private int S119261 = 1;
  private int S118522 = 1;
  private int S118497 = 1;
  private int S118269 = 1;
  private int S118183 = 1;
  private int S118211 = 1;
  private int S118505 = 1;
  private int S118513 = 1;
  private int S119260 = 1;
  private int S118890 = 1;
  private int S118865 = 1;
  private int S118637 = 1;
  private int S118551 = 1;
  private int S118579 = 1;
  private int S118873 = 1;
  private int S118881 = 1;
  private int S119258 = 1;
  private int S119233 = 1;
  private int S119005 = 1;
  private int S118919 = 1;
  private int S118947 = 1;
  private int S119241 = 1;
  private int S119249 = 1;
  
  private int[] ends = new int[26];
  private int[] tdone = new int[26];
  
  public void thread126712(int [] tdone, int [] ends){
        active[25]=0;
    ends[25]=0;
    tdone[25]=1;
  }

  public void thread126711(int [] tdone, int [] ends){
        switch(S119249){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 24
          inlet3Engaged.setPresent();//sysj\filler_plant.sysj line: 31, column: 41
          currsigs.addElement(inlet3Engaged);
          System.out.println("Emitted inlet3Engaged");
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

  public void thread126710(int [] tdone, int [] ends){
        switch(S119241){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 24
          injector3Engaged.setPresent();//sysj\filler_plant.sysj line: 27, column: 44
          currsigs.addElement(injector3Engaged);
          System.out.println("Emitted injector3Engaged");
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

  public void thread126709(int [] tdone, int [] ends){
        switch(S119233){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S119005){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S119005=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S119005=2;
                active[22]=1;
                ends[22]=1;
                tdone[22]=1;
              }
              else {
                S118947=0;
                __start_thread_22 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[22]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S118947=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  System.out.println("Emitted dosUnitEvac");
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
              switch(S118919){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                    ends[22]=4;
                    ;//sysj\filler_plant.sysj line: 14, column: 44
                    S118919=1;
                    dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                    currsigs.addElement(dosUnitFilled);
                    System.out.println("Emitted dosUnitFilled");
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
                  System.out.println("Emitted dosUnitFilled");
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
              S119005=2;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              switch(S118947){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                    ends[22]=3;
                    ;//sysj\filler_plant.sysj line: 18, column: 42
                    S118947=1;
                    dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                    currsigs.addElement(dosUnitEvac);
                    System.out.println("Emitted dosUnitEvac");
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
                  System.out.println("Emitted dosUnitEvac");
                  active[22]=1;
                  ends[22]=1;
                  tdone[22]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S119005=2;
            S119005=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S119005=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S119005=2;
                active[22]=1;
                ends[22]=1;
                tdone[22]=1;
              }
              else {
                S118947=0;
                __start_thread_22 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[22]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S118947=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  System.out.println("Emitted dosUnitEvac");
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
              S118919=0;
              __start_thread_22 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                ends[22]=4;
                ;//sysj\filler_plant.sysj line: 14, column: 44
                S118919=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                currsigs.addElement(dosUnitFilled);
                System.out.println("Emitted dosUnitFilled");
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

  public void thread126708(int [] tdone, int [] ends){
        switch(S119258){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        thread126709(tdone,ends);
        thread126710(tdone,ends);
        thread126711(tdone,ends);
        thread126712(tdone,ends);
        int biggest126713 = 0;
        if(ends[22]>=biggest126713){
          biggest126713=ends[22];
        }
        if(ends[23]>=biggest126713){
          biggest126713=ends[23];
        }
        if(ends[24]>=biggest126713){
          biggest126713=ends[24];
        }
        if(ends[25]>=biggest126713){
          biggest126713=ends[25];
        }
        if(biggest126713 == 1){
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        //FINXME code
        if(biggest126713 == 0){
          S119258=0;
          active[21]=0;
          ends[21]=0;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread126707(int [] tdone, int [] ends){
        active[20]=0;
    ends[20]=0;
    tdone[20]=1;
  }

  public void thread126704(int [] tdone, int [] ends){
        active[19]=0;
    ends[19]=0;
    tdone[19]=1;
  }

  public void thread126703(int [] tdone, int [] ends){
        switch(S118881){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 24
          inlet2Engaged.setPresent();//sysj\filler_plant.sysj line: 31, column: 41
          currsigs.addElement(inlet2Engaged);
          System.out.println("Emitted inlet2Engaged");
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

  public void thread126702(int [] tdone, int [] ends){
        switch(S118873){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 24
          injector2Engaged.setPresent();//sysj\filler_plant.sysj line: 27, column: 44
          currsigs.addElement(injector2Engaged);
          System.out.println("Emitted injector2Engaged");
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

  public void thread126701(int [] tdone, int [] ends){
        switch(S118865){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S118637){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S118637=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S118637=2;
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
              else {
                S118579=0;
                __start_thread_16 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[16]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S118579=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  System.out.println("Emitted dosUnitEvac");
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
              switch(S118551){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                    ends[16]=4;
                    ;//sysj\filler_plant.sysj line: 14, column: 44
                    S118551=1;
                    dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                    currsigs.addElement(dosUnitFilled);
                    System.out.println("Emitted dosUnitFilled");
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
                  System.out.println("Emitted dosUnitFilled");
                  active[16]=1;
                  ends[16]=1;
                  tdone[16]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
              S118637=2;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              switch(S118579){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                    ends[16]=3;
                    ;//sysj\filler_plant.sysj line: 18, column: 42
                    S118579=1;
                    dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                    currsigs.addElement(dosUnitEvac);
                    System.out.println("Emitted dosUnitEvac");
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
                  System.out.println("Emitted dosUnitEvac");
                  active[16]=1;
                  ends[16]=1;
                  tdone[16]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S118637=2;
            S118637=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S118637=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S118637=2;
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
              else {
                S118579=0;
                __start_thread_16 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[16]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S118579=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  System.out.println("Emitted dosUnitEvac");
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
              S118551=0;
              __start_thread_16 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                ends[16]=4;
                ;//sysj\filler_plant.sysj line: 14, column: 44
                S118551=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                currsigs.addElement(dosUnitFilled);
                System.out.println("Emitted dosUnitFilled");
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

  public void thread126700(int [] tdone, int [] ends){
        switch(S118890){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        thread126701(tdone,ends);
        thread126702(tdone,ends);
        thread126703(tdone,ends);
        thread126704(tdone,ends);
        int biggest126705 = 0;
        if(ends[16]>=biggest126705){
          biggest126705=ends[16];
        }
        if(ends[17]>=biggest126705){
          biggest126705=ends[17];
        }
        if(ends[18]>=biggest126705){
          biggest126705=ends[18];
        }
        if(ends[19]>=biggest126705){
          biggest126705=ends[19];
        }
        if(biggest126705 == 1){
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        //FINXME code
        if(biggest126705 == 0){
          S118890=0;
          active[15]=0;
          ends[15]=0;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread126699(int [] tdone, int [] ends){
        active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread126696(int [] tdone, int [] ends){
        active[13]=0;
    ends[13]=0;
    tdone[13]=1;
  }

  public void thread126695(int [] tdone, int [] ends){
        switch(S118513){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 24
          inlet1Engaged.setPresent();//sysj\filler_plant.sysj line: 31, column: 41
          currsigs.addElement(inlet1Engaged);
          System.out.println("Emitted inlet1Engaged");
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

  public void thread126694(int [] tdone, int [] ends){
        switch(S118505){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 24
          injector1Engaged.setPresent();//sysj\filler_plant.sysj line: 27, column: 44
          currsigs.addElement(injector1Engaged);
          System.out.println("Emitted injector1Engaged");
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

  public void thread126693(int [] tdone, int [] ends){
        switch(S118497){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S118269){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S118269=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S118269=2;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S118211=0;
                __start_thread_10 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[10]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S118211=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  System.out.println("Emitted dosUnitEvac");
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
              switch(S118183){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                    ends[10]=4;
                    ;//sysj\filler_plant.sysj line: 14, column: 44
                    S118183=1;
                    dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                    currsigs.addElement(dosUnitFilled);
                    System.out.println("Emitted dosUnitFilled");
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
                  System.out.println("Emitted dosUnitFilled");
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
              S118269=2;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              switch(S118211){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                    ends[10]=3;
                    ;//sysj\filler_plant.sysj line: 18, column: 42
                    S118211=1;
                    dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                    currsigs.addElement(dosUnitEvac);
                    System.out.println("Emitted dosUnitEvac");
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
                  System.out.println("Emitted dosUnitEvac");
                  active[10]=1;
                  ends[10]=1;
                  tdone[10]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S118269=2;
            S118269=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S118269=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S118269=2;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S118211=0;
                __start_thread_10 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[10]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S118211=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  System.out.println("Emitted dosUnitEvac");
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
              S118183=0;
              __start_thread_10 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                ends[10]=4;
                ;//sysj\filler_plant.sysj line: 14, column: 44
                S118183=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                currsigs.addElement(dosUnitFilled);
                System.out.println("Emitted dosUnitFilled");
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

  public void thread126692(int [] tdone, int [] ends){
        switch(S118522){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        thread126693(tdone,ends);
        thread126694(tdone,ends);
        thread126695(tdone,ends);
        thread126696(tdone,ends);
        int biggest126697 = 0;
        if(ends[10]>=biggest126697){
          biggest126697=ends[10];
        }
        if(ends[11]>=biggest126697){
          biggest126697=ends[11];
        }
        if(ends[12]>=biggest126697){
          biggest126697=ends[12];
        }
        if(ends[13]>=biggest126697){
          biggest126697=ends[13];
        }
        if(biggest126697 == 1){
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        //FINXME code
        if(biggest126697 == 0){
          S118522=0;
          active[9]=0;
          ends[9]=0;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread126691(int [] tdone, int [] ends){
        active[8]=0;
    ends[8]=0;
    tdone[8]=1;
  }

  public void thread126688(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread126687(int [] tdone, int [] ends){
        switch(S118145){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 24
          inlet0Engaged.setPresent();//sysj\filler_plant.sysj line: 31, column: 41
          currsigs.addElement(inlet0Engaged);
          System.out.println("Emitted inlet0Engaged");
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

  public void thread126686(int [] tdone, int [] ends){
        switch(S118137){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 24
          injector0Engaged.setPresent();//sysj\filler_plant.sysj line: 27, column: 44
          currsigs.addElement(injector0Engaged);
          System.out.println("Emitted injector0Engaged");
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

  public void thread126685(int [] tdone, int [] ends){
        switch(S118129){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S117901){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S117901=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S117901=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S117843=0;
                __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[4]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S117843=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  System.out.println("Emitted dosUnitEvac");
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
              switch(S117815){
                case 0 : 
                  switch(S117790){
                    case 0 : 
                      S117790=0;
                      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                        ends[4]=4;
                        ;//sysj\filler_plant.sysj line: 14, column: 44
                        S117815=1;
                        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                        currsigs.addElement(dosUnitFilled);
                        System.out.println("Emitted dosUnitFilled");
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S117790=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                    case 1 : 
                      S117790=1;
                      S117790=0;
                      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                        ends[4]=4;
                        ;//sysj\filler_plant.sysj line: 14, column: 44
                        S117815=1;
                        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                        currsigs.addElement(dosUnitFilled);
                        System.out.println("Emitted dosUnitFilled");
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S117790=1;
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
                  System.out.println("Emitted dosUnitFilled");
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
              S117901=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              switch(S117843){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                    ends[4]=3;
                    ;//sysj\filler_plant.sysj line: 18, column: 42
                    S117843=1;
                    dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                    currsigs.addElement(dosUnitEvac);
                    System.out.println("Emitted dosUnitEvac");
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
                  System.out.println("Emitted dosUnitEvac");
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S117901=2;
            S117901=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
              S117901=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
                S117901=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S117843=0;
                __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
                  ends[4]=3;
                  ;//sysj\filler_plant.sysj line: 18, column: 42
                  S117843=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
                  currsigs.addElement(dosUnitEvac);
                  System.out.println("Emitted dosUnitEvac");
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
              S117815=0;
              __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
              S117790=0;
              if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
                ends[4]=4;
                ;//sysj\filler_plant.sysj line: 14, column: 44
                S117815=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
                currsigs.addElement(dosUnitFilled);
                System.out.println("Emitted dosUnitFilled");
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S117790=1;
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

  public void thread126684(int [] tdone, int [] ends){
        switch(S118154){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread126685(tdone,ends);
        thread126686(tdone,ends);
        thread126687(tdone,ends);
        thread126688(tdone,ends);
        int biggest126689 = 0;
        if(ends[4]>=biggest126689){
          biggest126689=ends[4];
        }
        if(ends[5]>=biggest126689){
          biggest126689=ends[5];
        }
        if(ends[6]>=biggest126689){
          biggest126689=ends[6];
        }
        if(ends[7]>=biggest126689){
          biggest126689=ends[7];
        }
        if(biggest126689 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest126689 == 0){
          S118154=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread126683(int [] tdone, int [] ends){
        active[2]=0;
    ends[2]=0;
    tdone[2]=1;
  }

  public void thread126680(int [] tdone, int [] ends){
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

  public void thread126679(int [] tdone, int [] ends){
        S119249=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 24
      inlet3Engaged.setPresent();//sysj\filler_plant.sysj line: 31, column: 41
      currsigs.addElement(inlet3Engaged);
      System.out.println("Emitted inlet3Engaged");
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

  public void thread126678(int [] tdone, int [] ends){
        S119241=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 24
      injector3Engaged.setPresent();//sysj\filler_plant.sysj line: 27, column: 44
      currsigs.addElement(injector3Engaged);
      System.out.println("Emitted injector3Engaged");
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

  public void thread126677(int [] tdone, int [] ends){
        S119233=1;
    S119005=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
      S119005=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
        S119005=2;
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
      }
      else {
        S118947=0;
        __start_thread_22 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
          ends[22]=3;
          ;//sysj\filler_plant.sysj line: 18, column: 42
          S118947=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
          currsigs.addElement(dosUnitEvac);
          System.out.println("Emitted dosUnitEvac");
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
      S118919=0;
      __start_thread_22 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
        ends[22]=4;
        ;//sysj\filler_plant.sysj line: 14, column: 44
        S118919=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
        currsigs.addElement(dosUnitFilled);
        System.out.println("Emitted dosUnitFilled");
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

  public void thread126676(int [] tdone, int [] ends){
        S119258=1;
    thread126677(tdone,ends);
    thread126678(tdone,ends);
    thread126679(tdone,ends);
    thread126680(tdone,ends);
    int biggest126681 = 0;
    if(ends[22]>=biggest126681){
      biggest126681=ends[22];
    }
    if(ends[23]>=biggest126681){
      biggest126681=ends[23];
    }
    if(ends[24]>=biggest126681){
      biggest126681=ends[24];
    }
    if(ends[25]>=biggest126681){
      biggest126681=ends[25];
    }
    if(biggest126681 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest126681 == 2){
      ends[21]=2;
      ;//sysj\filler_plant.sysj line: 11, column: 2
      S119258=0;
      active[21]=0;
      ends[21]=0;
      tdone[21]=1;
    }
  }

  public void thread126675(int [] tdone, int [] ends){
        active[20]=0;
    ends[20]=0;
    tdone[20]=1;
  }

  public void thread126672(int [] tdone, int [] ends){
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

  public void thread126671(int [] tdone, int [] ends){
        S118881=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 24
      inlet2Engaged.setPresent();//sysj\filler_plant.sysj line: 31, column: 41
      currsigs.addElement(inlet2Engaged);
      System.out.println("Emitted inlet2Engaged");
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

  public void thread126670(int [] tdone, int [] ends){
        S118873=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 24
      injector2Engaged.setPresent();//sysj\filler_plant.sysj line: 27, column: 44
      currsigs.addElement(injector2Engaged);
      System.out.println("Emitted injector2Engaged");
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

  public void thread126669(int [] tdone, int [] ends){
        S118865=1;
    S118637=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
      S118637=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
        S118637=2;
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
      else {
        S118579=0;
        __start_thread_16 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
          ends[16]=3;
          ;//sysj\filler_plant.sysj line: 18, column: 42
          S118579=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
          currsigs.addElement(dosUnitEvac);
          System.out.println("Emitted dosUnitEvac");
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
      S118551=0;
      __start_thread_16 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
        ends[16]=4;
        ;//sysj\filler_plant.sysj line: 14, column: 44
        S118551=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
        currsigs.addElement(dosUnitFilled);
        System.out.println("Emitted dosUnitFilled");
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

  public void thread126668(int [] tdone, int [] ends){
        S118890=1;
    thread126669(tdone,ends);
    thread126670(tdone,ends);
    thread126671(tdone,ends);
    thread126672(tdone,ends);
    int biggest126673 = 0;
    if(ends[16]>=biggest126673){
      biggest126673=ends[16];
    }
    if(ends[17]>=biggest126673){
      biggest126673=ends[17];
    }
    if(ends[18]>=biggest126673){
      biggest126673=ends[18];
    }
    if(ends[19]>=biggest126673){
      biggest126673=ends[19];
    }
    if(biggest126673 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    if(biggest126673 == 2){
      ends[15]=2;
      ;//sysj\filler_plant.sysj line: 11, column: 2
      S118890=0;
      active[15]=0;
      ends[15]=0;
      tdone[15]=1;
    }
  }

  public void thread126667(int [] tdone, int [] ends){
        active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread126664(int [] tdone, int [] ends){
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

  public void thread126663(int [] tdone, int [] ends){
        S118513=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 24
      inlet1Engaged.setPresent();//sysj\filler_plant.sysj line: 31, column: 41
      currsigs.addElement(inlet1Engaged);
      System.out.println("Emitted inlet1Engaged");
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

  public void thread126662(int [] tdone, int [] ends){
        S118505=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 24
      injector1Engaged.setPresent();//sysj\filler_plant.sysj line: 27, column: 44
      currsigs.addElement(injector1Engaged);
      System.out.println("Emitted injector1Engaged");
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

  public void thread126661(int [] tdone, int [] ends){
        S118497=1;
    S118269=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
      S118269=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
        S118269=2;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S118211=0;
        __start_thread_10 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
          ends[10]=3;
          ;//sysj\filler_plant.sysj line: 18, column: 42
          S118211=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
          currsigs.addElement(dosUnitEvac);
          System.out.println("Emitted dosUnitEvac");
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
      S118183=0;
      __start_thread_10 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
        ends[10]=4;
        ;//sysj\filler_plant.sysj line: 14, column: 44
        S118183=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
        currsigs.addElement(dosUnitFilled);
        System.out.println("Emitted dosUnitFilled");
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

  public void thread126660(int [] tdone, int [] ends){
        S118522=1;
    thread126661(tdone,ends);
    thread126662(tdone,ends);
    thread126663(tdone,ends);
    thread126664(tdone,ends);
    int biggest126665 = 0;
    if(ends[10]>=biggest126665){
      biggest126665=ends[10];
    }
    if(ends[11]>=biggest126665){
      biggest126665=ends[11];
    }
    if(ends[12]>=biggest126665){
      biggest126665=ends[12];
    }
    if(ends[13]>=biggest126665){
      biggest126665=ends[13];
    }
    if(biggest126665 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    if(biggest126665 == 2){
      ends[9]=2;
      ;//sysj\filler_plant.sysj line: 11, column: 2
      S118522=0;
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
  }

  public void thread126659(int [] tdone, int [] ends){
        active[8]=0;
    ends[8]=0;
    tdone[8]=1;
  }

  public void thread126656(int [] tdone, int [] ends){
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

  public void thread126655(int [] tdone, int [] ends){
        S118145=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 31, column: 24
      inlet0Engaged.setPresent();//sysj\filler_plant.sysj line: 31, column: 41
      currsigs.addElement(inlet0Engaged);
      System.out.println("Emitted inlet0Engaged");
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

  public void thread126654(int [] tdone, int [] ends){
        S118137=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 27, column: 24
      injector0Engaged.setPresent();//sysj\filler_plant.sysj line: 27, column: 44
      currsigs.addElement(injector0Engaged);
      System.out.println("Emitted injector0Engaged");
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

  public void thread126653(int [] tdone, int [] ends){
        S118129=1;
    S117901=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 14, column: 22
      S117901=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 18, column: 22
        S117901=2;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S117843=0;
        __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 18, column: 42
          ends[4]=3;
          ;//sysj\filler_plant.sysj line: 18, column: 42
          S117843=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 20, column: 6
          currsigs.addElement(dosUnitEvac);
          System.out.println("Emitted dosUnitEvac");
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
      S117815=0;
      __start_thread_4 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 14, column: 44
      S117790=0;
      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj\filler_plant.sysj line: 14, column: 44
        ends[4]=4;
        ;//sysj\filler_plant.sysj line: 14, column: 44
        S117815=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 16, column: 6
        currsigs.addElement(dosUnitFilled);
        System.out.println("Emitted dosUnitFilled");
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S117790=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
  }

  public void thread126652(int [] tdone, int [] ends){
        S118154=1;
    thread126653(tdone,ends);
    thread126654(tdone,ends);
    thread126655(tdone,ends);
    thread126656(tdone,ends);
    int biggest126657 = 0;
    if(ends[4]>=biggest126657){
      biggest126657=ends[4];
    }
    if(ends[5]>=biggest126657){
      biggest126657=ends[5];
    }
    if(ends[6]>=biggest126657){
      biggest126657=ends[6];
    }
    if(ends[7]>=biggest126657){
      biggest126657=ends[7];
    }
    if(biggest126657 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest126657 == 2){
      ends[3]=2;
      ;//sysj\filler_plant.sysj line: 11, column: 2
      S118154=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread126651(int [] tdone, int [] ends){
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
      switch(S126649){
        case 0 : 
          S126649=0;
          break RUN;
        
        case 1 : 
          S126649=2;
          S126649=2;
          S120739=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S120739){
            case 0 : 
              if(nozzleSelect.getprestatus()){//sysj\filler_plant.sysj line: 55, column: 10
                S120739=1;
                if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 0){//sysj\filler_plant.sysj line: 58, column: 5
                  S119262=0;
                  thread126651(tdone,ends);
                  thread126652(tdone,ends);
                  int biggest126658 = 0;
                  if(ends[2]>=biggest126658){
                    biggest126658=ends[2];
                  }
                  if(ends[3]>=biggest126658){
                    biggest126658=ends[3];
                  }
                  if(biggest126658 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest126658 == 0){
                    S120739=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S119262=1;
                  if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 1){//sysj\filler_plant.sysj line: 62, column: 5
                    S119261=0;
                    thread126659(tdone,ends);
                    thread126660(tdone,ends);
                    int biggest126666 = 0;
                    if(ends[8]>=biggest126666){
                      biggest126666=ends[8];
                    }
                    if(ends[9]>=biggest126666){
                      biggest126666=ends[9];
                    }
                    if(biggest126666 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest126666 == 0){
                      S120739=2;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S119261=1;
                    if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 2){//sysj\filler_plant.sysj line: 66, column: 5
                      S119260=0;
                      thread126667(tdone,ends);
                      thread126668(tdone,ends);
                      int biggest126674 = 0;
                      if(ends[14]>=biggest126674){
                        biggest126674=ends[14];
                      }
                      if(ends[15]>=biggest126674){
                        biggest126674=ends[15];
                      }
                      if(biggest126674 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest126674 == 0){
                        S120739=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S119260=1;
                      if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 3){//sysj\filler_plant.sysj line: 70, column: 5
                        thread126675(tdone,ends);
                        thread126676(tdone,ends);
                        int biggest126682 = 0;
                        if(ends[20]>=biggest126682){
                          biggest126682=ends[20];
                        }
                        if(ends[21]>=biggest126682){
                          biggest126682=ends[21];
                        }
                        if(biggest126682 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest126682 == 0){
                          S120739=2;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S120739=2;
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
              switch(S119262){
                case 0 : 
                  thread126683(tdone,ends);
                  thread126684(tdone,ends);
                  int biggest126690 = 0;
                  if(ends[2]>=biggest126690){
                    biggest126690=ends[2];
                  }
                  if(ends[3]>=biggest126690){
                    biggest126690=ends[3];
                  }
                  if(biggest126690 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest126690 == 0){
                    S120739=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  switch(S119261){
                    case 0 : 
                      thread126691(tdone,ends);
                      thread126692(tdone,ends);
                      int biggest126698 = 0;
                      if(ends[8]>=biggest126698){
                        biggest126698=ends[8];
                      }
                      if(ends[9]>=biggest126698){
                        biggest126698=ends[9];
                      }
                      if(biggest126698 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest126698 == 0){
                        S120739=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      switch(S119260){
                        case 0 : 
                          thread126699(tdone,ends);
                          thread126700(tdone,ends);
                          int biggest126706 = 0;
                          if(ends[14]>=biggest126706){
                            biggest126706=ends[14];
                          }
                          if(ends[15]>=biggest126706){
                            biggest126706=ends[15];
                          }
                          if(biggest126706 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          //FINXME code
                          if(biggest126706 == 0){
                            S120739=2;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          thread126707(tdone,ends);
                          thread126708(tdone,ends);
                          int biggest126714 = 0;
                          if(ends[20]>=biggest126714){
                            biggest126714=ends[20];
                          }
                          if(ends[21]>=biggest126714){
                            biggest126714=ends[21];
                          }
                          if(biggest126714 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          //FINXME code
                          if(biggest126714 == 0){
                            S120739=2;
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
              S120739=2;
              S120739=0;
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
