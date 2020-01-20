package com.sist.server;
import java.util.*;
public class Room {
	String roomName, roomState, roomPw;
	int current,maxcount;   // 인원
	Vector<Server.Client> userVc=new Vector<Server.Client>();  // 방에 들어온 인원 user만 제어  innerclass갖다쓰려면 Server.~
	// 매개변수가 있는 생성자  Source > construct using field
	public Room(String roomName, String roomState, String roomPw, int maxcount) {

		this.roomName = roomName;
		this.roomState = roomState;
		this.roomPw = roomPw;
		this.maxcount = maxcount;
		
		current=1;  // 방을 만들면 현재인원이 1 이니까 =방장   userVc : 0
		
	}

}
