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
  private int S88648 = 1;
  private int S88630 = 1;
  private int S79672 = 1;
  private int S76687 = 1;
  private int S75567 = 1;
  private int S75538 = 1;
  private int S75310 = 1;
  private int S75224 = 1;
  private int S75199 = 1;
  private int S75252 = 1;
  private int S75546 = 1;
  private int S75554 = 1;
  private int S75559 = 1;
  private int S75564 = 1;
  private int S75563 = 1;
  private int S76686 = 1;
  private int S75939 = 1;
  private int S75910 = 1;
  private int S75682 = 1;
  private int S75596 = 1;
  private int S75624 = 1;
  private int S75918 = 1;
  private int S75926 = 1;
  private int S75931 = 1;
  private int S75936 = 1;
  private int S75935 = 1;
  private int S76685 = 1;
  private int S76311 = 1;
  private int S76282 = 1;
  private int S76054 = 1;
  private int S75968 = 1;
  private int S75996 = 1;
  private int S76290 = 1;
  private int S76298 = 1;
  private int S76303 = 1;
  private int S76308 = 1;
  private int S76307 = 1;
  private int S76683 = 1;
  private int S76654 = 1;
  private int S76426 = 1;
  private int S76340 = 1;
  private int S76368 = 1;
  private int S76662 = 1;
  private int S76670 = 1;
  private int S76675 = 1;
  private int S76680 = 1;
  private int S76679 = 1;
  private int S88638 = 1;
  private int S88646 = 1;
  
  private int[] ends = new int[33];
  private int[] tdone = new int[33];
  
  public void thread88800(int [] tdone, int [] ends){
        switch(S88646){
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

  public void thread88799(int [] tdone, int [] ends){
        switch(S88638){
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

  public void thread88796(int [] tdone, int [] ends){
        S76680=1;
    S76679=0;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread88795(int [] tdone, int [] ends){
        S76675=1;
    nozzle3Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle3Engaged);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread88794(int [] tdone, int [] ends){
        S76670=1;
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

  public void thread88793(int [] tdone, int [] ends){
        S76662=1;
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

  public void thread88792(int [] tdone, int [] ends){
        S76654=1;
    S76426=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S76426=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S76426=2;
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
      }
      else {
        S76368=0;
        __start_thread_26 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[26]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S76368=1;
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
      S76340=0;
      __start_thread_26 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[26]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S76340=1;
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

  public void thread88791(int [] tdone, int [] ends){
        S76683=1;
    thread88792(tdone,ends);
    thread88793(tdone,ends);
    thread88794(tdone,ends);
    thread88795(tdone,ends);
    thread88796(tdone,ends);
    int biggest88797 = 0;
    if(ends[26]>=biggest88797){
      biggest88797=ends[26];
    }
    if(ends[27]>=biggest88797){
      biggest88797=ends[27];
    }
    if(ends[28]>=biggest88797){
      biggest88797=ends[28];
    }
    if(ends[29]>=biggest88797){
      biggest88797=ends[29];
    }
    if(ends[30]>=biggest88797){
      biggest88797=ends[30];
    }
    if(biggest88797 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread88790(int [] tdone, int [] ends){
        active[24]=0;
    ends[24]=0;
    tdone[24]=1;
  }

  public void thread88787(int [] tdone, int [] ends){
        S76308=1;
    S76307=0;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread88786(int [] tdone, int [] ends){
        S76303=1;
    nozzle2Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle2Engaged);
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread88785(int [] tdone, int [] ends){
        S76298=1;
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

  public void thread88784(int [] tdone, int [] ends){
        S76290=1;
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

  public void thread88783(int [] tdone, int [] ends){
        S76282=1;
    S76054=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S76054=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S76054=2;
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
      else {
        S75996=0;
        __start_thread_19 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[19]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S75996=1;
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
      S75968=0;
      __start_thread_19 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[19]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S75968=1;
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

  public void thread88782(int [] tdone, int [] ends){
        S76311=1;
    thread88783(tdone,ends);
    thread88784(tdone,ends);
    thread88785(tdone,ends);
    thread88786(tdone,ends);
    thread88787(tdone,ends);
    int biggest88788 = 0;
    if(ends[19]>=biggest88788){
      biggest88788=ends[19];
    }
    if(ends[20]>=biggest88788){
      biggest88788=ends[20];
    }
    if(ends[21]>=biggest88788){
      biggest88788=ends[21];
    }
    if(ends[22]>=biggest88788){
      biggest88788=ends[22];
    }
    if(ends[23]>=biggest88788){
      biggest88788=ends[23];
    }
    if(biggest88788 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread88781(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread88778(int [] tdone, int [] ends){
        S75936=1;
    S75935=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread88777(int [] tdone, int [] ends){
        S75931=1;
    nozzle1Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle1Engaged);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread88776(int [] tdone, int [] ends){
        S75926=1;
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

  public void thread88775(int [] tdone, int [] ends){
        S75918=1;
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

  public void thread88774(int [] tdone, int [] ends){
        S75910=1;
    S75682=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S75682=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S75682=2;
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
      else {
        S75624=0;
        __start_thread_12 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_12 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[12]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S75624=1;
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
      S75596=0;
      __start_thread_12 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_12 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[12]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S75596=1;
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

  public void thread88773(int [] tdone, int [] ends){
        S75939=1;
    thread88774(tdone,ends);
    thread88775(tdone,ends);
    thread88776(tdone,ends);
    thread88777(tdone,ends);
    thread88778(tdone,ends);
    int biggest88779 = 0;
    if(ends[12]>=biggest88779){
      biggest88779=ends[12];
    }
    if(ends[13]>=biggest88779){
      biggest88779=ends[13];
    }
    if(ends[14]>=biggest88779){
      biggest88779=ends[14];
    }
    if(ends[15]>=biggest88779){
      biggest88779=ends[15];
    }
    if(ends[16]>=biggest88779){
      biggest88779=ends[16];
    }
    if(biggest88779 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread88772(int [] tdone, int [] ends){
        active[10]=0;
    ends[10]=0;
    tdone[10]=1;
  }

  public void thread88769(int [] tdone, int [] ends){
        S75564=1;
    S75563=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread88768(int [] tdone, int [] ends){
        S75559=1;
    nozzle0Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle0Engaged);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread88767(int [] tdone, int [] ends){
        S75554=1;
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

  public void thread88766(int [] tdone, int [] ends){
        S75546=1;
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

  public void thread88765(int [] tdone, int [] ends){
        S75538=1;
    S75310=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S75310=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S75310=2;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S75252=0;
        __start_thread_5 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[5]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S75252=1;
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
      S75224=0;
      __start_thread_5 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      S75199=0;
      if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[5]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S75224=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
        currsigs.addElement(dosUnitFilled);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S75199=1;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
  }

  public void thread88764(int [] tdone, int [] ends){
        S75567=1;
    thread88765(tdone,ends);
    thread88766(tdone,ends);
    thread88767(tdone,ends);
    thread88768(tdone,ends);
    thread88769(tdone,ends);
    int biggest88770 = 0;
    if(ends[5]>=biggest88770){
      biggest88770=ends[5];
    }
    if(ends[6]>=biggest88770){
      biggest88770=ends[6];
    }
    if(ends[7]>=biggest88770){
      biggest88770=ends[7];
    }
    if(ends[8]>=biggest88770){
      biggest88770=ends[8];
    }
    if(ends[9]>=biggest88770){
      biggest88770=ends[9];
    }
    if(biggest88770 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread88763(int [] tdone, int [] ends){
        active[3]=0;
    ends[3]=0;
    tdone[3]=1;
  }

  public void thread88760(int [] tdone, int [] ends){
        switch(S76680){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        switch(S76679){
          case 0 : 
            if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 42, column: 10
              S76679=1;
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

  public void thread88759(int [] tdone, int [] ends){
        switch(S76675){
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

  public void thread88758(int [] tdone, int [] ends){
        switch(S76670){
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

  public void thread88757(int [] tdone, int [] ends){
        switch(S76662){
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

  public void thread88756(int [] tdone, int [] ends){
        switch(S76654){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        switch(S76426){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S76426=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S76426=2;
                active[26]=1;
                ends[26]=1;
                tdone[26]=1;
              }
              else {
                S76368=0;
                __start_thread_26 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[26]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S76368=1;
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
              switch(S76340){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                    ends[26]=4;
                    ;//sysj\filler_plant.sysj line: 17, column: 44
                    S76340=1;
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
              S76426=2;
              active[26]=1;
              ends[26]=1;
              tdone[26]=1;
            }
            else {
              switch(S76368){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                    ends[26]=3;
                    ;//sysj\filler_plant.sysj line: 21, column: 42
                    S76368=1;
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
            S76426=2;
            S76426=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S76426=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S76426=2;
                active[26]=1;
                ends[26]=1;
                tdone[26]=1;
              }
              else {
                S76368=0;
                __start_thread_26 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[26]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S76368=1;
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
              S76340=0;
              __start_thread_26 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                ends[26]=4;
                ;//sysj\filler_plant.sysj line: 17, column: 44
                S76340=1;
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

  public void thread88755(int [] tdone, int [] ends){
        switch(S76683){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        thread88756(tdone,ends);
        thread88757(tdone,ends);
        thread88758(tdone,ends);
        thread88759(tdone,ends);
        thread88760(tdone,ends);
        int biggest88761 = 0;
        if(ends[26]>=biggest88761){
          biggest88761=ends[26];
        }
        if(ends[27]>=biggest88761){
          biggest88761=ends[27];
        }
        if(ends[28]>=biggest88761){
          biggest88761=ends[28];
        }
        if(ends[29]>=biggest88761){
          biggest88761=ends[29];
        }
        if(ends[30]>=biggest88761){
          biggest88761=ends[30];
        }
        if(biggest88761 == 1){
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        if(biggest88761 == 2){
          ends[25]=2;
          ;//sysj\filler_plant.sysj line: 14, column: 2
          S76683=0;
          active[25]=0;
          ends[25]=0;
          tdone[25]=1;
        }
        //FINXME code
        if(biggest88761 == 0){
          S76683=0;
          active[25]=0;
          ends[25]=0;
          tdone[25]=1;
        }
        break;
      
    }
  }

  public void thread88754(int [] tdone, int [] ends){
        active[24]=0;
    ends[24]=0;
    tdone[24]=1;
  }

  public void thread88751(int [] tdone, int [] ends){
        switch(S76308){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S76307){
          case 0 : 
            if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 42, column: 10
              S76307=1;
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

  public void thread88750(int [] tdone, int [] ends){
        switch(S76303){
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

  public void thread88749(int [] tdone, int [] ends){
        switch(S76298){
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

  public void thread88748(int [] tdone, int [] ends){
        switch(S76290){
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

  public void thread88747(int [] tdone, int [] ends){
        switch(S76282){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S76054){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S76054=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S76054=2;
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S75996=0;
                __start_thread_19 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[19]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S75996=1;
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
              switch(S75968){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                    ends[19]=4;
                    ;//sysj\filler_plant.sysj line: 17, column: 44
                    S75968=1;
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
              S76054=2;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              switch(S75996){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                    ends[19]=3;
                    ;//sysj\filler_plant.sysj line: 21, column: 42
                    S75996=1;
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
            S76054=2;
            S76054=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S76054=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S76054=2;
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
              else {
                S75996=0;
                __start_thread_19 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[19]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S75996=1;
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
              S75968=0;
              __start_thread_19 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                ends[19]=4;
                ;//sysj\filler_plant.sysj line: 17, column: 44
                S75968=1;
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

  public void thread88746(int [] tdone, int [] ends){
        switch(S76311){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        thread88747(tdone,ends);
        thread88748(tdone,ends);
        thread88749(tdone,ends);
        thread88750(tdone,ends);
        thread88751(tdone,ends);
        int biggest88752 = 0;
        if(ends[19]>=biggest88752){
          biggest88752=ends[19];
        }
        if(ends[20]>=biggest88752){
          biggest88752=ends[20];
        }
        if(ends[21]>=biggest88752){
          biggest88752=ends[21];
        }
        if(ends[22]>=biggest88752){
          biggest88752=ends[22];
        }
        if(ends[23]>=biggest88752){
          biggest88752=ends[23];
        }
        if(biggest88752 == 1){
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        if(biggest88752 == 2){
          ends[18]=2;
          ;//sysj\filler_plant.sysj line: 14, column: 2
          S76311=0;
          active[18]=0;
          ends[18]=0;
          tdone[18]=1;
        }
        //FINXME code
        if(biggest88752 == 0){
          S76311=0;
          active[18]=0;
          ends[18]=0;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread88745(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread88742(int [] tdone, int [] ends){
        switch(S75936){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S75935){
          case 0 : 
            if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 42, column: 10
              S75935=1;
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

  public void thread88741(int [] tdone, int [] ends){
        switch(S75931){
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

  public void thread88740(int [] tdone, int [] ends){
        switch(S75926){
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

  public void thread88739(int [] tdone, int [] ends){
        switch(S75918){
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

  public void thread88738(int [] tdone, int [] ends){
        switch(S75910){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S75682){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S75682=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S75682=2;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                S75624=0;
                __start_thread_12 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_12 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[12]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S75624=1;
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
              switch(S75596){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_12 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                    ends[12]=4;
                    ;//sysj\filler_plant.sysj line: 17, column: 44
                    S75596=1;
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
              S75682=2;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            else {
              switch(S75624){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_12 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                    ends[12]=3;
                    ;//sysj\filler_plant.sysj line: 21, column: 42
                    S75624=1;
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
            S75682=2;
            S75682=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S75682=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S75682=2;
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
              else {
                S75624=0;
                __start_thread_12 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_12 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[12]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S75624=1;
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
              S75596=0;
              __start_thread_12 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_12 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                ends[12]=4;
                ;//sysj\filler_plant.sysj line: 17, column: 44
                S75596=1;
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

  public void thread88737(int [] tdone, int [] ends){
        switch(S75939){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread88738(tdone,ends);
        thread88739(tdone,ends);
        thread88740(tdone,ends);
        thread88741(tdone,ends);
        thread88742(tdone,ends);
        int biggest88743 = 0;
        if(ends[12]>=biggest88743){
          biggest88743=ends[12];
        }
        if(ends[13]>=biggest88743){
          biggest88743=ends[13];
        }
        if(ends[14]>=biggest88743){
          biggest88743=ends[14];
        }
        if(ends[15]>=biggest88743){
          biggest88743=ends[15];
        }
        if(ends[16]>=biggest88743){
          biggest88743=ends[16];
        }
        if(biggest88743 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        if(biggest88743 == 2){
          ends[11]=2;
          ;//sysj\filler_plant.sysj line: 14, column: 2
          S75939=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest88743 == 0){
          S75939=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread88736(int [] tdone, int [] ends){
        active[10]=0;
    ends[10]=0;
    tdone[10]=1;
  }

  public void thread88733(int [] tdone, int [] ends){
        switch(S75564){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S75563){
          case 0 : 
            if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj\filler_plant.sysj line: 42, column: 10
              S75563=1;
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

  public void thread88732(int [] tdone, int [] ends){
        switch(S75559){
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

  public void thread88731(int [] tdone, int [] ends){
        switch(S75554){
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

  public void thread88730(int [] tdone, int [] ends){
        switch(S75546){
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

  public void thread88729(int [] tdone, int [] ends){
        switch(S75538){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S75310){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S75310=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S75310=2;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S75252=0;
                __start_thread_5 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[5]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S75252=1;
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
              switch(S75224){
                case 0 : 
                  switch(S75199){
                    case 0 : 
                      S75199=0;
                      if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                        ends[5]=4;
                        ;//sysj\filler_plant.sysj line: 17, column: 44
                        S75224=1;
                        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                        currsigs.addElement(dosUnitFilled);
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S75199=1;
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      break;
                    
                    case 1 : 
                      S75199=1;
                      S75199=0;
                      if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                        ends[5]=4;
                        ;//sysj\filler_plant.sysj line: 17, column: 44
                        S75224=1;
                        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                        currsigs.addElement(dosUnitFilled);
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        S75199=1;
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
              S75310=2;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S75252){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                    ends[5]=3;
                    ;//sysj\filler_plant.sysj line: 21, column: 42
                    S75252=1;
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
            S75310=2;
            S75310=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
              S75310=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
                S75310=2;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S75252=0;
                __start_thread_5 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
                  ends[5]=3;
                  ;//sysj\filler_plant.sysj line: 21, column: 42
                  S75252=1;
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
              S75224=0;
              __start_thread_5 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
              S75199=0;
              if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
                ends[5]=4;
                ;//sysj\filler_plant.sysj line: 17, column: 44
                S75224=1;
                dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
                currsigs.addElement(dosUnitFilled);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S75199=1;
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

  public void thread88728(int [] tdone, int [] ends){
        switch(S75567){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        thread88729(tdone,ends);
        thread88730(tdone,ends);
        thread88731(tdone,ends);
        thread88732(tdone,ends);
        thread88733(tdone,ends);
        int biggest88734 = 0;
        if(ends[5]>=biggest88734){
          biggest88734=ends[5];
        }
        if(ends[6]>=biggest88734){
          biggest88734=ends[6];
        }
        if(ends[7]>=biggest88734){
          biggest88734=ends[7];
        }
        if(ends[8]>=biggest88734){
          biggest88734=ends[8];
        }
        if(ends[9]>=biggest88734){
          biggest88734=ends[9];
        }
        if(biggest88734 == 1){
          active[4]=1;
          ends[4]=1;
          tdone[4]=1;
        }
        if(biggest88734 == 2){
          ends[4]=2;
          ;//sysj\filler_plant.sysj line: 14, column: 2
          S75567=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        //FINXME code
        if(biggest88734 == 0){
          S75567=0;
          active[4]=0;
          ends[4]=0;
          tdone[4]=1;
        }
        break;
      
    }
  }

  public void thread88727(int [] tdone, int [] ends){
        active[3]=0;
    ends[3]=0;
    tdone[3]=1;
  }

  public void thread88724(int [] tdone, int [] ends){
        S76680=1;
    S76679=0;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread88723(int [] tdone, int [] ends){
        S76675=1;
    nozzle3Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle3Engaged);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread88722(int [] tdone, int [] ends){
        S76670=1;
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

  public void thread88721(int [] tdone, int [] ends){
        S76662=1;
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

  public void thread88720(int [] tdone, int [] ends){
        S76654=1;
    S76426=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S76426=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S76426=2;
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
      }
      else {
        S76368=0;
        __start_thread_26 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[26]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S76368=1;
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
      S76340=0;
      __start_thread_26 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[26]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S76340=1;
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

  public void thread88719(int [] tdone, int [] ends){
        S76683=1;
    thread88720(tdone,ends);
    thread88721(tdone,ends);
    thread88722(tdone,ends);
    thread88723(tdone,ends);
    thread88724(tdone,ends);
    int biggest88725 = 0;
    if(ends[26]>=biggest88725){
      biggest88725=ends[26];
    }
    if(ends[27]>=biggest88725){
      biggest88725=ends[27];
    }
    if(ends[28]>=biggest88725){
      biggest88725=ends[28];
    }
    if(ends[29]>=biggest88725){
      biggest88725=ends[29];
    }
    if(ends[30]>=biggest88725){
      biggest88725=ends[30];
    }
    if(biggest88725 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread88718(int [] tdone, int [] ends){
        active[24]=0;
    ends[24]=0;
    tdone[24]=1;
  }

  public void thread88715(int [] tdone, int [] ends){
        S76308=1;
    S76307=0;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread88714(int [] tdone, int [] ends){
        S76303=1;
    nozzle2Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle2Engaged);
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread88713(int [] tdone, int [] ends){
        S76298=1;
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

  public void thread88712(int [] tdone, int [] ends){
        S76290=1;
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

  public void thread88711(int [] tdone, int [] ends){
        S76282=1;
    S76054=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S76054=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S76054=2;
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
      else {
        S75996=0;
        __start_thread_19 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[19]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S75996=1;
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
      S75968=0;
      __start_thread_19 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[19]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S75968=1;
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

  public void thread88710(int [] tdone, int [] ends){
        S76311=1;
    thread88711(tdone,ends);
    thread88712(tdone,ends);
    thread88713(tdone,ends);
    thread88714(tdone,ends);
    thread88715(tdone,ends);
    int biggest88716 = 0;
    if(ends[19]>=biggest88716){
      biggest88716=ends[19];
    }
    if(ends[20]>=biggest88716){
      biggest88716=ends[20];
    }
    if(ends[21]>=biggest88716){
      biggest88716=ends[21];
    }
    if(ends[22]>=biggest88716){
      biggest88716=ends[22];
    }
    if(ends[23]>=biggest88716){
      biggest88716=ends[23];
    }
    if(biggest88716 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread88709(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread88706(int [] tdone, int [] ends){
        S75936=1;
    S75935=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread88705(int [] tdone, int [] ends){
        S75931=1;
    nozzle1Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle1Engaged);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread88704(int [] tdone, int [] ends){
        S75926=1;
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

  public void thread88703(int [] tdone, int [] ends){
        S75918=1;
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

  public void thread88702(int [] tdone, int [] ends){
        S75910=1;
    S75682=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S75682=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S75682=2;
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
      else {
        S75624=0;
        __start_thread_12 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_12 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[12]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S75624=1;
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
      S75596=0;
      __start_thread_12 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_12 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[12]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S75596=1;
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

  public void thread88701(int [] tdone, int [] ends){
        S75939=1;
    thread88702(tdone,ends);
    thread88703(tdone,ends);
    thread88704(tdone,ends);
    thread88705(tdone,ends);
    thread88706(tdone,ends);
    int biggest88707 = 0;
    if(ends[12]>=biggest88707){
      biggest88707=ends[12];
    }
    if(ends[13]>=biggest88707){
      biggest88707=ends[13];
    }
    if(ends[14]>=biggest88707){
      biggest88707=ends[14];
    }
    if(ends[15]>=biggest88707){
      biggest88707=ends[15];
    }
    if(ends[16]>=biggest88707){
      biggest88707=ends[16];
    }
    if(biggest88707 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread88700(int [] tdone, int [] ends){
        active[10]=0;
    ends[10]=0;
    tdone[10]=1;
  }

  public void thread88697(int [] tdone, int [] ends){
        S75564=1;
    S75563=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread88696(int [] tdone, int [] ends){
        S75559=1;
    nozzle0Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle0Engaged);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread88695(int [] tdone, int [] ends){
        S75554=1;
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

  public void thread88694(int [] tdone, int [] ends){
        S75546=1;
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

  public void thread88693(int [] tdone, int [] ends){
        S75538=1;
    S75310=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S75310=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S75310=2;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S75252=0;
        __start_thread_5 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[5]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S75252=1;
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
      S75224=0;
      __start_thread_5 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      S75199=0;
      if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[5]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S75224=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
        currsigs.addElement(dosUnitFilled);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S75199=1;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
  }

  public void thread88692(int [] tdone, int [] ends){
        S75567=1;
    thread88693(tdone,ends);
    thread88694(tdone,ends);
    thread88695(tdone,ends);
    thread88696(tdone,ends);
    thread88697(tdone,ends);
    int biggest88698 = 0;
    if(ends[5]>=biggest88698){
      biggest88698=ends[5];
    }
    if(ends[6]>=biggest88698){
      biggest88698=ends[6];
    }
    if(ends[7]>=biggest88698){
      biggest88698=ends[7];
    }
    if(ends[8]>=biggest88698){
      biggest88698=ends[8];
    }
    if(ends[9]>=biggest88698){
      biggest88698=ends[9];
    }
    if(biggest88698 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread88691(int [] tdone, int [] ends){
        active[3]=0;
    ends[3]=0;
    tdone[3]=1;
  }

  public void thread88690(int [] tdone, int [] ends){
        switch(S88630){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S79672){
          case 0 : 
            if(nozzleSelect.getprestatus()){//sysj\filler_plant.sysj line: 65, column: 20
              S79672=1;
              if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 0){//sysj\filler_plant.sysj line: 68, column: 5
                S76687=0;
                thread88691(tdone,ends);
                thread88692(tdone,ends);
                int biggest88699 = 0;
                if(ends[3]>=biggest88699){
                  biggest88699=ends[3];
                }
                if(ends[4]>=biggest88699){
                  biggest88699=ends[4];
                }
                if(biggest88699 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S76687=1;
                if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 1){//sysj\filler_plant.sysj line: 72, column: 5
                  S76686=0;
                  thread88700(tdone,ends);
                  thread88701(tdone,ends);
                  int biggest88708 = 0;
                  if(ends[10]>=biggest88708){
                    biggest88708=ends[10];
                  }
                  if(ends[11]>=biggest88708){
                    biggest88708=ends[11];
                  }
                  if(biggest88708 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S76686=1;
                  if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 2){//sysj\filler_plant.sysj line: 76, column: 5
                    S76685=0;
                    thread88709(tdone,ends);
                    thread88710(tdone,ends);
                    int biggest88717 = 0;
                    if(ends[17]>=biggest88717){
                      biggest88717=ends[17];
                    }
                    if(ends[18]>=biggest88717){
                      biggest88717=ends[18];
                    }
                    if(biggest88717 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    S76685=1;
                    if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 3){//sysj\filler_plant.sysj line: 80, column: 5
                      thread88718(tdone,ends);
                      thread88719(tdone,ends);
                      int biggest88726 = 0;
                      if(ends[24]>=biggest88726){
                        biggest88726=ends[24];
                      }
                      if(ends[25]>=biggest88726){
                        biggest88726=ends[25];
                      }
                      if(biggest88726 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      S79672=2;
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
            switch(S76687){
              case 0 : 
                thread88727(tdone,ends);
                thread88728(tdone,ends);
                int biggest88735 = 0;
                if(ends[3]>=biggest88735){
                  biggest88735=ends[3];
                }
                if(ends[4]>=biggest88735){
                  biggest88735=ends[4];
                }
                if(biggest88735 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                //FINXME code
                if(biggest88735 == 0){
                  S79672=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                switch(S76686){
                  case 0 : 
                    thread88736(tdone,ends);
                    thread88737(tdone,ends);
                    int biggest88744 = 0;
                    if(ends[10]>=biggest88744){
                      biggest88744=ends[10];
                    }
                    if(ends[11]>=biggest88744){
                      biggest88744=ends[11];
                    }
                    if(biggest88744 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    //FINXME code
                    if(biggest88744 == 0){
                      S79672=2;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    break;
                  
                  case 1 : 
                    switch(S76685){
                      case 0 : 
                        thread88745(tdone,ends);
                        thread88746(tdone,ends);
                        int biggest88753 = 0;
                        if(ends[17]>=biggest88753){
                          biggest88753=ends[17];
                        }
                        if(ends[18]>=biggest88753){
                          biggest88753=ends[18];
                        }
                        if(biggest88753 == 1){
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        //FINXME code
                        if(biggest88753 == 0){
                          S79672=2;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        break;
                      
                      case 1 : 
                        thread88754(tdone,ends);
                        thread88755(tdone,ends);
                        int biggest88762 = 0;
                        if(ends[24]>=biggest88762){
                          biggest88762=ends[24];
                        }
                        if(ends[25]>=biggest88762){
                          biggest88762=ends[25];
                        }
                        if(biggest88762 == 1){
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        //FINXME code
                        if(biggest88762 == 0){
                          S79672=2;
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
            S79672=2;
            S79672=0;
            if(nozzleSelect.getprestatus()){//sysj\filler_plant.sysj line: 65, column: 20
              S79672=1;
              if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 0){//sysj\filler_plant.sysj line: 68, column: 5
                S76687=0;
                thread88763(tdone,ends);
                thread88764(tdone,ends);
                int biggest88771 = 0;
                if(ends[3]>=biggest88771){
                  biggest88771=ends[3];
                }
                if(ends[4]>=biggest88771){
                  biggest88771=ends[4];
                }
                if(biggest88771 == 1){
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                S76687=1;
                if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 1){//sysj\filler_plant.sysj line: 72, column: 5
                  S76686=0;
                  thread88772(tdone,ends);
                  thread88773(tdone,ends);
                  int biggest88780 = 0;
                  if(ends[10]>=biggest88780){
                    biggest88780=ends[10];
                  }
                  if(ends[11]>=biggest88780){
                    biggest88780=ends[11];
                  }
                  if(biggest88780 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S76686=1;
                  if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 2){//sysj\filler_plant.sysj line: 76, column: 5
                    S76685=0;
                    thread88781(tdone,ends);
                    thread88782(tdone,ends);
                    int biggest88789 = 0;
                    if(ends[17]>=biggest88789){
                      biggest88789=ends[17];
                    }
                    if(ends[18]>=biggest88789){
                      biggest88789=ends[18];
                    }
                    if(biggest88789 == 1){
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    S76685=1;
                    if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 3){//sysj\filler_plant.sysj line: 80, column: 5
                      thread88790(tdone,ends);
                      thread88791(tdone,ends);
                      int biggest88798 = 0;
                      if(ends[24]>=biggest88798){
                        biggest88798=ends[24];
                      }
                      if(ends[25]>=biggest88798){
                        biggest88798=ends[25];
                      }
                      if(biggest88798 == 1){
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      S79672=2;
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

  public void thread88688(int [] tdone, int [] ends){
        S88646=1;
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

  public void thread88687(int [] tdone, int [] ends){
        S88638=1;
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

  public void thread88684(int [] tdone, int [] ends){
        S76680=1;
    S76679=0;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread88683(int [] tdone, int [] ends){
        S76675=1;
    nozzle3Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle3Engaged);
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread88682(int [] tdone, int [] ends){
        S76670=1;
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

  public void thread88681(int [] tdone, int [] ends){
        S76662=1;
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

  public void thread88680(int [] tdone, int [] ends){
        S76654=1;
    S76426=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S76426=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S76426=2;
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
      }
      else {
        S76368=0;
        __start_thread_26 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[26]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S76368=1;
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
      S76340=0;
      __start_thread_26 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_26 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[26]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S76340=1;
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

  public void thread88679(int [] tdone, int [] ends){
        S76683=1;
    thread88680(tdone,ends);
    thread88681(tdone,ends);
    thread88682(tdone,ends);
    thread88683(tdone,ends);
    thread88684(tdone,ends);
    int biggest88685 = 0;
    if(ends[26]>=biggest88685){
      biggest88685=ends[26];
    }
    if(ends[27]>=biggest88685){
      biggest88685=ends[27];
    }
    if(ends[28]>=biggest88685){
      biggest88685=ends[28];
    }
    if(ends[29]>=biggest88685){
      biggest88685=ends[29];
    }
    if(ends[30]>=biggest88685){
      biggest88685=ends[30];
    }
    if(biggest88685 == 1){
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread88678(int [] tdone, int [] ends){
        active[24]=0;
    ends[24]=0;
    tdone[24]=1;
  }

  public void thread88675(int [] tdone, int [] ends){
        S76308=1;
    S76307=0;
    active[23]=1;
    ends[23]=1;
    tdone[23]=1;
  }

  public void thread88674(int [] tdone, int [] ends){
        S76303=1;
    nozzle2Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle2Engaged);
    active[22]=1;
    ends[22]=1;
    tdone[22]=1;
  }

  public void thread88673(int [] tdone, int [] ends){
        S76298=1;
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

  public void thread88672(int [] tdone, int [] ends){
        S76290=1;
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

  public void thread88671(int [] tdone, int [] ends){
        S76282=1;
    S76054=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S76054=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S76054=2;
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
      else {
        S75996=0;
        __start_thread_19 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[19]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S75996=1;
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
      S75968=0;
      __start_thread_19 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_19 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[19]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S75968=1;
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

  public void thread88670(int [] tdone, int [] ends){
        S76311=1;
    thread88671(tdone,ends);
    thread88672(tdone,ends);
    thread88673(tdone,ends);
    thread88674(tdone,ends);
    thread88675(tdone,ends);
    int biggest88676 = 0;
    if(ends[19]>=biggest88676){
      biggest88676=ends[19];
    }
    if(ends[20]>=biggest88676){
      biggest88676=ends[20];
    }
    if(ends[21]>=biggest88676){
      biggest88676=ends[21];
    }
    if(ends[22]>=biggest88676){
      biggest88676=ends[22];
    }
    if(ends[23]>=biggest88676){
      biggest88676=ends[23];
    }
    if(biggest88676 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread88669(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread88666(int [] tdone, int [] ends){
        S75936=1;
    S75935=0;
    active[16]=1;
    ends[16]=1;
    tdone[16]=1;
  }

  public void thread88665(int [] tdone, int [] ends){
        S75931=1;
    nozzle1Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle1Engaged);
    active[15]=1;
    ends[15]=1;
    tdone[15]=1;
  }

  public void thread88664(int [] tdone, int [] ends){
        S75926=1;
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

  public void thread88663(int [] tdone, int [] ends){
        S75918=1;
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

  public void thread88662(int [] tdone, int [] ends){
        S75910=1;
    S75682=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S75682=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S75682=2;
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
      else {
        S75624=0;
        __start_thread_12 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_12 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[12]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S75624=1;
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
      S75596=0;
      __start_thread_12 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_12 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[12]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S75596=1;
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

  public void thread88661(int [] tdone, int [] ends){
        S75939=1;
    thread88662(tdone,ends);
    thread88663(tdone,ends);
    thread88664(tdone,ends);
    thread88665(tdone,ends);
    thread88666(tdone,ends);
    int biggest88667 = 0;
    if(ends[12]>=biggest88667){
      biggest88667=ends[12];
    }
    if(ends[13]>=biggest88667){
      biggest88667=ends[13];
    }
    if(ends[14]>=biggest88667){
      biggest88667=ends[14];
    }
    if(ends[15]>=biggest88667){
      biggest88667=ends[15];
    }
    if(ends[16]>=biggest88667){
      biggest88667=ends[16];
    }
    if(biggest88667 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread88660(int [] tdone, int [] ends){
        active[10]=0;
    ends[10]=0;
    tdone[10]=1;
  }

  public void thread88657(int [] tdone, int [] ends){
        S75564=1;
    S75563=0;
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread88656(int [] tdone, int [] ends){
        S75559=1;
    nozzle0Engaged.setPresent();//sysj\filler_plant.sysj line: 38, column: 4
    currsigs.addElement(nozzle0Engaged);
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread88655(int [] tdone, int [] ends){
        S75554=1;
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

  public void thread88654(int [] tdone, int [] ends){
        S75546=1;
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

  public void thread88653(int [] tdone, int [] ends){
        S75538=1;
    S75310=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj\filler_plant.sysj line: 17, column: 22
      S75310=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj\filler_plant.sysj line: 21, column: 22
        S75310=2;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S75252=0;
        __start_thread_5 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 21, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 21, column: 42
          ends[5]=3;
          ;//sysj\filler_plant.sysj line: 21, column: 42
          S75252=1;
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
      S75224=0;
      __start_thread_5 = com.systemj.Timer.getMs();//sysj\filler_plant.sysj line: 17, column: 44
      S75199=0;
      if(com.systemj.Timer.getMs() - __start_thread_5 >= 100){//sysj\filler_plant.sysj line: 17, column: 44
        ends[5]=4;
        ;//sysj\filler_plant.sysj line: 17, column: 44
        S75224=1;
        dosUnitFilled.setPresent();//sysj\filler_plant.sysj line: 19, column: 6
        currsigs.addElement(dosUnitFilled);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
      else {
        S75199=1;
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
      }
    }
  }

  public void thread88652(int [] tdone, int [] ends){
        S75567=1;
    thread88653(tdone,ends);
    thread88654(tdone,ends);
    thread88655(tdone,ends);
    thread88656(tdone,ends);
    thread88657(tdone,ends);
    int biggest88658 = 0;
    if(ends[5]>=biggest88658){
      biggest88658=ends[5];
    }
    if(ends[6]>=biggest88658){
      biggest88658=ends[6];
    }
    if(ends[7]>=biggest88658){
      biggest88658=ends[7];
    }
    if(ends[8]>=biggest88658){
      biggest88658=ends[8];
    }
    if(ends[9]>=biggest88658){
      biggest88658=ends[9];
    }
    if(biggest88658 == 1){
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread88651(int [] tdone, int [] ends){
        active[3]=0;
    ends[3]=0;
    tdone[3]=1;
  }

  public void thread88650(int [] tdone, int [] ends){
        S88630=1;
    S79672=0;
    if(nozzleSelect.getprestatus()){//sysj\filler_plant.sysj line: 65, column: 20
      S79672=1;
      if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 0){//sysj\filler_plant.sysj line: 68, column: 5
        S76687=0;
        thread88651(tdone,ends);
        thread88652(tdone,ends);
        int biggest88659 = 0;
        if(ends[3]>=biggest88659){
          biggest88659=ends[3];
        }
        if(ends[4]>=biggest88659){
          biggest88659=ends[4];
        }
        if(biggest88659 == 1){
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
      }
      else {
        S76687=1;
        if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 1){//sysj\filler_plant.sysj line: 72, column: 5
          S76686=0;
          thread88660(tdone,ends);
          thread88661(tdone,ends);
          int biggest88668 = 0;
          if(ends[10]>=biggest88668){
            biggest88668=ends[10];
          }
          if(ends[11]>=biggest88668){
            biggest88668=ends[11];
          }
          if(biggest88668 == 1){
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        else {
          S76686=1;
          if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 2){//sysj\filler_plant.sysj line: 76, column: 5
            S76685=0;
            thread88669(tdone,ends);
            thread88670(tdone,ends);
            int biggest88677 = 0;
            if(ends[17]>=biggest88677){
              biggest88677=ends[17];
            }
            if(ends[18]>=biggest88677){
              biggest88677=ends[18];
            }
            if(biggest88677 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
          }
          else {
            S76685=1;
            if((int)(nozzleSelect.getpreval() == null ? 0 : ((Integer)nozzleSelect.getpreval()).intValue()) == 3){//sysj\filler_plant.sysj line: 80, column: 5
              thread88678(tdone,ends);
              thread88679(tdone,ends);
              int biggest88686 = 0;
              if(ends[24]>=biggest88686){
                biggest88686=ends[24];
              }
              if(ends[25]>=biggest88686){
                biggest88686=ends[25];
              }
              if(biggest88686 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              S79672=2;
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
      switch(S88648){
        case 0 : 
          S88648=0;
          break RUN;
        
        case 1 : 
          S88648=2;
          S88648=2;
          thread88650(tdone,ends);
          thread88687(tdone,ends);
          thread88688(tdone,ends);
          int biggest88689 = 0;
          if(ends[2]>=biggest88689){
            biggest88689=ends[2];
          }
          if(ends[31]>=biggest88689){
            biggest88689=ends[31];
          }
          if(ends[32]>=biggest88689){
            biggest88689=ends[32];
          }
          if(biggest88689 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread88690(tdone,ends);
          thread88799(tdone,ends);
          thread88800(tdone,ends);
          int biggest88801 = 0;
          if(ends[2]>=biggest88801){
            biggest88801=ends[2];
          }
          if(ends[31]>=biggest88801){
            biggest88801=ends[31];
          }
          if(ends[32]>=biggest88801){
            biggest88801=ends[32];
          }
          if(biggest88801 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest88801 == 0){
            S88648=0;
            active[1]=0;
            ends[1]=0;
            S88648=0;
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
