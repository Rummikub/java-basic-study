import java.util.Arrays;

public class DavinciIntro {


	public static void main(String[] args) {
		// ���� ���� ����
		int[] com =new int[6];
		// ���� 
		int su=0;
		//�� => �ߺ�
		boolean bCheck=false;
		for(int i=0; i<6; i++)
		{
			bCheck=true;
			while(bCheck)
			{
				su= com[i]=(int)(Math.random()*11);  
				bCheck=false;
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;
					}
				}
			}
			com[i]=su;
		}
		// �迭�� ����
		
		//  ���
		for(int i: com)  // index�� �ƴ�data�� ���� ���� ��  , ����� ������ �Ѱ��� �о�´� (for~each)
		{
			System.out.print(i+ " ");
		//	Arrays.Sort(i);
		}
	}
}
