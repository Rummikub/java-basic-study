package com.sist.io;
import java.io.*;
public class MainClass6 {
// ���� ����   =======> ���ε�!
	/*
									�б� :  int read(), int read(byte[], off, len)
												=== 				  ===
												���ڹ�ȣ		���� ����Ʈ��
									���� :  write(byte[]), write(String)
									�ݱ� : close()
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fis=
					new FileInputStream("c:\\image\\0.jpg");    // �ٸ� �������� �о�ͼ� 
			FileOutputStream fos=
					new FileOutputStream("c:\\oracle\\0.jpg");  // �� ���ο� ������ ���� ( upload )
		
			int i=0;// == ���� byte����
			byte[] buffer=new byte[1024];   //  ����Ʈ�� �ϳ����� �ƴ϶� ������ ��� �о���� ���� ��
			while((i=fis.read(buffer, 0, 1024)) !=-1)   // buffer�迭�� 1024 ������! 
			{
					fos.write(buffer, 0  , i);  // ( �迭�̸�, ���� ,��)  0~i��° ( ������ ���� byteũ�� ���� ) 
																											//	if 1024���� ���� ���ڶ�� null���� �Էµ� 
			}
			fis.close();
			fos.close();
			
			System.out.println("���� ���� �Ϸ�");
		}catch(Exception ex) {}
	}

}
