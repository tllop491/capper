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
  private int capcount_thread_6;//sysj\lidloader_plant.sysj line: 85, column: 3
  private int S129685 = 1;
  private int S129112 = 1;
  private int S129084 = 1;
  private int S129153 = 1;
  private int S129125 = 1;
  private int S129197 = 1;
  private int S129167 = 1;
  private int S129162 = 1;
  private int S129265 = 1;
  private int S129219 = 1;
  private int S129201 = 1;
  private int S129327 = 1;
  private int S129377 = 1;
  private int S129335 = 1;
  private int S129343 = 1;
  private int S129351 = 1;
  private int S129359 = 1;
  private int S129367 = 1;
  private int S129375 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread129712(int [] tdone, int [] ends){
        switch(S129375){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(empty.getprestatus()){//sysj\lidloader_plant.sysj line: 113, column: 24
          empty_GUI.setPresent();//sysj\lidloader_plant.sysj line: 113, column: 31
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

  public void thread129711(int [] tdone, int [] ends){
        switch(S129367){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(armAtDest.getprestatus()){//sysj\lidloader_plant.sysj line: 111, column: 24
          armAtDest_GUI.setPresent();//sysj\lidloader_plant.sysj line: 111, column: 35
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

  public void thread129710(int [] tdone, int [] ends){
        switch(S129359){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(armAtSource.getprestatus()){//sysj\lidloader_plant.sysj line: 109, column: 24
          armAtSource_GUI.setPresent();//sysj\lidloader_plant.sysj line: 109, column: 37
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

  public void thread129709(int [] tdone, int [] ends){
        switch(S129351){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(WPgripped.getprestatus()){//sysj\lidloader_plant.sysj line: 107, column: 24
          WPgripped_GUI.setPresent();//sysj\lidloader_plant.sysj line: 107, column: 35
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

  public void thread129708(int [] tdone, int [] ends){
        switch(S129343){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(pusherExtended.getprestatus()){//sysj\lidloader_plant.sysj line: 105, column: 24
          pusherExtended_GUI.setPresent();//sysj\lidloader_plant.sysj line: 105, column: 40
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

  public void thread129707(int [] tdone, int [] ends){
        switch(S129335){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(pusherRetracted.getprestatus()){//sysj\lidloader_plant.sysj line: 103, column: 24
          pusherRetracted_GUI.setPresent();//sysj\lidloader_plant.sysj line: 103, column: 41
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

  public void thread129706(int [] tdone, int [] ends){
        switch(S129377){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread129707(tdone,ends);
        thread129708(tdone,ends);
        thread129709(tdone,ends);
        thread129710(tdone,ends);
        thread129711(tdone,ends);
        thread129712(tdone,ends);
        int biggest129713 = 0;
        if(ends[8]>=biggest129713){
          biggest129713=ends[8];
        }
        if(ends[9]>=biggest129713){
          biggest129713=ends[9];
        }
        if(ends[10]>=biggest129713){
          biggest129713=ends[10];
        }
        if(ends[11]>=biggest129713){
          biggest129713=ends[11];
        }
        if(ends[12]>=biggest129713){
          biggest129713=ends[12];
        }
        if(ends[13]>=biggest129713){
          biggest129713=ends[13];
        }
        if(biggest129713 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest129713 == 0){
          S129377=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread129705(int [] tdone, int [] ends){
        switch(S129327){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(capDec_1.getprestatus()){//sysj\lidloader_plant.sysj line: 87, column: 12
          if(capcount_thread_6 > 0) {//sysj\lidloader_plant.sysj line: 88, column: 5
            capcount_thread_6 = capcount_thread_6 - 1;//sysj\lidloader_plant.sysj line: 89, column: 6
          }
          if(refill.getprestatus()){//sysj\lidloader_plant.sysj line: 91, column: 12
            capcount_thread_6 = 5;//sysj\lidloader_plant.sysj line: 92, column: 5
            if(capcount_thread_6 == 0){//sysj\lidloader_plant.sysj line: 95, column: 8
              empty.setPresent();//sysj\lidloader_plant.sysj line: 96, column: 6
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
            if(capcount_thread_6 == 0){//sysj\lidloader_plant.sysj line: 95, column: 8
              empty.setPresent();//sysj\lidloader_plant.sysj line: 96, column: 6
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
          if(refill.getprestatus()){//sysj\lidloader_plant.sysj line: 91, column: 12
            capcount_thread_6 = 5;//sysj\lidloader_plant.sysj line: 92, column: 5
            if(capcount_thread_6 == 0){//sysj\lidloader_plant.sysj line: 95, column: 8
              empty.setPresent();//sysj\lidloader_plant.sysj line: 96, column: 6
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
            if(capcount_thread_6 == 0){//sysj\lidloader_plant.sysj line: 95, column: 8
              empty.setPresent();//sysj\lidloader_plant.sysj line: 96, column: 6
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

  public void thread129704(int [] tdone, int [] ends){
        switch(S129265){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S129219){
          case 0 : 
            if(empty.getprestatus()){//sysj\lidloader_plant.sysj line: 70, column: 10
              S129219=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S129201){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\lidloader_plant.sysj line: 72, column: 13
                    S129201=1;
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
                  if(pusherExtended.getprestatus()){//sysj\lidloader_plant.sysj line: 73, column: 13
                    capPos_1.setPresent();//sysj\lidloader_plant.sysj line: 75, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\lidloader_plant.sysj line: 75, column: 7
                    S129201=2;
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
                  if(pusherRetracted.getprestatus()){//sysj\lidloader_plant.sysj line: 76, column: 13
                    capDec_1.setPresent();//sysj\lidloader_plant.sysj line: 77, column: 7
                    currsigs.addElement(capDec_1);
                    S129201=0;
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
            if(refill.getprestatus()){//sysj\lidloader_plant.sysj line: 80, column: 10
              S129219=0;
              S129201=0;
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

  public void thread129703(int [] tdone, int [] ends){
        switch(S129197){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S129167){
          case 0 : 
            switch(S129162){
              case 0 : 
                if(!vacOn.getprestatus()){//sysj\lidloader_plant.sysj line: 50, column: 12
                  S129162=1;
                  if(armAtSource.getprestatus()){//sysj\lidloader_plant.sysj line: 53, column: 14
                    capPos_1.setPresent();//sysj\lidloader_plant.sysj line: 54, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\lidloader_plant.sysj line: 54, column: 7
                    S129167=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S129167=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  WPgripped.setPresent();//sysj\lidloader_plant.sysj line: 51, column: 7
                  currsigs.addElement(WPgripped);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
              case 1 : 
                S129167=0;
                if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\lidloader_plant.sysj line: 47, column: 12
                  if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\lidloader_plant.sysj line: 48, column: 8
                    capPos_1.setPresent();//sysj\lidloader_plant.sysj line: 49, column: 6
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(0);//sysj\lidloader_plant.sysj line: 49, column: 6
                    S129162=0;
                    WPgripped.setPresent();//sysj\lidloader_plant.sysj line: 51, column: 7
                    currsigs.addElement(WPgripped);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S129167=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  S129167=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S129167=1;
            S129167=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\lidloader_plant.sysj line: 47, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\lidloader_plant.sysj line: 48, column: 8
                capPos_1.setPresent();//sysj\lidloader_plant.sysj line: 49, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\lidloader_plant.sysj line: 49, column: 6
                S129162=0;
                WPgripped.setPresent();//sysj\lidloader_plant.sysj line: 51, column: 7
                currsigs.addElement(WPgripped);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S129167=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              S129167=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread129702(int [] tdone, int [] ends){
        switch(S129153){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S129125){
          case 0 : 
            if(pusherExtend.getprestatus()){//sysj\lidloader_plant.sysj line: 34, column: 10
              S129125=1;
              pusherExtended.setPresent();//sysj\lidloader_plant.sysj line: 39, column: 5
              currsigs.addElement(pusherExtended);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherRetracted.setPresent();//sysj\lidloader_plant.sysj line: 35, column: 5
              currsigs.addElement(pusherRetracted);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(!pusherExtend.getprestatus()){//sysj\lidloader_plant.sysj line: 38, column: 10
              S129125=0;
              pusherRetracted.setPresent();//sysj\lidloader_plant.sysj line: 35, column: 5
              currsigs.addElement(pusherRetracted);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              pusherExtended.setPresent();//sysj\lidloader_plant.sysj line: 39, column: 5
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

  public void thread129701(int [] tdone, int [] ends){
        switch(S129112){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S129084){
          case 0 : 
            if(armSource.getprestatus()){//sysj\lidloader_plant.sysj line: 21, column: 10
              S129084=1;
              armAtSource.setPresent();//sysj\lidloader_plant.sysj line: 26, column: 5
              currsigs.addElement(armAtSource);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtDest.setPresent();//sysj\lidloader_plant.sysj line: 22, column: 5
              currsigs.addElement(armAtDest);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(armDest.getprestatus()){//sysj\lidloader_plant.sysj line: 25, column: 10
              S129084=0;
              armAtDest.setPresent();//sysj\lidloader_plant.sysj line: 22, column: 5
              currsigs.addElement(armAtDest);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              armAtSource.setPresent();//sysj\lidloader_plant.sysj line: 26, column: 5
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

  public void thread129698(int [] tdone, int [] ends){
        S129375=1;
    if(empty.getprestatus()){//sysj\lidloader_plant.sysj line: 113, column: 24
      empty_GUI.setPresent();//sysj\lidloader_plant.sysj line: 113, column: 31
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

  public void thread129697(int [] tdone, int [] ends){
        S129367=1;
    if(armAtDest.getprestatus()){//sysj\lidloader_plant.sysj line: 111, column: 24
      armAtDest_GUI.setPresent();//sysj\lidloader_plant.sysj line: 111, column: 35
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

  public void thread129696(int [] tdone, int [] ends){
        S129359=1;
    if(armAtSource.getprestatus()){//sysj\lidloader_plant.sysj line: 109, column: 24
      armAtSource_GUI.setPresent();//sysj\lidloader_plant.sysj line: 109, column: 37
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

  public void thread129695(int [] tdone, int [] ends){
        S129351=1;
    if(WPgripped.getprestatus()){//sysj\lidloader_plant.sysj line: 107, column: 24
      WPgripped_GUI.setPresent();//sysj\lidloader_plant.sysj line: 107, column: 35
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

  public void thread129694(int [] tdone, int [] ends){
        S129343=1;
    if(pusherExtended.getprestatus()){//sysj\lidloader_plant.sysj line: 105, column: 24
      pusherExtended_GUI.setPresent();//sysj\lidloader_plant.sysj line: 105, column: 40
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

  public void thread129693(int [] tdone, int [] ends){
        S129335=1;
    if(pusherRetracted.getprestatus()){//sysj\lidloader_plant.sysj line: 103, column: 24
      pusherRetracted_GUI.setPresent();//sysj\lidloader_plant.sysj line: 103, column: 41
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

  public void thread129692(int [] tdone, int [] ends){
        S129377=1;
    thread129693(tdone,ends);
    thread129694(tdone,ends);
    thread129695(tdone,ends);
    thread129696(tdone,ends);
    thread129697(tdone,ends);
    thread129698(tdone,ends);
    int biggest129699 = 0;
    if(ends[8]>=biggest129699){
      biggest129699=ends[8];
    }
    if(ends[9]>=biggest129699){
      biggest129699=ends[9];
    }
    if(ends[10]>=biggest129699){
      biggest129699=ends[10];
    }
    if(ends[11]>=biggest129699){
      biggest129699=ends[11];
    }
    if(ends[12]>=biggest129699){
      biggest129699=ends[12];
    }
    if(ends[13]>=biggest129699){
      biggest129699=ends[13];
    }
    if(biggest129699 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread129691(int [] tdone, int [] ends){
        S129327=1;
    capcount_thread_6 = 5;//sysj\lidloader_plant.sysj line: 85, column: 3
    if(capDec_1.getprestatus()){//sysj\lidloader_plant.sysj line: 87, column: 12
      if(capcount_thread_6 > 0) {//sysj\lidloader_plant.sysj line: 88, column: 5
        capcount_thread_6 = capcount_thread_6 - 1;//sysj\lidloader_plant.sysj line: 89, column: 6
      }
      if(refill.getprestatus()){//sysj\lidloader_plant.sysj line: 91, column: 12
        capcount_thread_6 = 5;//sysj\lidloader_plant.sysj line: 92, column: 5
        if(capcount_thread_6 == 0){//sysj\lidloader_plant.sysj line: 95, column: 8
          empty.setPresent();//sysj\lidloader_plant.sysj line: 96, column: 6
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
        if(capcount_thread_6 == 0){//sysj\lidloader_plant.sysj line: 95, column: 8
          empty.setPresent();//sysj\lidloader_plant.sysj line: 96, column: 6
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
      if(refill.getprestatus()){//sysj\lidloader_plant.sysj line: 91, column: 12
        capcount_thread_6 = 5;//sysj\lidloader_plant.sysj line: 92, column: 5
        if(capcount_thread_6 == 0){//sysj\lidloader_plant.sysj line: 95, column: 8
          empty.setPresent();//sysj\lidloader_plant.sysj line: 96, column: 6
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
        if(capcount_thread_6 == 0){//sysj\lidloader_plant.sysj line: 95, column: 8
          empty.setPresent();//sysj\lidloader_plant.sysj line: 96, column: 6
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

  public void thread129690(int [] tdone, int [] ends){
        S129265=1;
    S129219=0;
    S129201=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread129689(int [] tdone, int [] ends){
        S129197=1;
    S129167=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\lidloader_plant.sysj line: 47, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\lidloader_plant.sysj line: 48, column: 8
        capPos_1.setPresent();//sysj\lidloader_plant.sysj line: 49, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\lidloader_plant.sysj line: 49, column: 6
        S129162=0;
        WPgripped.setPresent();//sysj\lidloader_plant.sysj line: 51, column: 7
        currsigs.addElement(WPgripped);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S129167=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      S129167=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread129688(int [] tdone, int [] ends){
        S129153=1;
    S129125=0;
    pusherRetracted.setPresent();//sysj\lidloader_plant.sysj line: 35, column: 5
    currsigs.addElement(pusherRetracted);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread129687(int [] tdone, int [] ends){
        S129112=1;
    S129084=0;
    armAtDest.setPresent();//sysj\lidloader_plant.sysj line: 22, column: 5
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
      switch(S129685){
        case 0 : 
          S129685=0;
          break RUN;
        
        case 1 : 
          S129685=2;
          S129685=2;
          capDec_1.setClear();//sysj\lidloader_plant.sysj line: 16, column: 2
          capPos_1.setClear();//sysj\lidloader_plant.sysj line: 17, column: 2
          capPos_1.setPresent();//sysj\lidloader_plant.sysj line: 18, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\lidloader_plant.sysj line: 18, column: 2
          thread129687(tdone,ends);
          thread129688(tdone,ends);
          thread129689(tdone,ends);
          thread129690(tdone,ends);
          thread129691(tdone,ends);
          thread129692(tdone,ends);
          int biggest129700 = 0;
          if(ends[2]>=biggest129700){
            biggest129700=ends[2];
          }
          if(ends[3]>=biggest129700){
            biggest129700=ends[3];
          }
          if(ends[4]>=biggest129700){
            biggest129700=ends[4];
          }
          if(ends[5]>=biggest129700){
            biggest129700=ends[5];
          }
          if(ends[6]>=biggest129700){
            biggest129700=ends[6];
          }
          if(ends[7]>=biggest129700){
            biggest129700=ends[7];
          }
          if(biggest129700 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\lidloader_plant.sysj line: 16, column: 2
          capPos_1.setClear();//sysj\lidloader_plant.sysj line: 17, column: 2
          thread129701(tdone,ends);
          thread129702(tdone,ends);
          thread129703(tdone,ends);
          thread129704(tdone,ends);
          thread129705(tdone,ends);
          thread129706(tdone,ends);
          int biggest129714 = 0;
          if(ends[2]>=biggest129714){
            biggest129714=ends[2];
          }
          if(ends[3]>=biggest129714){
            biggest129714=ends[3];
          }
          if(ends[4]>=biggest129714){
            biggest129714=ends[4];
          }
          if(ends[5]>=biggest129714){
            biggest129714=ends[5];
          }
          if(ends[6]>=biggest129714){
            biggest129714=ends[6];
          }
          if(ends[7]>=biggest129714){
            biggest129714=ends[7];
          }
          if(biggest129714 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest129714 == 0){
            S129685=0;
            active[1]=0;
            ends[1]=0;
            S129685=0;
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
