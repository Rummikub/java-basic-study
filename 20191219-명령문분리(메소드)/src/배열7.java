// String 은 일반 변수 취급 ==> 보통은 지역/전역 변수의 법칙을 따른다.    ((((( 스트링은 call by value )))))
public class 배열7 {
	static void getData2(String s)
	{
		s=" Hello ";
	}
	static void getData(int[]arr)
	{
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Java";
		getData2(a);
		System.out.println(a);
		int[]arr =new int[5];  			// new의 초기값은 다 0
		getData(arr);
		for(int i:arr)
		{
			System.out.println(i);
		}
		
	}

}
