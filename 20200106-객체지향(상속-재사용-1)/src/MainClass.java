class ����{
		public void draw() {
			System.out.println("���� �׸���");
		}
		// �߰�
}
class �� extends ���� {
		public void draw() {
			System.out.println("��  �׸���");					// �������̵� ��ӹ޾Ƽ� ���� 
		}
}
class �ﰢ�� extends ���� {
		public void draw() {
			System.out.println("�ﰢ�� �׸���");
		}	
}
class �׸� extends ���� {
		public void draw() {
			System.out.println("�׸� �׸���");
		}	
}
// ���̺귯�� ��� => �����ؼ� ���
public class MainClass {

	public static void main(String[] args) {

		���� m= new �׸�();  // = �׸� m=new �׸�();
		 m.draw();   // �����̰� ������ �ʿ䰡 ���� �� .
		 
		 m=new �ﰢ��();
		 m.draw();
		 
		 m=new ����();
		 m.draw();

	}

}
