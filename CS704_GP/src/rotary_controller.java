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
  private int S131423 = 1;
  private int S130860 = 1;
  private int S130826 = 1;
  private int S130979 = 1;
  private int S130899 = 1;
  private int S130867 = 1;
  private int S130862 = 1;
  private int S131011 = 1;
  private int S130989 = 1;
  private int S131421 = 1;
  private int S131113 = 1;
  private int S131111 = 1;
  private int S131037 = 1;
  private int S131020 = 1;
  private int S131015 = 1;
  private int S131045 = 1;
  private int S131039 = 1;
  private int S131215 = 1;
  private int S131213 = 1;
  private int S131139 = 1;
  private int S131122 = 1;
  private int S131117 = 1;
  private int S131147 = 1;
  private int S131317 = 1;
  private int S131315 = 1;
  private int S131241 = 1;
  private int S131224 = 1;
  private int S131219 = 1;
  private int S131249 = 1;
  private int S131419 = 1;
  private int S131417 = 1;
  private int S131343 = 1;
  private int S131326 = 1;
  private int S131321 = 1;
  private int S131351 = 1;
  
  private int[] ends = new int[26];
  private int[] tdone = new int[26];
  
  public void thread131500(int [] tdone, int [] ends){
        S131351=1;
    if((readyCapper_in.getVal() == null ? null : ((Boolean)readyCapper_in.getVal()))){//sysj\rotary_controller.sysj line: 13, column: 8
      rCa_1.setPresent();//sysj\rotary_controller.sysj line: 14, column: 6
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

  public void thread131499(int [] tdone, int [] ends){
        S131343=1;
    S131326=0;
    if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 4
      readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
      S131326=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S131321=0;
      if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
        readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 4
        S131321=1;
        if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
          readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
          ends[24]=2;
          ;//sysj\rotary_controller.sysj line: 8, column: 4
          S131343=0;
          active[24]=0;
          ends[24]=0;
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

  public void thread131497(int [] tdone, int [] ends){
        switch(S131351){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if((readyCapper_in.getVal() == null ? null : ((Boolean)readyCapper_in.getVal()))){//sysj\rotary_controller.sysj line: 13, column: 8
          rCa_1.setPresent();//sysj\rotary_controller.sysj line: 14, column: 6
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

  public void thread131496(int [] tdone, int [] ends){
        switch(S131343){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S131326){
          case 0 : 
            if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 4
              readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
              S131326=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              switch(S131321){
                case 0 : 
                  if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
                    readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 4
                    S131321=1;
                    if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
                      readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
                      ends[24]=2;
                      ;//sysj\rotary_controller.sysj line: 8, column: 4
                      S131343=0;
                      active[24]=0;
                      ends[24]=0;
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
                  if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
                    readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
                    ends[24]=2;
                    ;//sysj\rotary_controller.sysj line: 8, column: 4
                    S131343=0;
                    active[24]=0;
                    ends[24]=0;
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
            S131326=1;
            S131326=0;
            if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 4
              readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
              S131326=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              S131321=0;
              if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
                readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 4
                S131321=1;
                if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
                  readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
                  ends[24]=2;
                  ;//sysj\rotary_controller.sysj line: 8, column: 4
                  S131343=0;
                  active[24]=0;
                  ends[24]=0;
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

  public void thread131495(int [] tdone, int [] ends){
        switch(S131417){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        thread131496(tdone,ends);
        thread131497(tdone,ends);
        int biggest131498 = 0;
        if(ends[24]>=biggest131498){
          biggest131498=ends[24];
        }
        if(ends[25]>=biggest131498){
          biggest131498=ends[25];
        }
        if(biggest131498 == 1){
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        //FINXME code
        if(biggest131498 == 0){
          thread131499(tdone,ends);
          thread131500(tdone,ends);
          int biggest131501 = 0;
          if(ends[24]>=biggest131501){
            biggest131501=ends[24];
          }
          if(ends[25]>=biggest131501){
            biggest131501=ends[25];
          }
          if(biggest131501 == 1){
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        break;
      
    }
  }

  public void thread131494(int [] tdone, int [] ends){
        active[22]=0;
    ends[22]=0;
    tdone[22]=1;
  }

  public void thread131493(int [] tdone, int [] ends){
        switch(S131419){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        thread131494(tdone,ends);
        thread131495(tdone,ends);
        int biggest131502 = 0;
        if(ends[22]>=biggest131502){
          biggest131502=ends[22];
        }
        if(ends[23]>=biggest131502){
          biggest131502=ends[23];
        }
        if(biggest131502 == 1){
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        //FINXME code
        if(biggest131502 == 0){
          S131419=0;
          active[21]=0;
          ends[21]=0;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread131490(int [] tdone, int [] ends){
        S131249=1;
    if((readyLidLoader_in.getVal() == null ? null : ((Boolean)readyLidLoader_in.getVal()))){//sysj\rotary_controller.sysj line: 13, column: 8
      rL_1.setPresent();//sysj\rotary_controller.sysj line: 14, column: 6
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

  public void thread131489(int [] tdone, int [] ends){
        S131241=1;
    S131224=0;
    if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 4
      readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
      S131224=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S131219=0;
      if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
        readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 4
        S131219=1;
        if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
          readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
          ends[19]=2;
          ;//sysj\rotary_controller.sysj line: 8, column: 4
          S131241=0;
          active[19]=0;
          ends[19]=0;
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

  public void thread131487(int [] tdone, int [] ends){
        switch(S131249){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if((readyLidLoader_in.getVal() == null ? null : ((Boolean)readyLidLoader_in.getVal()))){//sysj\rotary_controller.sysj line: 13, column: 8
          rL_1.setPresent();//sysj\rotary_controller.sysj line: 14, column: 6
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

  public void thread131486(int [] tdone, int [] ends){
        switch(S131241){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S131224){
          case 0 : 
            if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 4
              readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
              S131224=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              switch(S131219){
                case 0 : 
                  if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
                    readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 4
                    S131219=1;
                    if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
                      readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
                      ends[19]=2;
                      ;//sysj\rotary_controller.sysj line: 8, column: 4
                      S131241=0;
                      active[19]=0;
                      ends[19]=0;
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
                  if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
                    readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
                    ends[19]=2;
                    ;//sysj\rotary_controller.sysj line: 8, column: 4
                    S131241=0;
                    active[19]=0;
                    ends[19]=0;
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
            S131224=1;
            S131224=0;
            if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 4
              readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
              S131224=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              S131219=0;
              if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
                readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 4
                S131219=1;
                if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
                  readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
                  ends[19]=2;
                  ;//sysj\rotary_controller.sysj line: 8, column: 4
                  S131241=0;
                  active[19]=0;
                  ends[19]=0;
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

  public void thread131485(int [] tdone, int [] ends){
        switch(S131315){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        thread131486(tdone,ends);
        thread131487(tdone,ends);
        int biggest131488 = 0;
        if(ends[19]>=biggest131488){
          biggest131488=ends[19];
        }
        if(ends[20]>=biggest131488){
          biggest131488=ends[20];
        }
        if(biggest131488 == 1){
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        //FINXME code
        if(biggest131488 == 0){
          thread131489(tdone,ends);
          thread131490(tdone,ends);
          int biggest131491 = 0;
          if(ends[19]>=biggest131491){
            biggest131491=ends[19];
          }
          if(ends[20]>=biggest131491){
            biggest131491=ends[20];
          }
          if(biggest131491 == 1){
            active[18]=1;
            ends[18]=1;
            tdone[18]=1;
          }
        }
        break;
      
    }
  }

  public void thread131484(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread131483(int [] tdone, int [] ends){
        switch(S131317){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        thread131484(tdone,ends);
        thread131485(tdone,ends);
        int biggest131492 = 0;
        if(ends[17]>=biggest131492){
          biggest131492=ends[17];
        }
        if(ends[18]>=biggest131492){
          biggest131492=ends[18];
        }
        if(biggest131492 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        //FINXME code
        if(biggest131492 == 0){
          S131317=0;
          active[16]=0;
          ends[16]=0;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread131480(int [] tdone, int [] ends){
        S131147=1;
    if((readyFiller_in.getVal() == null ? null : ((Boolean)readyFiller_in.getVal()))){//sysj\rotary_controller.sysj line: 13, column: 8
      rF_1.setPresent();//sysj\rotary_controller.sysj line: 14, column: 6
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

  public void thread131479(int [] tdone, int [] ends){
        S131139=1;
    S131122=0;
    if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 4
      readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
      S131122=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S131117=0;
      if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
        readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 4
        S131117=1;
        if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
          readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
          ends[14]=2;
          ;//sysj\rotary_controller.sysj line: 8, column: 4
          S131139=0;
          active[14]=0;
          ends[14]=0;
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

  public void thread131477(int [] tdone, int [] ends){
        switch(S131147){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if((readyFiller_in.getVal() == null ? null : ((Boolean)readyFiller_in.getVal()))){//sysj\rotary_controller.sysj line: 13, column: 8
          rF_1.setPresent();//sysj\rotary_controller.sysj line: 14, column: 6
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

  public void thread131476(int [] tdone, int [] ends){
        switch(S131139){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S131122){
          case 0 : 
            if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 4
              readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
              S131122=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              switch(S131117){
                case 0 : 
                  if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
                    readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 4
                    S131117=1;
                    if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
                      readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
                      ends[14]=2;
                      ;//sysj\rotary_controller.sysj line: 8, column: 4
                      S131139=0;
                      active[14]=0;
                      ends[14]=0;
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
                  if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
                    readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
                    ends[14]=2;
                    ;//sysj\rotary_controller.sysj line: 8, column: 4
                    S131139=0;
                    active[14]=0;
                    ends[14]=0;
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
            S131122=1;
            S131122=0;
            if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 4
              readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
              S131122=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              S131117=0;
              if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
                readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 4
                S131117=1;
                if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
                  readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
                  ends[14]=2;
                  ;//sysj\rotary_controller.sysj line: 8, column: 4
                  S131139=0;
                  active[14]=0;
                  ends[14]=0;
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

  public void thread131475(int [] tdone, int [] ends){
        switch(S131213){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        thread131476(tdone,ends);
        thread131477(tdone,ends);
        int biggest131478 = 0;
        if(ends[14]>=biggest131478){
          biggest131478=ends[14];
        }
        if(ends[15]>=biggest131478){
          biggest131478=ends[15];
        }
        if(biggest131478 == 1){
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        //FINXME code
        if(biggest131478 == 0){
          thread131479(tdone,ends);
          thread131480(tdone,ends);
          int biggest131481 = 0;
          if(ends[14]>=biggest131481){
            biggest131481=ends[14];
          }
          if(ends[15]>=biggest131481){
            biggest131481=ends[15];
          }
          if(biggest131481 == 1){
            active[13]=1;
            ends[13]=1;
            tdone[13]=1;
          }
        }
        break;
      
    }
  }

  public void thread131474(int [] tdone, int [] ends){
        active[12]=0;
    ends[12]=0;
    tdone[12]=1;
  }

  public void thread131473(int [] tdone, int [] ends){
        switch(S131215){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread131474(tdone,ends);
        thread131475(tdone,ends);
        int biggest131482 = 0;
        if(ends[12]>=biggest131482){
          biggest131482=ends[12];
        }
        if(ends[13]>=biggest131482){
          biggest131482=ends[13];
        }
        if(biggest131482 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest131482 == 0){
          S131215=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread131470(int [] tdone, int [] ends){
        S131045=1;
    S131039=0;
    if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal()))){//sysj\rotary_controller.sysj line: 13, column: 8
      rC_1.setPresent();//sysj\rotary_controller.sysj line: 14, column: 6
      currsigs.addElement(rC_1);
      System.out.println("Emitted rC_1");
      S131039=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S131039=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread131469(int [] tdone, int [] ends){
        S131037=1;
    S131020=0;
    if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 4
      readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
      S131020=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S131015=0;
      if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
        readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 4
        S131015=1;
        if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
          readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
          ends[9]=2;
          ;//sysj\rotary_controller.sysj line: 8, column: 4
          S131037=0;
          active[9]=0;
          ends[9]=0;
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

  public void thread131467(int [] tdone, int [] ends){
        switch(S131045){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S131039){
          case 0 : 
            S131039=0;
            if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal()))){//sysj\rotary_controller.sysj line: 13, column: 8
              rC_1.setPresent();//sysj\rotary_controller.sysj line: 14, column: 6
              currsigs.addElement(rC_1);
              System.out.println("Emitted rC_1");
              S131039=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S131039=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            S131039=1;
            S131039=0;
            if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal()))){//sysj\rotary_controller.sysj line: 13, column: 8
              rC_1.setPresent();//sysj\rotary_controller.sysj line: 14, column: 6
              currsigs.addElement(rC_1);
              System.out.println("Emitted rC_1");
              S131039=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S131039=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread131466(int [] tdone, int [] ends){
        switch(S131037){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S131020){
          case 0 : 
            if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 4
              readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
              S131020=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              switch(S131015){
                case 0 : 
                  if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
                    readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 4
                    S131015=1;
                    if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
                      readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
                      ends[9]=2;
                      ;//sysj\rotary_controller.sysj line: 8, column: 4
                      S131037=0;
                      active[9]=0;
                      ends[9]=0;
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
                  if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
                    readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
                    ends[9]=2;
                    ;//sysj\rotary_controller.sysj line: 8, column: 4
                    S131037=0;
                    active[9]=0;
                    ends[9]=0;
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
            S131020=1;
            S131020=0;
            if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 4
              readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
              S131020=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S131015=0;
              if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
                readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 4
                S131015=1;
                if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
                  readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
                  ends[9]=2;
                  ;//sysj\rotary_controller.sysj line: 8, column: 4
                  S131037=0;
                  active[9]=0;
                  ends[9]=0;
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

  public void thread131465(int [] tdone, int [] ends){
        switch(S131111){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread131466(tdone,ends);
        thread131467(tdone,ends);
        int biggest131468 = 0;
        if(ends[9]>=biggest131468){
          biggest131468=ends[9];
        }
        if(ends[10]>=biggest131468){
          biggest131468=ends[10];
        }
        if(biggest131468 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest131468 == 0){
          thread131469(tdone,ends);
          thread131470(tdone,ends);
          int biggest131471 = 0;
          if(ends[9]>=biggest131471){
            biggest131471=ends[9];
          }
          if(ends[10]>=biggest131471){
            biggest131471=ends[10];
          }
          if(biggest131471 == 1){
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
        }
        break;
      
    }
  }

  public void thread131464(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread131463(int [] tdone, int [] ends){
        switch(S131113){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread131464(tdone,ends);
        thread131465(tdone,ends);
        int biggest131472 = 0;
        if(ends[7]>=biggest131472){
          biggest131472=ends[7];
        }
        if(ends[8]>=biggest131472){
          biggest131472=ends[8];
        }
        if(biggest131472 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest131472 == 0){
          S131113=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread131462(int [] tdone, int [] ends){
        switch(S131421){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread131463(tdone,ends);
        thread131473(tdone,ends);
        thread131483(tdone,ends);
        thread131493(tdone,ends);
        int biggest131503 = 0;
        if(ends[6]>=biggest131503){
          biggest131503=ends[6];
        }
        if(ends[11]>=biggest131503){
          biggest131503=ends[11];
        }
        if(ends[16]>=biggest131503){
          biggest131503=ends[16];
        }
        if(ends[21]>=biggest131503){
          biggest131503=ends[21];
        }
        if(biggest131503 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest131503 == 0){
          S131421=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread131461(int [] tdone, int [] ends){
        switch(S131011){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S130989){
          case 0 : 
            if(bottleAtPos5.getprestatus() && conveyorEngaged.getprestatus()){//sysj\rotary_controller.sysj line: 59, column: 10
              S130989=1;
              deload.setPresent();//sysj\rotary_controller.sysj line: 61, column: 5
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
            if(!bottleAtPos5.getprestatus()){//sysj\rotary_controller.sysj line: 60, column: 10
              S130989=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              deload.setPresent();//sysj\rotary_controller.sysj line: 61, column: 5
              currsigs.addElement(deload);
              System.out.println("Emitted deload");
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            S130989=2;
            S130989=0;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread131460(int [] tdone, int [] ends){
        switch(S130979){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S130899){
          case 0 : 
            switch(S130867){
              case 0 : 
                if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 49, column: 4
                  newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 49, column: 4
                  S130867=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S130862){
                    case 0 : 
                      if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 49, column: 4
                        newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 49, column: 4
                        S130862=1;
                        if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 49, column: 4
                          newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 49, column: 4
                          ends[3]=2;
                          ;//sysj\rotary_controller.sysj line: 49, column: 4
                          S130899=1;
                          load.setPresent();//sysj\rotary_controller.sysj line: 51, column: 5
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
                      if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 49, column: 4
                        newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 49, column: 4
                        ends[3]=2;
                        ;//sysj\rotary_controller.sysj line: 49, column: 4
                        S130899=1;
                        load.setPresent();//sysj\rotary_controller.sysj line: 51, column: 5
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
                S130867=1;
                S130867=0;
                if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 49, column: 4
                  newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 49, column: 4
                  S130867=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S130862=0;
                  if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 49, column: 4
                    newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 49, column: 4
                    S130862=1;
                    if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 49, column: 4
                      newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 49, column: 4
                      ends[3]=2;
                      ;//sysj\rotary_controller.sysj line: 49, column: 4
                      S130899=1;
                      load.setPresent();//sysj\rotary_controller.sysj line: 51, column: 5
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
            if(bottleAtPos1.getprestatus()){//sysj\rotary_controller.sysj line: 50, column: 10
              S130899=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              load.setPresent();//sysj\rotary_controller.sysj line: 51, column: 5
              currsigs.addElement(load);
              System.out.println("Emitted load");
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            S130899=2;
            S130899=0;
            S130867=0;
            if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 49, column: 4
              newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 49, column: 4
              S130867=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S130862=0;
              if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 49, column: 4
                newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 49, column: 4
                S130862=1;
                if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 49, column: 4
                  newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 49, column: 4
                  ends[3]=2;
                  ;//sysj\rotary_controller.sysj line: 49, column: 4
                  S130899=1;
                  load.setPresent();//sysj\rotary_controller.sysj line: 51, column: 5
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

  public void thread131459(int [] tdone, int [] ends){
        switch(S130860){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S130826){
          case 0 : 
            if(rC_1.getprestatus() && rF_1.getprestatus() && rL_1.getprestatus() && rCa_1.getprestatus()){//sysj\rotary_controller.sysj line: 39, column: 11
              S130826=1;
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
            if(!bottleAtPos5.getprestatus()){//sysj\rotary_controller.sysj line: 40, column: 11
              S130826=2;
              rotaryTableTrigger.setPresent();//sysj\rotary_controller.sysj line: 42, column: 5
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
            if(tableAlignedWithSensor.getprestatus()){//sysj\rotary_controller.sysj line: 41, column: 11
              S130826=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\rotary_controller.sysj line: 42, column: 5
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

  public void thread131454(int [] tdone, int [] ends){
        S131351=1;
    if((readyCapper_in.getVal() == null ? null : ((Boolean)readyCapper_in.getVal()))){//sysj\rotary_controller.sysj line: 13, column: 8
      rCa_1.setPresent();//sysj\rotary_controller.sysj line: 14, column: 6
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

  public void thread131453(int [] tdone, int [] ends){
        S131343=1;
    S131326=0;
    if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 4
      readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
      S131326=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S131321=0;
      if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
        readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 4
        S131321=1;
        if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
          readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
          ends[24]=2;
          ;//sysj\rotary_controller.sysj line: 8, column: 4
          S131343=0;
          active[24]=0;
          ends[24]=0;
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

  public void thread131452(int [] tdone, int [] ends){
        S131417=1;
    thread131453(tdone,ends);
    thread131454(tdone,ends);
    int biggest131455 = 0;
    if(ends[24]>=biggest131455){
      biggest131455=ends[24];
    }
    if(ends[25]>=biggest131455){
      biggest131455=ends[25];
    }
    if(biggest131455 == 1){
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread131451(int [] tdone, int [] ends){
        active[22]=0;
    ends[22]=0;
    tdone[22]=1;
  }

  public void thread131450(int [] tdone, int [] ends){
        S131419=1;
    thread131451(tdone,ends);
    thread131452(tdone,ends);
    int biggest131456 = 0;
    if(ends[22]>=biggest131456){
      biggest131456=ends[22];
    }
    if(ends[23]>=biggest131456){
      biggest131456=ends[23];
    }
    if(biggest131456 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread131447(int [] tdone, int [] ends){
        S131249=1;
    if((readyLidLoader_in.getVal() == null ? null : ((Boolean)readyLidLoader_in.getVal()))){//sysj\rotary_controller.sysj line: 13, column: 8
      rL_1.setPresent();//sysj\rotary_controller.sysj line: 14, column: 6
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

  public void thread131446(int [] tdone, int [] ends){
        S131241=1;
    S131224=0;
    if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 4
      readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
      S131224=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S131219=0;
      if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
        readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 4
        S131219=1;
        if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
          readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
          ends[19]=2;
          ;//sysj\rotary_controller.sysj line: 8, column: 4
          S131241=0;
          active[19]=0;
          ends[19]=0;
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

  public void thread131445(int [] tdone, int [] ends){
        S131315=1;
    thread131446(tdone,ends);
    thread131447(tdone,ends);
    int biggest131448 = 0;
    if(ends[19]>=biggest131448){
      biggest131448=ends[19];
    }
    if(ends[20]>=biggest131448){
      biggest131448=ends[20];
    }
    if(biggest131448 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread131444(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread131443(int [] tdone, int [] ends){
        S131317=1;
    thread131444(tdone,ends);
    thread131445(tdone,ends);
    int biggest131449 = 0;
    if(ends[17]>=biggest131449){
      biggest131449=ends[17];
    }
    if(ends[18]>=biggest131449){
      biggest131449=ends[18];
    }
    if(biggest131449 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread131440(int [] tdone, int [] ends){
        S131147=1;
    if((readyFiller_in.getVal() == null ? null : ((Boolean)readyFiller_in.getVal()))){//sysj\rotary_controller.sysj line: 13, column: 8
      rF_1.setPresent();//sysj\rotary_controller.sysj line: 14, column: 6
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

  public void thread131439(int [] tdone, int [] ends){
        S131139=1;
    S131122=0;
    if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 4
      readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
      S131122=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S131117=0;
      if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
        readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 4
        S131117=1;
        if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
          readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
          ends[14]=2;
          ;//sysj\rotary_controller.sysj line: 8, column: 4
          S131139=0;
          active[14]=0;
          ends[14]=0;
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

  public void thread131438(int [] tdone, int [] ends){
        S131213=1;
    thread131439(tdone,ends);
    thread131440(tdone,ends);
    int biggest131441 = 0;
    if(ends[14]>=biggest131441){
      biggest131441=ends[14];
    }
    if(ends[15]>=biggest131441){
      biggest131441=ends[15];
    }
    if(biggest131441 == 1){
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread131437(int [] tdone, int [] ends){
        active[12]=0;
    ends[12]=0;
    tdone[12]=1;
  }

  public void thread131436(int [] tdone, int [] ends){
        S131215=1;
    thread131437(tdone,ends);
    thread131438(tdone,ends);
    int biggest131442 = 0;
    if(ends[12]>=biggest131442){
      biggest131442=ends[12];
    }
    if(ends[13]>=biggest131442){
      biggest131442=ends[13];
    }
    if(biggest131442 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread131433(int [] tdone, int [] ends){
        S131045=1;
    S131039=0;
    if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal()))){//sysj\rotary_controller.sysj line: 13, column: 8
      rC_1.setPresent();//sysj\rotary_controller.sysj line: 14, column: 6
      currsigs.addElement(rC_1);
      System.out.println("Emitted rC_1");
      S131039=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S131039=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread131432(int [] tdone, int [] ends){
        S131037=1;
    S131020=0;
    if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 4
      readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
      S131020=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S131015=0;
      if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
        readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 4
        S131015=1;
        if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 4
          readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 4
          ends[9]=2;
          ;//sysj\rotary_controller.sysj line: 8, column: 4
          S131037=0;
          active[9]=0;
          ends[9]=0;
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

  public void thread131431(int [] tdone, int [] ends){
        S131111=1;
    thread131432(tdone,ends);
    thread131433(tdone,ends);
    int biggest131434 = 0;
    if(ends[9]>=biggest131434){
      biggest131434=ends[9];
    }
    if(ends[10]>=biggest131434){
      biggest131434=ends[10];
    }
    if(biggest131434 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread131430(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread131429(int [] tdone, int [] ends){
        S131113=1;
    thread131430(tdone,ends);
    thread131431(tdone,ends);
    int biggest131435 = 0;
    if(ends[7]>=biggest131435){
      biggest131435=ends[7];
    }
    if(ends[8]>=biggest131435){
      biggest131435=ends[8];
    }
    if(biggest131435 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread131428(int [] tdone, int [] ends){
        S131421=1;
    thread131429(tdone,ends);
    thread131436(tdone,ends);
    thread131443(tdone,ends);
    thread131450(tdone,ends);
    int biggest131457 = 0;
    if(ends[6]>=biggest131457){
      biggest131457=ends[6];
    }
    if(ends[11]>=biggest131457){
      biggest131457=ends[11];
    }
    if(ends[16]>=biggest131457){
      biggest131457=ends[16];
    }
    if(ends[21]>=biggest131457){
      biggest131457=ends[21];
    }
    if(biggest131457 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread131427(int [] tdone, int [] ends){
        S131011=1;
    S130989=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread131426(int [] tdone, int [] ends){
        S130979=1;
    S130899=0;
    S130867=0;
    if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 49, column: 4
      newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 49, column: 4
      S130867=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S130862=0;
      if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 49, column: 4
        newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 49, column: 4
        S130862=1;
        if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 49, column: 4
          newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 49, column: 4
          ends[3]=2;
          ;//sysj\rotary_controller.sysj line: 49, column: 4
          S130899=1;
          load.setPresent();//sysj\rotary_controller.sysj line: 51, column: 5
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

  public void thread131425(int [] tdone, int [] ends){
        S130860=1;
    S130826=0;
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
      switch(S131423){
        case 0 : 
          S131423=0;
          break RUN;
        
        case 1 : 
          S131423=2;
          S131423=2;
          rC_1.setClear();//sysj\rotary_controller.sysj line: 36, column: 2
          rF_1.setClear();//sysj\rotary_controller.sysj line: 36, column: 2
          rL_1.setClear();//sysj\rotary_controller.sysj line: 36, column: 2
          rCa_1.setClear();//sysj\rotary_controller.sysj line: 36, column: 2
          thread131425(tdone,ends);
          thread131426(tdone,ends);
          thread131427(tdone,ends);
          thread131428(tdone,ends);
          int biggest131458 = 0;
          if(ends[2]>=biggest131458){
            biggest131458=ends[2];
          }
          if(ends[3]>=biggest131458){
            biggest131458=ends[3];
          }
          if(ends[4]>=biggest131458){
            biggest131458=ends[4];
          }
          if(ends[5]>=biggest131458){
            biggest131458=ends[5];
          }
          if(biggest131458 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rC_1.setClear();//sysj\rotary_controller.sysj line: 36, column: 2
          rF_1.setClear();//sysj\rotary_controller.sysj line: 36, column: 2
          rL_1.setClear();//sysj\rotary_controller.sysj line: 36, column: 2
          rCa_1.setClear();//sysj\rotary_controller.sysj line: 36, column: 2
          thread131459(tdone,ends);
          thread131460(tdone,ends);
          thread131461(tdone,ends);
          thread131462(tdone,ends);
          int biggest131504 = 0;
          if(ends[2]>=biggest131504){
            biggest131504=ends[2];
          }
          if(ends[3]>=biggest131504){
            biggest131504=ends[3];
          }
          if(ends[4]>=biggest131504){
            biggest131504=ends[4];
          }
          if(ends[5]>=biggest131504){
            biggest131504=ends[5];
          }
          if(biggest131504 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest131504 == 0){
            S131423=0;
            active[1]=0;
            ends[1]=0;
            S131423=0;
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
