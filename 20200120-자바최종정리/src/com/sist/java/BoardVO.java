package com.sist.java;
// 캡슐화
public class BoardVO {
	private int no;   // 게시물이 중복이 안되게 구분지어주는 변수
	private String name;
	private String subject;
	
	//외부와 접속이 가능
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

}
