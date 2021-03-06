import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import rotaryTable.*;//sysj\rotary_plant.sysj line: 3, column: 1

public class rotary_plant extends ClockDomain{
  public rotary_plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.INPUT);
  public Signal load = new Signal("load", Signal.INPUT);
  public Signal deload = new Signal("deload", Signal.INPUT);
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.OUTPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleAtPos1c = new Signal("bottleAtPos1c", Signal.OUTPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.OUTPUT);
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.OUTPUT);
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.OUTPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.OUTPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.OUTPUT);
  public Signal tableAlignedWithSensor_GUI = new Signal("tableAlignedWithSensor_GUI", Signal.OUTPUT);
  public Signal bottleAtPos1_GUI = new Signal("bottleAtPos1_GUI", Signal.OUTPUT);
  public Signal bottleAtPos2_GUI = new Signal("bottleAtPos2_GUI", Signal.OUTPUT);
  public Signal bottleAtPos3_GUI = new Signal("bottleAtPos3_GUI", Signal.OUTPUT);
  public Signal bottleAtPos4_GUI = new Signal("bottleAtPos4_GUI", Signal.OUTPUT);
  public Signal bottleAtPos5_GUI = new Signal("bottleAtPos5_GUI", Signal.OUTPUT);
  public Signal bottleLeftPos5_GUI = new Signal("bottleLeftPos5_GUI", Signal.OUTPUT);
  public Signal empty = new Signal("empty", Signal.OUTPUT);
  private Signal shift_1;
  private rotaryTable rt_thread_5;//sysj\rotary_plant.sysj line: 34, column: 3
  private long __start_thread_2;//sysj\rotary_plant.sysj line: 22, column: 41
  private int S97203 = 1;
  private int S94041 = 1;
  private int S93811 = 1;
  private int S93753 = 1;
  private int S93700 = 1;
  private int S93717 = 1;
  private int S93722 = 1;
  private int S97193 = 1;
  private int S97201 = 1;
  
  private int[] ends = new int[7];
  private int[] tdone = new int[7];
  
  public void thread97223(int [] tdone, int [] ends){
        switch(S97201){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(!bottleAtPos1.getprestatus() && !bottleAtPos2.getprestatus() && !bottleAtPos3.getprestatus() && !bottleAtPos4.getprestatus() && !bottleAtPos5.getprestatus()){//sysj\rotary_plant.sysj line: 90, column: 12
          empty.setPresent();//sysj\rotary_plant.sysj line: 91, column: 5
          currsigs.addElement(empty);
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

  public void thread97222(int [] tdone, int [] ends){
        switch(S97193){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(shift_1.getprestatus()){//sysj\rotary_plant.sysj line: 36, column: 12
          rt_thread_5.print();//sysj\rotary_plant.sysj line: 37, column: 5
          System.out.println("SHIFTING");//sysj\rotary_plant.sysj line: 38, column: 5
          rt_thread_5.shift();//sysj\rotary_plant.sysj line: 39, column: 5
          rt_thread_5.print();//sysj\rotary_plant.sysj line: 40, column: 5
          if(load.getprestatus()){//sysj\rotary_plant.sysj line: 42, column: 12
            rt_thread_5.print();//sysj\rotary_plant.sysj line: 43, column: 5
            System.out.println("LOADING");//sysj\rotary_plant.sysj line: 44, column: 5
            rt_thread_5.load();//sysj\rotary_plant.sysj line: 45, column: 5
            rt_thread_5.print();//sysj\rotary_plant.sysj line: 46, column: 5
            if(deload.getprestatus()){//sysj\rotary_plant.sysj line: 48, column: 12
              rt_thread_5.print();//sysj\rotary_plant.sysj line: 49, column: 5
              System.out.println("DELOADING");//sysj\rotary_plant.sysj line: 50, column: 5
              rt_thread_5.deload();//sysj\rotary_plant.sysj line: 51, column: 5
              rt_thread_5.print();//sysj\rotary_plant.sysj line: 52, column: 5
              bottleLeftPos5.setPresent();//sysj\rotary_plant.sysj line: 53, column: 5
              currsigs.addElement(bottleLeftPos5);
              bottleLeftPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 54, column: 5
              currsigs.addElement(bottleLeftPos5_GUI);
              if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 59, column: 8
                bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 60, column: 5
                currsigs.addElement(bottleAtPos1);
                bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
                currsigs.addElement(bottleAtPos1c);
                bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
                currsigs.addElement(bottleAtPos1_GUI);
                if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
                  bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
                  currsigs.addElement(bottleAtPos2);
                  bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                  currsigs.addElement(bottleAtPos2_GUI);
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
                else {
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
              }
              else {
                if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
                  bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
                  currsigs.addElement(bottleAtPos2);
                  bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                  currsigs.addElement(bottleAtPos2_GUI);
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
                else {
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
              }
            }
            else {
              if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 59, column: 8
                bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 60, column: 5
                currsigs.addElement(bottleAtPos1);
                bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
                currsigs.addElement(bottleAtPos1c);
                bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
                currsigs.addElement(bottleAtPos1_GUI);
                if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
                  bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
                  currsigs.addElement(bottleAtPos2);
                  bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                  currsigs.addElement(bottleAtPos2_GUI);
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
                else {
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
              }
              else {
                if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
                  bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
                  currsigs.addElement(bottleAtPos2);
                  bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                  currsigs.addElement(bottleAtPos2_GUI);
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
                else {
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
              }
            }
          }
          else {
            if(deload.getprestatus()){//sysj\rotary_plant.sysj line: 48, column: 12
              rt_thread_5.print();//sysj\rotary_plant.sysj line: 49, column: 5
              System.out.println("DELOADING");//sysj\rotary_plant.sysj line: 50, column: 5
              rt_thread_5.deload();//sysj\rotary_plant.sysj line: 51, column: 5
              rt_thread_5.print();//sysj\rotary_plant.sysj line: 52, column: 5
              bottleLeftPos5.setPresent();//sysj\rotary_plant.sysj line: 53, column: 5
              currsigs.addElement(bottleLeftPos5);
              bottleLeftPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 54, column: 5
              currsigs.addElement(bottleLeftPos5_GUI);
              if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 59, column: 8
                bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 60, column: 5
                currsigs.addElement(bottleAtPos1);
                bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
                currsigs.addElement(bottleAtPos1c);
                bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
                currsigs.addElement(bottleAtPos1_GUI);
                if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
                  bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
                  currsigs.addElement(bottleAtPos2);
                  bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                  currsigs.addElement(bottleAtPos2_GUI);
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
                else {
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
              }
              else {
                if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
                  bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
                  currsigs.addElement(bottleAtPos2);
                  bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                  currsigs.addElement(bottleAtPos2_GUI);
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
                else {
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
              }
            }
            else {
              if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 59, column: 8
                bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 60, column: 5
                currsigs.addElement(bottleAtPos1);
                bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
                currsigs.addElement(bottleAtPos1c);
                bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
                currsigs.addElement(bottleAtPos1_GUI);
                if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
                  bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
                  currsigs.addElement(bottleAtPos2);
                  bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                  currsigs.addElement(bottleAtPos2_GUI);
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
                else {
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
              }
              else {
                if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
                  bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
                  currsigs.addElement(bottleAtPos2);
                  bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                  currsigs.addElement(bottleAtPos2_GUI);
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
                else {
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
              }
            }
          }
        }
        else {
          if(load.getprestatus()){//sysj\rotary_plant.sysj line: 42, column: 12
            rt_thread_5.print();//sysj\rotary_plant.sysj line: 43, column: 5
            System.out.println("LOADING");//sysj\rotary_plant.sysj line: 44, column: 5
            rt_thread_5.load();//sysj\rotary_plant.sysj line: 45, column: 5
            rt_thread_5.print();//sysj\rotary_plant.sysj line: 46, column: 5
            if(deload.getprestatus()){//sysj\rotary_plant.sysj line: 48, column: 12
              rt_thread_5.print();//sysj\rotary_plant.sysj line: 49, column: 5
              System.out.println("DELOADING");//sysj\rotary_plant.sysj line: 50, column: 5
              rt_thread_5.deload();//sysj\rotary_plant.sysj line: 51, column: 5
              rt_thread_5.print();//sysj\rotary_plant.sysj line: 52, column: 5
              bottleLeftPos5.setPresent();//sysj\rotary_plant.sysj line: 53, column: 5
              currsigs.addElement(bottleLeftPos5);
              bottleLeftPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 54, column: 5
              currsigs.addElement(bottleLeftPos5_GUI);
              if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 59, column: 8
                bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 60, column: 5
                currsigs.addElement(bottleAtPos1);
                bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
                currsigs.addElement(bottleAtPos1c);
                bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
                currsigs.addElement(bottleAtPos1_GUI);
                if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
                  bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
                  currsigs.addElement(bottleAtPos2);
                  bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                  currsigs.addElement(bottleAtPos2_GUI);
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
                else {
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
              }
              else {
                if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
                  bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
                  currsigs.addElement(bottleAtPos2);
                  bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                  currsigs.addElement(bottleAtPos2_GUI);
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
                else {
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
              }
            }
            else {
              if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 59, column: 8
                bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 60, column: 5
                currsigs.addElement(bottleAtPos1);
                bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
                currsigs.addElement(bottleAtPos1c);
                bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
                currsigs.addElement(bottleAtPos1_GUI);
                if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
                  bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
                  currsigs.addElement(bottleAtPos2);
                  bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                  currsigs.addElement(bottleAtPos2_GUI);
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
                else {
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
              }
              else {
                if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
                  bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
                  currsigs.addElement(bottleAtPos2);
                  bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                  currsigs.addElement(bottleAtPos2_GUI);
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
                else {
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
              }
            }
          }
          else {
            if(deload.getprestatus()){//sysj\rotary_plant.sysj line: 48, column: 12
              rt_thread_5.print();//sysj\rotary_plant.sysj line: 49, column: 5
              System.out.println("DELOADING");//sysj\rotary_plant.sysj line: 50, column: 5
              rt_thread_5.deload();//sysj\rotary_plant.sysj line: 51, column: 5
              rt_thread_5.print();//sysj\rotary_plant.sysj line: 52, column: 5
              bottleLeftPos5.setPresent();//sysj\rotary_plant.sysj line: 53, column: 5
              currsigs.addElement(bottleLeftPos5);
              bottleLeftPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 54, column: 5
              currsigs.addElement(bottleLeftPos5_GUI);
              if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 59, column: 8
                bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 60, column: 5
                currsigs.addElement(bottleAtPos1);
                bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
                currsigs.addElement(bottleAtPos1c);
                bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
                currsigs.addElement(bottleAtPos1_GUI);
                if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
                  bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
                  currsigs.addElement(bottleAtPos2);
                  bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                  currsigs.addElement(bottleAtPos2_GUI);
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
                else {
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
              }
              else {
                if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
                  bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
                  currsigs.addElement(bottleAtPos2);
                  bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                  currsigs.addElement(bottleAtPos2_GUI);
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
                else {
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
              }
            }
            else {
              if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 59, column: 8
                bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 60, column: 5
                currsigs.addElement(bottleAtPos1);
                bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
                currsigs.addElement(bottleAtPos1c);
                bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
                currsigs.addElement(bottleAtPos1_GUI);
                if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
                  bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
                  currsigs.addElement(bottleAtPos2);
                  bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                  currsigs.addElement(bottleAtPos2_GUI);
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
                else {
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
              }
              else {
                if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
                  bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
                  currsigs.addElement(bottleAtPos2);
                  bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                  currsigs.addElement(bottleAtPos2_GUI);
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
                else {
                  if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                    bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                    currsigs.addElement(bottleAtPos3);
                    bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                    currsigs.addElement(bottleAtPos3_GUI);
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                      currsigs.addElement(bottleAtPos4);
                      bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                      currsigs.addElement(bottleAtPos4_GUI);
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                    else {
                      if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                        bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                        currsigs.addElement(bottleAtPos5);
                        bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                        currsigs.addElement(bottleAtPos5_GUI);
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
                }
              }
            }
          }
        }
        break;
      
    }
  }

  public void thread97220(int [] tdone, int [] ends){
        switch(S93722){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        tableAlignedWithSensor_GUI.setPresent();//sysj\rotary_plant.sysj line: 26, column: 6
        currsigs.addElement(tableAlignedWithSensor_GUI);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread97219(int [] tdone, int [] ends){
        switch(S93717){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        tableAlignedWithSensor.setPresent();//sysj\rotary_plant.sysj line: 24, column: 6
        currsigs.addElement(tableAlignedWithSensor);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread97217(int [] tdone, int [] ends){
        S93722=1;
    tableAlignedWithSensor_GUI.setPresent();//sysj\rotary_plant.sysj line: 26, column: 6
    currsigs.addElement(tableAlignedWithSensor_GUI);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread97216(int [] tdone, int [] ends){
        S93717=1;
    tableAlignedWithSensor.setPresent();//sysj\rotary_plant.sysj line: 24, column: 6
    currsigs.addElement(tableAlignedWithSensor);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread97214(int [] tdone, int [] ends){
        S93722=1;
    tableAlignedWithSensor_GUI.setPresent();//sysj\rotary_plant.sysj line: 26, column: 6
    currsigs.addElement(tableAlignedWithSensor_GUI);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread97213(int [] tdone, int [] ends){
        S93717=1;
    tableAlignedWithSensor.setPresent();//sysj\rotary_plant.sysj line: 24, column: 6
    currsigs.addElement(tableAlignedWithSensor);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread97211(int [] tdone, int [] ends){
        S93722=1;
    tableAlignedWithSensor_GUI.setPresent();//sysj\rotary_plant.sysj line: 26, column: 6
    currsigs.addElement(tableAlignedWithSensor_GUI);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread97210(int [] tdone, int [] ends){
        S93717=1;
    tableAlignedWithSensor.setPresent();//sysj\rotary_plant.sysj line: 24, column: 6
    currsigs.addElement(tableAlignedWithSensor);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread97209(int [] tdone, int [] ends){
        switch(S94041){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S93811){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\rotary_plant.sysj line: 21, column: 10
              S93811=1;
              if(!rotaryTableTrigger.getprestatus()){//sysj\rotary_plant.sysj line: 22, column: 20
                shift_1.setPresent();//sysj\rotary_plant.sysj line: 28, column: 4
                currsigs.addElement(shift_1);
                S93811=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S93753=0;
                __start_thread_2 = com.systemj.Timer.getMs();//sysj\rotary_plant.sysj line: 22, column: 41
                S93700=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= 500){//sysj\rotary_plant.sysj line: 22, column: 41
                  ends[2]=2;
                  ;//sysj\rotary_plant.sysj line: 22, column: 41
                  S93753=1;
                  thread97210(tdone,ends);
                  thread97211(tdone,ends);
                  int biggest97212 = 0;
                  if(ends[3]>=biggest97212){
                    biggest97212=ends[3];
                  }
                  if(ends[4]>=biggest97212){
                    biggest97212=ends[4];
                  }
                  if(biggest97212 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S93700=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
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
            if(!rotaryTableTrigger.getprestatus()){//sysj\rotary_plant.sysj line: 22, column: 20
              shift_1.setPresent();//sysj\rotary_plant.sysj line: 28, column: 4
              currsigs.addElement(shift_1);
              S93811=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              switch(S93753){
                case 0 : 
                  switch(S93700){
                    case 0 : 
                      S93700=0;
                      if(com.systemj.Timer.getMs() - __start_thread_2 >= 500){//sysj\rotary_plant.sysj line: 22, column: 41
                        ends[2]=2;
                        ;//sysj\rotary_plant.sysj line: 22, column: 41
                        S93753=1;
                        thread97213(tdone,ends);
                        thread97214(tdone,ends);
                        int biggest97215 = 0;
                        if(ends[3]>=biggest97215){
                          biggest97215=ends[3];
                        }
                        if(ends[4]>=biggest97215){
                          biggest97215=ends[4];
                        }
                        if(biggest97215 == 1){
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        S93700=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 1 : 
                      S93700=1;
                      S93700=0;
                      if(com.systemj.Timer.getMs() - __start_thread_2 >= 500){//sysj\rotary_plant.sysj line: 22, column: 41
                        ends[2]=2;
                        ;//sysj\rotary_plant.sysj line: 22, column: 41
                        S93753=1;
                        thread97216(tdone,ends);
                        thread97217(tdone,ends);
                        int biggest97218 = 0;
                        if(ends[3]>=biggest97218){
                          biggest97218=ends[3];
                        }
                        if(ends[4]>=biggest97218){
                          biggest97218=ends[4];
                        }
                        if(biggest97218 == 1){
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        S93700=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  thread97219(tdone,ends);
                  thread97220(tdone,ends);
                  int biggest97221 = 0;
                  if(ends[3]>=biggest97221){
                    biggest97221=ends[3];
                  }
                  if(ends[4]>=biggest97221){
                    biggest97221=ends[4];
                  }
                  if(biggest97221 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  //FINXME code
                  if(biggest97221 == 0){
                    shift_1.setPresent();//sysj\rotary_plant.sysj line: 28, column: 4
                    currsigs.addElement(shift_1);
                    S93811=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 2 : 
            S93811=2;
            S93811=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread97207(int [] tdone, int [] ends){
        S97201=1;
    if(!bottleAtPos1.getprestatus() && !bottleAtPos2.getprestatus() && !bottleAtPos3.getprestatus() && !bottleAtPos4.getprestatus() && !bottleAtPos5.getprestatus()){//sysj\rotary_plant.sysj line: 90, column: 12
      empty.setPresent();//sysj\rotary_plant.sysj line: 91, column: 5
      currsigs.addElement(empty);
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

  public void thread97206(int [] tdone, int [] ends){
        S97193=1;
    rt_thread_5 = new rotaryTable();//sysj\rotary_plant.sysj line: 34, column: 3
    if(shift_1.getprestatus()){//sysj\rotary_plant.sysj line: 36, column: 12
      rt_thread_5.print();//sysj\rotary_plant.sysj line: 37, column: 5
      System.out.println("SHIFTING");//sysj\rotary_plant.sysj line: 38, column: 5
      rt_thread_5.shift();//sysj\rotary_plant.sysj line: 39, column: 5
      rt_thread_5.print();//sysj\rotary_plant.sysj line: 40, column: 5
      if(load.getprestatus()){//sysj\rotary_plant.sysj line: 42, column: 12
        rt_thread_5.print();//sysj\rotary_plant.sysj line: 43, column: 5
        System.out.println("LOADING");//sysj\rotary_plant.sysj line: 44, column: 5
        rt_thread_5.load();//sysj\rotary_plant.sysj line: 45, column: 5
        rt_thread_5.print();//sysj\rotary_plant.sysj line: 46, column: 5
        if(deload.getprestatus()){//sysj\rotary_plant.sysj line: 48, column: 12
          rt_thread_5.print();//sysj\rotary_plant.sysj line: 49, column: 5
          System.out.println("DELOADING");//sysj\rotary_plant.sysj line: 50, column: 5
          rt_thread_5.deload();//sysj\rotary_plant.sysj line: 51, column: 5
          rt_thread_5.print();//sysj\rotary_plant.sysj line: 52, column: 5
          bottleLeftPos5.setPresent();//sysj\rotary_plant.sysj line: 53, column: 5
          currsigs.addElement(bottleLeftPos5);
          bottleLeftPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 54, column: 5
          currsigs.addElement(bottleLeftPos5_GUI);
          if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 59, column: 8
            bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 60, column: 5
            currsigs.addElement(bottleAtPos1);
            bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
            currsigs.addElement(bottleAtPos1c);
            bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
            currsigs.addElement(bottleAtPos1_GUI);
            if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
              bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
              currsigs.addElement(bottleAtPos2);
              bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
              currsigs.addElement(bottleAtPos2_GUI);
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
            else {
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
          }
          else {
            if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
              bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
              currsigs.addElement(bottleAtPos2);
              bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
              currsigs.addElement(bottleAtPos2_GUI);
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
            else {
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
          }
        }
        else {
          if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 59, column: 8
            bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 60, column: 5
            currsigs.addElement(bottleAtPos1);
            bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
            currsigs.addElement(bottleAtPos1c);
            bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
            currsigs.addElement(bottleAtPos1_GUI);
            if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
              bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
              currsigs.addElement(bottleAtPos2);
              bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
              currsigs.addElement(bottleAtPos2_GUI);
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
            else {
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
          }
          else {
            if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
              bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
              currsigs.addElement(bottleAtPos2);
              bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
              currsigs.addElement(bottleAtPos2_GUI);
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
            else {
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
          }
        }
      }
      else {
        if(deload.getprestatus()){//sysj\rotary_plant.sysj line: 48, column: 12
          rt_thread_5.print();//sysj\rotary_plant.sysj line: 49, column: 5
          System.out.println("DELOADING");//sysj\rotary_plant.sysj line: 50, column: 5
          rt_thread_5.deload();//sysj\rotary_plant.sysj line: 51, column: 5
          rt_thread_5.print();//sysj\rotary_plant.sysj line: 52, column: 5
          bottleLeftPos5.setPresent();//sysj\rotary_plant.sysj line: 53, column: 5
          currsigs.addElement(bottleLeftPos5);
          bottleLeftPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 54, column: 5
          currsigs.addElement(bottleLeftPos5_GUI);
          if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 59, column: 8
            bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 60, column: 5
            currsigs.addElement(bottleAtPos1);
            bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
            currsigs.addElement(bottleAtPos1c);
            bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
            currsigs.addElement(bottleAtPos1_GUI);
            if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
              bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
              currsigs.addElement(bottleAtPos2);
              bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
              currsigs.addElement(bottleAtPos2_GUI);
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
            else {
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
          }
          else {
            if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
              bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
              currsigs.addElement(bottleAtPos2);
              bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
              currsigs.addElement(bottleAtPos2_GUI);
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
            else {
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
          }
        }
        else {
          if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 59, column: 8
            bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 60, column: 5
            currsigs.addElement(bottleAtPos1);
            bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
            currsigs.addElement(bottleAtPos1c);
            bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
            currsigs.addElement(bottleAtPos1_GUI);
            if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
              bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
              currsigs.addElement(bottleAtPos2);
              bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
              currsigs.addElement(bottleAtPos2_GUI);
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
            else {
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
          }
          else {
            if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
              bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
              currsigs.addElement(bottleAtPos2);
              bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
              currsigs.addElement(bottleAtPos2_GUI);
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
            else {
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
          }
        }
      }
    }
    else {
      if(load.getprestatus()){//sysj\rotary_plant.sysj line: 42, column: 12
        rt_thread_5.print();//sysj\rotary_plant.sysj line: 43, column: 5
        System.out.println("LOADING");//sysj\rotary_plant.sysj line: 44, column: 5
        rt_thread_5.load();//sysj\rotary_plant.sysj line: 45, column: 5
        rt_thread_5.print();//sysj\rotary_plant.sysj line: 46, column: 5
        if(deload.getprestatus()){//sysj\rotary_plant.sysj line: 48, column: 12
          rt_thread_5.print();//sysj\rotary_plant.sysj line: 49, column: 5
          System.out.println("DELOADING");//sysj\rotary_plant.sysj line: 50, column: 5
          rt_thread_5.deload();//sysj\rotary_plant.sysj line: 51, column: 5
          rt_thread_5.print();//sysj\rotary_plant.sysj line: 52, column: 5
          bottleLeftPos5.setPresent();//sysj\rotary_plant.sysj line: 53, column: 5
          currsigs.addElement(bottleLeftPos5);
          bottleLeftPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 54, column: 5
          currsigs.addElement(bottleLeftPos5_GUI);
          if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 59, column: 8
            bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 60, column: 5
            currsigs.addElement(bottleAtPos1);
            bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
            currsigs.addElement(bottleAtPos1c);
            bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
            currsigs.addElement(bottleAtPos1_GUI);
            if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
              bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
              currsigs.addElement(bottleAtPos2);
              bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
              currsigs.addElement(bottleAtPos2_GUI);
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
            else {
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
          }
          else {
            if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
              bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
              currsigs.addElement(bottleAtPos2);
              bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
              currsigs.addElement(bottleAtPos2_GUI);
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
            else {
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
          }
        }
        else {
          if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 59, column: 8
            bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 60, column: 5
            currsigs.addElement(bottleAtPos1);
            bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
            currsigs.addElement(bottleAtPos1c);
            bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
            currsigs.addElement(bottleAtPos1_GUI);
            if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
              bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
              currsigs.addElement(bottleAtPos2);
              bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
              currsigs.addElement(bottleAtPos2_GUI);
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
            else {
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
          }
          else {
            if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
              bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
              currsigs.addElement(bottleAtPos2);
              bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
              currsigs.addElement(bottleAtPos2_GUI);
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
            else {
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
          }
        }
      }
      else {
        if(deload.getprestatus()){//sysj\rotary_plant.sysj line: 48, column: 12
          rt_thread_5.print();//sysj\rotary_plant.sysj line: 49, column: 5
          System.out.println("DELOADING");//sysj\rotary_plant.sysj line: 50, column: 5
          rt_thread_5.deload();//sysj\rotary_plant.sysj line: 51, column: 5
          rt_thread_5.print();//sysj\rotary_plant.sysj line: 52, column: 5
          bottleLeftPos5.setPresent();//sysj\rotary_plant.sysj line: 53, column: 5
          currsigs.addElement(bottleLeftPos5);
          bottleLeftPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 54, column: 5
          currsigs.addElement(bottleLeftPos5_GUI);
          if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 59, column: 8
            bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 60, column: 5
            currsigs.addElement(bottleAtPos1);
            bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
            currsigs.addElement(bottleAtPos1c);
            bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
            currsigs.addElement(bottleAtPos1_GUI);
            if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
              bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
              currsigs.addElement(bottleAtPos2);
              bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
              currsigs.addElement(bottleAtPos2_GUI);
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
            else {
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
          }
          else {
            if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
              bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
              currsigs.addElement(bottleAtPos2);
              bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
              currsigs.addElement(bottleAtPos2_GUI);
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
            else {
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
          }
        }
        else {
          if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 59, column: 8
            bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 60, column: 5
            currsigs.addElement(bottleAtPos1);
            bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
            currsigs.addElement(bottleAtPos1c);
            bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
            currsigs.addElement(bottleAtPos1_GUI);
            if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
              bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
              currsigs.addElement(bottleAtPos2);
              bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
              currsigs.addElement(bottleAtPos2_GUI);
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
            else {
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
          }
          else {
            if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 8
              bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 5
              currsigs.addElement(bottleAtPos2);
              bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
              currsigs.addElement(bottleAtPos2_GUI);
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
            else {
              if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 70, column: 8
                bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 71, column: 5
                currsigs.addElement(bottleAtPos3);
                bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                currsigs.addElement(bottleAtPos3_GUI);
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 75, column: 8
                  bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 76, column: 5
                  currsigs.addElement(bottleAtPos4);
                  bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                  currsigs.addElement(bottleAtPos4_GUI);
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
                else {
                  if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 80, column: 8
                    bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 81, column: 5
                    currsigs.addElement(bottleAtPos5);
                    bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                    currsigs.addElement(bottleAtPos5_GUI);
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
            }
          }
        }
      }
    }
  }

  public void thread97205(int [] tdone, int [] ends){
        S94041=1;
    S93811=0;
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
      switch(S97203){
        case 0 : 
          S97203=0;
          break RUN;
        
        case 1 : 
          S97203=2;
          S97203=2;
          shift_1.setClear();//sysj\rotary_plant.sysj line: 18, column: 2
          thread97205(tdone,ends);
          thread97206(tdone,ends);
          thread97207(tdone,ends);
          int biggest97208 = 0;
          if(ends[2]>=biggest97208){
            biggest97208=ends[2];
          }
          if(ends[5]>=biggest97208){
            biggest97208=ends[5];
          }
          if(ends[6]>=biggest97208){
            biggest97208=ends[6];
          }
          if(biggest97208 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          shift_1.setClear();//sysj\rotary_plant.sysj line: 18, column: 2
          thread97209(tdone,ends);
          thread97222(tdone,ends);
          thread97223(tdone,ends);
          int biggest97224 = 0;
          if(ends[2]>=biggest97224){
            biggest97224=ends[2];
          }
          if(ends[5]>=biggest97224){
            biggest97224=ends[5];
          }
          if(ends[6]>=biggest97224){
            biggest97224=ends[6];
          }
          if(biggest97224 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest97224 == 0){
            S97203=0;
            active[1]=0;
            ends[1]=0;
            S97203=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    shift_1 = new Signal();
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
          rotaryTableTrigger.gethook();
          load.gethook();
          deload.gethook();
          df = true;
        }
        runClockDomain();
      }
      rotaryTableTrigger.setpreclear();
      load.setpreclear();
      deload.setpreclear();
      tableAlignedWithSensor.setpreclear();
      bottleAtPos1.setpreclear();
      bottleAtPos1c.setpreclear();
      bottleAtPos2.setpreclear();
      bottleAtPos3.setpreclear();
      bottleAtPos4.setpreclear();
      bottleAtPos5.setpreclear();
      bottleLeftPos5.setpreclear();
      tableAlignedWithSensor_GUI.setpreclear();
      bottleAtPos1_GUI.setpreclear();
      bottleAtPos2_GUI.setpreclear();
      bottleAtPos3_GUI.setpreclear();
      bottleAtPos4_GUI.setpreclear();
      bottleAtPos5_GUI.setpreclear();
      bottleLeftPos5_GUI.setpreclear();
      empty.setpreclear();
      shift_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = rotaryTableTrigger.getStatus() ? rotaryTableTrigger.setprepresent() : rotaryTableTrigger.setpreclear();
      rotaryTableTrigger.setpreval(rotaryTableTrigger.getValue());
      rotaryTableTrigger.setClear();
      dummyint = load.getStatus() ? load.setprepresent() : load.setpreclear();
      load.setpreval(load.getValue());
      load.setClear();
      dummyint = deload.getStatus() ? deload.setprepresent() : deload.setpreclear();
      deload.setpreval(deload.getValue());
      deload.setClear();
      tableAlignedWithSensor.sethook();
      tableAlignedWithSensor.setClear();
      bottleAtPos1.sethook();
      bottleAtPos1.setClear();
      bottleAtPos1c.sethook();
      bottleAtPos1c.setClear();
      bottleAtPos2.sethook();
      bottleAtPos2.setClear();
      bottleAtPos3.sethook();
      bottleAtPos3.setClear();
      bottleAtPos4.sethook();
      bottleAtPos4.setClear();
      bottleAtPos5.sethook();
      bottleAtPos5.setClear();
      bottleLeftPos5.sethook();
      bottleLeftPos5.setClear();
      tableAlignedWithSensor_GUI.sethook();
      tableAlignedWithSensor_GUI.setClear();
      bottleAtPos1_GUI.sethook();
      bottleAtPos1_GUI.setClear();
      bottleAtPos2_GUI.sethook();
      bottleAtPos2_GUI.setClear();
      bottleAtPos3_GUI.sethook();
      bottleAtPos3_GUI.setClear();
      bottleAtPos4_GUI.sethook();
      bottleAtPos4_GUI.setClear();
      bottleAtPos5_GUI.sethook();
      bottleAtPos5_GUI.setClear();
      bottleLeftPos5_GUI.sethook();
      bottleLeftPos5_GUI.setClear();
      empty.sethook();
      empty.setClear();
      shift_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        rotaryTableTrigger.gethook();
        load.gethook();
        deload.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
