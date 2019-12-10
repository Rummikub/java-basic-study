package 데이터저장;
/*
 *  이름, 국어, 영어, 수학 점수를 저장한 후 
 *  이름,국어,영어,수학,총점,평균을 출력
 */
public class 변수문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 데이터 저장
		String name=" 아무개";
	   int kor = 89,eng= 90 , math= 100;
		// 처리
	   //출력
		System.out.print("이름: "+name+"\n");
		System.out.print("국어: "+kor);
		System.out.print("영어: "+eng);
		System.out.print("수학: "+math);
		System.out.print("총점: "+(kor+eng+math));
		// 정수/정수 = 정수     실수/정수 = 소수점 이하까지 알려준다  printf = 소수점 부여해줌 print = 일렬로 출력 + "\n" = println
		// printf ( %.Nf, ())   소수점 N째 자리까지 
		System.out.printf("평균:%.2f",(kor+eng+math)/3.0);
	}

}
