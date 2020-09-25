CS704 Group Project by Timothy Lopez & Nikolay Petin

How to run:
1) Run -> Run Configurations -> BuildSystemJ (This will build the systemJ program)
2) Right click CS704_GP -> refresh
3) Run -> Run Configurations -> RunSystemJ	(This will launch the program along with the POS GUI)
4) Run -> Run Configurations -> RunSTATUS (This will launch the diagnostic GUI)

If the system is running to fast/slow, adjust the "arg" argument of the scheduler in the _main.xml file. Be aware that the length of emission for new orders would need to be adjusted in POS_GUI (line 167) so that the POS clock domain can pick up the signal.

Bugs:
Currently, multiple orders cannot be made at once. We suspect this is because the "s.emit" function never goes down while emitting multiple orders.

LeftBottleAtPos5 is never emitted, we are not sure why this is happening as rotary controller should not rotate if there there a bottle at pos 5. This leads us to suspect that the rotary table is somehow not seeing this signal in time.

The conveyor is always on because we were initially testing for non-pipelined scenario.

The lidloader seems to activate twice, could be to do with some undefined bottleAtPos3 behaviour.