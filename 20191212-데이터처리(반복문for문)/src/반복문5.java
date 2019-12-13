/*
 *  1~100합을 구하고 짝수 홀수 합 출력 (변수 3개)
 *  합 : 5050
 *  짝수의 합:
 *  홀수의 합:
 *  
 *  
 */
public class 반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;int odd=0; int even=0;
		for(int i=1;i<=100;i++)
		{
			sum+=i;
			if(i%2==0)
			
				even+=i;
			
			else
			
			
				odd+=i;
		}
		System.out.println(" 합:"+sum);
		System.out.println("짝수의 합:"+even);
		System.out.println("홀수의 합:"+odd);    /// 반복문안에 들어가면 안된다.
	}

}
