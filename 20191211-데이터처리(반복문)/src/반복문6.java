
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class �ݺ���6 {

	public static void main(String[] args) throws Exception {  						 // ����ó��
		// TODO Auto-generated method stub
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			//System.out.println(doc);
			Elements title=doc.select("td.info a.title");     // Elements= �±�
			Elements singer=doc.select("td.info a.artist");     // Elements= �±�
			int i=0;
			while(i<title.size())
			{
				System.out.println((i+1)+"."+title.get(i).text());
				System.out.println(singer.get(i).text());
				System.out.println("===========================");
				i++;
			}
			
			
	}

}
