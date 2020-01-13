package com.sist.io2;
/*
					  	Thread  사용법
					  	=== 한가지 일만 사용하게 만든다
					  	============
					  	1. Runnable (interface)이용하는 방법  
					  		=> 클라 ( 윈도우 ) / 한가지 기능만 있을 때
					  		=>run() 메소드 구현 => 쓰레드 동작
					  		class A implements Runnable
					    2. Thread를 상속받아 처리
					    		=> Thread의 역할 확장
					    		class A extends Thread
					   
    	===> 동작법
 		INIT (생성: Created) => Runnable(대기) => Running => 일시정지
 		====================																				=> 쓰레드 종료 interrupt (), join()
 		Thread t1=new Thread()				t1.start()				run() => sleep(),wait()					
 		Thread t2=new Thread()				t2.start()				run() => sleep(),wait()
 		=> JVM 
 			  	이름을 부여 thread-0
 				순위 부여 ( 1~ 10 ) 
 				===============
 					1=>MIN_PRIORITY   ( gc )
 					10=>MAX_PRIORITY ( 메인메소드)   => 속도가 가장 빠르다
 					5=>NORM_PRIORITY ( 사용자정의)
 */
class MyThread extends Thread
{
	public void run()
	{
		for(int i=1; i<=10;i++)
		{
			System.out.println(getName()+":" +i);
			 try
			 {
				 Thread.sleep(50);
			 }catch (Exception ex) {}
		}
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		// 생성
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		
		t1.setName("홍길동");
		t2.setName("심청이");
		t3.setName("박문수");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		//필요한 데이터 호출
		t1.start();
		t2.start();
		t3.start();

		//1~10출력 
		//t1.run(), t2.run(), t3.run() 자동호출
	}

}
