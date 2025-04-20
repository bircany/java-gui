package visualprogramming;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;

public class QWE extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtKullaniciAdi;
	private JTextField txtSifre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QWE frame = new QWE();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QWE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtKullaniciAdi = new JTextField();
		txtKullaniciAdi.setBounds(124, 44, 86, 20);
		contentPane.add(txtKullaniciAdi);
		txtKullaniciAdi.setColumns(10);
		
		JButton btnNewButton = new JButton("Giriş");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBounds(124, 110, 89, 23);
		contentPane.add(btnNewButton);
		
		txtSifre = new JTextField();
		txtSifre.setBounds(124, 80, 86, 20);
		contentPane.add(txtSifre);
		txtSifre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Kullanıcı Adı");
		lblNewLabel.setBounds(53, 47, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Şifre");
		lblNewLabel_1.setBounds(53, 83, 46, 14);
		contentPane.add(lblNewLabel_1);
	}

}
