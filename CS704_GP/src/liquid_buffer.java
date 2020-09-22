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
  private int data_thread_3;//sysj\liquid_buffer.sysj line: 30, column: 3
  private Buffer myBuffer_thread_4;//sysj\liquid_buffer.sysj line: 54, column: 3
  private int data_thread_4;//sysj\liquid_buffer.sysj line: 55, column: 3
  private ArrayList liquidData_thread_4;//sysj\liquid_buffer.sysj line: 59, column: 5
  private int S130324 = 1;
  private int S129563 = 1;
  private int S129562 = 1;
  private int S129436 = 1;
  private int S129434 = 1;
  private int S129418 = 1;
  private int S129413 = 1;
  private int S130135 = 1;
  private int S130134 = 1;
  private int S129658 = 1;
  private int S129564 = 1;
  private int S129609 = 1;
  private int S129571 = 1;
  private int S129566 = 1;
  private int S130275 = 1;
  private int S130322 = 1;
  private int S130321 = 1;
  private int S130283 = 1;
  private int S130278 = 1;
  
  private int[] ends = new int[6];
  private int[] tdone = new int[6];
  
  public void thread130334(int [] tdone, int [] ends){
        switch(S130322){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S130321){
          case 0 : 
            if(toBuffer_1.getprestatus()){//sysj\liquid_buffer.sysj line: 83, column: 9
              S130321=1;
              S130283=0;
              if(!newOrder_o.isPartnerPresent() || newOrder_o.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 84, column: 3
                newOrder_o.setREQ(false);//sysj\liquid_buffer.sysj line: 84, column: 3
                S130283=1;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S130278=0;
                if(newOrder_o.isACK()){//sysj\liquid_buffer.sysj line: 84, column: 3
                  newOrder_o.setVal(Boolean.TRUE);//sysj\liquid_buffer.sysj line: 84, column: 3
                  S130278=1;
                  if(!newOrder_o.isACK()){//sysj\liquid_buffer.sysj line: 84, column: 3
                    newOrder_o.setREQ(false);//sysj\liquid_buffer.sysj line: 84, column: 3
                    ends[5]=2;
                    ;//sysj\liquid_buffer.sysj line: 84, column: 3
                    S130322=0;
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
            switch(S130283){
              case 0 : 
                if(!newOrder_o.isPartnerPresent() || newOrder_o.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 84, column: 3
                  newOrder_o.setREQ(false);//sysj\liquid_buffer.sysj line: 84, column: 3
                  S130283=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  switch(S130278){
                    case 0 : 
                      if(newOrder_o.isACK()){//sysj\liquid_buffer.sysj line: 84, column: 3
                        newOrder_o.setVal(Boolean.TRUE);//sysj\liquid_buffer.sysj line: 84, column: 3
                        S130278=1;
                        if(!newOrder_o.isACK()){//sysj\liquid_buffer.sysj line: 84, column: 3
                          newOrder_o.setREQ(false);//sysj\liquid_buffer.sysj line: 84, column: 3
                          ends[5]=2;
                          ;//sysj\liquid_buffer.sysj line: 84, column: 3
                          S130322=0;
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
                      if(!newOrder_o.isACK()){//sysj\liquid_buffer.sysj line: 84, column: 3
                        newOrder_o.setREQ(false);//sysj\liquid_buffer.sysj line: 84, column: 3
                        ends[5]=2;
                        ;//sysj\liquid_buffer.sysj line: 84, column: 3
                        S130322=0;
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
                S130283=1;
                S130283=0;
                if(!newOrder_o.isPartnerPresent() || newOrder_o.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 84, column: 3
                  newOrder_o.setREQ(false);//sysj\liquid_buffer.sysj line: 84, column: 3
                  S130283=1;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S130278=0;
                  if(newOrder_o.isACK()){//sysj\liquid_buffer.sysj line: 84, column: 3
                    newOrder_o.setVal(Boolean.TRUE);//sysj\liquid_buffer.sysj line: 84, column: 3
                    S130278=1;
                    if(!newOrder_o.isACK()){//sysj\liquid_buffer.sysj line: 84, column: 3
                      newOrder_o.setREQ(false);//sysj\liquid_buffer.sysj line: 84, column: 3
                      ends[5]=2;
                      ;//sysj\liquid_buffer.sysj line: 84, column: 3
                      S130322=0;
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

  public void thread130333(int [] tdone, int [] ends){
        switch(S130275){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(toBuffer_1.getprestatus()){//sysj\liquid_buffer.sysj line: 58, column: 12
          liquidData_thread_4 = (ArrayList)(toBuffer_1.getpreval() == null ? null : ((ArrayList)toBuffer_1.getpreval()));//sysj\liquid_buffer.sysj line: 59, column: 5
          myBuffer_thread_4.push(liquidData_thread_4);//sysj\liquid_buffer.sysj line: 60, column: 5
          if(requestData_1.getprestatus()){//sysj\liquid_buffer.sysj line: 67, column: 12
            data_thread_4 = ((Integer)myBuffer_thread_4.pop());//sysj\liquid_buffer.sysj line: 68, column: 5
            fromBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 69, column: 5
            currsigs.addElement(fromBuffer_1);
            fromBuffer_1.setValue(data_thread_4);//sysj\liquid_buffer.sysj line: 69, column: 5
            System.out.println("Emitted fromBuffer_1");
            if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 72, column: 7
              bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 73, column: 5
              currsigs.addElement(bufferNotFull_1);
              System.out.println("Emitted bufferNotFull_1");
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 75, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 76, column: 5
                currsigs.addElement(bufferNotEmpty_1);
                System.out.println("Emitted bufferNotEmpty_1");
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
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 75, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 76, column: 5
                currsigs.addElement(bufferNotEmpty_1);
                System.out.println("Emitted bufferNotEmpty_1");
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
            if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 72, column: 7
              bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 73, column: 5
              currsigs.addElement(bufferNotFull_1);
              System.out.println("Emitted bufferNotFull_1");
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 75, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 76, column: 5
                currsigs.addElement(bufferNotEmpty_1);
                System.out.println("Emitted bufferNotEmpty_1");
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
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 75, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 76, column: 5
                currsigs.addElement(bufferNotEmpty_1);
                System.out.println("Emitted bufferNotEmpty_1");
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
            data_thread_4 = ((Integer)myBuffer_thread_4.pop());//sysj\liquid_buffer.sysj line: 68, column: 5
            fromBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 69, column: 5
            currsigs.addElement(fromBuffer_1);
            fromBuffer_1.setValue(data_thread_4);//sysj\liquid_buffer.sysj line: 69, column: 5
            System.out.println("Emitted fromBuffer_1");
            if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 72, column: 7
              bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 73, column: 5
              currsigs.addElement(bufferNotFull_1);
              System.out.println("Emitted bufferNotFull_1");
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 75, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 76, column: 5
                currsigs.addElement(bufferNotEmpty_1);
                System.out.println("Emitted bufferNotEmpty_1");
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
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 75, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 76, column: 5
                currsigs.addElement(bufferNotEmpty_1);
                System.out.println("Emitted bufferNotEmpty_1");
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
            if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 72, column: 7
              bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 73, column: 5
              currsigs.addElement(bufferNotFull_1);
              System.out.println("Emitted bufferNotFull_1");
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 75, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 76, column: 5
                currsigs.addElement(bufferNotEmpty_1);
                System.out.println("Emitted bufferNotEmpty_1");
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
              if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 75, column: 7
                bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 76, column: 5
                currsigs.addElement(bufferNotEmpty_1);
                System.out.println("Emitted bufferNotEmpty_1");
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

  public void thread130332(int [] tdone, int [] ends){
        switch(S130135){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S130134){
          case 0 : 
            switch(S129658){
              case 0 : 
                switch(S129564){
                  case 0 : 
                    S129564=0;
                    S129564=1;
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                    break;
                  
                  case 1 : 
                    S129564=1;
                    S129564=2;
                    if(fromBuffer_1.getprestatus()){//sysj\liquid_buffer.sysj line: 40, column: 13
                      data_thread_3 = (fromBuffer_1.getpreval() == null ? null : ((Integer)fromBuffer_1.getpreval()));//sysj\liquid_buffer.sysj line: 41, column: 6
                      S129609=0;
                      S129571=0;
                      if(!consumerChannel_o.isPartnerPresent() || consumerChannel_o.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 42, column: 6
                        consumerChannel_o.setREQ(false);//sysj\liquid_buffer.sysj line: 42, column: 6
                        S129571=1;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        S129566=0;
                        if(consumerChannel_o.isACK()){//sysj\liquid_buffer.sysj line: 42, column: 6
                          consumerChannel_o.setVal(data_thread_3);//sysj\liquid_buffer.sysj line: 42, column: 6
                          S129566=1;
                          if(!consumerChannel_o.isACK()){//sysj\liquid_buffer.sysj line: 42, column: 6
                            consumerChannel_o.setREQ(false);//sysj\liquid_buffer.sysj line: 42, column: 6
                            ends[3]=2;
                            ;//sysj\liquid_buffer.sysj line: 42, column: 6
                            S129609=1;
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
                      S129658=1;
                      active[3]=1;
                      ends[3]=1;
                      tdone[3]=1;
                    }
                    break;
                  
                  case 2 : 
                    switch(S129609){
                      case 0 : 
                        switch(S129571){
                          case 0 : 
                            if(!consumerChannel_o.isPartnerPresent() || consumerChannel_o.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 42, column: 6
                              consumerChannel_o.setREQ(false);//sysj\liquid_buffer.sysj line: 42, column: 6
                              S129571=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              switch(S129566){
                                case 0 : 
                                  if(consumerChannel_o.isACK()){//sysj\liquid_buffer.sysj line: 42, column: 6
                                    consumerChannel_o.setVal(data_thread_3);//sysj\liquid_buffer.sysj line: 42, column: 6
                                    S129566=1;
                                    if(!consumerChannel_o.isACK()){//sysj\liquid_buffer.sysj line: 42, column: 6
                                      consumerChannel_o.setREQ(false);//sysj\liquid_buffer.sysj line: 42, column: 6
                                      ends[3]=2;
                                      ;//sysj\liquid_buffer.sysj line: 42, column: 6
                                      S129609=1;
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
                                  if(!consumerChannel_o.isACK()){//sysj\liquid_buffer.sysj line: 42, column: 6
                                    consumerChannel_o.setREQ(false);//sysj\liquid_buffer.sysj line: 42, column: 6
                                    ends[3]=2;
                                    ;//sysj\liquid_buffer.sysj line: 42, column: 6
                                    S129609=1;
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
                            S129571=1;
                            S129571=0;
                            if(!consumerChannel_o.isPartnerPresent() || consumerChannel_o.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 42, column: 6
                              consumerChannel_o.setREQ(false);//sysj\liquid_buffer.sysj line: 42, column: 6
                              S129571=1;
                              active[3]=1;
                              ends[3]=1;
                              tdone[3]=1;
                            }
                            else {
                              S129566=0;
                              if(consumerChannel_o.isACK()){//sysj\liquid_buffer.sysj line: 42, column: 6
                                consumerChannel_o.setVal(data_thread_3);//sysj\liquid_buffer.sysj line: 42, column: 6
                                S129566=1;
                                if(!consumerChannel_o.isACK()){//sysj\liquid_buffer.sysj line: 42, column: 6
                                  consumerChannel_o.setREQ(false);//sysj\liquid_buffer.sysj line: 42, column: 6
                                  ends[3]=2;
                                  ;//sysj\liquid_buffer.sysj line: 42, column: 6
                                  S129609=1;
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
                        S129609=1;
                        S129658=1;
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                        break;
                      
                    }
                    break;
                  
                }
                break;
              
              case 1 : 
                S129658=1;
                S129658=0;
                if(bufferNotEmpty_1.getprestatus()){//sysj\liquid_buffer.sysj line: 33, column: 12
                  requestData_1.setPresent();//sysj\liquid_buffer.sysj line: 35, column: 5
                  currsigs.addElement(requestData_1);
                  System.out.println("Emitted requestData_1");
                  S129564=0;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S129658=1;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S130134=1;
            S130135=0;
            active[3]=0;
            ends[3]=0;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread130331(int [] tdone, int [] ends){
        switch(S129563){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S129562){
          case 0 : 
            switch(S129436){
              case 0 : 
                switch(S129434){
                  case 0 : 
                    switch(S129418){
                      case 0 : 
                        if(!producerChannel_in.isPartnerPresent() || producerChannel_in.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 18, column: 5
                          producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
                          S129418=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          switch(S129413){
                            case 0 : 
                              if(!producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
                                producerChannel_in.setACK(true);//sysj\liquid_buffer.sysj line: 18, column: 5
                                S129413=1;
                                if(producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
                                  producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
                                  ends[2]=2;
                                  ;//sysj\liquid_buffer.sysj line: 18, column: 5
                                  data_thread_2 = (ArrayList)(producerChannel_in.getVal() == null ? null : ((ArrayList)producerChannel_in.getVal()));//sysj\liquid_buffer.sysj line: 19, column: 5
                                  toBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 20, column: 5
                                  currsigs.addElement(toBuffer_1);
                                  toBuffer_1.setValue(data_thread_2);//sysj\liquid_buffer.sysj line: 20, column: 5
                                  System.out.println("Emitted toBuffer_1");
                                  S129434=1;
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
                                data_thread_2 = (ArrayList)(producerChannel_in.getVal() == null ? null : ((ArrayList)producerChannel_in.getVal()));//sysj\liquid_buffer.sysj line: 19, column: 5
                                toBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 20, column: 5
                                currsigs.addElement(toBuffer_1);
                                toBuffer_1.setValue(data_thread_2);//sysj\liquid_buffer.sysj line: 20, column: 5
                                System.out.println("Emitted toBuffer_1");
                                S129434=1;
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
                        S129418=1;
                        S129418=0;
                        if(!producerChannel_in.isPartnerPresent() || producerChannel_in.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 18, column: 5
                          producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
                          S129418=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S129413=0;
                          if(!producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
                            producerChannel_in.setACK(true);//sysj\liquid_buffer.sysj line: 18, column: 5
                            S129413=1;
                            if(producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
                              producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
                              ends[2]=2;
                              ;//sysj\liquid_buffer.sysj line: 18, column: 5
                              data_thread_2 = (ArrayList)(producerChannel_in.getVal() == null ? null : ((ArrayList)producerChannel_in.getVal()));//sysj\liquid_buffer.sysj line: 19, column: 5
                              toBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 20, column: 5
                              currsigs.addElement(toBuffer_1);
                              toBuffer_1.setValue(data_thread_2);//sysj\liquid_buffer.sysj line: 20, column: 5
                              System.out.println("Emitted toBuffer_1");
                              S129434=1;
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
                    S129434=1;
                    S129436=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                    break;
                  
                }
                break;
              
              case 1 : 
                S129436=1;
                S129436=0;
                if(bufferNotFull_1.getprestatus()){//sysj\liquid_buffer.sysj line: 17, column: 12
                  S129434=0;
                  S129418=0;
                  if(!producerChannel_in.isPartnerPresent() || producerChannel_in.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 18, column: 5
                    producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
                    S129418=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S129413=0;
                    if(!producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
                      producerChannel_in.setACK(true);//sysj\liquid_buffer.sysj line: 18, column: 5
                      S129413=1;
                      if(producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
                        producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
                        ends[2]=2;
                        ;//sysj\liquid_buffer.sysj line: 18, column: 5
                        data_thread_2 = (ArrayList)(producerChannel_in.getVal() == null ? null : ((ArrayList)producerChannel_in.getVal()));//sysj\liquid_buffer.sysj line: 19, column: 5
                        toBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 20, column: 5
                        currsigs.addElement(toBuffer_1);
                        toBuffer_1.setValue(data_thread_2);//sysj\liquid_buffer.sysj line: 20, column: 5
                        System.out.println("Emitted toBuffer_1");
                        S129434=1;
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
                  S129436=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
            }
            break;
          
          case 1 : 
            S129562=1;
            S129563=0;
            active[2]=0;
            ends[2]=0;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread130329(int [] tdone, int [] ends){
        S130322=1;
    S130321=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread130328(int [] tdone, int [] ends){
        S130275=1;
    myBuffer_thread_4 = new Buffer(100);//sysj\liquid_buffer.sysj line: 54, column: 3
    data_thread_4 = 0;//sysj\liquid_buffer.sysj line: 55, column: 3
    if(toBuffer_1.getprestatus()){//sysj\liquid_buffer.sysj line: 58, column: 12
      liquidData_thread_4 = (ArrayList)(toBuffer_1.getpreval() == null ? null : ((ArrayList)toBuffer_1.getpreval()));//sysj\liquid_buffer.sysj line: 59, column: 5
      myBuffer_thread_4.push(liquidData_thread_4);//sysj\liquid_buffer.sysj line: 60, column: 5
      if(requestData_1.getprestatus()){//sysj\liquid_buffer.sysj line: 67, column: 12
        data_thread_4 = ((Integer)myBuffer_thread_4.pop());//sysj\liquid_buffer.sysj line: 68, column: 5
        fromBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 69, column: 5
        currsigs.addElement(fromBuffer_1);
        fromBuffer_1.setValue(data_thread_4);//sysj\liquid_buffer.sysj line: 69, column: 5
        System.out.println("Emitted fromBuffer_1");
        if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 72, column: 7
          bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 73, column: 5
          currsigs.addElement(bufferNotFull_1);
          System.out.println("Emitted bufferNotFull_1");
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 75, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 76, column: 5
            currsigs.addElement(bufferNotEmpty_1);
            System.out.println("Emitted bufferNotEmpty_1");
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
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 75, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 76, column: 5
            currsigs.addElement(bufferNotEmpty_1);
            System.out.println("Emitted bufferNotEmpty_1");
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
        if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 72, column: 7
          bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 73, column: 5
          currsigs.addElement(bufferNotFull_1);
          System.out.println("Emitted bufferNotFull_1");
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 75, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 76, column: 5
            currsigs.addElement(bufferNotEmpty_1);
            System.out.println("Emitted bufferNotEmpty_1");
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
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 75, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 76, column: 5
            currsigs.addElement(bufferNotEmpty_1);
            System.out.println("Emitted bufferNotEmpty_1");
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
        data_thread_4 = ((Integer)myBuffer_thread_4.pop());//sysj\liquid_buffer.sysj line: 68, column: 5
        fromBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 69, column: 5
        currsigs.addElement(fromBuffer_1);
        fromBuffer_1.setValue(data_thread_4);//sysj\liquid_buffer.sysj line: 69, column: 5
        System.out.println("Emitted fromBuffer_1");
        if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 72, column: 7
          bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 73, column: 5
          currsigs.addElement(bufferNotFull_1);
          System.out.println("Emitted bufferNotFull_1");
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 75, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 76, column: 5
            currsigs.addElement(bufferNotEmpty_1);
            System.out.println("Emitted bufferNotEmpty_1");
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
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 75, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 76, column: 5
            currsigs.addElement(bufferNotEmpty_1);
            System.out.println("Emitted bufferNotEmpty_1");
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
        if(!myBuffer_thread_4.isFull()){//sysj\liquid_buffer.sysj line: 72, column: 7
          bufferNotFull_1.setPresent();//sysj\liquid_buffer.sysj line: 73, column: 5
          currsigs.addElement(bufferNotFull_1);
          System.out.println("Emitted bufferNotFull_1");
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 75, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 76, column: 5
            currsigs.addElement(bufferNotEmpty_1);
            System.out.println("Emitted bufferNotEmpty_1");
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
          if(!myBuffer_thread_4.isEmpty()){//sysj\liquid_buffer.sysj line: 75, column: 7
            bufferNotEmpty_1.setPresent();//sysj\liquid_buffer.sysj line: 76, column: 5
            currsigs.addElement(bufferNotEmpty_1);
            System.out.println("Emitted bufferNotEmpty_1");
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

  public void thread130327(int [] tdone, int [] ends){
        S130135=1;
    data_thread_3 = 0;//sysj\liquid_buffer.sysj line: 30, column: 3
    S130134=0;
    S129658=0;
    if(bufferNotEmpty_1.getprestatus()){//sysj\liquid_buffer.sysj line: 33, column: 12
      requestData_1.setPresent();//sysj\liquid_buffer.sysj line: 35, column: 5
      currsigs.addElement(requestData_1);
      System.out.println("Emitted requestData_1");
      S129564=0;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
    else {
      S129658=1;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }

  public void thread130326(int [] tdone, int [] ends){
        S129563=1;
        S129562=0;
    S129436=0;
    if(bufferNotFull_1.getprestatus()){//sysj\liquid_buffer.sysj line: 17, column: 12
      S129434=0;
      S129418=0;
      if(!producerChannel_in.isPartnerPresent() || producerChannel_in.isPartnerPreempted()){//sysj\liquid_buffer.sysj line: 18, column: 5
        producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
        S129418=1;
        active[2]=1;
        ends[2]=1;
        tdone[2]=1;
      }
      else {
        S129413=0;
        if(!producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
          producerChannel_in.setACK(true);//sysj\liquid_buffer.sysj line: 18, column: 5
          S129413=1;
          if(producerChannel_in.isREQ()){//sysj\liquid_buffer.sysj line: 18, column: 5
            producerChannel_in.setACK(false);//sysj\liquid_buffer.sysj line: 18, column: 5
            ends[2]=2;
            ;//sysj\liquid_buffer.sysj line: 18, column: 5
            data_thread_2 = (ArrayList)(producerChannel_in.getVal() == null ? null : ((ArrayList)producerChannel_in.getVal()));//sysj\liquid_buffer.sysj line: 19, column: 5
            toBuffer_1.setPresent();//sysj\liquid_buffer.sysj line: 20, column: 5
            currsigs.addElement(toBuffer_1);
            toBuffer_1.setValue(data_thread_2);//sysj\liquid_buffer.sysj line: 20, column: 5
            System.out.println("Emitted toBuffer_1");
            S129434=1;
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
      S129436=1;
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
      switch(S130324){
        case 0 : 
          S130324=0;
          break RUN;
        
        case 1 : 
          S130324=2;
          S130324=2;
          bufferNotFull_1.setClear();//sysj\liquid_buffer.sysj line: 10, column: 2
          bufferNotEmpty_1.setClear();//sysj\liquid_buffer.sysj line: 10, column: 2
          requestData_1.setClear();//sysj\liquid_buffer.sysj line: 10, column: 2
          fromBuffer_1.setClear();//sysj\liquid_buffer.sysj line: 11, column: 2
          toBuffer_1.setClear();//sysj\liquid_buffer.sysj line: 12, column: 2
          thread130326(tdone,ends);
          thread130327(tdone,ends);
          thread130328(tdone,ends);
          thread130329(tdone,ends);
          int biggest130330 = 0;
          if(ends[2]>=biggest130330){
            biggest130330=ends[2];
          }
          if(ends[3]>=biggest130330){
            biggest130330=ends[3];
          }
          if(ends[4]>=biggest130330){
            biggest130330=ends[4];
          }
          if(ends[5]>=biggest130330){
            biggest130330=ends[5];
          }
          if(biggest130330 == 1){
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
          thread130331(tdone,ends);
          thread130332(tdone,ends);
          thread130333(tdone,ends);
          thread130334(tdone,ends);
          int biggest130335 = 0;
          if(ends[2]>=biggest130335){
            biggest130335=ends[2];
          }
          if(ends[3]>=biggest130335){
            biggest130335=ends[3];
          }
          if(ends[4]>=biggest130335){
            biggest130335=ends[4];
          }
          if(ends[5]>=biggest130335){
            biggest130335=ends[5];
          }
          if(biggest130335 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest130335 == 0){
            S130324=0;
            active[1]=0;
            ends[1]=0;
            S130324=0;
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
