//String  �޼ҵ忡 ���Ͽ�

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 *       <td class="check"><input type="checkbox" class="select-check" title="�ٽô� ������� �ʰ�, �̺��� �����ϱ� �Ⱦ�" /></td>
                                <td class="number">1
 */
public class �޼ҵ�2 {
	static String[] getMusicTitle() throws Exception    // ��ü�� �����´� ()
	{
		String[] list= new String[50];
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		Elements title=doc.select("td.info a.title");    // a tag = ��ũ �±�   td = ���� �±�
		
		for(int i=0; i<50;i++)
		{
			list[i]= title.get(i).text();
		}
		return list;
	}
	// 	1 | ���� | ������ | �ٹ� | 100    => String  (|) ���� �߶� ��� = split
	// ��ü�����͸� �����Ͷ� => 
	// 
	static String getMusicInfo(int no) throws Exception    // �Ѱ� �� ã�Ƽ� �����´� (int no) =�Ű����� ��
	{
		String res=""; 
		
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		Elements singer=doc.select("td.info a.artist");  
		Elements album=doc.select("td.info a.albumtitle");  		
		for(int i=0; i<50;i++)
		{
			if(i==(no-1))   // ���� �������� 0������ ������ �ƴϰ� 1�� ���� �����̱� ����
			{
				res=singer.get(i).text()+"|"+ album.get(i).text();
				break;
			}
		}
		return res;
	}
	/*
	 *    <a href="#" class="artist ellipsis" onclick="fnViewArtist('80277841');return false;">â�� (CHANGMO)</a>
                                        
                                        <div class="toggle-button-box" >
                                            <button type="button" class="btn artist-etc" onclick="fnRelationArtistList('89671631');">��</button>
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
		/*System.out.print("���� �Է�");
		String name=scan.next();
		for(String s: title)
		{
			if (s.contains(name))
			{
				System.out.println(s);
				}*/
	
			// $ . ^  |  &   ? => �� ��ü�� ���������� (\\) �������� �ΰ��� �����;���    or       StringTokenizer
			System.out.print("�� ��ȣ �Է� (1-50)");
			int no=scan.nextInt();
			String detail=getMusicInfo(no);
			String[] value=detail.split("\\|");
			System.out.println("������  "+value[0]);
			System.out.println("�ٹ�  "+value[1]);
			
		}
		
	}


