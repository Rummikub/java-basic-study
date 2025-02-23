import java.util.Scanner;
//. return형으로 받는 이유 :  메소드에서 발생시킨 지역변수는 블록을 벗어나면 사라지기 때문에 그 값을 받기 위함
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 메소드6 {
	static  void siteData(String url) throws Exception
	{

		Document  doc= Jsoup.connect(url).get();   								//   바뀌는 주소값이 매개변수
		Elements link=doc.select("div.info_tit a.name_movie");
	
		int k=1;
		
		for(int i=0; i<link.size();i++)
		{
			try {
			//System.out.println(link.get(i).attr("href"));
			String link_data="https://movie.daum.net"+link.get(i).attr("href");
			System.out.println(link_data);  											// 서버주소를 꼭 넣어야 데이터를 가져올 수 있다 (https://는 생략가능 ) 
			
			Document doc2=Jsoup.connect(link_data).get();
			/*
			 * <div class="subject_movie">
												<strong class="tit_movie">겨울왕국 2 (2019)</strong>         // 태그와 태그 사이 = 텍스트  
												<span class="txt_origin">Frozen II</span>
												<a href="/moviedb/grade?movieId=93004" class="raking_grade">
													<span class="bg_star star_grade"><span class="bg_star inner_star" style="width:74.15000081062317%">평점</span></span> <!-- 116px이 100%, % 계산에서 width값에 적용-->
													<em class="emph_grade">7.4
													<dd class="txt_main">애니메이션/어드벤처/코미디/판타지/뮤지컬</dd>												
			*/
			Element title_kr=doc2.selectFirst("div.subject_movie strong.tit_movie");
			Element title_en=doc2.selectFirst("div.subject_movie span.txt_origin");
			Element score=doc2.selectFirst("a.raking_grade em.emph_grade");
			Element genre=doc2.select("dl.list_movie dd.txt_main").get(0);     // dd 라는 태그의 첫번째
			Element regdate=doc2.select("dl.list_movie dd.txt_main").get(1);  // dd 태그의 두번째
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
				  
			}catch(Exception ex) {}    		// try { catch(Exception ex) {}   }  == Error를 스킵하고 넘어가는 방법
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
			System.out.println("1. 현재상영 영화");
			System.out.println("2. 개봉예정 영화");
			System.out.println("3. 박스오피스(주간)");
			System.out.println("4.월간");
			System.out.println("5. 연간");
			System.out.println("6. 종료");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		    System.out.print(" 선택>");
		    int no=scan.nextInt();
		    if(no==6)
		    {
		    	System.out.println("EXIT");
		    	break;
		    }
		    siteData(url[no-1]);   // 배열은 0부터 시작
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		process();
	}
}
