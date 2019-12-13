/*
 *  		do~while: 한번 이상을 수행하는 반복문(빈도 많이 없음)
 *  		형식)
 *  
 *  						//   C. C++. C#. Java => 0 (문자열,자료구조( List,Set, Map))
 *  				초기값
 *  					do {
 *  							실행문장==> 여러문장을 사용할 수 있다
 *  							증가식 ==>	증감식
 *  									i++, 		i--
 *  									i+=2,  i-=2
 */
public class 반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10까지
		int i=1;//  1~10  => 루프변수
		do
		{
			System.out.println("i= "+i);
			i++;     // 이 증감식이 없으면 절대 10에 닿을 수 없기 때문에 무한루프에 빠진다
		}while(i<=10);
		System.out.println("10~1");
		do {
			System.out.println("i="+(i-1));
			i--;
		}while(i>1) ;
	}

}
