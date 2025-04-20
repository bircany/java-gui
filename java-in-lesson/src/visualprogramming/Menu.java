package visualprogramming;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Menu {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Tablo Örneği");
		frame.setSize(500,600);
		frame.setLocation(100,200);
		//JScrollPane , JTable , JMenu , JPopUpMenu , JProgressBar

		/*
		String[][] veri = { //rows
				{"1","Alper Karadeniz","Giresun"},
				{"2","Eliz","Ordu"},
				{"3","Aras","Trabzon"}
		};
		String[] baslik = {"Numara","İsim","Memleket"}; //columns
		JTable table = new JTable(veri,baslik); //row,column
		JScrollPane sp = new JScrollPane(table);
		frame.getContentPane().add(sp);
		frame.setLayout(new FlowLayout());
		*/
		
		/*
		JMenuBar mb = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenu subMenu = new JMenu("New");
		JMenuItem i2 = new JMenuItem("Open File");
		JMenuItem i3 = new JMenuItem("Recent File");
		JMenuItem i4 = new JMenuItem("Close Editor");
		JMenuItem s1 = new JMenuItem("Java Project");
		JMenuItem s2 = new JMenuItem("Maven Project");

		subMenu.add(s1);
		subMenu.add(s2);
		menu.add(i2);
		menu.add(i3);
		menu.add(i4);
		
		menu.add(subMenu);
		mb.add(menu);
		frame.setJMenuBar(mb);
		i2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(i2,"Menüye Tıklandı");
			}			
		});
		*/
		/*
		
		JPopupMenu pm = new JPopupMenu("Menü");
		JMenuItem cut = new JMenuItem("Kes");
		JMenuItem copy = new JMenuItem("Kopyala");
		JMenuItem paste = new JMenuItem("Yapıştır");
		pm.add(cut);
		pm.add(copy);
		pm.add(paste);
		frame.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				pm.show(frame,e.getX(),e.getY());
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});

		cut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Kes butonu seçildi.");
				
			}
			
		});
		copy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Kopyala butonu seçildi.");
				
			}
			
		});
		paste.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Yapıştır butonu seçildi.");				
			}
			
		});
		*/
		
		/*
		JProgressBar pb = new JProgressBar(0,2000);
		pb.setBounds(50,50,160,40);
		pb.setValue(0);
		pb.setStringPainted(true);
		
		frame.add(pb);
		
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		int i = 0;
		while(i <= 2000) {
			pb.setValue(i);
			i += 20;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		*/
		
		

		
		

	}

}
