import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class lidloader_plant extends ClockDomain{
  public lidloader_plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal pusherExtend = new Signal("pusherExtend", Signal.INPUT);
  public Signal vacOn = new Signal("vacOn", Signal.INPUT);
  public Signal armSource = new Signal("armSource", Signal.INPUT);
  public Signal armDest = new Signal("armDest", Signal.INPUT);
  public Signal refill = new Signal("refill", Signal.INPUT);
  public Signal pusherRetracted = new Signal("pusherRetracted", Signal.OUTPUT);
  public Signal pusherExtended = new Signal("pusherExtended", Signal.OUTPUT);
  public Signal WPgripped = new Signal("WPgripped", Signal.OUTPUT);
  public Signal armAtSource = new Signal("armAtSource", Signal.OUTPUT);
  public Signal armAtDest = new Signal("armAtDest", Signal.OUTPUT);
  public Signal empty = new Signal("empty", Signal.OUTPUT);
  public Signal pusherRetracted_GUI = new Signal("pusherRetracted_GUI", Signal.OUTPUT);
  public Signal pusherExtended_GUI = new Signal("pusherExtended_GUI", Signal.OUTPUT);
  public Signal WPgripped_GUI = new Signal("WPgripped_GUI", Signal.OUTPUT);
  public Signal armAtSource_GUI = new Signal("armAtSource_GUI", Signal.OUTPUT);
  public Signal armAtDest_GUI = new Signal("armAtDest_GUI", Signal.OUTPUT);
  public Signal empty_GUI = new Signal("empty_GUI", Signal.OUTPUT);
  private Signal capDec_1;
  private Signal capPos_1;
  private int capcount_thread_6;//sysj\lidloader_plant.sysj line: 79, column: 3
  private int S91464 = 1;
  private int S90891 = 1;
  private int S90863 = 1;
  private int S90932 = 1;
  private int S90904 = 1;
  private int S90976 = 1;
  private int S90946 = 1;
  private int S90941 = 1;
  private int S91044 = 1;
  private int S90998 = 1;
  private int S90980 = 1;
  private int S91106 = 1;
  private int S91156 = 1;
  private int S91114 = 1;
  private int S91122 = 1;
  private int S91130 = 1;
  private int S91138 = 1;
  private int S91146 = 1;
  private int S91154 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread91491(int [] tdone, int [] ends){
        switch(S91154){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj\lidloader_plant.sysj line: 107, column: 24
          empty_GUI.setPresent();//sysj\lidloader_plant.sysj line: 107, column: 31
          currsigs.addElement(empty_GUI);
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

  public void thread91490(int [] tdone, int [] ends){
        switch(S91146){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\lidloader_plant.sysj line: 105, column: 24
          armAtDest_GUI.setPresent();//sysj\lidloader_plant.sysj line: 105, column: 35
          currsigs.addElement(armAtDest_GUI);
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

  public void thread91489(int [] tdone, int [] ends){
        switch(S91138){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\lidloader_plant.sysj line: 103, column: 24
          armAtSource_GUI.setPresent();//sysj\lidloader_plant.sysj line: 103, column: 37
          currsigs.addElement(armAtSource_GUI);
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

  public void thread91488(int [] tdone, int [] ends){
        switch(S91130){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\lidloader_plant.sysj line: 101, column: 24
          WPgripped_GUI.setPresent();//sysj\lidloader_plant.sysj line: 101, column: 35
          currsigs.addElement(WPgripped_GUI);
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
      
    }
  }

  public void thread91487(int [] tdone, int [] ends){
        switch(S91122){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj\lidloader_plant.sysj line: 99, column: 24
          pusherExtended_GUI.setPresent();//sysj\lidloader_plant.sysj line: 99, column: 40
          currsigs.addElement(pusherExtended_GUI);
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
      
    }
  }

  public void thread91486(int [] tdone, int [] ends){
        switch(S91114){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\lidloader_plant.sysj line: 97, column: 24
          pusherRetracted_GUI.setPresent();//sysj\lidloader_plant.sysj line: 97, column: 41
          currsigs.addElement(pusherRetracted_GUI);
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
      
    }
  }

  public void thread91485(int [] tdone, int [] ends){
        switch(S91156){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread91486(tdone,ends);
        thread91487(tdone,ends);
        thread91488(tdone,ends);
        thread91489(tdone,ends);
        thread91490(tdone,ends);
        thread91491(tdone,ends);
        int biggest91492 = 0;
        if(ends[8]>=biggest91492){
          biggest91492=ends[8];
        }
        if(ends[9]>=biggest91492){
          biggest91492=ends[9];
        }
        if(ends[10]>=biggest91492){
          biggest91492=ends[10];
        }
        if(ends[11]>=biggest91492){
          biggest91492=ends[11];
        }
        if(ends[12]>=biggest91492){
          biggest91492=ends[12];
        }
        if(ends[13]>=biggest91492){
          biggest91492=ends[13];
        }
        if(biggest91492 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest91492 == 0){
          S91156=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread91484(int [] tdone, int [] ends){
        switch(S91106){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(capDec_1.getprestatus()){//sysj\lidloader_plant.sysj line: 81, column: 12
          if(capcount_thread_6 > 0) {//sysj\lidloader_plant.sysj line: 82, column: 5
            capcount_thread_6 = capcount_thread_6 - 1;//sysj\lidloader_plant.sysj line: 83, column: 6
          }
          if(refill.getprestatus()){//sysj\lidloader_plant.sysj line: 85, column: 12
            capcount_thread_6 = 5;//sysj\lidloader_plant.sysj line: 86, column: 5
            if(capcount_thread_6 == 0){//sysj\lidloader_plant.sysj line: 89, column: 8
              empty.setPresent();//sysj\lidloader_plant.sysj line: 90, column: 6
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
          else {
            if(capcount_thread_6 == 0){//sysj\lidloader_plant.sysj line: 89, column: 8
              empty.setPresent();//sysj\lidloader_plant.sysj line: 90, column: 6
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
        }
        else {
          if(refill.getprestatus()){//sysj\lidloader_plant.sysj line: 85, column: 12
            capcount_thread_6 = 5;//sysj\lidloader_plant.sysj line: 86, column: 5
            if(capcount_thread_6 == 0){//sysj\lidloader_plant.sysj line: 89, column: 8
              empty.setPresent();//sysj\lidloader_plant.sysj line: 90, column: 6
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
          else {
            if(capcount_thread_6 == 0){//sysj\lidloader_plant.sysj line: 89, column: 8
              empty.setPresent();//sysj\lidloader_plant.sysj line: 90, column: 6
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
        }
        break;
      
    }
  }

  public void thread91483(int [] tdone, int [] ends){
        switch(S91044){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S90998){
          case 0 : 
            if(empty.getprestatus()){//sysj\lidloader_plant.sysj line: 64, column: 10
              S90998=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S90980){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\lidloader_plant.sysj line: 66, column: 13
                    S90980=1;
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
                  if(pusherExtended.getprestatus()){//sysj\lidloader_plant.sysj line: 67, column: 13
                    capPos_1.setPresent();//sysj\lidloader_plant.sysj line: 69, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\lidloader_plant.sysj line: 69, column: 7
                    S90980=2;
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
                
                case 2 : 
                  if(pusherRetracted.getprestatus()){//sysj\lidloader_plant.sysj line: 70, column: 13
                    capDec_1.setPresent();//sysj\lidloader_plant.sysj line: 71, column: 7
                    currsigs.addElement(capDec_1);
                    S90980=0;
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
            break;
          
          case 1 : 
            if(refill.getprestatus()){//sysj\lidloader_plant.sysj line: 74, column: 10
              S90998=0;
              S90980=0;
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
        break;
      
    }
  }

  public void thread91482(int [] tdone, int [] ends){
        switch(S90976){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S90946){
          case 0 : 
            switch(S90941){
              case 0 : 
                if(!vacOn.getprestatus()){//sysj\lidloader_plant.sysj line: 44, column: 12
                  S90941=1;
                  if(armAtSource.getprestatus()){//sysj\lidloader_plant.sysj line: 47, column: 14
                    capPos_1.setPresent();//sysj\lidloader_plant.sysj line: 48, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\lidloader_plant.sysj line: 48, column: 7
                    S90946=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S90946=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  WPgripped.setPresent();//sysj\lidloader_plant.sysj line: 45, column: 7
                  currsigs.addElement(WPgripped);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
              case 1 : 
                S90946=0;
                if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\lidloader_plant.sysj line: 41, column: 12
                  if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\lidloader_plant.sysj line: 42, column: 8
                    capPos_1.setPresent();//sysj\lidloader_plant.sysj line: 43, column: 6
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(0);//sysj\lidloader_plant.sysj line: 43, column: 6
                    S90941=0;
                    WPgripped.setPresent();//sysj\lidloader_plant.sysj line: 45, column: 7
                    currsigs.addElement(WPgripped);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S90946=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  S90946=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S90946=1;
            S90946=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\lidloader_plant.sysj line: 41, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\lidloader_plant.sysj line: 42, column: 8
                capPos_1.setPresent();//sysj\lidloader_plant.sysj line: 43, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\lidloader_plant.sysj line: 43, column: 6
                S90941=0;
                WPgripped.setPresent();//sysj\lidloader_plant.sysj line: 45, column: 7
                currsigs.addElement(WPgripped);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S90946=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              S90946=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread91481(int [] tdone, int [] ends){
        switch(S90932){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S90904){
          case 0 : 
            if(pusherExtend.getprestatus()){//sysj\lidloader_plant.sysj line: 28, column: 10
              S90904=1;
              pusherExtended.setPresent();//sysj\lidloader_plant.sysj line: 33, column: 5
              currsigs.addElement(pusherExtended);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\lidloader_plant.sysj line: 29, column: 5
              currsigs.addElement(pusherRetracted);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!pusherExtend.getprestatus()){//sysj\lidloader_plant.sysj line: 32, column: 10
              S90904=0;
              pusherRetracted.setPresent();//sysj\lidloader_plant.sysj line: 29, column: 5
              currsigs.addElement(pusherRetracted);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\lidloader_plant.sysj line: 33, column: 5
              currsigs.addElement(pusherExtended);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread91480(int [] tdone, int [] ends){
        switch(S90891){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S90863){
          case 0 : 
            if(armSource.getprestatus()){//sysj\lidloader_plant.sysj line: 16, column: 10
              S90863=1;
              armAtSource.setPresent();//sysj\lidloader_plant.sysj line: 21, column: 5
              currsigs.addElement(armAtSource);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtDest.setPresent();//sysj\lidloader_plant.sysj line: 17, column: 5
              currsigs.addElement(armAtDest);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(armDest.getprestatus()){//sysj\lidloader_plant.sysj line: 20, column: 10
              S90863=0;
              armAtDest.setPresent();//sysj\lidloader_plant.sysj line: 17, column: 5
              currsigs.addElement(armAtDest);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtSource.setPresent();//sysj\lidloader_plant.sysj line: 21, column: 5
              currsigs.addElement(armAtSource);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread91477(int [] tdone, int [] ends){
        S91154=1;
    if(empty.getprestatus()){//sysj\lidloader_plant.sysj line: 107, column: 24
      empty_GUI.setPresent();//sysj\lidloader_plant.sysj line: 107, column: 31
      currsigs.addElement(empty_GUI);
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

  public void thread91476(int [] tdone, int [] ends){
        S91146=1;
    if(armAtDest.getprestatus()){//sysj\lidloader_plant.sysj line: 105, column: 24
      armAtDest_GUI.setPresent();//sysj\lidloader_plant.sysj line: 105, column: 35
      currsigs.addElement(armAtDest_GUI);
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

  public void thread91475(int [] tdone, int [] ends){
        S91138=1;
    if(armAtSource.getprestatus()){//sysj\lidloader_plant.sysj line: 103, column: 24
      armAtSource_GUI.setPresent();//sysj\lidloader_plant.sysj line: 103, column: 37
      currsigs.addElement(armAtSource_GUI);
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

  public void thread91474(int [] tdone, int [] ends){
        S91130=1;
    if(WPgripped.getprestatus()){//sysj\lidloader_plant.sysj line: 101, column: 24
      WPgripped_GUI.setPresent();//sysj\lidloader_plant.sysj line: 101, column: 35
      currsigs.addElement(WPgripped_GUI);
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

  public void thread91473(int [] tdone, int [] ends){
        S91122=1;
    if(pusherExtended.getprestatus()){//sysj\lidloader_plant.sysj line: 99, column: 24
      pusherExtended_GUI.setPresent();//sysj\lidloader_plant.sysj line: 99, column: 40
      currsigs.addElement(pusherExtended_GUI);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread91472(int [] tdone, int [] ends){
        S91114=1;
    if(pusherRetracted.getprestatus()){//sysj\lidloader_plant.sysj line: 97, column: 24
      pusherRetracted_GUI.setPresent();//sysj\lidloader_plant.sysj line: 97, column: 41
      currsigs.addElement(pusherRetracted_GUI);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread91471(int [] tdone, int [] ends){
        S91156=1;
    thread91472(tdone,ends);
    thread91473(tdone,ends);
    thread91474(tdone,ends);
    thread91475(tdone,ends);
    thread91476(tdone,ends);
    thread91477(tdone,ends);
    int biggest91478 = 0;
    if(ends[8]>=biggest91478){
      biggest91478=ends[8];
    }
    if(ends[9]>=biggest91478){
      biggest91478=ends[9];
    }
    if(ends[10]>=biggest91478){
      biggest91478=ends[10];
    }
    if(ends[11]>=biggest91478){
      biggest91478=ends[11];
    }
    if(ends[12]>=biggest91478){
      biggest91478=ends[12];
    }
    if(ends[13]>=biggest91478){
      biggest91478=ends[13];
    }
    if(biggest91478 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread91470(int [] tdone, int [] ends){
        S91106=1;
    capcount_thread_6 = 5;//sysj\lidloader_plant.sysj line: 79, column: 3
    if(capDec_1.getprestatus()){//sysj\lidloader_plant.sysj line: 81, column: 12
      if(capcount_thread_6 > 0) {//sysj\lidloader_plant.sysj line: 82, column: 5
        capcount_thread_6 = capcount_thread_6 - 1;//sysj\lidloader_plant.sysj line: 83, column: 6
      }
      if(refill.getprestatus()){//sysj\lidloader_plant.sysj line: 85, column: 12
        capcount_thread_6 = 5;//sysj\lidloader_plant.sysj line: 86, column: 5
        if(capcount_thread_6 == 0){//sysj\lidloader_plant.sysj line: 89, column: 8
          empty.setPresent();//sysj\lidloader_plant.sysj line: 90, column: 6
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
      else {
        if(capcount_thread_6 == 0){//sysj\lidloader_plant.sysj line: 89, column: 8
          empty.setPresent();//sysj\lidloader_plant.sysj line: 90, column: 6
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
    }
    else {
      if(refill.getprestatus()){//sysj\lidloader_plant.sysj line: 85, column: 12
        capcount_thread_6 = 5;//sysj\lidloader_plant.sysj line: 86, column: 5
        if(capcount_thread_6 == 0){//sysj\lidloader_plant.sysj line: 89, column: 8
          empty.setPresent();//sysj\lidloader_plant.sysj line: 90, column: 6
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
      else {
        if(capcount_thread_6 == 0){//sysj\lidloader_plant.sysj line: 89, column: 8
          empty.setPresent();//sysj\lidloader_plant.sysj line: 90, column: 6
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
    }
  }

  public void thread91469(int [] tdone, int [] ends){
        S91044=1;
    S90998=0;
    S90980=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread91468(int [] tdone, int [] ends){
        S90976=1;
    S90946=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\lidloader_plant.sysj line: 41, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\lidloader_plant.sysj line: 42, column: 8
        capPos_1.setPresent();//sysj\lidloader_plant.sysj line: 43, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\lidloader_plant.sysj line: 43, column: 6
        S90941=0;
        WPgripped.setPresent();//sysj\lidloader_plant.sysj line: 45, column: 7
        currsigs.addElement(WPgripped);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S90946=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      S90946=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread91467(int [] tdone, int [] ends){
        S90932=1;
    S90904=0;
    pusherRetracted.setPresent();//sysj\lidloader_plant.sysj line: 29, column: 5
    currsigs.addElement(pusherRetracted);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread91466(int [] tdone, int [] ends){
        S90891=1;
    S90863=0;
    armAtDest.setPresent();//sysj\lidloader_plant.sysj line: 17, column: 5
    currsigs.addElement(armAtDest);
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
      switch(S91464){
        case 0 : 
          S91464=0;
          break RUN;
        
        case 1 : 
          S91464=2;
          S91464=2;
          capDec_1.setClear();//sysj\lidloader_plant.sysj line: 11, column: 2
          capPos_1.setClear();//sysj\lidloader_plant.sysj line: 12, column: 2
          capPos_1.setPresent();//sysj\lidloader_plant.sysj line: 13, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\lidloader_plant.sysj line: 13, column: 2
          thread91466(tdone,ends);
          thread91467(tdone,ends);
          thread91468(tdone,ends);
          thread91469(tdone,ends);
          thread91470(tdone,ends);
          thread91471(tdone,ends);
          int biggest91479 = 0;
          if(ends[2]>=biggest91479){
            biggest91479=ends[2];
          }
          if(ends[3]>=biggest91479){
            biggest91479=ends[3];
          }
          if(ends[4]>=biggest91479){
            biggest91479=ends[4];
          }
          if(ends[5]>=biggest91479){
            biggest91479=ends[5];
          }
          if(ends[6]>=biggest91479){
            biggest91479=ends[6];
          }
          if(ends[7]>=biggest91479){
            biggest91479=ends[7];
          }
          if(biggest91479 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\lidloader_plant.sysj line: 11, column: 2
          capPos_1.setClear();//sysj\lidloader_plant.sysj line: 12, column: 2
          thread91480(tdone,ends);
          thread91481(tdone,ends);
          thread91482(tdone,ends);
          thread91483(tdone,ends);
          thread91484(tdone,ends);
          thread91485(tdone,ends);
          int biggest91493 = 0;
          if(ends[2]>=biggest91493){
            biggest91493=ends[2];
          }
          if(ends[3]>=biggest91493){
            biggest91493=ends[3];
          }
          if(ends[4]>=biggest91493){
            biggest91493=ends[4];
          }
          if(ends[5]>=biggest91493){
            biggest91493=ends[5];
          }
          if(ends[6]>=biggest91493){
            biggest91493=ends[6];
          }
          if(ends[7]>=biggest91493){
            biggest91493=ends[7];
          }
          if(biggest91493 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest91493 == 0){
            S91464=0;
            active[1]=0;
            ends[1]=0;
            S91464=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    capDec_1 = new Signal();
    capPos_1 = new Signal();
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
          pusherExtend.gethook();
          vacOn.gethook();
          armSource.gethook();
          armDest.gethook();
          refill.gethook();
          df = true;
        }
        runClockDomain();
      }
      pusherExtend.setpreclear();
      vacOn.setpreclear();
      armSource.setpreclear();
      armDest.setpreclear();
      refill.setpreclear();
      pusherRetracted.setpreclear();
      pusherExtended.setpreclear();
      WPgripped.setpreclear();
      armAtSource.setpreclear();
      armAtDest.setpreclear();
      empty.setpreclear();
      pusherRetracted_GUI.setpreclear();
      pusherExtended_GUI.setpreclear();
      WPgripped_GUI.setpreclear();
      armAtSource_GUI.setpreclear();
      armAtDest_GUI.setpreclear();
      empty_GUI.setpreclear();
      capDec_1.setpreclear();
      capPos_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = pusherExtend.getStatus() ? pusherExtend.setprepresent() : pusherExtend.setpreclear();
      pusherExtend.setpreval(pusherExtend.getValue());
      pusherExtend.setClear();
      dummyint = vacOn.getStatus() ? vacOn.setprepresent() : vacOn.setpreclear();
      vacOn.setpreval(vacOn.getValue());
      vacOn.setClear();
      dummyint = armSource.getStatus() ? armSource.setprepresent() : armSource.setpreclear();
      armSource.setpreval(armSource.getValue());
      armSource.setClear();
      dummyint = armDest.getStatus() ? armDest.setprepresent() : armDest.setpreclear();
      armDest.setpreval(armDest.getValue());
      armDest.setClear();
      dummyint = refill.getStatus() ? refill.setprepresent() : refill.setpreclear();
      refill.setpreval(refill.getValue());
      refill.setClear();
      pusherRetracted.sethook();
      pusherRetracted.setClear();
      pusherExtended.sethook();
      pusherExtended.setClear();
      WPgripped.sethook();
      WPgripped.setClear();
      armAtSource.sethook();
      armAtSource.setClear();
      armAtDest.sethook();
      armAtDest.setClear();
      empty.sethook();
      empty.setClear();
      pusherRetracted_GUI.sethook();
      pusherRetracted_GUI.setClear();
      pusherExtended_GUI.sethook();
      pusherExtended_GUI.setClear();
      WPgripped_GUI.sethook();
      WPgripped_GUI.setClear();
      armAtSource_GUI.sethook();
      armAtSource_GUI.setClear();
      armAtDest_GUI.sethook();
      armAtDest_GUI.setClear();
      empty_GUI.sethook();
      empty_GUI.setClear();
      capDec_1.setClear();
      capPos_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        pusherExtend.gethook();
        vacOn.gethook();
        armSource.gethook();
        armDest.gethook();
        refill.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
