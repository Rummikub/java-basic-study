package com.sist.main;
import com.sist.board.Board;    // package를 불러올 때  import 써줘야 함.
public class MainClass {  // 메소드는 public으로 시작하고 ,   데이터는 private.
/*	접근지정어
 * 	public											(protected		default)						private 
 * 															같은 폴더(패키지)
 * 															=======
 * 															=> 상속 => 다른패키지도 접근가능(protected)
 * 	=-=-=-=-=-=-=--=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
 * 	모든 클래스
 */
		public static void main(String[]args) {  // JVM이 호출해서 실행해야 되니까 public 이 붙는다.
			Board b=new Board (1,"게시판","2020-01-02");
			b.boardList();
		}
}
 