import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;
import buffer.*;//sysj\liquid_buffer.sysj line: 1, column: 1

public class liquid_buffer extends ClockDomain{
  public liquid_buffer(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public input_Channel producerChannel_in = new input_Channel();
  public output_Channel consumerChannel_o = new output_Channel();
  public output_Channel newOrder_o = new output_Channel();
  private Signal bufferNotFull_1;
  private Signal bufferNotEmpty_1;
  private Signal requestData_1;
  private Signal fromBuffer_1;
  private Signal toBuffer_1;
  private ArrayList data_thread_2;//sysj\liquid_buffer.sysj line: 14, column: 3
  private ArrayList data_thread_3;//sysj\liquid_buffer.sysj line: 32, column: 3
  private Buffer myBuffer_thread_4;//sysj\liquid_buffer.sysj line: 57, column: 3
  private ArrayList data_thread_4;//sysj\liquid_buffer.sysj line: 58, column: 3
  private ArrayList liquidData_thread_4;//sysj\liquid_buffer.sysj line: 63, column: 5
  private int S160733 = 1;
  private int S159972 = 1;
  private int S159971 = 1;
  private int S159845 = 1;
  private int S159843 = 1;
  private int S159827 = 1;
  private int S159822 = 1;
  private int S160544 = 1;
  private int S160543 = 1;
  private int S160067 = 1;
  private int S159973 = 1;
  private int S159974 = 1;
  private int S159981 = 1;
  private int S159976 = 1;
  private int S160684 = 1;
  private int S160731 = 1;
  private int S160686 = 1;
  private int S160693 = 1;
  private int S160688 = 1;
  
  private int[] ends = new int[6];
  private int[] tdone = new int[6];
  
  public void thread160743(int [] tdone, int [] ends){
        switch(S160731){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S160686){
          case 0 : 
            if(toBuffer_1.getprestatus()){//sysj\liquid_buffer.sysj line: 84, column: 9
              System.out.println("NEW ORDER");//sysj\liquid_buffer.sysj line: 85, column: 3
              S160686=1;
              S160693=0;
              if(!newOrder_o.isPartnerPresent() || newOrder_o.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 86, column: 3
                newOrder_o.setREQ(false);//sysj\liquid_buffer.sysj line: 86, column: 3
                S160693=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S160688=0;
                if(newOrder_o.isACK()){//sysj\liquid_buffer.sysj line: 86, column: 3
                  newOrder_o.setVal(Boolean.TRUE);//sysj\liquid_buffer.sysj line: 86, column: 3
                  S160688=1;
                  if(!newOrder_o.isACK()){//sysj\liquid_buffer.sysj line: 86, column: 3
                    newOrder_o.setREQ(false);//sysj\liquid_buffer.sysj line: 86, column: 3
                    ends[5]=2;
                    ;//sysj\liquid_buffer.sysj line: 86, column: 3
                    S160731=0;
                    active[5]=0;
                    ends[5]=0;
                    tdone[5]=1;
                  }
                  else {
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                }
                else {
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            switch(S160693){
              case 0 : 
                if(!newOrder_o.isPartnerPresent() || newOrder_o.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 86, column: 3
                  newOrder_o.setREQ(false);//sysj\liquid_buffer.sysj line: 86, column: 3
                  S160693=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S160688){
                    case 0 : 
                      if(newOrder_o.isACK()){//sysj\liquid_buffer.sysj line: 86, column: 3
                        newOrder_o.setVal(Boolean.TRUE);//sysj\liquid_buffer.sysj line: 86, column: 3
                        S160688=1;
                        if(!newOrder_o.isACK()){//sysj\liquid_buffer.sysj line: 86, column: 3
                          newOrder_o.setREQ(false);//sysj\liquid_buffer.sysj line: 86, column: 3
                          ends[5]=2;
                          ;//sysj\liquid_buffer.sysj line: 86, column: 3
                          S160731=0;
                          active[5]=0;
                          ends[5]=0;
                          tdone[5]=1;
                        }
                        else {
                          active[5]=1;
                          ends[5]=1;
                          tdone[5]=1;
                        }
                      }
                      else {
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!newOrder_o.isACK()){//sysj\liquid_buffer.sysj line: 86, column: 3
                        newOrder_o.setREQ(false);//sysj\liquid_buffer.sysj line: 86, column: 3
                        ends[5]=2;
                        ;//sysj\liquid_buffer.sysj line: 86, column: 3
                        S160731=0;
                        active[5]=0;
                        ends[5]=0;
                        tdone[5]=1;
                      }
                      else {
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S160693=1;
                S160693=0;
                if(!newOrder_o.isPartnerPresent() || newOrder_o.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 86, column: 3
                  newOrder_o.setREQ(false);//sysj\liquid_buffer.sysj line: 86, column: 3
                  S160693=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S160688=0;
                  if(newOrder_o.isACK()){//sysj\liquid_buffer.sysj line: 86, column: 3
                    newOrder_o.setVal(Boolean.TRUE);//sysj\liquid_buffer.sysj line: 86, column: 3
                    S160688=1;
                    if(!newOrder_o.isACK()){//sysj\liquid_buffer.sysj line: 86, column: 3
                      newOrder_o.setREQ(false);//sysj\liquid_buffer.sysj line: 86, column: 3
                      ends[5]=2;
                      ;//sysj\liquid_buffer.sysj line: 86, column: 3
                      S160731=0;
                      active[5]=0;
                      ends[5]=0;
                      tdone[5]=1;
                    }
                    else {
                      active[5]=1;
                      ends[5]=1;
                      tdone[5]=1;
                    }
                  }
                  else {
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread160742(int [] tdone, int [] ends){
        switch(S160684){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(toBuffer_1.getprestatus()){//sysj\liquid_buffer.sysj line: 61, column: 12
          System.out.println("PUSHING TO BUFFER");//sysj\liquid_buffer.sysj line: 62, column: 5
          liquidData_thread_4 = (ArrayList)(toBuffer_1.getpreval() == null ? null : ((ArrayList)toBuffer_1.getpreval()));//sysj\liquid_buffer.sysj line: 63, column: 5
          myBuffer_thread_4.push(liquidData_thread_4);//sysj\liquid_buffer.sysj line: 64, column: 5
          if(requestData_1.getprestatus()){//sysj\liquid_buffer.sysj line: 67, column: 12
            System.out.println("POPPING FROM BUFFER");//sysj\liquid_buffer.sysj line: 68, column: 5
            data_thread_4 = ((ArrayList)myBuffer_thread_4.pop());//sysj\liquid_buffer.sysj line: 69, column: 5
            fromBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 70, column: 5
            currsigs.addElement(fromBuffer_1);
            fromBuffer_1.setValue(data_thread_4);//sysj\liquid_buffer.sysj line: 70, column: 5
            if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 73, column: 7
              bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 74, column: 5
              currsigs.addElement(bufferNotFull_1);
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 76, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 77, column: 5
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
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 76, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 77, column: 5
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
            if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 73, column: 7
              bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 74, column: 5
              currsigs.addElement(bufferNotFull_1);
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 76, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 77, column: 5
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
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 76, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 77, column: 5
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
          if(requestData_1.getprestatus()){//sysj\liquid_buffer.sysj line: 67, column: 12
            System.out.println("POPPING FROM BUFFER");//sysj\liquid_buffer.sysj line: 68, column: 5
            data_thread_4 = ((ArrayList)myBuffer_thread_4.pop());//sysj\liquid_buffer.sysj line: 69, column: 5
            fromBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 70, column: 5
            currsigs.addElement(fromBuffer_1);
            fromBuffer_1.setValue(data_thread_4);//sysj\liquid_buffer.sysj line: 70, column: 5
            if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 73, column: 7
              bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 74, column: 5
              currsigs.addElement(bufferNotFull_1);
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 76, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 77, column: 5
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
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 76, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 77, column: 5
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
            if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 73, column: 7
              bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 74, column: 5
              currsigs.addElement(bufferNotFull_1);
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 76, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 77, column: 5
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
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 76, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 77, column: 5
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

  public void thread160741(int [] tdone, int [] ends){
        switch(S160544){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S160543){
          case 0 : 
            switch(S160067){
              case 0 : 
                switch(S159973){
                  case 0 : 
                    S159973=0;
                    S159973=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                    break;
                  
                  case 1 : 
                    S159973=1;
                    S159973=2;
                    if(fromBuffer_1.getprestatus()){//sysj\liquid_buffer.sysj line: 42, column: 13
                      System.out.println("BUFFER SENDING DATA");//sysj\liquid_buffer.sysj line: 43, column: 6
                      data_thread_3 = (fromBuffer_1.getpreval() == null ? null : ((ArrayList)fromBuffer_1.getpreval()));//sysj\liquid_buffer.sysj line: 44, column: 6
                      S159974=0;
                      S159981=0;
                      if(!consumerChannel_o.isPartnerPresent() || consumerChannel_o.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 45, column: 6
                        consumerChannel_o.setREQ(false);//sysj\liquid_buffer.sysj line: 45, column: 6
                        S159981=1;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S159976=0;
                        if(consumerChannel_o.isACK()){//sysj\liquid_buffer.sysj line: 45, column: 6
                          consumerChannel_o.setVal(data_thread_3);//sysj\liquid_buffer.sysj line: 45, column: 6
                          S159976=1;
                          if(!consumerChannel_o.isACK()){//sysj\liquid_buffer.sysj line: 45, column: 6
                            consumerChannel_o.setREQ(false);//sysj\liquid_buffer.sysj line: 45, column: 6
                            ends[3]=2;
                            ;//sysj\liquid_buffer.sysj line: 45, column: 6
                            S159974=1;
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
                      S160067=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    break;
                  
                  case 2 : 
                    switch(S159974){
                      case 0 : 
                        switch(S159981){
                          case 0 : 
                            if(!consumerChannel_o.isPartnerPresent() || consumerChannel_o.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 45, column: 6
                              consumerChannel_o.setREQ(false);//sysj\liquid_buffer.sysj line: 45, column: 6
                              S159981=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              switch(S159976){
                                case 0 : 
                                  if(consumerChannel_o.isACK()){//sysj\liquid_buffer.sysj line: 45, column: 6
                                    consumerChannel_o.setVal(data_thread_3);//sysj\liquid_buffer.sysj line: 45, column: 6
                                    S159976=1;
                                    if(!consumerChannel_o.isACK()){//sysj\liquid_buffer.sysj line: 45, column: 6
                                      consumerChannel_o.setREQ(false);//sysj\liquid_buffer.sysj line: 45, column: 6
                                      ends[3]=2;
                                      ;//sysj\liquid_buffer.sysj line: 45, column: 6
                                      S159974=1;
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
                                  if(!consumerChannel_o.isACK()){//sysj\liquid_buffer.sysj line: 45, column: 6
                                    consumerChannel_o.setREQ(false);//sysj\liquid_buffer.sysj line: 45, column: 6
                                    ends[3]=2;
                                    ;//sysj\liquid_buffer.sysj line: 45, column: 6
                                    S159974=1;
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
                            S159981=1;
                            S159981=0;
                            if(!consumerChannel_o.isPartnerPresent() || consumerChannel_o.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 45, column: 6
                              consumerChannel_o.setREQ(false);//sysj\liquid_buffer.sysj line: 45, column: 6
                              S159981=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S159976=0;
                              if(consumerChannel_o.isACK()){//sysj\liquid_buffer.sysj line: 45, column: 6
                                consumerChannel_o.setVal(data_thread_3);//sysj\liquid_buffer.sysj line: 45, column: 6
                                S159976=1;
                                if(!consumerChannel_o.isACK()){//sysj\liquid_buffer.sysj line: 45, column: 6
                                  consumerChannel_o.setREQ(false);//sysj\liquid_buffer.sysj line: 45, column: 6
                                  ends[3]=2;
                                  ;//sysj\liquid_buffer.sysj line: 45, column: 6
                                  S159974=1;
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
                        S159974=1;
                        S160067=1;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                        break;
                      
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                S160067=1;
                S160067=0;
                if(bufferNotEmpty_1.getprestatus()){//sysj\liquid_buffer.sysj line: 35, column: 12
                  requestData_1.setPresent();//sysj\liquid_buffer.sysj line: 37, column: 5
                  currsigs.addElement(requestData_1);
                  S159973=0;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S160067=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S160543=1;
            S160544=0;
            active[3]=0;
            ends[3]=0;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread160740(int [] tdone, int [] ends){
        switch(S159972){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S159971){
          case 0 : 
            switch(S159845){
              case 0 : 
                switch(S159843){
                  case 0 : 
                    switch(S159827){
                      case 0 : 
                        if(!producerChannel_in.isPartnerPresent() || producerChannel_in.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 18, column: 5
                          producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
                          S159827=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          switch(S159822){
                            case 0 : 
                              if(!producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
                                producerChannel_in.setACK(true);//sysj\liquid_buffer.sysj line: 18, column: 5
                                S159822=1;
                                if(producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
                                  producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
                                  ends[2]=2;
                                  ;//sysj\liquid_buffer.sysj line: 18, column: 5
                                  System.out.println("BUFFER RECEIVING DATA");//sysj\liquid_buffer.sysj line: 19, column: 5
                                  data_thread_2 = (ArrayList)(producerChannel_in.getVal() == null ? null : ((ArrayList)producerChannel_in.getVal()));//sysj\liquid_buffer.sysj line: 20, column: 5
                                  toBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 22, column: 5
                                  currsigs.addElement(toBuffer_1);
                                  toBuffer_1.setValue(data_thread_2);//sysj\liquid_buffer.sysj line: 22, column: 5
                                  S159843=1;
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
                              if(producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
                                producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
                                ends[2]=2;
                                ;//sysj\liquid_buffer.sysj line: 18, column: 5
                                System.out.println("BUFFER RECEIVING DATA");//sysj\liquid_buffer.sysj line: 19, column: 5
                                data_thread_2 = (ArrayList)(producerChannel_in.getVal() == null ? null : ((ArrayList)producerChannel_in.getVal()));//sysj\liquid_buffer.sysj line: 20, column: 5
                                toBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 22, column: 5
                                currsigs.addElement(toBuffer_1);
                                toBuffer_1.setValue(data_thread_2);//sysj\liquid_buffer.sysj line: 22, column: 5
                                S159843=1;
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
                        S159827=1;
                        S159827=0;
                        if(!producerChannel_in.isPartnerPresent() || producerChannel_in.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 18, column: 5
                          producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
                          S159827=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S159822=0;
                          if(!producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
                            producerChannel_in.setACK(true);//sysj\liquid_buffer.sysj line: 18, column: 5
                            S159822=1;
                            if(producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
                              producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
                              ends[2]=2;
                              ;//sysj\liquid_buffer.sysj line: 18, column: 5
                              System.out.println("BUFFER RECEIVING DATA");//sysj\liquid_buffer.sysj line: 19, column: 5
                              data_thread_2 = (ArrayList)(producerChannel_in.getVal() == null ? null : ((ArrayList)producerChannel_in.getVal()));//sysj\liquid_buffer.sysj line: 20, column: 5
                              toBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 22, column: 5
                              currsigs.addElement(toBuffer_1);
                              toBuffer_1.setValue(data_thread_2);//sysj\liquid_buffer.sysj line: 22, column: 5
                              S159843=1;
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
                    S159843=1;
                    S159845=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                }
                break;
              
              case 1 : 
                S159845=1;
                S159845=0;
                if(bufferNotFull_1.getprestatus()){//sysj\liquid_buffer.sysj line: 17, column: 12
                  S159843=0;
                  S159827=0;
                  if(!producerChannel_in.isPartnerPresent() || producerChannel_in.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 18, column: 5
                    producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
                    S159827=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S159822=0;
                    if(!producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
                      producerChannel_in.setACK(true);//sysj\liquid_buffer.sysj line: 18, column: 5
                      S159822=1;
                      if(producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
                        producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
                        ends[2]=2;
                        ;//sysj\liquid_buffer.sysj line: 18, column: 5
                        System.out.println("BUFFER RECEIVING DATA");//sysj\liquid_buffer.sysj line: 19, column: 5
                        data_thread_2 = (ArrayList)(producerChannel_in.getVal() == null ? null : ((ArrayList)producerChannel_in.getVal()));//sysj\liquid_buffer.sysj line: 20, column: 5
                        toBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 22, column: 5
                        currsigs.addElement(toBuffer_1);
                        toBuffer_1.setValue(data_thread_2);//sysj\liquid_buffer.sysj line: 22, column: 5
                        S159843=1;
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
                  S159845=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S159971=1;
            S159972=0;
            active[2]=0;
            ends[2]=0;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread160738(int [] tdone, int [] ends){
        S160731=1;
    S160686=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread160737(int [] tdone, int [] ends){
        S160684=1;
    myBuffer_thread_4 = new Buffer(100);//sysj\liquid_buffer.sysj line: 57, column: 3
    data_thread_4 = new ArrayList();//sysj\liquid_buffer.sysj line: 58, column: 3
    if(toBuffer_1.getprestatus()){//sysj\liquid_buffer.sysj line: 61, column: 12
      System.out.println("PUSHING TO BUFFER");//sysj\liquid_buffer.sysj line: 62, column: 5
      liquidData_thread_4 = (ArrayList)(toBuffer_1.getpreval() == null ? null : ((ArrayList)toBuffer_1.getpreval()));//sysj\liquid_buffer.sysj line: 63, column: 5
      myBuffer_thread_4.push(liquidData_thread_4);//sysj\liquid_buffer.sysj line: 64, column: 5
      if(requestData_1.getprestatus()){//sysj\liquid_buffer.sysj line: 67, column: 12
        System.out.println("POPPING FROM BUFFER");//sysj\liquid_buffer.sysj line: 68, column: 5
        data_thread_4 = ((ArrayList)myBuffer_thread_4.pop());//sysj\liquid_buffer.sysj line: 69, column: 5
        fromBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 70, column: 5
        currsigs.addElement(fromBuffer_1);
        fromBuffer_1.setValue(data_thread_4);//sysj\liquid_buffer.sysj line: 70, column: 5
        if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 73, column: 7
          bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 74, column: 5
          currsigs.addElement(bufferNotFull_1);
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 76, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 77, column: 5
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
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 76, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 77, column: 5
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
        if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 73, column: 7
          bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 74, column: 5
          currsigs.addElement(bufferNotFull_1);
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 76, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 77, column: 5
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
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 76, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 77, column: 5
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
      if(requestData_1.getprestatus()){//sysj\liquid_buffer.sysj line: 67, column: 12
        System.out.println("POPPING FROM BUFFER");//sysj\liquid_buffer.sysj line: 68, column: 5
        data_thread_4 = ((ArrayList)myBuffer_thread_4.pop());//sysj\liquid_buffer.sysj line: 69, column: 5
        fromBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 70, column: 5
        currsigs.addElement(fromBuffer_1);
        fromBuffer_1.setValue(data_thread_4);//sysj\liquid_buffer.sysj line: 70, column: 5
        if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 73, column: 7
          bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 74, column: 5
          currsigs.addElement(bufferNotFull_1);
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 76, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 77, column: 5
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
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 76, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 77, column: 5
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
        if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 73, column: 7
          bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 74, column: 5
          currsigs.addElement(bufferNotFull_1);
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 76, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 77, column: 5
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
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 76, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 77, column: 5
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

  public void thread160736(int [] tdone, int [] ends){
        S160544=1;
    data_thread_3 = new ArrayList();//sysj\liquid_buffer.sysj line: 32, column: 3
    S160543=0;
    S160067=0;
    if(bufferNotEmpty_1.getprestatus()){//sysj\liquid_buffer.sysj line: 35, column: 12
      requestData_1.setPresent();//sysj\liquid_buffer.sysj line: 37, column: 5
      currsigs.addElement(requestData_1);
      S159973=0;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S160067=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread160735(int [] tdone, int [] ends){
        S159972=1;
        S159971=0;
    S159845=0;
    if(bufferNotFull_1.getprestatus()){//sysj\liquid_buffer.sysj line: 17, column: 12
      S159843=0;
      S159827=0;
      if(!producerChannel_in.isPartnerPresent() || producerChannel_in.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 18, column: 5
        producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
        S159827=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        S159822=0;
        if(!producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
          producerChannel_in.setACK(true);//sysj\liquid_buffer.sysj line: 18, column: 5
          S159822=1;
          if(producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
            producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
            ends[2]=2;
            ;//sysj\liquid_buffer.sysj line: 18, column: 5
            System.out.println("BUFFER RECEIVING DATA");//sysj\liquid_buffer.sysj line: 19, column: 5
            data_thread_2 = (ArrayList)(producerChannel_in.getVal() == null ? null : ((ArrayList)producerChannel_in.getVal()));//sysj\liquid_buffer.sysj line: 20, column: 5
            toBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 22, column: 5
            currsigs.addElement(toBuffer_1);
            toBuffer_1.setValue(data_thread_2);//sysj\liquid_buffer.sysj line: 22, column: 5
            S159843=1;
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
      S159845=1;
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
      switch(S160733){
        case 0 : 
          S160733=0;
          break RUN;
        
        case 1 : 
          S160733=2;
          S160733=2;
          bufferNotFull_1.setClear();//sysj\liquid_buffer.sysj line: 10, column: 2
          bufferNotEmpty_1.setClear();//sysj\liquid_buffer.sysj line: 10, column: 2
          requestData_1.setClear();//sysj\liquid_buffer.sysj line: 10, column: 2
          fromBuffer_1.setClear();//sysj\liquid_buffer.sysj line: 11, column: 2
          toBuffer_1.setClear();//sysj\liquid_buffer.sysj line: 12, column: 2
          thread160735(tdone,ends);
          thread160736(tdone,ends);
          thread160737(tdone,ends);
          thread160738(tdone,ends);
          int biggest160739 = 0;
          if(ends[2]>=biggest160739){
            biggest160739=ends[2];
          }
          if(ends[3]>=biggest160739){
            biggest160739=ends[3];
          }
          if(ends[4]>=biggest160739){
            biggest160739=ends[4];
          }
          if(ends[5]>=biggest160739){
            biggest160739=ends[5];
          }
          if(biggest160739 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          bufferNotFull_1.setClear();//sysj\liquid_buffer.sysj line: 10, column: 2
          bufferNotEmpty_1.setClear();//sysj\liquid_buffer.sysj line: 10, column: 2
          requestData_1.setClear();//sysj\liquid_buffer.sysj line: 10, column: 2
          fromBuffer_1.setClear();//sysj\liquid_buffer.sysj line: 11, column: 2
          toBuffer_1.setClear();//sysj\liquid_buffer.sysj line: 12, column: 2
          thread160740(tdone,ends);
          thread160741(tdone,ends);
          thread160742(tdone,ends);
          thread160743(tdone,ends);
          int biggest160744 = 0;
          if(ends[2]>=biggest160744){
            biggest160744=ends[2];
          }
          if(ends[3]>=biggest160744){
            biggest160744=ends[3];
          }
          if(ends[4]>=biggest160744){
            biggest160744=ends[4];
          }
          if(ends[5]>=biggest160744){
            biggest160744=ends[5];
          }
          if(biggest160744 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest160744 == 0){
            S160733=0;
            active[1]=0;
            ends[1]=0;
            S160733=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0};
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
          newOrder_o.gethook();
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
      newOrder_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        producerChannel_in.gethook();
        consumerChannel_o.gethook();
        newOrder_o.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
