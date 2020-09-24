CS704 Group Project by Timothy Lopez & Nikolay Petin

How to run:
1) Run -> Run Configurations -> BuildSystemJ (This will build the systemJ program)
2) Run -> Run Configurations -> RunSystemJ	(This will launch the program along with the POS GUI)
3) Launch STATUS.java for diagnostic info (This will launch the diagnostic GUI)

The system currently is only tested to work with one bottle at a time. For some reason, the rotary table shifts while in the middle of filling. This bug could not be fixed in time, we suspect it has something to do with the ch_to_sig reaction not updating the signals in time for the rotary table to see, although we also tested it with the checkReady reaction from the SystemJ guide and it still didn't work.