import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.GridBagLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;

public class POS {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					POS window = new POS();
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
	public POS() {
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
		frame.getContentPane().setLayout(new MigLayout("", "[][]", "[14px][26px][26px][26px][26px][14px][20px][23px][]"));
		
		JLabel lblNewLabel = new JLabel("LIQUID TYPE");
		frame.getContentPane().add(lblNewLabel, "cell 0 0,growx,aligny top");
		
		JLabel lblNewLabel_1 = new JLabel("AMOUNT");
		frame.getContentPane().add(lblNewLabel_1, "cell 1 0,growx,aligny top");
		
		JComboBox comboBox = new JComboBox();
		frame.getContentPane().add(comboBox, "cell 0 1,growx,aligny center");
		
		JSlider slider = new JSlider();
		frame.getContentPane().add(slider, "cell 1 1,growx,aligny top");
		
		JComboBox comboBox_1 = new JComboBox();
		frame.getContentPane().add(comboBox_1, "cell 0 2,growx,aligny center");
		
		JSlider slider_1 = new JSlider();
		frame.getContentPane().add(slider_1, "cell 1 2,growx,aligny top");
		
		JComboBox comboBox_2 = new JComboBox();
		frame.getContentPane().add(comboBox_2, "cell 0 3,growx,aligny center");
		
		JSlider slider_2 = new JSlider();
		frame.getContentPane().add(slider_2, "cell 1 3,growx,aligny top");
		
		JComboBox comboBox_3 = new JComboBox();
		frame.getContentPane().add(comboBox_3, "cell 0 4,growx,aligny center");
		
		JSlider slider_3 = new JSlider();
		frame.getContentPane().add(slider_3, "cell 1 4,growx,aligny top");
		
		JLabel lblNewLabel_2 = new JLabel("QUANTITY");
		frame.getContentPane().add(lblNewLabel_2, "cell 0 5,growx,aligny top");
		
		JSpinner spinner = new JSpinner();
		frame.getContentPane().add(spinner, "cell 0 6,growx,aligny top");
		
		JButton btnNewButton = new JButton("ORDER");
		frame.getContentPane().add(btnNewButton, "cell 0 7,growx,aligny top");
		
		JButton btnNewButton_1 = new JButton("CANCEL");
		frame.getContentPane().add(btnNewButton_1, "cell 0 8,growx,aligny top");
	}

}
