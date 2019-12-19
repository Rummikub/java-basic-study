 // 실전문제
// 5개의 정수를 난수로 발생 후 등수를 출력하는 방법
import java.util.Scanner;
public class 배열10 {

	public static void main(String[] args) {
		int[]score= new int[5];
		int[] rank= new int[5];

		for(int i=0;i<5;i++)
		{
			score[i]=(int)(Math.random()*100)+1;
		}
		for(int i=0;i<5 ;i++)
		{
			rank[i]=1;
			for(int j=0; j<5;j++)
			{
				if(i==j)
					continue;
				if(score[i]<score[j])
				{
					rank[i]++;
				}
			}
		}

		for(int i=0; i<5; i++)
		{
			System.out.println(score[i]+"("+rank[i]+")");
		}


	}


		}



