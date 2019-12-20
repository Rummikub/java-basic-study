// 1~45 => 난수 발생 => 중복없이 6개 발생
/*
 *  배열 => 6개
 *  	
 *  for(6횟수)
 *  	{
 *  			while(중복)
 *  			{
 *  				난수 발생
 *  				배열에 저장된 데이터와 난수(같다)
 *  			}
 *  			배열 저장
 *   }
 */
public class 메소드4 {

	public static void main(String[] args) {
		// 난수 저장 공간
		int[] com =new int[6];
		// 난수 
		int su=0;
		//비교 => 중복
		boolean bCheck=false;
		for(int i=0; i<6; i++)
		{
			bCheck=true;
			while(bCheck)
			{
				su= com[i]=(int)(Math.random()*45)+1;     // Mathrandom > *45 = 0.0~0.99 = 44.9999999 > int > +1
				bCheck=false;
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;
					}
				}
			}
			com[i]=su;
		}
		// 배열에 저장

		//  출력
		for(int i: com)  // index가 아닌data를 갖고 오는 것  , 저장된 데이터 한개씩 읽어온다 (for~each)
		{
			System.out.print(i+ " ");
		}
	}

}
