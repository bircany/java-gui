package visualprogramming;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Component {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500,600);
		frame.setLocation(100,200);
		frame.getContentPane().setLayout(new FlowLayout());
		JButton btn1 = new JButton("Gönder");
		frame.getContentPane().add(btn1);
		btn1.setBackground(Color.yellow);
		btn1.setForeground(Color.red);
		
		//frame.getContentPane().setBackground(new Color(8,100,138));
		Color yeniRenk = new Color(105,208,125);
		frame.getContentPane().setBackground(yeniRenk);
		Color eskiRenk = btn1.getBackground();
		
		JLabel lbl1 = new JLabel();
		lbl1.setSize(200,200);
		Image img1 = new ImageIcon(Component.class.getResource("/image/lblimage.png")).getImage();
		lbl1.setIcon(new ImageIcon(img1));
		btn1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
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
				btn1.setBackground(Color.darkGray);
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				btn1.setBackground(eskiRenk);
				
			}
			
		});
		
		btn1.setFocusable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
