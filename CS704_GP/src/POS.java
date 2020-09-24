import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import java.io.IOException;//sysj\POS.sysj line: 1, column: 1

public class POS extends ClockDomain{
  public POS(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal liquidDataI = new Signal("liquidDataI", Signal.INPUT);
  public output_Channel liquidDataC_o = new output_Channel();
  private int S161281 = 1;
  private int S160804 = 1;
  private int S160811 = 1;
  private int S160806 = 1;
  
  private int[] ends = new int[2];
  private int[] tdone = new int[2];
  
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S161281){
        case 0 : 
          S161281=0;
          break RUN;
        
        case 1 : 
          S161281=2;
          S161281=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\POS.sysj line: 7, column: 3
            public void run() {//sysj\POS.sysj line: 9, column: 21
              try {//sysj\POS.sysj line: 10, column: 8
                POS_GUI.main(null);//sysj\POS.sysj line: 11, column: 5
              }
              catch (IOException a) {//sysj\POS.sysj line: 12, column: 27
              }
            }
            GUI(){//sysj\POS.sysj line: 8, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\POS.sysj line: 16, column: 2
          S160804=0;
          active[1]=1;
          ends[1]=1;
          break RUN;
        
        case 2 : 
          switch(S160804){
            case 0 : 
              if(liquidDataI.getprestatus()){//sysj\POS.sysj line: 20, column: 10
                S160804=1;
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
              if(!liquidDataI.getprestatus()){//sysj\POS.sysj line: 21, column: 10
                System.out.println("POS RECIEVED LIQUID DATA FROM POS_GUI");//sysj\POS.sysj line: 22, column: 4
                System.out.println("POS SEND LIQUID DATA TO BUFFER");//sysj\POS.sysj line: 23, column: 4
                S160804=2;
                S160811=0;
                if(!liquidDataC_o.isPartnerPresent() || liquidDataC_o.isPartnerPreempted()){//sysj\POS.sysj line: 24, column: 4
                  liquidDataC_o.setREQ(false);//sysj\POS.sysj line: 24, column: 4
                  S160811=1;
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
                else {
                  S160806=0;
                  if(liquidDataC_o.isACK()){//sysj\POS.sysj line: 24, column: 4
                    liquidDataC_o.setVal((ArrayList)(liquidDataI.getpreval() == null ? null : ((ArrayList)liquidDataI.getpreval())));//sysj\POS.sysj line: 24, column: 4
                    S160806=1;
                    if(!liquidDataC_o.isACK()){//sysj\POS.sysj line: 24, column: 4
                      liquidDataC_o.setREQ(false);//sysj\POS.sysj line: 24, column: 4
                      ends[1]=2;
                      ;//sysj\POS.sysj line: 24, column: 4
                      S160804=0;
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
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
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            
            case 2 : 
              switch(S160811){
                case 0 : 
                  if(!liquidDataC_o.isPartnerPresent() || liquidDataC_o.isPartnerPreempted()){//sysj\POS.sysj line: 24, column: 4
                    liquidDataC_o.setREQ(false);//sysj\POS.sysj line: 24, column: 4
                    S160811=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S160806){
                      case 0 : 
                        if(liquidDataC_o.isACK()){//sysj\POS.sysj line: 24, column: 4
                          liquidDataC_o.setVal((ArrayList)(liquidDataI.getpreval() == null ? null : ((ArrayList)liquidDataI.getpreval())));//sysj\POS.sysj line: 24, column: 4
                          S160806=1;
                          if(!liquidDataC_o.isACK()){//sysj\POS.sysj line: 24, column: 4
                            liquidDataC_o.setREQ(false);//sysj\POS.sysj line: 24, column: 4
                            ends[1]=2;
                            ;//sysj\POS.sysj line: 24, column: 4
                            S160804=0;
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
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
                        if(!liquidDataC_o.isACK()){//sysj\POS.sysj line: 24, column: 4
                          liquidDataC_o.setREQ(false);//sysj\POS.sysj line: 24, column: 4
                          ends[1]=2;
                          ;//sysj\POS.sysj line: 24, column: 4
                          S160804=0;
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
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
                  S160811=1;
                  S160811=0;
                  if(!liquidDataC_o.isPartnerPresent() || liquidDataC_o.isPartnerPreempted()){//sysj\POS.sysj line: 24, column: 4
                    liquidDataC_o.setREQ(false);//sysj\POS.sysj line: 24, column: 4
                    S160811=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S160806=0;
                    if(liquidDataC_o.isACK()){//sysj\POS.sysj line: 24, column: 4
                      liquidDataC_o.setVal((ArrayList)(liquidDataI.getpreval() == null ? null : ((ArrayList)liquidDataI.getpreval())));//sysj\POS.sysj line: 24, column: 4
                      S160806=1;
                      if(!liquidDataC_o.isACK()){//sysj\POS.sysj line: 24, column: 4
                        liquidDataC_o.setREQ(false);//sysj\POS.sysj line: 24, column: 4
                        ends[1]=2;
                        ;//sysj\POS.sysj line: 24, column: 4
                        S160804=0;
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
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
          liquidDataC_o.gethook();
          liquidDataI.gethook();
          df = true;
        }
        runClockDomain();
      }
      liquidDataI.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = liquidDataI.getStatus() ? liquidDataI.setprepresent() : liquidDataI.setpreclear();
      liquidDataI.setpreval(liquidDataI.getValue());
      liquidDataI.setClear();
      liquidDataC_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        liquidDataC_o.gethook();
        liquidDataI.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
