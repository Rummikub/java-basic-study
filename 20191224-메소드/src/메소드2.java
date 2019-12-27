// call by reference ( 주소) => 배열 클래스					* 메모리를 따로 생성할 필요가 없어서 속도가 빠름       ** 조회수 증가할 때 사용하더라더라더라더라두라도라더
/*
 * 	class A
 * 	{
 * 			int a=10;
 * 	}
 * 	swap(A aa)
 * 	{
 * 			aa.a=1000;
 * 	}
 *  A aa=new A();   = > 클래스를 저장하는 공간을 heap에 만들었구나
 *  swap(aa)
 *  
 *  aa,a    => 배열의 인덱스 같은 역할을 하는 ( . )  그 안에 저장되어 있는 뭘 가져와라				= 1000
 */
public class 메소드2 {
	static void swap(int []arr)
	{
		System.out.println("prior swap: arr[0]:" + arr[0] + " arr[1]: "+arr[1]);
		// 변경
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		System.out.println("swap: arr[0]:" + arr[0] + " arr[1]: "+arr[1]);
	}
	public static void main(String[] args) {
		// 배열 

		메소드2 a=new 메소드2();
		메소드2 b=new 메소드2();
		메소드2 c=new 메소드2();
		메소드2 d=new 메소드2();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		int []arr= {100,200};
		swap(arr);  							//주소전송 *( 원본이 넘어감)
		System.out.println("main  swap: arr[0]:" + arr[0] + " arr[1]: "+arr[1]);
			
	}

}
