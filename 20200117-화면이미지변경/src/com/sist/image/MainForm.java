package com.sist.image;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainForm extends JFrame implements ActionListener {
	JButton startBtn,prevBtn,nextBtn;
	ImageView imagePanel;
	int no=1;
	public MainForm()
	{
			//메모리 할당
			 startBtn=new JButton("시작");
			 prevBtn=new JButton("이전");
			 nextBtn=new JButton("다음");
			 imagePanel=new ImageView();
			 // 클래스는 new를 이용해서 힙영역에 저장
			 //new 사용할 수 없는 클래스 ( 미완성된 클래스 => 추상클래스,인터페이스)
			 //배치
			 JPanel p=new JPanel();
			 p.add(startBtn);
			 p.add(prevBtn);
			 p.add(nextBtn);
			 
			 //윈도우 올리기
			 add("Center", imagePanel);
			 add("South",p);
			 
			 //크기 설정
			 setSize(640,480); // setBounds(x,y,width,height)
			 //x=0,y=0
			 setVisible(true);
			 
			 setDefaultCloseOperation(EXIT_ON_CLOSE);
			 
			 // 이벤트 등록
			 startBtn.addActionListener(this);   // AL가 가진 메소드를 호출하라 ( actionperformed 에서 구현 가능)
			 prevBtn.addActionListener(this);
			 
			 nextBtn.addActionListener(this);
			 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {   
		// TODO Auto-generated method stub
						if(e.getSource()==startBtn)
						{
							imagePanel.setImage(0);
							imagePanel.repaint();   //클리어렉이 호출된다 그전의 그림 위에 덮어써라\
						
							new ImageThread().start();
						}
						else if(e.getSource()==prevBtn)
						{
							no--;
							if(no<1)
									no=1;
							imagePanel.setImage(no);
							imagePanel.repaint();
						}
						else if(e.getSource()==nextBtn)   
						{
							no++;
							if(no>5)																															
									no=5;
							imagePanel.setImage(no);
							imagePanel.repaint();
						}
		}
	// 자동으로 이미지 넘어가게 ( 내부클래스로 image와 no를 제어한다)
	class ImageThread extends Thread
	{
		public void run()
		{
			while(true)
			{
				try
				{
					 no++;
					 if(no>5)
						 	no=1;
					 imagePanel.setImage(no);
					 imagePanel.repaint();
					 Thread.sleep(1000);  // =1초 
				}catch(Exception ex) {}
			}
		}
	}

}
