import java.util.Scanner;
public class Prob_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����,����,���� ������ 3���� ���� �Է�");
		Grade me = new Grade();
		me.math = sc.nextInt();
		me.science = sc.nextInt();
		me.english = sc.nextInt();
		System.out.print("�����"+me.average());
	}
}
class Grade{
	int math,science,english;
	
	public int average() {
		return (math+science+english)/3;
	}
}