package com.sist.io;
import java.io.*;
/*
 		File �Ӽ� ==> File �����
 		====================================================
 					�Է�									���
 				FileInputStream, FileOutputStream,     =����, �׸� �� 1byte
				FileReader,   		  FileWriter						= �ѱ��� 2byte
 */
 import java.io.*;
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try
			{
				File file =new File("C:\\JavaDev\\javaStudy\\20200120-�ڹ���������\\src\\com\\sist\\java\\MainClass.java");
				//FileInputStream fis=new FileInputStream(file);  //  file��ü ���� ���ϰ� ��θ� �൵ ��
				FileReader fis=new FileReader(file);
				// ������ => �������� �����ڸ� ������ ���� �� �ִ�(�����ε�)
				int i =0;// ���� �б�=>int read() => ASCII�� �о�´�
				String data="";
				while((i=fis.read())!=-1)  										// -1 = EOF end of file ���� ��ü ������ �̷��� �����Ѵ�
				{
					//System.out.print((char)i);  // i=65��� A�� ����ϰԲ�
					data+=String.valueOf((char)i);  // == ���ڹ�ȣ
				}
				System.out.println(data);
				
				fis.close(); // ������ ���� �� ������ �ݾ���� �Ѵ�
				/*
				 * 		r:�б�
				 * 		w:����
				 * 		a:�߰�
				 */
				File file2=new File("c:\\image\\data.txt");
				if(!file2.exists())
				{
					file2.createNewFile();    // ������ ���鶧 mkdir�ϴ°� �ƴ϶� ��ó�� ����� ��
				}
				/*
				 *  		TextArea => setText(), append()  = ����� / ������
				 */
				FileWriter fos=new FileWriter(file2,true);  // true�ָ� append ���� * �����̱�, �߰��� ����
				fos.write(data);  // file2�ȿ� 20200120�� �ϳ��� ����      ====> ������ * ������ �ִ� ������ ����� �����
				fos.close();
				System.out.println("���Ͼ��� �Ϸ�");
				/*
				 			Ŭ����	
				 			=======
				 					1) �������
				 							1.������� : ( ������뺯�� instance (�ν��Ͻ�) , ���뺯�� static ( ��������)) 
				 															private int a;  => ��������� ���� �Ŀ� ����
				 																								=========
				 																										new
				 															private static int b; ==> ,Ŭ���� �δ�
				 															
				 															=>�⺻��, Ŭ����,�迭==> ��������
				 																					========= 
				 																					��������� ��������
				 															==> �޼ҵ� �ȿ����� ����ϴ� ���� : ��������
				 										========================================================
				 										������� : �ڵ� �ʱ�ȭ
				 										�������� : �ݵ�� �ʱ�ȭ
				 							2. �޼ҵ�= ���𸸵� �޼ҵ�( �߻�޼ҵ�)=> �̿ϼ��� Ŭ����
				 													==============�ϼ��� �ؼ� ��� ( �߻�Ŭ����, �������̽�)
				 													public void display();
				 												= ����+���� �޼ҵ�
				 													public void display()
				 													{
				 																//������
				 													}
				 													=> ������� ��û���� �޾Ƽ� ó�� ����� �����ش�
				 																==========                          ========
				 																�Ű�����											������
				 																																	===
				 																																	1���� ���
				 																																	= ����� ���� ���� ��� (int, String)
				 																																	= �����Ͱ� ���� (�迭,Ŭ����,�÷���)
				 																=> �Ű����� 3+ => Ŭ������ ��� ����
				 																=> �޼ҵ�� ����ȭ : �ϳ��� ����ǰ� �������� ����ȴ� 
				 																		aaa();
				 																		bbb();
				 																		ccc();
				 																		(�䱸���� �м� = �޼ҵ�)
				 																=>�޼ҵ�� �ַ� �ϴ� ������ Ŭ���� ���� ��� 
				 																============================
				 																������ �����ϰ�, ������ ����
				 							3. ������ : ��������� �ʱ�ȭ = ��������� ���� ����
				 																									===============
				 																										1) File�� �о� ���� ����
				 																										2) ��� ���
				 																										*** class�� �����
				 																											class A
				 																											{
				 																											int a;
				 																											a=10; (X)
				 																											}
				 */
			}catch(Exception ex) {}
	}

}
