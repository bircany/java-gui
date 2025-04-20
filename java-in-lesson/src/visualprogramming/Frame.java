package visualprogramming;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Frame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("İlk Ders");
		frame.setSize(500,600);
		frame.setLocation(100,200); //setBounds(x,y,w,h) 
		frame.getContentPane().setLayout(new FlowLayout());
		/*
		String sVize = JOptionPane.showInputDialog("Lütfen vize notunuzu giriniz.");
		String sOdev = JOptionPane.showInputDialog("Lütfen odev notunuzu giriniz.");
		String sFinal1 = JOptionPane.showInputDialog("Lütfen final notunuzu giriniz.");

		int vize = Integer.parseInt(sVize);
		int odev = Integer.parseInt(sOdev);
		int final1 = Integer.parseInt(sFinal1);
		while(vize < 0 || vize > 100) {
			sVize = JOptionPane.showInputDialog(null,"Lütfen vize notunuzu doğru giriniz.",JOptionPane.WARNING_MESSAGE);
			vize = Integer.parseInt(sVize);

		}
		while(odev < 0 || odev > 100) {
			sOdev = JOptionPane.showInputDialog(null,"Lütfen ödev notunuzu doğru giriniz.",JOptionPane.WARNING_MESSAGE);
			odev = Integer.parseInt(sOdev);

		}
		while(final1 < 0 || final1 > 100) {
			sFinal1 = JOptionPane.showInputDialog(null,"Lütfen final notunuzu doğru giriniz.",JOptionPane.WARNING_MESSAGE);
			final1 = Integer.parseInt(sFinal1);
		}
		double notOrt = vize * 0.3 + odev * 0.2 + final1 * 0.5;
		String sonuc = "";
		if(notOrt > 50)
			sonuc = "Gecti: "  + notOrt;
		else
			sonuc = "Kaldı: " + notOrt;

		JOptionPane.showMessageDialog(null, sonuc);
		
		
		
		JTextField txt1 = new JTextField(20);
		JButton btn1 = new JButton("Gönder");
		JLabel lbl1 = new JLabel("Lütfen isminizi giriniz.");

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lbl1.setText("Mehaba " + txt1.getText() + " ilk derse hoşgeldin.");
				
			}
		});
		JButton btn2 = new JButton("Tıkla");
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane panel = new JOptionPane();
				panel.showMessageDialog(null,"Merhaba bu yeni bir pencere");
				
			}
		});
		JButton btn3 = new JButton("Veri al");
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Lütfen isminizi giriniz.");
				JOptionPane.showMessageDialog(null,name);
			}
		});
		
		frame.getContentPane().add(lbl1);
		frame.getContentPane().add(txt1);
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn2);
		frame.getContentPane().add(btn3);
		*/

		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
