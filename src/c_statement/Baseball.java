package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 9) + 1;
		int num2 = (int) (Math.random() * 9) + 1;
		int num3 = (int) (Math.random() * 9) + 1;
		
		while(num2 == num1) {
				num2 = (int) (Math.random() * 9) + 1;
		}
		
		while(num3 == num2 || num3 == num1 ){
			num3 = (int) (Math.random() * 9) + 1;
		}
		
		System.out.println("num1:" +  num1 + "num2:" +  num2  + "num3:"+ num3);
		
		while (true) {		
			int strike = 0;
			int ball = 0;
			int out = 0;
			
			int tmp1 =0;
			int tmp2 =0;
			int tmp3 =0;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력해주세요 ");
			tmp1 = Integer.parseInt(sc.nextLine());
			
			while(true){
				if (tmp1 >9 || tmp1 <1) {
					System.out.println("범위에 벗어납니다. 다시");
					tmp1 = Integer.parseInt(sc.nextLine());
				} else{
					System.out.println("입력한 수 1:" + tmp1);
					break;
				}
			}
			
			System.out.println("숫자를 입력해주세요 ");
			tmp2 = Integer.parseInt(sc.nextLine());
			
			
			while (true) {
				if (tmp2 == tmp1) {
					System.out.println("중복된 수 입니다. 다시");
					tmp2 = Integer.parseInt(sc.nextLine());
				}
				if (tmp2 > 9 || tmp2 < 1) {
					System.out.println("범위에 벗어납니다. 다시");
					tmp2 = Integer.parseInt(sc.nextLine());
				} else {
					if (tmp2 != tmp1 && !(tmp2 > 9 || tmp2 < 1) ){
						System.out.println("입력한 수2:" + tmp2);
						break;
					}
				}
			}
			
			System.out.println("숫자를 입력해주세요 ");
			tmp3 = Integer.parseInt(sc.nextLine());
		
			while (true) {
				if (tmp3 == tmp2 || tmp3 == tmp1) {
					System.out.println("중복된 수 입니다. 다시");
					tmp3 = Integer.parseInt(sc.nextLine());
				}
				if (tmp3 > 9 || tmp3 < 1) {
					System.out.println("범위에 벗어납니다. 다시");
					tmp3 = Integer.parseInt(sc.nextLine());
				} else {
					if (tmp3 != tmp1 && !(tmp3 > 9 || tmp3 < 1) ){
						System.out.println("입력한 수3:" + tmp3);
						break;
					}
				}
			}

			if (tmp1 == num1) {
				strike += 1;
			} else if (tmp1 == num2 || tmp1 == num3) {
				ball += 1;
			} else {
				out += 1;
			}

			if (tmp2 == num2) {
				strike += 1;
			} else if (tmp2 == num1 || tmp2 == num3) {
				ball += 1;
			} else {
				out += 1;
			}

			if (tmp3 == num3) {
				strike += 1;
			} else if (tmp3 == num1 || tmp3 == num2) {
				ball += 1;
			} else {
				out += 1;
			}
			
			System.out.println();
			System.out.print(strike + "S ");
			System.out.print(ball + "B ");
			System.out.println(out + "O ");
			System.out.println();
			
			if (strike == 3) {
				System.out.println("맞췄습니다.");
				System.out.println("해당 숫자: " + tmp1 + tmp2 + tmp3);
				break;
			}
		}
	}
}
