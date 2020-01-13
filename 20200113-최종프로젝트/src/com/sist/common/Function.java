package com.sist.common;

public class Function {
	
  // LOGIN
	public static final int LOGIN=100; // id=st.nextToken();
	public static final int MYLOG=110;

//AVATAR
	public static final int MYAVATAR=200;	
	
//WAITROOM 
	public static final int MAKEROOM=300;
	public static final int ROOMLISTUPDATE=310;
	public static final int USERLISTUPDATE=320;
	public static final int ROOMEXIT=330;
	public static final int WAITUPDATE =340;
	public static final int MYCHAT=350;
	public static final int CHATHISTORYUPDATE =360;

// STARTROOM
	public static final int GAMESTART =400;

	
//GAMEROOM
	
	/*
	 * Server 
	 * Function.LOGIN => id | pw| sex| loc = waitVc저장
	 *
	 *	Client
	 * Function.LOGIN => id | pw| sex| loc = table에 출력
	 */
}
