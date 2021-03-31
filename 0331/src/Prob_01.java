import java.util.Scanner;
public class Prob_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수학,과학,영어 순으로 3개의 점수 입력");
		Grade me = new Grade();
		me.math = sc.nextInt();
		me.science = sc.nextInt();
		me.english = sc.nextInt();
		System.out.print("평균은"+me.average());
	}
}
class Grade{
	int math,science,english;
	
	public int average() {
		return (math+science+english)/3;
	}
}