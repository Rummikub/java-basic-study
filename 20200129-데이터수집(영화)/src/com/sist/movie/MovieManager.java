package com.sist.movie;
// 파일을 읽고 xml 파싱할 때
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/*
 *  <div class="aaa"> 
 *   		<p> aaa </p>    ====> div.aaa p  , 마크업명. 태그명
 *   </div>
 *   
 *   (Element = 내가 가져 오려는 tag명 ≒ VO)  합 = Elements ≒ ArrayList  같은 tag를 갖고 있다
 *   
   	<div class="wrap_movie">
			<div class="info_tit">
			====			========
														<em class="ico_movie ico_15rating">15세이상관람가</em>
													<a href="/moviedb/main?movieId=122091" class="name_movie #title">남산의 부장들</a>
 													===
 													div.info_tit em ==> 관람등급
 													div.wrap_movie span.info_state       ==> 예매율
 		try
 		{
			 		 for(;;;;)
			 		 {
						 		 try
						 		 {
						 		 
						 		 }catch   // 예외가 있더라도 정상 수행 할 수 있으려면 for 안에 try catch를 줘야한다
			 		 }
 		 }catch 
 		 											
 													
 */
public class MovieManager {
	
	public ArrayList<MovieVO> movieListData()   
	
	{
	
		ArrayList<MovieVO> list=new ArrayList<MovieVO>();
		
		try {
			MovieDAO dao=new MovieDAO();
			//for(int i=1;i<=3;i++) // 3page , 6page --> URL, 페이지수, 넘버링만 바꾸면 탭 새로 만들 수 있다
				
			{	
				
					Document doc=Jsoup.connect("https://movie.daum.net/boxoffice/yearly").get(); 		  // Ctrl+enter로 path잡아주기!
					Elements link=doc.select("div.info_tit a");		  // tag를 가져온다   ~ for 문 돌리려면 pl.
					for(int j=0;j<link.size();j++)
					{
						
						try
						{
						Element elem=link.get(j);  // link를 가져온다
						//      System.out.println(i+"-"+elem.attr("href"));        				 //    ~~    attribute = 링크  text= '남산의 부장들'
						String mLink="http://movie.daum.net"+elem.attr("href");
						Document doc2=Jsoup.connect(mLink).get();  						// 링크 타고 상세보기로 가기 위함
						
						//상세보기, 같은 tag없으므로 singular
					   //  System.out.println(doc2);
						
					  Element title=doc2.select("div.subject_movie strong.tit_movie").get(0);   
					  System.out.println(title.text());
					  
					  Element score=doc2.selectFirst("div.subject_movie em.emph_grade");// 1st 태그값을 받아오겠다 
					  System.out.println(score.text());
					 
					  Element genre=doc2.select("dl.list_movie dd.txt_main").get(0); // 같은 태그의 0번째를 받아옴
					  System.out.println(genre.text());
					  
					  Element regdate=doc2.select("dl.list_movie dd.txt_main").get(1); 
					  System.out.println(regdate.text());
					  
					  Element time=doc2.select("dl.list_movie  dd").get(3); // dd의 3번째 
					//  System.out.println(time.text());
					  
					  String temp=time.text();   // time 이랑 grade가 한줄에 출력되니까 ,로 잘라서 출력
					  StringTokenizer st=new StringTokenizer(temp,",");
					  String strTime=st.nextToken();
					  String strGrade=st.nextToken().trim(); // 공백 잘라버리기
					  
					  System.out.println(strTime);
					  System.out.println(strGrade);
					 
					  Element director=doc2.select("dl.list_movie dd.type_ellipsis").get(0); 
					  System.out.println(director.text());	
					  
					  Element actor=doc2.select("dl.list_movie dd.type_ellipsis").get(1); 
					  System.out.println(actor.text());			
					  
					 Element story=doc2.selectFirst("div.desc_movie p");
					 System.out.println(story.text());
					 
					 MovieVO vo=new MovieVO();
					 vo.setTitle(title.text());
					 vo.setScore(Double.parseDouble(score.text()));
					 vo.setGrade(strGrade);
					 vo.setTime(strTime);
					 vo.setActor(actor.text());
					 vo.setDirector(director.text());
					 vo.setGenre(genre.text());
					 vo.setRegdate(regdate.text());
					 vo.setStory(story.text());
					 
					 dao.movieInsert(vo);
					}catch (Exception ex) {}
						
				}
					
			}
			System.out.println("DataBase Insert End........"); // DB에 넣어주는 행위가 종료되었다
		}catch(Exception ex) {}
		
		return list; // 메소드니까 리턴형 必
	
	}

				
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieManager m=new MovieManager();
		m.movieListData();
	}

}
