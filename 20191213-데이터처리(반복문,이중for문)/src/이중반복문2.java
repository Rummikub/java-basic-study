/*
 *   break: �ݺ��� �ߴ�
 *   for(int i=1;i<=10;i++)
 *   {
 *   			if(i==5)
 *   			break;
 *   			System.out.println(i);
 *   }      																									 ===> 1~4�� ���
 *   
 *   continue:  Ư���κ��� ����
 *     for(int i=1;i<=10;i++)
 *   {
 *   			if(i==5)
 *   			continue;																		//    ���⼭ => ������ ���� �ٽ� �����϶�
 *   			System.out.println(i);											===> 1234,   678910
 *   } 
 * 
 */
public class ���߹ݺ���2 {

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
			    		if(i==5 || i==7) 											   // && �ƴ� ����? 5�̰ų� 7�� ��� �����
			   			continue;
			    	 	System.out.println(i);
			    }
		for(int i=1;i<=10;i++)
		   {
		    		if(i%2!=0)  													  // ¦���� �ƴϸ� ��Ƽ�� ( �����ϰ��� �ϴ� ���� �����ϸ� �ȴ�)
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
