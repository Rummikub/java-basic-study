package com.sist.server;
import java.util.*;
public class Room {
	String roomName, roomState, roomPw;
	int current,maxcount;   // �ο�
	Vector<Server.Client> userVc=new Vector<Server.Client>();  // �濡 ���� �ο� user�� ����  innerclass���پ����� Server.~
	// �Ű������� �ִ� ������  Source > construct using field
	public Room(String roomName, String roomState, String roomPw, int maxcount) {

		this.roomName = roomName;
		this.roomState = roomState;
		this.roomPw = roomPw;
		this.maxcount = maxcount;
		
		current=1;  // ���� ����� �����ο��� 1 �̴ϱ� =����   userVc : 0
		
	}

}
