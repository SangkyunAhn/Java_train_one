package chap04;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		
		while (true) {
			System.out.print("입력받기: ");
			ch = sc.next().charAt(0);
			
			if (ch >= 'A' && ch <= 'z') {
				System.out.println(ch + "는 문자입니다.");
			} else if (ch >= '0' && ch <= '9') {
				System.out.println(ch + "는 숫자입니다.");
			} else {
				System.out.println(ch + "는 특수문자입니다.");
			}
			
			if (ch == '0') { break; }
		}
		
		sc.close();
	}

}
