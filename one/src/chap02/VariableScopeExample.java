package chap02;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		int v2 = 0; // auto 생략
		
		if (v1 > 10) {
			v2 = v1 - 10;
		}
		
		int v3 = v1 + v2 + 5;
	}

}
