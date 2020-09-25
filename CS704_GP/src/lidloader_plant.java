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
  private int S96216 = 1;
  private int S95643 = 1;
  private int S95615 = 1;
  private int S95684 = 1;
  private int S95656 = 1;
  private int S95728 = 1;
  private int S95698 = 1;
  private int S95693 = 1;
  private int S95796 = 1;
  private int S95750 = 1;
  private int S95732 = 1;
  private int S95858 = 1;
  private int S95908 = 1;
  private int S95866 = 1;
  private int S95874 = 1;
  private int S95882 = 1;
  private int S95890 = 1;
  private int S95898 = 1;
  private int S95906 = 1;
  
  private int[] ends = new int[14];
  private int[] tdone = new int[14];
  
  public void thread96243(int [] tdone, int [] ends){
        switch(S95906){
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

  public void thread96242(int [] tdone, int [] ends){
        switch(S95898){
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

  public void thread96241(int [] tdone, int [] ends){
        switch(S95890){
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

  public void thread96240(int [] tdone, int [] ends){
        switch(S95882){
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

  public void thread96239(int [] tdone, int [] ends){
        switch(S95874){
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

  public void thread96238(int [] tdone, int [] ends){
        switch(S95866){
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

  public void thread96237(int [] tdone, int [] ends){
        switch(S95908){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        thread96238(tdone,ends);
        thread96239(tdone,ends);
        thread96240(tdone,ends);
        thread96241(tdone,ends);
        thread96242(tdone,ends);
        thread96243(tdone,ends);
        int biggest96244 = 0;
        if(ends[8]>=biggest96244){
          biggest96244=ends[8];
        }
        if(ends[9]>=biggest96244){
          biggest96244=ends[9];
        }
        if(ends[10]>=biggest96244){
          biggest96244=ends[10];
        }
        if(ends[11]>=biggest96244){
          biggest96244=ends[11];
        }
        if(ends[12]>=biggest96244){
          biggest96244=ends[12];
        }
        if(ends[13]>=biggest96244){
          biggest96244=ends[13];
        }
        if(biggest96244 == 1){
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        //FINXME code
        if(biggest96244 == 0){
          S95908=0;
          active[7]=0;
          ends[7]=0;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread96236(int [] tdone, int [] ends){
        switch(S95858){
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

  public void thread96235(int [] tdone, int [] ends){
        switch(S95796){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S95750){
          case 0 : 
            if(empty.getprestatus()){//sysj\lidloader_plant.sysj line: 64, column: 10
              S95750=1;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              switch(S95732){
                case 0 : 
                  if(pusherRetracted.getprestatus()){//sysj\lidloader_plant.sysj line: 66, column: 13
                    S95732=1;
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
                    S95732=2;
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
                    S95732=0;
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
              S95750=0;
              S95732=0;
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

  public void thread96234(int [] tdone, int [] ends){
        switch(S95728){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S95698){
          case 0 : 
            switch(S95693){
              case 0 : 
                if(!vacOn.getprestatus()){//sysj\lidloader_plant.sysj line: 44, column: 12
                  S95693=1;
                  if(armAtSource.getprestatus()){//sysj\lidloader_plant.sysj line: 47, column: 14
                    capPos_1.setPresent();//sysj\lidloader_plant.sysj line: 48, column: 7
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(1);//sysj\lidloader_plant.sysj line: 48, column: 7
                    S95698=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S95698=1;
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
                S95698=0;
                if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\lidloader_plant.sysj line: 41, column: 12
                  if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\lidloader_plant.sysj line: 42, column: 8
                    capPos_1.setPresent();//sysj\lidloader_plant.sysj line: 43, column: 6
                    currsigs.addElement(capPos_1);
                    capPos_1.setValue(0);//sysj\lidloader_plant.sysj line: 43, column: 6
                    S95693=0;
                    WPgripped.setPresent();//sysj\lidloader_plant.sysj line: 45, column: 7
                    currsigs.addElement(WPgripped);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S95698=1;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
                else {
                  S95698=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S95698=1;
            S95698=0;
            if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\lidloader_plant.sysj line: 41, column: 12
              if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\lidloader_plant.sysj line: 42, column: 8
                capPos_1.setPresent();//sysj\lidloader_plant.sysj line: 43, column: 6
                currsigs.addElement(capPos_1);
                capPos_1.setValue(0);//sysj\lidloader_plant.sysj line: 43, column: 6
                S95693=0;
                WPgripped.setPresent();//sysj\lidloader_plant.sysj line: 45, column: 7
                currsigs.addElement(WPgripped);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S95698=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              S95698=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread96233(int [] tdone, int [] ends){
        switch(S95684){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S95656){
          case 0 : 
            if(pusherExtend.getprestatus()){//sysj\lidloader_plant.sysj line: 28, column: 10
              S95656=1;
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
              S95656=0;
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

  public void thread96232(int [] tdone, int [] ends){
        switch(S95643){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S95615){
          case 0 : 
            if(armSource.getprestatus()){//sysj\lidloader_plant.sysj line: 16, column: 10
              S95615=1;
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
              S95615=0;
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

  public void thread96229(int [] tdone, int [] ends){
        S95906=1;
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

  public void thread96228(int [] tdone, int [] ends){
        S95898=1;
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

  public void thread96227(int [] tdone, int [] ends){
        S95890=1;
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

  public void thread96226(int [] tdone, int [] ends){
        S95882=1;
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

  public void thread96225(int [] tdone, int [] ends){
        S95874=1;
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

  public void thread96224(int [] tdone, int [] ends){
        S95866=1;
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

  public void thread96223(int [] tdone, int [] ends){
        S95908=1;
    thread96224(tdone,ends);
    thread96225(tdone,ends);
    thread96226(tdone,ends);
    thread96227(tdone,ends);
    thread96228(tdone,ends);
    thread96229(tdone,ends);
    int biggest96230 = 0;
    if(ends[8]>=biggest96230){
      biggest96230=ends[8];
    }
    if(ends[9]>=biggest96230){
      biggest96230=ends[9];
    }
    if(ends[10]>=biggest96230){
      biggest96230=ends[10];
    }
    if(ends[11]>=biggest96230){
      biggest96230=ends[11];
    }
    if(ends[12]>=biggest96230){
      biggest96230=ends[12];
    }
    if(ends[13]>=biggest96230){
      biggest96230=ends[13];
    }
    if(biggest96230 == 1){
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread96222(int [] tdone, int [] ends){
        S95858=1;
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

  public void thread96221(int [] tdone, int [] ends){
        S95796=1;
    S95750=0;
    S95732=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread96220(int [] tdone, int [] ends){
        S95728=1;
    S95698=0;
    if(vacOn.getprestatus() && armAtSource.getprestatus()){//sysj\lidloader_plant.sysj line: 41, column: 12
      if((Integer)(capPos_1.getpreval() == null ? 0 : ((Integer)capPos_1.getpreval()).intValue()) == 1){//sysj\lidloader_plant.sysj line: 42, column: 8
        capPos_1.setPresent();//sysj\lidloader_plant.sysj line: 43, column: 6
        currsigs.addElement(capPos_1);
        capPos_1.setValue(0);//sysj\lidloader_plant.sysj line: 43, column: 6
        S95693=0;
        WPgripped.setPresent();//sysj\lidloader_plant.sysj line: 45, column: 7
        currsigs.addElement(WPgripped);
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S95698=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      S95698=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }

  public void thread96219(int [] tdone, int [] ends){
        S95684=1;
    S95656=0;
    pusherRetracted.setPresent();//sysj\lidloader_plant.sysj line: 29, column: 5
    currsigs.addElement(pusherRetracted);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread96218(int [] tdone, int [] ends){
        S95643=1;
    S95615=0;
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
      switch(S96216){
        case 0 : 
          S96216=0;
          break RUN;
        
        case 1 : 
          S96216=2;
          S96216=2;
          capDec_1.setClear();//sysj\lidloader_plant.sysj line: 11, column: 2
          capPos_1.setClear();//sysj\lidloader_plant.sysj line: 12, column: 2
          capPos_1.setPresent();//sysj\lidloader_plant.sysj line: 13, column: 2
          currsigs.addElement(capPos_1);
          capPos_1.setValue(0);//sysj\lidloader_plant.sysj line: 13, column: 2
          thread96218(tdone,ends);
          thread96219(tdone,ends);
          thread96220(tdone,ends);
          thread96221(tdone,ends);
          thread96222(tdone,ends);
          thread96223(tdone,ends);
          int biggest96231 = 0;
          if(ends[2]>=biggest96231){
            biggest96231=ends[2];
          }
          if(ends[3]>=biggest96231){
            biggest96231=ends[3];
          }
          if(ends[4]>=biggest96231){
            biggest96231=ends[4];
          }
          if(ends[5]>=biggest96231){
            biggest96231=ends[5];
          }
          if(ends[6]>=biggest96231){
            biggest96231=ends[6];
          }
          if(ends[7]>=biggest96231){
            biggest96231=ends[7];
          }
          if(biggest96231 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          capDec_1.setClear();//sysj\lidloader_plant.sysj line: 11, column: 2
          capPos_1.setClear();//sysj\lidloader_plant.sysj line: 12, column: 2
          thread96232(tdone,ends);
          thread96233(tdone,ends);
          thread96234(tdone,ends);
          thread96235(tdone,ends);
          thread96236(tdone,ends);
          thread96237(tdone,ends);
          int biggest96245 = 0;
          if(ends[2]>=biggest96245){
            biggest96245=ends[2];
          }
          if(ends[3]>=biggest96245){
            biggest96245=ends[3];
          }
          if(ends[4]>=biggest96245){
            biggest96245=ends[4];
          }
          if(ends[5]>=biggest96245){
            biggest96245=ends[5];
          }
          if(ends[6]>=biggest96245){
            biggest96245=ends[6];
          }
          if(ends[7]>=biggest96245){
            biggest96245=ends[7];
          }
          if(biggest96245 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest96245 == 0){
            S96216=0;
            active[1]=0;
            ends[1]=0;
            S96216=0;
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
