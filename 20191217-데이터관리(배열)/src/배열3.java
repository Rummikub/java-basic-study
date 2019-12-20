import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*\
 *	</div>
							</div>
							<div class="wrap_movie">
								<div class="info_tit">
																			<em class="ico_movie ico_allrating">전체관람가</em>
																		<a href="/moviedb/main?movieId=93004" class="name_movie #title">겨울왕국 2</a>
								</div>
								
 */
public class 배열3 {

	public static void main(String[] args)  throws Exception {				// 예외 처리 = 문제가 발생해도 프로그램 종료 안하게 해줌
		// TODO Auto-generated method stub
		MOVIE [] m=new MOVIE[20];
		Document  doc= Jsoup.connect("https://movie.daum.net/premovie/released").get();
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
			
				
				  System.out.println("count: "+(k)); System.out.println(title_kr.text());
				  System.out.println(title_en.text()); System.out.println(score.text());
				  System.out.println(genre.text()); System.out.println(regdate.text());
				  System.out.println(grade.text()); System.out.println(director.text());
				  System.out.println(actor.text());
				  System.out.println("==================================");
				 
			
			m[i]=new MOVIE();    // 클래스를 저장하는 법   ( new 에다가 null을 출력 안하게 하려고 주소값을 주고 있는 것!)
			m[i].title_kr=title_kr.text();
			m[i].title_en=title_en.text();
			m[i].score=Double.parseDouble(score.text());   // strind으로 받을 값을 double로 변경
			m[i].grade=grade.text();
			m[i].genre=genre.text();
			m[i].regdate=regdate.text();
			m[i].director= director.text();
			m[i].actor= actor.text();
			
			k++;
			}catch(Exception ex) {k--;}    		// try { catch(Exception ex) {}   }  == Error를 스킵하고 넘어가는 방법
			}
		/*
		 * Scanner scan=new Scanner(System.in); System.out.print("영화번호 선택 (0~15):  ");
		 * int index=scan.nextInt(); System.out.println("------- 결과 ----------");
		 * System.out.println("제목 : "+m[index].title_kr);
		 * System.out.println("감독 : "+m[index].director);
		 * System.out.println("출연 : "+m[index].actor);
		 * System.out.println("개봉일 : "+m[index].regdate);
		 * System.out.println("장르 : "+m[index].genre);
		 */
		double max=0.0;   // 이렇게 놔야 풀린다.
		for(int i=0;i<16;i++)
		{
			if(m[i]!=null) 											  // null  값, 아무것도 안써있는 것 뺀다  같은 점수를 갖고있는 경우도 있어서...?
			if(max<m[i].score)
			{
				max=m[i].score;
			}
		}
		 for(int i=0;i<m.length;i++)
		 {
			 if (m[i]!=null)
			 { 
				 if(m[i].score==max)
				 {
					 System.out.println(m[i].title_kr);
				 }
			 }
		 }
		//System.out.println("평점이 가장 높은 영화: "+max);
				
	}

}
