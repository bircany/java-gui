package visualprogramming;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;

public class Element {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500,600);
		frame.setLocation(100,200);
		frame.getContentPane().setLayout(new FlowLayout());
			
		
		String[] str = {"C","C#","Java","PHP"};
		//JComboBox
		JComboBox cmb = new JComboBox(str);
		frame.getContentPane().add(cmb);
		JButton btn1 = new JButton("Seçilen");
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Seçilen Programlama Dili."+ cmb.getSelectedItem());
			}
		});
		
		//JRadioButton
		JRadioButton rb1 = new JRadioButton("Erkek");
		frame.getContentPane().add(rb1);
		/*
		//JCheckBox
		JCheckBox cbE = new JCheckBox("Evet");
		JCheckBox cbH = new JCheckBox("Hayır");
		cbE.setBounds(200,200,50,50);
		
		frame.getContentPane().add(cbE);
		frame.getContentPane().add(cbH);
		JButton btn1 = new JButton("Seçilen");
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(cbE.isSelected())
					System.out.println("Evet Seçildi");
				else if(cbH.isSelected())
					System.out.println("Hayır Seçildi");
				else
					System.out.println("Hiçbiri Seçilmedi");
			}
			
		});
		frame.getContentPane().add(btn1);
		*/
		
		/*
		JButton btn1 = new JButton("Gönder");
		frame.getContentPane().add(btn1);
		//TextArea
		JTextArea ar1 = new JTextArea();
		ar1.setText("Buraya Yaz");
		
		JPasswordField pass = new JPasswordField(20);
		//pass.getText();
		
		JLabel lblkelime = new JLabel();
		JLabel lblmetin = new JLabel();
		frame.getContentPane().add(ar1);
		frame.getContentPane().add(lblkelime);
		frame.getContentPane().add(lblmetin);
		frame.getContentPane().add(pass);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String metin = ar1.getText();
				String kelime[] = metin.split("\\s");
				lblmetin.setText("Karakter Sayısı: " + metin.length());
				lblkelime.setText("Kelime sayısı: " + kelime.length);
			}
			
		});
		*/
		
		

		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
