//public static 리턴 타입(자료형 / VOID) 메소드명() {
// 실행코드 
// return;  ==> void의 경우 return 없다
//}
public class 메소드를_복습하자 {
	public static void sum(int a) {
		int sum=0;
		for( int i=0; i<=a; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	public static void sum(int a, int b) {
		int sum=0;
		for( int i=a; i<=b ; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	public static void main(String[]args) {
		sum(15);
		sum(5,20);
	}
}
