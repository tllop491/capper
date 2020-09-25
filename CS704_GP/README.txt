CS704 Group Project by Timothy Lopez & Nikolay Petin

How to run:
1) Run -> Run Configurations -> BuildSystemJ (This will build the systemJ program)
2) Run -> Run Configurations -> RunSystemJ	(This will launch the program along with the POS GUI)
3) Run -> Run Configurations -> RunSTATUS (This will launch the diagnostic GUI)

If the system is running to fast/slow, adjust the "arg" argument of the scheduler in the _main.xml file. Be aware that the length of emission for the order would need to be adjusted in POS_GUI (line 167) so that the POS clock domain can pick up the signal.