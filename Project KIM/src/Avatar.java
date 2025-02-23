
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Avatar extends JPanel{
	JButton b1,b2,b3,b4,b5;
	Image back;
	Avatar(){
		setLayout(null); 
		back = Toolkit.getDefaultToolkit().getImage("C:\\JavaDev\\project\\Davinci\\DaVinciCode\\image\\game_bg.jpg");
		Image image;
		
		b1=new JButton(new ImageIcon("C:\\JavaDev\\project\\Davinci\\DaVinciCode\\image\\Avatar\\_11.jpg"));
		b2=new JButton(new ImageIcon("C:\\JavaDev\\project\\Davinci\\DaVinciCode\\image\\Avatar\\_22.jpg"));
		b3=new JButton(new ImageIcon("C:\\JavaDev\\project\\Davinci\\DaVinciCode\\image\\Avatar\\_33.jpg"));
		b4=new JButton(new ImageIcon("C:\\JavaDev\\project\\Davinci\\DaVinciCode\\image\\Avatar\\_44.jpg"));
		b5=new JButton("����");
		
	
		
		add(b1); 
		b1.addActionListener(event-> {
			b1.setIcon(new ImageIcon("C:\\JavaDev\\project\\Davinci\\DaVinciCode\\image\\Avatar\\_111.jpg"));
		});
		b1.setBounds( 90, 175, 160, 199); 
		b1.setOpaque(false); 
		
		add(b2);
		b2.addActionListener(event-> {
			b2.setIcon(new ImageIcon("C:\\JavaDev\\project\\Davinci\\DaVinciCode\\image\\Avatar\\_222.jpg"));
		});
		b2.setBounds( 303, 175, 160, 199);
		b2.setOpaque(false);
		
		add(b3);
		b3.addActionListener(event-> {
			b3.setIcon(new ImageIcon("C:\\JavaDev\\project\\Davinci\\DaVinciCode\\image\\Avatar\\_333.jpg"));
		});
		b3.setBounds( 516, 175, 160, 199);
		b3.setOpaque(false);
	
		add(b4);
		b4.addActionListener(event-> {
			b4.setIcon(new ImageIcon("C:\\JavaDev\\project\\Davinci\\DaVinciCode\\image\\Avatar\\_444.jpg"));
		});
		b4.setBounds( 729, 175, 160, 199);
		b4.setOpaque(false);
		add(b5);
		b5.setBounds( 450, 550, 100, 50);
		b5.setOpaque(false);
		
	
	}

	


	@Override
	protected void paintComponent(Graphics g) { 
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
	}
}