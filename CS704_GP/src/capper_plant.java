import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class capper_plant extends ClockDomain{
  public capper_plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal cylPos5ZaxisExtend = new Signal("cylPos5ZaxisExtend", Signal.INPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.INPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.INPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.INPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.INPUT);
  public Signal gripperZAxisLowered = new Signal("gripperZAxisLowered", Signal.OUTPUT);
  public Signal gripperZAxisLifted = new Signal("gripperZAxisLifted", Signal.OUTPUT);
  public Signal gripperTurnHomePos = new Signal("gripperTurnHomePos", Signal.OUTPUT);
  public Signal gripperTurnFinalPos = new Signal("gripperTurnFinalPos", Signal.OUTPUT);
  public Signal gripperZAxisLowered_GUI = new Signal("gripperZAxisLowered_GUI", Signal.OUTPUT);
  public Signal gripperZAxisLifted_GUI = new Signal("gripperZAxisLifted_GUI", Signal.OUTPUT);
  public Signal gripperTurnHomePos_GUI = new Signal("gripperTurnHomePos_GUI", Signal.OUTPUT);
  public Signal gripperTurnFinalPos_GUI = new Signal("gripperTurnFinalPos_GUI", Signal.OUTPUT);
  private int S3870 = 1;
  private int S3759 = 1;
  private int S3731 = 1;
  private int S3800 = 1;
  private int S3772 = 1;
  private int S3817 = 1;
  private int S3805 = 1;
  private int S3834 = 1;
  private int S3868 = 1;
  private int S3842 = 1;
  private int S3850 = 1;
  private int S3858 = 1;
  private int S3866 = 1;
  
  private int[] ends = new int[11];
  private int[] tdone = new int[11];
  
  public void thread3891(int [] tdone, int [] ends){
        switch(S3866){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\capper_plant.sysj line: 80, column: 24
          gripperTurnFinalPos_GUI.setPresent();//sysj\capper_plant.sysj line: 80, column: 45
          currsigs.addElement(gripperTurnFinalPos_GUI);
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

  public void thread3890(int [] tdone, int [] ends){
        switch(S3858){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(gripperTurnHomePos.getprestatus()){//sysj\capper_plant.sysj line: 78, column: 24
          gripperTurnHomePos_GUI.setPresent();//sysj\capper_plant.sysj line: 78, column: 44
          currsigs.addElement(gripperTurnHomePos_GUI);
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

  public void thread3889(int [] tdone, int [] ends){
        switch(S3850){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLifted.getprestatus()){//sysj\capper_plant.sysj line: 76, column: 24
          gripperZAxisLifted_GUI.setPresent();//sysj\capper_plant.sysj line: 76, column: 44
          currsigs.addElement(gripperZAxisLifted_GUI);
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

  public void thread3888(int [] tdone, int [] ends){
        switch(S3842){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(gripperZAxisLowered.getprestatus()){//sysj\capper_plant.sysj line: 74, column: 24
          gripperZAxisLowered_GUI.setPresent();//sysj\capper_plant.sysj line: 74, column: 45
          currsigs.addElement(gripperZAxisLowered_GUI);
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

  public void thread3887(int [] tdone, int [] ends){
        switch(S3868){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread3888(tdone,ends);
        thread3889(tdone,ends);
        thread3890(tdone,ends);
        thread3891(tdone,ends);
        int biggest3892 = 0;
        if(ends[7]>=biggest3892){
          biggest3892=ends[7];
        }
        if(ends[8]>=biggest3892){
          biggest3892=ends[8];
        }
        if(ends[9]>=biggest3892){
          biggest3892=ends[9];
        }
        if(ends[10]>=biggest3892){
          biggest3892=ends[10];
        }
        if(biggest3892 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest3892 == 0){
          S3868=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread3886(int [] tdone, int [] ends){
        switch(S3834){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj\capper_plant.sysj line: 62, column: 12
          if(!capGripperPos5Extend.getprestatus()){//sysj\capper_plant.sysj line: 65, column: 12
            active[5]=1;
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
          if(!capGripperPos5Extend.getprestatus()){//sysj\capper_plant.sysj line: 65, column: 12
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
          }
          else {
            active[5]=1;
            ends[5]=1;
            tdone[5]=1;
          }
        }
        break;
      
    }
  }

  public void thread3885(int [] tdone, int [] ends){
        switch(S3817){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S3805){
          case 0 : 
            S3805=0;
            if(cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 47, column: 12
              if(!cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 50, column: 12
                S3805=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S3805=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              if(!cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 50, column: 12
                S3805=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S3805=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            break;
          
          case 1 : 
            S3805=1;
            S3805=0;
            if(cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 47, column: 12
              if(!cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 50, column: 12
                S3805=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S3805=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              if(!cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 50, column: 12
                S3805=1;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S3805=1;
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

  public void thread3884(int [] tdone, int [] ends){
        switch(S3800){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S3772){
          case 0 : 
            if(gripperTurnExtend.getprestatus()){//sysj\capper_plant.sysj line: 30, column: 10
              S3772=1;
              gripperTurnFinalPos.setPresent();//sysj\capper_plant.sysj line: 35, column: 5
              currsigs.addElement(gripperTurnFinalPos);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              gripperTurnHomePos.setPresent();//sysj\capper_plant.sysj line: 31, column: 5
              currsigs.addElement(gripperTurnHomePos);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(gripperTurnRetract.getprestatus()){//sysj\capper_plant.sysj line: 34, column: 10
              S3772=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              gripperTurnFinalPos.setPresent();//sysj\capper_plant.sysj line: 35, column: 5
              currsigs.addElement(gripperTurnFinalPos);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            S3772=2;
            S3772=0;
            gripperTurnHomePos.setPresent();//sysj\capper_plant.sysj line: 31, column: 5
            currsigs.addElement(gripperTurnHomePos);
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread3883(int [] tdone, int [] ends){
        switch(S3759){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S3731){
          case 0 : 
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\capper_plant.sysj line: 15, column: 10
              S3731=1;
              gripperZAxisLowered.setPresent();//sysj\capper_plant.sysj line: 20, column: 5
              currsigs.addElement(gripperZAxisLowered);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\capper_plant.sysj line: 16, column: 5
              currsigs.addElement(gripperZAxisLifted);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!cylPos5ZaxisExtend.getprestatus()){//sysj\capper_plant.sysj line: 19, column: 10
              S3731=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperZAxisLowered.setPresent();//sysj\capper_plant.sysj line: 20, column: 5
              currsigs.addElement(gripperZAxisLowered);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            S3731=2;
            S3731=0;
            gripperZAxisLifted.setPresent();//sysj\capper_plant.sysj line: 16, column: 5
            currsigs.addElement(gripperZAxisLifted);
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread3880(int [] tdone, int [] ends){
        S3866=1;
    if(gripperTurnFinalPos.getprestatus()){//sysj\capper_plant.sysj line: 80, column: 24
      gripperTurnFinalPos_GUI.setPresent();//sysj\capper_plant.sysj line: 80, column: 45
      currsigs.addElement(gripperTurnFinalPos_GUI);
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

  public void thread3879(int [] tdone, int [] ends){
        S3858=1;
    if(gripperTurnHomePos.getprestatus()){//sysj\capper_plant.sysj line: 78, column: 24
      gripperTurnHomePos_GUI.setPresent();//sysj\capper_plant.sysj line: 78, column: 44
      currsigs.addElement(gripperTurnHomePos_GUI);
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

  public void thread3878(int [] tdone, int [] ends){
        S3850=1;
    if(gripperZAxisLifted.getprestatus()){//sysj\capper_plant.sysj line: 76, column: 24
      gripperZAxisLifted_GUI.setPresent();//sysj\capper_plant.sysj line: 76, column: 44
      currsigs.addElement(gripperZAxisLifted_GUI);
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

  public void thread3877(int [] tdone, int [] ends){
        S3842=1;
    if(gripperZAxisLowered.getprestatus()){//sysj\capper_plant.sysj line: 74, column: 24
      gripperZAxisLowered_GUI.setPresent();//sysj\capper_plant.sysj line: 74, column: 45
      currsigs.addElement(gripperZAxisLowered_GUI);
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

  public void thread3876(int [] tdone, int [] ends){
        S3868=1;
    thread3877(tdone,ends);
    thread3878(tdone,ends);
    thread3879(tdone,ends);
    thread3880(tdone,ends);
    int biggest3881 = 0;
    if(ends[7]>=biggest3881){
      biggest3881=ends[7];
    }
    if(ends[8]>=biggest3881){
      biggest3881=ends[8];
    }
    if(ends[9]>=biggest3881){
      biggest3881=ends[9];
    }
    if(ends[10]>=biggest3881){
      biggest3881=ends[10];
    }
    if(biggest3881 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread3875(int [] tdone, int [] ends){
        S3834=1;
    if(capGripperPos5Extend.getprestatus()){//sysj\capper_plant.sysj line: 62, column: 12
      if(!capGripperPos5Extend.getprestatus()){//sysj\capper_plant.sysj line: 65, column: 12
        active[5]=1;
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
      if(!capGripperPos5Extend.getprestatus()){//sysj\capper_plant.sysj line: 65, column: 12
        active[5]=1;
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

  public void thread3874(int [] tdone, int [] ends){
        S3817=1;
    S3805=0;
    if(cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 47, column: 12
      if(!cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 50, column: 12
        S3805=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S3805=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
    else {
      if(!cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 50, column: 12
        S3805=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
      else {
        S3805=1;
        active[4]=1;
        ends[4]=1;
        tdone[4]=1;
      }
    }
  }

  public void thread3873(int [] tdone, int [] ends){
        S3800=1;
    S3772=0;
    gripperTurnHomePos.setPresent();//sysj\capper_plant.sysj line: 31, column: 5
    currsigs.addElement(gripperTurnHomePos);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread3872(int [] tdone, int [] ends){
        S3759=1;
    S3731=0;
    gripperZAxisLifted.setPresent();//sysj\capper_plant.sysj line: 16, column: 5
    currsigs.addElement(gripperZAxisLifted);
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
      switch(S3870){
        case 0 : 
          S3870=0;
          break RUN;
        
        case 1 : 
          S3870=2;
          S3870=2;
          thread3872(tdone,ends);
          thread3873(tdone,ends);
          thread3874(tdone,ends);
          thread3875(tdone,ends);
          thread3876(tdone,ends);
          int biggest3882 = 0;
          if(ends[2]>=biggest3882){
            biggest3882=ends[2];
          }
          if(ends[3]>=biggest3882){
            biggest3882=ends[3];
          }
          if(ends[4]>=biggest3882){
            biggest3882=ends[4];
          }
          if(ends[5]>=biggest3882){
            biggest3882=ends[5];
          }
          if(ends[6]>=biggest3882){
            biggest3882=ends[6];
          }
          if(biggest3882 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread3883(tdone,ends);
          thread3884(tdone,ends);
          thread3885(tdone,ends);
          thread3886(tdone,ends);
          thread3887(tdone,ends);
          int biggest3893 = 0;
          if(ends[2]>=biggest3893){
            biggest3893=ends[2];
          }
          if(ends[3]>=biggest3893){
            biggest3893=ends[3];
          }
          if(ends[4]>=biggest3893){
            biggest3893=ends[4];
          }
          if(ends[5]>=biggest3893){
            biggest3893=ends[5];
          }
          if(ends[6]>=biggest3893){
            biggest3893=ends[6];
          }
          if(biggest3893 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest3893 == 0){
            S3870=0;
            active[1]=0;
            ends[1]=0;
            S3870=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
          cylPos5ZaxisExtend.gethook();
          gripperTurnRetract.gethook();
          gripperTurnExtend.gethook();
          capGripperPos5Extend.gethook();
          cylClampBottleExtend.gethook();
          df = true;
        }
        runClockDomain();
      }
      cylPos5ZaxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      gripperZAxisLowered.setpreclear();
      gripperZAxisLifted.setpreclear();
      gripperTurnHomePos.setpreclear();
      gripperTurnFinalPos.setpreclear();
      gripperZAxisLowered_GUI.setpreclear();
      gripperZAxisLifted_GUI.setpreclear();
      gripperTurnHomePos_GUI.setpreclear();
      gripperTurnFinalPos_GUI.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = cylPos5ZaxisExtend.getStatus() ? cylPos5ZaxisExtend.setprepresent() : cylPos5ZaxisExtend.setpreclear();
      cylPos5ZaxisExtend.setpreval(cylPos5ZaxisExtend.getValue());
      cylPos5ZaxisExtend.setClear();
      dummyint = gripperTurnRetract.getStatus() ? gripperTurnRetract.setprepresent() : gripperTurnRetract.setpreclear();
      gripperTurnRetract.setpreval(gripperTurnRetract.getValue());
      gripperTurnRetract.setClear();
      dummyint = gripperTurnExtend.getStatus() ? gripperTurnExtend.setprepresent() : gripperTurnExtend.setpreclear();
      gripperTurnExtend.setpreval(gripperTurnExtend.getValue());
      gripperTurnExtend.setClear();
      dummyint = capGripperPos5Extend.getStatus() ? capGripperPos5Extend.setprepresent() : capGripperPos5Extend.setpreclear();
      capGripperPos5Extend.setpreval(capGripperPos5Extend.getValue());
      capGripperPos5Extend.setClear();
      dummyint = cylClampBottleExtend.getStatus() ? cylClampBottleExtend.setprepresent() : cylClampBottleExtend.setpreclear();
      cylClampBottleExtend.setpreval(cylClampBottleExtend.getValue());
      cylClampBottleExtend.setClear();
      gripperZAxisLowered.sethook();
      gripperZAxisLowered.setClear();
      gripperZAxisLifted.sethook();
      gripperZAxisLifted.setClear();
      gripperTurnHomePos.sethook();
      gripperTurnHomePos.setClear();
      gripperTurnFinalPos.sethook();
      gripperTurnFinalPos.setClear();
      gripperZAxisLowered_GUI.sethook();
      gripperZAxisLowered_GUI.setClear();
      gripperZAxisLifted_GUI.sethook();
      gripperZAxisLifted_GUI.setClear();
      gripperTurnHomePos_GUI.sethook();
      gripperTurnHomePos_GUI.setClear();
      gripperTurnFinalPos_GUI.sethook();
      gripperTurnFinalPos_GUI.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        cylPos5ZaxisExtend.gethook();
        gripperTurnRetract.gethook();
        gripperTurnExtend.gethook();
        capGripperPos5Extend.gethook();
        cylClampBottleExtend.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
