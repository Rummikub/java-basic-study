// 100���� 999     7�ǹ���� �, 4�ǹ���� �ƴ� ������ �?


public class �ݺ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int i=100;  // ��������
		int res1=0,res2=0;  // ī��Ʈ�ϱ�
		while(i<=999)
		{
			if(i%7==0)
			   res1++;
		
			if(i%4!=0)
				res2++;
			
			//System.out.println(i);
			i++;   // �̰� �Ȱɸ� ���ѷ��� �ɸ���
		}
		System.out.println("7�� ����� "+res1+"��");
		System.out.println("4�� ����� �ƴ� ���� "+res2+"��");   // ����Ʈ�� {} �ۿ� �־�� ����� �ȴ�
		
		
	}

}
