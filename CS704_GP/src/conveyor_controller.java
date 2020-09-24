import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class conveyor_controller extends ClockDomain{
  public conveyor_controller(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos1c = new Signal("bottleAtPos1c", Signal.INPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.INPUT);
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.OUTPUT);
  public output_Channel readyConveyor_o = new output_Channel();
  private int S3981 = 1;
  private int S3980 = 1;
  private int S3900 = 1;
  private int S3895 = 1;
  private int S3923 = 1;
  private int S3931 = 1;
  
  private int[] ends = new int[4];
  private int[] tdone = new int[4];
  
  public void thread3996(int [] tdone, int [] ends){
        switch(S3931){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(!motConveyorOnOff.getprestatus()){//sysj\conveyor_controller.sysj line: 17, column: 12
          System.out.println("CONVEYOR OFF");//sysj\conveyor_controller.sysj line: 18, column: 5
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
      
    }
  }

  public void thread3995(int [] tdone, int [] ends){
        switch(S3923){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 11, column: 4
        currsigs.addElement(motConveyorOnOff);
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
        break;
      
    }
  }

  public void thread3993(int [] tdone, int [] ends){
        S3931=1;
    if(!motConveyorOnOff.getprestatus()){//sysj\conveyor_controller.sysj line: 17, column: 12
      System.out.println("CONVEYOR OFF");//sysj\conveyor_controller.sysj line: 18, column: 5
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread3992(int [] tdone, int [] ends){
        S3923=1;
    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 11, column: 4
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread3990(int [] tdone, int [] ends){
        S3931=1;
    if(!motConveyorOnOff.getprestatus()){//sysj\conveyor_controller.sysj line: 17, column: 12
      System.out.println("CONVEYOR OFF");//sysj\conveyor_controller.sysj line: 18, column: 5
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread3989(int [] tdone, int [] ends){
        S3923=1;
    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 11, column: 4
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread3987(int [] tdone, int [] ends){
        S3931=1;
    if(!motConveyorOnOff.getprestatus()){//sysj\conveyor_controller.sysj line: 17, column: 12
      System.out.println("CONVEYOR OFF");//sysj\conveyor_controller.sysj line: 18, column: 5
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread3986(int [] tdone, int [] ends){
        S3923=1;
    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 11, column: 4
    currsigs.addElement(motConveyorOnOff);
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread3984(int [] tdone, int [] ends){
        S3931=1;
    if(!motConveyorOnOff.getprestatus()){//sysj\conveyor_controller.sysj line: 17, column: 12
      System.out.println("CONVEYOR OFF");//sysj\conveyor_controller.sysj line: 18, column: 5
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread3983(int [] tdone, int [] ends){
        S3923=1;
    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 11, column: 4
    currsigs.addElement(motConveyorOnOff);
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
      switch(S3981){
        case 0 : 
          S3981=0;
          break RUN;
        
        case 1 : 
          S3981=2;
          S3981=2;
          S3980=0;
          S3900=0;
          if(!readyConveyor_o.isPartnerPresent() || readyConveyor_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 8, column: 2
            readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 2
            S3900=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S3895=0;
            if(readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 2
              readyConveyor_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 8, column: 2
              S3895=1;
              if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 2
                readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 2
                ends[1]=2;
                ;//sysj\conveyor_controller.sysj line: 8, column: 2
                S3980=1;
                thread3983(tdone,ends);
                thread3984(tdone,ends);
                int biggest3985 = 0;
                if(ends[2]>=biggest3985){
                  biggest3985=ends[2];
                }
                if(ends[3]>=biggest3985){
                  biggest3985=ends[3];
                }
                if(biggest3985 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            }
            else {
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
        
        case 2 : 
          switch(S3980){
            case 0 : 
              switch(S3900){
                case 0 : 
                  if(!readyConveyor_o.isPartnerPresent() || readyConveyor_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 8, column: 2
                    readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 2
                    S3900=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S3895){
                      case 0 : 
                        if(readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 2
                          readyConveyor_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 8, column: 2
                          S3895=1;
                          if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 2
                            readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 2
                            ends[1]=2;
                            ;//sysj\conveyor_controller.sysj line: 8, column: 2
                            S3980=1;
                            thread3986(tdone,ends);
                            thread3987(tdone,ends);
                            int biggest3988 = 0;
                            if(ends[2]>=biggest3988){
                              biggest3988=ends[2];
                            }
                            if(ends[3]>=biggest3988){
                              biggest3988=ends[3];
                            }
                            if(biggest3988 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 2
                          readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 2
                          ends[1]=2;
                          ;//sysj\conveyor_controller.sysj line: 8, column: 2
                          S3980=1;
                          thread3989(tdone,ends);
                          thread3990(tdone,ends);
                          int biggest3991 = 0;
                          if(ends[2]>=biggest3991){
                            biggest3991=ends[2];
                          }
                          if(ends[3]>=biggest3991){
                            biggest3991=ends[3];
                          }
                          if(biggest3991 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3900=1;
                  S3900=0;
                  if(!readyConveyor_o.isPartnerPresent() || readyConveyor_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 8, column: 2
                    readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 2
                    S3900=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S3895=0;
                    if(readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 2
                      readyConveyor_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 8, column: 2
                      S3895=1;
                      if(!readyConveyor_o.isACK()){//sysj\conveyor_controller.sysj line: 8, column: 2
                        readyConveyor_o.setREQ(false);//sysj\conveyor_controller.sysj line: 8, column: 2
                        ends[1]=2;
                        ;//sysj\conveyor_controller.sysj line: 8, column: 2
                        S3980=1;
                        thread3992(tdone,ends);
                        thread3993(tdone,ends);
                        int biggest3994 = 0;
                        if(ends[2]>=biggest3994){
                          biggest3994=ends[2];
                        }
                        if(ends[3]>=biggest3994){
                          biggest3994=ends[3];
                        }
                        if(biggest3994 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread3995(tdone,ends);
              thread3996(tdone,ends);
              int biggest3997 = 0;
              if(ends[2]>=biggest3997){
                biggest3997=ends[2];
              }
              if(ends[3]>=biggest3997){
                biggest3997=ends[3];
              }
              if(biggest3997 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest3997 == 0){
                S3981=0;
                active[1]=0;
                ends[1]=0;
                S3981=0;
                break RUN;
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
          readyConveyor_o.gethook();
          bottleAtPos1c.gethook();
          bottleLeftPos5.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos1c.setpreclear();
      bottleLeftPos5.setpreclear();
      motConveyorOnOff.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos1c.getStatus() ? bottleAtPos1c.setprepresent() : bottleAtPos1c.setpreclear();
      bottleAtPos1c.setpreval(bottleAtPos1c.getValue());
      bottleAtPos1c.setClear();
      dummyint = bottleLeftPos5.getStatus() ? bottleLeftPos5.setprepresent() : bottleLeftPos5.setpreclear();
      bottleLeftPos5.setpreval(bottleLeftPos5.getValue());
      bottleLeftPos5.setClear();
      motConveyorOnOff.sethook();
      motConveyorOnOff.setClear();
      readyConveyor_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        readyConveyor_o.gethook();
        bottleAtPos1c.gethook();
        bottleLeftPos5.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
