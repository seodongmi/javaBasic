package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * << if문 >>
		 * - if : 조건식의 결과가 true이면 블럭안의 문장을 수행한다
		 * - else if: 다수의 조건이 필요할 때 if뒤에 추가한다 
		 * - else : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다
		 * 
		 */
		
		int a = 10;
		if (a < 100){
			System.out.println("조건식의 연산결과가 true이면 실행된다");
		}
		
		if (a < 10){
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다");
		}
		
		int regNo = 5; //주민등록번호 첫자리 
		String gender = null; //성별 
		
		if(regNo == 1){
			gender = "남자";
		}else if(regNo ==2){ //if블럭 뒤에 else if로 조건을 추가할 수 있다
			gender = "여자";
		}else if(regNo == 3){
			gender = "남자";
		}else if(regNo == 4){
			gender = "여자";
		}else{//true조건식이 하나도 없을 때 수행된다. 
			gender = "확인불가";
		}System.out.println("당신의 성별은 " + gender + " 입니다");
		
		regNo = 1;
		gender = null;
		//수행할 내용이 동일한 경우 논리연산자를 사용해 조건식을 결합할 수 있다 
		if(regNo ==1 || regNo ==3)
			gender = "남자";
		else if (regNo ==2 || regNo ==4)
			gender = "여자";
		else 
			gender = "확인불가";
		System.out.println("당신의 성별은 " + gender + " 입니다");
		
		int score = 40;
		String grade = null;
		
		if(score >= 90){
			grade = "A";
		}else if(score >= 80){ //90점 미만을 검사하지 않아도 내려온 시점에는 90점 미만임 
			grade = "B";
		}else if(score >= 70 ){
			grade = "C";
		}else if(score >= 60){
			grade = "D";
		}else{
			grade = "F";
		}
		System.out.println("당신의 성적은 " + grade + " 입니다");
		
		score = 77;
		grade = null;
		if(90 <= score){
			grade = "A";
			if(97 <= score){
				grade += "+";
			}else if(score <= 93){
				grade += "-";
			}
		}else if(80 <= score){
			grade = "B";
			if(87 <= score){
				grade += "+";
			}else if(score <= 83){
				grade += "-";
			}
		}else if(70 <= score){
			grade = "C";
			if(77 <= score){
				grade += "+";
			}else if(score <= 73){
				grade += "-";
			}
		}else if(60 <= score){
			grade = "D";
			if(67 <= score){
				grade += "+";
			}else if(score <= 63){
				grade += "-";
			}
		}else{
			grade = "F";
		}
		System.out.println("당신의 성적은 " + grade + " 입니다");
	
		/* 
		 * <<switch문>>
		 * --조건식과 일치하는 case문 이후의 문장을 수행한다
		 * --조건식의 결과는 정수와 문자열만 (JDK1.7부터 문자열 허용)허용한다.
		 * 
		 *  
		 */
		
		regNo = 1;
		gender = null;
		switch(regNo){
		case 1:
		case 3:
			gender = "남자";
			break; //break를 만나면 switch문을 빠져나간다. 
		case 2:
		case 4:
			gender = "여자";
			break;
		default:
			gender = "확인불가";
		}
		System.out.println("당신의 성별은 " + gender + " 입니다");
		
		score = 95;
		grade = null;
		switch(score/10){
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		System.out.println("당신의 성적은 " + grade + " 입니다");
		
		//숫자를 입력받아 그 숫자가 0인지 아닌지 출력해주세요 
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자:");
//		int num = sc.nextInt();
//		if(num ==0){
//			System.out.println("0입니다.");
//		}else{
//			System.out.println("0이 아닙니다.");
//		}
		
//		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요 
//		System.out.print("숫자:");
//		num = sc.nextInt();
//		if(num == 0){
//			System.out.println("0은 자연수가 아닙니다.");
//			System.out.println("자연수를 입력해주세요");
//		}else if(num%2 == 0){
//			System.out.println("짝수 입니다.");
//		}else if(num%2 == 1){
//			System.out.println("홀수 입니다.");
//		}
		
//		//두개의 숫자를 입력받아 더 큰 숫자를 출력해주세요 
//		System.out.println("두개의 숫자를 입력해주세요");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		if(num1>num2){
//			System.out.println("큰 수 :" +  num1);
//		}else{
//			System.out.println("큰 수 :" + num2);
//		}
		
		
		//세 개의 숫자를 입력받아 가장 큰 숫자 출력 
		System.out.println("숫자를 입력해주세요");
		int num1 = sc.nextInt();
		System.out.println("숫자를 입력해주세요");
		int num2 = sc.nextInt();
		System.out.println("숫자를 입력해주세요");
		int num3 = sc.nextInt();
		int max = 0;
		
		if(num1 > num2 && num1 > num3){
			System.out.println("큰 수 :" + num1);
		}else if(num2 > num1 && num2 > num3){
			System.out.println("큰 수 :" + num2);
		}else{
			System.out.println("큰 수 :" + num3);
		}
		
		//sc.nextInt();는 버그가 존재 사용하지 말 것 
		
		
		
		
	}
}

