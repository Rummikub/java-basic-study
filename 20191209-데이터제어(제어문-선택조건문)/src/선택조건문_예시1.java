
public class 선택조건문_예시1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수=> 임의의 수 추출
		int score=(int)(Math.random()*101); //0 ~100
		// 						0.0~0.99 => 0.99*101 => 100..
		System.out.println(score);
		
		// 90 이상 , 80 이상, 70, 60 , 60이하 :  A,B,C,D,F
		
		if(score<60)
		{
		System.out.println("F입니다");
		}
		else
		{
				//  중첩 if => 이중 조건문\
				// if문 여러개를 사용했을 경우에는 조건에 맞는 모든 문장을 수행할 수 있다.
			if(score>=90 && score<=100)
			System.out.println("A입니다");
			if(score>=80&& score<90)
				System.out.println("B입니다");
			if(score>=70&& score<80)
				System.out.println("C입니다");
			if(score>=60&& score<70)
				System.out.println("D입니다");
		}  // 겹치는 구간이 있어서 출력하면 중복된다. 구간을 정해줘야 한다는 얘기
		// 세미콜론은 명령의 종결을 의미하니까 찍지마라.
		
	}

}
