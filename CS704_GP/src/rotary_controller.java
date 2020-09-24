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
  public Signal rotaryEmpty = new Signal("rotaryEmpty", Signal.INPUT);
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
  private int S161851 = 1;
  private int S161336 = 1;
  private int S161290 = 1;
  private int S161407 = 1;
  private int S161359 = 1;
  private int S161343 = 1;
  private int S161338 = 1;
  private int S161439 = 1;
  private int S161417 = 1;
  private int S161849 = 1;
  private int S161541 = 1;
  private int S161539 = 1;
  private int S161473 = 1;
  private int S161465 = 1;
  private int S161464 = 1;
  private int S161448 = 1;
  private int S161443 = 1;
  private int S161471 = 1;
  private int S161643 = 1;
  private int S161641 = 1;
  private int S161575 = 1;
  private int S161567 = 1;
  private int S161566 = 1;
  private int S161550 = 1;
  private int S161545 = 1;
  private int S161573 = 1;
  private int S161745 = 1;
  private int S161743 = 1;
  private int S161677 = 1;
  private int S161669 = 1;
  private int S161668 = 1;
  private int S161652 = 1;
  private int S161647 = 1;
  private int S161675 = 1;
  private int S161847 = 1;
  private int S161845 = 1;
  private int S161779 = 1;
  private int S161771 = 1;
  private int S161770 = 1;
  private int S161754 = 1;
  private int S161749 = 1;
  private int S161777 = 1;
  
  private int[] ends = new int[26];
  private int[] tdone = new int[26];
  
  public void thread161928(int [] tdone, int [] ends){
        S161777=1;
    if((readyCapper_in.getVal() == null ? null : ((Boolean)readyCapper_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 10, column: 12
      rCa_1.setPresent();//sysj\rotary_controller.sysj line: 10, column: 35
      currsigs.addElement(rCa_1);
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S161777=0;
      active[25]=0;
      ends[25]=0;
      tdone[25]=1;
    }
  }

  public void thread161927(int [] tdone, int [] ends){
        S161771=1;
    S161770=0;
    S161754=0;
    if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 8
      readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
      S161754=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S161749=0;
      if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
        readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 8
        S161749=1;
        if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
          readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
          ends[24]=2;
          ;//sysj\rotary_controller.sysj line: 8, column: 8
          S161770=1;
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

  public void thread161925(int [] tdone, int [] ends){
        switch(S161777){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        rCa_1.setPresent();//sysj\rotary_controller.sysj line: 10, column: 35
        currsigs.addElement(rCa_1);
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
        break;
      
    }
  }

  public void thread161924(int [] tdone, int [] ends){
        switch(S161771){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S161770){
          case 0 : 
            switch(S161754){
              case 0 : 
                if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 8
                  readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
                  S161754=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  switch(S161749){
                    case 0 : 
                      if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
                        readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 8
                        S161749=1;
                        if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
                          readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
                          ends[24]=2;
                          ;//sysj\rotary_controller.sysj line: 8, column: 8
                          S161770=1;
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
                      if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
                        readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
                        ends[24]=2;
                        ;//sysj\rotary_controller.sysj line: 8, column: 8
                        S161770=1;
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
                S161754=1;
                S161754=0;
                if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 8
                  readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
                  S161754=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  S161749=0;
                  if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
                    readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 8
                    S161749=1;
                    if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
                      readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
                      ends[24]=2;
                      ;//sysj\rotary_controller.sysj line: 8, column: 8
                      S161770=1;
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
            S161770=1;
            S161770=2;
            active[24]=1;
            ends[24]=1;
            tdone[24]=1;
            break;
          
          case 2 : 
            S161770=2;
            readyCapper_in.setPreempted();//sysj\rotary_controller.sysj line: 8, column: 37
            ends[24]=2;
            tdone[24]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread161923(int [] tdone, int [] ends){
        switch(S161845){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        switch(S161779){
          case 0 : 
            thread161924(tdone,ends);
            thread161925(tdone,ends);
            int biggest161926 = 0;
            if(ends[24]>=biggest161926){
              biggest161926=ends[24];
            }
            if(ends[25]>=biggest161926){
              biggest161926=ends[25];
            }
            if(biggest161926 == 1){
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            if(biggest161926 == 2){
              ends[23]=2;
              ;//sysj\rotary_controller.sysj line: 7, column: 6
              S161779=1;
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            //FINXME code
            if(biggest161926 == 0){
              S161779=1;
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
          case 1 : 
            S161779=1;
            S161779=0;
            thread161927(tdone,ends);
            thread161928(tdone,ends);
            int biggest161929 = 0;
            if(ends[24]>=biggest161929){
              biggest161929=ends[24];
            }
            if(ends[25]>=biggest161929){
              biggest161929=ends[25];
            }
            if(biggest161929 == 1){
              active[23]=1;
              ends[23]=1;
              tdone[23]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread161922(int [] tdone, int [] ends){
        active[22]=0;
    ends[22]=0;
    tdone[22]=1;
  }

  public void thread161921(int [] tdone, int [] ends){
        switch(S161847){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        thread161922(tdone,ends);
        thread161923(tdone,ends);
        int biggest161930 = 0;
        if(ends[22]>=biggest161930){
          biggest161930=ends[22];
        }
        if(ends[23]>=biggest161930){
          biggest161930=ends[23];
        }
        if(biggest161930 == 1){
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        //FINXME code
        if(biggest161930 == 0){
          S161847=0;
          active[21]=0;
          ends[21]=0;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread161918(int [] tdone, int [] ends){
        S161675=1;
    if((readyLidLoader_in.getVal() == null ? null : ((Boolean)readyLidLoader_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 10, column: 12
      rL_1.setPresent();//sysj\rotary_controller.sysj line: 10, column: 35
      currsigs.addElement(rL_1);
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      S161675=0;
      active[20]=0;
      ends[20]=0;
      tdone[20]=1;
    }
  }

  public void thread161917(int [] tdone, int [] ends){
        S161669=1;
    S161668=0;
    S161652=0;
    if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 8
      readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
      S161652=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S161647=0;
      if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
        readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 8
        S161647=1;
        if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
          readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
          ends[19]=2;
          ;//sysj\rotary_controller.sysj line: 8, column: 8
          S161668=1;
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

  public void thread161915(int [] tdone, int [] ends){
        switch(S161675){
      case 0 : 
        active[20]=0;
        ends[20]=0;
        tdone[20]=1;
        break;
      
      case 1 : 
        rL_1.setPresent();//sysj\rotary_controller.sysj line: 10, column: 35
        currsigs.addElement(rL_1);
        active[20]=1;
        ends[20]=1;
        tdone[20]=1;
        break;
      
    }
  }

  public void thread161914(int [] tdone, int [] ends){
        switch(S161669){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S161668){
          case 0 : 
            switch(S161652){
              case 0 : 
                if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 8
                  readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
                  S161652=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  switch(S161647){
                    case 0 : 
                      if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
                        readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 8
                        S161647=1;
                        if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
                          readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
                          ends[19]=2;
                          ;//sysj\rotary_controller.sysj line: 8, column: 8
                          S161668=1;
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
                      if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
                        readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
                        ends[19]=2;
                        ;//sysj\rotary_controller.sysj line: 8, column: 8
                        S161668=1;
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
                S161652=1;
                S161652=0;
                if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 8
                  readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
                  S161652=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  S161647=0;
                  if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
                    readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 8
                    S161647=1;
                    if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
                      readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
                      ends[19]=2;
                      ;//sysj\rotary_controller.sysj line: 8, column: 8
                      S161668=1;
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
            S161668=1;
            S161668=2;
            active[19]=1;
            ends[19]=1;
            tdone[19]=1;
            break;
          
          case 2 : 
            S161668=2;
            readyLidLoader_in.setPreempted();//sysj\rotary_controller.sysj line: 8, column: 37
            ends[19]=2;
            tdone[19]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread161913(int [] tdone, int [] ends){
        switch(S161743){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        switch(S161677){
          case 0 : 
            thread161914(tdone,ends);
            thread161915(tdone,ends);
            int biggest161916 = 0;
            if(ends[19]>=biggest161916){
              biggest161916=ends[19];
            }
            if(ends[20]>=biggest161916){
              biggest161916=ends[20];
            }
            if(biggest161916 == 1){
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            if(biggest161916 == 2){
              ends[18]=2;
              ;//sysj\rotary_controller.sysj line: 7, column: 6
              S161677=1;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            //FINXME code
            if(biggest161916 == 0){
              S161677=1;
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
          case 1 : 
            S161677=1;
            S161677=0;
            thread161917(tdone,ends);
            thread161918(tdone,ends);
            int biggest161919 = 0;
            if(ends[19]>=biggest161919){
              biggest161919=ends[19];
            }
            if(ends[20]>=biggest161919){
              biggest161919=ends[20];
            }
            if(biggest161919 == 1){
              active[18]=1;
              ends[18]=1;
              tdone[18]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread161912(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread161911(int [] tdone, int [] ends){
        switch(S161745){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        thread161912(tdone,ends);
        thread161913(tdone,ends);
        int biggest161920 = 0;
        if(ends[17]>=biggest161920){
          biggest161920=ends[17];
        }
        if(ends[18]>=biggest161920){
          biggest161920=ends[18];
        }
        if(biggest161920 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        //FINXME code
        if(biggest161920 == 0){
          S161745=0;
          active[16]=0;
          ends[16]=0;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread161908(int [] tdone, int [] ends){
        S161573=1;
    if((readyFiller_in.getVal() == null ? null : ((Boolean)readyFiller_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 10, column: 12
      rF_1.setPresent();//sysj\rotary_controller.sysj line: 10, column: 35
      currsigs.addElement(rF_1);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      S161573=0;
      active[15]=0;
      ends[15]=0;
      tdone[15]=1;
    }
  }

  public void thread161907(int [] tdone, int [] ends){
        S161567=1;
    S161566=0;
    S161550=0;
    if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 8
      readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
      S161550=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S161545=0;
      if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
        readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 8
        S161545=1;
        if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
          readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
          ends[14]=2;
          ;//sysj\rotary_controller.sysj line: 8, column: 8
          S161566=1;
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

  public void thread161905(int [] tdone, int [] ends){
        switch(S161573){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        rF_1.setPresent();//sysj\rotary_controller.sysj line: 10, column: 35
        currsigs.addElement(rF_1);
        active[15]=1;
        ends[15]=1;
        tdone[15]=1;
        break;
      
    }
  }

  public void thread161904(int [] tdone, int [] ends){
        switch(S161567){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S161566){
          case 0 : 
            switch(S161550){
              case 0 : 
                if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 8
                  readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
                  S161550=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  switch(S161545){
                    case 0 : 
                      if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
                        readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 8
                        S161545=1;
                        if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
                          readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
                          ends[14]=2;
                          ;//sysj\rotary_controller.sysj line: 8, column: 8
                          S161566=1;
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
                      if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
                        readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
                        ends[14]=2;
                        ;//sysj\rotary_controller.sysj line: 8, column: 8
                        S161566=1;
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
                S161550=1;
                S161550=0;
                if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 8
                  readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
                  S161550=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  S161545=0;
                  if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
                    readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 8
                    S161545=1;
                    if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
                      readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
                      ends[14]=2;
                      ;//sysj\rotary_controller.sysj line: 8, column: 8
                      S161566=1;
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
            S161566=1;
            S161566=2;
            active[14]=1;
            ends[14]=1;
            tdone[14]=1;
            break;
          
          case 2 : 
            S161566=2;
            readyFiller_in.setPreempted();//sysj\rotary_controller.sysj line: 8, column: 37
            ends[14]=2;
            tdone[14]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread161903(int [] tdone, int [] ends){
        switch(S161641){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        switch(S161575){
          case 0 : 
            thread161904(tdone,ends);
            thread161905(tdone,ends);
            int biggest161906 = 0;
            if(ends[14]>=biggest161906){
              biggest161906=ends[14];
            }
            if(ends[15]>=biggest161906){
              biggest161906=ends[15];
            }
            if(biggest161906 == 1){
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            if(biggest161906 == 2){
              ends[13]=2;
              ;//sysj\rotary_controller.sysj line: 7, column: 6
              S161575=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            //FINXME code
            if(biggest161906 == 0){
              S161575=1;
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
          case 1 : 
            S161575=1;
            S161575=0;
            thread161907(tdone,ends);
            thread161908(tdone,ends);
            int biggest161909 = 0;
            if(ends[14]>=biggest161909){
              biggest161909=ends[14];
            }
            if(ends[15]>=biggest161909){
              biggest161909=ends[15];
            }
            if(biggest161909 == 1){
              active[13]=1;
              ends[13]=1;
              tdone[13]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread161902(int [] tdone, int [] ends){
        active[12]=0;
    ends[12]=0;
    tdone[12]=1;
  }

  public void thread161901(int [] tdone, int [] ends){
        switch(S161643){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread161902(tdone,ends);
        thread161903(tdone,ends);
        int biggest161910 = 0;
        if(ends[12]>=biggest161910){
          biggest161910=ends[12];
        }
        if(ends[13]>=biggest161910){
          biggest161910=ends[13];
        }
        if(biggest161910 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest161910 == 0){
          S161643=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread161898(int [] tdone, int [] ends){
        S161471=1;
    if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 10, column: 12
      rC_1.setPresent();//sysj\rotary_controller.sysj line: 10, column: 35
      currsigs.addElement(rC_1);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S161471=0;
      active[10]=0;
      ends[10]=0;
      tdone[10]=1;
    }
  }

  public void thread161897(int [] tdone, int [] ends){
        S161465=1;
    S161464=0;
    S161448=0;
    if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 8
      readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
      S161448=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S161443=0;
      if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
        readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 8
        S161443=1;
        if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
          readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
          ends[9]=2;
          ;//sysj\rotary_controller.sysj line: 8, column: 8
          S161464=1;
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

  public void thread161895(int [] tdone, int [] ends){
        switch(S161471){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        rC_1.setPresent();//sysj\rotary_controller.sysj line: 10, column: 35
        currsigs.addElement(rC_1);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread161894(int [] tdone, int [] ends){
        switch(S161465){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S161464){
          case 0 : 
            switch(S161448){
              case 0 : 
                if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 8
                  readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
                  S161448=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  switch(S161443){
                    case 0 : 
                      if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
                        readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 8
                        S161443=1;
                        if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
                          readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
                          ends[9]=2;
                          ;//sysj\rotary_controller.sysj line: 8, column: 8
                          S161464=1;
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
                      if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
                        readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
                        ends[9]=2;
                        ;//sysj\rotary_controller.sysj line: 8, column: 8
                        S161464=1;
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
                S161448=1;
                S161448=0;
                if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 8
                  readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
                  S161448=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  S161443=0;
                  if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
                    readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 8
                    S161443=1;
                    if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
                      readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
                      ends[9]=2;
                      ;//sysj\rotary_controller.sysj line: 8, column: 8
                      S161464=1;
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
            S161464=1;
            S161464=2;
            active[9]=1;
            ends[9]=1;
            tdone[9]=1;
            break;
          
          case 2 : 
            S161464=2;
            readyConveyor_in.setPreempted();//sysj\rotary_controller.sysj line: 8, column: 37
            ends[9]=2;
            tdone[9]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread161893(int [] tdone, int [] ends){
        switch(S161539){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S161473){
          case 0 : 
            thread161894(tdone,ends);
            thread161895(tdone,ends);
            int biggest161896 = 0;
            if(ends[9]>=biggest161896){
              biggest161896=ends[9];
            }
            if(ends[10]>=biggest161896){
              biggest161896=ends[10];
            }
            if(biggest161896 == 1){
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            if(biggest161896 == 2){
              ends[8]=2;
              ;//sysj\rotary_controller.sysj line: 7, column: 6
              S161473=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            //FINXME code
            if(biggest161896 == 0){
              S161473=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S161473=1;
            S161473=0;
            thread161897(tdone,ends);
            thread161898(tdone,ends);
            int biggest161899 = 0;
            if(ends[9]>=biggest161899){
              biggest161899=ends[9];
            }
            if(ends[10]>=biggest161899){
              biggest161899=ends[10];
            }
            if(biggest161899 == 1){
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread161892(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread161891(int [] tdone, int [] ends){
        switch(S161541){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread161892(tdone,ends);
        thread161893(tdone,ends);
        int biggest161900 = 0;
        if(ends[7]>=biggest161900){
          biggest161900=ends[7];
        }
        if(ends[8]>=biggest161900){
          biggest161900=ends[8];
        }
        if(biggest161900 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest161900 == 0){
          S161541=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread161890(int [] tdone, int [] ends){
        switch(S161849){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread161891(tdone,ends);
        thread161901(tdone,ends);
        thread161911(tdone,ends);
        thread161921(tdone,ends);
        int biggest161931 = 0;
        if(ends[6]>=biggest161931){
          biggest161931=ends[6];
        }
        if(ends[11]>=biggest161931){
          biggest161931=ends[11];
        }
        if(ends[16]>=biggest161931){
          biggest161931=ends[16];
        }
        if(ends[21]>=biggest161931){
          biggest161931=ends[21];
        }
        if(biggest161931 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest161931 == 0){
          S161849=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread161889(int [] tdone, int [] ends){
        switch(S161439){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S161417){
          case 0 : 
            if(bottleAtPos5.getprestatus() && conveyorEngaged.getprestatus()){//sysj\rotary_controller.sysj line: 73, column: 10
              S161417=1;
              if(!bottleAtPos5.getprestatus()){//sysj\rotary_controller.sysj line: 74, column: 20
                S161417=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                deload.setPresent();//sysj\rotary_controller.sysj line: 75, column: 5
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
            if(!bottleAtPos5.getprestatus()){//sysj\rotary_controller.sysj line: 74, column: 20
              S161417=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              deload.setPresent();//sysj\rotary_controller.sysj line: 75, column: 5
              currsigs.addElement(deload);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            S161417=2;
            S161417=0;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread161888(int [] tdone, int [] ends){
        switch(S161407){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S161359){
          case 0 : 
            switch(S161343){
              case 0 : 
                if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 62, column: 4
                  newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 62, column: 4
                  S161343=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S161338){
                    case 0 : 
                      if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 62, column: 4
                        newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 62, column: 4
                        S161338=1;
                        if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 62, column: 4
                          newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 62, column: 4
                          ends[3]=2;
                          ;//sysj\rotary_controller.sysj line: 62, column: 4
                          load.setPresent();//sysj\rotary_controller.sysj line: 63, column: 4
                          currsigs.addElement(load);
                          S161359=1;
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
                      if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 62, column: 4
                        newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 62, column: 4
                        ends[3]=2;
                        ;//sysj\rotary_controller.sysj line: 62, column: 4
                        load.setPresent();//sysj\rotary_controller.sysj line: 63, column: 4
                        currsigs.addElement(load);
                        S161359=1;
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
                S161343=1;
                S161343=0;
                if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 62, column: 4
                  newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 62, column: 4
                  S161343=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S161338=0;
                  if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 62, column: 4
                    newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 62, column: 4
                    S161338=1;
                    if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 62, column: 4
                      newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 62, column: 4
                      ends[3]=2;
                      ;//sysj\rotary_controller.sysj line: 62, column: 4
                      load.setPresent();//sysj\rotary_controller.sysj line: 63, column: 4
                      currsigs.addElement(load);
                      S161359=1;
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
            S161359=1;
            S161359=0;
            S161343=0;
            if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 62, column: 4
              newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 62, column: 4
              S161343=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S161338=0;
              if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 62, column: 4
                newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 62, column: 4
                S161338=1;
                if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 62, column: 4
                  newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 62, column: 4
                  ends[3]=2;
                  ;//sysj\rotary_controller.sysj line: 62, column: 4
                  load.setPresent();//sysj\rotary_controller.sysj line: 63, column: 4
                  currsigs.addElement(load);
                  S161359=1;
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

  public void thread161887(int [] tdone, int [] ends){
        switch(S161336){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S161290){
          case 0 : 
            if(rC_1.getprestatus() && rF_1.getprestatus() && rL_1.getprestatus() && rCa_1.getprestatus()){//sysj\rotary_controller.sysj line: 52, column: 11
              S161290=1;
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
            if(!rotaryEmpty.getprestatus() && !bottleAtPos5.getprestatus()){//sysj\rotary_controller.sysj line: 53, column: 11
              S161290=2;
              if(tableAlignedWithSensor.getprestatus()){//sysj\rotary_controller.sysj line: 54, column: 21
                S161290=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                rotaryTableTrigger.setPresent();//sysj\rotary_controller.sysj line: 55, column: 5
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
            if(tableAlignedWithSensor.getprestatus()){//sysj\rotary_controller.sysj line: 54, column: 21
              S161290=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              rotaryTableTrigger.setPresent();//sysj\rotary_controller.sysj line: 55, column: 5
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

  public void thread161882(int [] tdone, int [] ends){
        S161777=1;
    if((readyCapper_in.getVal() == null ? null : ((Boolean)readyCapper_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 10, column: 12
      rCa_1.setPresent();//sysj\rotary_controller.sysj line: 10, column: 35
      currsigs.addElement(rCa_1);
      active[25]=1;
      ends[25]=1;
      tdone[25]=1;
    }
    else {
      S161777=0;
      active[25]=0;
      ends[25]=0;
      tdone[25]=1;
    }
  }

  public void thread161881(int [] tdone, int [] ends){
        S161771=1;
    S161770=0;
    S161754=0;
    if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 8
      readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
      S161754=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S161749=0;
      if(!readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
        readyCapper_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 8
        S161749=1;
        if(readyCapper_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
          readyCapper_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
          ends[24]=2;
          ;//sysj\rotary_controller.sysj line: 8, column: 8
          S161770=1;
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

  public void thread161880(int [] tdone, int [] ends){
        S161845=1;
    S161779=0;
    thread161881(tdone,ends);
    thread161882(tdone,ends);
    int biggest161883 = 0;
    if(ends[24]>=biggest161883){
      biggest161883=ends[24];
    }
    if(ends[25]>=biggest161883){
      biggest161883=ends[25];
    }
    if(biggest161883 == 1){
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread161879(int [] tdone, int [] ends){
        active[22]=0;
    ends[22]=0;
    tdone[22]=1;
  }

  public void thread161878(int [] tdone, int [] ends){
        S161847=1;
    thread161879(tdone,ends);
    thread161880(tdone,ends);
    int biggest161884 = 0;
    if(ends[22]>=biggest161884){
      biggest161884=ends[22];
    }
    if(ends[23]>=biggest161884){
      biggest161884=ends[23];
    }
    if(biggest161884 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread161875(int [] tdone, int [] ends){
        S161675=1;
    if((readyLidLoader_in.getVal() == null ? null : ((Boolean)readyLidLoader_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 10, column: 12
      rL_1.setPresent();//sysj\rotary_controller.sysj line: 10, column: 35
      currsigs.addElement(rL_1);
      active[20]=1;
      ends[20]=1;
      tdone[20]=1;
    }
    else {
      S161675=0;
      active[20]=0;
      ends[20]=0;
      tdone[20]=1;
    }
  }

  public void thread161874(int [] tdone, int [] ends){
        S161669=1;
    S161668=0;
    S161652=0;
    if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 8
      readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
      S161652=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S161647=0;
      if(!readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
        readyLidLoader_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 8
        S161647=1;
        if(readyLidLoader_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
          readyLidLoader_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
          ends[19]=2;
          ;//sysj\rotary_controller.sysj line: 8, column: 8
          S161668=1;
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

  public void thread161873(int [] tdone, int [] ends){
        S161743=1;
    S161677=0;
    thread161874(tdone,ends);
    thread161875(tdone,ends);
    int biggest161876 = 0;
    if(ends[19]>=biggest161876){
      biggest161876=ends[19];
    }
    if(ends[20]>=biggest161876){
      biggest161876=ends[20];
    }
    if(biggest161876 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread161872(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread161871(int [] tdone, int [] ends){
        S161745=1;
    thread161872(tdone,ends);
    thread161873(tdone,ends);
    int biggest161877 = 0;
    if(ends[17]>=biggest161877){
      biggest161877=ends[17];
    }
    if(ends[18]>=biggest161877){
      biggest161877=ends[18];
    }
    if(biggest161877 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread161868(int [] tdone, int [] ends){
        S161573=1;
    if((readyFiller_in.getVal() == null ? null : ((Boolean)readyFiller_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 10, column: 12
      rF_1.setPresent();//sysj\rotary_controller.sysj line: 10, column: 35
      currsigs.addElement(rF_1);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      S161573=0;
      active[15]=0;
      ends[15]=0;
      tdone[15]=1;
    }
  }

  public void thread161867(int [] tdone, int [] ends){
        S161567=1;
    S161566=0;
    S161550=0;
    if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 8
      readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
      S161550=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S161545=0;
      if(!readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
        readyFiller_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 8
        S161545=1;
        if(readyFiller_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
          readyFiller_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
          ends[14]=2;
          ;//sysj\rotary_controller.sysj line: 8, column: 8
          S161566=1;
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

  public void thread161866(int [] tdone, int [] ends){
        S161641=1;
    S161575=0;
    thread161867(tdone,ends);
    thread161868(tdone,ends);
    int biggest161869 = 0;
    if(ends[14]>=biggest161869){
      biggest161869=ends[14];
    }
    if(ends[15]>=biggest161869){
      biggest161869=ends[15];
    }
    if(biggest161869 == 1){
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread161865(int [] tdone, int [] ends){
        active[12]=0;
    ends[12]=0;
    tdone[12]=1;
  }

  public void thread161864(int [] tdone, int [] ends){
        S161643=1;
    thread161865(tdone,ends);
    thread161866(tdone,ends);
    int biggest161870 = 0;
    if(ends[12]>=biggest161870){
      biggest161870=ends[12];
    }
    if(ends[13]>=biggest161870){
      biggest161870=ends[13];
    }
    if(biggest161870 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread161861(int [] tdone, int [] ends){
        S161471=1;
    if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj\rotary_controller.sysj line: 10, column: 12
      rC_1.setPresent();//sysj\rotary_controller.sysj line: 10, column: 35
      currsigs.addElement(rC_1);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S161471=0;
      active[10]=0;
      ends[10]=0;
      tdone[10]=1;
    }
  }

  public void thread161860(int [] tdone, int [] ends){
        S161465=1;
    S161464=0;
    S161448=0;
    if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 8, column: 8
      readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
      S161448=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S161443=0;
      if(!readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
        readyConveyor_in.setACK(true);//sysj\rotary_controller.sysj line: 8, column: 8
        S161443=1;
        if(readyConveyor_in.isREQ()){//sysj\rotary_controller.sysj line: 8, column: 8
          readyConveyor_in.setACK(false);//sysj\rotary_controller.sysj line: 8, column: 8
          ends[9]=2;
          ;//sysj\rotary_controller.sysj line: 8, column: 8
          S161464=1;
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

  public void thread161859(int [] tdone, int [] ends){
        S161539=1;
    S161473=0;
    thread161860(tdone,ends);
    thread161861(tdone,ends);
    int biggest161862 = 0;
    if(ends[9]>=biggest161862){
      biggest161862=ends[9];
    }
    if(ends[10]>=biggest161862){
      biggest161862=ends[10];
    }
    if(biggest161862 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread161858(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread161857(int [] tdone, int [] ends){
        S161541=1;
    thread161858(tdone,ends);
    thread161859(tdone,ends);
    int biggest161863 = 0;
    if(ends[7]>=biggest161863){
      biggest161863=ends[7];
    }
    if(ends[8]>=biggest161863){
      biggest161863=ends[8];
    }
    if(biggest161863 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread161856(int [] tdone, int [] ends){
        S161849=1;
    thread161857(tdone,ends);
    thread161864(tdone,ends);
    thread161871(tdone,ends);
    thread161878(tdone,ends);
    int biggest161885 = 0;
    if(ends[6]>=biggest161885){
      biggest161885=ends[6];
    }
    if(ends[11]>=biggest161885){
      biggest161885=ends[11];
    }
    if(ends[16]>=biggest161885){
      biggest161885=ends[16];
    }
    if(ends[21]>=biggest161885){
      biggest161885=ends[21];
    }
    if(biggest161885 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread161855(int [] tdone, int [] ends){
        S161439=1;
    S161417=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread161854(int [] tdone, int [] ends){
        S161407=1;
    S161359=0;
    S161343=0;
    if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj\rotary_controller.sysj line: 62, column: 4
      newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 62, column: 4
      S161343=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S161338=0;
      if(!newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 62, column: 4
        newOrder_in.setACK(true);//sysj\rotary_controller.sysj line: 62, column: 4
        S161338=1;
        if(newOrder_in.isREQ()){//sysj\rotary_controller.sysj line: 62, column: 4
          newOrder_in.setACK(false);//sysj\rotary_controller.sysj line: 62, column: 4
          ends[3]=2;
          ;//sysj\rotary_controller.sysj line: 62, column: 4
          load.setPresent();//sysj\rotary_controller.sysj line: 63, column: 4
          currsigs.addElement(load);
          S161359=1;
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

  public void thread161853(int [] tdone, int [] ends){
        S161336=1;
    S161290=0;
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
      switch(S161851){
        case 0 : 
          S161851=0;
          break RUN;
        
        case 1 : 
          S161851=2;
          S161851=2;
          rC_1.setClear();//sysj\rotary_controller.sysj line: 49, column: 2
          rF_1.setClear();//sysj\rotary_controller.sysj line: 49, column: 2
          rL_1.setClear();//sysj\rotary_controller.sysj line: 49, column: 2
          rCa_1.setClear();//sysj\rotary_controller.sysj line: 49, column: 2
          thread161853(tdone,ends);
          thread161854(tdone,ends);
          thread161855(tdone,ends);
          thread161856(tdone,ends);
          int biggest161886 = 0;
          if(ends[2]>=biggest161886){
            biggest161886=ends[2];
          }
          if(ends[3]>=biggest161886){
            biggest161886=ends[3];
          }
          if(ends[4]>=biggest161886){
            biggest161886=ends[4];
          }
          if(ends[5]>=biggest161886){
            biggest161886=ends[5];
          }
          if(biggest161886 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rC_1.setClear();//sysj\rotary_controller.sysj line: 49, column: 2
          rF_1.setClear();//sysj\rotary_controller.sysj line: 49, column: 2
          rL_1.setClear();//sysj\rotary_controller.sysj line: 49, column: 2
          rCa_1.setClear();//sysj\rotary_controller.sysj line: 49, column: 2
          thread161887(tdone,ends);
          thread161888(tdone,ends);
          thread161889(tdone,ends);
          thread161890(tdone,ends);
          int biggest161932 = 0;
          if(ends[2]>=biggest161932){
            biggest161932=ends[2];
          }
          if(ends[3]>=biggest161932){
            biggest161932=ends[3];
          }
          if(ends[4]>=biggest161932){
            biggest161932=ends[4];
          }
          if(ends[5]>=biggest161932){
            biggest161932=ends[5];
          }
          if(biggest161932 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest161932 == 0){
            S161851=0;
            active[1]=0;
            ends[1]=0;
            S161851=0;
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
          rotaryEmpty.gethook();
          df = true;
        }
        runClockDomain();
      }
      tableAlignedWithSensor.setpreclear();
      bottleAtPos1.setpreclear();
      bottleAtPos5.setpreclear();
      conveyorEngaged.setpreclear();
      rotaryEmpty.setpreclear();
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
      dummyint = rotaryEmpty.getStatus() ? rotaryEmpty.setprepresent() : rotaryEmpty.setpreclear();
      rotaryEmpty.setpreval(rotaryEmpty.getValue());
      rotaryEmpty.setClear();
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
        rotaryEmpty.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
