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
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.INPUT);
  public Signal bottleAtPos5 = new Signal("bottleAtPos5", Signal.INPUT);
  public Signal conveyorEngaged = new Signal("conveyorEngaged", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  public Signal load = new Signal("load", Signal.OUTPUT);
  public Signal deload = new Signal("deload", Signal.OUTPUT);
  public input_Channel newOrder_in = new input_Channel();
  public input_Channel readyConveyor_in = new input_Channel();
  public input_Channel readyFiller_in = new input_Channel();
  public input_Channel readyLidLoader_in = new input_Channel();
  public input_Channel readyCapper_in = new input_Channel();
  private Signal rC_1;
  private Signal rF_1;
  private Signal rL_1;
  private Signal rCa_1;
  private int S1168 = 1;
  private int S41 = 1;
  private int S7 = 1;
  private int S160 = 1;
  private int S80 = 1;
  private int S48 = 1;
  private int S43 = 1;
  private int S192 = 1;
  private int S170 = 1;
  private int S1166 = 1;
  private int S435 = 1;
  private int S433 = 1;
  private int S265 = 1;
  private int S217 = 1;
  private int S201 = 1;
  private int S196 = 1;
  private int S273 = 1;
  private int S267 = 1;
  private int S678 = 1;
  private int S676 = 1;
  private int S508 = 1;
  private int S460 = 1;
  private int S444 = 1;
  private int S439 = 1;
  private int S516 = 1;
  private int S921 = 1;
  private int S919 = 1;
  private int S751 = 1;
  private int S703 = 1;
  private int S687 = 1;
  private int S682 = 1;
  private int S759 = 1;
  private int S1164 = 1;
  private int S1162 = 1;
  private int S994 = 1;
  private int S946 = 1;
  private int S930 = 1;
  private int S925 = 1;
  private int S1002 = 1;
  
  private int[] ends = new int[26];
  private int[] tdone = new int[26];
  
  public void thread1245(int [] tdone, int [] ends){
        S1002=1;
    if((readyCapper_in.getVal() == null ? null : ((Boolean)readyCapper_in.getVal())) == Boolean.TRUE){//sysj/rotary_controller.sysj line: 16, column: 8
      rCa_1.setPresent();//sysj/rotary_controller.sysj line: 17, column: 6
      currsigs.addElement(rCa_1);
      System.out.println("Emitted rCa_1");
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread1244(int [] tdone, int [] ends){
        S994=1;
    S946=0;
    S930=0;
    if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
      readyCapper_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
      S930=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S925=0;
      if(!readyCapper_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
        readyCapper_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
        S925=1;
        if(readyCapper_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
          readyCapper_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
          ends[24]=2;
          ;//sysj/rotary_controller.sysj line: 9, column: 5
          S946=1;
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        else {
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
      }
      else {
        active[24]=1;
        ends[24]=1;
        tdone[24]=1;
      }
    }
  }

  public void thread1242(int [] tdone, int [] ends){
        switch(S1002){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if((readyCapper_in.getVal() == null ? null : ((Boolean)readyCapper_in.getVal())) == Boolean.TRUE){//sysj/rotary_controller.sysj line: 16, column: 8
          rCa_1.setPresent();//sysj/rotary_controller.sysj line: 17, column: 6
          currsigs.addElement(rCa_1);
          System.out.println("Emitted rCa_1");
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        else {
          active[25]=1;
          ends[25]=1;
          tdone[25]=1;
        }
        break;
      
    }
  }

  public void thread1241(int [] tdone, int [] ends){
        switch(S994){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S946){
          case 0 : 
            switch(S930){
              case 0 : 
                if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyCapper_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  S930=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  switch(S925){
                    case 0 : 
                      if(!readyCapper_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                        readyCapper_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                        S925=1;
                        if(readyCapper_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                          readyCapper_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                          ends[24]=2;
                          ;//sysj/rotary_controller.sysj line: 9, column: 5
                          S946=1;
                          active[24]=1;
                          ends[24]=1;
                          tdone[24]=1;
                        }
                        else {
                          active[24]=1;
                          ends[24]=1;
                          tdone[24]=1;
                        }
                      }
                      else {
                        active[24]=1;
                        ends[24]=1;
                        tdone[24]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(readyCapper_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                        readyCapper_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                        ends[24]=2;
                        ;//sysj/rotary_controller.sysj line: 9, column: 5
                        S946=1;
                        active[24]=1;
                        ends[24]=1;
                        tdone[24]=1;
                      }
                      else {
                        active[24]=1;
                        ends[24]=1;
                        tdone[24]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S930=1;
                S930=0;
                if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyCapper_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  S930=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  S925=0;
                  if(!readyCapper_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                    readyCapper_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                    S925=1;
                    if(readyCapper_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                      readyCapper_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                      ends[24]=2;
                      ;//sysj/rotary_controller.sysj line: 9, column: 5
                      S946=1;
                      active[24]=1;
                      ends[24]=1;
                      tdone[24]=1;
                    }
                    else {
                      active[24]=1;
                      ends[24]=1;
                      tdone[24]=1;
                    }
                  }
                  else {
                    active[24]=1;
                    ends[24]=1;
                    tdone[24]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S946=1;
            S946=0;
            S930=0;
            if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
              readyCapper_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
              S930=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              S925=0;
              if(!readyCapper_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                readyCapper_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                S925=1;
                if(readyCapper_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyCapper_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  ends[24]=2;
                  ;//sysj/rotary_controller.sysj line: 9, column: 5
                  S946=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
              }
              else {
                active[24]=1;
                ends[24]=1;
                tdone[24]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1240(int [] tdone, int [] ends){
        switch(S1162){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        thread1241(tdone,ends);
        thread1242(tdone,ends);
        int biggest1243 = 0;
        if(ends[24]>=biggest1243){
          biggest1243=ends[24];
        }
        if(ends[25]>=biggest1243){
          biggest1243=ends[25];
        }
        if(biggest1243 == 1){
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        //FINXME code
        if(biggest1243 == 0){
          thread1244(tdone,ends);
          thread1245(tdone,ends);
          int biggest1246 = 0;
          if(ends[24]>=biggest1246){
            biggest1246=ends[24];
          }
          if(ends[25]>=biggest1246){
            biggest1246=ends[25];
          }
          if(biggest1246 == 1){
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        break;
      
    }
  }

  public void thread1239(int [] tdone, int [] ends){
        active[22]=0;
    ends[22]=0;
    tdone[22]=1;
  }

  public void thread1238(int [] tdone, int [] ends){
        switch(S1164){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        thread1239(tdone,ends);
        thread1240(tdone,ends);
        int biggest1247 = 0;
        if(ends[22]>=biggest1247){
          biggest1247=ends[22];
        }
        if(ends[23]>=biggest1247){
          biggest1247=ends[23];
        }
        if(biggest1247 == 1){
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        //FINXME code
        if(biggest1247 == 0){
          S1164=0;
          active[21]=0;
          ends[21]=0;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread1235(int [] tdone, int [] ends){
        S759=1;
    if((readyLidLoader_in.getVal() == null ? null : ((Boolean)readyLidLoader_in.getVal())) == Boolean.TRUE){//sysj/rotary_controller.sysj line: 16, column: 8
      rL_1.setPresent();//sysj/rotary_controller.sysj line: 17, column: 6
      currsigs.addElement(rL_1);
      System.out.println("Emitted rL_1");
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread1234(int [] tdone, int [] ends){
        S751=1;
    S703=0;
    S687=0;
    if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
      readyLidLoader_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
      S687=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S682=0;
      if(!readyLidLoader_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
        readyLidLoader_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
        S682=1;
        if(readyLidLoader_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
          readyLidLoader_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
          ends[19]=2;
          ;//sysj/rotary_controller.sysj line: 9, column: 5
          S703=1;
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        else {
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
      }
      else {
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
    }
  }

  public void thread1232(int [] tdone, int [] ends){
        switch(S759){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if((readyLidLoader_in.getVal() == null ? null : ((Boolean)readyLidLoader_in.getVal())) == Boolean.TRUE){//sysj/rotary_controller.sysj line: 16, column: 8
          rL_1.setPresent();//sysj/rotary_controller.sysj line: 17, column: 6
          currsigs.addElement(rL_1);
          System.out.println("Emitted rL_1");
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        else {
          active[20]=1;
          ends[20]=1;
          tdone[20]=1;
        }
        break;
      
    }
  }

  public void thread1231(int [] tdone, int [] ends){
        switch(S751){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S703){
          case 0 : 
            switch(S687){
              case 0 : 
                if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyLidLoader_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  S687=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  switch(S682){
                    case 0 : 
                      if(!readyLidLoader_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                        readyLidLoader_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                        S682=1;
                        if(readyLidLoader_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                          readyLidLoader_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                          ends[19]=2;
                          ;//sysj/rotary_controller.sysj line: 9, column: 5
                          S703=1;
                          active[19]=1;
                          ends[19]=1;
                          tdone[19]=1;
                        }
                        else {
                          active[19]=1;
                          ends[19]=1;
                          tdone[19]=1;
                        }
                      }
                      else {
                        active[19]=1;
                        ends[19]=1;
                        tdone[19]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(readyLidLoader_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                        readyLidLoader_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                        ends[19]=2;
                        ;//sysj/rotary_controller.sysj line: 9, column: 5
                        S703=1;
                        active[19]=1;
                        ends[19]=1;
                        tdone[19]=1;
                      }
                      else {
                        active[19]=1;
                        ends[19]=1;
                        tdone[19]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S687=1;
                S687=0;
                if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyLidLoader_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  S687=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  S682=0;
                  if(!readyLidLoader_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                    readyLidLoader_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                    S682=1;
                    if(readyLidLoader_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                      readyLidLoader_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                      ends[19]=2;
                      ;//sysj/rotary_controller.sysj line: 9, column: 5
                      S703=1;
                      active[19]=1;
                      ends[19]=1;
                      tdone[19]=1;
                    }
                    else {
                      active[19]=1;
                      ends[19]=1;
                      tdone[19]=1;
                    }
                  }
                  else {
                    active[19]=1;
                    ends[19]=1;
                    tdone[19]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S703=1;
            S703=0;
            S687=0;
            if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
              readyLidLoader_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
              S687=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              S682=0;
              if(!readyLidLoader_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                readyLidLoader_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                S682=1;
                if(readyLidLoader_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyLidLoader_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  ends[19]=2;
                  ;//sysj/rotary_controller.sysj line: 9, column: 5
                  S703=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
              }
              else {
                active[19]=1;
                ends[19]=1;
                tdone[19]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1230(int [] tdone, int [] ends){
        switch(S919){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        thread1231(tdone,ends);
        thread1232(tdone,ends);
        int biggest1233 = 0;
        if(ends[19]>=biggest1233){
          biggest1233=ends[19];
        }
        if(ends[20]>=biggest1233){
          biggest1233=ends[20];
        }
        if(biggest1233 == 1){
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        //FINXME code
        if(biggest1233 == 0){
          thread1234(tdone,ends);
          thread1235(tdone,ends);
          int biggest1236 = 0;
          if(ends[19]>=biggest1236){
            biggest1236=ends[19];
          }
          if(ends[20]>=biggest1236){
            biggest1236=ends[20];
          }
          if(biggest1236 == 1){
            active[18]=1;
            ends[18]=1;
            tdone[18]=1;
          }
        }
        break;
      
    }
  }

  public void thread1229(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread1228(int [] tdone, int [] ends){
        switch(S921){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        thread1229(tdone,ends);
        thread1230(tdone,ends);
        int biggest1237 = 0;
        if(ends[17]>=biggest1237){
          biggest1237=ends[17];
        }
        if(ends[18]>=biggest1237){
          biggest1237=ends[18];
        }
        if(biggest1237 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        //FINXME code
        if(biggest1237 == 0){
          S921=0;
          active[16]=0;
          ends[16]=0;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread1225(int [] tdone, int [] ends){
        S516=1;
    if((readyFiller_in.getVal() == null ? null : ((Boolean)readyFiller_in.getVal())) == Boolean.TRUE){//sysj/rotary_controller.sysj line: 16, column: 8
      rF_1.setPresent();//sysj/rotary_controller.sysj line: 17, column: 6
      currsigs.addElement(rF_1);
      System.out.println("Emitted rF_1");
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread1224(int [] tdone, int [] ends){
        S508=1;
    S460=0;
    S444=0;
    if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
      readyFiller_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
      S444=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S439=0;
      if(!readyFiller_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
        readyFiller_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
        S439=1;
        if(readyFiller_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
          readyFiller_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
          ends[14]=2;
          ;//sysj/rotary_controller.sysj line: 9, column: 5
          S460=1;
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
      }
      else {
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
      }
    }
  }

  public void thread1222(int [] tdone, int [] ends){
        switch(S516){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if((readyFiller_in.getVal() == null ? null : ((Boolean)readyFiller_in.getVal())) == Boolean.TRUE){//sysj/rotary_controller.sysj line: 16, column: 8
          rF_1.setPresent();//sysj/rotary_controller.sysj line: 17, column: 6
          currsigs.addElement(rF_1);
          System.out.println("Emitted rF_1");
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread1221(int [] tdone, int [] ends){
        switch(S508){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S460){
          case 0 : 
            switch(S444){
              case 0 : 
                if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyFiller_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  S444=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  switch(S439){
                    case 0 : 
                      if(!readyFiller_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                        readyFiller_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                        S439=1;
                        if(readyFiller_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                          readyFiller_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                          ends[14]=2;
                          ;//sysj/rotary_controller.sysj line: 9, column: 5
                          S460=1;
                          active[14]=1;
                          ends[14]=1;
                          tdone[14]=1;
                        }
                        else {
                          active[14]=1;
                          ends[14]=1;
                          tdone[14]=1;
                        }
                      }
                      else {
                        active[14]=1;
                        ends[14]=1;
                        tdone[14]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(readyFiller_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                        readyFiller_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                        ends[14]=2;
                        ;//sysj/rotary_controller.sysj line: 9, column: 5
                        S460=1;
                        active[14]=1;
                        ends[14]=1;
                        tdone[14]=1;
                      }
                      else {
                        active[14]=1;
                        ends[14]=1;
                        tdone[14]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S444=1;
                S444=0;
                if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyFiller_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  S444=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  S439=0;
                  if(!readyFiller_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                    readyFiller_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                    S439=1;
                    if(readyFiller_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                      readyFiller_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                      ends[14]=2;
                      ;//sysj/rotary_controller.sysj line: 9, column: 5
                      S460=1;
                      active[14]=1;
                      ends[14]=1;
                      tdone[14]=1;
                    }
                    else {
                      active[14]=1;
                      ends[14]=1;
                      tdone[14]=1;
                    }
                  }
                  else {
                    active[14]=1;
                    ends[14]=1;
                    tdone[14]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S460=1;
            S460=0;
            S444=0;
            if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
              readyFiller_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
              S444=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              S439=0;
              if(!readyFiller_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                readyFiller_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                S439=1;
                if(readyFiller_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyFiller_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  ends[14]=2;
                  ;//sysj/rotary_controller.sysj line: 9, column: 5
                  S460=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
              }
              else {
                active[14]=1;
                ends[14]=1;
                tdone[14]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1220(int [] tdone, int [] ends){
        switch(S676){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        thread1221(tdone,ends);
        thread1222(tdone,ends);
        int biggest1223 = 0;
        if(ends[14]>=biggest1223){
          biggest1223=ends[14];
        }
        if(ends[15]>=biggest1223){
          biggest1223=ends[15];
        }
        if(biggest1223 == 1){
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        //FINXME code
        if(biggest1223 == 0){
          thread1224(tdone,ends);
          thread1225(tdone,ends);
          int biggest1226 = 0;
          if(ends[14]>=biggest1226){
            biggest1226=ends[14];
          }
          if(ends[15]>=biggest1226){
            biggest1226=ends[15];
          }
          if(biggest1226 == 1){
            active[13]=1;
            ends[13]=1;
            tdone[13]=1;
          }
        }
        break;
      
    }
  }

  public void thread1219(int [] tdone, int [] ends){
        active[12]=0;
    ends[12]=0;
    tdone[12]=1;
  }

  public void thread1218(int [] tdone, int [] ends){
        switch(S678){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread1219(tdone,ends);
        thread1220(tdone,ends);
        int biggest1227 = 0;
        if(ends[12]>=biggest1227){
          biggest1227=ends[12];
        }
        if(ends[13]>=biggest1227){
          biggest1227=ends[13];
        }
        if(biggest1227 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest1227 == 0){
          S678=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread1215(int [] tdone, int [] ends){
        S273=1;
    S267=0;
    if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj/rotary_controller.sysj line: 16, column: 8
      rC_1.setPresent();//sysj/rotary_controller.sysj line: 17, column: 6
      currsigs.addElement(rC_1);
      System.out.println("Emitted rC_1");
      S267=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S267=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread1214(int [] tdone, int [] ends){
        S265=1;
    S217=0;
    S201=0;
    if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
      readyConveyor_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
      S201=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S196=0;
      if(!readyConveyor_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
        readyConveyor_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
        S196=1;
        if(readyConveyor_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
          readyConveyor_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
          ends[9]=2;
          ;//sysj/rotary_controller.sysj line: 9, column: 5
          S217=1;
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
      else {
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
      }
    }
  }

  public void thread1212(int [] tdone, int [] ends){
        switch(S273){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S267){
          case 0 : 
            S267=0;
            if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj/rotary_controller.sysj line: 16, column: 8
              rC_1.setPresent();//sysj/rotary_controller.sysj line: 17, column: 6
              currsigs.addElement(rC_1);
              System.out.println("Emitted rC_1");
              S267=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S267=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            S267=1;
            S267=0;
            if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj/rotary_controller.sysj line: 16, column: 8
              rC_1.setPresent();//sysj/rotary_controller.sysj line: 17, column: 6
              currsigs.addElement(rC_1);
              System.out.println("Emitted rC_1");
              S267=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S267=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1211(int [] tdone, int [] ends){
        switch(S265){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S217){
          case 0 : 
            switch(S201){
              case 0 : 
                if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyConveyor_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  S201=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  switch(S196){
                    case 0 : 
                      if(!readyConveyor_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                        readyConveyor_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                        S196=1;
                        if(readyConveyor_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                          readyConveyor_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                          ends[9]=2;
                          ;//sysj/rotary_controller.sysj line: 9, column: 5
                          S217=1;
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
                      else {
                        active[9]=1;
                        ends[9]=1;
                        tdone[9]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(readyConveyor_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                        readyConveyor_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                        ends[9]=2;
                        ;//sysj/rotary_controller.sysj line: 9, column: 5
                        S217=1;
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
                break;
              
              case 1 : 
                S201=1;
                S201=0;
                if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyConveyor_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  S201=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  S196=0;
                  if(!readyConveyor_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                    readyConveyor_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                    S196=1;
                    if(readyConveyor_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                      readyConveyor_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                      ends[9]=2;
                      ;//sysj/rotary_controller.sysj line: 9, column: 5
                      S217=1;
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
                  else {
                    active[9]=1;
                    ends[9]=1;
                    tdone[9]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S217=1;
            S217=0;
            S201=0;
            if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
              readyConveyor_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
              S201=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S196=0;
              if(!readyConveyor_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                readyConveyor_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                S196=1;
                if(readyConveyor_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyConveyor_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  ends[9]=2;
                  ;//sysj/rotary_controller.sysj line: 9, column: 5
                  S217=1;
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
              else {
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1210(int [] tdone, int [] ends){
        switch(S433){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread1211(tdone,ends);
        thread1212(tdone,ends);
        int biggest1213 = 0;
        if(ends[9]>=biggest1213){
          biggest1213=ends[9];
        }
        if(ends[10]>=biggest1213){
          biggest1213=ends[10];
        }
        if(biggest1213 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest1213 == 0){
          thread1214(tdone,ends);
          thread1215(tdone,ends);
          int biggest1216 = 0;
          if(ends[9]>=biggest1216){
            biggest1216=ends[9];
          }
          if(ends[10]>=biggest1216){
            biggest1216=ends[10];
          }
          if(biggest1216 == 1){
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
        }
        break;
      
    }
  }

  public void thread1209(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread1208(int [] tdone, int [] ends){
        switch(S435){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread1209(tdone,ends);
        thread1210(tdone,ends);
        int biggest1217 = 0;
        if(ends[7]>=biggest1217){
          biggest1217=ends[7];
        }
        if(ends[8]>=biggest1217){
          biggest1217=ends[8];
        }
        if(biggest1217 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest1217 == 0){
          S435=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread1207(int [] tdone, int [] ends){
        switch(S1166){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread1208(tdone,ends);
        thread1218(tdone,ends);
        thread1228(tdone,ends);
        thread1238(tdone,ends);
        int biggest1248 = 0;
        if(ends[6]>=biggest1248){
          biggest1248=ends[6];
        }
        if(ends[11]>=biggest1248){
          biggest1248=ends[11];
        }
        if(ends[16]>=biggest1248){
          biggest1248=ends[16];
        }
        if(ends[21]>=biggest1248){
          biggest1248=ends[21];
        }
        if(biggest1248 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest1248 == 0){
          S1166=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread1206(int [] tdone, int [] ends){
        switch(S192){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S170){
          case 0 : 
            if(bottleAtPos5.getprestatus() && conveyorEngaged.getprestatus()){//sysj/rotary_controller.sysj line: 64, column: 10
              S170=1;
              deload.setPresent();//sysj/rotary_controller.sysj line: 66, column: 5
              currsigs.addElement(deload);
              System.out.println("Emitted deload");
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
            if(!bottleAtPos5.getprestatus()){//sysj/rotary_controller.sysj line: 65, column: 10
              S170=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              deload.setPresent();//sysj/rotary_controller.sysj line: 66, column: 5
              currsigs.addElement(deload);
              System.out.println("Emitted deload");
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            S170=2;
            S170=0;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1205(int [] tdone, int [] ends){
        switch(S160){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S80){
          case 0 : 
            switch(S48){
              case 0 : 
                if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 53, column: 4
                  newOrder_in.setACK(false);//sysj/rotary_controller.sysj line: 53, column: 4
                  S48=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S43){
                    case 0 : 
                      if(!newOrder_in.isREQ()){//sysj/rotary_controller.sysj line: 53, column: 4
                        newOrder_in.setACK(true);//sysj/rotary_controller.sysj line: 53, column: 4
                        S43=1;
                        if(newOrder_in.isREQ()){//sysj/rotary_controller.sysj line: 53, column: 4
                          newOrder_in.setACK(false);//sysj/rotary_controller.sysj line: 53, column: 4
                          ends[3]=2;
                          ;//sysj/rotary_controller.sysj line: 53, column: 4
                          S80=1;
                          load.setPresent();//sysj/rotary_controller.sysj line: 56, column: 5
                          currsigs.addElement(load);
                          System.out.println("Emitted load");
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
                      else {
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(newOrder_in.isREQ()){//sysj/rotary_controller.sysj line: 53, column: 4
                        newOrder_in.setACK(false);//sysj/rotary_controller.sysj line: 53, column: 4
                        ends[3]=2;
                        ;//sysj/rotary_controller.sysj line: 53, column: 4
                        S80=1;
                        load.setPresent();//sysj/rotary_controller.sysj line: 56, column: 5
                        currsigs.addElement(load);
                        System.out.println("Emitted load");
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
                break;
              
              case 1 : 
                S48=1;
                S48=0;
                if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 53, column: 4
                  newOrder_in.setACK(false);//sysj/rotary_controller.sysj line: 53, column: 4
                  S48=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S43=0;
                  if(!newOrder_in.isREQ()){//sysj/rotary_controller.sysj line: 53, column: 4
                    newOrder_in.setACK(true);//sysj/rotary_controller.sysj line: 53, column: 4
                    S43=1;
                    if(newOrder_in.isREQ()){//sysj/rotary_controller.sysj line: 53, column: 4
                      newOrder_in.setACK(false);//sysj/rotary_controller.sysj line: 53, column: 4
                      ends[3]=2;
                      ;//sysj/rotary_controller.sysj line: 53, column: 4
                      S80=1;
                      load.setPresent();//sysj/rotary_controller.sysj line: 56, column: 5
                      currsigs.addElement(load);
                      System.out.println("Emitted load");
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
                  else {
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            if(bottleAtPos1.getprestatus()){//sysj/rotary_controller.sysj line: 55, column: 10
              S80=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              load.setPresent();//sysj/rotary_controller.sysj line: 56, column: 5
              currsigs.addElement(load);
              System.out.println("Emitted load");
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            S80=2;
            S80=0;
            S48=0;
            if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 53, column: 4
              newOrder_in.setACK(false);//sysj/rotary_controller.sysj line: 53, column: 4
              S48=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S43=0;
              if(!newOrder_in.isREQ()){//sysj/rotary_controller.sysj line: 53, column: 4
                newOrder_in.setACK(true);//sysj/rotary_controller.sysj line: 53, column: 4
                S43=1;
                if(newOrder_in.isREQ()){//sysj/rotary_controller.sysj line: 53, column: 4
                  newOrder_in.setACK(false);//sysj/rotary_controller.sysj line: 53, column: 4
                  ends[3]=2;
                  ;//sysj/rotary_controller.sysj line: 53, column: 4
                  S80=1;
                  load.setPresent();//sysj/rotary_controller.sysj line: 56, column: 5
                  currsigs.addElement(load);
                  System.out.println("Emitted load");
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
              else {
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1204(int [] tdone, int [] ends){
        switch(S41){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S7){
          case 0 : 
            if(rC_1.getprestatus() && rF_1.getprestatus() && rL_1.getprestatus() && rCa_1.getprestatus()){//sysj/rotary_controller.sysj line: 42, column: 11
              S7=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            if(!bottleAtPos5.getprestatus()){//sysj/rotary_controller.sysj line: 43, column: 11
              S7=2;
              rotaryTableTrigger.setPresent();//sysj/rotary_controller.sysj line: 46, column: 5
              currsigs.addElement(rotaryTableTrigger);
              System.out.println("Emitted rotaryTableTrigger");
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj/rotary_controller.sysj line: 44, column: 11
              S7=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj/rotary_controller.sysj line: 46, column: 5
              currsigs.addElement(rotaryTableTrigger);
              System.out.println("Emitted rotaryTableTrigger");
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1199(int [] tdone, int [] ends){
        S1002=1;
    if((readyCapper_in.getVal() == null ? null : ((Boolean)readyCapper_in.getVal())) == Boolean.TRUE){//sysj/rotary_controller.sysj line: 16, column: 8
      rCa_1.setPresent();//sysj/rotary_controller.sysj line: 17, column: 6
      currsigs.addElement(rCa_1);
      System.out.println("Emitted rCa_1");
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
  }

  public void thread1198(int [] tdone, int [] ends){
        S994=1;
    S946=0;
    S930=0;
    if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
      readyCapper_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
      S930=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S925=0;
      if(!readyCapper_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
        readyCapper_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
        S925=1;
        if(readyCapper_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
          readyCapper_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
          ends[24]=2;
          ;//sysj/rotary_controller.sysj line: 9, column: 5
          S946=1;
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
        else {
          active[24]=1;
          ends[24]=1;
          tdone[24]=1;
        }
      }
      else {
        active[24]=1;
        ends[24]=1;
        tdone[24]=1;
      }
    }
  }

  public void thread1197(int [] tdone, int [] ends){
        S1162=1;
    thread1198(tdone,ends);
    thread1199(tdone,ends);
    int biggest1200 = 0;
    if(ends[24]>=biggest1200){
      biggest1200=ends[24];
    }
    if(ends[25]>=biggest1200){
      biggest1200=ends[25];
    }
    if(biggest1200 == 1){
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread1196(int [] tdone, int [] ends){
        active[22]=0;
    ends[22]=0;
    tdone[22]=1;
  }

  public void thread1195(int [] tdone, int [] ends){
        S1164=1;
    thread1196(tdone,ends);
    thread1197(tdone,ends);
    int biggest1201 = 0;
    if(ends[22]>=biggest1201){
      biggest1201=ends[22];
    }
    if(ends[23]>=biggest1201){
      biggest1201=ends[23];
    }
    if(biggest1201 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread1192(int [] tdone, int [] ends){
        S759=1;
    if((readyLidLoader_in.getVal() == null ? null : ((Boolean)readyLidLoader_in.getVal())) == Boolean.TRUE){//sysj/rotary_controller.sysj line: 16, column: 8
      rL_1.setPresent();//sysj/rotary_controller.sysj line: 17, column: 6
      currsigs.addElement(rL_1);
      System.out.println("Emitted rL_1");
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
  }

  public void thread1191(int [] tdone, int [] ends){
        S751=1;
    S703=0;
    S687=0;
    if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
      readyLidLoader_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
      S687=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S682=0;
      if(!readyLidLoader_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
        readyLidLoader_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
        S682=1;
        if(readyLidLoader_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
          readyLidLoader_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
          ends[19]=2;
          ;//sysj/rotary_controller.sysj line: 9, column: 5
          S703=1;
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
        else {
          active[19]=1;
          ends[19]=1;
          tdone[19]=1;
        }
      }
      else {
        active[19]=1;
        ends[19]=1;
        tdone[19]=1;
      }
    }
  }

  public void thread1190(int [] tdone, int [] ends){
        S919=1;
    thread1191(tdone,ends);
    thread1192(tdone,ends);
    int biggest1193 = 0;
    if(ends[19]>=biggest1193){
      biggest1193=ends[19];
    }
    if(ends[20]>=biggest1193){
      biggest1193=ends[20];
    }
    if(biggest1193 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread1189(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread1188(int [] tdone, int [] ends){
        S921=1;
    thread1189(tdone,ends);
    thread1190(tdone,ends);
    int biggest1194 = 0;
    if(ends[17]>=biggest1194){
      biggest1194=ends[17];
    }
    if(ends[18]>=biggest1194){
      biggest1194=ends[18];
    }
    if(biggest1194 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread1185(int [] tdone, int [] ends){
        S516=1;
    if((readyFiller_in.getVal() == null ? null : ((Boolean)readyFiller_in.getVal())) == Boolean.TRUE){//sysj/rotary_controller.sysj line: 16, column: 8
      rF_1.setPresent();//sysj/rotary_controller.sysj line: 17, column: 6
      currsigs.addElement(rF_1);
      System.out.println("Emitted rF_1");
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread1184(int [] tdone, int [] ends){
        S508=1;
    S460=0;
    S444=0;
    if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
      readyFiller_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
      S444=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S439=0;
      if(!readyFiller_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
        readyFiller_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
        S439=1;
        if(readyFiller_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
          readyFiller_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
          ends[14]=2;
          ;//sysj/rotary_controller.sysj line: 9, column: 5
          S460=1;
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
      }
      else {
        active[14]=1;
        ends[14]=1;
        tdone[14]=1;
      }
    }
  }

  public void thread1183(int [] tdone, int [] ends){
        S676=1;
    thread1184(tdone,ends);
    thread1185(tdone,ends);
    int biggest1186 = 0;
    if(ends[14]>=biggest1186){
      biggest1186=ends[14];
    }
    if(ends[15]>=biggest1186){
      biggest1186=ends[15];
    }
    if(biggest1186 == 1){
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread1182(int [] tdone, int [] ends){
        active[12]=0;
    ends[12]=0;
    tdone[12]=1;
  }

  public void thread1181(int [] tdone, int [] ends){
        S678=1;
    thread1182(tdone,ends);
    thread1183(tdone,ends);
    int biggest1187 = 0;
    if(ends[12]>=biggest1187){
      biggest1187=ends[12];
    }
    if(ends[13]>=biggest1187){
      biggest1187=ends[13];
    }
    if(biggest1187 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread1178(int [] tdone, int [] ends){
        S273=1;
    S267=0;
    if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj/rotary_controller.sysj line: 16, column: 8
      rC_1.setPresent();//sysj/rotary_controller.sysj line: 17, column: 6
      currsigs.addElement(rC_1);
      System.out.println("Emitted rC_1");
      S267=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S267=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread1177(int [] tdone, int [] ends){
        S265=1;
    S217=0;
    S201=0;
    if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
      readyConveyor_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
      S201=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S196=0;
      if(!readyConveyor_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
        readyConveyor_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
        S196=1;
        if(readyConveyor_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
          readyConveyor_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
          ends[9]=2;
          ;//sysj/rotary_controller.sysj line: 9, column: 5
          S217=1;
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
      else {
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
      }
    }
  }

  public void thread1176(int [] tdone, int [] ends){
        S433=1;
    thread1177(tdone,ends);
    thread1178(tdone,ends);
    int biggest1179 = 0;
    if(ends[9]>=biggest1179){
      biggest1179=ends[9];
    }
    if(ends[10]>=biggest1179){
      biggest1179=ends[10];
    }
    if(biggest1179 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread1175(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread1174(int [] tdone, int [] ends){
        S435=1;
    thread1175(tdone,ends);
    thread1176(tdone,ends);
    int biggest1180 = 0;
    if(ends[7]>=biggest1180){
      biggest1180=ends[7];
    }
    if(ends[8]>=biggest1180){
      biggest1180=ends[8];
    }
    if(biggest1180 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread1173(int [] tdone, int [] ends){
        S1166=1;
    thread1174(tdone,ends);
    thread1181(tdone,ends);
    thread1188(tdone,ends);
    thread1195(tdone,ends);
    int biggest1202 = 0;
    if(ends[6]>=biggest1202){
      biggest1202=ends[6];
    }
    if(ends[11]>=biggest1202){
      biggest1202=ends[11];
    }
    if(ends[16]>=biggest1202){
      biggest1202=ends[16];
    }
    if(ends[21]>=biggest1202){
      biggest1202=ends[21];
    }
    if(biggest1202 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1172(int [] tdone, int [] ends){
        S192=1;
    S170=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1171(int [] tdone, int [] ends){
        S160=1;
    S80=0;
    S48=0;
    if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 53, column: 4
      newOrder_in.setACK(false);//sysj/rotary_controller.sysj line: 53, column: 4
      S48=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S43=0;
      if(!newOrder_in.isREQ()){//sysj/rotary_controller.sysj line: 53, column: 4
        newOrder_in.setACK(true);//sysj/rotary_controller.sysj line: 53, column: 4
        S43=1;
        if(newOrder_in.isREQ()){//sysj/rotary_controller.sysj line: 53, column: 4
          newOrder_in.setACK(false);//sysj/rotary_controller.sysj line: 53, column: 4
          ends[3]=2;
          ;//sysj/rotary_controller.sysj line: 53, column: 4
          S80=1;
          load.setPresent();//sysj/rotary_controller.sysj line: 56, column: 5
          currsigs.addElement(load);
          System.out.println("Emitted load");
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
      else {
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
    }
  }

  public void thread1170(int [] tdone, int [] ends){
        S41=1;
    S7=0;
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
      switch(S1168){
        case 0 : 
          S1168=0;
          break RUN;
        
        case 1 : 
          S1168=2;
          S1168=2;
          rC_1.setClear();//sysj/rotary_controller.sysj line: 39, column: 2
          rF_1.setClear();//sysj/rotary_controller.sysj line: 39, column: 2
          rL_1.setClear();//sysj/rotary_controller.sysj line: 39, column: 2
          rCa_1.setClear();//sysj/rotary_controller.sysj line: 39, column: 2
          thread1170(tdone,ends);
          thread1171(tdone,ends);
          thread1172(tdone,ends);
          thread1173(tdone,ends);
          int biggest1203 = 0;
          if(ends[2]>=biggest1203){
            biggest1203=ends[2];
          }
          if(ends[3]>=biggest1203){
            biggest1203=ends[3];
          }
          if(ends[4]>=biggest1203){
            biggest1203=ends[4];
          }
          if(ends[5]>=biggest1203){
            biggest1203=ends[5];
          }
          if(biggest1203 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rC_1.setClear();//sysj/rotary_controller.sysj line: 39, column: 2
          rF_1.setClear();//sysj/rotary_controller.sysj line: 39, column: 2
          rL_1.setClear();//sysj/rotary_controller.sysj line: 39, column: 2
          rCa_1.setClear();//sysj/rotary_controller.sysj line: 39, column: 2
          thread1204(tdone,ends);
          thread1205(tdone,ends);
          thread1206(tdone,ends);
          thread1207(tdone,ends);
          int biggest1249 = 0;
          if(ends[2]>=biggest1249){
            biggest1249=ends[2];
          }
          if(ends[3]>=biggest1249){
            biggest1249=ends[3];
          }
          if(ends[4]>=biggest1249){
            biggest1249=ends[4];
          }
          if(ends[5]>=biggest1249){
            biggest1249=ends[5];
          }
          if(biggest1249 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1249 == 0){
            S1168=0;
            active[1]=0;
            ends[1]=0;
            S1168=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    rC_1 = new Signal();
    rF_1 = new Signal();
    rL_1 = new Signal();
    rCa_1 = new Signal();
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
          newOrder_in.gethook();
          readyConveyor_in.gethook();
          readyFiller_in.gethook();
          readyLidLoader_in.gethook();
          readyCapper_in.gethook();
          tableAlignedWithSensor.gethook();
          bottleAtPos1.gethook();
          bottleAtPos5.gethook();
          conveyorEngaged.gethook();
          df = true;
        }
        runClockDomain();
      }
      tableAlignedWithSensor.setpreclear();
      bottleAtPos1.setpreclear();
      bottleAtPos5.setpreclear();
      conveyorEngaged.setpreclear();
      rotaryTableTrigger.setpreclear();
      load.setpreclear();
      deload.setpreclear();
      rC_1.setpreclear();
      rF_1.setpreclear();
      rL_1.setpreclear();
      rCa_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = bottleAtPos1.getStatus() ? bottleAtPos1.setprepresent() : bottleAtPos1.setpreclear();
      bottleAtPos1.setpreval(bottleAtPos1.getValue());
      bottleAtPos1.setClear();
      dummyint = bottleAtPos5.getStatus() ? bottleAtPos5.setprepresent() : bottleAtPos5.setpreclear();
      bottleAtPos5.setpreval(bottleAtPos5.getValue());
      bottleAtPos5.setClear();
      dummyint = conveyorEngaged.getStatus() ? conveyorEngaged.setprepresent() : conveyorEngaged.setpreclear();
      conveyorEngaged.setpreval(conveyorEngaged.getValue());
      conveyorEngaged.setClear();
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      load.sethook();
      load.setClear();
      deload.sethook();
      deload.setClear();
      rC_1.setClear();
      rF_1.setClear();
      rL_1.setClear();
      rCa_1.setClear();
      newOrder_in.sethook();
      readyConveyor_in.sethook();
      readyFiller_in.sethook();
      readyLidLoader_in.sethook();
      readyCapper_in.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        newOrder_in.gethook();
        readyConveyor_in.gethook();
        readyFiller_in.gethook();
        readyLidLoader_in.gethook();
        readyCapper_in.gethook();
        tableAlignedWithSensor.gethook();
        bottleAtPos1.gethook();
        bottleAtPos5.gethook();
        conveyorEngaged.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
