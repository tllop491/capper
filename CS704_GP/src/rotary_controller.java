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
  private int S98146 = 1;
  private int S97699 = 1;
  private int S97665 = 1;
  private int S97770 = 1;
  private int S97722 = 1;
  private int S97706 = 1;
  private int S97701 = 1;
  private int S97802 = 1;
  private int S97780 = 1;
  private int S98144 = 1;
  private int S97887 = 1;
  private int S97885 = 1;
  private int S97875 = 1;
  private int S97827 = 1;
  private int S97811 = 1;
  private int S97806 = 1;
  private int S97883 = 1;
  private int S97877 = 1;
  private int S97972 = 1;
  private int S97970 = 1;
  private int S97960 = 1;
  private int S97912 = 1;
  private int S97896 = 1;
  private int S97891 = 1;
  private int S97968 = 1;
  private int S98057 = 1;
  private int S98055 = 1;
  private int S98045 = 1;
  private int S97997 = 1;
  private int S97981 = 1;
  private int S97976 = 1;
  private int S98053 = 1;
  private int S98142 = 1;
  private int S98140 = 1;
  private int S98130 = 1;
  private int S98082 = 1;
  private int S98066 = 1;
  private int S98061 = 1;
  private int S98138 = 1;
  
  private int[] ends = new int[26];
  private int[] tdone = new int[26];
  
  public void thread98211(int [] tdone, int [] ends){
        switch(S98138){
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

  public void thread98210(int [] tdone, int [] ends){
        switch(S98130){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S98082){
          case 0 : 
            switch(S98066){
              case 0 : 
                if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S98066=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  switch(S98061){
                    case 0 : 
                      if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                        readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                        S98061=1;
                        if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                          readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                          ends[24]=2;
                          ;//sysj\rotary_controller.sysj line: 9, column: 4
                          S98082=1;
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
                        S98082=1;
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
                S98066=1;
                S98066=0;
                if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S98066=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  S98061=0;
                  if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                    readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                    S98061=1;
                    if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                      readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                      ends[24]=2;
                      ;//sysj\rotary_controller.sysj line: 9, column: 4
                      S98082=1;
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
            S98082=1;
            S98082=0;
            S98066=0;
            if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
              readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
              S98066=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              S98061=0;
              if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                S98061=1;
                if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  ends[24]=2;
                  ;//sysj\rotary_controller.sysj line: 9, column: 4
                  S98082=1;
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

  public void thread98209(int [] tdone, int [] ends){
        switch(S98140){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        thread98210(tdone,ends);
        thread98211(tdone,ends);
        int biggest98212 = 0;
        if(ends[24]>=biggest98212){
          biggest98212=ends[24];
        }
        if(ends[25]>=biggest98212){
          biggest98212=ends[25];
        }
        if(biggest98212 == 1){
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        //FINXME code
        if(biggest98212 == 0){
          S98140=0;
          active[23]=0;
          ends[23]=0;
          tdone[23]=1;
        }
        break;
      
    }
  }

  public void thread98208(int [] tdone, int [] ends){
        active[22]=0;
    ends[22]=0;
    tdone[22]=1;
  }

  public void thread98207(int [] tdone, int [] ends){
        switch(S98142){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        thread98208(tdone,ends);
        thread98209(tdone,ends);
        int biggest98213 = 0;
        if(ends[22]>=biggest98213){
          biggest98213=ends[22];
        }
        if(ends[23]>=biggest98213){
          biggest98213=ends[23];
        }
        if(biggest98213 == 1){
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        //FINXME code
        if(biggest98213 == 0){
          S98142=0;
          active[21]=0;
          ends[21]=0;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread98204(int [] tdone, int [] ends){
        switch(S98053){
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

  public void thread98203(int [] tdone, int [] ends){
        switch(S98045){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S97997){
          case 0 : 
            switch(S97981){
              case 0 : 
                if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S97981=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  switch(S97976){
                    case 0 : 
                      if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                        readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                        S97976=1;
                        if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                          readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                          ends[19]=2;
                          ;//sysj\rotary_controller.sysj line: 9, column: 4
                          S97997=1;
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
                        S97997=1;
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
                S97981=1;
                S97981=0;
                if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S97981=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  S97976=0;
                  if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                    readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                    S97976=1;
                    if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                      readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                      ends[19]=2;
                      ;//sysj\rotary_controller.sysj line: 9, column: 4
                      S97997=1;
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
            S97997=1;
            S97997=0;
            S97981=0;
            if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
              readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
              S97981=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              S97976=0;
              if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                S97976=1;
                if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  ends[19]=2;
                  ;//sysj\rotary_controller.sysj line: 9, column: 4
                  S97997=1;
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

  public void thread98202(int [] tdone, int [] ends){
        switch(S98055){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        thread98203(tdone,ends);
        thread98204(tdone,ends);
        int biggest98205 = 0;
        if(ends[19]>=biggest98205){
          biggest98205=ends[19];
        }
        if(ends[20]>=biggest98205){
          biggest98205=ends[20];
        }
        if(biggest98205 == 1){
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        //FINXME code
        if(biggest98205 == 0){
          S98055=0;
          active[18]=0;
          ends[18]=0;
          tdone[18]=1;
        }
        break;
      
    }
  }

  public void thread98201(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread98200(int [] tdone, int [] ends){
        switch(S98057){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        thread98201(tdone,ends);
        thread98202(tdone,ends);
        int biggest98206 = 0;
        if(ends[17]>=biggest98206){
          biggest98206=ends[17];
        }
        if(ends[18]>=biggest98206){
          biggest98206=ends[18];
        }
        if(biggest98206 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        //FINXME code
        if(biggest98206 == 0){
          S98057=0;
          active[16]=0;
          ends[16]=0;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread98197(int [] tdone, int [] ends){
        switch(S97968){
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

  public void thread98196(int [] tdone, int [] ends){
        switch(S97960){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S97912){
          case 0 : 
            switch(S97896){
              case 0 : 
                if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S97896=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  switch(S97891){
                    case 0 : 
                      if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                        readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                        S97891=1;
                        if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                          readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                          ends[14]=2;
                          ;//sysj\rotary_controller.sysj line: 9, column: 4
                          S97912=1;
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
                        S97912=1;
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
                S97896=1;
                S97896=0;
                if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S97896=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  S97891=0;
                  if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                    readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                    S97891=1;
                    if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                      readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                      ends[14]=2;
                      ;//sysj\rotary_controller.sysj line: 9, column: 4
                      S97912=1;
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
            S97912=1;
            S97912=0;
            S97896=0;
            if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
              readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
              S97896=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              S97891=0;
              if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                S97891=1;
                if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  ends[14]=2;
                  ;//sysj\rotary_controller.sysj line: 9, column: 4
                  S97912=1;
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

  public void thread98195(int [] tdone, int [] ends){
        switch(S97970){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        thread98196(tdone,ends);
        thread98197(tdone,ends);
        int biggest98198 = 0;
        if(ends[14]>=biggest98198){
          biggest98198=ends[14];
        }
        if(ends[15]>=biggest98198){
          biggest98198=ends[15];
        }
        if(biggest98198 == 1){
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        //FINXME code
        if(biggest98198 == 0){
          S97970=0;
          active[13]=0;
          ends[13]=0;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread98194(int [] tdone, int [] ends){
        active[12]=0;
    ends[12]=0;
    tdone[12]=1;
  }

  public void thread98193(int [] tdone, int [] ends){
        switch(S97972){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread98194(tdone,ends);
        thread98195(tdone,ends);
        int biggest98199 = 0;
        if(ends[12]>=biggest98199){
          biggest98199=ends[12];
        }
        if(ends[13]>=biggest98199){
          biggest98199=ends[13];
        }
        if(biggest98199 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest98199 == 0){
          S97972=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread98190(int [] tdone, int [] ends){
        switch(S97883){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S97877){
          case 0 : 
            S97877=0;
            if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 7
              rC_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 5
              currsigs.addElement(rC_1);
              S97877=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S97877=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            S97877=1;
            S97877=0;
            if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 7
              rC_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 5
              currsigs.addElement(rC_1);
              S97877=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S97877=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread98189(int [] tdone, int [] ends){
        switch(S97875){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S97827){
          case 0 : 
            switch(S97811){
              case 0 : 
                if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S97811=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  switch(S97806){
                    case 0 : 
                      if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                        readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                        S97806=1;
                        if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                          readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                          ends[9]=2;
                          ;//sysj\rotary_controller.sysj line: 9, column: 4
                          S97827=1;
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
                        S97827=1;
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
                S97811=1;
                S97811=0;
                if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  S97811=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  S97806=0;
                  if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                    readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                    S97806=1;
                    if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                      readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                      ends[9]=2;
                      ;//sysj\rotary_controller.sysj line: 9, column: 4
                      S97827=1;
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
            S97827=1;
            S97827=0;
            S97811=0;
            if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
              readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
              S97811=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S97806=0;
              if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
                S97806=1;
                if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
                  readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
                  ends[9]=2;
                  ;//sysj\rotary_controller.sysj line: 9, column: 4
                  S97827=1;
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

  public void thread98188(int [] tdone, int [] ends){
        switch(S97885){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread98189(tdone,ends);
        thread98190(tdone,ends);
        int biggest98191 = 0;
        if(ends[9]>=biggest98191){
          biggest98191=ends[9];
        }
        if(ends[10]>=biggest98191){
          biggest98191=ends[10];
        }
        if(biggest98191 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest98191 == 0){
          S97885=0;
          active[8]=0;
          ends[8]=0;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread98187(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread98186(int [] tdone, int [] ends){
        switch(S97887){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread98187(tdone,ends);
        thread98188(tdone,ends);
        int biggest98192 = 0;
        if(ends[7]>=biggest98192){
          biggest98192=ends[7];
        }
        if(ends[8]>=biggest98192){
          biggest98192=ends[8];
        }
        if(biggest98192 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest98192 == 0){
          S97887=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread98185(int [] tdone, int [] ends){
        switch(S98144){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread98186(tdone,ends);
        thread98193(tdone,ends);
        thread98200(tdone,ends);
        thread98207(tdone,ends);
        int biggest98214 = 0;
        if(ends[6]>=biggest98214){
          biggest98214=ends[6];
        }
        if(ends[11]>=biggest98214){
          biggest98214=ends[11];
        }
        if(ends[16]>=biggest98214){
          biggest98214=ends[16];
        }
        if(ends[21]>=biggest98214){
          biggest98214=ends[21];
        }
        if(biggest98214 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest98214 == 0){
          S98144=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread98184(int [] tdone, int [] ends){
        switch(S97802){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S97780){
          case 0 : 
            if(bottleAtPos5.getprestatus() && conveyorEngaged.getprestatus()){//sysj\rotary_controller.sysj line: 72, column: 10
              S97780=1;
              if(!bottleAtPos5.getprestatus()){//sysj\rotary_controller.sysj line: 73, column: 20
                S97780=2;
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
              S97780=2;
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
            S97780=2;
            S97780=0;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread98183(int [] tdone, int [] ends){
        switch(S97770){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S97722){
          case 0 : 
            switch(S97706){
              case 0 : 
                if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 61, column: 4
                  newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
                  S97706=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S97701){
                    case 0 : 
                      if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
                        newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 61, column: 4
                        S97701=1;
                        if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
                          newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
                          ends[3]=2;
                          ;//sysj\rotary_controller.sysj line: 61, column: 4
                          load.setPresent();//sysj\rotary_controller.sysj line: 62, column: 4
                          currsigs.addElement(load);
                          S97722=1;
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
                        S97722=1;
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
                S97706=1;
                S97706=0;
                if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 61, column: 4
                  newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
                  S97706=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S97701=0;
                  if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
                    newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 61, column: 4
                    S97701=1;
                    if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
                      newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
                      ends[3]=2;
                      ;//sysj\rotary_controller.sysj line: 61, column: 4
                      load.setPresent();//sysj\rotary_controller.sysj line: 62, column: 4
                      currsigs.addElement(load);
                      S97722=1;
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
            S97722=1;
            S97722=0;
            S97706=0;
            if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 61, column: 4
              newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
              S97706=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S97701=0;
              if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
                newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 61, column: 4
                S97701=1;
                if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
                  newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
                  ends[3]=2;
                  ;//sysj\rotary_controller.sysj line: 61, column: 4
                  load.setPresent();//sysj\rotary_controller.sysj line: 62, column: 4
                  currsigs.addElement(load);
                  S97722=1;
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

  public void thread98182(int [] tdone, int [] ends){
        switch(S97699){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S97665){
          case 0 : 
            if(rC_1.getprestatus() && rF_1.getprestatus() && rL_1.getprestatus() && rCa_1.getprestatus()){//sysj\rotary_controller.sysj line: 49, column: 11
              S97665=1;
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
              S97665=2;
              if(tableAlignedWithSensor.getprestatus()){//sysj\rotary_controller.sysj line: 51, column: 21
                S97665=3;
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
              S97665=3;
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
            S97665=3;
            S97665=4;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 4 : 
            S97665=4;
            S97665=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread98177(int [] tdone, int [] ends){
        S98138=1;
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

  public void thread98176(int [] tdone, int [] ends){
        S98130=1;
    S98082=0;
    S98066=0;
    if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
      readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
      S98066=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S98061=0;
      if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
        readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
        S98061=1;
        if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
          readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
          ends[24]=2;
          ;//sysj\rotary_controller.sysj line: 9, column: 4
          S98082=1;
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

  public void thread98175(int [] tdone, int [] ends){
        S98140=1;
    thread98176(tdone,ends);
    thread98177(tdone,ends);
    int biggest98178 = 0;
    if(ends[24]>=biggest98178){
      biggest98178=ends[24];
    }
    if(ends[25]>=biggest98178){
      biggest98178=ends[25];
    }
    if(biggest98178 == 1){
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread98174(int [] tdone, int [] ends){
        active[22]=0;
    ends[22]=0;
    tdone[22]=1;
  }

  public void thread98173(int [] tdone, int [] ends){
        S98142=1;
    thread98174(tdone,ends);
    thread98175(tdone,ends);
    int biggest98179 = 0;
    if(ends[22]>=biggest98179){
      biggest98179=ends[22];
    }
    if(ends[23]>=biggest98179){
      biggest98179=ends[23];
    }
    if(biggest98179 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread98170(int [] tdone, int [] ends){
        S98053=1;
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

  public void thread98169(int [] tdone, int [] ends){
        S98045=1;
    S97997=0;
    S97981=0;
    if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
      readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
      S97981=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S97976=0;
      if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
        readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
        S97976=1;
        if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
          readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
          ends[19]=2;
          ;//sysj\rotary_controller.sysj line: 9, column: 4
          S97997=1;
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

  public void thread98168(int [] tdone, int [] ends){
        S98055=1;
    thread98169(tdone,ends);
    thread98170(tdone,ends);
    int biggest98171 = 0;
    if(ends[19]>=biggest98171){
      biggest98171=ends[19];
    }
    if(ends[20]>=biggest98171){
      biggest98171=ends[20];
    }
    if(biggest98171 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread98167(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread98166(int [] tdone, int [] ends){
        S98057=1;
    thread98167(tdone,ends);
    thread98168(tdone,ends);
    int biggest98172 = 0;
    if(ends[17]>=biggest98172){
      biggest98172=ends[17];
    }
    if(ends[18]>=biggest98172){
      biggest98172=ends[18];
    }
    if(biggest98172 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread98163(int [] tdone, int [] ends){
        S97968=1;
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

  public void thread98162(int [] tdone, int [] ends){
        S97960=1;
    S97912=0;
    S97896=0;
    if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
      readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
      S97896=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S97891=0;
      if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
        readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
        S97891=1;
        if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
          readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
          ends[14]=2;
          ;//sysj\rotary_controller.sysj line: 9, column: 4
          S97912=1;
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

  public void thread98161(int [] tdone, int [] ends){
        S97970=1;
    thread98162(tdone,ends);
    thread98163(tdone,ends);
    int biggest98164 = 0;
    if(ends[14]>=biggest98164){
      biggest98164=ends[14];
    }
    if(ends[15]>=biggest98164){
      biggest98164=ends[15];
    }
    if(biggest98164 == 1){
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread98160(int [] tdone, int [] ends){
        active[12]=0;
    ends[12]=0;
    tdone[12]=1;
  }

  public void thread98159(int [] tdone, int [] ends){
        S97972=1;
    thread98160(tdone,ends);
    thread98161(tdone,ends);
    int biggest98165 = 0;
    if(ends[12]>=biggest98165){
      biggest98165=ends[12];
    }
    if(ends[13]>=biggest98165){
      biggest98165=ends[13];
    }
    if(biggest98165 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread98156(int [] tdone, int [] ends){
        S97883=1;
    S97877=0;
    if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 16, column: 7
      rC_1.setPresent();//sysj\rotary_controller.sysj line: 17, column: 5
      currsigs.addElement(rC_1);
      S97877=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S97877=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread98155(int [] tdone, int [] ends){
        S97875=1;
    S97827=0;
    S97811=0;
    if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 9, column: 4
      readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
      S97811=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S97806=0;
      if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
        readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 9, column: 4
        S97806=1;
        if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 9, column: 4
          readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 9, column: 4
          ends[9]=2;
          ;//sysj\rotary_controller.sysj line: 9, column: 4
          S97827=1;
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

  public void thread98154(int [] tdone, int [] ends){
        S97885=1;
    thread98155(tdone,ends);
    thread98156(tdone,ends);
    int biggest98157 = 0;
    if(ends[9]>=biggest98157){
      biggest98157=ends[9];
    }
    if(ends[10]>=biggest98157){
      biggest98157=ends[10];
    }
    if(biggest98157 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread98153(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread98152(int [] tdone, int [] ends){
        S97887=1;
    thread98153(tdone,ends);
    thread98154(tdone,ends);
    int biggest98158 = 0;
    if(ends[7]>=biggest98158){
      biggest98158=ends[7];
    }
    if(ends[8]>=biggest98158){
      biggest98158=ends[8];
    }
    if(biggest98158 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread98151(int [] tdone, int [] ends){
        S98144=1;
    thread98152(tdone,ends);
    thread98159(tdone,ends);
    thread98166(tdone,ends);
    thread98173(tdone,ends);
    int biggest98180 = 0;
    if(ends[6]>=biggest98180){
      biggest98180=ends[6];
    }
    if(ends[11]>=biggest98180){
      biggest98180=ends[11];
    }
    if(ends[16]>=biggest98180){
      biggest98180=ends[16];
    }
    if(ends[21]>=biggest98180){
      biggest98180=ends[21];
    }
    if(biggest98180 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread98150(int [] tdone, int [] ends){
        S97802=1;
    S97780=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread98149(int [] tdone, int [] ends){
        S97770=1;
    S97722=0;
    S97706=0;
    if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 61, column: 4
      newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
      S97706=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S97701=0;
      if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
        newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 61, column: 4
        S97701=1;
        if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 61, column: 4
          newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 61, column: 4
          ends[3]=2;
          ;//sysj\rotary_controller.sysj line: 61, column: 4
          load.setPresent();//sysj\rotary_controller.sysj line: 62, column: 4
          currsigs.addElement(load);
          S97722=1;
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

  public void thread98148(int [] tdone, int [] ends){
        S97699=1;
    S97665=0;
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
      switch(S98146){
        case 0 : 
          S98146=0;
          break RUN;
        
        case 1 : 
          S98146=2;
          S98146=2;
          rC_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          rF_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          rL_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          rCa_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          thread98148(tdone,ends);
          thread98149(tdone,ends);
          thread98150(tdone,ends);
          thread98151(tdone,ends);
          int biggest98181 = 0;
          if(ends[2]>=biggest98181){
            biggest98181=ends[2];
          }
          if(ends[3]>=biggest98181){
            biggest98181=ends[3];
          }
          if(ends[4]>=biggest98181){
            biggest98181=ends[4];
          }
          if(ends[5]>=biggest98181){
            biggest98181=ends[5];
          }
          if(biggest98181 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rC_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          rF_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          rL_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          rCa_1.setClear();//sysj\rotary_controller.sysj line: 46, column: 2
          thread98182(tdone,ends);
          thread98183(tdone,ends);
          thread98184(tdone,ends);
          thread98185(tdone,ends);
          int biggest98215 = 0;
          if(ends[2]>=biggest98215){
            biggest98215=ends[2];
          }
          if(ends[3]>=biggest98215){
            biggest98215=ends[3];
          }
          if(ends[4]>=biggest98215){
            biggest98215=ends[4];
          }
          if(ends[5]>=biggest98215){
            biggest98215=ends[5];
          }
          if(biggest98215 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest98215 == 0){
            S98146=0;
            active[1]=0;
            ends[1]=0;
            S98146=0;
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
