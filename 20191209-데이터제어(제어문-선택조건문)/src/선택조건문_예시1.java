
public class �������ǹ�_����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����=> ������ �� ����
		int score=(int)(Math.random()*101); //0 ~100
		// 						0.0~0.99 => 0.99*101 => 100..
		System.out.println(score);
		
		// 90 �̻� , 80 �̻�, 70, 60 , 60���� :  A,B,C,D,F
		
		if(score<60)
		{
		System.out.println("F�Դϴ�");
		}
		else
		{
				//  ��ø if => ���� ���ǹ�\
				// if�� �������� ������� ��쿡�� ���ǿ� �´� ��� ������ ������ �� �ִ�.
			if(score>=90 && score<=100)
			System.out.println("A�Դϴ�");
			if(score>=80&& score<90)
				System.out.println("B�Դϴ�");
			if(score>=70&& score<80)
				System.out.println("C�Դϴ�");
			if(score>=60&& score<70)
				System.out.println("D�Դϴ�");
		}  // ��ġ�� ������ �־ ����ϸ� �ߺ��ȴ�. ������ ������� �Ѵٴ� ���
		// �����ݷ��� ����� ������ �ǹ��ϴϱ� ��������.
		
	}

}
