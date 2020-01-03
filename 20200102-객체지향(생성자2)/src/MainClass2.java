// 캡슐화 코딩
/*
 * 			1.  데이터의 초기화 
 * 					= 생성자   (재사용 x)
 * 					= setter	  (재사용 o)
 */
class Music{
		private int mno;
		private String title;
		private String singer;
	
		public int getMno() {
			return mno;
		}
		public void setMno(int mno) {
			this.mno = mno;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getSinger() {
			return singer;
		}
		public void setSinger(String singer) {
			this.singer = singer;
		}
		public Music (int mno, String title, String singer) {
			this.mno = mno;
			this.title = title;
			this.singer = singer;
		}
		
}
public class MainClass2 {

	public static void main(String[] args) {
			Music music=new Music(100,"나의 오랜 연인에게1","다비치1");
			// 저장
/*			music.setMno(100);
			music.setTitle("나의 오랜 연인에게");
			music.setSinger("다비치");*/
			
			//읽기
			System.out.println(music.getMno());
			System.out.println(music.getTitle());
			System.out.println(music.getSinger());
			
	}

}
