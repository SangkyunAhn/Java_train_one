package chap03;

public class LogicBinary {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		
		byte num1 = 5;
		byte num2 = 7;
		byte result = (byte)(num1 & num2);
		byte result2 = (byte)(num1 | num2);
		byte result3 = (byte)(num1 ^ num2);
		
		System.out.println(a >= 0 && b >= 0);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	}

}
