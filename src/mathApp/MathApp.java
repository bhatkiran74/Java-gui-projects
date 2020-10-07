package mathApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Color;

public class MathApp {

	private JFrame frame;
	private JTextField firstNo;
	private JTextField secondNo;
	private JButton btnSecondNumber;
	private JTextField result;
	private JButton btnMultiplication;
	private JSeparator separator_1;
	private JLabel lblNewLabel_1;
	private JButton btnDivision;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MathApp window = new MathApp();
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
	public MathApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.YELLOW);
		frame.setBounds(100, 100, 579, 339);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		firstNo = new JTextField();
		firstNo.setFont(new Font("Roboto Bk", Font.PLAIN, 14));
		firstNo.setBounds(71, 113, 191, 30);
		frame.getContentPane().add(firstNo);
		firstNo.setColumns(10);
		
		secondNo = new JTextField();
		secondNo.setFont(new Font("Roboto Bk", Font.PLAIN, 14));
		secondNo.setColumns(10);
		secondNo.setBounds(305, 113, 191, 30);
		frame.getContentPane().add(secondNo);
		
		JButton btnNewButton = new JButton("Addition");
		btnNewButton.setFont(new Font("Roboto Bk", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(firstNo.getText());
				int b =Integer.parseInt(secondNo.getText());
				
				int c = a+b;
				
				
				result.setText(Integer.toString(c));
				
			}
		});
		btnNewButton.setBounds(71, 154, 191, 30);
		frame.getContentPane().add(btnNewButton);
		
		btnSecondNumber = new JButton("Substraction");
		btnSecondNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int a = Integer.parseInt(firstNo.getText());
				int b =Integer.parseInt(secondNo.getText());
				
				int c = a-b;
				
				
				result.setText(Integer.toString(c));
			}
		});
		btnSecondNumber.setFont(new Font("Roboto Bk", Font.BOLD, 16));
		btnSecondNumber.setBounds(305, 154, 191, 30);
		frame.getContentPane().add(btnSecondNumber);
		
		result = new JTextField();
		result.setFont(new Font("Roboto Bk", Font.PLAIN, 14));
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setColumns(10);
		result.setBounds(185, 72, 191, 30);
		frame.getContentPane().add(result);
		
		JLabel lblNewLabel = new JLabel("Result");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Roboto Bk", Font.BOLD, 16));
		lblNewLabel.setBounds(71, 72, 102, 30);
		frame.getContentPane().add(lblNewLabel);
		
		btnMultiplication = new JButton("Multiplication");
		btnMultiplication.setFont(new Font("Roboto Bk", Font.BOLD, 16));
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(firstNo.getText());
				int b =Integer.parseInt(secondNo.getText());
				
				int c = a*b;
				
				
				result.setText(Integer.toString(c));
			}
		});
		btnMultiplication.setBounds(71, 195, 191, 30);
		frame.getContentPane().add(btnMultiplication);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(32, 250, 501, 2);
		frame.getContentPane().add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(32, 46, 501, 2);
		frame.getContentPane().add(separator_1);
		
		lblNewLabel_1 = new JLabel("Basic Calculation App");
		lblNewLabel_1.setFont(new Font("Roboto Bk", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(32, 21, 170, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		btnDivision = new JButton("Division");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(firstNo.getText());
				int b =Integer.parseInt(secondNo.getText());
				
				int c = a/b;
				
				
				result.setText(Integer.toString(c));
			}
		});
		btnDivision.setFont(new Font("Roboto Bk", Font.BOLD, 16));
		btnDivision.setBounds(305, 195, 191, 30);
		frame.getContentPane().add(btnDivision);
	}
}
