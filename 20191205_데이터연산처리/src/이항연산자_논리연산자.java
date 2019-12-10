/*
 *  && => 직렬처리
 *  || => 병렬처리
 *  
 *  문법형식 
 *  (조건) && (조건)  -  범위에 포함 되었을 때 -- 맞을 때 \
 *   => score >=90 && score <=100
 *  (조건) | | (조건)  - 범위를 벗어났을 때 -- 맞지 않을 때 (오류 처리)
 *  
 *  id  와 pw
 *  id == "" && pwd =1234
 *  id !=""    ||      pwd ! =""      같지 않고 같지 않다면  
 *  ====================
 *  	 								&&			||
 *  ====================
 *  true true			true 		true	
 *  ====================
 *  t false					false		true
 *  ====================
 *  f		t						false		true
 *  ====================
 *  f		f						false    false
 *  ====================
 *  
 *     *** 효율적 연산
 *     && => 왼쪽이 거짓이면 오른쪽은 연산에서 제외
 *     |   |  => 왼쪽이 참이면 오른쪽은 연산에서 제외  
 */
public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 알파벳 저장 후에 소문자,대문자 구분
		char c='A';
		// 대문자면 소문자로 바꿔라
		// A(65)-a(97) ==> 차이 32
		char result= (c>='A' && c<='Z')?(char)(c+32):(char)(c-32);
		System.out.println(c+"는 "+ result);
		
	    
		

	}

}
