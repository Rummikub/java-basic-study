package ����������;
/*
 *  �̸�, ����, ����, ���� ������ ������ �� 
 *  �̸�,����,����,����,����,����� ���
 */
public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ����
		String name=" �ƹ���";
	   int kor = 89,eng= 90 , math= 100;
		// ó��
	   //���
		System.out.print("�̸�: "+name+"\n");
		System.out.print("����: "+kor);
		System.out.print("����: "+eng);
		System.out.print("����: "+math);
		System.out.print("����: "+(kor+eng+math));
		// ����/���� = ����     �Ǽ�/���� = �Ҽ��� ���ϱ��� �˷��ش�  printf = �Ҽ��� �ο����� print = �Ϸķ� ��� + "\n" = println
		// printf ( %.Nf, ())   �Ҽ��� N° �ڸ����� 
		System.out.printf("���:%.2f",(kor+eng+math)/3.0);
	}

}
