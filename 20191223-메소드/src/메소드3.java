/*\
 * 데이터형중에 가장 큰 데이터형 ? 						Object
 *    {3, "aaa", 10.5 , 'A', 9.5F, 10L}   => 형변환 해서 가져온다면 배열로 사용 可能   => Object
 */
public class 메소드3 {

	public static void main(String[] args) {
	
		/*
		 * Object[] arr= {3, "aaa", 10.5 , 'A', 9.5F, 10L}; int a =(int) arr[0]; // 이 값은
		 * 받지 못한다. 각각의 형변환 [Object 데이터형을 => (int) ]을 해줘야 가져올 수 있다 for(int i=0;
		 * i<arr.length; i++) { System.out.println(arr[i]); }
		 */
		System.out.printf("%d%d%c%s");     // 커서를 갖다대면 Object 라는 것을 확인 할 수 있음, 필요한 데이터형 아무거나 사용 가능 개수도 무한정

	}

}
