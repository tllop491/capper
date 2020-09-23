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
  private int S130678 = 1;
  private int S129917 = 1;
  private int S129916 = 1;
  private int S129790 = 1;
  private int S129788 = 1;
  private int S129772 = 1;
  private int S129767 = 1;
  private int S130489 = 1;
  private int S130488 = 1;
  private int S130012 = 1;
  private int S129918 = 1;
  private int S129919 = 1;
  private int S129926 = 1;
  private int S129921 = 1;
  private int S130629 = 1;
  private int S130676 = 1;
  private int S130631 = 1;
  private int S130638 = 1;
  private int S130633 = 1;
  
  private int[] ends = new int[6];
  private int[] tdone = new int[6];
  
  public void thread130688(int [] tdone, int [] ends){
        switch(S130676){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S130631){
          case 0 : 
            if(toBuffer_1.getprestatus()){//sysj\liquid_buffer.sysj line: 89, column: 9
              System.out.println("NEW ORDER");//sysj\liquid_buffer.sysj line: 90, column: 3
              S130631=1;
              S130638=0;
              if(!newOrder_o.isPartnerPresent() || newOrder_o.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 91, column: 3
                newOrder_o.setREQ(false);//sysj\liquid_buffer.sysj line: 91, column: 3
                S130638=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S130633=0;
                if(newOrder_o.isACK()){//sysj\liquid_buffer.sysj line: 91, column: 3
                  newOrder_o.setVal(Boolean.TRUE);//sysj\liquid_buffer.sysj line: 91, column: 3
                  S130633=1;
                  if(!newOrder_o.isACK()){//sysj\liquid_buffer.sysj line: 91, column: 3
                    newOrder_o.setREQ(false);//sysj\liquid_buffer.sysj line: 91, column: 3
                    ends[5]=2;
                    ;//sysj\liquid_buffer.sysj line: 91, column: 3
                    S130676=0;
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
            switch(S130638){
              case 0 : 
                if(!newOrder_o.isPartnerPresent() || newOrder_o.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 91, column: 3
                  newOrder_o.setREQ(false);//sysj\liquid_buffer.sysj line: 91, column: 3
                  S130638=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S130633){
                    case 0 : 
                      if(newOrder_o.isACK()){//sysj\liquid_buffer.sysj line: 91, column: 3
                        newOrder_o.setVal(Boolean.TRUE);//sysj\liquid_buffer.sysj line: 91, column: 3
                        S130633=1;
                        if(!newOrder_o.isACK()){//sysj\liquid_buffer.sysj line: 91, column: 3
                          newOrder_o.setREQ(false);//sysj\liquid_buffer.sysj line: 91, column: 3
                          ends[5]=2;
                          ;//sysj\liquid_buffer.sysj line: 91, column: 3
                          S130676=0;
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
                      if(!newOrder_o.isACK()){//sysj\liquid_buffer.sysj line: 91, column: 3
                        newOrder_o.setREQ(false);//sysj\liquid_buffer.sysj line: 91, column: 3
                        ends[5]=2;
                        ;//sysj\liquid_buffer.sysj line: 91, column: 3
                        S130676=0;
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
                S130638=1;
                S130638=0;
                if(!newOrder_o.isPartnerPresent() || newOrder_o.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 91, column: 3
                  newOrder_o.setREQ(false);//sysj\liquid_buffer.sysj line: 91, column: 3
                  S130638=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S130633=0;
                  if(newOrder_o.isACK()){//sysj\liquid_buffer.sysj line: 91, column: 3
                    newOrder_o.setVal(Boolean.TRUE);//sysj\liquid_buffer.sysj line: 91, column: 3
                    S130633=1;
                    if(!newOrder_o.isACK()){//sysj\liquid_buffer.sysj line: 91, column: 3
                      newOrder_o.setREQ(false);//sysj\liquid_buffer.sysj line: 91, column: 3
                      ends[5]=2;
                      ;//sysj\liquid_buffer.sysj line: 91, column: 3
                      S130676=0;
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

  public void thread130687(int [] tdone, int [] ends){
        switch(S130629){
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
          if(requestData_1.getprestatus()){//sysj\liquid_buffer.sysj line: 72, column: 12
            System.out.println("POPPING FROM BUFFER");//sysj\liquid_buffer.sysj line: 73, column: 5
            data_thread_4 = ((ArrayList)myBuffer_thread_4.pop());//sysj\liquid_buffer.sysj line: 74, column: 5
            fromBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 75, column: 5
            currsigs.addElement(fromBuffer_1);
            fromBuffer_1.setValue(data_thread_4);//sysj\liquid_buffer.sysj line: 75, column: 5
            if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 78, column: 7
              bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 79, column: 5
              currsigs.addElement(bufferNotFull_1);
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 81, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 82, column: 5
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
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 81, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 82, column: 5
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
            if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 78, column: 7
              bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 79, column: 5
              currsigs.addElement(bufferNotFull_1);
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 81, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 82, column: 5
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
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 81, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 82, column: 5
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
          if(requestData_1.getprestatus()){//sysj\liquid_buffer.sysj line: 72, column: 12
            System.out.println("POPPING FROM BUFFER");//sysj\liquid_buffer.sysj line: 73, column: 5
            data_thread_4 = ((ArrayList)myBuffer_thread_4.pop());//sysj\liquid_buffer.sysj line: 74, column: 5
            fromBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 75, column: 5
            currsigs.addElement(fromBuffer_1);
            fromBuffer_1.setValue(data_thread_4);//sysj\liquid_buffer.sysj line: 75, column: 5
            if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 78, column: 7
              bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 79, column: 5
              currsigs.addElement(bufferNotFull_1);
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 81, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 82, column: 5
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
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 81, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 82, column: 5
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
            if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 78, column: 7
              bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 79, column: 5
              currsigs.addElement(bufferNotFull_1);
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 81, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 82, column: 5
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
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 81, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 82, column: 5
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

  public void thread130686(int [] tdone, int [] ends){
        switch(S130489){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S130488){
          case 0 : 
            switch(S130012){
              case 0 : 
                switch(S129918){
                  case 0 : 
                    S129918=0;
                    S129918=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                    break;
                  
                  case 1 : 
                    S129918=1;
                    S129918=2;
                    if(fromBuffer_1.getprestatus()){//sysj\liquid_buffer.sysj line: 42, column: 13
                      System.out.println("BUFFER SENDING DATA");//sysj\liquid_buffer.sysj line: 43, column: 6
                      data_thread_3 = (fromBuffer_1.getpreval() == null ? null : ((ArrayList)fromBuffer_1.getpreval()));//sysj\liquid_buffer.sysj line: 44, column: 6
                      S129919=0;
                      S129926=0;
                      if(!consumerChannel_o.isPartnerPresent() || consumerChannel_o.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 45, column: 6
                        consumerChannel_o.setREQ(false);//sysj\liquid_buffer.sysj line: 45, column: 6
                        S129926=1;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S129921=0;
                        if(consumerChannel_o.isACK()){//sysj\liquid_buffer.sysj line: 45, column: 6
                          consumerChannel_o.setVal(data_thread_3);//sysj\liquid_buffer.sysj line: 45, column: 6
                          S129921=1;
                          if(!consumerChannel_o.isACK()){//sysj\liquid_buffer.sysj line: 45, column: 6
                            consumerChannel_o.setREQ(false);//sysj\liquid_buffer.sysj line: 45, column: 6
                            ends[3]=2;
                            ;//sysj\liquid_buffer.sysj line: 45, column: 6
                            S129919=1;
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
                      S130012=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    break;
                  
                  case 2 : 
                    switch(S129919){
                      case 0 : 
                        switch(S129926){
                          case 0 : 
                            if(!consumerChannel_o.isPartnerPresent() || consumerChannel_o.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 45, column: 6
                              consumerChannel_o.setREQ(false);//sysj\liquid_buffer.sysj line: 45, column: 6
                              S129926=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              switch(S129921){
                                case 0 : 
                                  if(consumerChannel_o.isACK()){//sysj\liquid_buffer.sysj line: 45, column: 6
                                    consumerChannel_o.setVal(data_thread_3);//sysj\liquid_buffer.sysj line: 45, column: 6
                                    S129921=1;
                                    if(!consumerChannel_o.isACK()){//sysj\liquid_buffer.sysj line: 45, column: 6
                                      consumerChannel_o.setREQ(false);//sysj\liquid_buffer.sysj line: 45, column: 6
                                      ends[3]=2;
                                      ;//sysj\liquid_buffer.sysj line: 45, column: 6
                                      S129919=1;
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
                                    S129919=1;
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
                            S129926=1;
                            S129926=0;
                            if(!consumerChannel_o.isPartnerPresent() || consumerChannel_o.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 45, column: 6
                              consumerChannel_o.setREQ(false);//sysj\liquid_buffer.sysj line: 45, column: 6
                              S129926=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S129921=0;
                              if(consumerChannel_o.isACK()){//sysj\liquid_buffer.sysj line: 45, column: 6
                                consumerChannel_o.setVal(data_thread_3);//sysj\liquid_buffer.sysj line: 45, column: 6
                                S129921=1;
                                if(!consumerChannel_o.isACK()){//sysj\liquid_buffer.sysj line: 45, column: 6
                                  consumerChannel_o.setREQ(false);//sysj\liquid_buffer.sysj line: 45, column: 6
                                  ends[3]=2;
                                  ;//sysj\liquid_buffer.sysj line: 45, column: 6
                                  S129919=1;
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
                        S129919=1;
                        S130012=1;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                        break;
                      
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                S130012=1;
                S130012=0;
                if(bufferNotEmpty_1.getprestatus()){//sysj\liquid_buffer.sysj line: 35, column: 12
                  requestData_1.setPresent();//sysj\liquid_buffer.sysj line: 37, column: 5
                  currsigs.addElement(requestData_1);
                  S129918=0;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S130012=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S130488=1;
            S130489=0;
            active[3]=0;
            ends[3]=0;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread130685(int [] tdone, int [] ends){
        switch(S129917){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S129916){
          case 0 : 
            switch(S129790){
              case 0 : 
                switch(S129788){
                  case 0 : 
                    switch(S129772){
                      case 0 : 
                        if(!producerChannel_in.isPartnerPresent() || producerChannel_in.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 18, column: 5
                          producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
                          S129772=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          switch(S129767){
                            case 0 : 
                              if(!producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
                                producerChannel_in.setACK(true);//sysj\liquid_buffer.sysj line: 18, column: 5
                                S129767=1;
                                if(producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
                                  producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
                                  ends[2]=2;
                                  ;//sysj\liquid_buffer.sysj line: 18, column: 5
                                  System.out.println("BUFFER RECEIVING DATA");//sysj\liquid_buffer.sysj line: 19, column: 5
                                  data_thread_2 = (ArrayList)(producerChannel_in.getVal() == null ? null : ((ArrayList)producerChannel_in.getVal()));//sysj\liquid_buffer.sysj line: 20, column: 5
                                  toBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 22, column: 5
                                  currsigs.addElement(toBuffer_1);
                                  toBuffer_1.setValue(data_thread_2);//sysj\liquid_buffer.sysj line: 22, column: 5
                                  S129788=1;
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
                                S129788=1;
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
                        S129772=1;
                        S129772=0;
                        if(!producerChannel_in.isPartnerPresent() || producerChannel_in.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 18, column: 5
                          producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
                          S129772=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S129767=0;
                          if(!producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
                            producerChannel_in.setACK(true);//sysj\liquid_buffer.sysj line: 18, column: 5
                            S129767=1;
                            if(producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
                              producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
                              ends[2]=2;
                              ;//sysj\liquid_buffer.sysj line: 18, column: 5
                              System.out.println("BUFFER RECEIVING DATA");//sysj\liquid_buffer.sysj line: 19, column: 5
                              data_thread_2 = (ArrayList)(producerChannel_in.getVal() == null ? null : ((ArrayList)producerChannel_in.getVal()));//sysj\liquid_buffer.sysj line: 20, column: 5
                              toBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 22, column: 5
                              currsigs.addElement(toBuffer_1);
                              toBuffer_1.setValue(data_thread_2);//sysj\liquid_buffer.sysj line: 22, column: 5
                              S129788=1;
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
                    S129788=1;
                    S129790=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                }
                break;
              
              case 1 : 
                S129790=1;
                S129790=0;
                if(bufferNotFull_1.getprestatus()){//sysj\liquid_buffer.sysj line: 17, column: 12
                  S129788=0;
                  S129772=0;
                  if(!producerChannel_in.isPartnerPresent() || producerChannel_in.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 18, column: 5
                    producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
                    S129772=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S129767=0;
                    if(!producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
                      producerChannel_in.setACK(true);//sysj\liquid_buffer.sysj line: 18, column: 5
                      S129767=1;
                      if(producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
                        producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
                        ends[2]=2;
                        ;//sysj\liquid_buffer.sysj line: 18, column: 5
                        System.out.println("BUFFER RECEIVING DATA");//sysj\liquid_buffer.sysj line: 19, column: 5
                        data_thread_2 = (ArrayList)(producerChannel_in.getVal() == null ? null : ((ArrayList)producerChannel_in.getVal()));//sysj\liquid_buffer.sysj line: 20, column: 5
                        toBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 22, column: 5
                        currsigs.addElement(toBuffer_1);
                        toBuffer_1.setValue(data_thread_2);//sysj\liquid_buffer.sysj line: 22, column: 5
                        S129788=1;
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
                  S129790=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S129916=1;
            S129917=0;
            active[2]=0;
            ends[2]=0;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread130683(int [] tdone, int [] ends){
        S130676=1;
    S130631=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread130682(int [] tdone, int [] ends){
        S130629=1;
    myBuffer_thread_4 = new Buffer(100);//sysj\liquid_buffer.sysj line: 57, column: 3
    data_thread_4 = new ArrayList();//sysj\liquid_buffer.sysj line: 58, column: 3
    if(toBuffer_1.getprestatus()){//sysj\liquid_buffer.sysj line: 61, column: 12
      System.out.println("PUSHING TO BUFFER");//sysj\liquid_buffer.sysj line: 62, column: 5
      liquidData_thread_4 = (ArrayList)(toBuffer_1.getpreval() == null ? null : ((ArrayList)toBuffer_1.getpreval()));//sysj\liquid_buffer.sysj line: 63, column: 5
      myBuffer_thread_4.push(liquidData_thread_4);//sysj\liquid_buffer.sysj line: 64, column: 5
      if(requestData_1.getprestatus()){//sysj\liquid_buffer.sysj line: 72, column: 12
        System.out.println("POPPING FROM BUFFER");//sysj\liquid_buffer.sysj line: 73, column: 5
        data_thread_4 = ((ArrayList)myBuffer_thread_4.pop());//sysj\liquid_buffer.sysj line: 74, column: 5
        fromBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 75, column: 5
        currsigs.addElement(fromBuffer_1);
        fromBuffer_1.setValue(data_thread_4);//sysj\liquid_buffer.sysj line: 75, column: 5
        if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 78, column: 7
          bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 79, column: 5
          currsigs.addElement(bufferNotFull_1);
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 81, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 82, column: 5
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
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 81, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 82, column: 5
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
        if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 78, column: 7
          bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 79, column: 5
          currsigs.addElement(bufferNotFull_1);
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 81, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 82, column: 5
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
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 81, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 82, column: 5
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
      if(requestData_1.getprestatus()){//sysj\liquid_buffer.sysj line: 72, column: 12
        System.out.println("POPPING FROM BUFFER");//sysj\liquid_buffer.sysj line: 73, column: 5
        data_thread_4 = ((ArrayList)myBuffer_thread_4.pop());//sysj\liquid_buffer.sysj line: 74, column: 5
        fromBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 75, column: 5
        currsigs.addElement(fromBuffer_1);
        fromBuffer_1.setValue(data_thread_4);//sysj\liquid_buffer.sysj line: 75, column: 5
        if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 78, column: 7
          bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 79, column: 5
          currsigs.addElement(bufferNotFull_1);
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 81, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 82, column: 5
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
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 81, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 82, column: 5
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
        if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 78, column: 7
          bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 79, column: 5
          currsigs.addElement(bufferNotFull_1);
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 81, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 82, column: 5
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
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 81, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 82, column: 5
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

  public void thread130681(int [] tdone, int [] ends){
        S130489=1;
    data_thread_3 = new ArrayList();//sysj\liquid_buffer.sysj line: 32, column: 3
    S130488=0;
    S130012=0;
    if(bufferNotEmpty_1.getprestatus()){//sysj\liquid_buffer.sysj line: 35, column: 12
      requestData_1.setPresent();//sysj\liquid_buffer.sysj line: 37, column: 5
      currsigs.addElement(requestData_1);
      S129918=0;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S130012=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread130680(int [] tdone, int [] ends){
        S129917=1;
        S129916=0;
    S129790=0;
    if(bufferNotFull_1.getprestatus()){//sysj\liquid_buffer.sysj line: 17, column: 12
      S129788=0;
      S129772=0;
      if(!producerChannel_in.isPartnerPresent() || producerChannel_in.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 18, column: 5
        producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
        S129772=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        S129767=0;
        if(!producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
          producerChannel_in.setACK(true);//sysj\liquid_buffer.sysj line: 18, column: 5
          S129767=1;
          if(producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
            producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
            ends[2]=2;
            ;//sysj\liquid_buffer.sysj line: 18, column: 5
            System.out.println("BUFFER RECEIVING DATA");//sysj\liquid_buffer.sysj line: 19, column: 5
            data_thread_2 = (ArrayList)(producerChannel_in.getVal() == null ? null : ((ArrayList)producerChannel_in.getVal()));//sysj\liquid_buffer.sysj line: 20, column: 5
            toBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 22, column: 5
            currsigs.addElement(toBuffer_1);
            toBuffer_1.setValue(data_thread_2);//sysj\liquid_buffer.sysj line: 22, column: 5
            S129788=1;
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
      S129790=1;
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
      switch(S130678){
        case 0 : 
          S130678=0;
          break RUN;
        
        case 1 : 
          S130678=2;
          S130678=2;
          bufferNotFull_1.setClear();//sysj\liquid_buffer.sysj line: 10, column: 2
          bufferNotEmpty_1.setClear();//sysj\liquid_buffer.sysj line: 10, column: 2
          requestData_1.setClear();//sysj\liquid_buffer.sysj line: 10, column: 2
          fromBuffer_1.setClear();//sysj\liquid_buffer.sysj line: 11, column: 2
          toBuffer_1.setClear();//sysj\liquid_buffer.sysj line: 12, column: 2
          thread130680(tdone,ends);
          thread130681(tdone,ends);
          thread130682(tdone,ends);
          thread130683(tdone,ends);
          int biggest130684 = 0;
          if(ends[2]>=biggest130684){
            biggest130684=ends[2];
          }
          if(ends[3]>=biggest130684){
            biggest130684=ends[3];
          }
          if(ends[4]>=biggest130684){
            biggest130684=ends[4];
          }
          if(ends[5]>=biggest130684){
            biggest130684=ends[5];
          }
          if(biggest130684 == 1){
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
          thread130685(tdone,ends);
          thread130686(tdone,ends);
          thread130687(tdone,ends);
          thread130688(tdone,ends);
          int biggest130689 = 0;
          if(ends[2]>=biggest130689){
            biggest130689=ends[2];
          }
          if(ends[3]>=biggest130689){
            biggest130689=ends[3];
          }
          if(ends[4]>=biggest130689){
            biggest130689=ends[4];
          }
          if(ends[5]>=biggest130689){
            biggest130689=ends[5];
          }
          if(biggest130689 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest130689 == 0){
            S130678=0;
            active[1]=0;
            ends[1]=0;
            S130678=0;
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
