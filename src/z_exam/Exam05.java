package z_exam;

import java.util.Arrays;

public class Exam05 {

	public static void main(String[] args) {
		
		int[] shuffle = new int[30];
		for (int i = 0; i < shuffle.length; i++) {
			shuffle[i] = i+1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		int tmp;

		
		for (int i = 0; i < shuffle.length * 10; i++) {
			int input = (int) (Math.random() * shuffle.length-1) + 1;
			tmp = shuffle[0];			
			shuffle[0] = shuffle[input];
			shuffle[input] = tmp;
		}
	
		
		
		
		System.out.println(Arrays.toString(shuffle));
		
	}

}
