// 알파벳 => 저장 => 대문자,소문자
public class 제어문_조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alpha='1';
		if(alpha>='A' && alpha<='Z')
			// 사이, 기간 ==>&&를 사용함이 옳다    65~120  / 35~90
			// 연산자 => char는 모든 연산이 되면 => 정수로 자동 형변환
			System.out.println(alpha+"는(은) 대문자입니다");
		//  이것이 대문자, 소문자 조건입니다
		else if(alpha>='a' && alpha<='z')
			System.out.println(alpha+"는(은) 소문자입니다");
		else
			System.out.println(alpha+"는(은) 알파벳이 아니다");
		// 이것이 다중 if
	}

}
