package visualprogramming;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEkran;
	private JPanel panel;
	private JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnTopla,btnCikar,btnBol,btnEsit,btnCarp,btnClear;
	private double answer,number;
	int operator;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void addInput(String str) {
		txtEkran.setText(txtEkran.getText() + str);
	}
	public void calculate() {
		switch(operator) {
		case 1:
			answer = number + Double.parseDouble(txtEkran.getText());
			txtEkran.setText(Double.toString(answer));
			break;
		case 2:
			answer = number - Double.parseDouble(txtEkran.getText());
			txtEkran.setText(Double.toString(answer));
			break;
		case 3:
			answer = number * Double.parseDouble(txtEkran.getText());
			txtEkran.setText(Double.toString(answer));
		case 4:
			answer = number / Double.parseDouble(txtEkran.getText());
			txtEkran.setText(Double.toString(answer));
			break;
		}
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSonuc = new JLabel("New label");
		lblSonuc.setBounds(342, 11, 46, 14);
		contentPane.add(lblSonuc);
		
		txtEkran = new JTextField();
		txtEkran.setBounds(38, 25, 350, 20);
		contentPane.add(txtEkran);
		txtEkran.setColumns(10);
		
		panel = new JPanel();
		panel.setBounds(0, 57, 434, 204);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(4, 4, 1, 1));
		
	
		
		
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());

			}
		});
		btnTopla = new JButton("+");
		btnTopla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(txtEkran.getText());
				operator = 1;
				txtEkran.setText("");
				lblSonuc.setText(number + e.getActionCommand());
				
			}
		});

		btnCikar = new JButton("-");
		btnCikar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(txtEkran.getText());
				operator = 2;
				txtEkran.setText("");
				lblSonuc.setText(number + e.getActionCommand());
			}
		});
		btnCarp = new JButton("*");
		btnCarp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(txtEkran.getText());
				operator = 3;
				txtEkran.setText("");
				lblSonuc.setText(number + e.getActionCommand());
			}
		});
		btnBol = new JButton("/");
		btnBol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(txtEkran.getText());
				operator = 4;
				txtEkran.setText("");
				lblSonuc.setText(number + e.getActionCommand());
			}
		});
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtEkran.setText("");
			}
		});
		btnEsit = new JButton("=");
		btnEsit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				lblSonuc.setText("");
			}
		});
		panel.add(btn9);
		panel.add(btn8);
		panel.add(btn7);
		panel.add(btnTopla);

		panel.add(btn6);
		panel.add(btn5);
		panel.add(btn4);
		panel.add(btnCikar);

		panel.add(btn3);
		panel.add(btn2);
		panel.add(btn1);
		panel.add(btnBol);

		panel.add(btn0);
		panel.add(btnClear);
		panel.add(btnEsit);
		panel.add(btnCarp);


		
		
		
		
		
		
	}
}
