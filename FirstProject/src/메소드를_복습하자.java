//public static ���� Ÿ��(�ڷ��� / VOID) �޼ҵ��() {
// �����ڵ� 
// return;  ==> void�� ��� return ����
//}
public class �޼ҵ带_�������� {
	public static void sum(int a) {
		int sum=0;
		for( int i=0; i<=a; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	public static void sum(int a, int b) {
		int sum=0;
		for( int i=a; i<=b ; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	public static void main(String[]args) {
		sum(15);
		sum(5,20);
	}
}
