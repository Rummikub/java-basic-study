package com.sist.io;
import java.io.*;
/*
 		File 속성 ==> File 입출력
 		====================================================
 					입력									출력
 				FileInputStream, FileOutputStream,     =영어, 그림 은 1byte
				FileReader,   		  FileWriter						= 한글은 2byte
 */
 import java.io.*;
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try
			{
				File file =new File("C:\\JavaDev\\javaStudy\\20200120-자바최종정리\\src\\com\\sist\\java\\MainClass.java");
				//FileInputStream fis=new FileInputStream(file);  //  file객체 생성 안하고 경로명만 줘도 됨
				FileReader fis=new FileReader(file);
				// 생성자 => 여러개의 생성자를 가지고 있을 수 있다(오버로딩)
				int i =0;// 값을 읽기=>int read() => ASCII를 읽어온다
				String data="";
				while((i=fis.read())!=-1)  										// -1 = EOF end of file 파일 전체 범위를 이렇게 지정한대
				{
					//System.out.print((char)i);  // i=65라면 A를 출력하게끔
					data+=String.valueOf((char)i);  // == 문자번호
				}
				System.out.println(data);
				
				fis.close(); // 끝나고 나면 꼭 파일을 닫아줘야 한다
				/*
				 * 		r:읽기
				 * 		w:쓰기
				 * 		a:추가
				 */
				File file2=new File("c:\\image\\data.txt");
				if(!file2.exists())
				{
					file2.createNewFile();    // 파일을 만들때 mkdir하는게 아니라 이처럼 만드는 것
				}
				/*
				 *  		TextArea => setText(), append()  = 덮어쓰기 / 덧붙이
				 */
				FileWriter fos=new FileWriter(file2,true);  // true주면 append 문구 * 덧붙이기, 추가의 개념
				fos.write(data);  // file2안에 20200120을 하나씩 넣음      ====> 쓰기모드 * 기존에 있는 내용을 지우고 덮어쓰기
				fos.close();
				System.out.println("파일쓰기 완료");
				/*
				 			클래스	
				 			=======
				 					1) 구성요소
				 							1.멤버변수 : ( 개별사용변수 instance (인스턴스) , 공통변수 static ( 정적변수)) 
				 															private int a;  => 저장공간을 생성 후에 저장
				 																								=========
				 																										new
				 															private static int b; ==> ,클래스 로더
				 															
				 															=>기본형, 클래스,배열==> 데이터형
				 																					========= 
				 																					사용자정의 데이터형
				 															==> 메소드 안에서만 사용하는 변수 : 지역변수
				 										========================================================
				 										멤버변수 : 자동 초기화
				 										지역변수 : 반드시 초기화
				 							2. 메소드= 선언만된 메소드( 추상메소드)=> 미완성된 클래스
				 													==============완성을 해서 사용 ( 추상클래스, 인터페이스)
				 													public void display();
				 												= 선언+구현 메소드
				 													public void display()
				 													{
				 																//구현부
				 													}
				 													=> 사용자의 요청값을 받아서 처리 결과를 보내준다
				 																==========                          ========
				 																매개변수											리턴형
				 																																	===
				 																																	1개만 사용
				 																																	= 경우의 수가 많은 경우 (int, String)
				 																																	= 데이터가 많다 (배열,클래스,컬렉션)
				 																=> 매개변수 3+ => 클래스로 묶어서 전송
				 																=> 메소드는 동기화 : 하나가 종료되고 다음것이 실행된다 
				 																		aaa();
				 																		bbb();
				 																		ccc();
				 																		(요구사항 분석 = 메소드)
				 																=>메소드는 주로 하는 역할은 클래스 끼리 통신 
				 																============================
				 																변경이 가능하고, 재사용이 가능
				 							3. 생성자 : 멤버변수의 초기화 = 멤버변수에 값을 대입
				 																									===============
				 																										1) File을 읽어 값을 대입
				 																										2) 제어문 사용
				 																										*** class의 블록은
				 																											class A
				 																											{
				 																											int a;
				 																											a=10; (X)
				 																											}
				 */
			}catch(Exception ex) {}
	}

}
