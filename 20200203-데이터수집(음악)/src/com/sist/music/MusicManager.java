package com.sist.music;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


//DAO,VO다 구축하고 나서 데이터를 가져올 준비를 하는 클래스
public class MusicManager {
	public ArrayList <MusicVO> musicListData()
	{
		ArrayList<MusicVO> list=new ArrayList<MusicVO>();
		try
		{
		/*
		 * private String title;
		private String singer;
		private String album;
		private String poster;
		private int idcrement;
		private String state;
		private String key; 	
		 */
		
			// 매일 새로운 정보 가져오게 하는 코딩
			Date date=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
			System.out.println(sdf.format(date));        // 날짜가 잘 나오고 있는지 확인해보자
			int rank=1 ;      // 랭크 ~ 상태를 분리하려 사용
			// 하나 긁어올 때 마다 하나씩 저장해보자 ( 오라클저장속도가 너무 빨라서 커넥션에 문제가 생긴듯!)
			MusicDAO dao=new MusicDAO();
			for(int i=1;i<=4;i++)
			{ 
				try {
					Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd="+sdf.format(date)+"&hh=12&rtm=Y&pg="+i).get();  // 이 주소에 들어가서 값을 가져와라
					//System.out.println(doc.toString());  // HTML 소스 불러오기
					/*
					 * <tr class="list">
					 * </tr>  -- 0
					 * <tr class="list">
					 * </tr>  -- 1
					 */
					Elements title=doc.select("tr.list td.info a.title");
					Elements singer=doc.select("tr.list td.info a.artist");
					Elements album=doc.select("tr.list td.info a.albumtitle");
					Elements poster=doc.select("tr.list td a.cover img");
					Elements temp=doc.select("tr.list span.rank");
					
					for(int j=0; j<title.size();j++)
					{
						System.out.println("순위: "+rank);
						System.out.println("제목: "+title.get(j).text());
						System.out.println("가수: "+singer.get(j).text());
						System.out.println("앨범: "+album.get(j).text());
						System.out.println("이미지: "+poster.get(j).attr("src"));
						//System.out.println("기타: "+temp.get(j).text());
						String s=temp.get(j).text();
						String idcrement="";
						String state=""; 
						/*rank-none>< -- 유지됨
							rank-up>3<  -- 3등 올라감
							rank-down>4< -- 4등 내려감
						*/
	
						//20하강
						String ss=s.replaceAll("[^가-힣]", "");  //한글정규식을 제외하고 공백으로 바꿔라 = 숫자를 지워라
						if(ss.equals("상승"))
						{
							idcrement=s.replaceAll("[^0-9]", "");  //숫자를 제외하고 공백으로 바꿔라
							state=ss;
						}else if(ss.equals("하강"))
						{
							idcrement=s.replaceAll("[^0-9]", "");
							state=ss;
						}else
						{
							idcrement="0";
							state="유지";
						}
						System.out.println("등폭: "+state);
						System.out.println("변경값: "+idcrement);
						System.out.println("동영상 키: "+youtubeKeyData(title.get(j).text()));
						System.out.println("==========================");
						MusicVO vo=new MusicVO();
						vo.setRank(rank);
						vo.setTitle(title.get(j).text());
						vo.setSinger(singer.get(j).text());
						vo.setAlbum(album.get(j).text());
						vo.setPoster(poster.get(j).attr("src"));
						vo.setState(state);
						vo.setIdcrement(Integer.parseInt(idcrement));
						vo.setKey(youtubeKeyData(title.get(j).text()));
						
						dao.musicInsert(vo);
						list.add(vo);
						rank++;   // 50씩 4바퀴 돌아야 됨
					}
			//		Elements idcrement=doc.select("tr.list td.info a.title");
			//		Elements state=doc.select("tr.list td.info a.title");
				}catch( Exception ex) {}
			}
			
		}catch(Exception ex) {}
		return list;
	}
	//YouTUbe에서 뭘 가져온다
	public String youtubeKeyData(String title)
	{
		String key="";
		try 
		{
			//  / watch?v=wpUiN5hBnyc
			Document doc=Jsoup.connect("https://www.youtube.com/results?search_query="+title).get();
			Pattern p=Pattern.compile("/watch\\?v=[^가-힣]+")  ;  // 기호가 나올때는 역슬러쉬 2개 붙여야 된다  $ ^ . ?   |  
			Matcher m=p.matcher(doc.toString());
			//찾기
			while(m.find())
			{
				String temp=m.group();
				key=temp.substring(temp.indexOf("=")+1,temp.indexOf("\""));
				break;
				//System.out.println(temp);
			}
		}catch (Exception ex){}
		return key;
	}
	public static void main(String args[])
	{
		MusicManager m=new MusicManager();
		MusicDAO dao=new MusicDAO();
		ArrayList<MusicVO> list =m.musicListData();
		/*
		 * for(MusicVO vo:list) { dao.musicInsert(vo); }
		 */
		System.out.println("Oracle save  data End....");
	}
}
