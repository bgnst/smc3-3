import java.util.Random;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		System.out.println("10���� ���� ���� �� �ϳ��� ���纸����(1~50����): ");
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
		int diff=0;
		int[]arr = new int[10];
		
		for(int i=0; i<10; i++){
			arr[i]=(int)(Math.random()*50+1);
			System.out.println(arr[i]+" ");
		}
		
		for(int a=0; a<10; a++){
			if(arr[a] == num){
				System.out.println("��÷! ��ġ�ϴ� ���ڰ� �ֽ��ϴ�.");
				diff=1;
			}	
		}
		if(diff==0)
			System.out.println("��!");
	}
}