package chap02;

public class LogicBinary {
	
	public static String numAnd(int a, int b) {
		return (a >= 1 && b >= 1) ? "True" : "False";
	}
	
	public static String numOr(int a, int b) {
		return (a >= 1 || b >= 1) ? "True" : "False";
	}
	
	public static void main(String[] args) {
		int a = 7, b = 0;
		// String c;
		
		/* if (a >= 1 && b >= 1) {
			c = "True";
		} else {
			c = "False";
		} */
		System.out.println(numAnd(a, b));
		System.out.println(numOr(a, b));
	}

}