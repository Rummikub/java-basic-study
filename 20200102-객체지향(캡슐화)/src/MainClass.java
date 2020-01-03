class Data{
	String title ; 
	static String poster;
	
	// 초기화 블록
	{
		title="aaa";
	}
	static
	{
		 poster="1.png";
	}
	
	 // 마지막에 생성자가 만들어지면 덮어쓴다
	public Data() {  
		title = "bbb";
		poster="2.png";
	}
}
public class MainClass {

	public static void main(String[] args) {
		Data d1=new Data();
		System.out.println(d1.title);
		System.out.println(d1.poster);
	
		Data d2=new Data();
		System.out.println(d1.title);
		System.out.println(d1.poster);
	}

}
