/* 이렇게 하면 안되고 calc(여기 안에 매개변수 넣으면 다르다)
 * 사칙연산 
 *   매개변수 ~ 리턴형 ==== 없다면 값을 못바꾸고 못 넘겨준다! 
 */
public class 메소드12 {
	 static void calc()
	 {
		 int a=10;
		 int b=20;
		 char op='*';
		 if(op=='+')
		 {
			 System.out.println(a+b);
		 }
		 else if(op=='-')
		 {
			 System.out.println(a-b);
		 }
		 else if(op=='*')
		 {
			 System.out.println(a*b);
		 }
		 else if(op=='/')
		 {
			 if(b==0)
				 System.out.println("0으로 나눌 수 없다");
			 else
				 System.out.println(a/b);
		 }
		 else
		 {
			 System.out.println("연산자 틀림");
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 calc();
	}

}
