/*
 * 		�ߺ��� ���� ����
 * 		=> �迭
 * 		=============
 * 		=======
 * 		�����߻� => 
 * 		=======
 * 
 * 		= > ��� 
 * 				for ()
 * 				{
 * 						for()							do{									while()
 * 							{									} while() 						{
 * 							}																			}
 * 					}
 * 		
 * 				
 */
public class �迭2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] com= new int [9];
		int su=0;  													// ���� �߻��� ����
		boolean bCheck=false;   				// �ߺ� ���θ� Ȯ��    �������� Ȯ���غ�

		for(int i=0; i<com.length; i++)
		{
			bCheck=true;     							//****  �ߺ� �Ǹ�  ��
			while(bCheck)
			{
				// ���� �߻�
				su=(int)(Math.random()*9)+1;    // 1 ~9
				bCheck=false;																//******
													// ��ó����  false�� ������ else�� ������ ���̱⿡ ���� �߻� , default�� �տ� �ɾ���� ����!
				// �ߺ� ����
				for(int j=0;j<i;j++)   // i���� �����ϱ� ���� 
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;  				// while������ �ö󰣴�
					}
				}
			}
			com[i]=su;
		}
		
		// ���
		for (int i:com)
		{
			System.out.print(i+"");
		}
	}

}
