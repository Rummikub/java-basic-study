
public class 반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck=false;
		while(true)
		{
			bCheck=!bCheck;
			if(bCheck==true)
			{
				System.out.println("본인차례");
			}
			else																							//turn
			{
				System.out.println("컴퓨터차례");
			}

		}
	}

}
