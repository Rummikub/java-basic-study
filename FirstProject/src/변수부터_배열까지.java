
/*
 * public class 변수부터_배열까지 {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 */
		/*
		 * 1.if(x>=10 && x<=20) 2. if(!(ch == "   " && ch == "\t")) 3. if ( ch2 == 'x'
		 * || ch2== 'X') 4. if(char>= '0' && char<='9') 5. if((ch4>='A' && ch4<='Z') ||
		 * ( ch4>= 'a' && ch4 <='z') 6.if((year%400==0)||(year%4==0)&&(year%100!=0)) 7.
		 * 삼항연산자 (powerOn==false)? true:false 8. String str="no"; if(str.equals("yes")
		 */

		// 4-2

		/*
		 * int sum=0; //초기값 for (i=1; i<=20; i++) { if(!(i%2==0 || i%3==0)) {
		 * 
		 * System.out.print(i+"  "); sum+=i; // 1+5+... } }
		 * System.out.println("\n"+"sum="+sum);
		 * 
		 * 
		 * 
		 * 
		 * // 4-3
		 * 
		 * for(int i=1;i<=10;i++) { for(int j=1; j<=i; j++) // 1+ 1+2+ 1+2+3 ... {
		 * System.out.println(j+" "); sum+=j; } System.out.println(); }
		 * System.out.println("sum: "+sum);
		 * 
		 * 
		 * //4-4
		 * 
		 * sum=0; int i=1; for (;;) {
		 * 
		 * if(i%2==0) sum-=i; else sum+=i; if(sum>100) break;
		 * 
		 * } System.out.println(sum);
		 * 
		 * // 4-5 1 2 4 for(초;조;증) 실행문장; 3
		 * 
		 * 초 while(조) {실행문장; 증가식 }
		 * 
		 * int i2=0; while(i2<=10) { int j=0; while (i<=10) { System.out.print("*");
		 * j++; } System.out.println(); i++; }
		 */

/*		// 4-6 양 면의 합이 6
		int i=0;
		for (inti = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 6) {
					System.out.println("(" + i + ",", +j + ")");
				}
			}
		}
		// 4-14

		// 5-3
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum3 = 0;

		for (int k : arr) {
			sum += k;
		}
		System.out.println(sum);
	}
*/
/*}*/
