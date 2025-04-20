package dblesson;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class VeriTabani extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static Connection conn;
	private JTextField txtNo;
	private JTextField txtAd;
	private JTextField txtYas;
	private JTextField txtMemleket;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VeriTabani frame = new VeriTabani();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void Baglan() {
		try {
			String url = "jdbc:mysql://localhost:3306/okul";
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,"root","root");
			System.out.println("Bağlantı Başarılı");
			
		} catch(Exception e) {
			System.out.println("Bağlantı Başarısız");
		}
		
	}
	public static void BaglantiKapat() {
		try {
			conn.close();
			System.out.println("Bağlantı Kapatıldı.");
		}catch(Exception e) {
			System.out.println("Bağlantı Kapatma İşlemi Başarısız");
		}
	}
	public void Bul() {
		try {
			String sorgu = "SELECT * FROM Ogrenci WHERE Ogr_No=" + txtNo.getText();
			Statement statement = conn.createStatement();	
			ResultSet results = statement.executeQuery(sorgu);
			results.next();
			txtAd.setText(results.getString("Ogr_Ad"));
			txtYas.setText(results.getString("Ogr_Yas"));
			txtMemleket.setText(results.getString("Ogr_Memleket"));

			
		}catch(Exception e) {
			
		}
	}
	public void Sil() {
		try {
			String sorgu = "DELETE FROM Ogrenci WHERE Ogr_No=" + txtNo.getText();
			Statement statement = conn.createStatement();	
			statement.execute(sorgu);
			System.out.println("Kayıt Silme Başarılı");

			
		} catch(Exception e) {
			System.out.println("Silme Başarısız");
		}
		
	}
	public void Guncelle() {
		try {
			String sorgu = String.format("UPDATE Ogrenci SET Ogr_Ad='%s',Ogr_Memleket='%s',Ogr_Yas='%s' WHERE Ogr_No='%d'",txtAd.getText(),txtMemleket.getText(),txtYas.getText(),Integer.parseInt(txtNo.getText()));
			Statement statement = conn.createStatement();	
			statement.execute(sorgu);
			System.out.println("Güncelleme Başarılı");
			
		}catch(Exception e) {
			System.out.println("Güncelleme Başarısız");
			
		}
		
	}
	public void Ekle() {
		String sorgu = String.format("INSERT INTO Ogrenci VALUES('%d','%s','%s','%s') ",Integer.parseInt(txtNo.getText()),txtAd.getText(), txtMemleket.getText(), txtYas.getText());
		try {
			Statement statement = conn.createStatement();
			statement.execute(sorgu);
			System.out.println("Kayıt Başarılı Bir Şekilde Eklendi");
		}
		catch(Exception e) {
			System.out.println("Kayıt Eklenemedi HATA.");
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public VeriTabani() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAc = new JButton("Baglanti Ac");
		btnAc.setBounds(339, 11, 85, 23);
		contentPane.add(btnAc);
		
		JLabel lblOgrNo = new JLabel("Ogrenci Numarasi");
		lblOgrNo.setBounds(10, 15, 85, 14);
		contentPane.add(lblOgrNo);
		
		JLabel lblOgrenciAd = new JLabel("OgrenciAd");
		lblOgrenciAd.setBounds(10, 51, 85, 14);
		contentPane.add(lblOgrenciAd);
		
		JLabel lblOgrenciYas = new JLabel("Ogrenci Yas");
		lblOgrenciYas.setBounds(10, 88, 85, 14);
		contentPane.add(lblOgrenciYas);
		
		JLabel lblMemleket = new JLabel("Ogrenci Memleketi");
		lblMemleket.setBounds(10, 123, 85, 14);
		contentPane.add(lblMemleket);
		
		txtNo = new JTextField();
		txtNo.setBounds(117, 12, 86, 20);
		contentPane.add(txtNo);
		txtNo.setColumns(10);
		
		txtAd = new JTextField();
		txtAd.setBounds(117, 48, 86, 20);
		contentPane.add(txtAd);
		txtAd.setColumns(10);
		
		txtYas = new JTextField();
		txtYas.setBounds(117, 85, 86, 20);
		contentPane.add(txtYas);
		txtYas.setColumns(10);
		
		txtMemleket = new JTextField();
		txtMemleket.setBounds(117, 120, 86, 20);
		contentPane.add(txtMemleket);
		txtMemleket.setColumns(10);
		
		JButton btnKaydet = new JButton("Kaydet");
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Baglan();
				Ekle();
				BaglantiKapat();

			}
		});
		btnKaydet.setBounds(339, 45, 89, 23);
		contentPane.add(btnKaydet);
		
		JButton btnGetir = new JButton("Veri Getir");
		btnGetir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Baglan();
				Bul();
				BaglantiKapat();
			}
		});
		btnGetir.setBounds(339, 84, 89, 23);
		contentPane.add(btnGetir);
		
		JButton btnDuzenle = new JButton("Düzenle");
		btnDuzenle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Baglan();
				Guncelle();
				BaglantiKapat();
			}
		});
		btnDuzenle.setBounds(335, 119, 89, 23);
		contentPane.add(btnDuzenle);
		
		JButton btnSil = new JButton("Sil");
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Baglan();
				Sil();
				BaglantiKapat();
			}
		});
		btnSil.setBounds(335, 153, 89, 23);
		contentPane.add(btnSil);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(87, 200, 30, 22);
		contentPane.add(comboBox);
		/*
		if(comboBox.getSelectedIndex() == 1) {
			String cinsiyet = "Erkek";
		}
		*/
		
		
		
	}
}
