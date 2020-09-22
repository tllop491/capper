import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import rotaryTable.*;//sysj\rotary_plant.sysj line: 1, column: 1

public class rotary_plant extends ClockDomain{
  public rotary_plant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.INPUT);
  public Signal load = new Signal("load", Signal.INPUT);
  public Signal deload = new Signal("deload", Signal.INPUT);
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.OUTPUT);
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.OUTPUT);
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.OUTPUT);
  public Signal bottleAtPos3 = new Signal("bottleAtPos3", Signal.OUTPUT);
  public Signal bottleAtPos4 = new Signal("bottleAtPos4", Signal.OUTPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.OUTPUT);
  public Signal bottleAtPos5_c = new Signal("bottleAtPos5_c", Signal.OUTPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.OUTPUT);
  private rotaryTable rt_thread_1;//sysj\rotary_plant.sysj line: 11, column: 2
  private long __start_thread_2;//sysj\rotary_plant.sysj line: 15, column: 41
  private int S132096 = 1;
  private int S131738 = 1;
  private int S131562 = 1;
  private int S131532 = 1;
  private int S131507 = 1;
  private int S131746 = 1;
  private int S131740 = 1;
  private int S131754 = 1;
  private int S131748 = 1;
  private int S131799 = 1;
  private int S131762 = 1;
  private int S131770 = 1;
  private int S131778 = 1;
  private int S131786 = 1;
  private int S131797 = 1;
  
  private int[] ends = new int[11];
  private int[] tdone = new int[11];
  
  public void thread132117(int [] tdone, int [] ends){
        switch(S131797){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(rt.index[4] == true){//sysj\rotary_plant.sysj line: 92, column: 9
          bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 93, column: 6
          currsigs.addElement(bottleAtPos5);
          System.out.println("Emitted bottleAtPos5");
          bottleAtPos5_c.setPresent();//sysj\rotary_plant.sysj line: 94, column: 6
          currsigs.addElement(bottleAtPos5_c);
          System.out.println("Emitted bottleAtPos5_c");
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

  public void thread132116(int [] tdone, int [] ends){
        switch(S131786){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(rt.index[3] == true){//sysj\rotary_plant.sysj line: 83, column: 9
          bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 84, column: 6
          currsigs.addElement(bottleAtPos4);
          System.out.println("Emitted bottleAtPos4");
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

  public void thread132115(int [] tdone, int [] ends){
        switch(S131778){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(rt.index[2] == true){//sysj\rotary_plant.sysj line: 74, column: 9
          bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 75, column: 6
          currsigs.addElement(bottleAtPos3);
          System.out.println("Emitted bottleAtPos3");
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

  public void thread132114(int [] tdone, int [] ends){
        switch(S131770){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(rt.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 9
          bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 6
          currsigs.addElement(bottleAtPos2);
          System.out.println("Emitted bottleAtPos2");
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

  public void thread132113(int [] tdone, int [] ends){
        switch(S131762){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(rt.index[0] == true){//sysj\rotary_plant.sysj line: 56, column: 9
          bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 57, column: 6
          currsigs.addElement(bottleAtPos1);
          System.out.println("Emitted bottleAtPos1");
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread132112(int [] tdone, int [] ends){
        switch(S131799){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread132113(tdone,ends);
        thread132114(tdone,ends);
        thread132115(tdone,ends);
        thread132116(tdone,ends);
        thread132117(tdone,ends);
        int biggest132118 = 0;
        if(ends[6]>=biggest132118){
          biggest132118=ends[6];
        }
        if(ends[7]>=biggest132118){
          biggest132118=ends[7];
        }
        if(ends[8]>=biggest132118){
          biggest132118=ends[8];
        }
        if(ends[9]>=biggest132118){
          biggest132118=ends[9];
        }
        if(ends[10]>=biggest132118){
          biggest132118=ends[10];
        }
        if(biggest132118 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest132118 == 0){
          S131799=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread132111(int [] tdone, int [] ends){
        switch(S131754){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S131748){
          case 0 : 
            if(deload.getprestatus()){//sysj\rotary_plant.sysj line: 43, column: 10
              rt.print();//sysj\rotary_plant.sysj line: 44, column: 4
              System.out.println("DELOADING");//sysj\rotary_plant.sysj line: 45, column: 4
              rt.deload();//sysj\rotary_plant.sysj line: 46, column: 4
              rt.print();//sysj\rotary_plant.sysj line: 47, column: 4
              bottleLeftPos5.setPresent();//sysj\rotary_plant.sysj line: 48, column: 4
              currsigs.addElement(bottleLeftPos5);
              System.out.println("Emitted bottleLeftPos5");
              S131748=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            S131748=1;
            S131748=0;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread132110(int [] tdone, int [] ends){
        switch(S131746){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S131740){
          case 0 : 
            if(load.getprestatus()){//sysj\rotary_plant.sysj line: 32, column: 10
              rt.print();//sysj\rotary_plant.sysj line: 33, column: 4
              System.out.println("LOADING");//sysj\rotary_plant.sysj line: 34, column: 4
              rt.load();//sysj\rotary_plant.sysj line: 35, column: 4
              rt.print();//sysj\rotary_plant.sysj line: 36, column: 4
              S131740=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S131740=1;
            S131740=0;
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread132109(int [] tdone, int [] ends){
        switch(S131738){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S131562){
          case 0 : 
            if(rotaryTableTrigger.getprestatus()){//sysj\rotary_plant.sysj line: 14, column: 10
              S131562=1;
              if(!rotaryTableTrigger.getprestatus()){//sysj\rotary_plant.sysj line: 15, column: 20
                rt.print();//sysj\rotary_plant.sysj line: 20, column: 4
                System.out.println("SHIFTING");//sysj\rotary_plant.sysj line: 21, column: 4
                rt.shift();//sysj\rotary_plant.sysj line: 23, column: 4
                rt.print();//sysj\rotary_plant.sysj line: 25, column: 4
                S131562=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S131532=0;
                __start_thread_2 = com.systemj.Timer.getMs();//sysj\rotary_plant.sysj line: 15, column: 41
                S131507=0;
                if(com.systemj.Timer.getMs() - __start_thread_2 >= 500){//sysj\rotary_plant.sysj line: 15, column: 41
                  ends[2]=2;
                  ;//sysj\rotary_plant.sysj line: 15, column: 41
                  S131532=1;
                  tableAlignedWithSensor.setPresent();//sysj\rotary_plant.sysj line: 17, column: 5
                  currsigs.addElement(tableAlignedWithSensor);
                  System.out.println("Emitted tableAlignedWithSensor");
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S131507=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!rotaryTableTrigger.getprestatus()){//sysj\rotary_plant.sysj line: 15, column: 20
              rt.print();//sysj\rotary_plant.sysj line: 20, column: 4
              System.out.println("SHIFTING");//sysj\rotary_plant.sysj line: 21, column: 4
              rt.shift();//sysj\rotary_plant.sysj line: 23, column: 4
              rt.print();//sysj\rotary_plant.sysj line: 25, column: 4
              S131562=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              switch(S131532){
                case 0 : 
                  switch(S131507){
                    case 0 : 
                      S131507=0;
                      if(com.systemj.Timer.getMs() - __start_thread_2 >= 500){//sysj\rotary_plant.sysj line: 15, column: 41
                        ends[2]=2;
                        ;//sysj\rotary_plant.sysj line: 15, column: 41
                        S131532=1;
                        tableAlignedWithSensor.setPresent();//sysj\rotary_plant.sysj line: 17, column: 5
                        currsigs.addElement(tableAlignedWithSensor);
                        System.out.println("Emitted tableAlignedWithSensor");
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S131507=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 1 : 
                      S131507=1;
                      S131507=0;
                      if(com.systemj.Timer.getMs() - __start_thread_2 >= 500){//sysj\rotary_plant.sysj line: 15, column: 41
                        ends[2]=2;
                        ;//sysj\rotary_plant.sysj line: 15, column: 41
                        S131532=1;
                        tableAlignedWithSensor.setPresent();//sysj\rotary_plant.sysj line: 17, column: 5
                        currsigs.addElement(tableAlignedWithSensor);
                        System.out.println("Emitted tableAlignedWithSensor");
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S131507=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                  }
                  break;
                
                case 1 : 
                  tableAlignedWithSensor.setPresent();//sysj\rotary_plant.sysj line: 17, column: 5
                  currsigs.addElement(tableAlignedWithSensor);
                  System.out.println("Emitted tableAlignedWithSensor");
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread132106(int [] tdone, int [] ends){
        S131797=1;
    if(rt.index[4] == true){//sysj\rotary_plant.sysj line: 92, column: 9
      bottleAtPos5.setPresent();//sysj\rotary_plant.sysj line: 93, column: 6
      currsigs.addElement(bottleAtPos5);
      System.out.println("Emitted bottleAtPos5");
      bottleAtPos5_c.setPresent();//sysj\rotary_plant.sysj line: 94, column: 6
      currsigs.addElement(bottleAtPos5_c);
      System.out.println("Emitted bottleAtPos5_c");
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

  public void thread132105(int [] tdone, int [] ends){
        S131786=1;
    if(rt.index[3] == true){//sysj\rotary_plant.sysj line: 83, column: 9
      bottleAtPos4.setPresent();//sysj\rotary_plant.sysj line: 84, column: 6
      currsigs.addElement(bottleAtPos4);
      System.out.println("Emitted bottleAtPos4");
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

  public void thread132104(int [] tdone, int [] ends){
        S131778=1;
    if(rt.index[2] == true){//sysj\rotary_plant.sysj line: 74, column: 9
      bottleAtPos3.setPresent();//sysj\rotary_plant.sysj line: 75, column: 6
      currsigs.addElement(bottleAtPos3);
      System.out.println("Emitted bottleAtPos3");
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

  public void thread132103(int [] tdone, int [] ends){
        S131770=1;
    if(rt.index[1] == true){//sysj\rotary_plant.sysj line: 65, column: 9
      bottleAtPos2.setPresent();//sysj\rotary_plant.sysj line: 66, column: 6
      currsigs.addElement(bottleAtPos2);
      System.out.println("Emitted bottleAtPos2");
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

  public void thread132102(int [] tdone, int [] ends){
        S131762=1;
    if(rt.index[0] == true){//sysj\rotary_plant.sysj line: 56, column: 9
      bottleAtPos1.setPresent();//sysj\rotary_plant.sysj line: 57, column: 6
      currsigs.addElement(bottleAtPos1);
      System.out.println("Emitted bottleAtPos1");
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

  public void thread132101(int [] tdone, int [] ends){
        S131799=1;
    thread132102(tdone,ends);
    thread132103(tdone,ends);
    thread132104(tdone,ends);
    thread132105(tdone,ends);
    thread132106(tdone,ends);
    int biggest132107 = 0;
    if(ends[6]>=biggest132107){
      biggest132107=ends[6];
    }
    if(ends[7]>=biggest132107){
      biggest132107=ends[7];
    }
    if(ends[8]>=biggest132107){
      biggest132107=ends[8];
    }
    if(ends[9]>=biggest132107){
      biggest132107=ends[9];
    }
    if(ends[10]>=biggest132107){
      biggest132107=ends[10];
    }
    if(biggest132107 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread132100(int [] tdone, int [] ends){
        S131754=1;
    S131748=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread132099(int [] tdone, int [] ends){
        S131746=1;
    S131740=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread132098(int [] tdone, int [] ends){
        S131738=1;
    S131562=0;
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
      switch(S132096){
        case 0 : 
          S132096=0;
          break RUN;
        
        case 1 : 
          S132096=2;
          S132096=2;
          rt_thread_1 = new rotaryTable();//sysj\rotary_plant.sysj line: 11, column: 2
          thread132098(tdone,ends);
          thread132099(tdone,ends);
          thread132100(tdone,ends);
          thread132101(tdone,ends);
          int biggest132108 = 0;
          if(ends[2]>=biggest132108){
            biggest132108=ends[2];
          }
          if(ends[3]>=biggest132108){
            biggest132108=ends[3];
          }
          if(ends[4]>=biggest132108){
            biggest132108=ends[4];
          }
          if(ends[5]>=biggest132108){
            biggest132108=ends[5];
          }
          if(biggest132108 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread132109(tdone,ends);
          thread132110(tdone,ends);
          thread132111(tdone,ends);
          thread132112(tdone,ends);
          int biggest132119 = 0;
          if(ends[2]>=biggest132119){
            biggest132119=ends[2];
          }
          if(ends[3]>=biggest132119){
            biggest132119=ends[3];
          }
          if(ends[4]>=biggest132119){
            biggest132119=ends[4];
          }
          if(ends[5]>=biggest132119){
            biggest132119=ends[5];
          }
          if(biggest132119 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest132119 == 0){
            S132096=0;
            active[1]=0;
            ends[1]=0;
            S132096=0;
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
          rotaryTableTrigger.gethook();
          load.gethook();
          deload.gethook();
          df = true;
        }
        runClockDomain();
      }
      rotaryTableTrigger.setpreclear();
      load.setpreclear();
      deload.setpreclear();
      tableAlignedWithSensor.setpreclear();
      bottleAtPos1.setpreclear();
      bottleAtPos2.setpreclear();
      bottleAtPos3.setpreclear();
      bottleAtPos4.setpreclear();
      bottleAtPos5.setpreclear();
      bottleAtPos5_c.setpreclear();
      bottleLeftPos5.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = rotaryTableTrigger.getStatus() ? rotaryTableTrigger.setprepresent() : rotaryTableTrigger.setpreclear();
      rotaryTableTrigger.setpreval(rotaryTableTrigger.getValue());
      rotaryTableTrigger.setClear();
      dummyint = load.getStatus() ? load.setprepresent() : load.setpreclear();
      load.setpreval(load.getValue());
      load.setClear();
      dummyint = deload.getStatus() ? deload.setprepresent() : deload.setpreclear();
      deload.setpreval(deload.getValue());
      deload.setClear();
      tableAlignedWithSensor.sethook();
      tableAlignedWithSensor.setClear();
      bottleAtPos1.sethook();
      bottleAtPos1.setClear();
      bottleAtPos2.sethook();
      bottleAtPos2.setClear();
      bottleAtPos3.sethook();
      bottleAtPos3.setClear();
      bottleAtPos4.sethook();
      bottleAtPos4.setClear();
      bottleAtPos5.sethook();
      bottleAtPos5.setClear();
      bottleAtPos5_c.sethook();
      bottleAtPos5_c.setClear();
      bottleLeftPos5.sethook();
      bottleLeftPos5.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        rotaryTableTrigger.gethook();
        load.gethook();
        deload.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
