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
  public Signal dosUnitEvac_GUI = new Signal("dosUnitEvac_GUI", Signal.OUTPUT);
  public Signal dosUnitFilled_GUI = new Signal("dosUnitFilled_GUI", Signal.OUTPUT);
  private long __start_thread_5;//sysj\filler_plant.sysj line: 17, column: 44
  private long __start_thread_12;//sysj\filler_plant.sysj line: 17, column: 44
  private long __start_thread_19;//sysj\filler_plant.sysj line: 17, column: 44
  private long __start_thread_26;//sysj\filler_plant.sysj line: 17, column: 44
  private int S93400 = 1;
  private int S93382 = 1;
  private int S84424 = 1;
  private int S81439 = 1;
  private int S80319 = 1;
  private int S80290 = 1;
  private int S80062 = 1;
  private int S79976 = 1;
  private int S79951 = 1;
  private int S80004 = 1;
  private int S80298 = 1;
  private int S80306 = 1;
  private int S80311 = 1;
  private int S80316 = 1;
  private int S80315 = 1;
  private int S81438 = 1;
  private int S80691 = 1;
  private int S80662 = 1;
  private int S80434 = 1;
  private int S80348 = 1;
  private int S80376 = 1;
  private int S80670 = 1;
  private int S80678 = 1;
  private int S80683 = 1;
  private int S80688 = 1;
  private int S80687 = 1;
  private int S81437 = 1;
  private int S81063 = 1;
  private int S81034 = 1;
  private int S80806 = 1;
  private int S80720 = 1;
  private int S80748 = 1;
  private int S81042 = 1;
  private int S81050 = 1;
  private int S81055 = 1;
  private int S81060 = 1;
  private int S81059 = 1;
  private int S81435 = 1;
  private int S81406 = 1;
  private int S81178 = 1;
  private int S81092 = 1;
  private int S81120 = 1;
  private int S81414 = 1;
  private int S81422 = 1;
  private int S81427 = 1;
  private int S81432 = 1;
  private int S81431 = 1;
  private int S93390 = 1;
  private int S93398 = 1;
  
  private int[] ends = new int[33];
  private int[] tdone = new int[33];
  
  public void thread93552(int [] tdone, int [] ends){
        switch(S93398){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\filler_plant.sysj line: 93, column: 23
          dosUnitFilled_GUI.setPresent();//sysj\filler_plant.sysj line: 93, column: 38
          currsigs.addElement(dosUnitFilled_GUI);
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        else {
          active[32]=1;
          ends[32]=1;
          tdone[32]=1;
        }
        break;
      
    }
  }

  public void thread93551(int [] tdone, int [] ends){
        switch(S93390){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\filler_plant.sysj line: 89, column: 23
          dosUnitEvac_GUI.setPresent();//sysj\filler_plant.sysj line: 89, column: 36
          currsigs.addElement(dosUnitEvac_GUI);
          active[31]=1;
          ends[31]=1;
          tdone[31]=1;
        }
        else {
          active[31]=1;
          ends[31]=1;
          tdone[31]=1;
        }
        break;
      
    }
  }

  public void thread93548(int [] tdone, int [] ends){
        S81432=1;
    S81431=0;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread93547(int [] tdone, int [] ends){
        S81427=1;
    nozzle3Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle3Engaged);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread93546(int [] tdone, int [] ends){
        S81422=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
      inlet3Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
      currsigs.addElement(inlet3Engaged);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread93545(int [] tdone, int [] ends){
        S81414=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
      injector3Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
      currsigs.addElement(injector3Engaged);
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

  public void thread93544(int [] tdone, int [] ends){
        S81406=1;
    S81178=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S81178=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S81178=2;
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
      }
      else {
        S81120=0;
        __start_thread_26 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[26]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S81120=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
          currsigs.addElement(dosUnitEvac);
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
    }
    else {
      S81092=0;
      __start_thread_26 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[26]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S81092=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
        currsigs.addElement(dosUnitFilled);
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
  }

  public void thread93543(int [] tdone, int [] ends){
        S81435=1;
    thread93544(tdone,ends);
    thread93545(tdone,ends);
    thread93546(tdone,ends);
    thread93547(tdone,ends);
    thread93548(tdone,ends);
    int biggest93549 = 0;
    if(ends[26]>=biggest93549){
      biggest93549=ends[26];
    }
    if(ends[27]>=biggest93549){
      biggest93549=ends[27];
    }
    if(ends[28]>=biggest93549){
      biggest93549=ends[28];
    }
    if(ends[29]>=biggest93549){
      biggest93549=ends[29];
    }
    if(ends[30]>=biggest93549){
      biggest93549=ends[30];
    }
    if(biggest93549 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread93542(int [] tdone, int [] ends){
        active[24]=0;
    ends[24]=0;
    tdone[24]=1;
  }

  public void thread93539(int [] tdone, int [] ends){
        S81060=1;
    S81059=0;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread93538(int [] tdone, int [] ends){
        S81055=1;
    nozzle2Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle2Engaged);
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread93537(int [] tdone, int [] ends){
        S81050=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
      inlet2Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
      currsigs.addElement(inlet2Engaged);
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread93536(int [] tdone, int [] ends){
        S81042=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
      injector2Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
      currsigs.addElement(injector2Engaged);
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

  public void thread93535(int [] tdone, int [] ends){
        S81034=1;
    S80806=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S80806=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S80806=2;
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
      else {
        S80748=0;
        __start_thread_19 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[19]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S80748=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
          currsigs.addElement(dosUnitEvac);
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
    }
    else {
      S80720=0;
      __start_thread_19 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[19]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S80720=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
        currsigs.addElement(dosUnitFilled);
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
  }

  public void thread93534(int [] tdone, int [] ends){
        S81063=1;
    thread93535(tdone,ends);
    thread93536(tdone,ends);
    thread93537(tdone,ends);
    thread93538(tdone,ends);
    thread93539(tdone,ends);
    int biggest93540 = 0;
    if(ends[19]>=biggest93540){
      biggest93540=ends[19];
    }
    if(ends[20]>=biggest93540){
      biggest93540=ends[20];
    }
    if(ends[21]>=biggest93540){
      biggest93540=ends[21];
    }
    if(ends[22]>=biggest93540){
      biggest93540=ends[22];
    }
    if(ends[23]>=biggest93540){
      biggest93540=ends[23];
    }
    if(biggest93540 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread93533(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread93530(int [] tdone, int [] ends){
        S80688=1;
    S80687=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread93529(int [] tdone, int [] ends){
        S80683=1;
    nozzle1Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle1Engaged);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread93528(int [] tdone, int [] ends){
        S80678=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
      inlet1Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
      currsigs.addElement(inlet1Engaged);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread93527(int [] tdone, int [] ends){
        S80670=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
      injector1Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
      currsigs.addElement(injector1Engaged);
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

  public void thread93526(int [] tdone, int [] ends){
        S80662=1;
    S80434=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S80434=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S80434=2;
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
      else {
        S80376=0;
        __start_thread_12 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_12 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[12]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S80376=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
          currsigs.addElement(dosUnitEvac);
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
    }
    else {
      S80348=0;
      __start_thread_12 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_12 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[12]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S80348=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
        currsigs.addElement(dosUnitFilled);
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
  }

  public void thread93525(int [] tdone, int [] ends){
        S80691=1;
    thread93526(tdone,ends);
    thread93527(tdone,ends);
    thread93528(tdone,ends);
    thread93529(tdone,ends);
    thread93530(tdone,ends);
    int biggest93531 = 0;
    if(ends[12]>=biggest93531){
      biggest93531=ends[12];
    }
    if(ends[13]>=biggest93531){
      biggest93531=ends[13];
    }
    if(ends[14]>=biggest93531){
      biggest93531=ends[14];
    }
    if(ends[15]>=biggest93531){
      biggest93531=ends[15];
    }
    if(ends[16]>=biggest93531){
      biggest93531=ends[16];
    }
    if(biggest93531 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread93524(int [] tdone, int [] ends){
        active[10]=0;
    ends[10]=0;
    tdone[10]=1;
  }

  public void thread93521(int [] tdone, int [] ends){
        S80316=1;
    S80315=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread93520(int [] tdone, int [] ends){
        S80311=1;
    nozzle0Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle0Engaged);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread93519(int [] tdone, int [] ends){
        S80306=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
      inlet0Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
      currsigs.addElement(inlet0Engaged);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread93518(int [] tdone, int [] ends){
        S80298=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
      injector0Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
      currsigs.addElement(injector0Engaged);
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

  public void thread93517(int [] tdone, int [] ends){
        S80290=1;
    S80062=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S80062=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S80062=2;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S80004=0;
        __start_thread_5 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[5]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S80004=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
          currsigs.addElement(dosUnitEvac);
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
    }
    else {
      S79976=0;
      __start_thread_5 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      S79951=0;
      if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[5]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S79976=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
        currsigs.addElement(dosUnitFilled);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S79951=1;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
  }

  public void thread93516(int [] tdone, int [] ends){
        S80319=1;
    thread93517(tdone,ends);
    thread93518(tdone,ends);
    thread93519(tdone,ends);
    thread93520(tdone,ends);
    thread93521(tdone,ends);
    int biggest93522 = 0;
    if(ends[5]>=biggest93522){
      biggest93522=ends[5];
    }
    if(ends[6]>=biggest93522){
      biggest93522=ends[6];
    }
    if(ends[7]>=biggest93522){
      biggest93522=ends[7];
    }
    if(ends[8]>=biggest93522){
      biggest93522=ends[8];
    }
    if(ends[9]>=biggest93522){
      biggest93522=ends[9];
    }
    if(biggest93522 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread93515(int [] tdone, int [] ends){
        active[3]=0;
    ends[3]=0;
    tdone[3]=1;
  }

  public void thread93512(int [] tdone, int [] ends){
        switch(S81432){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        switch(S81431){
          case 0 : 
            if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 42, column: 10
              S81431=1;
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            else {
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 43, column: 10
              ends[30]=2;
              tdone[30]=1;
            }
            else {
              active[30]=1;
              ends[30]=1;
              tdone[30]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread93511(int [] tdone, int [] ends){
        switch(S81427){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        nozzle3Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
        currsigs.addElement(nozzle3Engaged);
        active[29]=1;
        ends[29]=1;
        tdone[29]=1;
        break;
      
    }
  }

  public void thread93510(int [] tdone, int [] ends){
        switch(S81422){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
          inlet3Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
          currsigs.addElement(inlet3Engaged);
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        else {
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        break;
      
    }
  }

  public void thread93509(int [] tdone, int [] ends){
        switch(S81414){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
          injector3Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
          currsigs.addElement(injector3Engaged);
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

  public void thread93508(int [] tdone, int [] ends){
        switch(S81406){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S81178){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S81178=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S81178=2;
                active[26]=1;
                ends[26]=1;
                tdone[26]=1;
              }
              else {
                S81120=0;
                __start_thread_26 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[26]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S81120=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
                  currsigs.addElement(dosUnitEvac);
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
            }
            else {
              switch(S81092){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                    ends[26]=4;
                    ;//sysj\filler_plant.sysj line: 17, column: 44
                    S81092=1;
                    dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                    currsigs.addElement(dosUnitFilled);
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
                
                case 1 : 
                  dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                  currsigs.addElement(dosUnitFilled);
                  active[26]=1;
                  ends[26]=1;
                  tdone[26]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
              S81178=2;
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            else {
              switch(S81120){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                    ends[26]=3;
                    ;//sysj\filler_plant.sysj line: 21, column: 42
                    S81120=1;
                    dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
                    currsigs.addElement(dosUnitEvac);
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
                
                case 1 : 
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[26]=1;
                  ends[26]=1;
                  tdone[26]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S81178=2;
            S81178=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S81178=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S81178=2;
                active[26]=1;
                ends[26]=1;
                tdone[26]=1;
              }
              else {
                S81120=0;
                __start_thread_26 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[26]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S81120=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
                  currsigs.addElement(dosUnitEvac);
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
            }
            else {
              S81092=0;
              __start_thread_26 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                ends[26]=4;
                ;//sysj\filler_plant.sysj line: 17, column: 44
                S81092=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                currsigs.addElement(dosUnitFilled);
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
            break;
          
        }
        break;
      
    }
  }

  public void thread93507(int [] tdone, int [] ends){
        switch(S81435){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        thread93508(tdone,ends);
        thread93509(tdone,ends);
        thread93510(tdone,ends);
        thread93511(tdone,ends);
        thread93512(tdone,ends);
        int biggest93513 = 0;
        if(ends[26]>=biggest93513){
          biggest93513=ends[26];
        }
        if(ends[27]>=biggest93513){
          biggest93513=ends[27];
        }
        if(ends[28]>=biggest93513){
          biggest93513=ends[28];
        }
        if(ends[29]>=biggest93513){
          biggest93513=ends[29];
        }
        if(ends[30]>=biggest93513){
          biggest93513=ends[30];
        }
        if(biggest93513 == 1){
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        if(biggest93513 == 2){
          ends[25]=2;
          ;//sysj\filler_plant.sysj line: 14, column: 2
          S81435=0;
          active[25]=0;
          ends[25]=0;
          tdone[25]=1;
        }
        //FINXME code
        if(biggest93513 == 0){
          S81435=0;
          active[25]=0;
          ends[25]=0;
          tdone[25]=1;
        }
        break;
      
    }
  }

  public void thread93506(int [] tdone, int [] ends){
        active[24]=0;
    ends[24]=0;
    tdone[24]=1;
  }

  public void thread93503(int [] tdone, int [] ends){
        switch(S81060){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S81059){
          case 0 : 
            if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 42, column: 10
              S81059=1;
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
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 43, column: 10
              ends[23]=2;
              tdone[23]=1;
            }
            else {
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread93502(int [] tdone, int [] ends){
        switch(S81055){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        nozzle2Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
        currsigs.addElement(nozzle2Engaged);
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
        break;
      
    }
  }

  public void thread93501(int [] tdone, int [] ends){
        switch(S81050){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
          inlet2Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
          currsigs.addElement(inlet2Engaged);
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        else {
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread93500(int [] tdone, int [] ends){
        switch(S81042){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
          injector2Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
          currsigs.addElement(injector2Engaged);
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

  public void thread93499(int [] tdone, int [] ends){
        switch(S81034){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S80806){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S80806=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S80806=2;
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S80748=0;
                __start_thread_19 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[19]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S80748=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
                  currsigs.addElement(dosUnitEvac);
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
            }
            else {
              switch(S80720){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                    ends[19]=4;
                    ;//sysj\filler_plant.sysj line: 17, column: 44
                    S80720=1;
                    dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                    currsigs.addElement(dosUnitFilled);
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
                
                case 1 : 
                  dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                  currsigs.addElement(dosUnitFilled);
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
              S80806=2;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              switch(S80748){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                    ends[19]=3;
                    ;//sysj\filler_plant.sysj line: 21, column: 42
                    S80748=1;
                    dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
                    currsigs.addElement(dosUnitEvac);
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
                
                case 1 : 
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S80806=2;
            S80806=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S80806=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S80806=2;
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S80748=0;
                __start_thread_19 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[19]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S80748=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
                  currsigs.addElement(dosUnitEvac);
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
            }
            else {
              S80720=0;
              __start_thread_19 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                ends[19]=4;
                ;//sysj\filler_plant.sysj line: 17, column: 44
                S80720=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                currsigs.addElement(dosUnitFilled);
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
            break;
          
        }
        break;
      
    }
  }

  public void thread93498(int [] tdone, int [] ends){
        switch(S81063){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        thread93499(tdone,ends);
        thread93500(tdone,ends);
        thread93501(tdone,ends);
        thread93502(tdone,ends);
        thread93503(tdone,ends);
        int biggest93504 = 0;
        if(ends[19]>=biggest93504){
          biggest93504=ends[19];
        }
        if(ends[20]>=biggest93504){
          biggest93504=ends[20];
        }
        if(ends[21]>=biggest93504){
          biggest93504=ends[21];
        }
        if(ends[22]>=biggest93504){
          biggest93504=ends[22];
        }
        if(ends[23]>=biggest93504){
          biggest93504=ends[23];
        }
        if(biggest93504 == 1){
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        if(biggest93504 == 2){
          ends[18]=2;
          ;//sysj\filler_plant.sysj line: 14, column: 2
          S81063=0;
          active[18]=0;
          ends[18]=0;
          tdone[18]=1;
        }
        //FINXME code
        if(biggest93504 == 0){
          S81063=0;
          active[18]=0;
          ends[18]=0;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread93497(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread93494(int [] tdone, int [] ends){
        switch(S80688){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S80687){
          case 0 : 
            if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 42, column: 10
              S80687=1;
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
            if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 43, column: 10
              ends[16]=2;
              tdone[16]=1;
            }
            else {
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread93493(int [] tdone, int [] ends){
        switch(S80683){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        nozzle1Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
        currsigs.addElement(nozzle1Engaged);
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
        break;
      
    }
  }

  public void thread93492(int [] tdone, int [] ends){
        switch(S80678){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
          inlet1Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
          currsigs.addElement(inlet1Engaged);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread93491(int [] tdone, int [] ends){
        switch(S80670){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
          injector1Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
          currsigs.addElement(injector1Engaged);
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

  public void thread93490(int [] tdone, int [] ends){
        switch(S80662){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S80434){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S80434=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S80434=2;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                S80376=0;
                __start_thread_12 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_12 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[12]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S80376=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
                  currsigs.addElement(dosUnitEvac);
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
            }
            else {
              switch(S80348){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_12 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                    ends[12]=4;
                    ;//sysj\filler_plant.sysj line: 17, column: 44
                    S80348=1;
                    dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                    currsigs.addElement(dosUnitFilled);
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
                
                case 1 : 
                  dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                  currsigs.addElement(dosUnitFilled);
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
              S80434=2;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              switch(S80376){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_12 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                    ends[12]=3;
                    ;//sysj\filler_plant.sysj line: 21, column: 42
                    S80376=1;
                    dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
                    currsigs.addElement(dosUnitEvac);
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
                
                case 1 : 
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[12]=1;
                  ends[12]=1;
                  tdone[12]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S80434=2;
            S80434=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S80434=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S80434=2;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                S80376=0;
                __start_thread_12 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_12 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[12]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S80376=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
                  currsigs.addElement(dosUnitEvac);
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
            }
            else {
              S80348=0;
              __start_thread_12 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_12 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                ends[12]=4;
                ;//sysj\filler_plant.sysj line: 17, column: 44
                S80348=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                currsigs.addElement(dosUnitFilled);
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
            break;
          
        }
        break;
      
    }
  }

  public void thread93489(int [] tdone, int [] ends){
        switch(S80691){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread93490(tdone,ends);
        thread93491(tdone,ends);
        thread93492(tdone,ends);
        thread93493(tdone,ends);
        thread93494(tdone,ends);
        int biggest93495 = 0;
        if(ends[12]>=biggest93495){
          biggest93495=ends[12];
        }
        if(ends[13]>=biggest93495){
          biggest93495=ends[13];
        }
        if(ends[14]>=biggest93495){
          biggest93495=ends[14];
        }
        if(ends[15]>=biggest93495){
          biggest93495=ends[15];
        }
        if(ends[16]>=biggest93495){
          biggest93495=ends[16];
        }
        if(biggest93495 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        if(biggest93495 == 2){
          ends[11]=2;
          ;//sysj\filler_plant.sysj line: 14, column: 2
          S80691=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest93495 == 0){
          S80691=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread93488(int [] tdone, int [] ends){
        active[10]=0;
    ends[10]=0;
    tdone[10]=1;
  }

  public void thread93485(int [] tdone, int [] ends){
        switch(S80316){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S80315){
          case 0 : 
            if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 42, column: 10
              S80315=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 43, column: 10
              ends[9]=2;
              tdone[9]=1;
            }
            else {
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread93484(int [] tdone, int [] ends){
        switch(S80311){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        nozzle0Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
        currsigs.addElement(nozzle0Engaged);
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
        break;
      
    }
  }

  public void thread93483(int [] tdone, int [] ends){
        switch(S80306){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
          inlet0Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
          currsigs.addElement(inlet0Engaged);
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        else {
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread93482(int [] tdone, int [] ends){
        switch(S80298){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
          injector0Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
          currsigs.addElement(injector0Engaged);
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

  public void thread93481(int [] tdone, int [] ends){
        switch(S80290){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S80062){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S80062=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S80062=2;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S80004=0;
                __start_thread_5 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[5]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S80004=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
                  currsigs.addElement(dosUnitEvac);
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
            }
            else {
              switch(S79976){
                case 0 : 
                  switch(S79951){
                    case 0 : 
                      S79951=0;
                      if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                        ends[5]=4;
                        ;//sysj\filler_plant.sysj line: 17, column: 44
                        S79976=1;
                        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                        currsigs.addElement(dosUnitFilled);
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S79951=1;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      break;
                    
                    case 1 : 
                      S79951=1;
                      S79951=0;
                      if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                        ends[5]=4;
                        ;//sysj\filler_plant.sysj line: 17, column: 44
                        S79976=1;
                        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                        currsigs.addElement(dosUnitFilled);
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S79951=1;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                  currsigs.addElement(dosUnitFilled);
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                  break;
                
              }
            }
            break;
          
          case 1 : 
            if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
              S80062=2;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S80004){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                    ends[5]=3;
                    ;//sysj\filler_plant.sysj line: 21, column: 42
                    S80004=1;
                    dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
                    currsigs.addElement(dosUnitEvac);
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
                
                case 1 : 
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
                  currsigs.addElement(dosUnitEvac);
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S80062=2;
            S80062=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S80062=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S80062=2;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S80004=0;
                __start_thread_5 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[5]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S80004=1;
                  dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
                  currsigs.addElement(dosUnitEvac);
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
            }
            else {
              S79976=0;
              __start_thread_5 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
              S79951=0;
              if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                ends[5]=4;
                ;//sysj\filler_plant.sysj line: 17, column: 44
                S79976=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                currsigs.addElement(dosUnitFilled);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S79951=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread93480(int [] tdone, int [] ends){
        switch(S80319){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread93481(tdone,ends);
        thread93482(tdone,ends);
        thread93483(tdone,ends);
        thread93484(tdone,ends);
        thread93485(tdone,ends);
        int biggest93486 = 0;
        if(ends[5]>=biggest93486){
          biggest93486=ends[5];
        }
        if(ends[6]>=biggest93486){
          biggest93486=ends[6];
        }
        if(ends[7]>=biggest93486){
          biggest93486=ends[7];
        }
        if(ends[8]>=biggest93486){
          biggest93486=ends[8];
        }
        if(ends[9]>=biggest93486){
          biggest93486=ends[9];
        }
        if(biggest93486 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        if(biggest93486 == 2){
          ends[4]=2;
          ;//sysj\filler_plant.sysj line: 14, column: 2
          S80319=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest93486 == 0){
          S80319=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread93479(int [] tdone, int [] ends){
        active[3]=0;
    ends[3]=0;
    tdone[3]=1;
  }

  public void thread93476(int [] tdone, int [] ends){
        S81432=1;
    S81431=0;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread93475(int [] tdone, int [] ends){
        S81427=1;
    nozzle3Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle3Engaged);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread93474(int [] tdone, int [] ends){
        S81422=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
      inlet3Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
      currsigs.addElement(inlet3Engaged);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread93473(int [] tdone, int [] ends){
        S81414=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
      injector3Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
      currsigs.addElement(injector3Engaged);
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

  public void thread93472(int [] tdone, int [] ends){
        S81406=1;
    S81178=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S81178=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S81178=2;
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
      }
      else {
        S81120=0;
        __start_thread_26 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[26]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S81120=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
          currsigs.addElement(dosUnitEvac);
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
    }
    else {
      S81092=0;
      __start_thread_26 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[26]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S81092=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
        currsigs.addElement(dosUnitFilled);
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
  }

  public void thread93471(int [] tdone, int [] ends){
        S81435=1;
    thread93472(tdone,ends);
    thread93473(tdone,ends);
    thread93474(tdone,ends);
    thread93475(tdone,ends);
    thread93476(tdone,ends);
    int biggest93477 = 0;
    if(ends[26]>=biggest93477){
      biggest93477=ends[26];
    }
    if(ends[27]>=biggest93477){
      biggest93477=ends[27];
    }
    if(ends[28]>=biggest93477){
      biggest93477=ends[28];
    }
    if(ends[29]>=biggest93477){
      biggest93477=ends[29];
    }
    if(ends[30]>=biggest93477){
      biggest93477=ends[30];
    }
    if(biggest93477 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread93470(int [] tdone, int [] ends){
        active[24]=0;
    ends[24]=0;
    tdone[24]=1;
  }

  public void thread93467(int [] tdone, int [] ends){
        S81060=1;
    S81059=0;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread93466(int [] tdone, int [] ends){
        S81055=1;
    nozzle2Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle2Engaged);
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread93465(int [] tdone, int [] ends){
        S81050=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
      inlet2Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
      currsigs.addElement(inlet2Engaged);
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread93464(int [] tdone, int [] ends){
        S81042=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
      injector2Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
      currsigs.addElement(injector2Engaged);
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

  public void thread93463(int [] tdone, int [] ends){
        S81034=1;
    S80806=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S80806=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S80806=2;
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
      else {
        S80748=0;
        __start_thread_19 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[19]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S80748=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
          currsigs.addElement(dosUnitEvac);
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
    }
    else {
      S80720=0;
      __start_thread_19 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[19]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S80720=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
        currsigs.addElement(dosUnitFilled);
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
  }

  public void thread93462(int [] tdone, int [] ends){
        S81063=1;
    thread93463(tdone,ends);
    thread93464(tdone,ends);
    thread93465(tdone,ends);
    thread93466(tdone,ends);
    thread93467(tdone,ends);
    int biggest93468 = 0;
    if(ends[19]>=biggest93468){
      biggest93468=ends[19];
    }
    if(ends[20]>=biggest93468){
      biggest93468=ends[20];
    }
    if(ends[21]>=biggest93468){
      biggest93468=ends[21];
    }
    if(ends[22]>=biggest93468){
      biggest93468=ends[22];
    }
    if(ends[23]>=biggest93468){
      biggest93468=ends[23];
    }
    if(biggest93468 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread93461(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread93458(int [] tdone, int [] ends){
        S80688=1;
    S80687=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread93457(int [] tdone, int [] ends){
        S80683=1;
    nozzle1Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle1Engaged);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread93456(int [] tdone, int [] ends){
        S80678=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
      inlet1Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
      currsigs.addElement(inlet1Engaged);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread93455(int [] tdone, int [] ends){
        S80670=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
      injector1Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
      currsigs.addElement(injector1Engaged);
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

  public void thread93454(int [] tdone, int [] ends){
        S80662=1;
    S80434=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S80434=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S80434=2;
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
      else {
        S80376=0;
        __start_thread_12 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_12 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[12]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S80376=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
          currsigs.addElement(dosUnitEvac);
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
    }
    else {
      S80348=0;
      __start_thread_12 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_12 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[12]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S80348=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
        currsigs.addElement(dosUnitFilled);
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
  }

  public void thread93453(int [] tdone, int [] ends){
        S80691=1;
    thread93454(tdone,ends);
    thread93455(tdone,ends);
    thread93456(tdone,ends);
    thread93457(tdone,ends);
    thread93458(tdone,ends);
    int biggest93459 = 0;
    if(ends[12]>=biggest93459){
      biggest93459=ends[12];
    }
    if(ends[13]>=biggest93459){
      biggest93459=ends[13];
    }
    if(ends[14]>=biggest93459){
      biggest93459=ends[14];
    }
    if(ends[15]>=biggest93459){
      biggest93459=ends[15];
    }
    if(ends[16]>=biggest93459){
      biggest93459=ends[16];
    }
    if(biggest93459 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread93452(int [] tdone, int [] ends){
        active[10]=0;
    ends[10]=0;
    tdone[10]=1;
  }

  public void thread93449(int [] tdone, int [] ends){
        S80316=1;
    S80315=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread93448(int [] tdone, int [] ends){
        S80311=1;
    nozzle0Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle0Engaged);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread93447(int [] tdone, int [] ends){
        S80306=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
      inlet0Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
      currsigs.addElement(inlet0Engaged);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread93446(int [] tdone, int [] ends){
        S80298=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
      injector0Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
      currsigs.addElement(injector0Engaged);
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

  public void thread93445(int [] tdone, int [] ends){
        S80290=1;
    S80062=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S80062=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S80062=2;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S80004=0;
        __start_thread_5 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[5]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S80004=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
          currsigs.addElement(dosUnitEvac);
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
    }
    else {
      S79976=0;
      __start_thread_5 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      S79951=0;
      if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[5]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S79976=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
        currsigs.addElement(dosUnitFilled);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S79951=1;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
  }

  public void thread93444(int [] tdone, int [] ends){
        S80319=1;
    thread93445(tdone,ends);
    thread93446(tdone,ends);
    thread93447(tdone,ends);
    thread93448(tdone,ends);
    thread93449(tdone,ends);
    int biggest93450 = 0;
    if(ends[5]>=biggest93450){
      biggest93450=ends[5];
    }
    if(ends[6]>=biggest93450){
      biggest93450=ends[6];
    }
    if(ends[7]>=biggest93450){
      biggest93450=ends[7];
    }
    if(ends[8]>=biggest93450){
      biggest93450=ends[8];
    }
    if(ends[9]>=biggest93450){
      biggest93450=ends[9];
    }
    if(biggest93450 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread93443(int [] tdone, int [] ends){
        active[3]=0;
    ends[3]=0;
    tdone[3]=1;
  }

  public void thread93442(int [] tdone, int [] ends){
        switch(S93382){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S84424){
          case 0 : 
            if(nozzleSelect.getprestatus()){//sysj\filler_plant.sysj line: 65, column: 20
              S84424=1;
              if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 0){//sysj\filler_plant.sysj line: 68, column: 5
                S81439=0;
                thread93443(tdone,ends);
                thread93444(tdone,ends);
                int biggest93451 = 0;
                if(ends[3]>=biggest93451){
                  biggest93451=ends[3];
                }
                if(ends[4]>=biggest93451){
                  biggest93451=ends[4];
                }
                if(biggest93451 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S81439=1;
                if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 1){//sysj\filler_plant.sysj line: 72, column: 5
                  S81438=0;
                  thread93452(tdone,ends);
                  thread93453(tdone,ends);
                  int biggest93460 = 0;
                  if(ends[10]>=biggest93460){
                    biggest93460=ends[10];
                  }
                  if(ends[11]>=biggest93460){
                    biggest93460=ends[11];
                  }
                  if(biggest93460 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S81438=1;
                  if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 2){//sysj\filler_plant.sysj line: 76, column: 5
                    S81437=0;
                    thread93461(tdone,ends);
                    thread93462(tdone,ends);
                    int biggest93469 = 0;
                    if(ends[17]>=biggest93469){
                      biggest93469=ends[17];
                    }
                    if(ends[18]>=biggest93469){
                      biggest93469=ends[18];
                    }
                    if(biggest93469 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    S81437=1;
                    if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 3){//sysj\filler_plant.sysj line: 80, column: 5
                      thread93470(tdone,ends);
                      thread93471(tdone,ends);
                      int biggest93478 = 0;
                      if(ends[24]>=biggest93478){
                        biggest93478=ends[24];
                      }
                      if(ends[25]>=biggest93478){
                        biggest93478=ends[25];
                      }
                      if(biggest93478 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      S84424=2;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            switch(S81439){
              case 0 : 
                thread93479(tdone,ends);
                thread93480(tdone,ends);
                int biggest93487 = 0;
                if(ends[3]>=biggest93487){
                  biggest93487=ends[3];
                }
                if(ends[4]>=biggest93487){
                  biggest93487=ends[4];
                }
                if(biggest93487 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                //FINXME code
                if(biggest93487 == 0){
                  S84424=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                switch(S81438){
                  case 0 : 
                    thread93488(tdone,ends);
                    thread93489(tdone,ends);
                    int biggest93496 = 0;
                    if(ends[10]>=biggest93496){
                      biggest93496=ends[10];
                    }
                    if(ends[11]>=biggest93496){
                      biggest93496=ends[11];
                    }
                    if(biggest93496 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    //FINXME code
                    if(biggest93496 == 0){
                      S84424=2;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    break;
                  
                  case 1 : 
                    switch(S81437){
                      case 0 : 
                        thread93497(tdone,ends);
                        thread93498(tdone,ends);
                        int biggest93505 = 0;
                        if(ends[17]>=biggest93505){
                          biggest93505=ends[17];
                        }
                        if(ends[18]>=biggest93505){
                          biggest93505=ends[18];
                        }
                        if(biggest93505 == 1){
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        //FINXME code
                        if(biggest93505 == 0){
                          S84424=2;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        break;
                      
                      case 1 : 
                        thread93506(tdone,ends);
                        thread93507(tdone,ends);
                        int biggest93514 = 0;
                        if(ends[24]>=biggest93514){
                          biggest93514=ends[24];
                        }
                        if(ends[25]>=biggest93514){
                          biggest93514=ends[25];
                        }
                        if(biggest93514 == 1){
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        //FINXME code
                        if(biggest93514 == 0){
                          S84424=2;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        break;
                      
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
          case 2 : 
            S84424=2;
            S84424=0;
            if(nozzleSelect.getprestatus()){//sysj\filler_plant.sysj line: 65, column: 20
              S84424=1;
              if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 0){//sysj\filler_plant.sysj line: 68, column: 5
                S81439=0;
                thread93515(tdone,ends);
                thread93516(tdone,ends);
                int biggest93523 = 0;
                if(ends[3]>=biggest93523){
                  biggest93523=ends[3];
                }
                if(ends[4]>=biggest93523){
                  biggest93523=ends[4];
                }
                if(biggest93523 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S81439=1;
                if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 1){//sysj\filler_plant.sysj line: 72, column: 5
                  S81438=0;
                  thread93524(tdone,ends);
                  thread93525(tdone,ends);
                  int biggest93532 = 0;
                  if(ends[10]>=biggest93532){
                    biggest93532=ends[10];
                  }
                  if(ends[11]>=biggest93532){
                    biggest93532=ends[11];
                  }
                  if(biggest93532 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S81438=1;
                  if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 2){//sysj\filler_plant.sysj line: 76, column: 5
                    S81437=0;
                    thread93533(tdone,ends);
                    thread93534(tdone,ends);
                    int biggest93541 = 0;
                    if(ends[17]>=biggest93541){
                      biggest93541=ends[17];
                    }
                    if(ends[18]>=biggest93541){
                      biggest93541=ends[18];
                    }
                    if(biggest93541 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    S81437=1;
                    if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 3){//sysj\filler_plant.sysj line: 80, column: 5
                      thread93542(tdone,ends);
                      thread93543(tdone,ends);
                      int biggest93550 = 0;
                      if(ends[24]>=biggest93550){
                        biggest93550=ends[24];
                      }
                      if(ends[25]>=biggest93550){
                        biggest93550=ends[25];
                      }
                      if(biggest93550 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      S84424=2;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread93440(int [] tdone, int [] ends){
        S93398=1;
    if(dosUnitFilled.getprestatus()){//sysj\filler_plant.sysj line: 93, column: 23
      dosUnitFilled_GUI.setPresent();//sysj\filler_plant.sysj line: 93, column: 38
      currsigs.addElement(dosUnitFilled_GUI);
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
    else {
      active[32]=1;
      ends[32]=1;
      tdone[32]=1;
    }
  }

  public void thread93439(int [] tdone, int [] ends){
        S93390=1;
    if(dosUnitEvac.getprestatus()){//sysj\filler_plant.sysj line: 89, column: 23
      dosUnitEvac_GUI.setPresent();//sysj\filler_plant.sysj line: 89, column: 36
      currsigs.addElement(dosUnitEvac_GUI);
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
    else {
      active[31]=1;
      ends[31]=1;
      tdone[31]=1;
    }
  }

  public void thread93436(int [] tdone, int [] ends){
        S81432=1;
    S81431=0;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread93435(int [] tdone, int [] ends){
        S81427=1;
    nozzle3Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle3Engaged);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread93434(int [] tdone, int [] ends){
        S81422=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
      inlet3Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
      currsigs.addElement(inlet3Engaged);
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
    else {
      active[28]=1;
      ends[28]=1;
      tdone[28]=1;
    }
  }

  public void thread93433(int [] tdone, int [] ends){
        S81414=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
      injector3Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
      currsigs.addElement(injector3Engaged);
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

  public void thread93432(int [] tdone, int [] ends){
        S81406=1;
    S81178=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S81178=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S81178=2;
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
      }
      else {
        S81120=0;
        __start_thread_26 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[26]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S81120=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
          currsigs.addElement(dosUnitEvac);
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
    }
    else {
      S81092=0;
      __start_thread_26 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[26]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S81092=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
        currsigs.addElement(dosUnitFilled);
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
  }

  public void thread93431(int [] tdone, int [] ends){
        S81435=1;
    thread93432(tdone,ends);
    thread93433(tdone,ends);
    thread93434(tdone,ends);
    thread93435(tdone,ends);
    thread93436(tdone,ends);
    int biggest93437 = 0;
    if(ends[26]>=biggest93437){
      biggest93437=ends[26];
    }
    if(ends[27]>=biggest93437){
      biggest93437=ends[27];
    }
    if(ends[28]>=biggest93437){
      biggest93437=ends[28];
    }
    if(ends[29]>=biggest93437){
      biggest93437=ends[29];
    }
    if(ends[30]>=biggest93437){
      biggest93437=ends[30];
    }
    if(biggest93437 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread93430(int [] tdone, int [] ends){
        active[24]=0;
    ends[24]=0;
    tdone[24]=1;
  }

  public void thread93427(int [] tdone, int [] ends){
        S81060=1;
    S81059=0;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread93426(int [] tdone, int [] ends){
        S81055=1;
    nozzle2Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle2Engaged);
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread93425(int [] tdone, int [] ends){
        S81050=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
      inlet2Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
      currsigs.addElement(inlet2Engaged);
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    else {
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread93424(int [] tdone, int [] ends){
        S81042=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
      injector2Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
      currsigs.addElement(injector2Engaged);
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

  public void thread93423(int [] tdone, int [] ends){
        S81034=1;
    S80806=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S80806=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S80806=2;
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
      else {
        S80748=0;
        __start_thread_19 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[19]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S80748=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
          currsigs.addElement(dosUnitEvac);
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
    }
    else {
      S80720=0;
      __start_thread_19 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[19]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S80720=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
        currsigs.addElement(dosUnitFilled);
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
  }

  public void thread93422(int [] tdone, int [] ends){
        S81063=1;
    thread93423(tdone,ends);
    thread93424(tdone,ends);
    thread93425(tdone,ends);
    thread93426(tdone,ends);
    thread93427(tdone,ends);
    int biggest93428 = 0;
    if(ends[19]>=biggest93428){
      biggest93428=ends[19];
    }
    if(ends[20]>=biggest93428){
      biggest93428=ends[20];
    }
    if(ends[21]>=biggest93428){
      biggest93428=ends[21];
    }
    if(ends[22]>=biggest93428){
      biggest93428=ends[22];
    }
    if(ends[23]>=biggest93428){
      biggest93428=ends[23];
    }
    if(biggest93428 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread93421(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread93418(int [] tdone, int [] ends){
        S80688=1;
    S80687=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread93417(int [] tdone, int [] ends){
        S80683=1;
    nozzle1Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle1Engaged);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread93416(int [] tdone, int [] ends){
        S80678=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
      inlet1Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
      currsigs.addElement(inlet1Engaged);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread93415(int [] tdone, int [] ends){
        S80670=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
      injector1Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
      currsigs.addElement(injector1Engaged);
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

  public void thread93414(int [] tdone, int [] ends){
        S80662=1;
    S80434=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S80434=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S80434=2;
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
      else {
        S80376=0;
        __start_thread_12 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_12 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[12]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S80376=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
          currsigs.addElement(dosUnitEvac);
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
    }
    else {
      S80348=0;
      __start_thread_12 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_12 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[12]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S80348=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
        currsigs.addElement(dosUnitFilled);
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
  }

  public void thread93413(int [] tdone, int [] ends){
        S80691=1;
    thread93414(tdone,ends);
    thread93415(tdone,ends);
    thread93416(tdone,ends);
    thread93417(tdone,ends);
    thread93418(tdone,ends);
    int biggest93419 = 0;
    if(ends[12]>=biggest93419){
      biggest93419=ends[12];
    }
    if(ends[13]>=biggest93419){
      biggest93419=ends[13];
    }
    if(ends[14]>=biggest93419){
      biggest93419=ends[14];
    }
    if(ends[15]>=biggest93419){
      biggest93419=ends[15];
    }
    if(ends[16]>=biggest93419){
      biggest93419=ends[16];
    }
    if(biggest93419 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread93412(int [] tdone, int [] ends){
        active[10]=0;
    ends[10]=0;
    tdone[10]=1;
  }

  public void thread93409(int [] tdone, int [] ends){
        S80316=1;
    S80315=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread93408(int [] tdone, int [] ends){
        S80311=1;
    nozzle0Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle0Engaged);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread93407(int [] tdone, int [] ends){
        S80306=1;
    if(valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 34, column: 24
      inlet0Engaged.setPresent();//sysj\filler_plant.sysj line: 34, column: 41
      currsigs.addElement(inlet0Engaged);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread93406(int [] tdone, int [] ends){
        S80298=1;
    if(valveInjectorOnOff.getprestatus()){//sysj\filler_plant.sysj line: 30, column: 24
      injector0Engaged.setPresent();//sysj\filler_plant.sysj line: 30, column: 44
      currsigs.addElement(injector0Engaged);
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

  public void thread93405(int [] tdone, int [] ends){
        S80290=1;
    S80062=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S80062=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S80062=2;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S80004=0;
        __start_thread_5 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[5]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S80004=1;
          dosUnitEvac.setPresent();//sysj\filler_plant.sysj line: 23, column: 6
          currsigs.addElement(dosUnitEvac);
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
    }
    else {
      S79976=0;
      __start_thread_5 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      S79951=0;
      if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[5]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S79976=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
        currsigs.addElement(dosUnitFilled);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S79951=1;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
  }

  public void thread93404(int [] tdone, int [] ends){
        S80319=1;
    thread93405(tdone,ends);
    thread93406(tdone,ends);
    thread93407(tdone,ends);
    thread93408(tdone,ends);
    thread93409(tdone,ends);
    int biggest93410 = 0;
    if(ends[5]>=biggest93410){
      biggest93410=ends[5];
    }
    if(ends[6]>=biggest93410){
      biggest93410=ends[6];
    }
    if(ends[7]>=biggest93410){
      biggest93410=ends[7];
    }
    if(ends[8]>=biggest93410){
      biggest93410=ends[8];
    }
    if(ends[9]>=biggest93410){
      biggest93410=ends[9];
    }
    if(biggest93410 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread93403(int [] tdone, int [] ends){
        active[3]=0;
    ends[3]=0;
    tdone[3]=1;
  }

  public void thread93402(int [] tdone, int [] ends){
        S93382=1;
    S84424=0;
    if(nozzleSelect.getprestatus()){//sysj\filler_plant.sysj line: 65, column: 20
      S84424=1;
      if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 0){//sysj\filler_plant.sysj line: 68, column: 5
        S81439=0;
        thread93403(tdone,ends);
        thread93404(tdone,ends);
        int biggest93411 = 0;
        if(ends[3]>=biggest93411){
          biggest93411=ends[3];
        }
        if(ends[4]>=biggest93411){
          biggest93411=ends[4];
        }
        if(biggest93411 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
      else {
        S81439=1;
        if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 1){//sysj\filler_plant.sysj line: 72, column: 5
          S81438=0;
          thread93412(tdone,ends);
          thread93413(tdone,ends);
          int biggest93420 = 0;
          if(ends[10]>=biggest93420){
            biggest93420=ends[10];
          }
          if(ends[11]>=biggest93420){
            biggest93420=ends[11];
          }
          if(biggest93420 == 1){
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        else {
          S81438=1;
          if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 2){//sysj\filler_plant.sysj line: 76, column: 5
            S81437=0;
            thread93421(tdone,ends);
            thread93422(tdone,ends);
            int biggest93429 = 0;
            if(ends[17]>=biggest93429){
              biggest93429=ends[17];
            }
            if(ends[18]>=biggest93429){
              biggest93429=ends[18];
            }
            if(biggest93429 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
          }
          else {
            S81437=1;
            if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 3){//sysj\filler_plant.sysj line: 80, column: 5
              thread93430(tdone,ends);
              thread93431(tdone,ends);
              int biggest93438 = 0;
              if(ends[24]>=biggest93438){
                biggest93438=ends[24];
              }
              if(ends[25]>=biggest93438){
                biggest93438=ends[25];
              }
              if(biggest93438 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              S84424=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
          }
        }
      }
    }
    else {
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S93400){
        case 0 : 
          S93400=0;
          break RUN;
        
        case 1 : 
          S93400=2;
          S93400=2;
          thread93402(tdone,ends);
          thread93439(tdone,ends);
          thread93440(tdone,ends);
          int biggest93441 = 0;
          if(ends[2]>=biggest93441){
            biggest93441=ends[2];
          }
          if(ends[31]>=biggest93441){
            biggest93441=ends[31];
          }
          if(ends[32]>=biggest93441){
            biggest93441=ends[32];
          }
          if(biggest93441 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread93442(tdone,ends);
          thread93551(tdone,ends);
          thread93552(tdone,ends);
          int biggest93553 = 0;
          if(ends[2]>=biggest93553){
            biggest93553=ends[2];
          }
          if(ends[31]>=biggest93553){
            biggest93553=ends[31];
          }
          if(ends[32]>=biggest93553){
            biggest93553=ends[32];
          }
          if(biggest93553 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest93553 == 0){
            S93400=0;
            active[1]=0;
            ends[1]=0;
            S93400=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
      dosUnitEvac_GUI.setpreclear();
      dosUnitFilled_GUI.setpreclear();
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
      dosUnitEvac_GUI.sethook();
      dosUnitEvac_GUI.setClear();
      dosUnitFilled_GUI.sethook();
      dosUnitFilled_GUI.setClear();
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
