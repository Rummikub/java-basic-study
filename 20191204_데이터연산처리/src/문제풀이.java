import java.util.Scanner;

public class ����Ǯ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����2
		int pay=1500000;
		int perhour=55000;
		int tax= pay*1/10;
		int total= pay+perhour-tax;
		
		System.out.println("�Ǽ��ɾ� ="+total);
		
		//����3
		String name="��ȿ��";
		String depart="���ߺ�";
		String pos="�븮";
		int sal=1500000;
		
		System.out.println("�̸�: "+ name);
		System.out.printf("�μ�: "+depart+"\n");
		System.out.print("����: "+pos+"\n");
		System.out.println("�޿�:"+sal);

		//����4
		String Input_Name="�ε鷡";
		int kor=90;
		int eng=70;
		int mat=75;
		
		 total = kor+eng+mat;
		 
		 double avg= total/3.0;
		 
		Scanner  scan = new Scanner (System.in); 
		System.out.println("�̸�");
		Input_Name=scan.nextLine();
		
		System.out.println("�հ�����");
		total=scan.nextInt();
		
		System.out.println("�������");
		avg=scan.nextInt();


		System.out.println("�̸�"+Input_Name);
		System.out.println("�հ�����:" +total );
		System.out.println("�������:" +avg);
		
		
		//����6
		
		int numOfApples = 123;
		int sizeOfBucket =10;
		int numOfBucket= (numOfApples%10);
		
		System.out.println(numOfBucket);

		
		
	}

}
