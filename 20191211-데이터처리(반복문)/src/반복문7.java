import  java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 반복문7 {

	public static void main(String[] args) throws Exception {  						 // 예외처리
		// TODO Auto-generated method stub
		int k=1;
		while(k<=4)
		{
				Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			//System.out.println(doc);
			Elements title=doc.select("td.info a.title");    
			Elements singer=doc.select("td.info a.artist");     

		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력: ");
		String fd=scan.next();
		
		
		int i=0;
		while(i<title.size())
		{
			String data= title.get(i).text();
			if(data.contains(fd))    ///  타이틀 안에 내가 입력한 단어가 있느냐
				System.out.println((i+1)+"."+data);
			System.out.println(singer.get(i).text());
			System.out.println("===========================");
			i++;	
		}
		
	}
		k++;
	}
}
