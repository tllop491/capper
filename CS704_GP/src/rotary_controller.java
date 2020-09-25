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
  private int S93627 = 1;
  private int S93132 = 1;
  private int S93098 = 1;
  private int S93251 = 1;
  private int S93171 = 1;
  private int S93139 = 1;
  private int S93134 = 1;
  private int S93283 = 1;
  private int S93261 = 1;
  private int S93625 = 1;
  private int S93368 = 1;
  private int S93366 = 1;
  private int S93356 = 1;
  private int S93308 = 1;
  private int S93292 = 1;
  private int S93287 = 1;
  private int S93364 = 1;
  private int S93358 = 1;
  private int S93453 = 1;
  private int S93451 = 1;
  private int S93441 = 1;
  private int S93393 = 1;
  private int S93377 = 1;
  private int S93372 = 1;
  private int S93449 = 1;
  private int S93538 = 1;
  private int S93536 = 1;
  private int S93526 = 1;
  private int S93478 = 1;
  private int S93462 = 1;
  private int S93457 = 1;
  private int S93534 = 1;
  private int S93623 = 1;
  private int S93621 = 1;
  private int S93611 = 1;
  private int S93563 = 1;
  private int S93547 = 1;
  private int S93542 = 1;
  private int S93619 = 1;
  
  private int[] ends = new int[26];
  private int[] tdone = new int[26];
  
  public void thread93692(int [] tdone, int [] ends){
        switch(S93619){
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

  public void thread93691(int [] tdone, int [] ends){
        switch(S93611){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S93563){
          case 0 : 
            switch(S93547){
              case 0 : 
                if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S93547=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  switch(S93542){
                    case 0 : 
                      if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                        readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                        S93542=1;
                        if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                          readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                          ends[24]=2;
                          ;//sysj\rotary_controller.sysj line: 9, column: 4
                          S93563=1;
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
                        S93563=1;
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
                S93547=1;
                S93547=0;
                if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S93547=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  S93542=0;
                  if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                    readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                    S93542=1;
                    if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                      readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                      ends[24]=2;
                      ;//sysj\rotary_controller.sysj line: 9, column: 4
                      S93563=1;
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
            S93563=1;
            S93563=0;
            S93547=0;
            if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
              readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
              S93547=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              S93542=0;
              if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                S93542=1;
                if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  ends[24]=2;
                  ;//sysj\rotary_controller.sysj line: 9, column: 4
                  S93563=1;
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

  public void thread93690(int [] tdone, int [] ends){
        switch(S93621){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        thread93691(tdone,ends);
        thread93692(tdone,ends);
        int biggest93693 = 0;
        if(ends[24]>=biggest93693){
          biggest93693=ends[24];
        }
        if(ends[25]>=biggest93693){
          biggest93693=ends[25];
        }
        if(biggest93693 == 1){
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        //FINXME code
        if(biggest93693 == 0){
          S93621=0;
          active[23]=0;
          ends[23]=0;
          tdone[23]=1;
        }
        break;
      
    }
  }

  public void thread93689(int [] tdone, int [] ends){
        active[22]=0;
    ends[22]=0;
    tdone[22]=1;
  }

  public void thread93688(int [] tdone, int [] ends){
        switch(S93623){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        thread93689(tdone,ends);
        thread93690(tdone,ends);
        int biggest93694 = 0;
        if(ends[22]>=biggest93694){
          biggest93694=ends[22];
        }
        if(ends[23]>=biggest93694){
          biggest93694=ends[23];
        }
        if(biggest93694 == 1){
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        //FINXME code
        if(biggest93694 == 0){
          S93623=0;
          active[21]=0;
          ends[21]=0;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread93685(int [] tdone, int [] ends){
        switch(S93534){
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

  public void thread93684(int [] tdone, int [] ends){
        switch(S93526){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S93478){
          case 0 : 
            switch(S93462){
              case 0 : 
                if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S93462=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  switch(S93457){
                    case 0 : 
                      if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                        readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                        S93457=1;
                        if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                          readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                          ends[19]=2;
                          ;//sysj\rotary_controller.sysj line: 9, column: 4
                          S93478=1;
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
                        S93478=1;
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
                S93462=1;
                S93462=0;
                if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S93462=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  S93457=0;
                  if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                    readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                    S93457=1;
                    if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                      readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                      ends[19]=2;
                      ;//sysj\rotary_controller.sysj line: 9, column: 4
                      S93478=1;
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
            S93478=1;
            S93478=0;
            S93462=0;
            if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
              readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
              S93462=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              S93457=0;
              if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                S93457=1;
                if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  ends[19]=2;
                  ;//sysj\rotary_controller.sysj line: 9, column: 4
                  S93478=1;
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

  public void thread93683(int [] tdone, int [] ends){
        switch(S93536){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        thread93684(tdone,ends);
        thread93685(tdone,ends);
        int biggest93686 = 0;
        if(ends[19]>=biggest93686){
          biggest93686=ends[19];
        }
        if(ends[20]>=biggest93686){
          biggest93686=ends[20];
        }
        if(biggest93686 == 1){
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        //FINXME code
        if(biggest93686 == 0){
          S93536=0;
          active[18]=0;
          ends[18]=0;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread93682(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread93681(int [] tdone, int [] ends){
        switch(S93538){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        thread93682(tdone,ends);
        thread93683(tdone,ends);
        int biggest93687 = 0;
        if(ends[17]>=biggest93687){
          biggest93687=ends[17];
        }
        if(ends[18]>=biggest93687){
          biggest93687=ends[18];
        }
        if(biggest93687 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        //FINXME code
        if(biggest93687 == 0){
          S93538=0;
          active[16]=0;
          ends[16]=0;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread93678(int [] tdone, int [] ends){
        switch(S93449){
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

  public void thread93677(int [] tdone, int [] ends){
        switch(S93441){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S93393){
          case 0 : 
            switch(S93377){
              case 0 : 
                if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S93377=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  switch(S93372){
                    case 0 : 
                      if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                        readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                        S93372=1;
                        if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                          readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                          ends[14]=2;
                          ;//sysj\rotary_controller.sysj line: 9, column: 4
                          S93393=1;
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
                        S93393=1;
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
                S93377=1;
                S93377=0;
                if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S93377=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  S93372=0;
                  if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                    readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                    S93372=1;
                    if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                      readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                      ends[14]=2;
                      ;//sysj\rotary_controller.sysj line: 9, column: 4
                      S93393=1;
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
            S93393=1;
            S93393=0;
            S93377=0;
            if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
              readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
              S93377=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              S93372=0;
              if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                S93372=1;
                if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  ends[14]=2;
                  ;//sysj\rotary_controller.sysj line: 9, column: 4
                  S93393=1;
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

  public void thread93676(int [] tdone, int [] ends){
        switch(S93451){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        thread93677(tdone,ends);
        thread93678(tdone,ends);
        int biggest93679 = 0;
        if(ends[14]>=biggest93679){
          biggest93679=ends[14];
        }
        if(ends[15]>=biggest93679){
          biggest93679=ends[15];
        }
        if(biggest93679 == 1){
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        //FINXME code
        if(biggest93679 == 0){
          S93451=0;
          active[13]=0;
          ends[13]=0;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread93675(int [] tdone, int [] ends){
        active[12]=0;
    ends[12]=0;
    tdone[12]=1;
  }

  public void thread93674(int [] tdone, int [] ends){
        switch(S93453){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread93675(tdone,ends);
        thread93676(tdone,ends);
        int biggest93680 = 0;
        if(ends[12]>=biggest93680){
          biggest93680=ends[12];
        }
        if(ends[13]>=biggest93680){
          biggest93680=ends[13];
        }
        if(biggest93680 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest93680 == 0){
          S93453=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread93671(int [] tdone, int [] ends){
        switch(S93364){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S93358){
          case 0 : 
            S93358=0;
            if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 7
              rC_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 5
              currsigs.addElement(rC_1);
              S93358=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S93358=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            S93358=1;
            S93358=0;
            if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 7
              rC_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 5
              currsigs.addElement(rC_1);
              S93358=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S93358=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread93670(int [] tdone, int [] ends){
        switch(S93356){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S93308){
          case 0 : 
            switch(S93292){
              case 0 : 
                if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S93292=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  switch(S93287){
                    case 0 : 
                      if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                        readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                        S93287=1;
                        if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                          readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                          ends[9]=2;
                          ;//sysj\rotary_controller.sysj line: 9, column: 4
                          S93308=1;
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
                        S93308=1;
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
                S93292=1;
                S93292=0;
                if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S93292=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  S93287=0;
                  if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                    readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                    S93287=1;
                    if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                      readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                      ends[9]=2;
                      ;//sysj\rotary_controller.sysj line: 9, column: 4
                      S93308=1;
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
            S93308=1;
            S93308=0;
            S93292=0;
            if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
              readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
              S93292=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S93287=0;
              if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                S93287=1;
                if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  ends[9]=2;
                  ;//sysj\rotary_controller.sysj line: 9, column: 4
                  S93308=1;
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

  public void thread93669(int [] tdone, int [] ends){
        switch(S93366){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread93670(tdone,ends);
        thread93671(tdone,ends);
        int biggest93672 = 0;
        if(ends[9]>=biggest93672){
          biggest93672=ends[9];
        }
        if(ends[10]>=biggest93672){
          biggest93672=ends[10];
        }
        if(biggest93672 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest93672 == 0){
          S93366=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread93668(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread93667(int [] tdone, int [] ends){
        switch(S93368){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread93668(tdone,ends);
        thread93669(tdone,ends);
        int biggest93673 = 0;
        if(ends[7]>=biggest93673){
          biggest93673=ends[7];
        }
        if(ends[8]>=biggest93673){
          biggest93673=ends[8];
        }
        if(biggest93673 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest93673 == 0){
          S93368=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread93666(int [] tdone, int [] ends){
        switch(S93625){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread93667(tdone,ends);
        thread93674(tdone,ends);
        thread93681(tdone,ends);
        thread93688(tdone,ends);
        int biggest93695 = 0;
        if(ends[6]>=biggest93695){
          biggest93695=ends[6];
        }
        if(ends[11]>=biggest93695){
          biggest93695=ends[11];
        }
        if(ends[16]>=biggest93695){
          biggest93695=ends[16];
        }
        if(ends[21]>=biggest93695){
          biggest93695=ends[21];
        }
        if(biggest93695 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest93695 == 0){
          S93625=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread93665(int [] tdone, int [] ends){
        switch(S93283){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S93261){
          case 0 : 
            if(bottleAtPos5.getprestatus() && conveyorEngaged.getprestatus()){//sysj\rotary_controller.sysj line: 71, column: 10
              S93261=1;
              if(!bottleAtPos5.getprestatus()){//sysj\rotary_controller.sysj line: 72, column: 20
                S93261=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                deload.setPresent();//sysj\rotary_controller.sysj line: 73, column: 5
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
            if(!bottleAtPos5.getprestatus()){//sysj\rotary_controller.sysj line: 72, column: 20
              S93261=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              deload.setPresent();//sysj\rotary_controller.sysj line: 73, column: 5
              currsigs.addElement(deload);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            S93261=2;
            S93261=0;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread93664(int [] tdone, int [] ends){
        switch(S93251){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S93171){
          case 0 : 
            switch(S93139){
              case 0 : 
                if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 61, column: 4
                  newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
                  S93139=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S93134){
                    case 0 : 
                      if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
                        newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 61, column: 4
                        S93134=1;
                        if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
                          newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
                          ends[3]=2;
                          ;//sysj\rotary_controller.sysj line: 61, column: 4
                          S93171=1;
                          if(bottleAtPos1.getprestatus()){//sysj\rotary_controller.sysj line: 62, column: 20
                            S93171=2;
                            active[3]=1;
                            ends[3]=1;
                            tdone[3]=1;
                          }
                          else {
                            load.setPresent();//sysj\rotary_controller.sysj line: 63, column: 5
                            currsigs.addElement(load);
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
                        S93171=1;
                        if(bottleAtPos1.getprestatus()){//sysj\rotary_controller.sysj line: 62, column: 20
                          S93171=2;
                          active[3]=1;
                          ends[3]=1;
                          tdone[3]=1;
                        }
                        else {
                          load.setPresent();//sysj\rotary_controller.sysj line: 63, column: 5
                          currsigs.addElement(load);
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
                    
                  }
                }
                break;
              
              case 1 : 
                S93139=1;
                S93139=0;
                if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 61, column: 4
                  newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
                  S93139=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S93134=0;
                  if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
                    newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 61, column: 4
                    S93134=1;
                    if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
                      newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
                      ends[3]=2;
                      ;//sysj\rotary_controller.sysj line: 61, column: 4
                      S93171=1;
                      if(bottleAtPos1.getprestatus()){//sysj\rotary_controller.sysj line: 62, column: 20
                        S93171=2;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        load.setPresent();//sysj\rotary_controller.sysj line: 63, column: 5
                        currsigs.addElement(load);
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
            if(bottleAtPos1.getprestatus()){//sysj\rotary_controller.sysj line: 62, column: 20
              S93171=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              load.setPresent();//sysj\rotary_controller.sysj line: 63, column: 5
              currsigs.addElement(load);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            S93171=2;
            S93171=0;
            S93139=0;
            if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 61, column: 4
              newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
              S93139=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S93134=0;
              if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
                newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 61, column: 4
                S93134=1;
                if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
                  newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
                  ends[3]=2;
                  ;//sysj\rotary_controller.sysj line: 61, column: 4
                  S93171=1;
                  if(bottleAtPos1.getprestatus()){//sysj\rotary_controller.sysj line: 62, column: 20
                    S93171=2;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    load.setPresent();//sysj\rotary_controller.sysj line: 63, column: 5
                    currsigs.addElement(load);
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

  public void thread93663(int [] tdone, int [] ends){
        switch(S93132){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S93098){
          case 0 : 
            if(rC_1.getprestatus() && rF_1.getprestatus() && rL_1.getprestatus() && rCa_1.getprestatus()){//sysj\rotary_controller.sysj line: 49, column: 11
              S93098=1;
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
              S93098=2;
              if(tableAlignedWithSensor.getprestatus()){//sysj\rotary_controller.sysj line: 51, column: 21
                S93098=3;
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
              S93098=3;
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
            S93098=3;
            S93098=4;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 4 : 
            S93098=4;
            S93098=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread93658(int [] tdone, int [] ends){
        S93619=1;
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

  public void thread93657(int [] tdone, int [] ends){
        S93611=1;
    S93563=0;
    S93547=0;
    if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
      readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
      S93547=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S93542=0;
      if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
        readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
        S93542=1;
        if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
          readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
          ends[24]=2;
          ;//sysj\rotary_controller.sysj line: 9, column: 4
          S93563=1;
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

  public void thread93656(int [] tdone, int [] ends){
        S93621=1;
    thread93657(tdone,ends);
    thread93658(tdone,ends);
    int biggest93659 = 0;
    if(ends[24]>=biggest93659){
      biggest93659=ends[24];
    }
    if(ends[25]>=biggest93659){
      biggest93659=ends[25];
    }
    if(biggest93659 == 1){
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread93655(int [] tdone, int [] ends){
        active[22]=0;
    ends[22]=0;
    tdone[22]=1;
  }

  public void thread93654(int [] tdone, int [] ends){
        S93623=1;
    thread93655(tdone,ends);
    thread93656(tdone,ends);
    int biggest93660 = 0;
    if(ends[22]>=biggest93660){
      biggest93660=ends[22];
    }
    if(ends[23]>=biggest93660){
      biggest93660=ends[23];
    }
    if(biggest93660 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread93651(int [] tdone, int [] ends){
        S93534=1;
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

  public void thread93650(int [] tdone, int [] ends){
        S93526=1;
    S93478=0;
    S93462=0;
    if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
      readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
      S93462=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S93457=0;
      if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
        readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
        S93457=1;
        if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
          readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
          ends[19]=2;
          ;//sysj\rotary_controller.sysj line: 9, column: 4
          S93478=1;
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

  public void thread93649(int [] tdone, int [] ends){
        S93536=1;
    thread93650(tdone,ends);
    thread93651(tdone,ends);
    int biggest93652 = 0;
    if(ends[19]>=biggest93652){
      biggest93652=ends[19];
    }
    if(ends[20]>=biggest93652){
      biggest93652=ends[20];
    }
    if(biggest93652 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread93648(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread93647(int [] tdone, int [] ends){
        S93538=1;
    thread93648(tdone,ends);
    thread93649(tdone,ends);
    int biggest93653 = 0;
    if(ends[17]>=biggest93653){
      biggest93653=ends[17];
    }
    if(ends[18]>=biggest93653){
      biggest93653=ends[18];
    }
    if(biggest93653 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread93644(int [] tdone, int [] ends){
        S93449=1;
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

  public void thread93643(int [] tdone, int [] ends){
        S93441=1;
    S93393=0;
    S93377=0;
    if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
      readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
      S93377=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S93372=0;
      if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
        readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
        S93372=1;
        if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
          readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
          ends[14]=2;
          ;//sysj\rotary_controller.sysj line: 9, column: 4
          S93393=1;
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

  public void thread93642(int [] tdone, int [] ends){
        S93451=1;
    thread93643(tdone,ends);
    thread93644(tdone,ends);
    int biggest93645 = 0;
    if(ends[14]>=biggest93645){
      biggest93645=ends[14];
    }
    if(ends[15]>=biggest93645){
      biggest93645=ends[15];
    }
    if(biggest93645 == 1){
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread93641(int [] tdone, int [] ends){
        active[12]=0;
    ends[12]=0;
    tdone[12]=1;
  }

  public void thread93640(int [] tdone, int [] ends){
        S93453=1;
    thread93641(tdone,ends);
    thread93642(tdone,ends);
    int biggest93646 = 0;
    if(ends[12]>=biggest93646){
      biggest93646=ends[12];
    }
    if(ends[13]>=biggest93646){
      biggest93646=ends[13];
    }
    if(biggest93646 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread93637(int [] tdone, int [] ends){
        S93364=1;
    S93358=0;
    if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 7
      rC_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 5
      currsigs.addElement(rC_1);
      S93358=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S93358=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread93636(int [] tdone, int [] ends){
        S93356=1;
    S93308=0;
    S93292=0;
    if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
      readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
      S93292=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S93287=0;
      if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
        readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
        S93287=1;
        if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
          readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
          ends[9]=2;
          ;//sysj\rotary_controller.sysj line: 9, column: 4
          S93308=1;
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

  public void thread93635(int [] tdone, int [] ends){
        S93366=1;
    thread93636(tdone,ends);
    thread93637(tdone,ends);
    int biggest93638 = 0;
    if(ends[9]>=biggest93638){
      biggest93638=ends[9];
    }
    if(ends[10]>=biggest93638){
      biggest93638=ends[10];
    }
    if(biggest93638 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread93634(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread93633(int [] tdone, int [] ends){
        S93368=1;
    thread93634(tdone,ends);
    thread93635(tdone,ends);
    int biggest93639 = 0;
    if(ends[7]>=biggest93639){
      biggest93639=ends[7];
    }
    if(ends[8]>=biggest93639){
      biggest93639=ends[8];
    }
    if(biggest93639 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread93632(int [] tdone, int [] ends){
        S93625=1;
    thread93633(tdone,ends);
    thread93640(tdone,ends);
    thread93647(tdone,ends);
    thread93654(tdone,ends);
    int biggest93661 = 0;
    if(ends[6]>=biggest93661){
      biggest93661=ends[6];
    }
    if(ends[11]>=biggest93661){
      biggest93661=ends[11];
    }
    if(ends[16]>=biggest93661){
      biggest93661=ends[16];
    }
    if(ends[21]>=biggest93661){
      biggest93661=ends[21];
    }
    if(biggest93661 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread93631(int [] tdone, int [] ends){
        S93283=1;
    S93261=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread93630(int [] tdone, int [] ends){
        S93251=1;
    S93171=0;
    S93139=0;
    if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 61, column: 4
      newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
      S93139=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S93134=0;
      if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
        newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 61, column: 4
        S93134=1;
        if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
          newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
          ends[3]=2;
          ;//sysj\rotary_controller.sysj line: 61, column: 4
          S93171=1;
          if(bottleAtPos1.getprestatus()){//sysj\rotary_controller.sysj line: 62, column: 20
            S93171=2;
            active[3]=1;
            ends[3]=1;
            tdone[3]=1;
          }
          else {
            load.setPresent();//sysj\rotary_controller.sysj line: 63, column: 5
            currsigs.addElement(load);
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
      else {
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
      }
    }
  }

  public void thread93629(int [] tdone, int [] ends){
        S93132=1;
    S93098=0;
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
      switch(S93627){
        case 0 : 
          S93627=0;
          break RUN;
        
        case 1 : 
          S93627=2;
          S93627=2;
          rC_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          rF_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          rL_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          rCa_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          thread93629(tdone,ends);
          thread93630(tdone,ends);
          thread93631(tdone,ends);
          thread93632(tdone,ends);
          int biggest93662 = 0;
          if(ends[2]>=biggest93662){
            biggest93662=ends[2];
          }
          if(ends[3]>=biggest93662){
            biggest93662=ends[3];
          }
          if(ends[4]>=biggest93662){
            biggest93662=ends[4];
          }
          if(ends[5]>=biggest93662){
            biggest93662=ends[5];
          }
          if(biggest93662 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rC_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          rF_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          rL_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          rCa_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          thread93663(tdone,ends);
          thread93664(tdone,ends);
          thread93665(tdone,ends);
          thread93666(tdone,ends);
          int biggest93696 = 0;
          if(ends[2]>=biggest93696){
            biggest93696=ends[2];
          }
          if(ends[3]>=biggest93696){
            biggest93696=ends[3];
          }
          if(ends[4]>=biggest93696){
            biggest93696=ends[4];
          }
          if(ends[5]>=biggest93696){
            biggest93696=ends[5];
          }
          if(biggest93696 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest93696 == 0){
            S93627=0;
            active[1]=0;
            ends[1]=0;
            S93627=0;
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
