/*
 *  		for(int i=1;i<=10;i++)
 *       {
 *  		System.out.println(i);
 *        }
 *  
 *  	int i=1;
 *  	do
 *  	{
 *  			System.out.println(i);
 *  			i++;
 *    } while(i<=10);
 *    
 *    int a=10;
 *    if(a==10)
 *    {
 *    	int b=20;
 *    	if (b==20)
 *    	{
 *    		int c=30;
 *    		{
 *    				int k=100;
 *    		}
 *    	}  // C (X)
 *    } // B(X)
 *    
 *    
 */
public class 제어문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			aaa();
			aaa();
			aaa();
	}
	public static void aaa()
	{
		int a=10;
		System.out.println("a= "+a);
		++a;  							//지역변수는 블록과 동시에 사라진다
	}
}
