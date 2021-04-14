import java.util.Random;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		System.out.println("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지): ");
		Scanner sc  = new Scanner(System.in); // 스캐너생성
		int num = sc.nextInt();
		int diff=0;
		int[]arr = new int[10];
		
		for(int i=0; i<10; i++){
			arr[i]=(int)(Math.random()*50+1);
			System.out.println(arr[i]+" ");
		}
		
		for(int a=0; a<10; a++){
			if(arr[a] == num){
				System.out.println("당첨! 일치하는 숫자가 있습니다.");
				diff=1;
			}	
		}
		if(diff==0)
			System.out.println("꽝!");
	}
}
