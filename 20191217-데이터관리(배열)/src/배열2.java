/*
 * 		중복이 없는 난수
 * 		=> 배열
 * 		=============
 * 		=======
 * 		난수발생 => 
 * 		=======
 * 
 * 		= > 제어문 
 * 				for ()
 * 				{
 * 						for()							do{									while()
 * 							{									} while() 						{
 * 							}																			}
 * 					}
 * 		
 * 				
 */
public class 배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] com= new int [9];
		int su=0;  													// 난수 발생시 저장
		boolean bCheck=false;   				// 중복 여부를 확인    거짓인지 확인해봐

		for(int i=0; i<com.length; i++)
		{
			bCheck=true;     							//****  중복 되면  참
			while(bCheck)
			{
				// 난수 발생
				su=(int)(Math.random()*9)+1;    // 1 ~9
				bCheck=false;																//******
													// 맨처음에  false가 나오면 else를 수행할 것이기에 오류 발생 , default를 앞에 걸어놓고 시작!
				// 중복 여부
				for(int j=0;j<i;j++)   // i까지 저장하기 때문 
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;  				// while문으로 올라간다
					}
				}
			}
			com[i]=su;
		}
		
		// 출력
		for (int i:com)
		{
			System.out.print(i+"");
		}
	}

}
