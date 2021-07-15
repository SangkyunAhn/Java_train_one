package chap06;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.mem();
		s1.mem2();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		s2.mem2();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}

}
