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
  private int S6569 = 1;
  private int S6561 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S6569){
        case 0 : 
          S6569=0;
          break RUN;
        
        case 1 : 
          S6569=2;
          S6569=2;
          S6561=0;
          conveyorEngaged.setPresent();//sysj\conveyor_plant.sysj line: 12, column: 5
          currsigs.addElement(conveyorEngaged);
          conveyorEngaged_GUI.setPresent();//sysj\conveyor_plant.sysj line: 13, column: 5
          currsigs.addElement(conveyorEngaged_GUI);
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S6561){
            case 0 : 
              if(!motConveyorOnOff.getprestatus()){//sysj\conveyor_plant.sysj line: 11, column: 10
                S6561=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                S6561=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              S6561=1;
              S6561=0;
              conveyorEngaged.setPresent();//sysj\conveyor_plant.sysj line: 12, column: 5
              currsigs.addElement(conveyorEngaged);
              conveyorEngaged_GUI.setPresent();//sysj\conveyor_plant.sysj line: 13, column: 5
              currsigs.addElement(conveyorEngaged_GUI);
              active[1]=1;
              ends[1]=1;
              break RUN;
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1};
    char [] paused1 = {0, 0};
    char [] suspended1 = {0, 0};
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
