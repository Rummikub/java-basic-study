// String 을 메소드로 호출하는 방법 
public class 메소드4 {
	static String[] recipeData() {
		String[] data = { "버섯으로 관자 느낌 내는 방법! 새송이버섯간장버터구이 만들기", "완전맛있는 차돌박이찜! 미소된장마요소스도 함께~",
				"고기처럼 쫄깃한 밥도둑 반찬 '새송이버섯 간장버터구이'레시피", "초간단 머그컵 퐁당 오 쇼콜라*.*", "새우요리 갈릭마요새우~ 요거 완전 맛있지~",
				"해물찜처럼 맛있는 백종원 소시지콩나물찜", "단짠단짠의 대패덮밥", "부타동 : 일본식 돼지고기 덮밥 간단한 점심 메뉴로 굿!", "담백한 새우연두부달걀탕",
				"치킨너겟으로 간편하게 간장치킨 만들기" };
		return data;
	}
	  static String maxLengthName() // 가장 긴 애 출력하는 메소드 생성
	  
	  {
		  String res="";
		  // 결과 선언
		  String[] data= recipeData(); 
		  // 배열 선언 
		  int max=0;
		  //선언
	  
	  for(int i=0; i<data.length;i++) { if (max<data[i].length())
	  max=data[i].length(); } for (String s: data) { if(s.length()==max) { res=s;
	  break; } } return res;
	  
	  }
	 
	static String minLengthName() {
		String res = "";
		// 결과 선언
		String[] data = recipeData();
		// 배열 선언
		int min = data[0].length(); // min을 구하려면 이렇게 써야 나온다.
		// 선언

		for (int i = 0; i < data.length; i++) {
			if (min > data[i].length())
				min = data[i].length();
		}
		for (String s : data) {
			if (s.length() == min) {
				res = s;
				break;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data = recipeData();
		for (String s : data) {
			System.out.println(s);
		}
		System.out.println("=========== 가장 긴 레시피명 출력 =====");
		System.out.println(maxLengthName());
		System.out.println("=========== 가장 짧은 레시피명 출력 =====");
		System.out.println(minLengthName());
	}

}
