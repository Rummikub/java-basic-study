import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MainForm extends JFrame implements ActionListener{
	Login login=new Login();
	WaitingRoom wr=new WaitingRoom();
	CardLayout card=new CardLayout();
	MainForm() {
		setLayout(card);
		add("LOGIN", login);
		add("WR",wr);

		setSize(1024, 780);
		setVisible(true); //윈도우를 보여라
		login.b1.addActionListener(this);
	}
	public static void main(String[] args) {
	 	try
	 	{
	 		UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
	 		JFrame.setDefaultLookAndFeelDecorated(true);
	 	}
	 catch(Exception e) {}
	 MainForm mf=new MainForm();
	
	 
} 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b1)
		{
			card.show(getContentPane(), "WR");
		}
		
	}
		
}
