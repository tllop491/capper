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
  private int S6209 = 1;
  private int S6203 = 1;
  private int S6195 = 1;
  private int S6207 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread6215(int [] tdone, int [] ends){
        switch(S6207){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        S6207=0;
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread6214(int [] tdone, int [] ends){
        switch(S6203){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S6195){
          case 0 : 
            if(!motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 11, column: 10
              S6195=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S6195=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            S6195=1;
            S6195=0;
            conveyorEngaged.setPresent();//sysj\conveyor_plant.sysj line: 11, column: 30
            currsigs.addElement(conveyorEngaged);
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread6212(int [] tdone, int [] ends){
        S6207=1;
    if(conveyorEngaged.getprestatus()){//sysj\conveyor_plant.sysj line: 17, column: 11
      conveyorEngaged_GUI.setPresent();//sysj\conveyor_plant.sysj line: 18, column: 4
      currsigs.addElement(conveyorEngaged_GUI);
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S6207=0;
      active[3]=0;
      ends[3]=0;
      tdone[3]=1;
    }
  }

  public void thread6211(int [] tdone, int [] ends){
        S6203=1;
    S6195=0;
    conveyorEngaged.setPresent();//sysj\conveyor_plant.sysj line: 11, column: 30
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
      switch(S6209){
        case 0 : 
          S6209=0;
          break RUN;
        
        case 1 : 
          S6209=2;
          S6209=2;
          thread6211(tdone,ends);
          thread6212(tdone,ends);
          int biggest6213 = 0;
          if(ends[2]>=biggest6213){
            biggest6213=ends[2];
          }
          if(ends[3]>=biggest6213){
            biggest6213=ends[3];
          }
          if(biggest6213 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread6214(tdone,ends);
          thread6215(tdone,ends);
          int biggest6216 = 0;
          if(ends[2]>=biggest6216){
            biggest6216=ends[2];
          }
          if(ends[3]>=biggest6216){
            biggest6216=ends[3];
          }
          if(biggest6216 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest6216 == 0){
            S6209=0;
            active[1]=0;
            ends[1]=0;
            S6209=0;
            break RUN;
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
