package com.sist.exception;
			/*
			 *  예외처리
			 *  ====== 소스상에서 수정이 가능한 에러 ( 가벼운 에러: 프로그래머가 처리 가능한 정도)
			 *  		예)		0으로 나눈다  / 파일명이 틀리다 / IP가 틀리다 / URL 주소가 틀리다 / 배열의 범위가 초과
			 *  
			 *  목적 
			 *  	1) 에러가 발생시 예방차원
			 *  	2) 에러가 발생시 정상기능 수행 , 프로그램 종료 안되게 도움
			 *   
			 *   예외처리
			 *   							자바								
			 *   				=============
			 *   				|								|
			 *   			컴파일 (javac) 		실행시 (java) 
			 *   			==========		==========
			 *   			JVM이 검색			실행시마다 에러
			 *   		=> 반드시 예외처리	=> 필요하면 예외처리
			 *   			입출력
			 *   				=	메모리 입출력
			 *   					System.out.print()
			 *   					System.in.read()	
			 *   				= File 입출력	
			 *   				= 네트워크 입출력
			 *   	
			 */
public class MainClass {

	public static void main(String[] args) {
		
		int [] arr=new int [6];
		// 6까지 가는 오류 - 예외처리   ( unchecked exception ) 
		//try {   
			for (int i=0 ; i<=6; i++)
			{
				arr[i]=(int)(Math.random()*45)+1;		
			}
		//}catch (Exception e) {System.out.println("오류 발생");}   //오류가 발생한 순간에 catch절로 빠진다
		
		for( int i=0; i<6; i++)
		{
			System.out.print(arr[i]+" ");
			
			try { 
				Thread.sleep(500);  // 예외처리를 하지 않으면 오류가 난다 ( checked exception ) 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
// try catch는 부분만 혹은 전체를 다 감쌀 수 있는 두가지 방법 있음
}
