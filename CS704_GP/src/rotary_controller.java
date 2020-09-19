import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class rotary_controller extends ClockDomain{
  public rotary_controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.INPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.INPUT);
  public Signal readyConveyor = new Signal("readyConveyor", Signal.INPUT);
  public Signal readyFiller = new Signal("readyFiller", Signal.INPUT);
  public Signal readyLidLoader = new Signal("readyLidLoader", Signal.INPUT);
  public Signal readyCapper = new Signal("readyCapper", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  private int S37 = 1;
  private int S3 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S37){
        case 0 : 
          S37=0;
          break RUN;
        
        case 1 : 
          S37=2;
          S37=2;
          S3=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S3){
            case 0 : 
              if(readyConveyor.getprestatus() && readyFiller.getprestatus() && readyLidLoader.getprestatus() && readyCapper.getprestatus()){//sysj/rotary_controller.sysj line: 15, column: 10
                S3=1;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 1 : 
              if(!capOnBottleAtPos1.getprestatus() && !bottleAtPos5.getprestatus()){//sysj/rotary_controller.sysj line: 16, column: 10
                S3=2;
                rotaryTableTrigger.setPresent();//sysj/rotary_controller.sysj line: 18, column: 4
                currsigs.addElement(rotaryTableTrigger);
                System.out.println("Emitted rotaryTableTrigger");
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 2 : 
              if(tableAlignedWithSensor.getprestatus()){//sysj/rotary_controller.sysj line: 17, column: 10
                S3=0;
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              else {
                rotaryTableTrigger.setPresent();//sysj/rotary_controller.sysj line: 18, column: 4
                currsigs.addElement(rotaryTableTrigger);
                System.out.println("Emitted rotaryTableTrigger");
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
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
          tableAlignedWithSensor.gethook();
          bottleAtPos5.gethook();
          capOnBottleAtPos1.gethook();
          readyConveyor.gethook();
          readyFiller.gethook();
          readyLidLoader.gethook();
          readyCapper.gethook();
          df = true;
        }
        runClockDomain();
      }
      tableAlignedWithSensor.setpreclear();
      bottleAtPos5.setpreclear();
      capOnBottleAtPos1.setpreclear();
      readyConveyor.setpreclear();
      readyFiller.setpreclear();
      readyLidLoader.setpreclear();
      readyCapper.setpreclear();
      rotaryTableTrigger.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = bottleAtPos5.getStatus() ? bottleAtPos5.setprepresent() : bottleAtPos5.setpreclear();
      bottleAtPos5.setpreval(bottleAtPos5.getValue());
      bottleAtPos5.setClear();
      dummyint = capOnBottleAtPos1.getStatus() ? capOnBottleAtPos1.setprepresent() : capOnBottleAtPos1.setpreclear();
      capOnBottleAtPos1.setpreval(capOnBottleAtPos1.getValue());
      capOnBottleAtPos1.setClear();
      dummyint = readyConveyor.getStatus() ? readyConveyor.setprepresent() : readyConveyor.setpreclear();
      readyConveyor.setpreval(readyConveyor.getValue());
      readyConveyor.setClear();
      dummyint = readyFiller.getStatus() ? readyFiller.setprepresent() : readyFiller.setpreclear();
      readyFiller.setpreval(readyFiller.getValue());
      readyFiller.setClear();
      dummyint = readyLidLoader.getStatus() ? readyLidLoader.setprepresent() : readyLidLoader.setpreclear();
      readyLidLoader.setpreval(readyLidLoader.getValue());
      readyLidLoader.setClear();
      dummyint = readyCapper.getStatus() ? readyCapper.setprepresent() : readyCapper.setpreclear();
      readyCapper.setpreval(readyCapper.getValue());
      readyCapper.setClear();
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        tableAlignedWithSensor.gethook();
        bottleAtPos5.gethook();
        capOnBottleAtPos1.gethook();
        readyConveyor.gethook();
        readyFiller.gethook();
        readyLidLoader.gethook();
        readyCapper.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
