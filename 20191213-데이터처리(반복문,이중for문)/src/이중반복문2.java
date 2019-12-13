/*
 *   break: 반복을 중단
 *   for(int i=1;i<=10;i++)
 *   {
 *   			if(i==5)
 *   			break;
 *   			System.out.println(i);
 *   }      																									 ===> 1~4만 출력
 *   
 *   continue:  특정부분을 제외
 *     for(int i=1;i<=10;i++)
 *   {
 *   			if(i==5)
 *   			continue;																		//    여기서 => 증가한 다음 다시 수행하라
 *   			System.out.println(i);											===> 1234,   678910
 *   } 
 * 
 */
public class 이중반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  for(int i=1;i<=10;i++)
		   {
		    		if(i==5)
		   			break;
		    	 	System.out.println(i);
		    }
		for(int i=1;i<=10;i++)
			   {
			    		if(i==5 || i==7) 											   // && 아닌 이유? 5이거나 7인 경우 멈춰라
			   			continue;
			    	 	System.out.println(i);
			    }
		for(int i=1;i<=10;i++)
		   {
		    		if(i%2!=0)  													  // 짝수가 아니면 컨티뉴 ( 제외하고자 하는 것을 설정하면 된다)
		   			continue;
		    	 	System.out.println(i);
		    }
		for(int i=1;i<=10;i++)
		   {
		    		if(i%2!=1) 
		   			continue;
		    	 	System.out.println(i);
		    }
	}

}
