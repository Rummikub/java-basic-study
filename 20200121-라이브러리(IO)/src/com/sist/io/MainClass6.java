package com.sist.io;
import java.io.*;
public class MainClass6 {
// 파일 복사   =======> 업로드!
	/*
									읽기 :  int read(), int read(byte[], off, len)
												=== 				  ===
												문자번호		읽은 바이트수
									쓰기 :  write(byte[]), write(String)
									닫기 : close()
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fis=
					new FileInputStream("c:\\image\\0.jpg");    // 다른 폴더에서 읽어와서 
			FileOutputStream fos=
					new FileOutputStream("c:\\oracle\\0.jpg");  // 빈 새로운 폴더에 복붙 ( upload )
		
			int i=0;// == 읽은 byte개수
			byte[] buffer=new byte[1024];   //  바이트를 하나씩이 아니라 통으로 묶어서 읽어오고 싶을 때
			while((i=fis.read(buffer, 0, 1024)) !=-1)   // buffer배열의 1024 끝까지! 
			{
					fos.write(buffer, 0  , i);  // ( 배열이름, 시작 ,끝)  0~i번째 ( 실제로 들어온 byte크기 까지 ) 
																											//	if 1024보다 한참 모자라면 null값이 입력됨 
			}
			fis.close();
			fos.close();
			
			System.out.println("파일 복사 완료");
		}catch(Exception ex) {}
	}

}
