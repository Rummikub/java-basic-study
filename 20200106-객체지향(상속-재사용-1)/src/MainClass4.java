// 추상 클래스의 일종 => 모든 메소드가 구현이 없다
// 상속 ~ 인터페이스 예시!  ( implement )
interface Ani{
	void working();
	void eating();
}
class Human implements  Ani{

	@Override
	public void working() {
		// TODO Auto-generated method stub
		 System.out.println("두 발로 걷다");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		 System.out.println("수저로 먹다");
	}
	
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
