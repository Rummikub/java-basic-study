/*
 *   쉬프트연산자 ( 비트이동연산자)
 *  <<     >>
 *  왼이동 : 두칸을 더해라  / 오이동: 두칸을 버려라
 *  1010 -> 101000         /1010 -> 10
 *  
 *  X<<Y => X*2^Y
 *  10*4 ==> 10*2^2 (2의2승)
 *   
 * X>>Y => X/2^Y   
 */ 
public class 이항연산자_쉬프트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int a=14<<3;
	   int b=14>>3;
	   
	   System.out.println(a);
	   System.out.println(b);

	}

}
