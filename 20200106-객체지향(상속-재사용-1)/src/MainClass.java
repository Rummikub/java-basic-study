class 도형{
		public void draw() {
			System.out.println("도형 그린다");
		}
		// 추가
}
class 원 extends 도형 {
		public void draw() {
			System.out.println("원  그린다");					// 오버라이딩 상속받아서 수정 
		}
}
class 삼각형 extends 도형 {
		public void draw() {
			System.out.println("삼각형 그린다");
		}	
}
class 네모 extends 도형 {
		public void draw() {
			System.out.println("네모 그린다");
		}	
}
// 라이브러리 상속 => 변경해서 사용
public class MainClass {

	public static void main(String[] args) {

		도형 m= new 네모();  // = 네모 m=new 네모();
		 m.draw();   // 공통이고 수정할 필요가 없을 때 .
		 
		 m=new 삼각형();
		 m.draw();
		 
		 m=new 도형();
		 m.draw();

	}

}
