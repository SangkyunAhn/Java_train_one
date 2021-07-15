package chap03;

import java.util.Scanner;

public class Java_study {

	public static void main(String[] args) {
		int[] unit = 
			{50000, 10000,5000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류
		int money;
		while (true) {
			System.out.print("금액을 입력해주세요(0을 넣으면 종료) : ");
			Scanner sc = new Scanner(System.in);
			money = sc.nextInt();
			if (money == 0) {
				sc.close();
				break;
			}
      
			for (int i = 0; i < unit.length; i++) {
				System.out.printf("%d 원 짜리 : %d개 \n",unit[i], money/unit[i]);
				money = money - (money / unit[i])*unit[i];
			}
		}  
	}
	
}