package davinci.client;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import davinci.common.DavinciFunction;

//Server
 import java.util.*;
 import java.net.*;
 import java.io.*;

 public class MainForm extends JFrame implements MouseListener, Runnable{
	 Socket s;// ��������
		OutputStream out; // ������ ������ ����
		BufferedReader in;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{ 
			while(true)
			{
				String msg=in.readLine();
			System.out.println(msg);
			StringTokenizer st=new StringTokenizer(msg,"|");
			int protocol=Integer.parseInt(st.nextToken());
			switch(protocol)
			{
				case DavinciFunction.GAMESTART:
				{
					String [] data= {
							st.nextToken(),   // id
							st.nextToken(),  // name
							st.nextToken(),  //sex
							st.nextToken()  //loc
						};
					break;
				}
			   // ����� �߰�
			  }
			}
		}catch (Exception ex ) {}
	}
	/*
	 * 		swtich(no)
	 *   {
	 *     case1: 
	 *     	int num=3;
	 *     	break;
	 *     case2:
	 *     	int num=5;
	 *     	break;
	 *     case3:
	 *     	int num=7;
	 *     	break;
	 *    }
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	//if(e.getSource()==wr.table1)

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
		
}
