import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextPane;

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
		frame.getContentPane().setLayout(new MigLayout("", "[79.00][62.00][32.00][32.00][40.00]", "[][][center][][]"));
		
		JLabel lblNewLabel = new JLabel("CONVEYOR");
		frame.getContentPane().add(lblNewLabel, "cell 0 0");
		
		JLabel lblNewLabel_1 = new JLabel("ROTARY");
		frame.getContentPane().add(lblNewLabel_1, "cell 0 1");
		
		JLabel lblNewLabel_2 = new JLabel("LIQUID");
		frame.getContentPane().add(lblNewLabel_2, "cell 0 2");
		
		JLabel lblNewLabel_5 = new JLabel("NOZZLE");
		frame.getContentPane().add(lblNewLabel_5, "cell 1 2");
		
		JLabel lblNewLabel_6 = new JLabel("STATUS");
		frame.getContentPane().add(lblNewLabel_6, "cell 3 2");
		
		JLabel lblNewLabel_3 = new JLabel("CAPPER");
		frame.getContentPane().add(lblNewLabel_3, "cell 0 3");
		
		JLabel lblNewLabel_4 = new JLabel("LID LOADER");
		frame.getContentPane().add(lblNewLabel_4, "cell 0 4");
	}

}
