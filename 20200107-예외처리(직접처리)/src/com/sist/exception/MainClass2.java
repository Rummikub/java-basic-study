package com.sist.exception;
/*
  	Exception 의 종류
  	=============
  			예외복구: try ~ catch ( 직접 처리 ) 		==========> 70%
  			예외회피: throws ( 간접 처리 )  => 시스템에 의해 처리 
  			예외발생: throw ( 사용자 정의 예외처리)
 			==========================================
 				 try ~ catch ~ finally ( 생략해도 무방 ) 
 				형식)
 						try
 						{
 								정상 수행을 할 수 있는 문장
 								1번 문장
 								2번 문장
 								3번 문장				=> 1유형 에러 발생   = 1,2,6,9,10수행  ( catch 수행 하고 빠져나감 )
 								4번 문장
 								5번 문장
 						}catch (예상되는 예외 1) 
 						{
 								복구 문장
 								6번 문장
 						}catch (예상되는 예외 2)
 						{
 								복구 문장
 								7번 문장
 						}catch (예상되는 예외 3)
 						{		복구 문장 
								8번 문장
 						}  finally    ~ 서버 관련
 						{
 								(정상 수행 or 복구 문장을 수행하든) 관계없이 무조건 수행하는 문장          & 서버나 파일을 닫을 때 
 								9번 문장
 						}
 								10번 문장					===> 에러가 안났다면? 1,2,3,4,5,9,10
 				**주의점 **				
 								try
 								{  
 								   for(int i=0; i<10; i++)
 								   	{
 								   			try
 								   			{
 								   			실행문장 ==> i ==5 예외발생  :  1) i~4까지 수행했을 것.
 								   			}catch(Exception e) {}     ==> i~4 까지 6~i 까지 수행  ( for문이 종료하지 않았으므로 다시 증가식으로 올라가야 하기때문)
 								} 1)catch(Exception e){}
 					*/	
 
public class MainClass2 {

	public static void main(String[] args) {
		/*
		 * try { for ( int i=1; i<=10; i++) { if (i==5) { int a =10/0; // => 에러발생 지점 }
		 * System.out.println("i= "+i); } }catch (Exception ex) // catch 찾는다 {
		 * System.out.println("Error"); // 문장 수행한다 ( 복구문장) }
		 */
		for ( int i=1; i<=10; i++)
		{
			try
			{
				if(i==5)
				{
					int a=10/0;
				}
				System.out.println("i= " +i);
			}catch( Exception ex)
		{
				System.out.println("오류 발생");
			}
		}
	}

}
