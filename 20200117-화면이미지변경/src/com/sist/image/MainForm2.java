package com.sist.image;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainForm2 extends JFrame implements ActionListener,Runnable{
	JButton b;
	JProgressBar bar;  
	public MainForm2()
	{
		b=new JButton("Start");
		bar=new JProgressBar();
		bar.setMinimum(0);
		bar.setMaximum(100);
		bar.setForeground(Color.red);
		bar.setBackground(Color.white);
		bar.setStringPainted(true);   // 몇%진행되는지
		
		add("Center",bar);
		add("South",b);
		
		setSize(450,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		b.addActionListener(this);
	}
	public void go()
	{
		try
		{
			for(int i=0;i<=100;i++)
			{
				bar.setValue(i);
				Thread.sleep(100); // 0.1초
			}
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainForm2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b)
		{
			new Thread(this).start();
		}
	}
	@Override  
	// thread통해서 몇%가 진행되었는지 보여준다 
	public void run() {
		// TODO Auto-generated method stub
		go();
	}
	
}
