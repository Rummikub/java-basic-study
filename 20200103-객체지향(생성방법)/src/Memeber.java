
public class Memeber {  // �ٷ� ����Ϸ��� get,set�� ���� �ʿ� ���ٴ� ��!!
		private String id;
		private String pwd;
	
		//�ʱ�ȭ
		public Memeber() {
			// ������ ���̽����� �б�, ���� �б�
			id="hong";
			pwd="1234";
		}
		// �����ε� ( Source - get field)
		public Memeber(String id, String pwd) {
			super();
			this.id = id;
			this.pwd = pwd;
		}

		public void print() //  ��ó�� �Ű������� id.pwd�� �޾Ƽ� ������ ���� �־�
		{
			System.out.println("ID"+id);
			System.out.println("Password"+pwd);
		}
		
}
