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
  public input_Channel nozzleSelect_in = new input_Channel();
  private long __start_thread_4;//sysj/filler_plant.sysj line: 14, column: 44
  private long __start_thread_10;//sysj/filler_plant.sysj line: 14, column: 44
  private long __start_thread_16;//sysj/filler_plant.sysj line: 14, column: 44
  private long __start_thread_22;//sysj/filler_plant.sysj line: 14, column: 44
  private int S17782 = 1;
  private int S5926 = 1;
  private int S6 = 1;
  private int S1 = 1;
  private int S1497 = 1;
  private int S389 = 1;
  private int S364 = 1;
  private int S136 = 1;
  private int S50 = 1;
  private int S25 = 1;
  private int S78 = 1;
  private int S372 = 1;
  private int S380 = 1;
  private int S1496 = 1;
  private int S757 = 1;
  private int S732 = 1;
  private int S504 = 1;
  private int S418 = 1;
  private int S446 = 1;
  private int S740 = 1;
  private int S748 = 1;
  private int S1495 = 1;
  private int S1125 = 1;
  private int S1100 = 1;
  private int S872 = 1;
  private int S786 = 1;
  private int S814 = 1;
  private int S1108 = 1;
  private int S1116 = 1;
  private int S1493 = 1;
  private int S1468 = 1;
  private int S1240 = 1;
  private int S1154 = 1;
  private int S1182 = 1;
  private int S1476 = 1;
  private int S1484 = 1;
  
  private int[] ends = new int[26];
  private int[] tdone = new int[26];
  
  public void thread17973(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 35, column: 12
      ;//sysj/filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[25]=2;
        tdone[25]=1;
      }
      else {
        ends[25]=2;
        tdone[25]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[25]=2;
        tdone[25]=1;
      }
      else {
        ends[25]=2;
        tdone[25]=1;
      }
    }
  }

  public void thread17972(int [] tdone, int [] ends){
        S1484=1;
    if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
      inlet3Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17971(int [] tdone, int [] ends){
        S1476=1;
    if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
      injector3Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17970(int [] tdone, int [] ends){
        S1468=1;
    S1240=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
      S1240=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
        S1240=2;
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
      }
      else {
        S1182=0;
        __start_thread_22 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
          ends[22]=3;
          ;//sysj/filler_plant.sysj line: 18, column: 42
          S1182=1;
          dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
      S1154=0;
      __start_thread_22 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
        ends[22]=4;
        ;//sysj/filler_plant.sysj line: 14, column: 44
        S1154=1;
        dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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

  public void thread17969(int [] tdone, int [] ends){
        S1493=1;
    thread17970(tdone,ends);
    thread17971(tdone,ends);
    thread17972(tdone,ends);
    thread17973(tdone,ends);
    int biggest17974 = 0;
    if(ends[22]>=biggest17974){
      biggest17974=ends[22];
    }
    if(ends[23]>=biggest17974){
      biggest17974=ends[23];
    }
    if(ends[24]>=biggest17974){
      biggest17974=ends[24];
    }
    if(ends[25]>=biggest17974){
      biggest17974=ends[25];
    }
    if(biggest17974 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest17974 == 2){
      ends[21]=2;
      ;//sysj/filler_plant.sysj line: 11, column: 2
      S1493=0;
      active[21]=0;
      ends[21]=0;
      tdone[21]=1;
    }
  }

  public void thread17968(int [] tdone, int [] ends){
        active[20]=0;
    ends[20]=0;
    tdone[20]=1;
  }

  public void thread17965(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 35, column: 12
      ;//sysj/filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[19]=2;
        tdone[19]=1;
      }
      else {
        ends[19]=2;
        tdone[19]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[19]=2;
        tdone[19]=1;
      }
      else {
        ends[19]=2;
        tdone[19]=1;
      }
    }
  }

  public void thread17964(int [] tdone, int [] ends){
        S1116=1;
    if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
      inlet2Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17963(int [] tdone, int [] ends){
        S1108=1;
    if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
      injector2Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17962(int [] tdone, int [] ends){
        S1100=1;
    S872=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
      S872=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
        S872=2;
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
      else {
        S814=0;
        __start_thread_16 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
          ends[16]=3;
          ;//sysj/filler_plant.sysj line: 18, column: 42
          S814=1;
          dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
      S786=0;
      __start_thread_16 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
        ends[16]=4;
        ;//sysj/filler_plant.sysj line: 14, column: 44
        S786=1;
        dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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

  public void thread17961(int [] tdone, int [] ends){
        S1125=1;
    thread17962(tdone,ends);
    thread17963(tdone,ends);
    thread17964(tdone,ends);
    thread17965(tdone,ends);
    int biggest17966 = 0;
    if(ends[16]>=biggest17966){
      biggest17966=ends[16];
    }
    if(ends[17]>=biggest17966){
      biggest17966=ends[17];
    }
    if(ends[18]>=biggest17966){
      biggest17966=ends[18];
    }
    if(ends[19]>=biggest17966){
      biggest17966=ends[19];
    }
    if(biggest17966 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    if(biggest17966 == 2){
      ends[15]=2;
      ;//sysj/filler_plant.sysj line: 11, column: 2
      S1125=0;
      active[15]=0;
      ends[15]=0;
      tdone[15]=1;
    }
  }

  public void thread17960(int [] tdone, int [] ends){
        active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread17957(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 35, column: 12
      ;//sysj/filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[13]=2;
        tdone[13]=1;
      }
      else {
        ends[13]=2;
        tdone[13]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[13]=2;
        tdone[13]=1;
      }
      else {
        ends[13]=2;
        tdone[13]=1;
      }
    }
  }

  public void thread17956(int [] tdone, int [] ends){
        S748=1;
    if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
      inlet1Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17955(int [] tdone, int [] ends){
        S740=1;
    if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
      injector1Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17954(int [] tdone, int [] ends){
        S732=1;
    S504=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
      S504=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
        S504=2;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S446=0;
        __start_thread_10 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
          ends[10]=3;
          ;//sysj/filler_plant.sysj line: 18, column: 42
          S446=1;
          dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
      S418=0;
      __start_thread_10 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
        ends[10]=4;
        ;//sysj/filler_plant.sysj line: 14, column: 44
        S418=1;
        dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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

  public void thread17953(int [] tdone, int [] ends){
        S757=1;
    thread17954(tdone,ends);
    thread17955(tdone,ends);
    thread17956(tdone,ends);
    thread17957(tdone,ends);
    int biggest17958 = 0;
    if(ends[10]>=biggest17958){
      biggest17958=ends[10];
    }
    if(ends[11]>=biggest17958){
      biggest17958=ends[11];
    }
    if(ends[12]>=biggest17958){
      biggest17958=ends[12];
    }
    if(ends[13]>=biggest17958){
      biggest17958=ends[13];
    }
    if(biggest17958 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    if(biggest17958 == 2){
      ends[9]=2;
      ;//sysj/filler_plant.sysj line: 11, column: 2
      S757=0;
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
  }

  public void thread17952(int [] tdone, int [] ends){
        active[8]=0;
    ends[8]=0;
    tdone[8]=1;
  }

  public void thread17949(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 35, column: 12
      ;//sysj/filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[7]=2;
        tdone[7]=1;
      }
      else {
        ends[7]=2;
        tdone[7]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[7]=2;
        tdone[7]=1;
      }
      else {
        ends[7]=2;
        tdone[7]=1;
      }
    }
  }

  public void thread17948(int [] tdone, int [] ends){
        S380=1;
    if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
      inlet0Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17947(int [] tdone, int [] ends){
        S372=1;
    if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
      injector0Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17946(int [] tdone, int [] ends){
        S364=1;
    S136=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
      S136=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
        S136=2;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S78=0;
        __start_thread_4 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
          ends[4]=3;
          ;//sysj/filler_plant.sysj line: 18, column: 42
          S78=1;
          dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
      S50=0;
      __start_thread_4 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
      S25=0;
      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
        ends[4]=4;
        ;//sysj/filler_plant.sysj line: 14, column: 44
        S50=1;
        dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
        currsigs.addElement(dosUnitFilled);
        System.out.println("Emitted dosUnitFilled");
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S25=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
  }

  public void thread17945(int [] tdone, int [] ends){
        S389=1;
    thread17946(tdone,ends);
    thread17947(tdone,ends);
    thread17948(tdone,ends);
    thread17949(tdone,ends);
    int biggest17950 = 0;
    if(ends[4]>=biggest17950){
      biggest17950=ends[4];
    }
    if(ends[5]>=biggest17950){
      biggest17950=ends[5];
    }
    if(ends[6]>=biggest17950){
      biggest17950=ends[6];
    }
    if(ends[7]>=biggest17950){
      biggest17950=ends[7];
    }
    if(biggest17950 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest17950 == 2){
      ends[3]=2;
      ;//sysj/filler_plant.sysj line: 11, column: 2
      S389=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread17944(int [] tdone, int [] ends){
        active[2]=0;
    ends[2]=0;
    tdone[2]=1;
  }

  public void thread17941(int [] tdone, int [] ends){
        active[25]=0;
    ends[25]=0;
    tdone[25]=1;
  }

  public void thread17940(int [] tdone, int [] ends){
        switch(S1484){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
          inlet3Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17939(int [] tdone, int [] ends){
        switch(S1476){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
          injector3Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17938(int [] tdone, int [] ends){
        switch(S1468){
      case 0 : 
        active[22]=0;
        ends[22]=0;
        tdone[22]=1;
        break;
      
      case 1 : 
        switch(S1240){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
              S1240=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
                S1240=2;
                active[22]=1;
                ends[22]=1;
                tdone[22]=1;
              }
              else {
                S1182=0;
                __start_thread_22 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
                  ends[22]=3;
                  ;//sysj/filler_plant.sysj line: 18, column: 42
                  S1182=1;
                  dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
              switch(S1154){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
                    ends[22]=4;
                    ;//sysj/filler_plant.sysj line: 14, column: 44
                    S1154=1;
                    dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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
                  dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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
            if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
              S1240=2;
              active[22]=1;
              ends[22]=1;
              tdone[22]=1;
            }
            else {
              switch(S1182){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
                    ends[22]=3;
                    ;//sysj/filler_plant.sysj line: 18, column: 42
                    S1182=1;
                    dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
                  dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
            S1240=2;
            S1240=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
              S1240=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
                S1240=2;
                active[22]=1;
                ends[22]=1;
                tdone[22]=1;
              }
              else {
                S1182=0;
                __start_thread_22 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
                  ends[22]=3;
                  ;//sysj/filler_plant.sysj line: 18, column: 42
                  S1182=1;
                  dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
              S1154=0;
              __start_thread_22 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
                ends[22]=4;
                ;//sysj/filler_plant.sysj line: 14, column: 44
                S1154=1;
                dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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

  public void thread17937(int [] tdone, int [] ends){
        switch(S1493){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        thread17938(tdone,ends);
        thread17939(tdone,ends);
        thread17940(tdone,ends);
        thread17941(tdone,ends);
        int biggest17942 = 0;
        if(ends[22]>=biggest17942){
          biggest17942=ends[22];
        }
        if(ends[23]>=biggest17942){
          biggest17942=ends[23];
        }
        if(ends[24]>=biggest17942){
          biggest17942=ends[24];
        }
        if(ends[25]>=biggest17942){
          biggest17942=ends[25];
        }
        if(biggest17942 == 1){
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        //FINXME code
        if(biggest17942 == 0){
          S1493=0;
          active[21]=0;
          ends[21]=0;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread17936(int [] tdone, int [] ends){
        active[20]=0;
    ends[20]=0;
    tdone[20]=1;
  }

  public void thread17933(int [] tdone, int [] ends){
        active[19]=0;
    ends[19]=0;
    tdone[19]=1;
  }

  public void thread17932(int [] tdone, int [] ends){
        switch(S1116){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
          inlet2Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17931(int [] tdone, int [] ends){
        switch(S1108){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
          injector2Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17930(int [] tdone, int [] ends){
        switch(S1100){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        switch(S872){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
              S872=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
                S872=2;
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
              else {
                S814=0;
                __start_thread_16 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
                  ends[16]=3;
                  ;//sysj/filler_plant.sysj line: 18, column: 42
                  S814=1;
                  dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
              switch(S786){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
                    ends[16]=4;
                    ;//sysj/filler_plant.sysj line: 14, column: 44
                    S786=1;
                    dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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
                  dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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
            if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
              S872=2;
              active[16]=1;
              ends[16]=1;
              tdone[16]=1;
            }
            else {
              switch(S814){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
                    ends[16]=3;
                    ;//sysj/filler_plant.sysj line: 18, column: 42
                    S814=1;
                    dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
                  dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
            S872=2;
            S872=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
              S872=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
                S872=2;
                active[16]=1;
                ends[16]=1;
                tdone[16]=1;
              }
              else {
                S814=0;
                __start_thread_16 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
                  ends[16]=3;
                  ;//sysj/filler_plant.sysj line: 18, column: 42
                  S814=1;
                  dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
              S786=0;
              __start_thread_16 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
                ends[16]=4;
                ;//sysj/filler_plant.sysj line: 14, column: 44
                S786=1;
                dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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

  public void thread17929(int [] tdone, int [] ends){
        switch(S1125){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        thread17930(tdone,ends);
        thread17931(tdone,ends);
        thread17932(tdone,ends);
        thread17933(tdone,ends);
        int biggest17934 = 0;
        if(ends[16]>=biggest17934){
          biggest17934=ends[16];
        }
        if(ends[17]>=biggest17934){
          biggest17934=ends[17];
        }
        if(ends[18]>=biggest17934){
          biggest17934=ends[18];
        }
        if(ends[19]>=biggest17934){
          biggest17934=ends[19];
        }
        if(biggest17934 == 1){
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        //FINXME code
        if(biggest17934 == 0){
          S1125=0;
          active[15]=0;
          ends[15]=0;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread17928(int [] tdone, int [] ends){
        active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread17925(int [] tdone, int [] ends){
        active[13]=0;
    ends[13]=0;
    tdone[13]=1;
  }

  public void thread17924(int [] tdone, int [] ends){
        switch(S748){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
          inlet1Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17923(int [] tdone, int [] ends){
        switch(S740){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
          injector1Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17922(int [] tdone, int [] ends){
        switch(S732){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S504){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
              S504=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
                S504=2;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S446=0;
                __start_thread_10 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
                  ends[10]=3;
                  ;//sysj/filler_plant.sysj line: 18, column: 42
                  S446=1;
                  dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
              switch(S418){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
                    ends[10]=4;
                    ;//sysj/filler_plant.sysj line: 14, column: 44
                    S418=1;
                    dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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
                  dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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
            if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
              S504=2;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              switch(S446){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
                    ends[10]=3;
                    ;//sysj/filler_plant.sysj line: 18, column: 42
                    S446=1;
                    dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
                  dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
            S504=2;
            S504=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
              S504=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
                S504=2;
                active[10]=1;
                ends[10]=1;
                tdone[10]=1;
              }
              else {
                S446=0;
                __start_thread_10 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
                  ends[10]=3;
                  ;//sysj/filler_plant.sysj line: 18, column: 42
                  S446=1;
                  dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
              S418=0;
              __start_thread_10 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
              if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
                ends[10]=4;
                ;//sysj/filler_plant.sysj line: 14, column: 44
                S418=1;
                dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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

  public void thread17921(int [] tdone, int [] ends){
        switch(S757){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        thread17922(tdone,ends);
        thread17923(tdone,ends);
        thread17924(tdone,ends);
        thread17925(tdone,ends);
        int biggest17926 = 0;
        if(ends[10]>=biggest17926){
          biggest17926=ends[10];
        }
        if(ends[11]>=biggest17926){
          biggest17926=ends[11];
        }
        if(ends[12]>=biggest17926){
          biggest17926=ends[12];
        }
        if(ends[13]>=biggest17926){
          biggest17926=ends[13];
        }
        if(biggest17926 == 1){
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        //FINXME code
        if(biggest17926 == 0){
          S757=0;
          active[9]=0;
          ends[9]=0;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread17920(int [] tdone, int [] ends){
        active[8]=0;
    ends[8]=0;
    tdone[8]=1;
  }

  public void thread17917(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread17916(int [] tdone, int [] ends){
        switch(S380){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
          inlet0Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17915(int [] tdone, int [] ends){
        switch(S372){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
          injector0Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17914(int [] tdone, int [] ends){
        switch(S364){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S136){
          case 0 : 
            if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
              S136=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
                S136=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S78=0;
                __start_thread_4 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
                  ends[4]=3;
                  ;//sysj/filler_plant.sysj line: 18, column: 42
                  S78=1;
                  dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
              switch(S50){
                case 0 : 
                  switch(S25){
                    case 0 : 
                      S25=0;
                      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
                        ends[4]=4;
                        ;//sysj/filler_plant.sysj line: 14, column: 44
                        S50=1;
                        dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
                        currsigs.addElement(dosUnitFilled);
                        System.out.println("Emitted dosUnitFilled");
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S25=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                    case 1 : 
                      S25=1;
                      S25=0;
                      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
                        ends[4]=4;
                        ;//sysj/filler_plant.sysj line: 14, column: 44
                        S50=1;
                        dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
                        currsigs.addElement(dosUnitFilled);
                        System.out.println("Emitted dosUnitFilled");
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S25=1;
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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
            if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
              S136=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              switch(S78){
                case 0 : 
                  if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
                    ends[4]=3;
                    ;//sysj/filler_plant.sysj line: 18, column: 42
                    S78=1;
                    dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
                  dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
            S136=2;
            S136=0;
            if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
              S136=1;
              if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
                S136=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S78=0;
                __start_thread_4 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
                if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
                  ends[4]=3;
                  ;//sysj/filler_plant.sysj line: 18, column: 42
                  S78=1;
                  dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
              S50=0;
              __start_thread_4 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
              S25=0;
              if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
                ends[4]=4;
                ;//sysj/filler_plant.sysj line: 14, column: 44
                S50=1;
                dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
                currsigs.addElement(dosUnitFilled);
                System.out.println("Emitted dosUnitFilled");
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S25=1;
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

  public void thread17913(int [] tdone, int [] ends){
        switch(S389){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        thread17914(tdone,ends);
        thread17915(tdone,ends);
        thread17916(tdone,ends);
        thread17917(tdone,ends);
        int biggest17918 = 0;
        if(ends[4]>=biggest17918){
          biggest17918=ends[4];
        }
        if(ends[5]>=biggest17918){
          biggest17918=ends[5];
        }
        if(ends[6]>=biggest17918){
          biggest17918=ends[6];
        }
        if(ends[7]>=biggest17918){
          biggest17918=ends[7];
        }
        if(biggest17918 == 1){
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        //FINXME code
        if(biggest17918 == 0){
          S389=0;
          active[3]=0;
          ends[3]=0;
          tdone[3]=1;
        }
        break;
      
    }
  }

  public void thread17912(int [] tdone, int [] ends){
        active[2]=0;
    ends[2]=0;
    tdone[2]=1;
  }

  public void thread17909(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 35, column: 12
      ;//sysj/filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[25]=2;
        tdone[25]=1;
      }
      else {
        ends[25]=2;
        tdone[25]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[25]=2;
        tdone[25]=1;
      }
      else {
        ends[25]=2;
        tdone[25]=1;
      }
    }
  }

  public void thread17908(int [] tdone, int [] ends){
        S1484=1;
    if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
      inlet3Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17907(int [] tdone, int [] ends){
        S1476=1;
    if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
      injector3Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17906(int [] tdone, int [] ends){
        S1468=1;
    S1240=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
      S1240=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
        S1240=2;
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
      }
      else {
        S1182=0;
        __start_thread_22 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
          ends[22]=3;
          ;//sysj/filler_plant.sysj line: 18, column: 42
          S1182=1;
          dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
      S1154=0;
      __start_thread_22 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
        ends[22]=4;
        ;//sysj/filler_plant.sysj line: 14, column: 44
        S1154=1;
        dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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

  public void thread17905(int [] tdone, int [] ends){
        S1493=1;
    thread17906(tdone,ends);
    thread17907(tdone,ends);
    thread17908(tdone,ends);
    thread17909(tdone,ends);
    int biggest17910 = 0;
    if(ends[22]>=biggest17910){
      biggest17910=ends[22];
    }
    if(ends[23]>=biggest17910){
      biggest17910=ends[23];
    }
    if(ends[24]>=biggest17910){
      biggest17910=ends[24];
    }
    if(ends[25]>=biggest17910){
      biggest17910=ends[25];
    }
    if(biggest17910 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest17910 == 2){
      ends[21]=2;
      ;//sysj/filler_plant.sysj line: 11, column: 2
      S1493=0;
      active[21]=0;
      ends[21]=0;
      tdone[21]=1;
    }
  }

  public void thread17904(int [] tdone, int [] ends){
        active[20]=0;
    ends[20]=0;
    tdone[20]=1;
  }

  public void thread17901(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 35, column: 12
      ;//sysj/filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[19]=2;
        tdone[19]=1;
      }
      else {
        ends[19]=2;
        tdone[19]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[19]=2;
        tdone[19]=1;
      }
      else {
        ends[19]=2;
        tdone[19]=1;
      }
    }
  }

  public void thread17900(int [] tdone, int [] ends){
        S1116=1;
    if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
      inlet2Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17899(int [] tdone, int [] ends){
        S1108=1;
    if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
      injector2Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17898(int [] tdone, int [] ends){
        S1100=1;
    S872=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
      S872=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
        S872=2;
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
      else {
        S814=0;
        __start_thread_16 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
          ends[16]=3;
          ;//sysj/filler_plant.sysj line: 18, column: 42
          S814=1;
          dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
      S786=0;
      __start_thread_16 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
        ends[16]=4;
        ;//sysj/filler_plant.sysj line: 14, column: 44
        S786=1;
        dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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

  public void thread17897(int [] tdone, int [] ends){
        S1125=1;
    thread17898(tdone,ends);
    thread17899(tdone,ends);
    thread17900(tdone,ends);
    thread17901(tdone,ends);
    int biggest17902 = 0;
    if(ends[16]>=biggest17902){
      biggest17902=ends[16];
    }
    if(ends[17]>=biggest17902){
      biggest17902=ends[17];
    }
    if(ends[18]>=biggest17902){
      biggest17902=ends[18];
    }
    if(ends[19]>=biggest17902){
      biggest17902=ends[19];
    }
    if(biggest17902 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    if(biggest17902 == 2){
      ends[15]=2;
      ;//sysj/filler_plant.sysj line: 11, column: 2
      S1125=0;
      active[15]=0;
      ends[15]=0;
      tdone[15]=1;
    }
  }

  public void thread17896(int [] tdone, int [] ends){
        active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread17893(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 35, column: 12
      ;//sysj/filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[13]=2;
        tdone[13]=1;
      }
      else {
        ends[13]=2;
        tdone[13]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[13]=2;
        tdone[13]=1;
      }
      else {
        ends[13]=2;
        tdone[13]=1;
      }
    }
  }

  public void thread17892(int [] tdone, int [] ends){
        S748=1;
    if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
      inlet1Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17891(int [] tdone, int [] ends){
        S740=1;
    if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
      injector1Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17890(int [] tdone, int [] ends){
        S732=1;
    S504=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
      S504=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
        S504=2;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S446=0;
        __start_thread_10 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
          ends[10]=3;
          ;//sysj/filler_plant.sysj line: 18, column: 42
          S446=1;
          dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
      S418=0;
      __start_thread_10 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
        ends[10]=4;
        ;//sysj/filler_plant.sysj line: 14, column: 44
        S418=1;
        dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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

  public void thread17889(int [] tdone, int [] ends){
        S757=1;
    thread17890(tdone,ends);
    thread17891(tdone,ends);
    thread17892(tdone,ends);
    thread17893(tdone,ends);
    int biggest17894 = 0;
    if(ends[10]>=biggest17894){
      biggest17894=ends[10];
    }
    if(ends[11]>=biggest17894){
      biggest17894=ends[11];
    }
    if(ends[12]>=biggest17894){
      biggest17894=ends[12];
    }
    if(ends[13]>=biggest17894){
      biggest17894=ends[13];
    }
    if(biggest17894 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    if(biggest17894 == 2){
      ends[9]=2;
      ;//sysj/filler_plant.sysj line: 11, column: 2
      S757=0;
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
  }

  public void thread17888(int [] tdone, int [] ends){
        active[8]=0;
    ends[8]=0;
    tdone[8]=1;
  }

  public void thread17885(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 35, column: 12
      ;//sysj/filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[7]=2;
        tdone[7]=1;
      }
      else {
        ends[7]=2;
        tdone[7]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[7]=2;
        tdone[7]=1;
      }
      else {
        ends[7]=2;
        tdone[7]=1;
      }
    }
  }

  public void thread17884(int [] tdone, int [] ends){
        S380=1;
    if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
      inlet0Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17883(int [] tdone, int [] ends){
        S372=1;
    if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
      injector0Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17882(int [] tdone, int [] ends){
        S364=1;
    S136=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
      S136=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
        S136=2;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S78=0;
        __start_thread_4 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
          ends[4]=3;
          ;//sysj/filler_plant.sysj line: 18, column: 42
          S78=1;
          dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
      S50=0;
      __start_thread_4 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
      S25=0;
      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
        ends[4]=4;
        ;//sysj/filler_plant.sysj line: 14, column: 44
        S50=1;
        dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
        currsigs.addElement(dosUnitFilled);
        System.out.println("Emitted dosUnitFilled");
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S25=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
  }

  public void thread17881(int [] tdone, int [] ends){
        S389=1;
    thread17882(tdone,ends);
    thread17883(tdone,ends);
    thread17884(tdone,ends);
    thread17885(tdone,ends);
    int biggest17886 = 0;
    if(ends[4]>=biggest17886){
      biggest17886=ends[4];
    }
    if(ends[5]>=biggest17886){
      biggest17886=ends[5];
    }
    if(ends[6]>=biggest17886){
      biggest17886=ends[6];
    }
    if(ends[7]>=biggest17886){
      biggest17886=ends[7];
    }
    if(biggest17886 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest17886 == 2){
      ends[3]=2;
      ;//sysj/filler_plant.sysj line: 11, column: 2
      S389=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread17880(int [] tdone, int [] ends){
        active[2]=0;
    ends[2]=0;
    tdone[2]=1;
  }

  public void thread17877(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 35, column: 12
      ;//sysj/filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[25]=2;
        tdone[25]=1;
      }
      else {
        ends[25]=2;
        tdone[25]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[25]=2;
        tdone[25]=1;
      }
      else {
        ends[25]=2;
        tdone[25]=1;
      }
    }
  }

  public void thread17876(int [] tdone, int [] ends){
        S1484=1;
    if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
      inlet3Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17875(int [] tdone, int [] ends){
        S1476=1;
    if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
      injector3Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17874(int [] tdone, int [] ends){
        S1468=1;
    S1240=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
      S1240=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
        S1240=2;
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
      }
      else {
        S1182=0;
        __start_thread_22 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
          ends[22]=3;
          ;//sysj/filler_plant.sysj line: 18, column: 42
          S1182=1;
          dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
      S1154=0;
      __start_thread_22 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
        ends[22]=4;
        ;//sysj/filler_plant.sysj line: 14, column: 44
        S1154=1;
        dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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

  public void thread17873(int [] tdone, int [] ends){
        S1493=1;
    thread17874(tdone,ends);
    thread17875(tdone,ends);
    thread17876(tdone,ends);
    thread17877(tdone,ends);
    int biggest17878 = 0;
    if(ends[22]>=biggest17878){
      biggest17878=ends[22];
    }
    if(ends[23]>=biggest17878){
      biggest17878=ends[23];
    }
    if(ends[24]>=biggest17878){
      biggest17878=ends[24];
    }
    if(ends[25]>=biggest17878){
      biggest17878=ends[25];
    }
    if(biggest17878 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest17878 == 2){
      ends[21]=2;
      ;//sysj/filler_plant.sysj line: 11, column: 2
      S1493=0;
      active[21]=0;
      ends[21]=0;
      tdone[21]=1;
    }
  }

  public void thread17872(int [] tdone, int [] ends){
        active[20]=0;
    ends[20]=0;
    tdone[20]=1;
  }

  public void thread17869(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 35, column: 12
      ;//sysj/filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[19]=2;
        tdone[19]=1;
      }
      else {
        ends[19]=2;
        tdone[19]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[19]=2;
        tdone[19]=1;
      }
      else {
        ends[19]=2;
        tdone[19]=1;
      }
    }
  }

  public void thread17868(int [] tdone, int [] ends){
        S1116=1;
    if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
      inlet2Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17867(int [] tdone, int [] ends){
        S1108=1;
    if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
      injector2Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17866(int [] tdone, int [] ends){
        S1100=1;
    S872=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
      S872=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
        S872=2;
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
      else {
        S814=0;
        __start_thread_16 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
          ends[16]=3;
          ;//sysj/filler_plant.sysj line: 18, column: 42
          S814=1;
          dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
      S786=0;
      __start_thread_16 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
        ends[16]=4;
        ;//sysj/filler_plant.sysj line: 14, column: 44
        S786=1;
        dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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

  public void thread17865(int [] tdone, int [] ends){
        S1125=1;
    thread17866(tdone,ends);
    thread17867(tdone,ends);
    thread17868(tdone,ends);
    thread17869(tdone,ends);
    int biggest17870 = 0;
    if(ends[16]>=biggest17870){
      biggest17870=ends[16];
    }
    if(ends[17]>=biggest17870){
      biggest17870=ends[17];
    }
    if(ends[18]>=biggest17870){
      biggest17870=ends[18];
    }
    if(ends[19]>=biggest17870){
      biggest17870=ends[19];
    }
    if(biggest17870 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    if(biggest17870 == 2){
      ends[15]=2;
      ;//sysj/filler_plant.sysj line: 11, column: 2
      S1125=0;
      active[15]=0;
      ends[15]=0;
      tdone[15]=1;
    }
  }

  public void thread17864(int [] tdone, int [] ends){
        active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread17861(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 35, column: 12
      ;//sysj/filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[13]=2;
        tdone[13]=1;
      }
      else {
        ends[13]=2;
        tdone[13]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[13]=2;
        tdone[13]=1;
      }
      else {
        ends[13]=2;
        tdone[13]=1;
      }
    }
  }

  public void thread17860(int [] tdone, int [] ends){
        S748=1;
    if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
      inlet1Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17859(int [] tdone, int [] ends){
        S740=1;
    if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
      injector1Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17858(int [] tdone, int [] ends){
        S732=1;
    S504=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
      S504=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
        S504=2;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S446=0;
        __start_thread_10 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
          ends[10]=3;
          ;//sysj/filler_plant.sysj line: 18, column: 42
          S446=1;
          dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
      S418=0;
      __start_thread_10 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
        ends[10]=4;
        ;//sysj/filler_plant.sysj line: 14, column: 44
        S418=1;
        dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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

  public void thread17857(int [] tdone, int [] ends){
        S757=1;
    thread17858(tdone,ends);
    thread17859(tdone,ends);
    thread17860(tdone,ends);
    thread17861(tdone,ends);
    int biggest17862 = 0;
    if(ends[10]>=biggest17862){
      biggest17862=ends[10];
    }
    if(ends[11]>=biggest17862){
      biggest17862=ends[11];
    }
    if(ends[12]>=biggest17862){
      biggest17862=ends[12];
    }
    if(ends[13]>=biggest17862){
      biggest17862=ends[13];
    }
    if(biggest17862 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    if(biggest17862 == 2){
      ends[9]=2;
      ;//sysj/filler_plant.sysj line: 11, column: 2
      S757=0;
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
  }

  public void thread17856(int [] tdone, int [] ends){
        active[8]=0;
    ends[8]=0;
    tdone[8]=1;
  }

  public void thread17853(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 35, column: 12
      ;//sysj/filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[7]=2;
        tdone[7]=1;
      }
      else {
        ends[7]=2;
        tdone[7]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[7]=2;
        tdone[7]=1;
      }
      else {
        ends[7]=2;
        tdone[7]=1;
      }
    }
  }

  public void thread17852(int [] tdone, int [] ends){
        S380=1;
    if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
      inlet0Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17851(int [] tdone, int [] ends){
        S372=1;
    if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
      injector0Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17850(int [] tdone, int [] ends){
        S364=1;
    S136=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
      S136=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
        S136=2;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S78=0;
        __start_thread_4 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
          ends[4]=3;
          ;//sysj/filler_plant.sysj line: 18, column: 42
          S78=1;
          dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
      S50=0;
      __start_thread_4 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
      S25=0;
      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
        ends[4]=4;
        ;//sysj/filler_plant.sysj line: 14, column: 44
        S50=1;
        dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
        currsigs.addElement(dosUnitFilled);
        System.out.println("Emitted dosUnitFilled");
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S25=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
  }

  public void thread17849(int [] tdone, int [] ends){
        S389=1;
    thread17850(tdone,ends);
    thread17851(tdone,ends);
    thread17852(tdone,ends);
    thread17853(tdone,ends);
    int biggest17854 = 0;
    if(ends[4]>=biggest17854){
      biggest17854=ends[4];
    }
    if(ends[5]>=biggest17854){
      biggest17854=ends[5];
    }
    if(ends[6]>=biggest17854){
      biggest17854=ends[6];
    }
    if(ends[7]>=biggest17854){
      biggest17854=ends[7];
    }
    if(biggest17854 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest17854 == 2){
      ends[3]=2;
      ;//sysj/filler_plant.sysj line: 11, column: 2
      S389=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread17848(int [] tdone, int [] ends){
        active[2]=0;
    ends[2]=0;
    tdone[2]=1;
  }

  public void thread17845(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 35, column: 12
      ;//sysj/filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[25]=2;
        tdone[25]=1;
      }
      else {
        ends[25]=2;
        tdone[25]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[25]=2;
        tdone[25]=1;
      }
      else {
        ends[25]=2;
        tdone[25]=1;
      }
    }
  }

  public void thread17844(int [] tdone, int [] ends){
        S1484=1;
    if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
      inlet3Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17843(int [] tdone, int [] ends){
        S1476=1;
    if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
      injector3Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17842(int [] tdone, int [] ends){
        S1468=1;
    S1240=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
      S1240=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
        S1240=2;
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
      }
      else {
        S1182=0;
        __start_thread_22 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
          ends[22]=3;
          ;//sysj/filler_plant.sysj line: 18, column: 42
          S1182=1;
          dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
      S1154=0;
      __start_thread_22 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
        ends[22]=4;
        ;//sysj/filler_plant.sysj line: 14, column: 44
        S1154=1;
        dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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

  public void thread17841(int [] tdone, int [] ends){
        S1493=1;
    thread17842(tdone,ends);
    thread17843(tdone,ends);
    thread17844(tdone,ends);
    thread17845(tdone,ends);
    int biggest17846 = 0;
    if(ends[22]>=biggest17846){
      biggest17846=ends[22];
    }
    if(ends[23]>=biggest17846){
      biggest17846=ends[23];
    }
    if(ends[24]>=biggest17846){
      biggest17846=ends[24];
    }
    if(ends[25]>=biggest17846){
      biggest17846=ends[25];
    }
    if(biggest17846 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest17846 == 2){
      ends[21]=2;
      ;//sysj/filler_plant.sysj line: 11, column: 2
      S1493=0;
      active[21]=0;
      ends[21]=0;
      tdone[21]=1;
    }
  }

  public void thread17840(int [] tdone, int [] ends){
        active[20]=0;
    ends[20]=0;
    tdone[20]=1;
  }

  public void thread17837(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 35, column: 12
      ;//sysj/filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[19]=2;
        tdone[19]=1;
      }
      else {
        ends[19]=2;
        tdone[19]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[19]=2;
        tdone[19]=1;
      }
      else {
        ends[19]=2;
        tdone[19]=1;
      }
    }
  }

  public void thread17836(int [] tdone, int [] ends){
        S1116=1;
    if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
      inlet2Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17835(int [] tdone, int [] ends){
        S1108=1;
    if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
      injector2Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17834(int [] tdone, int [] ends){
        S1100=1;
    S872=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
      S872=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
        S872=2;
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
      else {
        S814=0;
        __start_thread_16 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
          ends[16]=3;
          ;//sysj/filler_plant.sysj line: 18, column: 42
          S814=1;
          dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
      S786=0;
      __start_thread_16 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
        ends[16]=4;
        ;//sysj/filler_plant.sysj line: 14, column: 44
        S786=1;
        dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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

  public void thread17833(int [] tdone, int [] ends){
        S1125=1;
    thread17834(tdone,ends);
    thread17835(tdone,ends);
    thread17836(tdone,ends);
    thread17837(tdone,ends);
    int biggest17838 = 0;
    if(ends[16]>=biggest17838){
      biggest17838=ends[16];
    }
    if(ends[17]>=biggest17838){
      biggest17838=ends[17];
    }
    if(ends[18]>=biggest17838){
      biggest17838=ends[18];
    }
    if(ends[19]>=biggest17838){
      biggest17838=ends[19];
    }
    if(biggest17838 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    if(biggest17838 == 2){
      ends[15]=2;
      ;//sysj/filler_plant.sysj line: 11, column: 2
      S1125=0;
      active[15]=0;
      ends[15]=0;
      tdone[15]=1;
    }
  }

  public void thread17832(int [] tdone, int [] ends){
        active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread17829(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 35, column: 12
      ;//sysj/filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[13]=2;
        tdone[13]=1;
      }
      else {
        ends[13]=2;
        tdone[13]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[13]=2;
        tdone[13]=1;
      }
      else {
        ends[13]=2;
        tdone[13]=1;
      }
    }
  }

  public void thread17828(int [] tdone, int [] ends){
        S748=1;
    if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
      inlet1Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17827(int [] tdone, int [] ends){
        S740=1;
    if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
      injector1Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17826(int [] tdone, int [] ends){
        S732=1;
    S504=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
      S504=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
        S504=2;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S446=0;
        __start_thread_10 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
          ends[10]=3;
          ;//sysj/filler_plant.sysj line: 18, column: 42
          S446=1;
          dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
      S418=0;
      __start_thread_10 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
        ends[10]=4;
        ;//sysj/filler_plant.sysj line: 14, column: 44
        S418=1;
        dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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

  public void thread17825(int [] tdone, int [] ends){
        S757=1;
    thread17826(tdone,ends);
    thread17827(tdone,ends);
    thread17828(tdone,ends);
    thread17829(tdone,ends);
    int biggest17830 = 0;
    if(ends[10]>=biggest17830){
      biggest17830=ends[10];
    }
    if(ends[11]>=biggest17830){
      biggest17830=ends[11];
    }
    if(ends[12]>=biggest17830){
      biggest17830=ends[12];
    }
    if(ends[13]>=biggest17830){
      biggest17830=ends[13];
    }
    if(biggest17830 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    if(biggest17830 == 2){
      ends[9]=2;
      ;//sysj/filler_plant.sysj line: 11, column: 2
      S757=0;
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
  }

  public void thread17824(int [] tdone, int [] ends){
        active[8]=0;
    ends[8]=0;
    tdone[8]=1;
  }

  public void thread17821(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 35, column: 12
      ;//sysj/filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[7]=2;
        tdone[7]=1;
      }
      else {
        ends[7]=2;
        tdone[7]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[7]=2;
        tdone[7]=1;
      }
      else {
        ends[7]=2;
        tdone[7]=1;
      }
    }
  }

  public void thread17820(int [] tdone, int [] ends){
        S380=1;
    if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
      inlet0Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17819(int [] tdone, int [] ends){
        S372=1;
    if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
      injector0Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17818(int [] tdone, int [] ends){
        S364=1;
    S136=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
      S136=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
        S136=2;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S78=0;
        __start_thread_4 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
          ends[4]=3;
          ;//sysj/filler_plant.sysj line: 18, column: 42
          S78=1;
          dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
      S50=0;
      __start_thread_4 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
      S25=0;
      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
        ends[4]=4;
        ;//sysj/filler_plant.sysj line: 14, column: 44
        S50=1;
        dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
        currsigs.addElement(dosUnitFilled);
        System.out.println("Emitted dosUnitFilled");
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S25=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
  }

  public void thread17817(int [] tdone, int [] ends){
        S389=1;
    thread17818(tdone,ends);
    thread17819(tdone,ends);
    thread17820(tdone,ends);
    thread17821(tdone,ends);
    int biggest17822 = 0;
    if(ends[4]>=biggest17822){
      biggest17822=ends[4];
    }
    if(ends[5]>=biggest17822){
      biggest17822=ends[5];
    }
    if(ends[6]>=biggest17822){
      biggest17822=ends[6];
    }
    if(ends[7]>=biggest17822){
      biggest17822=ends[7];
    }
    if(biggest17822 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest17822 == 2){
      ends[3]=2;
      ;//sysj/filler_plant.sysj line: 11, column: 2
      S389=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread17816(int [] tdone, int [] ends){
        active[2]=0;
    ends[2]=0;
    tdone[2]=1;
  }

  public void thread17813(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 35, column: 12
      ;//sysj/filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[25]=2;
        tdone[25]=1;
      }
      else {
        ends[25]=2;
        tdone[25]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[25]=2;
        tdone[25]=1;
      }
      else {
        ends[25]=2;
        tdone[25]=1;
      }
    }
  }

  public void thread17812(int [] tdone, int [] ends){
        S1484=1;
    if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
      inlet3Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17811(int [] tdone, int [] ends){
        S1476=1;
    if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
      injector3Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17810(int [] tdone, int [] ends){
        S1468=1;
    S1240=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
      S1240=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
        S1240=2;
        active[22]=1;
        ends[22]=1;
        tdone[22]=1;
      }
      else {
        S1182=0;
        __start_thread_22 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
          ends[22]=3;
          ;//sysj/filler_plant.sysj line: 18, column: 42
          S1182=1;
          dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
      S1154=0;
      __start_thread_22 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_22 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
        ends[22]=4;
        ;//sysj/filler_plant.sysj line: 14, column: 44
        S1154=1;
        dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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

  public void thread17809(int [] tdone, int [] ends){
        S1493=1;
    thread17810(tdone,ends);
    thread17811(tdone,ends);
    thread17812(tdone,ends);
    thread17813(tdone,ends);
    int biggest17814 = 0;
    if(ends[22]>=biggest17814){
      biggest17814=ends[22];
    }
    if(ends[23]>=biggest17814){
      biggest17814=ends[23];
    }
    if(ends[24]>=biggest17814){
      biggest17814=ends[24];
    }
    if(ends[25]>=biggest17814){
      biggest17814=ends[25];
    }
    if(biggest17814 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
    if(biggest17814 == 2){
      ends[21]=2;
      ;//sysj/filler_plant.sysj line: 11, column: 2
      S1493=0;
      active[21]=0;
      ends[21]=0;
      tdone[21]=1;
    }
  }

  public void thread17808(int [] tdone, int [] ends){
        active[20]=0;
    ends[20]=0;
    tdone[20]=1;
  }

  public void thread17805(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 35, column: 12
      ;//sysj/filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[19]=2;
        tdone[19]=1;
      }
      else {
        ends[19]=2;
        tdone[19]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[19]=2;
        tdone[19]=1;
      }
      else {
        ends[19]=2;
        tdone[19]=1;
      }
    }
  }

  public void thread17804(int [] tdone, int [] ends){
        S1116=1;
    if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
      inlet2Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17803(int [] tdone, int [] ends){
        S1108=1;
    if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
      injector2Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17802(int [] tdone, int [] ends){
        S1100=1;
    S872=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
      S872=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
        S872=2;
        active[16]=1;
        ends[16]=1;
        tdone[16]=1;
      }
      else {
        S814=0;
        __start_thread_16 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
          ends[16]=3;
          ;//sysj/filler_plant.sysj line: 18, column: 42
          S814=1;
          dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
      S786=0;
      __start_thread_16 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_16 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
        ends[16]=4;
        ;//sysj/filler_plant.sysj line: 14, column: 44
        S786=1;
        dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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

  public void thread17801(int [] tdone, int [] ends){
        S1125=1;
    thread17802(tdone,ends);
    thread17803(tdone,ends);
    thread17804(tdone,ends);
    thread17805(tdone,ends);
    int biggest17806 = 0;
    if(ends[16]>=biggest17806){
      biggest17806=ends[16];
    }
    if(ends[17]>=biggest17806){
      biggest17806=ends[17];
    }
    if(ends[18]>=biggest17806){
      biggest17806=ends[18];
    }
    if(ends[19]>=biggest17806){
      biggest17806=ends[19];
    }
    if(biggest17806 == 1){
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    if(biggest17806 == 2){
      ends[15]=2;
      ;//sysj/filler_plant.sysj line: 11, column: 2
      S1125=0;
      active[15]=0;
      ends[15]=0;
      tdone[15]=1;
    }
  }

  public void thread17800(int [] tdone, int [] ends){
        active[14]=0;
    ends[14]=0;
    tdone[14]=1;
  }

  public void thread17797(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 35, column: 12
      ;//sysj/filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[13]=2;
        tdone[13]=1;
      }
      else {
        ends[13]=2;
        tdone[13]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[13]=2;
        tdone[13]=1;
      }
      else {
        ends[13]=2;
        tdone[13]=1;
      }
    }
  }

  public void thread17796(int [] tdone, int [] ends){
        S748=1;
    if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
      inlet1Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17795(int [] tdone, int [] ends){
        S740=1;
    if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
      injector1Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17794(int [] tdone, int [] ends){
        S732=1;
    S504=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
      S504=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
        S504=2;
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
      }
      else {
        S446=0;
        __start_thread_10 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
          ends[10]=3;
          ;//sysj/filler_plant.sysj line: 18, column: 42
          S446=1;
          dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
      S418=0;
      __start_thread_10 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
      if(com.systemj.Timer.getMs() - __start_thread_10 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
        ends[10]=4;
        ;//sysj/filler_plant.sysj line: 14, column: 44
        S418=1;
        dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
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

  public void thread17793(int [] tdone, int [] ends){
        S757=1;
    thread17794(tdone,ends);
    thread17795(tdone,ends);
    thread17796(tdone,ends);
    thread17797(tdone,ends);
    int biggest17798 = 0;
    if(ends[10]>=biggest17798){
      biggest17798=ends[10];
    }
    if(ends[11]>=biggest17798){
      biggest17798=ends[11];
    }
    if(ends[12]>=biggest17798){
      biggest17798=ends[12];
    }
    if(ends[13]>=biggest17798){
      biggest17798=ends[13];
    }
    if(biggest17798 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    if(biggest17798 == 2){
      ends[9]=2;
      ;//sysj/filler_plant.sysj line: 11, column: 2
      S757=0;
      active[9]=0;
      ends[9]=0;
      tdone[9]=1;
    }
  }

  public void thread17792(int [] tdone, int [] ends){
        active[8]=0;
    ends[8]=0;
    tdone[8]=1;
  }

  public void thread17789(int [] tdone, int [] ends){
        if(dosUnitValveExtend.getprestatus() && valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 35, column: 12
      ;//sysj/filler_plant.sysj line: 35, column: 50
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[7]=2;
        tdone[7]=1;
      }
      else {
        ends[7]=2;
        tdone[7]=1;
      }
    }
    else {
      if(!dosUnitValveExtend.getprestatus() && !valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 36, column: 12
        ;//sysj/filler_plant.sysj line: 36, column: 52
        ends[7]=2;
        tdone[7]=1;
      }
      else {
        ends[7]=2;
        tdone[7]=1;
      }
    }
  }

  public void thread17788(int [] tdone, int [] ends){
        S380=1;
    if(valveInletOnOff.getprestatus()){//sysj/filler_plant.sysj line: 31, column: 24
      inlet0Engaged.setPresent();//sysj/filler_plant.sysj line: 31, column: 41
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

  public void thread17787(int [] tdone, int [] ends){
        S372=1;
    if(valveInjectorOnOff.getprestatus()){//sysj/filler_plant.sysj line: 27, column: 24
      injector0Engaged.setPresent();//sysj/filler_plant.sysj line: 27, column: 44
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

  public void thread17786(int [] tdone, int [] ends){
        S364=1;
    S136=0;
    if(!dosUnitValveRetract.getprestatus()){//sysj/filler_plant.sysj line: 14, column: 22
      S136=1;
      if(!dosUnitValveExtend.getprestatus()){//sysj/filler_plant.sysj line: 18, column: 22
        S136=2;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S78=0;
        __start_thread_4 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 18, column: 42
        if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj/filler_plant.sysj line: 18, column: 42
          ends[4]=3;
          ;//sysj/filler_plant.sysj line: 18, column: 42
          S78=1;
          dosUnitEvac.setPresent();//sysj/filler_plant.sysj line: 20, column: 6
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
      S50=0;
      __start_thread_4 = com.systemj.Timer.getMs();//sysj/filler_plant.sysj line: 14, column: 44
      S25=0;
      if(com.systemj.Timer.getMs() - __start_thread_4 >= 100){//sysj/filler_plant.sysj line: 14, column: 44
        ends[4]=4;
        ;//sysj/filler_plant.sysj line: 14, column: 44
        S50=1;
        dosUnitFilled.setPresent();//sysj/filler_plant.sysj line: 16, column: 6
        currsigs.addElement(dosUnitFilled);
        System.out.println("Emitted dosUnitFilled");
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S25=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
  }

  public void thread17785(int [] tdone, int [] ends){
        S389=1;
    thread17786(tdone,ends);
    thread17787(tdone,ends);
    thread17788(tdone,ends);
    thread17789(tdone,ends);
    int biggest17790 = 0;
    if(ends[4]>=biggest17790){
      biggest17790=ends[4];
    }
    if(ends[5]>=biggest17790){
      biggest17790=ends[5];
    }
    if(ends[6]>=biggest17790){
      biggest17790=ends[6];
    }
    if(ends[7]>=biggest17790){
      biggest17790=ends[7];
    }
    if(biggest17790 == 1){
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    if(biggest17790 == 2){
      ends[3]=2;
      ;//sysj/filler_plant.sysj line: 11, column: 2
      S389=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread17784(int [] tdone, int [] ends){
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
      switch(S17782){
        case 0 : 
          S17782=0;
          break RUN;
        
        case 1 : 
          S17782=2;
          S17782=2;
          S5926=0;
          S6=0;
          if(!nozzleSelect_in.isPartnerPresent() || nozzleSelect_in.isPartnerPreempted()){//sysj/filler_plant.sysj line: 55, column: 4
            nozzleSelect_in.setACK(false);//sysj/filler_plant.sysj line: 55, column: 4
            S6=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S1=0;
            if(!nozzleSelect_in.isREQ()){//sysj/filler_plant.sysj line: 55, column: 4
              nozzleSelect_in.setACK(true);//sysj/filler_plant.sysj line: 55, column: 4
              S1=1;
              if(nozzleSelect_in.isREQ()){//sysj/filler_plant.sysj line: 55, column: 4
                nozzleSelect_in.setACK(false);//sysj/filler_plant.sysj line: 55, column: 4
                ends[1]=2;
                ;//sysj/filler_plant.sysj line: 55, column: 4
                S5926=1;
                if((int)(nozzleSelect_in.getVal() == null ? 0 : ((Integer)nozzleSelect_in.getVal()).intValue()) == 0){//sysj/filler_plant.sysj line: 57, column: 5
                  S1497=0;
                  thread17784(tdone,ends);
                  thread17785(tdone,ends);
                  int biggest17791 = 0;
                  if(ends[2]>=biggest17791){
                    biggest17791=ends[2];
                  }
                  if(ends[3]>=biggest17791){
                    biggest17791=ends[3];
                  }
                  if(biggest17791 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest17791 == 0){
                    S5926=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                }
                else {
                  S1497=1;
                  if((int)(nozzleSelect_in.getVal() == null ? 0 : ((Integer)nozzleSelect_in.getVal()).intValue()) == 1){//sysj/filler_plant.sysj line: 61, column: 5
                    S1496=0;
                    thread17792(tdone,ends);
                    thread17793(tdone,ends);
                    int biggest17799 = 0;
                    if(ends[8]>=biggest17799){
                      biggest17799=ends[8];
                    }
                    if(ends[9]>=biggest17799){
                      biggest17799=ends[9];
                    }
                    if(biggest17799 == 1){
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest17799 == 0){
                      S5926=2;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                  else {
                    S1496=1;
                    if((int)(nozzleSelect_in.getVal() == null ? 0 : ((Integer)nozzleSelect_in.getVal()).intValue()) == 2){//sysj/filler_plant.sysj line: 65, column: 5
                      S1495=0;
                      thread17800(tdone,ends);
                      thread17801(tdone,ends);
                      int biggest17807 = 0;
                      if(ends[14]>=biggest17807){
                        biggest17807=ends[14];
                      }
                      if(ends[15]>=biggest17807){
                        biggest17807=ends[15];
                      }
                      if(biggest17807 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest17807 == 0){
                        S5926=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S1495=1;
                      if((int)(nozzleSelect_in.getVal() == null ? 0 : ((Integer)nozzleSelect_in.getVal()).intValue()) == 3){//sysj/filler_plant.sysj line: 69, column: 5
                        thread17808(tdone,ends);
                        thread17809(tdone,ends);
                        int biggest17815 = 0;
                        if(ends[20]>=biggest17815){
                          biggest17815=ends[20];
                        }
                        if(ends[21]>=biggest17815){
                          biggest17815=ends[21];
                        }
                        if(biggest17815 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest17815 == 0){
                          S5926=2;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S5926=2;
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
            }
            else {
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
        
        case 2 : 
          switch(S5926){
            case 0 : 
              switch(S6){
                case 0 : 
                  if(!nozzleSelect_in.isPartnerPresent() || nozzleSelect_in.isPartnerPreempted()){//sysj/filler_plant.sysj line: 55, column: 4
                    nozzleSelect_in.setACK(false);//sysj/filler_plant.sysj line: 55, column: 4
                    S6=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S1){
                      case 0 : 
                        if(!nozzleSelect_in.isREQ()){//sysj/filler_plant.sysj line: 55, column: 4
                          nozzleSelect_in.setACK(true);//sysj/filler_plant.sysj line: 55, column: 4
                          S1=1;
                          if(nozzleSelect_in.isREQ()){//sysj/filler_plant.sysj line: 55, column: 4
                            nozzleSelect_in.setACK(false);//sysj/filler_plant.sysj line: 55, column: 4
                            ends[1]=2;
                            ;//sysj/filler_plant.sysj line: 55, column: 4
                            S5926=1;
                            if((int)(nozzleSelect_in.getVal() == null ? 0 : ((Integer)nozzleSelect_in.getVal()).intValue()) == 0){//sysj/filler_plant.sysj line: 57, column: 5
                              S1497=0;
                              thread17816(tdone,ends);
                              thread17817(tdone,ends);
                              int biggest17823 = 0;
                              if(ends[2]>=biggest17823){
                                biggest17823=ends[2];
                              }
                              if(ends[3]>=biggest17823){
                                biggest17823=ends[3];
                              }
                              if(biggest17823 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              //FINXME code
                              if(biggest17823 == 0){
                                S5926=2;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              S1497=1;
                              if((int)(nozzleSelect_in.getVal() == null ? 0 : ((Integer)nozzleSelect_in.getVal()).intValue()) == 1){//sysj/filler_plant.sysj line: 61, column: 5
                                S1496=0;
                                thread17824(tdone,ends);
                                thread17825(tdone,ends);
                                int biggest17831 = 0;
                                if(ends[8]>=biggest17831){
                                  biggest17831=ends[8];
                                }
                                if(ends[9]>=biggest17831){
                                  biggest17831=ends[9];
                                }
                                if(biggest17831 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                //FINXME code
                                if(biggest17831 == 0){
                                  S5926=2;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S1496=1;
                                if((int)(nozzleSelect_in.getVal() == null ? 0 : ((Integer)nozzleSelect_in.getVal()).intValue()) == 2){//sysj/filler_plant.sysj line: 65, column: 5
                                  S1495=0;
                                  thread17832(tdone,ends);
                                  thread17833(tdone,ends);
                                  int biggest17839 = 0;
                                  if(ends[14]>=biggest17839){
                                    biggest17839=ends[14];
                                  }
                                  if(ends[15]>=biggest17839){
                                    biggest17839=ends[15];
                                  }
                                  if(biggest17839 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  //FINXME code
                                  if(biggest17839 == 0){
                                    S5926=2;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S1495=1;
                                  if((int)(nozzleSelect_in.getVal() == null ? 0 : ((Integer)nozzleSelect_in.getVal()).intValue()) == 3){//sysj/filler_plant.sysj line: 69, column: 5
                                    thread17840(tdone,ends);
                                    thread17841(tdone,ends);
                                    int biggest17847 = 0;
                                    if(ends[20]>=biggest17847){
                                      biggest17847=ends[20];
                                    }
                                    if(ends[21]>=biggest17847){
                                      biggest17847=ends[21];
                                    }
                                    if(biggest17847 == 1){
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                    //FINXME code
                                    if(biggest17847 == 0){
                                      S5926=2;
                                      active[1]=1;
                                      ends[1]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    S5926=2;
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
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(nozzleSelect_in.isREQ()){//sysj/filler_plant.sysj line: 55, column: 4
                          nozzleSelect_in.setACK(false);//sysj/filler_plant.sysj line: 55, column: 4
                          ends[1]=2;
                          ;//sysj/filler_plant.sysj line: 55, column: 4
                          S5926=1;
                          if((int)(nozzleSelect_in.getVal() == null ? 0 : ((Integer)nozzleSelect_in.getVal()).intValue()) == 0){//sysj/filler_plant.sysj line: 57, column: 5
                            S1497=0;
                            thread17848(tdone,ends);
                            thread17849(tdone,ends);
                            int biggest17855 = 0;
                            if(ends[2]>=biggest17855){
                              biggest17855=ends[2];
                            }
                            if(ends[3]>=biggest17855){
                              biggest17855=ends[3];
                            }
                            if(biggest17855 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest17855 == 0){
                              S5926=2;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            S1497=1;
                            if((int)(nozzleSelect_in.getVal() == null ? 0 : ((Integer)nozzleSelect_in.getVal()).intValue()) == 1){//sysj/filler_plant.sysj line: 61, column: 5
                              S1496=0;
                              thread17856(tdone,ends);
                              thread17857(tdone,ends);
                              int biggest17863 = 0;
                              if(ends[8]>=biggest17863){
                                biggest17863=ends[8];
                              }
                              if(ends[9]>=biggest17863){
                                biggest17863=ends[9];
                              }
                              if(biggest17863 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              //FINXME code
                              if(biggest17863 == 0){
                                S5926=2;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              S1496=1;
                              if((int)(nozzleSelect_in.getVal() == null ? 0 : ((Integer)nozzleSelect_in.getVal()).intValue()) == 2){//sysj/filler_plant.sysj line: 65, column: 5
                                S1495=0;
                                thread17864(tdone,ends);
                                thread17865(tdone,ends);
                                int biggest17871 = 0;
                                if(ends[14]>=biggest17871){
                                  biggest17871=ends[14];
                                }
                                if(ends[15]>=biggest17871){
                                  biggest17871=ends[15];
                                }
                                if(biggest17871 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                //FINXME code
                                if(biggest17871 == 0){
                                  S5926=2;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S1495=1;
                                if((int)(nozzleSelect_in.getVal() == null ? 0 : ((Integer)nozzleSelect_in.getVal()).intValue()) == 3){//sysj/filler_plant.sysj line: 69, column: 5
                                  thread17872(tdone,ends);
                                  thread17873(tdone,ends);
                                  int biggest17879 = 0;
                                  if(ends[20]>=biggest17879){
                                    biggest17879=ends[20];
                                  }
                                  if(ends[21]>=biggest17879){
                                    biggest17879=ends[21];
                                  }
                                  if(biggest17879 == 1){
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                  //FINXME code
                                  if(biggest17879 == 0){
                                    S5926=2;
                                    active[1]=1;
                                    ends[1]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  S5926=2;
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
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S6=1;
                  S6=0;
                  if(!nozzleSelect_in.isPartnerPresent() || nozzleSelect_in.isPartnerPreempted()){//sysj/filler_plant.sysj line: 55, column: 4
                    nozzleSelect_in.setACK(false);//sysj/filler_plant.sysj line: 55, column: 4
                    S6=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S1=0;
                    if(!nozzleSelect_in.isREQ()){//sysj/filler_plant.sysj line: 55, column: 4
                      nozzleSelect_in.setACK(true);//sysj/filler_plant.sysj line: 55, column: 4
                      S1=1;
                      if(nozzleSelect_in.isREQ()){//sysj/filler_plant.sysj line: 55, column: 4
                        nozzleSelect_in.setACK(false);//sysj/filler_plant.sysj line: 55, column: 4
                        ends[1]=2;
                        ;//sysj/filler_plant.sysj line: 55, column: 4
                        S5926=1;
                        if((int)(nozzleSelect_in.getVal() == null ? 0 : ((Integer)nozzleSelect_in.getVal()).intValue()) == 0){//sysj/filler_plant.sysj line: 57, column: 5
                          S1497=0;
                          thread17880(tdone,ends);
                          thread17881(tdone,ends);
                          int biggest17887 = 0;
                          if(ends[2]>=biggest17887){
                            biggest17887=ends[2];
                          }
                          if(ends[3]>=biggest17887){
                            biggest17887=ends[3];
                          }
                          if(biggest17887 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          //FINXME code
                          if(biggest17887 == 0){
                            S5926=2;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          S1497=1;
                          if((int)(nozzleSelect_in.getVal() == null ? 0 : ((Integer)nozzleSelect_in.getVal()).intValue()) == 1){//sysj/filler_plant.sysj line: 61, column: 5
                            S1496=0;
                            thread17888(tdone,ends);
                            thread17889(tdone,ends);
                            int biggest17895 = 0;
                            if(ends[8]>=biggest17895){
                              biggest17895=ends[8];
                            }
                            if(ends[9]>=biggest17895){
                              biggest17895=ends[9];
                            }
                            if(biggest17895 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest17895 == 0){
                              S5926=2;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            S1496=1;
                            if((int)(nozzleSelect_in.getVal() == null ? 0 : ((Integer)nozzleSelect_in.getVal()).intValue()) == 2){//sysj/filler_plant.sysj line: 65, column: 5
                              S1495=0;
                              thread17896(tdone,ends);
                              thread17897(tdone,ends);
                              int biggest17903 = 0;
                              if(ends[14]>=biggest17903){
                                biggest17903=ends[14];
                              }
                              if(ends[15]>=biggest17903){
                                biggest17903=ends[15];
                              }
                              if(biggest17903 == 1){
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                              //FINXME code
                              if(biggest17903 == 0){
                                S5926=2;
                                active[1]=1;
                                ends[1]=1;
                                break RUN;
                              }
                            }
                            else {
                              S1495=1;
                              if((int)(nozzleSelect_in.getVal() == null ? 0 : ((Integer)nozzleSelect_in.getVal()).intValue()) == 3){//sysj/filler_plant.sysj line: 69, column: 5
                                thread17904(tdone,ends);
                                thread17905(tdone,ends);
                                int biggest17911 = 0;
                                if(ends[20]>=biggest17911){
                                  biggest17911=ends[20];
                                }
                                if(ends[21]>=biggest17911){
                                  biggest17911=ends[21];
                                }
                                if(biggest17911 == 1){
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                                //FINXME code
                                if(biggest17911 == 0){
                                  S5926=2;
                                  active[1]=1;
                                  ends[1]=1;
                                  break RUN;
                                }
                              }
                              else {
                                S5926=2;
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
              switch(S1497){
                case 0 : 
                  thread17912(tdone,ends);
                  thread17913(tdone,ends);
                  int biggest17919 = 0;
                  if(ends[2]>=biggest17919){
                    biggest17919=ends[2];
                  }
                  if(ends[3]>=biggest17919){
                    biggest17919=ends[3];
                  }
                  if(biggest17919 == 1){
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  //FINXME code
                  if(biggest17919 == 0){
                    S5926=2;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                
                case 1 : 
                  switch(S1496){
                    case 0 : 
                      thread17920(tdone,ends);
                      thread17921(tdone,ends);
                      int biggest17927 = 0;
                      if(ends[8]>=biggest17927){
                        biggest17927=ends[8];
                      }
                      if(ends[9]>=biggest17927){
                        biggest17927=ends[9];
                      }
                      if(biggest17927 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest17927 == 0){
                        S5926=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      switch(S1495){
                        case 0 : 
                          thread17928(tdone,ends);
                          thread17929(tdone,ends);
                          int biggest17935 = 0;
                          if(ends[14]>=biggest17935){
                            biggest17935=ends[14];
                          }
                          if(ends[15]>=biggest17935){
                            biggest17935=ends[15];
                          }
                          if(biggest17935 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          //FINXME code
                          if(biggest17935 == 0){
                            S5926=2;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        
                        case 1 : 
                          thread17936(tdone,ends);
                          thread17937(tdone,ends);
                          int biggest17943 = 0;
                          if(ends[20]>=biggest17943){
                            biggest17943=ends[20];
                          }
                          if(ends[21]>=biggest17943){
                            biggest17943=ends[21];
                          }
                          if(biggest17943 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          //FINXME code
                          if(biggest17943 == 0){
                            S5926=2;
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
              S5926=2;
              S5926=0;
              S6=0;
              if(!nozzleSelect_in.isPartnerPresent() || nozzleSelect_in.isPartnerPreempted()){//sysj/filler_plant.sysj line: 55, column: 4
                nozzleSelect_in.setACK(false);//sysj/filler_plant.sysj line: 55, column: 4
                S6=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                S1=0;
                if(!nozzleSelect_in.isREQ()){//sysj/filler_plant.sysj line: 55, column: 4
                  nozzleSelect_in.setACK(true);//sysj/filler_plant.sysj line: 55, column: 4
                  S1=1;
                  if(nozzleSelect_in.isREQ()){//sysj/filler_plant.sysj line: 55, column: 4
                    nozzleSelect_in.setACK(false);//sysj/filler_plant.sysj line: 55, column: 4
                    ends[1]=2;
                    ;//sysj/filler_plant.sysj line: 55, column: 4
                    S5926=1;
                    if((int)(nozzleSelect_in.getVal() == null ? 0 : ((Integer)nozzleSelect_in.getVal()).intValue()) == 0){//sysj/filler_plant.sysj line: 57, column: 5
                      S1497=0;
                      thread17944(tdone,ends);
                      thread17945(tdone,ends);
                      int biggest17951 = 0;
                      if(ends[2]>=biggest17951){
                        biggest17951=ends[2];
                      }
                      if(ends[3]>=biggest17951){
                        biggest17951=ends[3];
                      }
                      if(biggest17951 == 1){
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                      //FINXME code
                      if(biggest17951 == 0){
                        S5926=2;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      S1497=1;
                      if((int)(nozzleSelect_in.getVal() == null ? 0 : ((Integer)nozzleSelect_in.getVal()).intValue()) == 1){//sysj/filler_plant.sysj line: 61, column: 5
                        S1496=0;
                        thread17952(tdone,ends);
                        thread17953(tdone,ends);
                        int biggest17959 = 0;
                        if(ends[8]>=biggest17959){
                          biggest17959=ends[8];
                        }
                        if(ends[9]>=biggest17959){
                          biggest17959=ends[9];
                        }
                        if(biggest17959 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                        //FINXME code
                        if(biggest17959 == 0){
                          S5926=2;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        S1496=1;
                        if((int)(nozzleSelect_in.getVal() == null ? 0 : ((Integer)nozzleSelect_in.getVal()).intValue()) == 2){//sysj/filler_plant.sysj line: 65, column: 5
                          S1495=0;
                          thread17960(tdone,ends);
                          thread17961(tdone,ends);
                          int biggest17967 = 0;
                          if(ends[14]>=biggest17967){
                            biggest17967=ends[14];
                          }
                          if(ends[15]>=biggest17967){
                            biggest17967=ends[15];
                          }
                          if(biggest17967 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                          //FINXME code
                          if(biggest17967 == 0){
                            S5926=2;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          S1495=1;
                          if((int)(nozzleSelect_in.getVal() == null ? 0 : ((Integer)nozzleSelect_in.getVal()).intValue()) == 3){//sysj/filler_plant.sysj line: 69, column: 5
                            thread17968(tdone,ends);
                            thread17969(tdone,ends);
                            int biggest17975 = 0;
                            if(ends[20]>=biggest17975){
                              biggest17975=ends[20];
                            }
                            if(ends[21]>=biggest17975){
                              biggest17975=ends[21];
                            }
                            if(biggest17975 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                            //FINXME code
                            if(biggest17975 == 0){
                              S5926=2;
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            S5926=2;
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
                }
                else {
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
            
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
          nozzleSelect_in.gethook();
          valveInjectorOnOff.gethook();
          valveInletOnOff.gethook();
          dosUnitValveRetract.gethook();
          dosUnitValveExtend.gethook();
          df = true;
        }
        runClockDomain();
      }
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
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
      nozzleSelect_in.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        nozzleSelect_in.gethook();
        valveInjectorOnOff.gethook();
        valveInletOnOff.gethook();
        dosUnitValveRetract.gethook();
        dosUnitValveExtend.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
