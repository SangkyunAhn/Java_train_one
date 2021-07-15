package chap05;

import java.text.DecimalFormat;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		int sum = 0;
		DecimalFormat form = new DecimalFormat("#.####"); // 소수 넷째 자리까지 나타냄
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균: " + form.format(avg));
	}

}
