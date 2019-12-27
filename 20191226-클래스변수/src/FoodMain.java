import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

class Category{
		int cateno;			// cno
		String poster;
		String title;
		String subTitle;
		String link;
		
}

class Food{
		int cateno;
		int no;
		String[] poster=new String[4]; 
		String title;
		double score;
		String addr;
		String tel;
		String food;
		String price;
		String parking;
		String time;
		int good;
		int soso;
		int bad;
		/*
<div class="top_list_slide">
        <ul class="list-toplist-slider" style="width: 531px;">
		   <li>
              <img class="center-croping" alt="2020 제주 인기 맛집 TOP 60 사진"
                   data-lazy="https://mp-seoul-image-production-s3.mangoplate.com/keyword_search/meta/pictures/7zsdxmpu4kauzpk7.jpg?fit=around|600:400&amp;crop=600:400;*,*&amp;output-format=jpg&amp;output-quality=80"/>

              <a href="/top_lists/2264_jeju2020"
                 onclick="trackEvent('CLICK_TOPLIST', {&quot;section_position&quot;:0,&quot;section_title&quot;:&quot;믿고 보는 맛집 리스트&quot;,&quot;position&quot;:0,&quot;link_key&quot;:&quot;PQQTL_E&quot;});">
                <figure class="ls-item">
                 <figcaption class="info">
                    <div class="info_inner_wrap">
                      <span class="title">2020 제주 인기 맛집 TOP 60</span>
                      <p class="desc">"제주의 인기 맛집만 쏙쏙 골라 모았다!"</p>
                      
                   * HTML의 계층구조   
                      <div>
                      		<span> </span>
                      		<p></p>
                      	</div>
                      		<span></span>
                 
                      * 호출
                      <tag class = " ~" ===> attr ("class")
                      <t class> 우오오오<t>   ==> text("class")
                      
                      * a 태그 = 링크가 걸린 탭
		 */
}
public class FoodMain {
	Category[] foodCatetgoryData() throws Exception
	{
		Category[] cate=new Category[12];
		Document doc= Jsoup.connect("http://https//www.mangoplate.com").get();
		Elements poster= doc.select("ul.list-toplist-slider img.");
		Elements title= doc.select("div.info_inner_wrap span.title");
		Elements subTitle= doc.select("div.info_inner_wrap  p.desc");
		Elements link= doc.select("ul.list-toplist-slider a");
		for(int i=0; i<12;i++)
		{
			Category g=new Category();
			g.cateno=i+1;
			g.title=title.get(i).text();
			g.subTitle=subTitle.get(i).text();
			g.poster= poster.get(i).attr("data-lazy");
			g.link=link.get (i) .attr("href");
			cate[i]=g;   // 마지막에 저장하기 때문에 변수 1개로 12개 공간을 창출한다
		}
		return cate;
	}
public  static void main(String[] args) {
		// TODO Auto-generated method stub

		}
	}
/*  10000개의 레시피
 * class RecipeVO{
int cateno;
String [] intro= new String[6];

class Ingredients{
//ArrayList ingredients ~
String []tips =new String[4];
}

class Steps {
String recipe; 
String photo;

}

class Chef {
String [] chef =new String [6];
}*/

