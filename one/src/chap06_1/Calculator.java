package chap06_1;

public class Calculator {

	// 메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	float divide(int x, int y) {
		float result = (float)x / y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
