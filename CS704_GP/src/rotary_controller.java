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
  private int S1180 = 1;
  private int S53 = 1;
  private int S7 = 1;
  private int S172 = 1;
  private int S92 = 1;
  private int S60 = 1;
  private int S55 = 1;
  private int S204 = 1;
  private int S182 = 1;
  private int S1178 = 1;
  private int S447 = 1;
  private int S445 = 1;
  private int S277 = 1;
  private int S229 = 1;
  private int S213 = 1;
  private int S208 = 1;
  private int S285 = 1;
  private int S279 = 1;
  private int S690 = 1;
  private int S688 = 1;
  private int S520 = 1;
  private int S472 = 1;
  private int S456 = 1;
  private int S451 = 1;
  private int S528 = 1;
  private int S933 = 1;
  private int S931 = 1;
  private int S763 = 1;
  private int S715 = 1;
  private int S699 = 1;
  private int S694 = 1;
  private int S771 = 1;
  private int S1176 = 1;
  private int S1174 = 1;
  private int S1006 = 1;
  private int S958 = 1;
  private int S942 = 1;
  private int S937 = 1;
  private int S1014 = 1;
  
  private int[] ends = new int[26];
  private int[] tdone = new int[26];
  
  public void thread1257(int [] tdone, int [] ends){
        S1014=1;
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

  public void thread1256(int [] tdone, int [] ends){
        S1006=1;
    S958=0;
    S942=0;
    if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
      readyCapper_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
      S942=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S937=0;
      if(!readyCapper_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
        readyCapper_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
        S937=1;
        if(readyCapper_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
          readyCapper_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
          ends[24]=2;
          ;//sysj/rotary_controller.sysj line: 9, column: 5
          S958=1;
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

  public void thread1254(int [] tdone, int [] ends){
        switch(S1014){
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

  public void thread1253(int [] tdone, int [] ends){
        switch(S1006){
      case 0 : 
        active[24]=0;
        ends[24]=0;
        tdone[24]=1;
        break;
      
      case 1 : 
        switch(S958){
          case 0 : 
            switch(S942){
              case 0 : 
                if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyCapper_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  S942=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  switch(S937){
                    case 0 : 
                      if(!readyCapper_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                        readyCapper_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                        S937=1;
                        if(readyCapper_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                          readyCapper_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                          ends[24]=2;
                          ;//sysj/rotary_controller.sysj line: 9, column: 5
                          S958=1;
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
                        S958=1;
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
                S942=1;
                S942=0;
                if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyCapper_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  S942=1;
                  active[24]=1;
                  ends[24]=1;
                  tdone[24]=1;
                }
                else {
                  S937=0;
                  if(!readyCapper_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                    readyCapper_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                    S937=1;
                    if(readyCapper_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                      readyCapper_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                      ends[24]=2;
                      ;//sysj/rotary_controller.sysj line: 9, column: 5
                      S958=1;
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
            S958=1;
            S958=0;
            S942=0;
            if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
              readyCapper_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
              S942=1;
              active[24]=1;
              ends[24]=1;
              tdone[24]=1;
            }
            else {
              S937=0;
              if(!readyCapper_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                readyCapper_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                S937=1;
                if(readyCapper_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyCapper_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  ends[24]=2;
                  ;//sysj/rotary_controller.sysj line: 9, column: 5
                  S958=1;
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

  public void thread1252(int [] tdone, int [] ends){
        switch(S1174){
      case 0 : 
        active[23]=0;
        ends[23]=0;
        tdone[23]=1;
        break;
      
      case 1 : 
        thread1253(tdone,ends);
        thread1254(tdone,ends);
        int biggest1255 = 0;
        if(ends[24]>=biggest1255){
          biggest1255=ends[24];
        }
        if(ends[25]>=biggest1255){
          biggest1255=ends[25];
        }
        if(biggest1255 == 1){
          active[23]=1;
          ends[23]=1;
          tdone[23]=1;
        }
        //FINXME code
        if(biggest1255 == 0){
          thread1256(tdone,ends);
          thread1257(tdone,ends);
          int biggest1258 = 0;
          if(ends[24]>=biggest1258){
            biggest1258=ends[24];
          }
          if(ends[25]>=biggest1258){
            biggest1258=ends[25];
          }
          if(biggest1258 == 1){
            active[23]=1;
            ends[23]=1;
            tdone[23]=1;
          }
        }
        break;
      
    }
  }

  public void thread1251(int [] tdone, int [] ends){
        active[22]=0;
    ends[22]=0;
    tdone[22]=1;
  }

  public void thread1250(int [] tdone, int [] ends){
        switch(S1176){
      case 0 : 
        active[21]=0;
        ends[21]=0;
        tdone[21]=1;
        break;
      
      case 1 : 
        thread1251(tdone,ends);
        thread1252(tdone,ends);
        int biggest1259 = 0;
        if(ends[22]>=biggest1259){
          biggest1259=ends[22];
        }
        if(ends[23]>=biggest1259){
          biggest1259=ends[23];
        }
        if(biggest1259 == 1){
          active[21]=1;
          ends[21]=1;
          tdone[21]=1;
        }
        //FINXME code
        if(biggest1259 == 0){
          S1176=0;
          active[21]=0;
          ends[21]=0;
          tdone[21]=1;
        }
        break;
      
    }
  }

  public void thread1247(int [] tdone, int [] ends){
        S771=1;
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

  public void thread1246(int [] tdone, int [] ends){
        S763=1;
    S715=0;
    S699=0;
    if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
      readyLidLoader_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
      S699=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S694=0;
      if(!readyLidLoader_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
        readyLidLoader_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
        S694=1;
        if(readyLidLoader_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
          readyLidLoader_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
          ends[19]=2;
          ;//sysj/rotary_controller.sysj line: 9, column: 5
          S715=1;
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

  public void thread1244(int [] tdone, int [] ends){
        switch(S771){
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

  public void thread1243(int [] tdone, int [] ends){
        switch(S763){
      case 0 : 
        active[19]=0;
        ends[19]=0;
        tdone[19]=1;
        break;
      
      case 1 : 
        switch(S715){
          case 0 : 
            switch(S699){
              case 0 : 
                if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyLidLoader_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  S699=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  switch(S694){
                    case 0 : 
                      if(!readyLidLoader_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                        readyLidLoader_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                        S694=1;
                        if(readyLidLoader_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                          readyLidLoader_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                          ends[19]=2;
                          ;//sysj/rotary_controller.sysj line: 9, column: 5
                          S715=1;
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
                        S715=1;
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
                S699=1;
                S699=0;
                if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyLidLoader_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  S699=1;
                  active[19]=1;
                  ends[19]=1;
                  tdone[19]=1;
                }
                else {
                  S694=0;
                  if(!readyLidLoader_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                    readyLidLoader_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                    S694=1;
                    if(readyLidLoader_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                      readyLidLoader_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                      ends[19]=2;
                      ;//sysj/rotary_controller.sysj line: 9, column: 5
                      S715=1;
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
            S715=1;
            S715=0;
            S699=0;
            if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
              readyLidLoader_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
              S699=1;
              active[19]=1;
              ends[19]=1;
              tdone[19]=1;
            }
            else {
              S694=0;
              if(!readyLidLoader_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                readyLidLoader_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                S694=1;
                if(readyLidLoader_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyLidLoader_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  ends[19]=2;
                  ;//sysj/rotary_controller.sysj line: 9, column: 5
                  S715=1;
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

  public void thread1242(int [] tdone, int [] ends){
        switch(S931){
      case 0 : 
        active[18]=0;
        ends[18]=0;
        tdone[18]=1;
        break;
      
      case 1 : 
        thread1243(tdone,ends);
        thread1244(tdone,ends);
        int biggest1245 = 0;
        if(ends[19]>=biggest1245){
          biggest1245=ends[19];
        }
        if(ends[20]>=biggest1245){
          biggest1245=ends[20];
        }
        if(biggest1245 == 1){
          active[18]=1;
          ends[18]=1;
          tdone[18]=1;
        }
        //FINXME code
        if(biggest1245 == 0){
          thread1246(tdone,ends);
          thread1247(tdone,ends);
          int biggest1248 = 0;
          if(ends[19]>=biggest1248){
            biggest1248=ends[19];
          }
          if(ends[20]>=biggest1248){
            biggest1248=ends[20];
          }
          if(biggest1248 == 1){
            active[18]=1;
            ends[18]=1;
            tdone[18]=1;
          }
        }
        break;
      
    }
  }

  public void thread1241(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread1240(int [] tdone, int [] ends){
        switch(S933){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        thread1241(tdone,ends);
        thread1242(tdone,ends);
        int biggest1249 = 0;
        if(ends[17]>=biggest1249){
          biggest1249=ends[17];
        }
        if(ends[18]>=biggest1249){
          biggest1249=ends[18];
        }
        if(biggest1249 == 1){
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        //FINXME code
        if(biggest1249 == 0){
          S933=0;
          active[16]=0;
          ends[16]=0;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread1237(int [] tdone, int [] ends){
        S528=1;
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

  public void thread1236(int [] tdone, int [] ends){
        S520=1;
    S472=0;
    S456=0;
    if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
      readyFiller_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
      S456=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S451=0;
      if(!readyFiller_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
        readyFiller_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
        S451=1;
        if(readyFiller_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
          readyFiller_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
          ends[14]=2;
          ;//sysj/rotary_controller.sysj line: 9, column: 5
          S472=1;
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

  public void thread1234(int [] tdone, int [] ends){
        switch(S528){
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

  public void thread1233(int [] tdone, int [] ends){
        switch(S520){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        switch(S472){
          case 0 : 
            switch(S456){
              case 0 : 
                if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyFiller_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  S456=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  switch(S451){
                    case 0 : 
                      if(!readyFiller_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                        readyFiller_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                        S451=1;
                        if(readyFiller_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                          readyFiller_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                          ends[14]=2;
                          ;//sysj/rotary_controller.sysj line: 9, column: 5
                          S472=1;
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
                        S472=1;
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
                S456=1;
                S456=0;
                if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyFiller_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  S456=1;
                  active[14]=1;
                  ends[14]=1;
                  tdone[14]=1;
                }
                else {
                  S451=0;
                  if(!readyFiller_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                    readyFiller_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                    S451=1;
                    if(readyFiller_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                      readyFiller_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                      ends[14]=2;
                      ;//sysj/rotary_controller.sysj line: 9, column: 5
                      S472=1;
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
            S472=1;
            S472=0;
            S456=0;
            if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
              readyFiller_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
              S456=1;
              active[14]=1;
              ends[14]=1;
              tdone[14]=1;
            }
            else {
              S451=0;
              if(!readyFiller_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                readyFiller_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                S451=1;
                if(readyFiller_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyFiller_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  ends[14]=2;
                  ;//sysj/rotary_controller.sysj line: 9, column: 5
                  S472=1;
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

  public void thread1232(int [] tdone, int [] ends){
        switch(S688){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        thread1233(tdone,ends);
        thread1234(tdone,ends);
        int biggest1235 = 0;
        if(ends[14]>=biggest1235){
          biggest1235=ends[14];
        }
        if(ends[15]>=biggest1235){
          biggest1235=ends[15];
        }
        if(biggest1235 == 1){
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        //FINXME code
        if(biggest1235 == 0){
          thread1236(tdone,ends);
          thread1237(tdone,ends);
          int biggest1238 = 0;
          if(ends[14]>=biggest1238){
            biggest1238=ends[14];
          }
          if(ends[15]>=biggest1238){
            biggest1238=ends[15];
          }
          if(biggest1238 == 1){
            active[13]=1;
            ends[13]=1;
            tdone[13]=1;
          }
        }
        break;
      
    }
  }

  public void thread1231(int [] tdone, int [] ends){
        active[12]=0;
    ends[12]=0;
    tdone[12]=1;
  }

  public void thread1230(int [] tdone, int [] ends){
        switch(S690){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        thread1231(tdone,ends);
        thread1232(tdone,ends);
        int biggest1239 = 0;
        if(ends[12]>=biggest1239){
          biggest1239=ends[12];
        }
        if(ends[13]>=biggest1239){
          biggest1239=ends[13];
        }
        if(biggest1239 == 1){
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        //FINXME code
        if(biggest1239 == 0){
          S690=0;
          active[11]=0;
          ends[11]=0;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread1227(int [] tdone, int [] ends){
        S285=1;
    S279=0;
    if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj/rotary_controller.sysj line: 16, column: 8
      rC_1.setPresent();//sysj/rotary_controller.sysj line: 17, column: 6
      currsigs.addElement(rC_1);
      System.out.println("Emitted rC_1");
      S279=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S279=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread1226(int [] tdone, int [] ends){
        S277=1;
    S229=0;
    S213=0;
    if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
      readyConveyor_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
      S213=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S208=0;
      if(!readyConveyor_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
        readyConveyor_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
        S208=1;
        if(readyConveyor_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
          readyConveyor_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
          ends[9]=2;
          ;//sysj/rotary_controller.sysj line: 9, column: 5
          S229=1;
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

  public void thread1224(int [] tdone, int [] ends){
        switch(S285){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        switch(S279){
          case 0 : 
            S279=0;
            if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj/rotary_controller.sysj line: 16, column: 8
              rC_1.setPresent();//sysj/rotary_controller.sysj line: 17, column: 6
              currsigs.addElement(rC_1);
              System.out.println("Emitted rC_1");
              S279=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S279=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
          case 1 : 
            S279=1;
            S279=0;
            if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj/rotary_controller.sysj line: 16, column: 8
              rC_1.setPresent();//sysj/rotary_controller.sysj line: 17, column: 6
              currsigs.addElement(rC_1);
              System.out.println("Emitted rC_1");
              S279=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            else {
              S279=1;
              active[10]=1;
              ends[10]=1;
              tdone[10]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread1223(int [] tdone, int [] ends){
        switch(S277){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S229){
          case 0 : 
            switch(S213){
              case 0 : 
                if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyConveyor_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  S213=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  switch(S208){
                    case 0 : 
                      if(!readyConveyor_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                        readyConveyor_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                        S208=1;
                        if(readyConveyor_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                          readyConveyor_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                          ends[9]=2;
                          ;//sysj/rotary_controller.sysj line: 9, column: 5
                          S229=1;
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
                        S229=1;
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
                S213=1;
                S213=0;
                if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyConveyor_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  S213=1;
                  active[9]=1;
                  ends[9]=1;
                  tdone[9]=1;
                }
                else {
                  S208=0;
                  if(!readyConveyor_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                    readyConveyor_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                    S208=1;
                    if(readyConveyor_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                      readyConveyor_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                      ends[9]=2;
                      ;//sysj/rotary_controller.sysj line: 9, column: 5
                      S229=1;
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
            S229=1;
            S229=0;
            S213=0;
            if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
              readyConveyor_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
              S213=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            else {
              S208=0;
              if(!readyConveyor_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                readyConveyor_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
                S208=1;
                if(readyConveyor_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
                  readyConveyor_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
                  ends[9]=2;
                  ;//sysj/rotary_controller.sysj line: 9, column: 5
                  S229=1;
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

  public void thread1222(int [] tdone, int [] ends){
        switch(S445){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        thread1223(tdone,ends);
        thread1224(tdone,ends);
        int biggest1225 = 0;
        if(ends[9]>=biggest1225){
          biggest1225=ends[9];
        }
        if(ends[10]>=biggest1225){
          biggest1225=ends[10];
        }
        if(biggest1225 == 1){
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        //FINXME code
        if(biggest1225 == 0){
          thread1226(tdone,ends);
          thread1227(tdone,ends);
          int biggest1228 = 0;
          if(ends[9]>=biggest1228){
            biggest1228=ends[9];
          }
          if(ends[10]>=biggest1228){
            biggest1228=ends[10];
          }
          if(biggest1228 == 1){
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
        }
        break;
      
    }
  }

  public void thread1221(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread1220(int [] tdone, int [] ends){
        switch(S447){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread1221(tdone,ends);
        thread1222(tdone,ends);
        int biggest1229 = 0;
        if(ends[7]>=biggest1229){
          biggest1229=ends[7];
        }
        if(ends[8]>=biggest1229){
          biggest1229=ends[8];
        }
        if(biggest1229 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest1229 == 0){
          S447=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread1219(int [] tdone, int [] ends){
        switch(S1178){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread1220(tdone,ends);
        thread1230(tdone,ends);
        thread1240(tdone,ends);
        thread1250(tdone,ends);
        int biggest1260 = 0;
        if(ends[6]>=biggest1260){
          biggest1260=ends[6];
        }
        if(ends[11]>=biggest1260){
          biggest1260=ends[11];
        }
        if(ends[16]>=biggest1260){
          biggest1260=ends[16];
        }
        if(ends[21]>=biggest1260){
          biggest1260=ends[21];
        }
        if(biggest1260 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest1260 == 0){
          S1178=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread1218(int [] tdone, int [] ends){
        switch(S204){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S182){
          case 0 : 
            if(bottleAtPos5.getprestatus() && conveyorEngaged.getprestatus()){//sysj/rotary_controller.sysj line: 63, column: 10
              S182=1;
              deload.setPresent();//sysj/rotary_controller.sysj line: 65, column: 5
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
            if(!bottleAtPos5.getprestatus()){//sysj/rotary_controller.sysj line: 64, column: 10
              S182=2;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              deload.setPresent();//sysj/rotary_controller.sysj line: 65, column: 5
              currsigs.addElement(deload);
              System.out.println("Emitted deload");
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 2 : 
            S182=2;
            S182=0;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread1217(int [] tdone, int [] ends){
        switch(S172){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S92){
          case 0 : 
            switch(S60){
              case 0 : 
                if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 53, column: 4
                  newOrder_in.setACK(false);//sysj/rotary_controller.sysj line: 53, column: 4
                  S60=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  switch(S55){
                    case 0 : 
                      if(!newOrder_in.isREQ()){//sysj/rotary_controller.sysj line: 53, column: 4
                        newOrder_in.setACK(true);//sysj/rotary_controller.sysj line: 53, column: 4
                        S55=1;
                        if(newOrder_in.isREQ()){//sysj/rotary_controller.sysj line: 53, column: 4
                          newOrder_in.setACK(false);//sysj/rotary_controller.sysj line: 53, column: 4
                          ends[3]=2;
                          ;//sysj/rotary_controller.sysj line: 53, column: 4
                          S92=1;
                          load.setPresent();//sysj/rotary_controller.sysj line: 55, column: 5
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
                        S92=1;
                        load.setPresent();//sysj/rotary_controller.sysj line: 55, column: 5
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
                S60=1;
                S60=0;
                if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 53, column: 4
                  newOrder_in.setACK(false);//sysj/rotary_controller.sysj line: 53, column: 4
                  S60=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S55=0;
                  if(!newOrder_in.isREQ()){//sysj/rotary_controller.sysj line: 53, column: 4
                    newOrder_in.setACK(true);//sysj/rotary_controller.sysj line: 53, column: 4
                    S55=1;
                    if(newOrder_in.isREQ()){//sysj/rotary_controller.sysj line: 53, column: 4
                      newOrder_in.setACK(false);//sysj/rotary_controller.sysj line: 53, column: 4
                      ends[3]=2;
                      ;//sysj/rotary_controller.sysj line: 53, column: 4
                      S92=1;
                      load.setPresent();//sysj/rotary_controller.sysj line: 55, column: 5
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
            if(bottleAtPos1.getprestatus()){//sysj/rotary_controller.sysj line: 54, column: 10
              S92=2;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              load.setPresent();//sysj/rotary_controller.sysj line: 55, column: 5
              currsigs.addElement(load);
              System.out.println("Emitted load");
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            S92=2;
            S92=0;
            S60=0;
            if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 53, column: 4
              newOrder_in.setACK(false);//sysj/rotary_controller.sysj line: 53, column: 4
              S60=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              S55=0;
              if(!newOrder_in.isREQ()){//sysj/rotary_controller.sysj line: 53, column: 4
                newOrder_in.setACK(true);//sysj/rotary_controller.sysj line: 53, column: 4
                S55=1;
                if(newOrder_in.isREQ()){//sysj/rotary_controller.sysj line: 53, column: 4
                  newOrder_in.setACK(false);//sysj/rotary_controller.sysj line: 53, column: 4
                  ends[3]=2;
                  ;//sysj/rotary_controller.sysj line: 53, column: 4
                  S92=1;
                  load.setPresent();//sysj/rotary_controller.sysj line: 55, column: 5
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

  public void thread1216(int [] tdone, int [] ends){
        switch(S53){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S7){
          case 0 : 
            if(rC_1.getprestatus() && rF_1.getprestatus() && rL_1.getprestatus() && rCa_1.getprestatus()){//sysj/rotary_controller.sysj line: 43, column: 11
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
            if(!rotaryEmpty.getprestatus() && !bottleAtPos5.getprestatus()){//sysj/rotary_controller.sysj line: 44, column: 11
              S7=2;
              if(tableAlignedWithSensor.getprestatus()){//sysj/rotary_controller.sysj line: 45, column: 21
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
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj/rotary_controller.sysj line: 45, column: 21
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

  public void thread1211(int [] tdone, int [] ends){
        S1014=1;
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

  public void thread1210(int [] tdone, int [] ends){
        S1006=1;
    S958=0;
    S942=0;
    if(!readyCapper_in.isPartnerPresent() || readyCapper_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
      readyCapper_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
      S942=1;
      active[24]=1;
      ends[24]=1;
      tdone[24]=1;
    }
    else {
      S937=0;
      if(!readyCapper_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
        readyCapper_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
        S937=1;
        if(readyCapper_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
          readyCapper_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
          ends[24]=2;
          ;//sysj/rotary_controller.sysj line: 9, column: 5
          S958=1;
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

  public void thread1209(int [] tdone, int [] ends){
        S1174=1;
    thread1210(tdone,ends);
    thread1211(tdone,ends);
    int biggest1212 = 0;
    if(ends[24]>=biggest1212){
      biggest1212=ends[24];
    }
    if(ends[25]>=biggest1212){
      biggest1212=ends[25];
    }
    if(biggest1212 == 1){
      active[23]=1;
      ends[23]=1;
      tdone[23]=1;
    }
  }

  public void thread1208(int [] tdone, int [] ends){
        active[22]=0;
    ends[22]=0;
    tdone[22]=1;
  }

  public void thread1207(int [] tdone, int [] ends){
        S1176=1;
    thread1208(tdone,ends);
    thread1209(tdone,ends);
    int biggest1213 = 0;
    if(ends[22]>=biggest1213){
      biggest1213=ends[22];
    }
    if(ends[23]>=biggest1213){
      biggest1213=ends[23];
    }
    if(biggest1213 == 1){
      active[21]=1;
      ends[21]=1;
      tdone[21]=1;
    }
  }

  public void thread1204(int [] tdone, int [] ends){
        S771=1;
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

  public void thread1203(int [] tdone, int [] ends){
        S763=1;
    S715=0;
    S699=0;
    if(!readyLidLoader_in.isPartnerPresent() || readyLidLoader_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
      readyLidLoader_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
      S699=1;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
    else {
      S694=0;
      if(!readyLidLoader_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
        readyLidLoader_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
        S694=1;
        if(readyLidLoader_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
          readyLidLoader_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
          ends[19]=2;
          ;//sysj/rotary_controller.sysj line: 9, column: 5
          S715=1;
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

  public void thread1202(int [] tdone, int [] ends){
        S931=1;
    thread1203(tdone,ends);
    thread1204(tdone,ends);
    int biggest1205 = 0;
    if(ends[19]>=biggest1205){
      biggest1205=ends[19];
    }
    if(ends[20]>=biggest1205){
      biggest1205=ends[20];
    }
    if(biggest1205 == 1){
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }

  public void thread1201(int [] tdone, int [] ends){
        active[17]=0;
    ends[17]=0;
    tdone[17]=1;
  }

  public void thread1200(int [] tdone, int [] ends){
        S933=1;
    thread1201(tdone,ends);
    thread1202(tdone,ends);
    int biggest1206 = 0;
    if(ends[17]>=biggest1206){
      biggest1206=ends[17];
    }
    if(ends[18]>=biggest1206){
      biggest1206=ends[18];
    }
    if(biggest1206 == 1){
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread1197(int [] tdone, int [] ends){
        S528=1;
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

  public void thread1196(int [] tdone, int [] ends){
        S520=1;
    S472=0;
    S456=0;
    if(!readyFiller_in.isPartnerPresent() || readyFiller_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
      readyFiller_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
      S456=1;
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      S451=0;
      if(!readyFiller_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
        readyFiller_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
        S451=1;
        if(readyFiller_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
          readyFiller_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
          ends[14]=2;
          ;//sysj/rotary_controller.sysj line: 9, column: 5
          S472=1;
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

  public void thread1195(int [] tdone, int [] ends){
        S688=1;
    thread1196(tdone,ends);
    thread1197(tdone,ends);
    int biggest1198 = 0;
    if(ends[14]>=biggest1198){
      biggest1198=ends[14];
    }
    if(ends[15]>=biggest1198){
      biggest1198=ends[15];
    }
    if(biggest1198 == 1){
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread1194(int [] tdone, int [] ends){
        active[12]=0;
    ends[12]=0;
    tdone[12]=1;
  }

  public void thread1193(int [] tdone, int [] ends){
        S690=1;
    thread1194(tdone,ends);
    thread1195(tdone,ends);
    int biggest1199 = 0;
    if(ends[12]>=biggest1199){
      biggest1199=ends[12];
    }
    if(ends[13]>=biggest1199){
      biggest1199=ends[13];
    }
    if(biggest1199 == 1){
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread1190(int [] tdone, int [] ends){
        S285=1;
    S279=0;
    if((readyConveyor_in.getVal() == null ? null : ((Boolean)readyConveyor_in.getVal())) == Boolean.TRUE){//sysj/rotary_controller.sysj line: 16, column: 8
      rC_1.setPresent();//sysj/rotary_controller.sysj line: 17, column: 6
      currsigs.addElement(rC_1);
      System.out.println("Emitted rC_1");
      S279=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      S279=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread1189(int [] tdone, int [] ends){
        S277=1;
    S229=0;
    S213=0;
    if(!readyConveyor_in.isPartnerPresent() || readyConveyor_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 9, column: 5
      readyConveyor_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
      S213=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      S208=0;
      if(!readyConveyor_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
        readyConveyor_in.setACK(true);//sysj/rotary_controller.sysj line: 9, column: 5
        S208=1;
        if(readyConveyor_in.isREQ()){//sysj/rotary_controller.sysj line: 9, column: 5
          readyConveyor_in.setACK(false);//sysj/rotary_controller.sysj line: 9, column: 5
          ends[9]=2;
          ;//sysj/rotary_controller.sysj line: 9, column: 5
          S229=1;
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

  public void thread1188(int [] tdone, int [] ends){
        S445=1;
    thread1189(tdone,ends);
    thread1190(tdone,ends);
    int biggest1191 = 0;
    if(ends[9]>=biggest1191){
      biggest1191=ends[9];
    }
    if(ends[10]>=biggest1191){
      biggest1191=ends[10];
    }
    if(biggest1191 == 1){
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread1187(int [] tdone, int [] ends){
        active[7]=0;
    ends[7]=0;
    tdone[7]=1;
  }

  public void thread1186(int [] tdone, int [] ends){
        S447=1;
    thread1187(tdone,ends);
    thread1188(tdone,ends);
    int biggest1192 = 0;
    if(ends[7]>=biggest1192){
      biggest1192=ends[7];
    }
    if(ends[8]>=biggest1192){
      biggest1192=ends[8];
    }
    if(biggest1192 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread1185(int [] tdone, int [] ends){
        S1178=1;
    thread1186(tdone,ends);
    thread1193(tdone,ends);
    thread1200(tdone,ends);
    thread1207(tdone,ends);
    int biggest1214 = 0;
    if(ends[6]>=biggest1214){
      biggest1214=ends[6];
    }
    if(ends[11]>=biggest1214){
      biggest1214=ends[11];
    }
    if(ends[16]>=biggest1214){
      biggest1214=ends[16];
    }
    if(ends[21]>=biggest1214){
      biggest1214=ends[21];
    }
    if(biggest1214 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread1184(int [] tdone, int [] ends){
        S204=1;
    S182=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread1183(int [] tdone, int [] ends){
        S172=1;
    S92=0;
    S60=0;
    if(!newOrder_in.isPartnerPresent() || newOrder_in.isPartnerPreempted()){//sysj/rotary_controller.sysj line: 53, column: 4
      newOrder_in.setACK(false);//sysj/rotary_controller.sysj line: 53, column: 4
      S60=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S55=0;
      if(!newOrder_in.isREQ()){//sysj/rotary_controller.sysj line: 53, column: 4
        newOrder_in.setACK(true);//sysj/rotary_controller.sysj line: 53, column: 4
        S55=1;
        if(newOrder_in.isREQ()){//sysj/rotary_controller.sysj line: 53, column: 4
          newOrder_in.setACK(false);//sysj/rotary_controller.sysj line: 53, column: 4
          ends[3]=2;
          ;//sysj/rotary_controller.sysj line: 53, column: 4
          S92=1;
          load.setPresent();//sysj/rotary_controller.sysj line: 55, column: 5
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

  public void thread1182(int [] tdone, int [] ends){
        S53=1;
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
      switch(S1180){
        case 0 : 
          S1180=0;
          break RUN;
        
        case 1 : 
          S1180=2;
          S1180=2;
          rC_1.setClear();//sysj/rotary_controller.sysj line: 40, column: 2
          rF_1.setClear();//sysj/rotary_controller.sysj line: 40, column: 2
          rL_1.setClear();//sysj/rotary_controller.sysj line: 40, column: 2
          rCa_1.setClear();//sysj/rotary_controller.sysj line: 40, column: 2
          thread1182(tdone,ends);
          thread1183(tdone,ends);
          thread1184(tdone,ends);
          thread1185(tdone,ends);
          int biggest1215 = 0;
          if(ends[2]>=biggest1215){
            biggest1215=ends[2];
          }
          if(ends[3]>=biggest1215){
            biggest1215=ends[3];
          }
          if(ends[4]>=biggest1215){
            biggest1215=ends[4];
          }
          if(ends[5]>=biggest1215){
            biggest1215=ends[5];
          }
          if(biggest1215 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          rC_1.setClear();//sysj/rotary_controller.sysj line: 40, column: 2
          rF_1.setClear();//sysj/rotary_controller.sysj line: 40, column: 2
          rL_1.setClear();//sysj/rotary_controller.sysj line: 40, column: 2
          rCa_1.setClear();//sysj/rotary_controller.sysj line: 40, column: 2
          thread1216(tdone,ends);
          thread1217(tdone,ends);
          thread1218(tdone,ends);
          thread1219(tdone,ends);
          int biggest1261 = 0;
          if(ends[2]>=biggest1261){
            biggest1261=ends[2];
          }
          if(ends[3]>=biggest1261){
            biggest1261=ends[3];
          }
          if(ends[4]>=biggest1261){
            biggest1261=ends[4];
          }
          if(ends[5]>=biggest1261){
            biggest1261=ends[5];
          }
          if(biggest1261 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest1261 == 0){
            S1180=0;
            active[1]=0;
            ends[1]=0;
            S1180=0;
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
