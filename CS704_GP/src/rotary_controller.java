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
  public Signal rotaryEmpty = new Signal("rotaryEmpty", Signal.INPUT);
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
  private int S161716 = 1;
  private int S161269 = 1;
  private int S161235 = 1;
  private int S161340 = 1;
  private int S161292 = 1;
  private int S161276 = 1;
  private int S161271 = 1;
  private int S161372 = 1;
  private int S161350 = 1;
  private int S161714 = 1;
  private int S161457 = 1;
  private int S161455 = 1;
  private int S161445 = 1;
  private int S161397 = 1;
  private int S161381 = 1;
  private int S161376 = 1;
  private int S161453 = 1;
  private int S161447 = 1;
  private int S161542 = 1;
  private int S161540 = 1;
  private int S161530 = 1;
  private int S161482 = 1;
  private int S161466 = 1;
  private int S161461 = 1;
  private int S161538 = 1;
  private int S161627 = 1;
  private int S161625 = 1;
  private int S161615 = 1;
  private int S161567 = 1;
  private int S161551 = 1;
  private int S161546 = 1;
  private int S161623 = 1;
  private int S161712 = 1;
  private int S161710 = 1;
  private int S161700 = 1;
  private int S161652 = 1;
  private int S161636 = 1;
  private int S161631 = 1;
  private int S161708 = 1;
  
  private int[] ends = new int[26];
  private int[] tdone = new int[26];
  
  public void thread161781(int [] tdone, int [] ends){
        switch(S161708){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        if((readyCapper_in.getVal() == null ? null : ((Boolean)readyCapper_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 7
          rCa_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 5
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

  public void thread161780(int [] tdone, int [] ends){
        switch(S161700){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S161652){
          case 0 : 
            switch(S161636){
              case 0 : 
                if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S161636=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  switch(S161631){
                    case 0 : 
                      if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                        readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                        S161631=1;
                        if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                          readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                          ends[24]=2;
                          ;//sysj\rotary_controller.sysj line: 9, column: 4
                          S161652=1;
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
                      if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                        readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                        ends[24]=2;
                        ;//sysj\rotary_controller.sysj line: 9, column: 4
                        S161652=1;
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
                S161636=1;
                S161636=0;
                if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S161636=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  S161631=0;
                  if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                    readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                    S161631=1;
                    if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                      readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                      ends[24]=2;
                      ;//sysj\rotary_controller.sysj line: 9, column: 4
                      S161652=1;
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
            S161652=1;
            S161652=0;
            S161636=0;
            if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
              readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
              S161636=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              S161631=0;
              if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                S161631=1;
                if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  ends[24]=2;
                  ;//sysj\rotary_controller.sysj line: 9, column: 4
                  S161652=1;
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

  public void thread161779(int [] tdone, int [] ends){
        switch(S161710){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        thread161780(tdone,ends);
        thread161781(tdone,ends);
        int biggest161782 = 0;
        if(ends[24]>=biggest161782){
          biggest161782=ends[24];
        }
        if(ends[25]>=biggest161782){
          biggest161782=ends[25];
        }
        if(biggest161782 == 1){
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        //FINXME code
        if(biggest161782 == 0){
          S161710=0;
          active[23]=0;
          ends[23]=0;
          tdone[23]=1;
        }
        break;
      
    }
  }

  public void thread161778(int [] tdone, int [] ends){
        active[22]=0;
    ends[22]=0;
    tdone[22]=1;
  }

  public void thread161777(int [] tdone, int [] ends){
        switch(S161712){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        thread161778(tdone,ends);
        thread161779(tdone,ends);
        int biggest161783 = 0;
        if(ends[22]>=biggest161783){
          biggest161783=ends[22];
        }
        if(ends[23]>=biggest161783){
          biggest161783=ends[23];
        }
        if(biggest161783 == 1){
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        //FINXME code
        if(biggest161783 == 0){
          S161712=0;
          active[21]=0;
          ends[21]=0;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread161774(int [] tdone, int [] ends){
        switch(S161623){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        if((readyLidLoader_in.getVal() == null ? null : ((Boolean)readyLidLoader_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 7
          rL_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 5
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

  public void thread161773(int [] tdone, int [] ends){
        switch(S161615){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S161567){
          case 0 : 
            switch(S161551){
              case 0 : 
                if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S161551=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  switch(S161546){
                    case 0 : 
                      if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                        readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                        S161546=1;
                        if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                          readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                          ends[19]=2;
                          ;//sysj\rotary_controller.sysj line: 9, column: 4
                          S161567=1;
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
                      if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                        readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                        ends[19]=2;
                        ;//sysj\rotary_controller.sysj line: 9, column: 4
                        S161567=1;
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
                S161551=1;
                S161551=0;
                if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S161551=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  S161546=0;
                  if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                    readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                    S161546=1;
                    if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                      readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                      ends[19]=2;
                      ;//sysj\rotary_controller.sysj line: 9, column: 4
                      S161567=1;
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
            S161567=1;
            S161567=0;
            S161551=0;
            if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
              readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
              S161551=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              S161546=0;
              if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                S161546=1;
                if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  ends[19]=2;
                  ;//sysj\rotary_controller.sysj line: 9, column: 4
                  S161567=1;
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

  public void thread161772(int [] tdone, int [] ends){
        switch(S161625){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        thread161773(tdone,ends);
        thread161774(tdone,ends);
        int biggest161775 = 0;
        if(ends[19]>=biggest161775){
          biggest161775=ends[19];
        }
        if(ends[20]>=biggest161775){
          biggest161775=ends[20];
        }
        if(biggest161775 == 1){
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        //FINXME code
        if(biggest161775 == 0){
          S161625=0;
          active[18]=0;
          ends[18]=0;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread161771(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread161770(int [] tdone, int [] ends){
        switch(S161627){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        thread161771(tdone,ends);
        thread161772(tdone,ends);
        int biggest161776 = 0;
        if(ends[17]>=biggest161776){
          biggest161776=ends[17];
        }
        if(ends[18]>=biggest161776){
          biggest161776=ends[18];
        }
        if(biggest161776 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        //FINXME code
        if(biggest161776 == 0){
          S161627=0;
          active[16]=0;
          ends[16]=0;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread161767(int [] tdone, int [] ends){
        switch(S161538){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if((readyFiller_in.getVal() == null ? null : ((Boolean)readyFiller_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 7
          rF_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 5
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

  public void thread161766(int [] tdone, int [] ends){
        switch(S161530){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S161482){
          case 0 : 
            switch(S161466){
              case 0 : 
                if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S161466=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  switch(S161461){
                    case 0 : 
                      if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                        readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                        S161461=1;
                        if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                          readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                          ends[14]=2;
                          ;//sysj\rotary_controller.sysj line: 9, column: 4
                          S161482=1;
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
                      if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                        readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                        ends[14]=2;
                        ;//sysj\rotary_controller.sysj line: 9, column: 4
                        S161482=1;
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
                S161466=1;
                S161466=0;
                if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S161466=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  S161461=0;
                  if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                    readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                    S161461=1;
                    if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                      readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                      ends[14]=2;
                      ;//sysj\rotary_controller.sysj line: 9, column: 4
                      S161482=1;
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
            S161482=1;
            S161482=0;
            S161466=0;
            if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
              readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
              S161466=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              S161461=0;
              if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                S161461=1;
                if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  ends[14]=2;
                  ;//sysj\rotary_controller.sysj line: 9, column: 4
                  S161482=1;
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

  public void thread161765(int [] tdone, int [] ends){
        switch(S161540){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        thread161766(tdone,ends);
        thread161767(tdone,ends);
        int biggest161768 = 0;
        if(ends[14]>=biggest161768){
          biggest161768=ends[14];
        }
        if(ends[15]>=biggest161768){
          biggest161768=ends[15];
        }
        if(biggest161768 == 1){
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        //FINXME code
        if(biggest161768 == 0){
          S161540=0;
          active[13]=0;
          ends[13]=0;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread161764(int [] tdone, int [] ends){
        active[12]=0;
    ends[12]=0;
    tdone[12]=1;
  }

  public void thread161763(int [] tdone, int [] ends){
        switch(S161542){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread161764(tdone,ends);
        thread161765(tdone,ends);
        int biggest161769 = 0;
        if(ends[12]>=biggest161769){
          biggest161769=ends[12];
        }
        if(ends[13]>=biggest161769){
          biggest161769=ends[13];
        }
        if(biggest161769 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest161769 == 0){
          S161542=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread161760(int [] tdone, int [] ends){
        switch(S161453){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S161447){
          case 0 : 
            S161447=0;
            if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 7
              rC_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 5
              currsigs.addElement(rC_1);
              S161447=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S161447=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            S161447=1;
            S161447=0;
            if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 7
              rC_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 5
              currsigs.addElement(rC_1);
              S161447=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S161447=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread161759(int [] tdone, int [] ends){
        switch(S161445){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S161397){
          case 0 : 
            switch(S161381){
              case 0 : 
                if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S161381=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  switch(S161376){
                    case 0 : 
                      if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                        readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                        S161376=1;
                        if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                          readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                          ends[9]=2;
                          ;//sysj\rotary_controller.sysj line: 9, column: 4
                          S161397=1;
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
                      if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                        readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                        ends[9]=2;
                        ;//sysj\rotary_controller.sysj line: 9, column: 4
                        S161397=1;
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
                S161381=1;
                S161381=0;
                if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S161381=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  S161376=0;
                  if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                    readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                    S161376=1;
                    if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                      readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                      ends[9]=2;
                      ;//sysj\rotary_controller.sysj line: 9, column: 4
                      S161397=1;
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
            S161397=1;
            S161397=0;
            S161381=0;
            if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
              readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
              S161381=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S161376=0;
              if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                S161376=1;
                if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  ends[9]=2;
                  ;//sysj\rotary_controller.sysj line: 9, column: 4
                  S161397=1;
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

  public void thread161758(int [] tdone, int [] ends){
        switch(S161455){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread161759(tdone,ends);
        thread161760(tdone,ends);
        int biggest161761 = 0;
        if(ends[9]>=biggest161761){
          biggest161761=ends[9];
        }
        if(ends[10]>=biggest161761){
          biggest161761=ends[10];
        }
        if(biggest161761 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest161761 == 0){
          S161455=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread161757(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread161756(int [] tdone, int [] ends){
        switch(S161457){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread161757(tdone,ends);
        thread161758(tdone,ends);
        int biggest161762 = 0;
        if(ends[7]>=biggest161762){
          biggest161762=ends[7];
        }
        if(ends[8]>=biggest161762){
          biggest161762=ends[8];
        }
        if(biggest161762 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest161762 == 0){
          S161457=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread161755(int [] tdone, int [] ends){
        switch(S161714){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread161756(tdone,ends);
        thread161763(tdone,ends);
        thread161770(tdone,ends);
        thread161777(tdone,ends);
        int biggest161784 = 0;
        if(ends[6]>=biggest161784){
          biggest161784=ends[6];
        }
        if(ends[11]>=biggest161784){
          biggest161784=ends[11];
        }
        if(ends[16]>=biggest161784){
          biggest161784=ends[16];
        }
        if(ends[21]>=biggest161784){
          biggest161784=ends[21];
        }
        if(biggest161784 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest161784 == 0){
          S161714=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread161754(int [] tdone, int [] ends){
        switch(S161372){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S161350){
          case 0 : 
            if(bottleAtPos5.getprestatus() && conveyorEngaged.getprestatus()){//sysj\rotary_controller.sysj line: 72, column: 10
              S161350=1;
              if(!bottleAtPos5.getprestatus()){//sysj\rotary_controller.sysj line: 73, column: 20
                S161350=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                deload.setPresent();//sysj\rotary_controller.sysj line: 74, column: 5
                currsigs.addElement(deload);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(!bottleAtPos5.getprestatus()){//sysj\rotary_controller.sysj line: 73, column: 20
              S161350=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              deload.setPresent();//sysj\rotary_controller.sysj line: 74, column: 5
              currsigs.addElement(deload);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            S161350=2;
            S161350=0;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread161753(int [] tdone, int [] ends){
        switch(S161340){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S161292){
          case 0 : 
            switch(S161276){
              case 0 : 
                if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 61, column: 4
                  newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
                  S161276=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S161271){
                    case 0 : 
                      if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
                        newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 61, column: 4
                        S161271=1;
                        if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
                          newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
                          ends[3]=2;
                          ;//sysj\rotary_controller.sysj line: 61, column: 4
                          load.setPresent();//sysj\rotary_controller.sysj line: 62, column: 4
                          currsigs.addElement(load);
                          S161292=1;
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
                      if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
                        newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
                        ends[3]=2;
                        ;//sysj\rotary_controller.sysj line: 61, column: 4
                        load.setPresent();//sysj\rotary_controller.sysj line: 62, column: 4
                        currsigs.addElement(load);
                        S161292=1;
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
                S161276=1;
                S161276=0;
                if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 61, column: 4
                  newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
                  S161276=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S161271=0;
                  if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
                    newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 61, column: 4
                    S161271=1;
                    if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
                      newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
                      ends[3]=2;
                      ;//sysj\rotary_controller.sysj line: 61, column: 4
                      load.setPresent();//sysj\rotary_controller.sysj line: 62, column: 4
                      currsigs.addElement(load);
                      S161292=1;
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
            S161292=1;
            S161292=0;
            S161276=0;
            if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 61, column: 4
              newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
              S161276=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S161271=0;
              if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
                newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 61, column: 4
                S161271=1;
                if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
                  newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
                  ends[3]=2;
                  ;//sysj\rotary_controller.sysj line: 61, column: 4
                  load.setPresent();//sysj\rotary_controller.sysj line: 62, column: 4
                  currsigs.addElement(load);
                  S161292=1;
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

  public void thread161752(int [] tdone, int [] ends){
        switch(S161269){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S161235){
          case 0 : 
            if(rC_1.getprestatus() && rF_1.getprestatus() && rL_1.getprestatus() && rCa_1.getprestatus()){//sysj\rotary_controller.sysj line: 49, column: 11
              S161235=1;
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
            if(!rotaryEmpty.getprestatus() && !bottleAtPos5.getprestatus()){//sysj\rotary_controller.sysj line: 50, column: 11
              S161235=2;
              if(tableAlignedWithSensor.getprestatus()){//sysj\rotary_controller.sysj line: 51, column: 21
                S161235=3;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                rotaryTableTrigger.setPresent();//sysj\rotary_controller.sysj line: 52, column: 5
                currsigs.addElement(rotaryTableTrigger);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\rotary_controller.sysj line: 51, column: 21
              S161235=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\rotary_controller.sysj line: 52, column: 5
              currsigs.addElement(rotaryTableTrigger);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            S161235=3;
            S161235=4;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 4 : 
            S161235=4;
            S161235=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread161747(int [] tdone, int [] ends){
        S161708=1;
    if((readyCapper_in.getVal() == null ? null : ((Boolean)readyCapper_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 7
      rCa_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 5
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

  public void thread161746(int [] tdone, int [] ends){
        S161700=1;
    S161652=0;
    S161636=0;
    if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
      readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
      S161636=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S161631=0;
      if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
        readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
        S161631=1;
        if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
          readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
          ends[24]=2;
          ;//sysj\rotary_controller.sysj line: 9, column: 4
          S161652=1;
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

  public void thread161745(int [] tdone, int [] ends){
        S161710=1;
    thread161746(tdone,ends);
    thread161747(tdone,ends);
    int biggest161748 = 0;
    if(ends[24]>=biggest161748){
      biggest161748=ends[24];
    }
    if(ends[25]>=biggest161748){
      biggest161748=ends[25];
    }
    if(biggest161748 == 1){
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread161744(int [] tdone, int [] ends){
        active[22]=0;
    ends[22]=0;
    tdone[22]=1;
  }

  public void thread161743(int [] tdone, int [] ends){
        S161712=1;
    thread161744(tdone,ends);
    thread161745(tdone,ends);
    int biggest161749 = 0;
    if(ends[22]>=biggest161749){
      biggest161749=ends[22];
    }
    if(ends[23]>=biggest161749){
      biggest161749=ends[23];
    }
    if(biggest161749 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread161740(int [] tdone, int [] ends){
        S161623=1;
    if((readyLidLoader_in.getVal() == null ? null : ((Boolean)readyLidLoader_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 7
      rL_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 5
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

  public void thread161739(int [] tdone, int [] ends){
        S161615=1;
    S161567=0;
    S161551=0;
    if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
      readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
      S161551=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S161546=0;
      if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
        readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
        S161546=1;
        if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
          readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
          ends[19]=2;
          ;//sysj\rotary_controller.sysj line: 9, column: 4
          S161567=1;
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

  public void thread161738(int [] tdone, int [] ends){
        S161625=1;
    thread161739(tdone,ends);
    thread161740(tdone,ends);
    int biggest161741 = 0;
    if(ends[19]>=biggest161741){
      biggest161741=ends[19];
    }
    if(ends[20]>=biggest161741){
      biggest161741=ends[20];
    }
    if(biggest161741 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread161737(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread161736(int [] tdone, int [] ends){
        S161627=1;
    thread161737(tdone,ends);
    thread161738(tdone,ends);
    int biggest161742 = 0;
    if(ends[17]>=biggest161742){
      biggest161742=ends[17];
    }
    if(ends[18]>=biggest161742){
      biggest161742=ends[18];
    }
    if(biggest161742 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread161733(int [] tdone, int [] ends){
        S161538=1;
    if((readyFiller_in.getVal() == null ? null : ((Boolean)readyFiller_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 7
      rF_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 5
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

  public void thread161732(int [] tdone, int [] ends){
        S161530=1;
    S161482=0;
    S161466=0;
    if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
      readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
      S161466=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S161461=0;
      if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
        readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
        S161461=1;
        if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
          readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
          ends[14]=2;
          ;//sysj\rotary_controller.sysj line: 9, column: 4
          S161482=1;
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

  public void thread161731(int [] tdone, int [] ends){
        S161540=1;
    thread161732(tdone,ends);
    thread161733(tdone,ends);
    int biggest161734 = 0;
    if(ends[14]>=biggest161734){
      biggest161734=ends[14];
    }
    if(ends[15]>=biggest161734){
      biggest161734=ends[15];
    }
    if(biggest161734 == 1){
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread161730(int [] tdone, int [] ends){
        active[12]=0;
    ends[12]=0;
    tdone[12]=1;
  }

  public void thread161729(int [] tdone, int [] ends){
        S161542=1;
    thread161730(tdone,ends);
    thread161731(tdone,ends);
    int biggest161735 = 0;
    if(ends[12]>=biggest161735){
      biggest161735=ends[12];
    }
    if(ends[13]>=biggest161735){
      biggest161735=ends[13];
    }
    if(biggest161735 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread161726(int [] tdone, int [] ends){
        S161453=1;
    S161447=0;
    if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 7
      rC_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 5
      currsigs.addElement(rC_1);
      S161447=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S161447=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread161725(int [] tdone, int [] ends){
        S161445=1;
    S161397=0;
    S161381=0;
    if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
      readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
      S161381=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S161376=0;
      if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
        readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
        S161376=1;
        if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
          readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
          ends[9]=2;
          ;//sysj\rotary_controller.sysj line: 9, column: 4
          S161397=1;
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

  public void thread161724(int [] tdone, int [] ends){
        S161455=1;
    thread161725(tdone,ends);
    thread161726(tdone,ends);
    int biggest161727 = 0;
    if(ends[9]>=biggest161727){
      biggest161727=ends[9];
    }
    if(ends[10]>=biggest161727){
      biggest161727=ends[10];
    }
    if(biggest161727 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread161723(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread161722(int [] tdone, int [] ends){
        S161457=1;
    thread161723(tdone,ends);
    thread161724(tdone,ends);
    int biggest161728 = 0;
    if(ends[7]>=biggest161728){
      biggest161728=ends[7];
    }
    if(ends[8]>=biggest161728){
      biggest161728=ends[8];
    }
    if(biggest161728 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread161721(int [] tdone, int [] ends){
        S161714=1;
    thread161722(tdone,ends);
    thread161729(tdone,ends);
    thread161736(tdone,ends);
    thread161743(tdone,ends);
    int biggest161750 = 0;
    if(ends[6]>=biggest161750){
      biggest161750=ends[6];
    }
    if(ends[11]>=biggest161750){
      biggest161750=ends[11];
    }
    if(ends[16]>=biggest161750){
      biggest161750=ends[16];
    }
    if(ends[21]>=biggest161750){
      biggest161750=ends[21];
    }
    if(biggest161750 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread161720(int [] tdone, int [] ends){
        S161372=1;
    S161350=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread161719(int [] tdone, int [] ends){
        S161340=1;
    S161292=0;
    S161276=0;
    if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 61, column: 4
      newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
      S161276=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S161271=0;
      if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
        newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 61, column: 4
        S161271=1;
        if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
          newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
          ends[3]=2;
          ;//sysj\rotary_controller.sysj line: 61, column: 4
          load.setPresent();//sysj\rotary_controller.sysj line: 62, column: 4
          currsigs.addElement(load);
          S161292=1;
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

  public void thread161718(int [] tdone, int [] ends){
        S161269=1;
    S161235=0;
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
      switch(S161716){
        case 0 : 
          S161716=0;
          break RUN;
        
        case 1 : 
          S161716=2;
          S161716=2;
          rC_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          rF_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          rL_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          rCa_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          thread161718(tdone,ends);
          thread161719(tdone,ends);
          thread161720(tdone,ends);
          thread161721(tdone,ends);
          int biggest161751 = 0;
          if(ends[2]>=biggest161751){
            biggest161751=ends[2];
          }
          if(ends[3]>=biggest161751){
            biggest161751=ends[3];
          }
          if(ends[4]>=biggest161751){
            biggest161751=ends[4];
          }
          if(ends[5]>=biggest161751){
            biggest161751=ends[5];
          }
          if(biggest161751 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rC_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          rF_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          rL_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          rCa_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          thread161752(tdone,ends);
          thread161753(tdone,ends);
          thread161754(tdone,ends);
          thread161755(tdone,ends);
          int biggest161785 = 0;
          if(ends[2]>=biggest161785){
            biggest161785=ends[2];
          }
          if(ends[3]>=biggest161785){
            biggest161785=ends[3];
          }
          if(ends[4]>=biggest161785){
            biggest161785=ends[4];
          }
          if(ends[5]>=biggest161785){
            biggest161785=ends[5];
          }
          if(biggest161785 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest161785 == 0){
            S161716=0;
            active[1]=0;
            ends[1]=0;
            S161716=0;
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
          rotaryEmpty.gethook();
          conveyorEngaged.gethook();
          df = true;
        }
        runClockDomain();
      }
      tableAlignedWithSensor.setpreclear();
      bottleAtPos1.setpreclear();
      bottleAtPos5.setpreclear();
      rotaryEmpty.setpreclear();
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
      dummyint = rotaryEmpty.getStatus() ? rotaryEmpty.setprepresent() : rotaryEmpty.setpreclear();
      rotaryEmpty.setpreval(rotaryEmpty.getValue());
      rotaryEmpty.setClear();
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
        rotaryEmpty.gethook();
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
