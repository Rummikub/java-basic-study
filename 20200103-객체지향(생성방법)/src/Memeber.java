
public class Memeber {  // 바로 출력하려면 get,set이 따로 필요 없다는 것!!
		private String id;
		private String pwd;
	
		//초기화
		public Memeber() {
			// 데이터 베이스에서 읽기, 파일 읽기
			id="hong";
			pwd="1234";
		}
		// 오버로딩 ( Source - get field)
		public Memeber(String id, String pwd) {
			super();
			this.id = id;
			this.pwd = pwd;
		}

		public void print() //  위처럼 매개변수를 id.pwd로 받아서 수정할 수도 있어
		{
			System.out.println("ID"+id);
			System.out.println("Password"+pwd);
		}
		
}
