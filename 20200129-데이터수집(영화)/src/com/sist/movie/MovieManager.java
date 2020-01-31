package com.sist.movie;
// ������ �а� xml �Ľ��� ��
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/*
 *  <div class="aaa"> 
 *   		<p> aaa </p>    ====> div.aaa p  , ��ũ����. �±׸�
 *   </div>
 *   
 *   (Element = ���� ���� ������ tag�� �� VO)  �� = Elements �� ArrayList  ���� tag�� ���� �ִ�
 *   
   	<div class="wrap_movie">
			<div class="info_tit">
			====			========
														<em class="ico_movie ico_15rating">15���̻������</em>
													<a href="/moviedb/main?movieId=122091" class="name_movie #title">������ �����</a>
 													===
 													div.info_tit em ==> �������
 													div.wrap_movie span.info_state       ==> ������
 		try
 		{
			 		 for(;;;;)
			 		 {
						 		 try
						 		 {
						 		 
						 		 }catch   // ���ܰ� �ִ��� ���� ���� �� �� �������� for �ȿ� try catch�� ����Ѵ�
			 		 }
 		 }catch 
 		 											
 													
 */
public class MovieManager {
	
	public ArrayList<MovieVO> movieListData()   
	
	{
	
		ArrayList<MovieVO> list=new ArrayList<MovieVO>();
		
		try {
			MovieDAO dao=new MovieDAO();
			//for(int i=1;i<=3;i++) // 3page , 6page --> URL, ��������, �ѹ����� �ٲٸ� �� ���� ���� �� �ִ�
				
			{	
				
					Document doc=Jsoup.connect("https://movie.daum.net/boxoffice/yearly").get(); 		  // Ctrl+enter�� path����ֱ�!
					Elements link=doc.select("div.info_tit a");		  // tag�� �����´�   ~ for �� �������� pl.
					for(int j=0;j<link.size();j++)
					{
						
						try
						{
						Element elem=link.get(j);  // link�� �����´�
						//      System.out.println(i+"-"+elem.attr("href"));        				 //    ~~    attribute = ��ũ  text= '������ �����'
						String mLink="http://movie.daum.net"+elem.attr("href");
						Document doc2=Jsoup.connect(mLink).get();  						// ��ũ Ÿ�� �󼼺���� ���� ����
						
						//�󼼺���, ���� tag�����Ƿ� singular
					   //  System.out.println(doc2);
						
					  Element title=doc2.select("div.subject_movie strong.tit_movie").get(0);   
					  System.out.println(title.text());
					  
					  Element score=doc2.selectFirst("div.subject_movie em.emph_grade");// 1st �±װ��� �޾ƿ��ڴ� 
					  System.out.println(score.text());
					 
					  Element genre=doc2.select("dl.list_movie dd.txt_main").get(0); // ���� �±��� 0��°�� �޾ƿ�
					  System.out.println(genre.text());
					  
					  Element regdate=doc2.select("dl.list_movie dd.txt_main").get(1); 
					  System.out.println(regdate.text());
					  
					  Element time=doc2.select("dl.list_movie  dd").get(3); // dd�� 3��° 
					//  System.out.println(time.text());
					  
					  String temp=time.text();   // time �̶� grade�� ���ٿ� ��µǴϱ� ,�� �߶� ���
					  StringTokenizer st=new StringTokenizer(temp,",");
					  String strTime=st.nextToken();
					  String strGrade=st.nextToken().trim(); // ���� �߶������
					  
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
			System.out.println("DataBase Insert End........"); // DB�� �־��ִ� ������ ����Ǿ���
		}catch(Exception ex) {}
		
		return list; // �޼ҵ�ϱ� ������ ��
	
	}

				
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieManager m=new MovieManager();
		m.movieListData();
	}

}
