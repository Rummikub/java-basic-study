package com.sist.common;

public class Function {
	/*
	 *  	네트워크 (CS)
	 *  		서버 => 클라이언트의 요청을 받아 처리
	 *  		클라 => 요청하고 응답받아 클라이언트 프로그램에 출력
	 *  
	 *  		1) 클라이언트마다 통신을 따로 만들어야 한다  => Thread이용
	 *  		2) 클라이언트 자체에서 처리 X => 항상 서버를 통해서 처리해야 공유가 된다
	 *  		3)  스트림을 이용한 프로그램
	 *  				====
	 *  				전송 => 바이트 스트림 => OutputStream
	 *  				수신 => 문자스트림 => BufferedReader
	 *  
	 */
  // LOGIN  
	public static final int LOGIN=100; // id=st.nextToken();   목록출력명령
	public static final int MYLOG=110; // 로그인 => 대기실로 변경
	
	// WAITROOM
	public static final int MAKEROOM=200; // 방정보 출력
	public static final int ROOMIN =210; // 방에 들어가라
	public static final int ROOMOUT=220;
	public static final int ROOMADD=230; // 다른 사람이 방에 들어갈 때
	public static final int MYROOMOUT=240; // 게임방에서 나가면 전환되는 화면
	public static final int WAITUPDATE=250; // 대기자 리스트 업데이트
	public static final int POSCHANGE=260; //대기실 > 게임방으로 전환
	public static final int WAITCHAT=270; //대기방 채팅
	public static final int ROOMCHAT=280;
	
	// 초대-강퇴
	public static final int KANG=300; // 강제 퇴장 시키기
	public static final int INVITE=310;
	public static final int INVITE_YES=320;
	public static final int INVITE_NO=330;
	
	//EXIT
	public static final int EXIT=900;
	public static final int MYEXIT=910;


	/*
	 * Server 
	 * Function.LOGIN => id | pw| sex| loc = waitVc저장
	 *
	 *	Client
	 * Function.LOGIN => id | pw| sex| loc = table에 출력
	 */
}
