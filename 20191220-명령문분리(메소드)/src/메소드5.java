// 메소드4를 구조화 해보자
public class 메소드5 {
//처리? 입력?
static int [] random ()
		{
			int[] com =new int[6];
			int su=0;
			boolean bCheck=false;
			for(int i=0; i<6; i++)
			{
				bCheck=true;
				while(bCheck)
				{
					su= com[i]=(int)(Math.random()*45)+1;     // Mathrandom > *45 = 0.0~0.99 = 44.9999999 > int > +1
					bCheck=false;
					for(int j=0;j<i;j++)
					{
						if(com[j]==su)
						{
							bCheck=true;
							break;
						}
					}
				}
				com[i]=su;
			}
			return com;		// 결과값
		}
//출력
static void print(int[] com)
{
		for(int i: com)  // index가 아닌data를 갖고 오는 것  , 저장된 데이터 한개씩 읽어온다 (for~each)
	{
		System.out.print(i+ " ");
	}
}
// 조립
static void process()
{
	int[] com= random();
	print(com);
}
	public static void main(String[] args) {
		process();
	}

}
