package chap06_2;

public class MyStatic {

	static int count = 0;
	
	MyStatic() {
		this.count++;
		System.out.println(this.count);
	}
	
	public static void main(String[] args) {
		MyStatic my1 = new MyStatic();
		MyStatic my2 = new MyStatic();
		MyStatic my3 = new MyStatic();
		MyStatic my4 = new MyStatic();
	}

}
