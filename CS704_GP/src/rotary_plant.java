import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import rotaryTable.*;//sysj\rotary_plant.sysj line: 1, column: 1

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
  private Signal shift_1;
  private rotaryTable rt_thread_5;//sysj\rotary_plant.sysj line: 36, column: 3
  private long __start_thread_2;//sysj\rotary_plant.sysj line: 20, column: 41
  private int S136121 = 1;
  private int S132949 = 1;
  private int S132491 = 1;
  private int S132433 = 1;
  private int S132380 = 1;
  private int S132397 = 1;
  private int S132402 = 1;
  private int S136119 = 1;
  private int S132955 = 1;
  
  private int[] ends = new int[6];
  private int[] tdone = new int[6];
  
  public void thread136139(int [] tdone, int [] ends){
        switch(S136119){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S132955){
          case 0 : 
            if(load.getprestatus() || deload.getprestatus() || shift_1.getprestatus()){//sysj\rotary_plant.sysj line: 38, column: 10
              if(shift_1.getprestatus()){//sysj\rotary_plant.sysj line: 39, column: 12
                rt_thread_5.print();//sysj\rotary_plant.sysj line: 40, column: 5
                System.out.println("SHIFTING");//sysj\rotary_plant.sysj line: 41, column: 5
                rt_thread_5.shift();//sysj\rotary_plant.sysj line: 42, column: 5
                rt_thread_5.print();//sysj\rotary_plant.sysj line: 43, column: 5
                if(load.getprestatus()){//sysj\rotary_plant.sysj line: 45, column: 12
                  rt_thread_5.print();//sysj\rotary_plant.sysj line: 46, column: 5
                  System.out.println("LOADING");//sysj\rotary_plant.sysj line: 47, column: 5
                  rt_thread_5.load();//sysj\rotary_plant.sysj line: 48, column: 5
                  rt_thread_5.print();//sysj\rotary_plant.sysj line: 49, column: 5
                  if(deload.getprestatus()){//sysj\rotary_plant.sysj line: 51, column: 12
                    rt_thread_5.print();//sysj\rotary_plant.sysj line: 52, column: 5
                    System.out.println("DELOADING");//sysj\rotary_plant.sysj line: 53, column: 5
                    rt_thread_5.deload();//sysj\rotary_plant.sysj line: 54, column: 5
                    rt_thread_5.print();//sysj\rotary_plant.sysj line: 55, column: 5
                    bottleLeftPos5.setPresent();//sysj\rotary_plant.sysj line: 56, column: 5
                    currsigs.addElement(bottleLeftPos5);
                    bottleLeftPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 57, column: 5
                    currsigs.addElement(bottleLeftPos5_GUI);
                    if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 60, column: 8
                      bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
                      currsigs.addElement(bottleAtPos1);
                      bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
                      currsigs.addElement(bottleAtPos1c);
                      bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 63, column: 5
                      currsigs.addElement(bottleAtPos1_GUI);
                      if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 66, column: 8
                        bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                        currsigs.addElement(bottleAtPos2);
                        bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 68, column: 5
                        currsigs.addElement(bottleAtPos2_GUI);
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 66, column: 8
                        bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                        currsigs.addElement(bottleAtPos2);
                        bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 68, column: 5
                        currsigs.addElement(bottleAtPos2_GUI);
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
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
                    if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 60, column: 8
                      bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
                      currsigs.addElement(bottleAtPos1);
                      bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
                      currsigs.addElement(bottleAtPos1c);
                      bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 63, column: 5
                      currsigs.addElement(bottleAtPos1_GUI);
                      if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 66, column: 8
                        bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                        currsigs.addElement(bottleAtPos2);
                        bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 68, column: 5
                        currsigs.addElement(bottleAtPos2_GUI);
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 66, column: 8
                        bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                        currsigs.addElement(bottleAtPos2);
                        bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 68, column: 5
                        currsigs.addElement(bottleAtPos2_GUI);
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
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
                  if(deload.getprestatus()){//sysj\rotary_plant.sysj line: 51, column: 12
                    rt_thread_5.print();//sysj\rotary_plant.sysj line: 52, column: 5
                    System.out.println("DELOADING");//sysj\rotary_plant.sysj line: 53, column: 5
                    rt_thread_5.deload();//sysj\rotary_plant.sysj line: 54, column: 5
                    rt_thread_5.print();//sysj\rotary_plant.sysj line: 55, column: 5
                    bottleLeftPos5.setPresent();//sysj\rotary_plant.sysj line: 56, column: 5
                    currsigs.addElement(bottleLeftPos5);
                    bottleLeftPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 57, column: 5
                    currsigs.addElement(bottleLeftPos5_GUI);
                    if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 60, column: 8
                      bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
                      currsigs.addElement(bottleAtPos1);
                      bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
                      currsigs.addElement(bottleAtPos1c);
                      bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 63, column: 5
                      currsigs.addElement(bottleAtPos1_GUI);
                      if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 66, column: 8
                        bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                        currsigs.addElement(bottleAtPos2);
                        bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 68, column: 5
                        currsigs.addElement(bottleAtPos2_GUI);
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 66, column: 8
                        bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                        currsigs.addElement(bottleAtPos2);
                        bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 68, column: 5
                        currsigs.addElement(bottleAtPos2_GUI);
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
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
                    if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 60, column: 8
                      bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
                      currsigs.addElement(bottleAtPos1);
                      bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
                      currsigs.addElement(bottleAtPos1c);
                      bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 63, column: 5
                      currsigs.addElement(bottleAtPos1_GUI);
                      if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 66, column: 8
                        bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                        currsigs.addElement(bottleAtPos2);
                        bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 68, column: 5
                        currsigs.addElement(bottleAtPos2_GUI);
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 66, column: 8
                        bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                        currsigs.addElement(bottleAtPos2);
                        bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 68, column: 5
                        currsigs.addElement(bottleAtPos2_GUI);
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
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
                if(load.getprestatus()){//sysj\rotary_plant.sysj line: 45, column: 12
                  rt_thread_5.print();//sysj\rotary_plant.sysj line: 46, column: 5
                  System.out.println("LOADING");//sysj\rotary_plant.sysj line: 47, column: 5
                  rt_thread_5.load();//sysj\rotary_plant.sysj line: 48, column: 5
                  rt_thread_5.print();//sysj\rotary_plant.sysj line: 49, column: 5
                  if(deload.getprestatus()){//sysj\rotary_plant.sysj line: 51, column: 12
                    rt_thread_5.print();//sysj\rotary_plant.sysj line: 52, column: 5
                    System.out.println("DELOADING");//sysj\rotary_plant.sysj line: 53, column: 5
                    rt_thread_5.deload();//sysj\rotary_plant.sysj line: 54, column: 5
                    rt_thread_5.print();//sysj\rotary_plant.sysj line: 55, column: 5
                    bottleLeftPos5.setPresent();//sysj\rotary_plant.sysj line: 56, column: 5
                    currsigs.addElement(bottleLeftPos5);
                    bottleLeftPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 57, column: 5
                    currsigs.addElement(bottleLeftPos5_GUI);
                    if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 60, column: 8
                      bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
                      currsigs.addElement(bottleAtPos1);
                      bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
                      currsigs.addElement(bottleAtPos1c);
                      bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 63, column: 5
                      currsigs.addElement(bottleAtPos1_GUI);
                      if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 66, column: 8
                        bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                        currsigs.addElement(bottleAtPos2);
                        bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 68, column: 5
                        currsigs.addElement(bottleAtPos2_GUI);
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 66, column: 8
                        bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                        currsigs.addElement(bottleAtPos2);
                        bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 68, column: 5
                        currsigs.addElement(bottleAtPos2_GUI);
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
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
                    if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 60, column: 8
                      bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
                      currsigs.addElement(bottleAtPos1);
                      bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
                      currsigs.addElement(bottleAtPos1c);
                      bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 63, column: 5
                      currsigs.addElement(bottleAtPos1_GUI);
                      if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 66, column: 8
                        bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                        currsigs.addElement(bottleAtPos2);
                        bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 68, column: 5
                        currsigs.addElement(bottleAtPos2_GUI);
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 66, column: 8
                        bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                        currsigs.addElement(bottleAtPos2);
                        bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 68, column: 5
                        currsigs.addElement(bottleAtPos2_GUI);
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
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
                  if(deload.getprestatus()){//sysj\rotary_plant.sysj line: 51, column: 12
                    rt_thread_5.print();//sysj\rotary_plant.sysj line: 52, column: 5
                    System.out.println("DELOADING");//sysj\rotary_plant.sysj line: 53, column: 5
                    rt_thread_5.deload();//sysj\rotary_plant.sysj line: 54, column: 5
                    rt_thread_5.print();//sysj\rotary_plant.sysj line: 55, column: 5
                    bottleLeftPos5.setPresent();//sysj\rotary_plant.sysj line: 56, column: 5
                    currsigs.addElement(bottleLeftPos5);
                    bottleLeftPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 57, column: 5
                    currsigs.addElement(bottleLeftPos5_GUI);
                    if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 60, column: 8
                      bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
                      currsigs.addElement(bottleAtPos1);
                      bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
                      currsigs.addElement(bottleAtPos1c);
                      bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 63, column: 5
                      currsigs.addElement(bottleAtPos1_GUI);
                      if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 66, column: 8
                        bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                        currsigs.addElement(bottleAtPos2);
                        bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 68, column: 5
                        currsigs.addElement(bottleAtPos2_GUI);
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 66, column: 8
                        bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                        currsigs.addElement(bottleAtPos2);
                        bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 68, column: 5
                        currsigs.addElement(bottleAtPos2_GUI);
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
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
                    if(rt_thread_5.index[0] == true){//sysj\rotary_plant.sysj line: 60, column: 8
                      bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 61, column: 5
                      currsigs.addElement(bottleAtPos1);
                      bottleAtPos1c.setPresent();//sysj\rotary_plant.sysj line: 62, column: 5
                      currsigs.addElement(bottleAtPos1c);
                      bottleAtPos1_GUI.setPresent();//sysj\rotary_plant.sysj line: 63, column: 5
                      currsigs.addElement(bottleAtPos1_GUI);
                      if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 66, column: 8
                        bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                        currsigs.addElement(bottleAtPos2);
                        bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 68, column: 5
                        currsigs.addElement(bottleAtPos2_GUI);
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                    }
                    else {
                      if(rt_thread_5.index[1] == true){//sysj\rotary_plant.sysj line: 66, column: 8
                        bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 67, column: 5
                        currsigs.addElement(bottleAtPos2);
                        bottleAtPos2_GUI.setPresent();//sysj\rotary_plant.sysj line: 68, column: 5
                        currsigs.addElement(bottleAtPos2_GUI);
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                      }
                      else {
                        if(rt_thread_5.index[2] == true){//sysj\rotary_plant.sysj line: 71, column: 8
                          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 72, column: 5
                          currsigs.addElement(bottleAtPos3);
                          bottleAtPos3_GUI.setPresent();//sysj\rotary_plant.sysj line: 73, column: 5
                          currsigs.addElement(bottleAtPos3_GUI);
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                        }
                        else {
                          if(rt_thread_5.index[3] == true){//sysj\rotary_plant.sysj line: 76, column: 8
                            bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 77, column: 5
                            currsigs.addElement(bottleAtPos4);
                            bottleAtPos4_GUI.setPresent();//sysj\rotary_plant.sysj line: 78, column: 5
                            currsigs.addElement(bottleAtPos4_GUI);
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                          }
                          else {
                            if(rt_thread_5.index[4] == true){//sysj\rotary_plant.sysj line: 81, column: 8
                              bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 82, column: 5
                              currsigs.addElement(bottleAtPos5);
                              bottleAtPos5_GUI.setPresent();//sysj\rotary_plant.sysj line: 83, column: 5
                              currsigs.addElement(bottleAtPos5_GUI);
                              S132955=1;
                              active[5]=1;
                              ends[5]=1;
                              tdone[5]=1;
                            }
                            else {
                              S132955=1;
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
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            S132955=1;
            S132955=0;
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread136137(int [] tdone, int [] ends){
        switch(S132402){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        tableAlignedWithSensor_GUI.setPresent();//sysj\rotary_plant.sysj line: 27, column: 6
        currsigs.addElement(tableAlignedWithSensor_GUI);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
        break;
      
    }
  }

  public void thread136136(int [] tdone, int [] ends){
        switch(S132397){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        tableAlignedWithSensor.setPresent();//sysj\rotary_plant.sysj line: 23, column: 6
        currsigs.addElement(tableAlignedWithSensor);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread136134(int [] tdone, int [] ends){
        S132402=1;
    tableAlignedWithSensor_GUI.setPresent();//sysj\rotary_plant.sysj line: 27, column: 6
    currsigs.addElement(tableAlignedWithSensor_GUI);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread136133(int [] tdone, int [] ends){
        S132397=1;
    tableAlignedWithSensor.setPresent();//sysj\rotary_plant.sysj line: 23, column: 6
    currsigs.addElement(tableAlignedWithSensor);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread136131(int [] tdone, int [] ends){
        S132402=1;
    tableAlignedWithSensor_GUI.setPresent();//sysj\rotary_plant.sysj line: 27, column: 6
    currsigs.addElement(tableAlignedWithSensor_GUI);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread136130(int [] tdone, int [] ends){
        S132397=1;
    tableAlignedWithSensor.setPresent();//sysj\rotary_plant.sysj line: 23, column: 6
    currsigs.addElement(tableAlignedWithSensor);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread136128(int [] tdone, int [] ends){
        S132402=1;
    tableAlignedWithSensor_GUI.setPresent();//sysj\rotary_plant.sysj line: 27, column: 6
    currsigs.addElement(tableAlignedWithSensor_GUI);
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread136127(int [] tdone, int [] ends){
        S132397=1;
    tableAlignedWithSensor.setPresent();//sysj\rotary_plant.sysj line: 23, column: 6
    currsigs.addElement(tableAlignedWithSensor);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread136126(int [] tdone, int [] ends){
        switch(S132949){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S132491){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\rotary_plant.sysj line: 19, column: 10
              S132491=1;
              if(!rotaryTableTrigger.getprestatus()){//sysj\rotary_plant.sysj line: 20, column: 20
                shift_1.setPresent();//sysj\rotary_plant.sysj line: 31, column: 4
                currsigs.addElement(shift_1);
                S132491=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S132433=0;
                __start_thread_2 = com.systemj.Timer.getMs();//sysj\rotary_plant.sysj line: 20, column: 41
                S132380=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= 500){//sysj\rotary_plant.sysj line: 20, column: 41
                  ends[2]=2;
                  ;//sysj\rotary_plant.sysj line: 20, column: 41
                  S132433=1;
                  thread136127(tdone,ends);
                  thread136128(tdone,ends);
                  int biggest136129 = 0;
                  if(ends[3]>=biggest136129){
                    biggest136129=ends[3];
                  }
                  if(ends[4]>=biggest136129){
                    biggest136129=ends[4];
                  }
                  if(biggest136129 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  S132380=1;
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
            if(!rotaryTableTrigger.getprestatus()){//sysj\rotary_plant.sysj line: 20, column: 20
              shift_1.setPresent();//sysj\rotary_plant.sysj line: 31, column: 4
              currsigs.addElement(shift_1);
              S132491=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              switch(S132433){
                case 0 : 
                  switch(S132380){
                    case 0 : 
                      S132380=0;
                      if(com.systemj.Timer.getMs() - __start_thread_2 >= 500){//sysj\rotary_plant.sysj line: 20, column: 41
                        ends[2]=2;
                        ;//sysj\rotary_plant.sysj line: 20, column: 41
                        S132433=1;
                        thread136130(tdone,ends);
                        thread136131(tdone,ends);
                        int biggest136132 = 0;
                        if(ends[3]>=biggest136132){
                          biggest136132=ends[3];
                        }
                        if(ends[4]>=biggest136132){
                          biggest136132=ends[4];
                        }
                        if(biggest136132 == 1){
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        S132380=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 1 : 
                      S132380=1;
                      S132380=0;
                      if(com.systemj.Timer.getMs() - __start_thread_2 >= 500){//sysj\rotary_plant.sysj line: 20, column: 41
                        ends[2]=2;
                        ;//sysj\rotary_plant.sysj line: 20, column: 41
                        S132433=1;
                        thread136133(tdone,ends);
                        thread136134(tdone,ends);
                        int biggest136135 = 0;
                        if(ends[3]>=biggest136135){
                          biggest136135=ends[3];
                        }
                        if(ends[4]>=biggest136135){
                          biggest136135=ends[4];
                        }
                        if(biggest136135 == 1){
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        S132380=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  thread136136(tdone,ends);
                  thread136137(tdone,ends);
                  int biggest136138 = 0;
                  if(ends[3]>=biggest136138){
                    biggest136138=ends[3];
                  }
                  if(ends[4]>=biggest136138){
                    biggest136138=ends[4];
                  }
                  if(biggest136138 == 1){
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  //FINXME code
                  if(biggest136138 == 0){
                    shift_1.setPresent();//sysj\rotary_plant.sysj line: 31, column: 4
                    currsigs.addElement(shift_1);
                    S132491=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread136124(int [] tdone, int [] ends){
        S136119=1;
    rt_thread_5 = new rotaryTable();//sysj\rotary_plant.sysj line: 36, column: 3
    S132955=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread136123(int [] tdone, int [] ends){
        S132949=1;
    S132491=0;
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
      switch(S136121){
        case 0 : 
          S136121=0;
          break RUN;
        
        case 1 : 
          S136121=2;
          S136121=2;
          shift_1.setClear();//sysj\rotary_plant.sysj line: 16, column: 2
          thread136123(tdone,ends);
          thread136124(tdone,ends);
          int biggest136125 = 0;
          if(ends[2]>=biggest136125){
            biggest136125=ends[2];
          }
          if(ends[5]>=biggest136125){
            biggest136125=ends[5];
          }
          if(biggest136125 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          shift_1.setClear();//sysj\rotary_plant.sysj line: 16, column: 2
          thread136126(tdone,ends);
          thread136139(tdone,ends);
          int biggest136140 = 0;
          if(ends[2]>=biggest136140){
            biggest136140=ends[2];
          }
          if(ends[5]>=biggest136140){
            biggest136140=ends[5];
          }
          if(biggest136140 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest136140 == 0){
            S136121=0;
            active[1]=0;
            ends[1]=0;
            S136121=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0};
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
