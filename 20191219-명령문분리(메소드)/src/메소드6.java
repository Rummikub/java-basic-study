import java.util.Scanner;
//. return������ �޴� ���� :  �޼ҵ忡�� �߻���Ų ���������� ����� ����� ������� ������ �� ���� �ޱ� ����
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class �޼ҵ�6 {
	static  void siteData(String url) throws Exception
	{

		Document  doc= Jsoup.connect(url).get();   								//   �ٲ�� �ּҰ��� �Ű�����
		Elements link=doc.select("div.info_tit a.name_movie");
	
		int k=1;
		
		for(int i=0; i<link.size();i++)
		{
			try {
			//System.out.println(link.get(i).attr("href"));
			String link_data="https://movie.daum.net"+link.get(i).attr("href");
			System.out.println(link_data);  											// �����ּҸ� �� �־�� �����͸� ������ �� �ִ� (https://�� �������� ) 
			
			Document doc2=Jsoup.connect(link_data).get();
			/*
			 * <div class="subject_movie">
												<strong class="tit_movie">�ܿ�ձ� 2 (2019)</strong>         // �±׿� �±� ���� = �ؽ�Ʈ  
												<span class="txt_origin">Frozen II</span>
												<a href="/moviedb/grade?movieId=93004" class="raking_grade">
													<span class="bg_star star_grade"><span class="bg_star inner_star" style="width:74.15000081062317%">����</span></span> <!-- 116px�� 100%, % ��꿡�� width���� ����-->
													<em class="emph_grade">7.4
													<dd class="txt_main">�ִϸ��̼�/��庥ó/�ڹ̵�/��Ÿ��/������</dd>												
			*/
			Element title_kr=doc2.selectFirst("div.subject_movie strong.tit_movie");
			Element title_en=doc2.selectFirst("div.subject_movie span.txt_origin");
			Element score=doc2.selectFirst("a.raking_grade em.emph_grade");
			Element genre=doc2.select("dl.list_movie dd.txt_main").get(0);     // dd ��� �±��� ù��°
			Element regdate=doc2.select("dl.list_movie dd.txt_main").get(1);  // dd �±��� �ι�°
			Element grade=doc2.select("dl.list_movie dd").get(3);   	// dd
			Element director=doc2.select("dl.list_movie dd").get(4);
			Element actor=doc2.select("dl.list_movie dd").get(5);

				  System.out.println(title_kr.text());
				  System.out.println(title_en.text()); 
				  System.out.println(score.text());
				  System.out.println(genre.text());
				  System.out.println(regdate.text());
				  System.out.println(grade.text());
				  System.out.println(director.text());
				  System.out.println(actor.text());
				  System.out.println("==================================");
				  
			}catch(Exception ex) {}    		// try { catch(Exception ex) {}   }  == Error�� ��ŵ�ϰ� �Ѿ�� ���
		}	 		
	}
	static void process() throws Exception
	{
		Scanner scan=new Scanner (System.in);
		String[] url= { "https://movie.daum.net/premovie/released",
				"https://movie.daum.net/premovie/scheduled",
				"https://movie.daum.net/boxoffice/weekly",
				"https://movie.daum.net/boxoffice/monthly",
				"https://movie.daum.net/boxoffice/yearly"
				} ;
		
		while(true)
		{
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("1. ����� ��ȭ");
			System.out.println("2. �������� ��ȭ");
			System.out.println("3. �ڽ����ǽ�(�ְ�)");
			System.out.println("4.����");
			System.out.println("5. ����");
			System.out.println("6. ����");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		    System.out.print(" ����>");
		    int no=scan.nextInt();
		    if(no==6)
		    {
		    	System.out.println("EXIT");
		    	break;
		    }
		    siteData(url[no-1]);   // �迭�� 0���� ����
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		process();
	}
}
