// VO = �������� Ŭ���� => ĸ��ȭ
/*
 *  		���� = �б�, ���� -> 
��λ� (2019)
����6.7/10
���/�׼�
2019.12.19 ����
128��, 12���̻������
(����) ������, �躴��
(�ֿ�) �̺���, ������, ������, ������, ����
��������  6,789,642��
���ѹα� ���� ����� �ִ� �Ը��� ��λ� ���� �߻�.
���۽����� �糭�� �ѹݵ��� ���İ��� �ƺ��ȯ�� �ǰ�,
���� �� ��θ� �����ų �߰� ������ �����ȴ�.

���� �ʱ�ȭ
		1) ������  = instance��ϰ� ���� ������ �ϱ� ������ �����ڸ� �� ���� ����
		----- �Ź� ȣ���ؾ��ϴ� ������ �ִ� / �ҷ��ö� ���� �����Ͱ� �޶��� �� ����ϱ� ���ٴ� ����
		2) �ʱ�ȭ���  : ������ ���� ��ϸ� �����ϴ� ��
		---- �ѹ��� ����
		3) setter   - �ϳ��� ���� 
		
		class A
		{
			int a;
			for(int i=0;i<10;i++)
			{
			a=i;
			}   										=> ���� !! Ŭ���� ��� �ȿ��� ������ �Ұ����ϴ�.
			
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
