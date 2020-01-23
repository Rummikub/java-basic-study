package com.sist.io;
/*
 		폴더   = 라이브러리 메소드 배우는 순간 매개변수랑 리턴형을 알아놔라
 		
 		1) 폴더에 있는 모든 파일읽기 =  listFiles  => 리턴형 : 	File[]    
 		2) 폴더 생성 : mkdir()  => void 
 		3)  폴더 삭제 : delete() => void 
 */
import java.io.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try
			{
			
			  File dir=new File("c:\\oracle"); 
			/*
			 * if(!dir.exists()) // 오라클이 존재하지 않는다면 폴더를 만들어라 { dir.mkdir();
			 * System.out.println("폴더생성완료");
			 * 
			 * }
			 */
			 if(dir.exists())
			 {
				 dir.delete();
			 }
			 System.out.println("oracle 삭제");
			}catch(Exception ex) {}
			
	}

}
