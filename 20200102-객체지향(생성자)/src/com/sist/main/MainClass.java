package com.sist.main;
import com.sist.board.Board;    // package�� �ҷ��� ��  import ����� ��.
public class MainClass {  // �޼ҵ�� public���� �����ϰ� ,   �����ʹ� private.
/*	����������
 * 	public											(protected		default)						private 
 * 															���� ����(��Ű��)
 * 															=======
 * 															=> ��� => �ٸ���Ű���� ���ٰ���(protected)
 * 	=-=-=-=-=-=-=--=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
 * 	��� Ŭ����
 */
		public static void main(String[]args) {  // JVM�� ȣ���ؼ� �����ؾ� �Ǵϱ� public �� �ٴ´�.
			Board b=new Board (1,"�Խ���","2020-01-02");
			b.boardList();
		}
}
 