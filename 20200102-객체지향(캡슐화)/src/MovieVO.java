// VO = 데이터형 클래스 => 캡슐화
/*
 *  		변수 = 읽기, 쓰기 -> 
백두산 (2019)
평점6.7/10
드라마/액션
2019.12.19 개봉
128분, 12세이상관람가
(감독) 이해준, 김병서
(주연) 이병헌, 하정우, 마동석, 전혜진, 수지
누적관객  6,789,642명
대한민국 관측 역사상 최대 규모의 백두산 폭발 발생.
갑작스러운 재난에 한반도는 순식간에 아비규환이 되고,
남과 북 모두를 집어삼킬 추가 폭발이 예측된다.

변수 초기화
		1) 생성자  = instance블록과 같은 역할을 하기 떄문에 생성자를 더 많이 쓴다
		----- 매번 호출해야하는 단점이 있다 / 불러올때 마다 데이터가 달라질 때 사용하기 좋다는 장점
		2) 초기화블록  : 생성자 없이 블록만 지정하는 것
		---- 한번에 저장
		3) setter   - 하나씩 저장 
		
		class A
		{
			int a;
			for(int i=0;i<10;i++)
			{
			a=i;
			}   										=> 오류 !! 클래스 블록 안에서 구현이 불가능하다.
			
			A(){
						for(int i=0;i<10;i++)
						{
						a=i;
						}
					}									=> OK
			
			
		}
 */
public class MovieVO {
	private String title;
	private double score;
	private String genre;
	private String regdate;
	private int time;
	private String grade;
	private String director;
	private String actor;
	private int boxOffice;
	private String story;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public int getBoxOffice() {
		return boxOffice;
	}
	public void setBoxOffice(int boxOffice) {
		this.boxOffice = boxOffice;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}

	
}
