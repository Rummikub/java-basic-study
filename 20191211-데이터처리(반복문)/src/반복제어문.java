/*
 * 	break
 * 	continue
 * 	========== 본인의 반복문만 제어
 * 									break => for, do~while, while,switch~case
 * 									continue => for, do~while, while
 * 									return => 어떤 제어문이든 사용이 가능함
 */
public class 반복제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++)
		{
			if (i==2)
				continue;    // 2 인 애를 제외
			for(int j=1;j<=3;j++)
			{
						//if(j==2)
						      //continue; //break;     				//소속문장만 제어함
				System.out.println("i="+i+",j="+j);
			}	
		//break; // i를 제어중
		}
	}

}
