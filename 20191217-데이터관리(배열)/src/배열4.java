/*
 * 		관련된 내용을 묶어서 사용
*
*			배열 	=> 같은 데이터형 묶어서 하나의 이름으로 제어 
*								==========
*							 int[]  arr={'A','B' ..}
*									디폴트를 한번은 출력하고싶을때 (값이 필요할때)
*							int [] arr =new int [3];
*								  1)일단은 0으로 채우고 나중에 값을 정할때     2) 값이 많을때 미리 저장하는 용도
*							double[] arr={10,20,30...}
*							String[] arr={"","","",...}			=> 클래스를 저장할때 값이 없는 경우 :  null    =  불러올 주소가 없다
*
 */
public class 배열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="aaaaaaa";
		String b;
		String c=" ";
		a.length();
		// b .length();       b=null이기 때문에 출력을 못함
		c.length();
		
		 System.out.println("a: "+a );
		 //System.out.println("b: "+b );
		 System.out.println("c: "+c );


	}

}
