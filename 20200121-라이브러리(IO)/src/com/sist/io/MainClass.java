package com.sist.io;
/*
 			java.io(웹=> File) : 다운로드/ 업로드
 			============
 			입출력
 				= 메모리
 					Input : BufferedReader(new InputStreamReader(System.in))
 									=> 키보드에 입력값을 받는 경우
 					Output : System.out.println()
 			  = 파일
 			  		Input  : BufferedReader(new InputStreamReader(new FileInputStream("경로명")))
 			  		Output : FilesOutputStream, FileWriter 
 			  =네트워크
 			  		Input: BufferedReader(new InputSTreamReader(s.getOutputStream()))
 			  																													==========
 			  																													s=Socket
 			  	   Output: s.getOutputStream()
 			  	   =============================================================
 			  	   IO
 			  	   ==
 			  	   Input : 1byte => InputStream     , 2byte => Reader (한글)
 			  	   Output:  1byte => OutputStream     , 2byte =>Writer
 			  	   ======> .txt, .xml, .json(javascript 주로 사용 데이터파일)
 			  	   									============Web에서 주로 사용(데이터 추출 => 파싱)
 			  										.json  => React, Vue  => Ajax,RestController
 			  										
 			  		File 클래스
 			  		========= 파일은 폴더를 포함하고 있다
 			  		= 파일 ---------------> new File("C:\\JavaDev\\a.jpg")
 			  		= 디렉토리(폴더) --->  new File("C:\\JavaDev")
 			  																												cd = change directory
 */
import java.io.*;
/*
 				io, sql => 컴파일 예외처리가 반드시 필요함
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File  dir=new File("C:\\javaDev");
			File[] files=dir.listFiles();   //   => 파일을 전부 읽어온다
			for(File f:files)
			{
				if(f.isDirectory())// 폴더 => 파일의 존재유무 확인
				{
						System.out.println("["+f.getName()+"]");
				}
				else // 파일
				{
					System.out.println(f.getAbsolutePath());
				}
			}
		}catch (Exception ex) {}
	}

}
