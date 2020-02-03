package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*
		 * <<배열>>
		 * int[] number = new int[5];
		 * int[] number = new int[] {10,20,30,40,50};
		 * int[] number = {10,20,30,40,50};
		 * 
		 * 한번 길이가 정해지면 바꿀 수 X
		 */
		
		//배열은 참조형 타입입니다.
		int[] array; //배열의 주소를 저장할 공간이 만들어진다. 
		array = new int[5];//배열이 생성되고 그 주소가 저장된다.
		//new: 새로운 저장공간 생성 및 주소 반환 
		//int[5] : int를 저장할 수 있는 5개의 공간 
		//배열 초기화시 기본값이 저장된다. 기본값:0
		
		System.out.println(array);//주소 출력 
		
		System.out.println(array[0]); //실제 값에 접근하기 위해서는 index를 지정해줘야 한다. 
		//index인 int만 사용할 수 있다 (리터럴, 변수, 상수, 연산 등)
		//배열의 최대크기는 in절대값(약20d억)이다
		
		String arrayStr =Arrays.toString(array); //배열의 모든 익덱스에 저장된 값을 문자열로 반환 
		System.out.println(arrayStr);
		
		int[] iArray1 = new int[]{1,2,3};// 값의 개수로 배열의 길이가 정해진다
		int[] iArra2 = {1,2,3};// 선언과 초기화를 동시에 해야한다. 
		int[] iArray3;
		//iArray3  = {1,2,3};
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		int[] array4 = new int[10];
		for(int i=0; i<array4.length; i++){
			array4[i] = i;
		}
		
		for(int i=0; i<array4.length; i++){
			System.out.print(array4[i]);
		}
		
		/*
		int sum = 0;
		for(int i=0; i<array4.length; i++){
			sum += array4[i];
		}
		System.out.println();
		System.out.println("sum :" + sum);
	*/		
		int[] numbers = new int[10];
	
		int sum = 0;
		double avg = 0;
		for(int i=0; i<numbers.length; i++){
			numbers[i] = (int)(Math.random()*100)+1;
			sum += numbers[i];
		} 
		System.out.println();
		System.out.println("sum :" + sum + " avg: " + sum/(double)numbers.length);
		System.out.println(Arrays.toString(numbers));
		
		//향상된 for문 
		for(int number : numbers){//배열에 맞는 타입을 넣어야함 
			System.out.print(number + " ");
		}
		
		for(int number : numbers){
			number = 0; //numbers의 값은 변경되지 않는다.
			System.out.println(number);
		}
		System.out.println(Arrays.toString(numbers));
		//배열의 값을 읽을 때만 사용이 가능 
		
		//배열에 저장된 숫자들 중 최소값과 최대값을 찾아주세요. 
		
		int max = numbers[0];
		int min = numbers[0];

		
		for(int i=1; i<numbers.length;i++){
			if(min > numbers[i]){
				min =  numbers[i];
			}
			
			if(max < numbers[i]){
				max = numbers[i];
			}
		}
		System.out.println("max:" + max +  " min:" + min );
	
		max = numbers[0];
		min = numbers[0];
		
	for(int i=0; i<numbers.length; i++){
		for(int j=0; j<numbers.length; j++){
			if(numbers[i] > numbers[j]){
				
			}
		}
	}

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
		
		//1~10사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요
		
		int count = 0;
		int randomArray[] = new int[500];
		int num[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int j = 0; j < randomArray.length; j++) {
		randomArray[j] = (int) (Math.random() * 10) + 1;
		}
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < randomArray.length; j++) {
				if (num[i] == randomArray[j]) {
					count++;
				}
			}
			System.out.println(num[i] + " " + count);
			count=0;
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("최소값을 입력해주세요");
		min = Integer.parseInt(sc.nextLine());
		System.out.println("최대값을 입력해주세요");
		max = Integer.parseInt(sc.nextLine());
		System.out.println("반복횟수를 입력해주세요");
		int repeat = Integer.parseInt(sc.nextLine());
		
		count = 0;
		randomArray = new int[repeat];
		int number[]= new int[max];
		
		for (int j = 0; j < randomArray.length; j++) {
			randomArray[j] = (int) (Math.random() * max) + min;
		}
		
		for(int i=0; i<max; i++){
			number[i] = min;
			min++;
		}
		
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < randomArray.length; j++) {
				if (number[i] == randomArray[j]) {
					count++;
				}
			}
			System.out.println(number[i] + " " + count);
			count=0;
		}
		System.out.println(Arrays.toString(randomArray));
	}
		
	
	
	
	
}
