//String  메소드에 대하여

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 *       <td class="check"><input type="checkbox" class="select-check" title="다시는 사랑하지 않고, 이별에 아파하기 싫어" /></td>
                                <td class="number">1
 */
public class 메소드2 {
	static String[] getMusicTitle() throws Exception    // 전체를 가져온다 ()
	{
		String[] list= new String[50];
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		Elements title=doc.select("td.info a.title");    // a tag = 링크 태그   td = 제목 태그
		
		for(int i=0; i<50;i++)
		{
			list[i]= title.get(i).text();
		}
		return list;
	}
	// 	1 | 제목 | 가수명 | 앨범 | 100    => String  (|) 별로 잘라서 출력 = split
	// 전체데이터를 가져와랏 => 
	// 
	static String getMusicInfo(int no) throws Exception    // 한개 만 찾아서 가져온다 (int no) =매개변수 必
	{
		String res=""; 
		
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		Elements singer=doc.select("td.info a.artist");  
		Elements album=doc.select("td.info a.albumtitle");  		
		for(int i=0; i<50;i++)
		{
			if(i==(no-1))   // 지니 뮤직에는 0번부터 시작이 아니고 1번 부터 시작이기 때문
			{
				res=singer.get(i).text()+"|"+ album.get(i).text();
				break;
			}
		}
		return res;
	}
	/*
	 *    <a href="#" class="artist ellipsis" onclick="fnViewArtist('80277841');return false;">창모 (CHANGMO)</a>
                                        
                                        <div class="toggle-button-box" >
                                            <button type="button" class="btn artist-etc" onclick="fnRelationArtistList('89671631');">외</button>
                                            <ul class="list" id="RelationArtist_89671631"></ul>
	 */
	public static void main(String[] args) throws Exception{ 
		// TODO Auto-generated method stub
		String [] title=getMusicTitle();
		System.out.println("======= top 50 =======");
		for(String s:title)
		{
			System.out.println(s);
		}
		System.out.println("=======================");
		
	Scanner scan= new Scanner(System.in);
		/*System.out.print("제목 입력");
		String name=scan.next();
		for(String s: title)
		{
			if (s.contains(name))
			{
				System.out.println(s);
				}*/
	
			// $ . ^  |  &   ? => 이 자체를 가져오려면 (\\) 역슬래쉬 두개를 가져와야함    or       StringTokenizer
			System.out.print("상세 번호 입력 (1-50)");
			int no=scan.nextInt();
			String detail=getMusicInfo(no);
			String[] value=detail.split("\\|");
			System.out.println("가수명  "+value[0]);
			System.out.println("앨범  "+value[1]);
			
		}
		
	}


