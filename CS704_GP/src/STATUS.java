import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextPane;

import com.systemj.netapi.SimpleServer;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

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
		if(status) {
			dot.setForeground(Color.GREEN); 
		} else {
			dot.setForeground(Color.RED); 
		}
	}

	/**
	 * Create the application.
	 */
	public STATUS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[79.00,grow][][][][][62.00][][32.00][32.00][40.00]", "[][][][][center][][][][][]"));
		
		SimpleServer s = new SimpleServer("127.0.0.12", 2000);
		
		
		
		
		//Headers 
		JLabel header = new JLabel("Machine");
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
			
			s.addConsumer("STATUS", "conveyorEngaged", (status, value) -> setStatus(indConveyorMotor, status));
			
			/*// Bottle at Pos 1 
			
			JLabel bottleAtPos1Label = new JLabel("bottleAtPos1");
			bottleAtPos1Label.setForeground(Color.GRAY);
			bottleAtPos1Label.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
			frame.getContentPane().add(bottleAtPos1Label, "cell 2 2");
			
			JLabel indConveyorMotor_1 = new JLabel("•");
			indConveyorMotor_1.setForeground(Color.RED);
			frame.getContentPane().add(indConveyorMotor_1, "cell 3 2");
		
			//Bottle left pos 5	
			
			JLabel bottleLeftPos5Label = new JLabel("bottleLeftPos5");
			bottleLeftPos5Label.setForeground(Color.GRAY);
			bottleLeftPos5Label.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
			frame.getContentPane().add(bottleLeftPos5Label, "cell 4 2");
			
			JLabel indbottleLeftPos5 = new JLabel("•");
			indbottleLeftPos5.setForeground(Color.RED);
			frame.getContentPane().add(indbottleLeftPos5, "cell 5 2");
			*/
			

			// END OF CONVEYOR
		
			
			
			
			
			//ROTARY
			
			JLabel subheader2 = new JLabel("ROTARY");
			subheader2.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			frame.getContentPane().add(subheader2, "cell 0 3");
			
			//Table Sensor
			JLabel tableSensor = new JLabel("tableAlignedWithSensor");
			tableSensor.setForeground(Color.GRAY);
			tableSensor.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
			frame.getContentPane().add(tableSensor, "cell 0 4,aligny baseline");
			
			JLabel indTablesensor = new JLabel("•");
			indTablesensor.setForeground(Color.RED);
			frame.getContentPane().add(indTablesensor, "cell 1 4");
				
			//Bottle at pos 5
			
			JLabel bottleAtPos5 = new JLabel("bottleAtPos5");
			bottleAtPos5.setForeground(Color.GRAY);
			bottleAtPos5.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
			frame.getContentPane().add(bottleAtPos5, "cell 2 4,aligny baseline");
			
			JLabel indbottleAtPos5 = new JLabel("•");
			indbottleAtPos5.setForeground(Color.RED);
			frame.getContentPane().add(indbottleAtPos5, "cell 3 4");
			
			//Cap on bottle at pos 1
			JLabel capOnBottleAtPos1 = new JLabel("capOnBottleAtPos1");
			capOnBottleAtPos1.setForeground(Color.GRAY);
			capOnBottleAtPos1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
			frame.getContentPane().add(capOnBottleAtPos1, "cell 4 4,aligny baseline");
			
			JLabel indcapOnBottleAtPos1 = new JLabel("•");
			indcapOnBottleAtPos1.setForeground(Color.RED);
			frame.getContentPane().add(indcapOnBottleAtPos1, "cell 5 4");
			
			//
								
			JLabel lblNewLabel_5 = new JLabel("NOZZLE");
			lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			frame.getContentPane().add(lblNewLabel_5, "cell 5 5");
			
			JLabel lblNewLabel_6 = new JLabel("STATUS");
			lblNewLabel_6.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			frame.getContentPane().add(lblNewLabel_6, "cell 8 5");
	
			JLabel subheader3 = new JLabel("LIQUID");
			subheader3.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
			frame.getContentPane().add(subheader3, "cell 0 7");
		
		JLabel subheader4 = new JLabel("CAPPER");
		subheader4.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		frame.getContentPane().add(subheader4, "cell 0 8");
		
		JLabel subheader5 = new JLabel("LID LOADER");
		subheader5.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		frame.getContentPane().add(subheader5, "cell 0 9");
	
		
		
		
	}

}
