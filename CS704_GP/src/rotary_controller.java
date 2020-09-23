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
  private int S132341 = 1;
  private int S131214 = 1;
  private int S131180 = 1;
  private int S131333 = 1;
  private int S131253 = 1;
  private int S131221 = 1;
  private int S131216 = 1;
  private int S131365 = 1;
  private int S131343 = 1;
  private int S132339 = 1;
  private int S131608 = 1;
  private int S131606 = 1;
  private int S131438 = 1;
  private int S131390 = 1;
  private int S131374 = 1;
  private int S131369 = 1;
  private int S131446 = 1;
  private int S131440 = 1;
  private int S131851 = 1;
  private int S131849 = 1;
  private int S131681 = 1;
  private int S131633 = 1;
  private int S131617 = 1;
  private int S131612 = 1;
  private int S131689 = 1;
  private int S132094 = 1;
  private int S132092 = 1;
  private int S131924 = 1;
  private int S131876 = 1;
  private int S131860 = 1;
  private int S131855 = 1;
  private int S131932 = 1;
  private int S132337 = 1;
  private int S132335 = 1;
  private int S132167 = 1;
  private int S132119 = 1;
  private int S132103 = 1;
  private int S132098 = 1;
  private int S132175 = 1;
  
  private int[] ends = new int[26];
  private int[] tdone = new int[26];
  
  public void thread132418(int [] tdone, int [] ends){
        S132175=1;
    if((readyCapper_in.getVal() == null ? null : ((Boolean)readyCapper_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 8
      rCa_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 6
      currsigs.addElement(rCa_1);
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

  public void thread132417(int [] tdone, int [] ends){
        S132167=1;
    S132119=0;
    S132103=0;
    if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 5
      readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
      S132103=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S132098=0;
      if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
        readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 5
        S132098=1;
        if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
          readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
          ends[24]=2;
          ;//sysj\rotary_controller.sysj line: 9, column: 5
          S132119=1;
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

  public void thread132415(int [] tdone, int [] ends){
        switch(S132175){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if((readyCapper_in.getVal() == null ? null : ((Boolean)readyCapper_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 8
          rCa_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 6
          currsigs.addElement(rCa_1);
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

  public void thread132414(int [] tdone, int [] ends){
        switch(S132167){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S132119){
          case 0 : 
            switch(S132103){
              case 0 : 
                if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 5
                  readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                  S132103=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  switch(S132098){
                    case 0 : 
                      if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                        readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 5
                        S132098=1;
                        if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                          readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                          ends[24]=2;
                          ;//sysj\rotary_controller.sysj line: 9, column: 5
                          S132119=1;
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
                      if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                        readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                        ends[24]=2;
                        ;//sysj\rotary_controller.sysj line: 9, column: 5
                        S132119=1;
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
                S132103=1;
                S132103=0;
                if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 5
                  readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                  S132103=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  S132098=0;
                  if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                    readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 5
                    S132098=1;
                    if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                      readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                      ends[24]=2;
                      ;//sysj\rotary_controller.sysj line: 9, column: 5
                      S132119=1;
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
            S132119=1;
            S132119=0;
            S132103=0;
            if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 5
              readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
              S132103=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              S132098=0;
              if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 5
                S132098=1;
                if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                  readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                  ends[24]=2;
                  ;//sysj\rotary_controller.sysj line: 9, column: 5
                  S132119=1;
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

  public void thread132413(int [] tdone, int [] ends){
        switch(S132335){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        thread132414(tdone,ends);
        thread132415(tdone,ends);
        int biggest132416 = 0;
        if(ends[24]>=biggest132416){
          biggest132416=ends[24];
        }
        if(ends[25]>=biggest132416){
          biggest132416=ends[25];
        }
        if(biggest132416 == 1){
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        //FINXME code
        if(biggest132416 == 0){
          thread132417(tdone,ends);
          thread132418(tdone,ends);
          int biggest132419 = 0;
          if(ends[24]>=biggest132419){
            biggest132419=ends[24];
          }
          if(ends[25]>=biggest132419){
            biggest132419=ends[25];
          }
          if(biggest132419 == 1){
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        break;
      
    }
  }

  public void thread132412(int [] tdone, int [] ends){
        active[22]=0;
    ends[22]=0;
    tdone[22]=1;
  }

  public void thread132411(int [] tdone, int [] ends){
        switch(S132337){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        thread132412(tdone,ends);
        thread132413(tdone,ends);
        int biggest132420 = 0;
        if(ends[22]>=biggest132420){
          biggest132420=ends[22];
        }
        if(ends[23]>=biggest132420){
          biggest132420=ends[23];
        }
        if(biggest132420 == 1){
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        //FINXME code
        if(biggest132420 == 0){
          S132337=0;
          active[21]=0;
          ends[21]=0;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread132408(int [] tdone, int [] ends){
        S131932=1;
    if((readyLidLoader_in.getVal() == null ? null : ((Boolean)readyLidLoader_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 8
      rL_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 6
      currsigs.addElement(rL_1);
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

  public void thread132407(int [] tdone, int [] ends){
        S131924=1;
    S131876=0;
    S131860=0;
    if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 5
      readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
      S131860=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S131855=0;
      if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
        readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 5
        S131855=1;
        if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
          readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
          ends[19]=2;
          ;//sysj\rotary_controller.sysj line: 9, column: 5
          S131876=1;
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

  public void thread132405(int [] tdone, int [] ends){
        switch(S131932){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if((readyLidLoader_in.getVal() == null ? null : ((Boolean)readyLidLoader_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 8
          rL_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 6
          currsigs.addElement(rL_1);
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

  public void thread132404(int [] tdone, int [] ends){
        switch(S131924){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S131876){
          case 0 : 
            switch(S131860){
              case 0 : 
                if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 5
                  readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                  S131860=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  switch(S131855){
                    case 0 : 
                      if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                        readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 5
                        S131855=1;
                        if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                          readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                          ends[19]=2;
                          ;//sysj\rotary_controller.sysj line: 9, column: 5
                          S131876=1;
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
                      if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                        readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                        ends[19]=2;
                        ;//sysj\rotary_controller.sysj line: 9, column: 5
                        S131876=1;
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
                S131860=1;
                S131860=0;
                if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 5
                  readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                  S131860=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  S131855=0;
                  if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                    readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 5
                    S131855=1;
                    if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                      readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                      ends[19]=2;
                      ;//sysj\rotary_controller.sysj line: 9, column: 5
                      S131876=1;
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
            S131876=1;
            S131876=0;
            S131860=0;
            if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 5
              readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
              S131860=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              S131855=0;
              if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 5
                S131855=1;
                if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                  readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                  ends[19]=2;
                  ;//sysj\rotary_controller.sysj line: 9, column: 5
                  S131876=1;
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

  public void thread132403(int [] tdone, int [] ends){
        switch(S132092){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        thread132404(tdone,ends);
        thread132405(tdone,ends);
        int biggest132406 = 0;
        if(ends[19]>=biggest132406){
          biggest132406=ends[19];
        }
        if(ends[20]>=biggest132406){
          biggest132406=ends[20];
        }
        if(biggest132406 == 1){
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        //FINXME code
        if(biggest132406 == 0){
          thread132407(tdone,ends);
          thread132408(tdone,ends);
          int biggest132409 = 0;
          if(ends[19]>=biggest132409){
            biggest132409=ends[19];
          }
          if(ends[20]>=biggest132409){
            biggest132409=ends[20];
          }
          if(biggest132409 == 1){
            active[18]=1;
            ends[18]=1;
            tdone[18]=1;
          }
        }
        break;
      
    }
  }

  public void thread132402(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread132401(int [] tdone, int [] ends){
        switch(S132094){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        thread132402(tdone,ends);
        thread132403(tdone,ends);
        int biggest132410 = 0;
        if(ends[17]>=biggest132410){
          biggest132410=ends[17];
        }
        if(ends[18]>=biggest132410){
          biggest132410=ends[18];
        }
        if(biggest132410 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        //FINXME code
        if(biggest132410 == 0){
          S132094=0;
          active[16]=0;
          ends[16]=0;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread132398(int [] tdone, int [] ends){
        S131689=1;
    if((readyFiller_in.getVal() == null ? null : ((Boolean)readyFiller_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 8
      rF_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 6
      currsigs.addElement(rF_1);
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

  public void thread132397(int [] tdone, int [] ends){
        S131681=1;
    S131633=0;
    S131617=0;
    if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 5
      readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
      S131617=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S131612=0;
      if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
        readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 5
        S131612=1;
        if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
          readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
          ends[14]=2;
          ;//sysj\rotary_controller.sysj line: 9, column: 5
          S131633=1;
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

  public void thread132395(int [] tdone, int [] ends){
        switch(S131689){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if((readyFiller_in.getVal() == null ? null : ((Boolean)readyFiller_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 8
          rF_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 6
          currsigs.addElement(rF_1);
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

  public void thread132394(int [] tdone, int [] ends){
        switch(S131681){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S131633){
          case 0 : 
            switch(S131617){
              case 0 : 
                if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 5
                  readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                  S131617=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  switch(S131612){
                    case 0 : 
                      if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                        readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 5
                        S131612=1;
                        if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                          readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                          ends[14]=2;
                          ;//sysj\rotary_controller.sysj line: 9, column: 5
                          S131633=1;
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
                      if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                        readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                        ends[14]=2;
                        ;//sysj\rotary_controller.sysj line: 9, column: 5
                        S131633=1;
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
                S131617=1;
                S131617=0;
                if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 5
                  readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                  S131617=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  S131612=0;
                  if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                    readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 5
                    S131612=1;
                    if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                      readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                      ends[14]=2;
                      ;//sysj\rotary_controller.sysj line: 9, column: 5
                      S131633=1;
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
            S131633=1;
            S131633=0;
            S131617=0;
            if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 5
              readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
              S131617=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              S131612=0;
              if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 5
                S131612=1;
                if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                  readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                  ends[14]=2;
                  ;//sysj\rotary_controller.sysj line: 9, column: 5
                  S131633=1;
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

  public void thread132393(int [] tdone, int [] ends){
        switch(S131849){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        thread132394(tdone,ends);
        thread132395(tdone,ends);
        int biggest132396 = 0;
        if(ends[14]>=biggest132396){
          biggest132396=ends[14];
        }
        if(ends[15]>=biggest132396){
          biggest132396=ends[15];
        }
        if(biggest132396 == 1){
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        //FINXME code
        if(biggest132396 == 0){
          thread132397(tdone,ends);
          thread132398(tdone,ends);
          int biggest132399 = 0;
          if(ends[14]>=biggest132399){
            biggest132399=ends[14];
          }
          if(ends[15]>=biggest132399){
            biggest132399=ends[15];
          }
          if(biggest132399 == 1){
            active[13]=1;
            ends[13]=1;
            tdone[13]=1;
          }
        }
        break;
      
    }
  }

  public void thread132392(int [] tdone, int [] ends){
        active[12]=0;
    ends[12]=0;
    tdone[12]=1;
  }

  public void thread132391(int [] tdone, int [] ends){
        switch(S131851){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread132392(tdone,ends);
        thread132393(tdone,ends);
        int biggest132400 = 0;
        if(ends[12]>=biggest132400){
          biggest132400=ends[12];
        }
        if(ends[13]>=biggest132400){
          biggest132400=ends[13];
        }
        if(biggest132400 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest132400 == 0){
          S131851=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread132388(int [] tdone, int [] ends){
        S131446=1;
    S131440=0;
    if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 8
      rC_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 6
      currsigs.addElement(rC_1);
      S131440=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S131440=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread132387(int [] tdone, int [] ends){
        S131438=1;
    S131390=0;
    S131374=0;
    if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 5
      readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
      S131374=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S131369=0;
      if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
        readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 5
        S131369=1;
        if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
          readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
          ends[9]=2;
          ;//sysj\rotary_controller.sysj line: 9, column: 5
          S131390=1;
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

  public void thread132385(int [] tdone, int [] ends){
        switch(S131446){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S131440){
          case 0 : 
            S131440=0;
            if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 8
              rC_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 6
              currsigs.addElement(rC_1);
              S131440=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S131440=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            S131440=1;
            S131440=0;
            if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 8
              rC_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 6
              currsigs.addElement(rC_1);
              S131440=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S131440=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread132384(int [] tdone, int [] ends){
        switch(S131438){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S131390){
          case 0 : 
            switch(S131374){
              case 0 : 
                if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 5
                  readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                  S131374=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  switch(S131369){
                    case 0 : 
                      if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                        readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 5
                        S131369=1;
                        if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                          readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                          ends[9]=2;
                          ;//sysj\rotary_controller.sysj line: 9, column: 5
                          S131390=1;
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
                      if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                        readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                        ends[9]=2;
                        ;//sysj\rotary_controller.sysj line: 9, column: 5
                        S131390=1;
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
                S131374=1;
                S131374=0;
                if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 5
                  readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                  S131374=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  S131369=0;
                  if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                    readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 5
                    S131369=1;
                    if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                      readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                      ends[9]=2;
                      ;//sysj\rotary_controller.sysj line: 9, column: 5
                      S131390=1;
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
            S131390=1;
            S131390=0;
            S131374=0;
            if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 5
              readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
              S131374=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S131369=0;
              if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 5
                S131369=1;
                if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
                  readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
                  ends[9]=2;
                  ;//sysj\rotary_controller.sysj line: 9, column: 5
                  S131390=1;
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

  public void thread132383(int [] tdone, int [] ends){
        switch(S131606){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread132384(tdone,ends);
        thread132385(tdone,ends);
        int biggest132386 = 0;
        if(ends[9]>=biggest132386){
          biggest132386=ends[9];
        }
        if(ends[10]>=biggest132386){
          biggest132386=ends[10];
        }
        if(biggest132386 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest132386 == 0){
          thread132387(tdone,ends);
          thread132388(tdone,ends);
          int biggest132389 = 0;
          if(ends[9]>=biggest132389){
            biggest132389=ends[9];
          }
          if(ends[10]>=biggest132389){
            biggest132389=ends[10];
          }
          if(biggest132389 == 1){
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
        }
        break;
      
    }
  }

  public void thread132382(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread132381(int [] tdone, int [] ends){
        switch(S131608){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread132382(tdone,ends);
        thread132383(tdone,ends);
        int biggest132390 = 0;
        if(ends[7]>=biggest132390){
          biggest132390=ends[7];
        }
        if(ends[8]>=biggest132390){
          biggest132390=ends[8];
        }
        if(biggest132390 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest132390 == 0){
          S131608=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread132380(int [] tdone, int [] ends){
        switch(S132339){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread132381(tdone,ends);
        thread132391(tdone,ends);
        thread132401(tdone,ends);
        thread132411(tdone,ends);
        int biggest132421 = 0;
        if(ends[6]>=biggest132421){
          biggest132421=ends[6];
        }
        if(ends[11]>=biggest132421){
          biggest132421=ends[11];
        }
        if(ends[16]>=biggest132421){
          biggest132421=ends[16];
        }
        if(ends[21]>=biggest132421){
          biggest132421=ends[21];
        }
        if(biggest132421 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest132421 == 0){
          S132339=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread132379(int [] tdone, int [] ends){
        switch(S131365){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S131343){
          case 0 : 
            if(bottleAtPos5.getprestatus() && conveyorEngaged.getprestatus()){//sysj\rotary_controller.sysj line: 64, column: 10
              S131343=1;
              deload.setPresent();//sysj\rotary_controller.sysj line: 66, column: 5
              currsigs.addElement(deload);
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
            if(!bottleAtPos5.getprestatus()){//sysj\rotary_controller.sysj line: 65, column: 10
              S131343=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              deload.setPresent();//sysj\rotary_controller.sysj line: 66, column: 5
              currsigs.addElement(deload);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            S131343=2;
            S131343=0;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread132378(int [] tdone, int [] ends){
        switch(S131333){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S131253){
          case 0 : 
            switch(S131221){
              case 0 : 
                if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 53, column: 4
                  newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 53, column: 4
                  S131221=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S131216){
                    case 0 : 
                      if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 53, column: 4
                        newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 53, column: 4
                        S131216=1;
                        if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 53, column: 4
                          newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 53, column: 4
                          ends[3]=2;
                          ;//sysj\rotary_controller.sysj line: 53, column: 4
                          S131253=1;
                          load.setPresent();//sysj\rotary_controller.sysj line: 56, column: 5
                          currsigs.addElement(load);
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
                      if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 53, column: 4
                        newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 53, column: 4
                        ends[3]=2;
                        ;//sysj\rotary_controller.sysj line: 53, column: 4
                        S131253=1;
                        load.setPresent();//sysj\rotary_controller.sysj line: 56, column: 5
                        currsigs.addElement(load);
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
                S131221=1;
                S131221=0;
                if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 53, column: 4
                  newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 53, column: 4
                  S131221=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S131216=0;
                  if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 53, column: 4
                    newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 53, column: 4
                    S131216=1;
                    if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 53, column: 4
                      newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 53, column: 4
                      ends[3]=2;
                      ;//sysj\rotary_controller.sysj line: 53, column: 4
                      S131253=1;
                      load.setPresent();//sysj\rotary_controller.sysj line: 56, column: 5
                      currsigs.addElement(load);
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
            if(bottleAtPos1.getprestatus()){//sysj\rotary_controller.sysj line: 55, column: 10
              S131253=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              load.setPresent();//sysj\rotary_controller.sysj line: 56, column: 5
              currsigs.addElement(load);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            S131253=2;
            S131253=0;
            S131221=0;
            if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 53, column: 4
              newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 53, column: 4
              S131221=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S131216=0;
              if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 53, column: 4
                newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 53, column: 4
                S131216=1;
                if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 53, column: 4
                  newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 53, column: 4
                  ends[3]=2;
                  ;//sysj\rotary_controller.sysj line: 53, column: 4
                  S131253=1;
                  load.setPresent();//sysj\rotary_controller.sysj line: 56, column: 5
                  currsigs.addElement(load);
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

  public void thread132377(int [] tdone, int [] ends){
        switch(S131214){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S131180){
          case 0 : 
            if(rC_1.getprestatus() && rF_1.getprestatus() && rL_1.getprestatus() && rCa_1.getprestatus()){//sysj\rotary_controller.sysj line: 42, column: 11
              S131180=1;
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
            if(!bottleAtPos5.getprestatus()){//sysj\rotary_controller.sysj line: 43, column: 11
              S131180=2;
              rotaryTableTrigger.setPresent();//sysj\rotary_controller.sysj line: 46, column: 5
              currsigs.addElement(rotaryTableTrigger);
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
            if(tableAlignedWithSensor.getprestatus()){//sysj\rotary_controller.sysj line: 44, column: 11
              S131180=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\rotary_controller.sysj line: 46, column: 5
              currsigs.addElement(rotaryTableTrigger);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread132372(int [] tdone, int [] ends){
        S132175=1;
    if((readyCapper_in.getVal() == null ? null : ((Boolean)readyCapper_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 8
      rCa_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 6
      currsigs.addElement(rCa_1);
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

  public void thread132371(int [] tdone, int [] ends){
        S132167=1;
    S132119=0;
    S132103=0;
    if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 5
      readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
      S132103=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S132098=0;
      if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
        readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 5
        S132098=1;
        if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
          readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
          ends[24]=2;
          ;//sysj\rotary_controller.sysj line: 9, column: 5
          S132119=1;
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

  public void thread132370(int [] tdone, int [] ends){
        S132335=1;
    thread132371(tdone,ends);
    thread132372(tdone,ends);
    int biggest132373 = 0;
    if(ends[24]>=biggest132373){
      biggest132373=ends[24];
    }
    if(ends[25]>=biggest132373){
      biggest132373=ends[25];
    }
    if(biggest132373 == 1){
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread132369(int [] tdone, int [] ends){
        active[22]=0;
    ends[22]=0;
    tdone[22]=1;
  }

  public void thread132368(int [] tdone, int [] ends){
        S132337=1;
    thread132369(tdone,ends);
    thread132370(tdone,ends);
    int biggest132374 = 0;
    if(ends[22]>=biggest132374){
      biggest132374=ends[22];
    }
    if(ends[23]>=biggest132374){
      biggest132374=ends[23];
    }
    if(biggest132374 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread132365(int [] tdone, int [] ends){
        S131932=1;
    if((readyLidLoader_in.getVal() == null ? null : ((Boolean)readyLidLoader_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 8
      rL_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 6
      currsigs.addElement(rL_1);
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

  public void thread132364(int [] tdone, int [] ends){
        S131924=1;
    S131876=0;
    S131860=0;
    if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 5
      readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
      S131860=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S131855=0;
      if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
        readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 5
        S131855=1;
        if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
          readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
          ends[19]=2;
          ;//sysj\rotary_controller.sysj line: 9, column: 5
          S131876=1;
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

  public void thread132363(int [] tdone, int [] ends){
        S132092=1;
    thread132364(tdone,ends);
    thread132365(tdone,ends);
    int biggest132366 = 0;
    if(ends[19]>=biggest132366){
      biggest132366=ends[19];
    }
    if(ends[20]>=biggest132366){
      biggest132366=ends[20];
    }
    if(biggest132366 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread132362(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread132361(int [] tdone, int [] ends){
        S132094=1;
    thread132362(tdone,ends);
    thread132363(tdone,ends);
    int biggest132367 = 0;
    if(ends[17]>=biggest132367){
      biggest132367=ends[17];
    }
    if(ends[18]>=biggest132367){
      biggest132367=ends[18];
    }
    if(biggest132367 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread132358(int [] tdone, int [] ends){
        S131689=1;
    if((readyFiller_in.getVal() == null ? null : ((Boolean)readyFiller_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 8
      rF_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 6
      currsigs.addElement(rF_1);
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

  public void thread132357(int [] tdone, int [] ends){
        S131681=1;
    S131633=0;
    S131617=0;
    if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 5
      readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
      S131617=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S131612=0;
      if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
        readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 5
        S131612=1;
        if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
          readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
          ends[14]=2;
          ;//sysj\rotary_controller.sysj line: 9, column: 5
          S131633=1;
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

  public void thread132356(int [] tdone, int [] ends){
        S131849=1;
    thread132357(tdone,ends);
    thread132358(tdone,ends);
    int biggest132359 = 0;
    if(ends[14]>=biggest132359){
      biggest132359=ends[14];
    }
    if(ends[15]>=biggest132359){
      biggest132359=ends[15];
    }
    if(biggest132359 == 1){
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread132355(int [] tdone, int [] ends){
        active[12]=0;
    ends[12]=0;
    tdone[12]=1;
  }

  public void thread132354(int [] tdone, int [] ends){
        S131851=1;
    thread132355(tdone,ends);
    thread132356(tdone,ends);
    int biggest132360 = 0;
    if(ends[12]>=biggest132360){
      biggest132360=ends[12];
    }
    if(ends[13]>=biggest132360){
      biggest132360=ends[13];
    }
    if(biggest132360 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread132351(int [] tdone, int [] ends){
        S131446=1;
    S131440=0;
    if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 8
      rC_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 6
      currsigs.addElement(rC_1);
      S131440=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S131440=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread132350(int [] tdone, int [] ends){
        S131438=1;
    S131390=0;
    S131374=0;
    if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 5
      readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
      S131374=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S131369=0;
      if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
        readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 5
        S131369=1;
        if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 5
          readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 5
          ends[9]=2;
          ;//sysj\rotary_controller.sysj line: 9, column: 5
          S131390=1;
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

  public void thread132349(int [] tdone, int [] ends){
        S131606=1;
    thread132350(tdone,ends);
    thread132351(tdone,ends);
    int biggest132352 = 0;
    if(ends[9]>=biggest132352){
      biggest132352=ends[9];
    }
    if(ends[10]>=biggest132352){
      biggest132352=ends[10];
    }
    if(biggest132352 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread132348(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread132347(int [] tdone, int [] ends){
        S131608=1;
    thread132348(tdone,ends);
    thread132349(tdone,ends);
    int biggest132353 = 0;
    if(ends[7]>=biggest132353){
      biggest132353=ends[7];
    }
    if(ends[8]>=biggest132353){
      biggest132353=ends[8];
    }
    if(biggest132353 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread132346(int [] tdone, int [] ends){
        S132339=1;
    thread132347(tdone,ends);
    thread132354(tdone,ends);
    thread132361(tdone,ends);
    thread132368(tdone,ends);
    int biggest132375 = 0;
    if(ends[6]>=biggest132375){
      biggest132375=ends[6];
    }
    if(ends[11]>=biggest132375){
      biggest132375=ends[11];
    }
    if(ends[16]>=biggest132375){
      biggest132375=ends[16];
    }
    if(ends[21]>=biggest132375){
      biggest132375=ends[21];
    }
    if(biggest132375 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread132345(int [] tdone, int [] ends){
        S131365=1;
    S131343=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread132344(int [] tdone, int [] ends){
        S131333=1;
    S131253=0;
    S131221=0;
    if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 53, column: 4
      newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 53, column: 4
      S131221=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S131216=0;
      if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 53, column: 4
        newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 53, column: 4
        S131216=1;
        if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 53, column: 4
          newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 53, column: 4
          ends[3]=2;
          ;//sysj\rotary_controller.sysj line: 53, column: 4
          S131253=1;
          load.setPresent();//sysj\rotary_controller.sysj line: 56, column: 5
          currsigs.addElement(load);
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

  public void thread132343(int [] tdone, int [] ends){
        S131214=1;
    S131180=0;
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
      switch(S132341){
        case 0 : 
          S132341=0;
          break RUN;
        
        case 1 : 
          S132341=2;
          S132341=2;
          rC_1.setClear();//sysj\rotary_controller.sysj line: 39, column: 2
          rF_1.setClear();//sysj\rotary_controller.sysj line: 39, column: 2
          rL_1.setClear();//sysj\rotary_controller.sysj line: 39, column: 2
          rCa_1.setClear();//sysj\rotary_controller.sysj line: 39, column: 2
          thread132343(tdone,ends);
          thread132344(tdone,ends);
          thread132345(tdone,ends);
          thread132346(tdone,ends);
          int biggest132376 = 0;
          if(ends[2]>=biggest132376){
            biggest132376=ends[2];
          }
          if(ends[3]>=biggest132376){
            biggest132376=ends[3];
          }
          if(ends[4]>=biggest132376){
            biggest132376=ends[4];
          }
          if(ends[5]>=biggest132376){
            biggest132376=ends[5];
          }
          if(biggest132376 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rC_1.setClear();//sysj\rotary_controller.sysj line: 39, column: 2
          rF_1.setClear();//sysj\rotary_controller.sysj line: 39, column: 2
          rL_1.setClear();//sysj\rotary_controller.sysj line: 39, column: 2
          rCa_1.setClear();//sysj\rotary_controller.sysj line: 39, column: 2
          thread132377(tdone,ends);
          thread132378(tdone,ends);
          thread132379(tdone,ends);
          thread132380(tdone,ends);
          int biggest132422 = 0;
          if(ends[2]>=biggest132422){
            biggest132422=ends[2];
          }
          if(ends[3]>=biggest132422){
            biggest132422=ends[3];
          }
          if(ends[4]>=biggest132422){
            biggest132422=ends[4];
          }
          if(ends[5]>=biggest132422){
            biggest132422=ends[5];
          }
          if(biggest132422 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest132422 == 0){
            S132341=0;
            active[1]=0;
            ends[1]=0;
            S132341=0;
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
