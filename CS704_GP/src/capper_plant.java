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
  private int S3836 = 1;
  private int S3759 = 1;
  private int S3731 = 1;
  private int S3800 = 1;
  private int S3772 = 1;
  private int S3817 = 1;
  private int S3805 = 1;
  private int S3834 = 1;
  
  private int[] ends = new int[6];
  private int[] tdone = new int[6];
  
  public void thread3846(int [] tdone, int [] ends){
        switch(S3834){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(capGripperPos5Extend.getprestatus()){//sysj\capper_plant.sysj line: 61, column: 12
          System.out.println("CAP GRIPPED");//sysj\capper_plant.sysj line: 62, column: 5
          if(!capGripperPos5Extend.getprestatus()){//sysj\capper_plant.sysj line: 64, column: 12
            System.out.println("CAP NOT GRIPPED");//sysj\capper_plant.sysj line: 65, column: 5
            active[5]=1;
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
          if(!capGripperPos5Extend.getprestatus()){//sysj\capper_plant.sysj line: 64, column: 12
            System.out.println("CAP NOT GRIPPED");//sysj\capper_plant.sysj line: 65, column: 5
            active[5]=1;
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

  public void thread3845(int [] tdone, int [] ends){
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
            if(cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 44, column: 12
              System.out.println("CLAMPED");//sysj\capper_plant.sysj line: 45, column: 5
              if(!cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 47, column: 12
                System.out.println("NOT CLAMPED");//sysj\capper_plant.sysj line: 48, column: 5
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
              if(!cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 47, column: 12
                System.out.println("NOT CLAMPED");//sysj\capper_plant.sysj line: 48, column: 5
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
            if(cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 44, column: 12
              System.out.println("CLAMPED");//sysj\capper_plant.sysj line: 45, column: 5
              if(!cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 47, column: 12
                System.out.println("NOT CLAMPED");//sysj\capper_plant.sysj line: 48, column: 5
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
              if(!cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 47, column: 12
                System.out.println("NOT CLAMPED");//sysj\capper_plant.sysj line: 48, column: 5
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

  public void thread3844(int [] tdone, int [] ends){
        switch(S3800){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S3772){
          case 0 : 
            if(gripperTurnExtend.getprestatus()){//sysj\capper_plant.sysj line: 26, column: 10
              S3772=1;
              gripperTurnFinalPos.setPresent();//sysj\capper_plant.sysj line: 31, column: 5
              currsigs.addElement(gripperTurnFinalPos);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              gripperTurnHomePos.setPresent();//sysj\capper_plant.sysj line: 27, column: 5
              currsigs.addElement(gripperTurnHomePos);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            if(gripperTurnRetract.getprestatus()){//sysj\capper_plant.sysj line: 30, column: 10
              S3772=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              gripperTurnFinalPos.setPresent();//sysj\capper_plant.sysj line: 31, column: 5
              currsigs.addElement(gripperTurnFinalPos);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            S3772=2;
            S3772=0;
            gripperTurnHomePos.setPresent();//sysj\capper_plant.sysj line: 27, column: 5
            currsigs.addElement(gripperTurnHomePos);
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread3843(int [] tdone, int [] ends){
        switch(S3759){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S3731){
          case 0 : 
            if(cylPos5ZaxisExtend.getprestatus()){//sysj\capper_plant.sysj line: 11, column: 10
              S3731=1;
              gripperZAxisLowered.setPresent();//sysj\capper_plant.sysj line: 16, column: 5
              currsigs.addElement(gripperZAxisLowered);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperZAxisLifted.setPresent();//sysj\capper_plant.sysj line: 12, column: 5
              currsigs.addElement(gripperZAxisLifted);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!cylPos5ZaxisExtend.getprestatus()){//sysj\capper_plant.sysj line: 15, column: 10
              S3731=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              gripperZAxisLowered.setPresent();//sysj\capper_plant.sysj line: 16, column: 5
              currsigs.addElement(gripperZAxisLowered);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            S3731=2;
            S3731=0;
            gripperZAxisLifted.setPresent();//sysj\capper_plant.sysj line: 12, column: 5
            currsigs.addElement(gripperZAxisLifted);
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread3841(int [] tdone, int [] ends){
        S3834=1;
    if(capGripperPos5Extend.getprestatus()){//sysj\capper_plant.sysj line: 61, column: 12
      System.out.println("CAP GRIPPED");//sysj\capper_plant.sysj line: 62, column: 5
      if(!capGripperPos5Extend.getprestatus()){//sysj\capper_plant.sysj line: 64, column: 12
        System.out.println("CAP NOT GRIPPED");//sysj\capper_plant.sysj line: 65, column: 5
        active[5]=1;
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
      if(!capGripperPos5Extend.getprestatus()){//sysj\capper_plant.sysj line: 64, column: 12
        System.out.println("CAP NOT GRIPPED");//sysj\capper_plant.sysj line: 65, column: 5
        active[5]=1;
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

  public void thread3840(int [] tdone, int [] ends){
        S3817=1;
    S3805=0;
    if(cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 44, column: 12
      System.out.println("CLAMPED");//sysj\capper_plant.sysj line: 45, column: 5
      if(!cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 47, column: 12
        System.out.println("NOT CLAMPED");//sysj\capper_plant.sysj line: 48, column: 5
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
      if(!cylClampBottleExtend.getprestatus()){//sysj\capper_plant.sysj line: 47, column: 12
        System.out.println("NOT CLAMPED");//sysj\capper_plant.sysj line: 48, column: 5
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

  public void thread3839(int [] tdone, int [] ends){
        S3800=1;
    S3772=0;
    gripperTurnHomePos.setPresent();//sysj\capper_plant.sysj line: 27, column: 5
    currsigs.addElement(gripperTurnHomePos);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread3838(int [] tdone, int [] ends){
        S3759=1;
    S3731=0;
    gripperZAxisLifted.setPresent();//sysj\capper_plant.sysj line: 12, column: 5
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
      switch(S3836){
        case 0 : 
          S3836=0;
          break RUN;
        
        case 1 : 
          S3836=2;
          S3836=2;
          thread3838(tdone,ends);
          thread3839(tdone,ends);
          thread3840(tdone,ends);
          thread3841(tdone,ends);
          int biggest3842 = 0;
          if(ends[2]>=biggest3842){
            biggest3842=ends[2];
          }
          if(ends[3]>=biggest3842){
            biggest3842=ends[3];
          }
          if(ends[4]>=biggest3842){
            biggest3842=ends[4];
          }
          if(ends[5]>=biggest3842){
            biggest3842=ends[5];
          }
          if(biggest3842 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread3843(tdone,ends);
          thread3844(tdone,ends);
          thread3845(tdone,ends);
          thread3846(tdone,ends);
          int biggest3847 = 0;
          if(ends[2]>=biggest3847){
            biggest3847=ends[2];
          }
          if(ends[3]>=biggest3847){
            biggest3847=ends[3];
          }
          if(ends[4]>=biggest3847){
            biggest3847=ends[4];
          }
          if(ends[5]>=biggest3847){
            biggest3847=ends[5];
          }
          if(biggest3847 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest3847 == 0){
            S3836=0;
            active[1]=0;
            ends[1]=0;
            S3836=0;
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
