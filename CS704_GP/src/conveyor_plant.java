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
  private int S4043 = 1;
  private int S4002 = 1;
  private int S4007 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread4055(int [] tdone, int [] ends){
        S4007=1;
    conveyorEngaged_GUI.setPresent();//sysj\conveyor_plant.sysj line: 16, column: 5
    currsigs.addElement(conveyorEngaged_GUI);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread4054(int [] tdone, int [] ends){
        S4002=1;
    conveyorEngaged.setPresent();//sysj\conveyor_plant.sysj line: 12, column: 5
    currsigs.addElement(conveyorEngaged);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread4052(int [] tdone, int [] ends){
        switch(S4007){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        conveyorEngaged_GUI.setPresent();//sysj\conveyor_plant.sysj line: 16, column: 5
        currsigs.addElement(conveyorEngaged_GUI);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread4051(int [] tdone, int [] ends){
        switch(S4002){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        conveyorEngaged.setPresent();//sysj\conveyor_plant.sysj line: 12, column: 5
        currsigs.addElement(conveyorEngaged);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread4049(int [] tdone, int [] ends){
        S4007=1;
    conveyorEngaged_GUI.setPresent();//sysj\conveyor_plant.sysj line: 16, column: 5
    currsigs.addElement(conveyorEngaged_GUI);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread4048(int [] tdone, int [] ends){
        S4002=1;
    conveyorEngaged.setPresent();//sysj\conveyor_plant.sysj line: 12, column: 5
    currsigs.addElement(conveyorEngaged);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread4046(int [] tdone, int [] ends){
        S4007=1;
    conveyorEngaged_GUI.setPresent();//sysj\conveyor_plant.sysj line: 16, column: 5
    currsigs.addElement(conveyorEngaged_GUI);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread4045(int [] tdone, int [] ends){
        S4002=1;
    conveyorEngaged.setPresent();//sysj\conveyor_plant.sysj line: 12, column: 5
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
      switch(S4043){
        case 0 : 
          S4043=0;
          break RUN;
        
        case 1 : 
          S4043=2;
          S4043=2;
          thread4045(tdone,ends);
          thread4046(tdone,ends);
          int biggest4047 = 0;
          if(ends[2]>=biggest4047){
            biggest4047=ends[2];
          }
          if(ends[3]>=biggest4047){
            biggest4047=ends[3];
          }
          if(biggest4047 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          if(!motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 10, column: 9
            thread4048(tdone,ends);
            thread4049(tdone,ends);
            int biggest4050 = 0;
            if(ends[2]>=biggest4050){
              biggest4050=ends[2];
            }
            if(ends[3]>=biggest4050){
              biggest4050=ends[3];
            }
            if(biggest4050 == 1){
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
          else {
            thread4051(tdone,ends);
            thread4052(tdone,ends);
            int biggest4053 = 0;
            if(ends[2]>=biggest4053){
              biggest4053=ends[2];
            }
            if(ends[3]>=biggest4053){
              biggest4053=ends[3];
            }
            if(biggest4053 == 1){
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
            //FINXME code
            if(biggest4053 == 0){
              thread4054(tdone,ends);
              thread4055(tdone,ends);
              int biggest4056 = 0;
              if(ends[2]>=biggest4056){
                biggest4056=ends[2];
              }
              if(ends[3]>=biggest4056){
                biggest4056=ends[3];
              }
              if(biggest4056 == 1){
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
