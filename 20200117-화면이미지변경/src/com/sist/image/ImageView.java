package com.sist.image;
import java.awt.*;
import javax.swing.*;
public class ImageView extends JPanel {
		Image back;
		// back=>  메모리 할당 (초기화)\
		public ImageView()
		{
			back=Toolkit.getDefaultToolkit().getImage("C:\\image\\background.jpg");
		}
		public void setImage(int no)
		{
			// 페이지 호출
			if(no==0)
			{
				back=Toolkit.getDefaultToolkit().getImage("C:\\image\\0.jpg");
			}
			else
			{
				back=Toolkit.getDefaultToolkit().getImage("C:\\image\\movie"+no+".jpg");
			}
		}
		//Jcomponant > paint
		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);
			g.drawImage(back,0,0,getWidth(),getHeight(),this);
		}
		
}
