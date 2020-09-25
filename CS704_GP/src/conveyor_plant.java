import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class conveyor_plant extends ClockDomain{
  public conveyor_plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.INPUT);
  public Signal conveyorEngaged = new Signal("conveyorEngaged", Signal.OUTPUT);
  public Signal conveyorEngaged_GUI = new Signal("conveyorEngaged_GUI", Signal.OUTPUT);
  private int S3988 = 1;
  private int S3947 = 1;
  private int S3952 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread4000(int [] tdone, int [] ends){
        S3952=1;
    conveyorEngaged_GUI.setPresent();//sysj\conveyor_plant.sysj line: 19, column: 5
    currsigs.addElement(conveyorEngaged_GUI);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread3999(int [] tdone, int [] ends){
        S3947=1;
    conveyorEngaged.setPresent();//sysj\conveyor_plant.sysj line: 15, column: 5
    currsigs.addElement(conveyorEngaged);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread3997(int [] tdone, int [] ends){
        switch(S3952){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        conveyorEngaged_GUI.setPresent();//sysj\conveyor_plant.sysj line: 19, column: 5
        currsigs.addElement(conveyorEngaged_GUI);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread3996(int [] tdone, int [] ends){
        switch(S3947){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        conveyorEngaged.setPresent();//sysj\conveyor_plant.sysj line: 15, column: 5
        currsigs.addElement(conveyorEngaged);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread3994(int [] tdone, int [] ends){
        S3952=1;
    conveyorEngaged_GUI.setPresent();//sysj\conveyor_plant.sysj line: 19, column: 5
    currsigs.addElement(conveyorEngaged_GUI);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread3993(int [] tdone, int [] ends){
        S3947=1;
    conveyorEngaged.setPresent();//sysj\conveyor_plant.sysj line: 15, column: 5
    currsigs.addElement(conveyorEngaged);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread3991(int [] tdone, int [] ends){
        S3952=1;
    conveyorEngaged_GUI.setPresent();//sysj\conveyor_plant.sysj line: 19, column: 5
    currsigs.addElement(conveyorEngaged_GUI);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread3990(int [] tdone, int [] ends){
        S3947=1;
    conveyorEngaged.setPresent();//sysj\conveyor_plant.sysj line: 15, column: 5
    currsigs.addElement(conveyorEngaged);
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
      switch(S3988){
        case 0 : 
          S3988=0;
          break RUN;
        
        case 1 : 
          S3988=2;
          S3988=2;
          thread3990(tdone,ends);
          thread3991(tdone,ends);
          int biggest3992 = 0;
          if(ends[2]>=biggest3992){
            biggest3992=ends[2];
          }
          if(ends[3]>=biggest3992){
            biggest3992=ends[3];
          }
          if(biggest3992 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          if(!motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 13, column: 9
            thread3993(tdone,ends);
            thread3994(tdone,ends);
            int biggest3995 = 0;
            if(ends[2]>=biggest3995){
              biggest3995=ends[2];
            }
            if(ends[3]>=biggest3995){
              biggest3995=ends[3];
            }
            if(biggest3995 == 1){
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
          else {
            thread3996(tdone,ends);
            thread3997(tdone,ends);
            int biggest3998 = 0;
            if(ends[2]>=biggest3998){
              biggest3998=ends[2];
            }
            if(ends[3]>=biggest3998){
              biggest3998=ends[3];
            }
            if(biggest3998 == 1){
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
            //FINXME code
            if(biggest3998 == 0){
              thread3999(tdone,ends);
              thread4000(tdone,ends);
              int biggest4001 = 0;
              if(ends[2]>=biggest4001){
                biggest4001=ends[2];
              }
              if(ends[3]>=biggest4001){
                biggest4001=ends[3];
              }
              if(biggest4001 == 1){
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
    char [] active1 = {1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0};
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
          motConveyorOnOff.gethook();
          df = true;
        }
        runClockDomain();
      }
      motConveyorOnOff.setpreclear();
      conveyorEngaged.setpreclear();
      conveyorEngaged_GUI.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = motConveyorOnOff.getStatus() ? motConveyorOnOff.setprepresent() : motConveyorOnOff.setpreclear();
      motConveyorOnOff.setpreval(motConveyorOnOff.getValue());
      motConveyorOnOff.setClear();
      conveyorEngaged.sethook();
      conveyorEngaged.setClear();
      conveyorEngaged_GUI.sethook();
      conveyorEngaged_GUI.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        motConveyorOnOff.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
