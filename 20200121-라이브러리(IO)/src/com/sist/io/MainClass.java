package com.sist.io;
/*
 			java.io(��=> File) : �ٿ�ε�/ ���ε�
 			============
 			�����
 				= �޸�
 					Input : BufferedReader(new InputStreamReader(System.in))
 									=> Ű���忡 �Է°��� �޴� ���
 					Output : System.out.println()
 			  = ����
 			  		Input  : BufferedReader(new InputStreamReader(new FileInputStream("��θ�")))
 			  		Output : FilesOutputStream, FileWriter 
 			  =��Ʈ��ũ
 			  		Input: BufferedReader(new InputSTreamReader(s.getOutputStream()))
 			  																													==========
 			  																													s=Socket
 			  	   Output: s.getOutputStream()
 			  	   =============================================================
 			  	   IO
 			  	   ==
 			  	   Input : 1byte => InputStream     , 2byte => Reader (�ѱ�)
 			  	   Output:  1byte => OutputStream     , 2byte =>Writer
 			  	   ======> .txt, .xml, .json(javascript �ַ� ��� ����������)
 			  	   									============Web���� �ַ� ���(������ ���� => �Ľ�)
 			  										.json  => React, Vue  => Ajax,RestController
 			  										
 			  		File Ŭ����
 			  		========= ������ ������ �����ϰ� �ִ�
 			  		= ���� ---------------> new File("C:\\JavaDev\\a.jpg")
 			  		= ���丮(����) --->  new File("C:\\JavaDev")
 			  																												cd = change directory
 */
import java.io.*;
/*
 				io, sql => ������ ����ó���� �ݵ�� �ʿ���
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File  dir=new File("C:\\javaDev");
			File[] files=dir.listFiles();   //   => ������ ���� �о�´�
			for(File f:files)
			{
				if(f.isDirectory())// ���� => ������ �������� Ȯ��
				{
						System.out.println("["+f.getName()+"]");
				}
				else // ����
				{
					System.out.println(f.getAbsolutePath());
				}
			}
		}catch (Exception ex) {}
	}

}
