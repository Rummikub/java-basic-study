import java.util.regex.Matcher;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

public class �޼ҵ�5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String data = "�������� ���� ���� ���� ���!  �����̹���������ͱ��� �����";
			// ���� ����  =>  * ���鵵 ����
			System.out.println("���� ����:  "+ data.length());
			//���� �ڸ��� = substring(0) _  �߰��������� ������ �ڸ��� ���� ���, substring(2,3)_�ڸ��� ������, ��ĭ����
			int n=data.indexOf("!");
			System.out.println(n);
			String fData=data.substring(0,data.indexOf("!"));
			System.out.println(fData);
			String lData=data.substring(data.indexOf("!")+1);
			System.out.println(lData.trim());
			// => �׷��� ���ڼ��� �Ź� �����Ѵٴ� ������ ������
			
			int a=10;
			int b=20;
			double d=10.5;
			// 102010.5  		==> ��ȣ  => 201912231, 201912232, 201912233
			String sss=a+""+b+""+d;
			System.out.println(sss);
			sss=String.valueOf(a)+String.valueOf(b)+String.valueOf(d);
			// Ŭ���� + ���� �̷��� ���� ���߳�?  static mehod = value �Լ�
			// valueOf ===>  ��� ���������� ���ڷ� ��ȣ�����ִ� �Լ� 
			System.out.println(sss);
	}

}
