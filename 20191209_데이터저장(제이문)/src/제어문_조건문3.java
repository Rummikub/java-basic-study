// ���ĺ� => ���� => �빮��,�ҹ���
public class ���_���ǹ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alpha='1';
		if(alpha>='A' && alpha<='Z')
			// ����, �Ⱓ ==>&&�� ������� �Ǵ�    65~120  / 35~90
			// ������ => char�� ��� ������ �Ǹ� => ������ �ڵ� ����ȯ
			System.out.println(alpha+"��(��) �빮���Դϴ�");
		//  �̰��� �빮��, �ҹ��� �����Դϴ�
		else if(alpha>='a' && alpha<='z')
			System.out.println(alpha+"��(��) �ҹ����Դϴ�");
		else
			System.out.println(alpha+"��(��) ���ĺ��� �ƴϴ�");
		// �̰��� ���� if
	}

}
