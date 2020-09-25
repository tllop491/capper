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
import com.systemj.netapi.*;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.SwingConstants;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class POS_GUI {

	private JFrame frame;

	/*
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					POS_GUI window = new POS_GUI();
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
	public POS_GUI() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 351, 246);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][][grow]", "[14px][26px][26px][26px][26px][14px][20px][23px]"));

		
		JLabel lblNewLabel = new JLabel("LIQUID TYPE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel, "cell 0 0,growx,aligny top");
		
		JLabel lblNewLabel_1 = new JLabel("RATIO");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_1, "cell 1 0,growx,aligny top");
		
		JLabel lblNewLabel_3 = new JLabel("Ephedrine");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblNewLabel_3, "cell 0 1,alignx center,aligny center");
		
		JLabel slider_label = new JLabel("50");
		frame.getContentPane().add(slider_label, "cell 2 1");
		
		JLabel slider_label_1 = new JLabel("50");
		frame.getContentPane().add(slider_label_1, "cell 2 2");
		
		JLabel slider_label_2 = new JLabel("50");
		frame.getContentPane().add(slider_label_2, "cell 2 3");
		
		JLabel slider_label_3 = new JLabel("50");
		frame.getContentPane().add(slider_label_3, "cell 2 4");
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				slider_label.setText("" + ((JSlider)e.getSource()).getValue());
			}
		});
		frame.getContentPane().add(slider, "cell 1 1,growx,aligny top");
		
		JSlider slider_1 = new JSlider();
		slider_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				slider_label_1.setText("" + ((JSlider)e.getSource()).getValue());
			}
		});
		frame.getContentPane().add(slider_1, "cell 1 2,growx,aligny top");
		
		JSlider slider_2 = new JSlider();
		slider_2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				slider_label_2.setText("" + ((JSlider)e.getSource()).getValue());
			}
		});
		frame.getContentPane().add(slider_2, "cell 1 3,growx,aligny top");
		
		JSlider slider_3 = new JSlider();
		slider_3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				slider_label_3.setText("" + ((JSlider)e.getSource()).getValue());
			}
		});
		frame.getContentPane().add(slider_3, "cell 1 4,growx,aligny top");
		
		
		JLabel lblNewLabel_3_1 = new JLabel("Lithium");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblNewLabel_3_1, "cell 0 2,alignx center,aligny center");
		
		JLabel lblNewLabel_3_2 = new JLabel("Acetone");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblNewLabel_3_2, "cell 0 3,alignx center,aligny center");
	
		JLabel lblNewLabel_3_3 = new JLabel("Toluene");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(lblNewLabel_3_3, "cell 0 4,alignx center,aligny center");
		
		JLabel lblNewLabel_2 = new JLabel("QUANTITY");
		frame.getContentPane().add(lblNewLabel_2, "cell 0 5,alignx center,aligny center");
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 20, 1));
		frame.getContentPane().add(spinner, "cell 0 6,growx,aligny top");
		
		JButton btnNewButton = new JButton("ORDER");
		
		frame.getContentPane().add(btnNewButton, "cell 0 7,growx,aligny top");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					TCPSender s = new TCPSender("127.0.0.1", 2000);
					int sum = 0;
					ArrayList<Integer> single_order = new ArrayList<Integer>();
					
					sum = slider.getValue() + slider_1.getValue() + slider_2.getValue() + slider_3.getValue();
					
					single_order.add(Math.round(((float)slider.getValue()/sum)*100)); // to get percentage
					single_order.add(Math.round(((float)slider_1.getValue()/sum)*100));
					single_order.add(Math.round(((float)slider_2.getValue()/sum)*100));
					single_order.add(Math.round(((float)slider_3.getValue()/sum)*100));
					int order_amount = (int)spinner.getValue();
					
					
					
					for (int i = 0; i < order_amount; i++) {
						s.emit(single_order, 1000);
						for (int j = 0; j < 4; j++) {
							System.out.print(single_order.get(j));  // debug
						}
					}
				} catch (IOException e) {}
			}
			
		});
		
			
	}

}
