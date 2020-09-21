import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import buffer.*;//sysj/liquid_buffer.sysj line: 1, column: 1

public class liquid_buffer extends ClockDomain{
  public liquid_buffer(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public input_Channel producerChannel_in = new input_Channel();
  public output_Channel consumerChannel_o = new output_Channel();
  private Signal bufferNotFull_1;
  private Signal bufferNotEmpty_1;
  private Signal requestData_1;
  private Signal fromBuffer_1;
  private Signal toBuffer_1;
  private ArrayList data_thread_2;//sysj/liquid_buffer.sysj line: 9, column: 3
  private int data_thread_3;//sysj/liquid_buffer.sysj line: 25, column: 3
  private Buffer myBuffer_thread_4;//sysj/liquid_buffer.sysj line: 49, column: 3
  private int data_thread_4;//sysj/liquid_buffer.sysj line: 50, column: 3
  private ArrayList liquidData_thread_4;//sysj/liquid_buffer.sysj line: 54, column: 5
  private int S870 = 1;
  private int S156 = 1;
  private int S155 = 1;
  private int S29 = 1;
  private int S27 = 1;
  private int S11 = 1;
  private int S6 = 1;
  private int S728 = 1;
  private int S727 = 1;
  private int S251 = 1;
  private int S157 = 1;
  private int S202 = 1;
  private int S164 = 1;
  private int S159 = 1;
  private int S868 = 1;
  
  private int[] ends = new int[5];
  private int[] tdone = new int[5];
  
  public void thread878(int [] tdone, int [] ends){
        switch(S868){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(toBuffer_1.getprestatus()){//sysj/liquid_buffer.sysj line: 53, column: 12
          liquidData_thread_4 = (ArrayList)(toBuffer_1.getpreval() == null ? null : ((ArrayList)toBuffer_1.getpreval()));//sysj/liquid_buffer.sysj line: 54, column: 5
          myBuffer_thread_4.push(liquidData_thread_4.get(0));//sysj/liquid_buffer.sysj line: 55, column: 5
          myBuffer_thread_4.push(liquidData_thread_4.get(1));//sysj/liquid_buffer.sysj line: 56, column: 5
          myBuffer_thread_4.push(liquidData_thread_4.get(2));//sysj/liquid_buffer.sysj line: 57, column: 5
          myBuffer_thread_4.push(liquidData_thread_4.get(3));//sysj/liquid_buffer.sysj line: 58, column: 5
          if(requestData_1.getprestatus()){//sysj/liquid_buffer.sysj line: 61, column: 12
            data_thread_4 = ((Integer)myBuffer_thread_4.pop());//sysj/liquid_buffer.sysj line: 62, column: 5
            fromBuffer_1.setPresent();//sysj/liquid_buffer.sysj line: 63, column: 5
            currsigs.addElement(fromBuffer_1);
            fromBuffer_1.setValue(data_thread_4);//sysj/liquid_buffer.sysj line: 63, column: 5
            if(!myBuffer_thread_4.isFull()){//sysj/liquid_buffer.sysj line: 66, column: 7
              bufferNotFull_1.setPresent();//sysj/liquid_buffer.sysj line: 67, column: 5
              currsigs.addElement(bufferNotFull_1);
              if(!myBuffer_thread_4.isEmpty()){//sysj/liquid_buffer.sysj line: 69, column: 7
                bufferNotEmpty_1.setPresent();//sysj/liquid_buffer.sysj line: 70, column: 5
                currsigs.addElement(bufferNotEmpty_1);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              if(!myBuffer_thread_4.isEmpty()){//sysj/liquid_buffer.sysj line: 69, column: 7
                bufferNotEmpty_1.setPresent();//sysj/liquid_buffer.sysj line: 70, column: 5
                currsigs.addElement(bufferNotEmpty_1);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
          }
          else {
            if(!myBuffer_thread_4.isFull()){//sysj/liquid_buffer.sysj line: 66, column: 7
              bufferNotFull_1.setPresent();//sysj/liquid_buffer.sysj line: 67, column: 5
              currsigs.addElement(bufferNotFull_1);
              if(!myBuffer_thread_4.isEmpty()){//sysj/liquid_buffer.sysj line: 69, column: 7
                bufferNotEmpty_1.setPresent();//sysj/liquid_buffer.sysj line: 70, column: 5
                currsigs.addElement(bufferNotEmpty_1);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              if(!myBuffer_thread_4.isEmpty()){//sysj/liquid_buffer.sysj line: 69, column: 7
                bufferNotEmpty_1.setPresent();//sysj/liquid_buffer.sysj line: 70, column: 5
                currsigs.addElement(bufferNotEmpty_1);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
          }
        }
        else {
          if(requestData_1.getprestatus()){//sysj/liquid_buffer.sysj line: 61, column: 12
            data_thread_4 = ((Integer)myBuffer_thread_4.pop());//sysj/liquid_buffer.sysj line: 62, column: 5
            fromBuffer_1.setPresent();//sysj/liquid_buffer.sysj line: 63, column: 5
            currsigs.addElement(fromBuffer_1);
            fromBuffer_1.setValue(data_thread_4);//sysj/liquid_buffer.sysj line: 63, column: 5
            if(!myBuffer_thread_4.isFull()){//sysj/liquid_buffer.sysj line: 66, column: 7
              bufferNotFull_1.setPresent();//sysj/liquid_buffer.sysj line: 67, column: 5
              currsigs.addElement(bufferNotFull_1);
              if(!myBuffer_thread_4.isEmpty()){//sysj/liquid_buffer.sysj line: 69, column: 7
                bufferNotEmpty_1.setPresent();//sysj/liquid_buffer.sysj line: 70, column: 5
                currsigs.addElement(bufferNotEmpty_1);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              if(!myBuffer_thread_4.isEmpty()){//sysj/liquid_buffer.sysj line: 69, column: 7
                bufferNotEmpty_1.setPresent();//sysj/liquid_buffer.sysj line: 70, column: 5
                currsigs.addElement(bufferNotEmpty_1);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
          }
          else {
            if(!myBuffer_thread_4.isFull()){//sysj/liquid_buffer.sysj line: 66, column: 7
              bufferNotFull_1.setPresent();//sysj/liquid_buffer.sysj line: 67, column: 5
              currsigs.addElement(bufferNotFull_1);
              if(!myBuffer_thread_4.isEmpty()){//sysj/liquid_buffer.sysj line: 69, column: 7
                bufferNotEmpty_1.setPresent();//sysj/liquid_buffer.sysj line: 70, column: 5
                currsigs.addElement(bufferNotEmpty_1);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              if(!myBuffer_thread_4.isEmpty()){//sysj/liquid_buffer.sysj line: 69, column: 7
                bufferNotEmpty_1.setPresent();//sysj/liquid_buffer.sysj line: 70, column: 5
                currsigs.addElement(bufferNotEmpty_1);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
          }
        }
        break;
      
    }
  }

  public void thread877(int [] tdone, int [] ends){
        switch(S728){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S727){
          case 0 : 
            switch(S251){
              case 0 : 
                switch(S157){
                  case 0 : 
                    S157=0;
                    S157=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                    break;
                  
                  case 1 : 
                    S157=1;
                    S157=2;
                    if(fromBuffer_1.getprestatus()){//sysj/liquid_buffer.sysj line: 35, column: 13
                      data_thread_3 = (fromBuffer_1.getpreval() == null ? null : ((Integer)fromBuffer_1.getpreval()));//sysj/liquid_buffer.sysj line: 36, column: 6
                      S202=0;
                      S164=0;
                      if(!consumerChannel_o.isPartnerPresent() || consumerChannel_o.isPartnerPreempted()){//sysj/liquid_buffer.sysj line: 37, column: 6
                        consumerChannel_o.setREQ(false);//sysj/liquid_buffer.sysj line: 37, column: 6
                        S164=1;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S159=0;
                        if(consumerChannel_o.isACK()){//sysj/liquid_buffer.sysj line: 37, column: 6
                          consumerChannel_o.setVal(data_thread_3);//sysj/liquid_buffer.sysj line: 37, column: 6
                          S159=1;
                          if(!consumerChannel_o.isACK()){//sysj/liquid_buffer.sysj line: 37, column: 6
                            consumerChannel_o.setREQ(false);//sysj/liquid_buffer.sysj line: 37, column: 6
                            ends[3]=2;
                            ;//sysj/liquid_buffer.sysj line: 37, column: 6
                            S202=1;
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
                    else {
                      S251=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    break;
                  
                  case 2 : 
                    switch(S202){
                      case 0 : 
                        switch(S164){
                          case 0 : 
                            if(!consumerChannel_o.isPartnerPresent() || consumerChannel_o.isPartnerPreempted()){//sysj/liquid_buffer.sysj line: 37, column: 6
                              consumerChannel_o.setREQ(false);//sysj/liquid_buffer.sysj line: 37, column: 6
                              S164=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              switch(S159){
                                case 0 : 
                                  if(consumerChannel_o.isACK()){//sysj/liquid_buffer.sysj line: 37, column: 6
                                    consumerChannel_o.setVal(data_thread_3);//sysj/liquid_buffer.sysj line: 37, column: 6
                                    S159=1;
                                    if(!consumerChannel_o.isACK()){//sysj/liquid_buffer.sysj line: 37, column: 6
                                      consumerChannel_o.setREQ(false);//sysj/liquid_buffer.sysj line: 37, column: 6
                                      ends[3]=2;
                                      ;//sysj/liquid_buffer.sysj line: 37, column: 6
                                      S202=1;
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
                                  if(!consumerChannel_o.isACK()){//sysj/liquid_buffer.sysj line: 37, column: 6
                                    consumerChannel_o.setREQ(false);//sysj/liquid_buffer.sysj line: 37, column: 6
                                    ends[3]=2;
                                    ;//sysj/liquid_buffer.sysj line: 37, column: 6
                                    S202=1;
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
                            S164=1;
                            S164=0;
                            if(!consumerChannel_o.isPartnerPresent() || consumerChannel_o.isPartnerPreempted()){//sysj/liquid_buffer.sysj line: 37, column: 6
                              consumerChannel_o.setREQ(false);//sysj/liquid_buffer.sysj line: 37, column: 6
                              S164=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S159=0;
                              if(consumerChannel_o.isACK()){//sysj/liquid_buffer.sysj line: 37, column: 6
                                consumerChannel_o.setVal(data_thread_3);//sysj/liquid_buffer.sysj line: 37, column: 6
                                S159=1;
                                if(!consumerChannel_o.isACK()){//sysj/liquid_buffer.sysj line: 37, column: 6
                                  consumerChannel_o.setREQ(false);//sysj/liquid_buffer.sysj line: 37, column: 6
                                  ends[3]=2;
                                  ;//sysj/liquid_buffer.sysj line: 37, column: 6
                                  S202=1;
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
                        S202=1;
                        S251=1;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                        break;
                      
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                S251=1;
                S251=0;
                if(bufferNotEmpty_1.getprestatus()){//sysj/liquid_buffer.sysj line: 28, column: 12
                  requestData_1.setPresent();//sysj/liquid_buffer.sysj line: 30, column: 5
                  currsigs.addElement(requestData_1);
                  S157=0;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S251=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S727=1;
            S728=0;
            active[3]=0;
            ends[3]=0;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread876(int [] tdone, int [] ends){
        switch(S156){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S155){
          case 0 : 
            switch(S29){
              case 0 : 
                switch(S27){
                  case 0 : 
                    switch(S11){
                      case 0 : 
                        if(!producerChannel_in.isPartnerPresent() || producerChannel_in.isPartnerPreempted()){//sysj/liquid_buffer.sysj line: 13, column: 5
                          producerChannel_in.setACK(false);//sysj/liquid_buffer.sysj line: 13, column: 5
                          S11=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          switch(S6){
                            case 0 : 
                              if(!producerChannel_in.isREQ()){//sysj/liquid_buffer.sysj line: 13, column: 5
                                producerChannel_in.setACK(true);//sysj/liquid_buffer.sysj line: 13, column: 5
                                S6=1;
                                if(producerChannel_in.isREQ()){//sysj/liquid_buffer.sysj line: 13, column: 5
                                  producerChannel_in.setACK(false);//sysj/liquid_buffer.sysj line: 13, column: 5
                                  ends[2]=2;
                                  ;//sysj/liquid_buffer.sysj line: 13, column: 5
                                  data_thread_2 = (ArrayList)(producerChannel_in.getVal() == null ? null : ((ArrayList)producerChannel_in.getVal()));//sysj/liquid_buffer.sysj line: 14, column: 5
                                  toBuffer_1.setPresent();//sysj/liquid_buffer.sysj line: 15, column: 5
                                  currsigs.addElement(toBuffer_1);
                                  toBuffer_1.setValue(data_thread_2);//sysj/liquid_buffer.sysj line: 15, column: 5
                                  S27=1;
                                  active[2]=1;
                                  ends[2]=1;
                                  tdone[2]=1;
                                }
                                else {
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
                            
                            case 1 : 
                              if(producerChannel_in.isREQ()){//sysj/liquid_buffer.sysj line: 13, column: 5
                                producerChannel_in.setACK(false);//sysj/liquid_buffer.sysj line: 13, column: 5
                                ends[2]=2;
                                ;//sysj/liquid_buffer.sysj line: 13, column: 5
                                data_thread_2 = (ArrayList)(producerChannel_in.getVal() == null ? null : ((ArrayList)producerChannel_in.getVal()));//sysj/liquid_buffer.sysj line: 14, column: 5
                                toBuffer_1.setPresent();//sysj/liquid_buffer.sysj line: 15, column: 5
                                currsigs.addElement(toBuffer_1);
                                toBuffer_1.setValue(data_thread_2);//sysj/liquid_buffer.sysj line: 15, column: 5
                                S27=1;
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
                            
                          }
                        }
                        break;
                      
                      case 1 : 
                        S11=1;
                        S11=0;
                        if(!producerChannel_in.isPartnerPresent() || producerChannel_in.isPartnerPreempted()){//sysj/liquid_buffer.sysj line: 13, column: 5
                          producerChannel_in.setACK(false);//sysj/liquid_buffer.sysj line: 13, column: 5
                          S11=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S6=0;
                          if(!producerChannel_in.isREQ()){//sysj/liquid_buffer.sysj line: 13, column: 5
                            producerChannel_in.setACK(true);//sysj/liquid_buffer.sysj line: 13, column: 5
                            S6=1;
                            if(producerChannel_in.isREQ()){//sysj/liquid_buffer.sysj line: 13, column: 5
                              producerChannel_in.setACK(false);//sysj/liquid_buffer.sysj line: 13, column: 5
                              ends[2]=2;
                              ;//sysj/liquid_buffer.sysj line: 13, column: 5
                              data_thread_2 = (ArrayList)(producerChannel_in.getVal() == null ? null : ((ArrayList)producerChannel_in.getVal()));//sysj/liquid_buffer.sysj line: 14, column: 5
                              toBuffer_1.setPresent();//sysj/liquid_buffer.sysj line: 15, column: 5
                              currsigs.addElement(toBuffer_1);
                              toBuffer_1.setValue(data_thread_2);//sysj/liquid_buffer.sysj line: 15, column: 5
                              S27=1;
                              active[2]=1;
                              ends[2]=1;
                              tdone[2]=1;
                            }
                            else {
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
                        }
                        break;
                      
                    }
                    break;
                  
                  case 1 : 
                    S27=1;
                    S29=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                }
                break;
              
              case 1 : 
                S29=1;
                S29=0;
                if(bufferNotFull_1.getprestatus()){//sysj/liquid_buffer.sysj line: 12, column: 12
                  S27=0;
                  S11=0;
                  if(!producerChannel_in.isPartnerPresent() || producerChannel_in.isPartnerPreempted()){//sysj/liquid_buffer.sysj line: 13, column: 5
                    producerChannel_in.setACK(false);//sysj/liquid_buffer.sysj line: 13, column: 5
                    S11=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S6=0;
                    if(!producerChannel_in.isREQ()){//sysj/liquid_buffer.sysj line: 13, column: 5
                      producerChannel_in.setACK(true);//sysj/liquid_buffer.sysj line: 13, column: 5
                      S6=1;
                      if(producerChannel_in.isREQ()){//sysj/liquid_buffer.sysj line: 13, column: 5
                        producerChannel_in.setACK(false);//sysj/liquid_buffer.sysj line: 13, column: 5
                        ends[2]=2;
                        ;//sysj/liquid_buffer.sysj line: 13, column: 5
                        data_thread_2 = (ArrayList)(producerChannel_in.getVal() == null ? null : ((ArrayList)producerChannel_in.getVal()));//sysj/liquid_buffer.sysj line: 14, column: 5
                        toBuffer_1.setPresent();//sysj/liquid_buffer.sysj line: 15, column: 5
                        currsigs.addElement(toBuffer_1);
                        toBuffer_1.setValue(data_thread_2);//sysj/liquid_buffer.sysj line: 15, column: 5
                        S27=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
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
                  }
                }
                else {
                  S29=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S155=1;
            S156=0;
            active[2]=0;
            ends[2]=0;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread874(int [] tdone, int [] ends){
        S868=1;
    myBuffer_thread_4 = new Buffer(100);//sysj/liquid_buffer.sysj line: 49, column: 3
    data_thread_4 = 0;//sysj/liquid_buffer.sysj line: 50, column: 3
    if(toBuffer_1.getprestatus()){//sysj/liquid_buffer.sysj line: 53, column: 12
      liquidData_thread_4 = (ArrayList)(toBuffer_1.getpreval() == null ? null : ((ArrayList)toBuffer_1.getpreval()));//sysj/liquid_buffer.sysj line: 54, column: 5
      myBuffer_thread_4.push(liquidData_thread_4.get(0));//sysj/liquid_buffer.sysj line: 55, column: 5
      myBuffer_thread_4.push(liquidData_thread_4.get(1));//sysj/liquid_buffer.sysj line: 56, column: 5
      myBuffer_thread_4.push(liquidData_thread_4.get(2));//sysj/liquid_buffer.sysj line: 57, column: 5
      myBuffer_thread_4.push(liquidData_thread_4.get(3));//sysj/liquid_buffer.sysj line: 58, column: 5
      if(requestData_1.getprestatus()){//sysj/liquid_buffer.sysj line: 61, column: 12
        data_thread_4 = ((Integer)myBuffer_thread_4.pop());//sysj/liquid_buffer.sysj line: 62, column: 5
        fromBuffer_1.setPresent();//sysj/liquid_buffer.sysj line: 63, column: 5
        currsigs.addElement(fromBuffer_1);
        fromBuffer_1.setValue(data_thread_4);//sysj/liquid_buffer.sysj line: 63, column: 5
        if(!myBuffer_thread_4.isFull()){//sysj/liquid_buffer.sysj line: 66, column: 7
          bufferNotFull_1.setPresent();//sysj/liquid_buffer.sysj line: 67, column: 5
          currsigs.addElement(bufferNotFull_1);
          if(!myBuffer_thread_4.isEmpty()){//sysj/liquid_buffer.sysj line: 69, column: 7
            bufferNotEmpty_1.setPresent();//sysj/liquid_buffer.sysj line: 70, column: 5
            currsigs.addElement(bufferNotEmpty_1);
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
          else {
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
        }
        else {
          if(!myBuffer_thread_4.isEmpty()){//sysj/liquid_buffer.sysj line: 69, column: 7
            bufferNotEmpty_1.setPresent();//sysj/liquid_buffer.sysj line: 70, column: 5
            currsigs.addElement(bufferNotEmpty_1);
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
          else {
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
        }
      }
      else {
        if(!myBuffer_thread_4.isFull()){//sysj/liquid_buffer.sysj line: 66, column: 7
          bufferNotFull_1.setPresent();//sysj/liquid_buffer.sysj line: 67, column: 5
          currsigs.addElement(bufferNotFull_1);
          if(!myBuffer_thread_4.isEmpty()){//sysj/liquid_buffer.sysj line: 69, column: 7
            bufferNotEmpty_1.setPresent();//sysj/liquid_buffer.sysj line: 70, column: 5
            currsigs.addElement(bufferNotEmpty_1);
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
          else {
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
        }
        else {
          if(!myBuffer_thread_4.isEmpty()){//sysj/liquid_buffer.sysj line: 69, column: 7
            bufferNotEmpty_1.setPresent();//sysj/liquid_buffer.sysj line: 70, column: 5
            currsigs.addElement(bufferNotEmpty_1);
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
          else {
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
        }
      }
    }
    else {
      if(requestData_1.getprestatus()){//sysj/liquid_buffer.sysj line: 61, column: 12
        data_thread_4 = ((Integer)myBuffer_thread_4.pop());//sysj/liquid_buffer.sysj line: 62, column: 5
        fromBuffer_1.setPresent();//sysj/liquid_buffer.sysj line: 63, column: 5
        currsigs.addElement(fromBuffer_1);
        fromBuffer_1.setValue(data_thread_4);//sysj/liquid_buffer.sysj line: 63, column: 5
        if(!myBuffer_thread_4.isFull()){//sysj/liquid_buffer.sysj line: 66, column: 7
          bufferNotFull_1.setPresent();//sysj/liquid_buffer.sysj line: 67, column: 5
          currsigs.addElement(bufferNotFull_1);
          if(!myBuffer_thread_4.isEmpty()){//sysj/liquid_buffer.sysj line: 69, column: 7
            bufferNotEmpty_1.setPresent();//sysj/liquid_buffer.sysj line: 70, column: 5
            currsigs.addElement(bufferNotEmpty_1);
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
          else {
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
        }
        else {
          if(!myBuffer_thread_4.isEmpty()){//sysj/liquid_buffer.sysj line: 69, column: 7
            bufferNotEmpty_1.setPresent();//sysj/liquid_buffer.sysj line: 70, column: 5
            currsigs.addElement(bufferNotEmpty_1);
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
          else {
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
        }
      }
      else {
        if(!myBuffer_thread_4.isFull()){//sysj/liquid_buffer.sysj line: 66, column: 7
          bufferNotFull_1.setPresent();//sysj/liquid_buffer.sysj line: 67, column: 5
          currsigs.addElement(bufferNotFull_1);
          if(!myBuffer_thread_4.isEmpty()){//sysj/liquid_buffer.sysj line: 69, column: 7
            bufferNotEmpty_1.setPresent();//sysj/liquid_buffer.sysj line: 70, column: 5
            currsigs.addElement(bufferNotEmpty_1);
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
          else {
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
        }
        else {
          if(!myBuffer_thread_4.isEmpty()){//sysj/liquid_buffer.sysj line: 69, column: 7
            bufferNotEmpty_1.setPresent();//sysj/liquid_buffer.sysj line: 70, column: 5
            currsigs.addElement(bufferNotEmpty_1);
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
          else {
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
        }
      }
    }
  }

  public void thread873(int [] tdone, int [] ends){
        S728=1;
    data_thread_3 = 0;//sysj/liquid_buffer.sysj line: 25, column: 3
    S727=0;
    S251=0;
    if(bufferNotEmpty_1.getprestatus()){//sysj/liquid_buffer.sysj line: 28, column: 12
      requestData_1.setPresent();//sysj/liquid_buffer.sysj line: 30, column: 5
      currsigs.addElement(requestData_1);
      S157=0;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S251=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread872(int [] tdone, int [] ends){
        S156=1;
        S155=0;
    S29=0;
    if(bufferNotFull_1.getprestatus()){//sysj/liquid_buffer.sysj line: 12, column: 12
      S27=0;
      S11=0;
      if(!producerChannel_in.isPartnerPresent() || producerChannel_in.isPartnerPreempted()){//sysj/liquid_buffer.sysj line: 13, column: 5
        producerChannel_in.setACK(false);//sysj/liquid_buffer.sysj line: 13, column: 5
        S11=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        S6=0;
        if(!producerChannel_in.isREQ()){//sysj/liquid_buffer.sysj line: 13, column: 5
          producerChannel_in.setACK(true);//sysj/liquid_buffer.sysj line: 13, column: 5
          S6=1;
          if(producerChannel_in.isREQ()){//sysj/liquid_buffer.sysj line: 13, column: 5
            producerChannel_in.setACK(false);//sysj/liquid_buffer.sysj line: 13, column: 5
            ends[2]=2;
            ;//sysj/liquid_buffer.sysj line: 13, column: 5
            data_thread_2 = (ArrayList)(producerChannel_in.getVal() == null ? null : ((ArrayList)producerChannel_in.getVal()));//sysj/liquid_buffer.sysj line: 14, column: 5
            toBuffer_1.setPresent();//sysj/liquid_buffer.sysj line: 15, column: 5
            currsigs.addElement(toBuffer_1);
            toBuffer_1.setValue(data_thread_2);//sysj/liquid_buffer.sysj line: 15, column: 5
            S27=1;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
          else {
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
      }
    }
    else {
      S29=1;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S870){
        case 0 : 
          S870=0;
          break RUN;
        
        case 1 : 
          S870=2;
          S870=2;
          bufferNotFull_1.setClear();//sysj/liquid_buffer.sysj line: 5, column: 2
          bufferNotEmpty_1.setClear();//sysj/liquid_buffer.sysj line: 5, column: 2
          requestData_1.setClear();//sysj/liquid_buffer.sysj line: 5, column: 2
          fromBuffer_1.setClear();//sysj/liquid_buffer.sysj line: 6, column: 2
          toBuffer_1.setClear();//sysj/liquid_buffer.sysj line: 7, column: 2
          thread872(tdone,ends);
          thread873(tdone,ends);
          thread874(tdone,ends);
          int biggest875 = 0;
          if(ends[2]>=biggest875){
            biggest875=ends[2];
          }
          if(ends[3]>=biggest875){
            biggest875=ends[3];
          }
          if(ends[4]>=biggest875){
            biggest875=ends[4];
          }
          if(biggest875 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bufferNotFull_1.setClear();//sysj/liquid_buffer.sysj line: 5, column: 2
          bufferNotEmpty_1.setClear();//sysj/liquid_buffer.sysj line: 5, column: 2
          requestData_1.setClear();//sysj/liquid_buffer.sysj line: 5, column: 2
          fromBuffer_1.setClear();//sysj/liquid_buffer.sysj line: 6, column: 2
          toBuffer_1.setClear();//sysj/liquid_buffer.sysj line: 7, column: 2
          thread876(tdone,ends);
          thread877(tdone,ends);
          thread878(tdone,ends);
          int biggest879 = 0;
          if(ends[2]>=biggest879){
            biggest879=ends[2];
          }
          if(ends[3]>=biggest879){
            biggest879=ends[3];
          }
          if(ends[4]>=biggest879){
            biggest879=ends[4];
          }
          if(biggest879 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest879 == 0){
            S870=0;
            active[1]=0;
            ends[1]=0;
            S870=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bufferNotFull_1 = new Signal();
    bufferNotEmpty_1 = new Signal();
    requestData_1 = new Signal();
    fromBuffer_1 = new Signal();
    toBuffer_1 = new Signal();
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
          producerChannel_in.gethook();
          consumerChannel_o.gethook();
          df = true;
        }
        runClockDomain();
      }
      bufferNotFull_1.setpreclear();
      bufferNotEmpty_1.setpreclear();
      requestData_1.setpreclear();
      fromBuffer_1.setpreclear();
      toBuffer_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      bufferNotFull_1.setClear();
      bufferNotEmpty_1.setClear();
      requestData_1.setClear();
      fromBuffer_1.setClear();
      toBuffer_1.setClear();
      producerChannel_in.sethook();
      consumerChannel_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        producerChannel_in.gethook();
        consumerChannel_o.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
