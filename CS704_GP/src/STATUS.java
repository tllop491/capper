import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextPane;

import com.systemj.netapi.SimpleServer;

import java.awt.Font;
import java.io.IOException;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class STATUS {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					STATUS window = new STATUS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void setStatus(JLabel dot, boolean status) {
		//System.out.println("SETTING");
		if(status) {
			dot.setForeground(Color.GREEN); 
		} else {
			dot.setForeground(Color.RED); 
		}
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public STATUS() throws IOException {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 227, 570);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[122.00,grow][][left][left][left][left][][]", "[][][][][center][][][][][][][][][][][][][][][][][][][][][]"));
		
		//Headers 
		JLabel header = new JLabel("Plant Status");
		header.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		frame.getContentPane().add(header, "cell 0 0");
		
		
		//CONVEYOR 
		
		JLabel subheader1 = new JLabel("CONVEYOR");
		subheader1.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		frame.getContentPane().add(subheader1, "cell 0 1");
			
		//Motor conveyor on / off
		JLabel conveyorMotorLabel = new JLabel("motConveyorOnOff");
		conveyorMotorLabel.setForeground(Color.GRAY);
		conveyorMotorLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		frame.getContentPane().add(conveyorMotorLabel, "cell 0 2");
		
		JLabel indConveyorMotor = new JLabel("\u2022");
		indConveyorMotor.setFont(new Font("Tahoma", Font.BOLD, 13));
		indConveyorMotor.setForeground(Color.RED);
		frame.getContentPane().add(indConveyorMotor, "cell 1 2,alignx center,aligny center");
		
			
		//ROTARY
		
		JLabel subheader2 = new JLabel("ROTARY");
		subheader2.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		frame.getContentPane().add(subheader2, "cell 0 3");
		
		//Table Sensor
		JLabel tableSensor = new JLabel("tableAlignedWithSensor");
		tableSensor.setForeground(Color.GRAY);
		tableSensor.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		frame.getContentPane().add(tableSensor, "cell 0 4,aligny baseline");
		
		JLabel indTableAlignedWithSensor = new JLabel("\u2022");
		indTableAlignedWithSensor.setForeground(Color.RED);
		indTableAlignedWithSensor.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indTableAlignedWithSensor, "cell 1 4,alignx center,aligny center");
		
		JLabel bottleAtPos_2_1 = new JLabel("X =");
		bottleAtPos_2_1.setForeground(Color.GRAY);
		bottleAtPos_2_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		frame.getContentPane().add(bottleAtPos_2_1, "cell 0 5,alignx right");
		
		JLabel lblNewLabel = new JLabel("1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel, "cell 1 5,alignx center,aligny center");
		
		JLabel lblNewLabel_1 = new JLabel("2");
		frame.getContentPane().add(lblNewLabel_1, "cell 2 5");
		
		JLabel lblNewLabel_2 = new JLabel("3");
		frame.getContentPane().add(lblNewLabel_2, "cell 3 5");
		
		JLabel lblNewLabel_3 = new JLabel("4");
		frame.getContentPane().add(lblNewLabel_3, "cell 4 5");
		
		JLabel lblNewLabel_4 = new JLabel("5");
		frame.getContentPane().add(lblNewLabel_4, "cell 5 5");
		
		JLabel bottleAtPos = new JLabel("bottleAtPosX");
		bottleAtPos.setForeground(Color.GRAY);
		bottleAtPos.setFont(new Font("Dialog", Font.PLAIN, 10));
		frame.getContentPane().add(bottleAtPos, "cell 0 6");
		
		JLabel indBottleAtPos1 = new JLabel("\u2022");
		indBottleAtPos1.setForeground(Color.RED);
		indBottleAtPos1.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indBottleAtPos1, "cell 1 6,alignx center,aligny center");
		
		//lblNewLabel_6.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		
		JLabel indBottleAtPos2 = new JLabel("\u2022");
		indBottleAtPos2.setForeground(Color.RED);
		indBottleAtPos2.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indBottleAtPos2, "cell 2 6");
		
		JLabel indBottleAtPos3 = new JLabel("\u2022");
		indBottleAtPos3.setForeground(Color.RED);
		indBottleAtPos3.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indBottleAtPos3, "cell 3 6");
		
		JLabel indBottleAtPos4 = new JLabel("\u2022");
		indBottleAtPos4.setForeground(Color.RED);
		indBottleAtPos4.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indBottleAtPos4, "cell 4 6");
		
		JLabel indBottleAtPos5 = new JLabel("\u2022");
		indBottleAtPos5.setForeground(Color.RED);
		indBottleAtPos5.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indBottleAtPos5, "cell 5 6");
		
		JLabel arrow = new JLabel("\u2192");
		arrow.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(arrow, "cell 6 6");
		
		JLabel indBottleLeftPos5 = new JLabel("\u2022");
		indBottleLeftPos5.setForeground(Color.RED);
		indBottleLeftPos5.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indBottleLeftPos5, "cell 7 6");

		JLabel LIQUID_HEADER = new JLabel("LIQUID FILLER");
		LIQUID_HEADER.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		frame.getContentPane().add(LIQUID_HEADER, "cell 0 7");
		
		JLabel bottleAtPos_2 = new JLabel("X =");
		bottleAtPos_2.setForeground(Color.GRAY);
		bottleAtPos_2.setFont(new Font("Dialog", Font.PLAIN, 10));
		frame.getContentPane().add(bottleAtPos_2, "cell 0 8,alignx right");
		
		JLabel lblNewLabel_6 = new JLabel("0");
		frame.getContentPane().add(lblNewLabel_6, "cell 1 8");
		
		JLabel lblNewLabel_7 = new JLabel("1");
		frame.getContentPane().add(lblNewLabel_7, "cell 2 8");
		
		JLabel lblNewLabel_8 = new JLabel("2");
		frame.getContentPane().add(lblNewLabel_8, "cell 3 8");
		
		JLabel lblNewLabel_9 = new JLabel("3");
		frame.getContentPane().add(lblNewLabel_9, "cell 4 8");
		
		JLabel bottleAtPos_1 = new JLabel("nozzleXEngaged");
		bottleAtPos_1.setForeground(Color.GRAY);
		bottleAtPos_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		frame.getContentPane().add(bottleAtPos_1, "cell 0 9");
		
		JLabel indNozzle0Engaged = new JLabel("\u2022");
		indNozzle0Engaged.setForeground(Color.RED);
		indNozzle0Engaged.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indNozzle0Engaged, "cell 1 9,alignx center");
		
		JLabel indNozzle1Engaged = new JLabel("\u2022");
		indNozzle1Engaged.setForeground(Color.RED);
		indNozzle1Engaged.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indNozzle1Engaged, "cell 2 9");
		
		JLabel indNozzle2Engaged = new JLabel("\u2022");
		indNozzle2Engaged.setForeground(Color.RED);
		indNozzle2Engaged.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indNozzle2Engaged, "cell 3 9");
		
		JLabel indNozzle3Engaged = new JLabel("\u2022");
		indNozzle3Engaged.setForeground(Color.RED);
		indNozzle3Engaged.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indNozzle3Engaged, "cell 4 9");
		
		JLabel bottleAtPos_1_1 = new JLabel("injectorXEngaged");
		bottleAtPos_1_1.setForeground(Color.GRAY);
		bottleAtPos_1_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		frame.getContentPane().add(bottleAtPos_1_1, "cell 0 10");
		
		JLabel indInjector0Engaged = new JLabel("\u2022");
		indInjector0Engaged.setForeground(Color.RED);
		indInjector0Engaged.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indInjector0Engaged, "cell 1 10,alignx center");
		
		JLabel indInjector1Engaged = new JLabel("\u2022");
		indInjector1Engaged.setForeground(Color.RED);
		indInjector1Engaged.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indInjector1Engaged, "cell 2 10");
		
		JLabel indInjector2Engaged = new JLabel("\u2022");
		indInjector2Engaged.setForeground(Color.RED);
		indInjector2Engaged.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indInjector2Engaged, "cell 3 10");
		
		JLabel indInjector3Engaged = new JLabel("\u2022");
		indInjector3Engaged.setForeground(Color.RED);
		indInjector3Engaged.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indInjector3Engaged, "cell 4 10");
		
		JLabel bottleAtPos_1_2 = new JLabel("inletXEngaged");
		bottleAtPos_1_2.setForeground(Color.GRAY);
		bottleAtPos_1_2.setFont(new Font("Dialog", Font.PLAIN, 10));
		frame.getContentPane().add(bottleAtPos_1_2, "cell 0 11");
		
		JLabel indInlet0Engaged = new JLabel("\u2022");
		indInlet0Engaged.setForeground(Color.RED);
		indInlet0Engaged.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indInlet0Engaged, "cell 1 11,alignx center");
		
		JLabel indInlet1Engaged = new JLabel("\u2022");
		indInlet1Engaged.setForeground(Color.RED);
		indInlet1Engaged.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indInlet1Engaged, "cell 2 11");
		
		JLabel indInlet2Engaged = new JLabel("\u2022");
		indInlet2Engaged.setForeground(Color.RED);
		indInlet2Engaged.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indInlet2Engaged, "cell 3 11");
		
		JLabel indInlet3Engaged = new JLabel("\u2022");
		indInlet3Engaged.setForeground(Color.RED);
		indInlet3Engaged.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indInlet3Engaged, "cell 4 11");
		
		JLabel bottleAtPos_1_3 = new JLabel("dosUnitEvac");
		bottleAtPos_1_3.setForeground(Color.GRAY);
		bottleAtPos_1_3.setFont(new Font("Dialog", Font.PLAIN, 10));
		frame.getContentPane().add(bottleAtPos_1_3, "cell 0 12");
		
		JLabel indDosUnitEvac = new JLabel("\u2022");
		indDosUnitEvac.setForeground(Color.RED);
		indDosUnitEvac.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indDosUnitEvac, "cell 1 12,alignx center");
		
		JLabel bottleAtPos_1_4 = new JLabel("dosUnitFilled");
		bottleAtPos_1_4.setForeground(Color.GRAY);
		bottleAtPos_1_4.setFont(new Font("Dialog", Font.PLAIN, 10));
		frame.getContentPane().add(bottleAtPos_1_4, "cell 0 13");
		
		JLabel indDosUnitFilled = new JLabel("\u2022");
		indDosUnitFilled.setForeground(Color.RED);
		indDosUnitFilled.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indDosUnitFilled, "cell 1 13,alignx center");
		
		JLabel LID_HEADER = new JLabel("LID LOADER");
		LID_HEADER.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		frame.getContentPane().add(LID_HEADER, "cell 0 14");
		
		JLabel pusher = new JLabel("pusherRetracted");
		pusher.setForeground(Color.GRAY);
		pusher.setFont(new Font("Dialog", Font.PLAIN, 10));
		frame.getContentPane().add(pusher, "cell 0 15");
		
		JLabel indPusherRetracted = new JLabel("\u2022");
		indPusherRetracted.setForeground(Color.RED);
		indPusherRetracted.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indPusherRetracted, "cell 1 15,alignx center");
		
		JLabel pusher_1 = new JLabel("pusherExtended");
		pusher_1.setForeground(Color.GRAY);
		pusher_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		frame.getContentPane().add(pusher_1, "cell 0 16");
		
		JLabel indPusherExtended = new JLabel("\u2022");
		indPusherExtended.setForeground(Color.RED);
		indPusherExtended.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indPusherExtended, "cell 1 16,alignx center");
		
		JLabel WP = new JLabel("WPgripped");
		WP.setForeground(Color.GRAY);
		WP.setFont(new Font("Dialog", Font.PLAIN, 10));
		frame.getContentPane().add(WP, "cell 0 17");
		
		JLabel indWPgripped = new JLabel("\u2022");
		indWPgripped.setForeground(Color.RED);
		indWPgripped.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indWPgripped, "cell 1 17,alignx center");
		
		JLabel arm = new JLabel("armAtSource");
		arm.setForeground(Color.GRAY);
		arm.setFont(new Font("Dialog", Font.PLAIN, 10));
		frame.getContentPane().add(arm, "cell 0 18");
		
		JLabel indArmAtSource = new JLabel("\u2022");
		indArmAtSource.setForeground(Color.RED);
		indArmAtSource.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indArmAtSource, "cell 1 18,alignx center");
		
		JLabel arm_1 = new JLabel("armAtDest");
		arm_1.setForeground(Color.GRAY);
		arm_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		frame.getContentPane().add(arm_1, "cell 0 19");
		
		JLabel indArmAtDest = new JLabel("\u2022");
		indArmAtDest.setForeground(Color.RED);
		indArmAtDest.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indArmAtDest, "cell 1 19,alignx center");
		
		JLabel empty = new JLabel("empty");
		empty.setForeground(Color.GRAY);
		empty.setFont(new Font("Dialog", Font.PLAIN, 10));
		frame.getContentPane().add(empty, "cell 0 20");
		
		JLabel indEmpty = new JLabel("\u2022");
		indEmpty.setForeground(Color.RED);
		indEmpty.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indEmpty, "cell 1 20,alignx center");
		
		JLabel CAPPER_HEADER = new JLabel("CAPPER");
		CAPPER_HEADER.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		frame.getContentPane().add(CAPPER_HEADER, "cell 0 21");
		
		JLabel gripper = new JLabel("gripperZAxisLowered");
		gripper.setForeground(Color.GRAY);
		gripper.setFont(new Font("Dialog", Font.PLAIN, 10));
		frame.getContentPane().add(gripper, "cell 0 22");
		
		JLabel indGripperZAxisLowered = new JLabel("\u2022");
		indGripperZAxisLowered.setForeground(Color.RED);
		indGripperZAxisLowered.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indGripperZAxisLowered, "cell 1 22,alignx center");
		
		JLabel gripper_1 = new JLabel("gripperZAxisLifted");
		gripper_1.setForeground(Color.GRAY);
		gripper_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		frame.getContentPane().add(gripper_1, "cell 0 23");
		
		JLabel indGripperZAxisLifted = new JLabel("\u2022");
		indGripperZAxisLifted.setForeground(Color.RED);
		indGripperZAxisLifted.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indGripperZAxisLifted, "cell 1 23,alignx center");
		
		JLabel gripper_2 = new JLabel("gripperTurnHomePos");
		gripper_2.setForeground(Color.GRAY);
		gripper_2.setFont(new Font("Dialog", Font.PLAIN, 10));
		frame.getContentPane().add(gripper_2, "cell 0 24");
		
		JLabel indGripperTurnHomePos = new JLabel("\u2022");
		indGripperTurnHomePos.setForeground(Color.RED);
		indGripperTurnHomePos.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indGripperTurnHomePos, "cell 1 24,alignx center");
		
		JLabel gripper_3 = new JLabel("gripperTurnFinalPos");
		gripper_3.setForeground(Color.GRAY);
		gripper_3.setFont(new Font("Dialog", Font.PLAIN, 10));
		frame.getContentPane().add(gripper_3, "cell 0 25");
		
		JLabel indGripperTurnFinalPos = new JLabel("\u2022");
		indGripperTurnFinalPos.setForeground(Color.RED);
		indGripperTurnFinalPos.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(indGripperTurnFinalPos, "cell 1 25,alignx center");
	
		SimpleServer s = new SimpleServer("127.0.0.12", 2001);
		
		s.addConsumer("STATUS", "conveyorEngaged", (status, value) -> setStatus(indConveyorMotor, status));
		
		s.addConsumer("STATUS", "tableAlignedWithSensor", (status, value) -> setStatus(indTableAlignedWithSensor, status));
		s.addConsumer("STATUS", "bottleAtPos1", (status, value) -> setStatus(indBottleAtPos1, status));
		s.addConsumer("STATUS", "bottleAtPos2", (status, value) -> setStatus(indBottleAtPos2, status));
		s.addConsumer("STATUS", "bottleAtPos3", (status, value) -> setStatus(indBottleAtPos3, status));
		s.addConsumer("STATUS", "bottleAtPos4", (status, value) -> setStatus(indBottleAtPos4, status));
		s.addConsumer("STATUS", "bottleAtPos5", (status, value) -> setStatus(indBottleAtPos5, status));
		s.addConsumer("STATUS", "bottleLeftPos5", (status, value) -> setStatus(indBottleLeftPos5, status));
		
		s.addConsumer("STATUS", "nozzle0Engaged", (status, value) -> setStatus(indNozzle0Engaged, status));
		s.addConsumer("STATUS", "nozzle1Engaged", (status, value) -> setStatus(indNozzle1Engaged, status));
		s.addConsumer("STATUS", "nozzle2Engaged", (status, value) -> setStatus(indNozzle2Engaged, status));
		s.addConsumer("STATUS", "nozzle3Engaged", (status, value) -> setStatus(indNozzle3Engaged, status));
		s.addConsumer("STATUS", "injector0Engaged", (status, value) -> setStatus(indInjector0Engaged, status));
		s.addConsumer("STATUS", "injector1Engaged", (status, value) -> setStatus(indInjector1Engaged, status));
		s.addConsumer("STATUS", "injector2Engaged", (status, value) -> setStatus(indInjector2Engaged, status));
		s.addConsumer("STATUS", "injector3Engaged", (status, value) -> setStatus(indInjector3Engaged, status));
		s.addConsumer("STATUS", "inlet0Engaged", (status, value) -> setStatus(indInlet0Engaged, status));
		s.addConsumer("STATUS", "inlet1Engaged", (status, value) -> setStatus(indInlet1Engaged, status));
		s.addConsumer("STATUS", "inlet2Engaged", (status, value) -> setStatus(indInlet2Engaged, status));
		s.addConsumer("STATUS", "inlet3Engaged", (status, value) -> setStatus(indInlet3Engaged, status));
		s.addConsumer("STATUS", "dosUnitFilled", (status, value) -> setStatus(indDosUnitFilled, status));
		s.addConsumer("STATUS", "dosUnitEvac", (status, value) -> setStatus(indDosUnitEvac, status));
		
		s.addConsumer("STATUS", "pusherRetracted", (status, value) -> setStatus(indPusherRetracted, status));
		s.addConsumer("STATUS", "pusherExtended", (status, value) -> setStatus(indPusherExtended, status));
		s.addConsumer("STATUS", "WPgripped", (status, value) -> setStatus(indWPgripped, status));
		s.addConsumer("STATUS", "armAtSource", (status, value) -> setStatus(indArmAtSource, status));
		s.addConsumer("STATUS", "armAtDest", (status, value) -> setStatus(indArmAtDest, status));
		s.addConsumer("STATUS", "empty", (status, value) -> setStatus(indEmpty, status));
		
		s.addConsumer("STATUS", "gripperZAxisLowered", (status, value) -> setStatus(indGripperZAxisLowered, status));
		s.addConsumer("STATUS", "gripperZAxisLifted", (status, value) -> setStatus(indGripperZAxisLifted, status));
		s.addConsumer("STATUS", "gripperTurnHomePos", (status, value) -> setStatus(indGripperTurnHomePos, status));
		s.addConsumer("STATUS", "gripperTurnFinalPos", (status, value) -> setStatus(indGripperTurnFinalPos, status));

	}

}
