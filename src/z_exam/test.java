package z_exam;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		//2020_01_31 배열 문제
				//1. 10까지 저장할 수 있는 배열에 100까지의 랜덤한 숫자를 저장하고 숫자들의 합계와 평균 값을 찾아주세요.
				//2. 1번 문제에 저장된 숫자들 중에 최대값과 최소값을 구해주세요.
				//3. 0부터 30까지의 랜덤한 숫자를 출력해내 랜덤한 숫자에 해당되는 인덱스의 숫자와 인덱스 0에 해당하는 숫자를 서로 교환한다
				     //그리고 이것을 배열 안의 모든 숫자가 바뀔 때까지 계속해주세요.
				//4.  1 ~ 10 사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
				//5. 4번문제에 만들어진 식에서 난수의 최소값, 최대값, 숫자가 생성된 횟수를 사용자에게 입력받을 수 있게 만드시오.
			
			//1. 10까지 저장할 수 있는 배열에 100까지의 랜덤한 숫자를 저장하고 숫자들의 합계와 평균 값을 찾아주세요.
			
			/*	//배열 크기설정
				int[] array;
				array = new int[10];
				//합계와 평균을 구하는 변수 설정
				int sum = 0;
				double ave = 0;
				//합계를 구하는 for문 작성
				for(int i = 0; i <  array.length; i++){
					array[i] = (int)(Math.random()*100)+1;
					sum += array[i];
				}
				//평균을 구하는 식 작성
				ave = (double)sum / array.length;
				
				//합계와 평균을 출력
				System.out.println("합계: " + sum + " 평균: " + ave);
				
				
			//2. 1번 문제에 저장된 숫자들 중에 최대값과 최소값을 구해주세요.
				//최대값, 최소값 정의
				int max = 0;
				int min = array[0];
				//최대값, 최소값을 구하는 식
				for(int i = 0; i < array.length; i++){
					if(array[i] > max ){
						max = array[i];
					}
					if(array[i] < min){
						min = array[i];
					}
				}
				System.out.println("최대값: "+ max + " 최소값:" + min);*/
				
			//3. 0부터 30까지의 랜덤한 숫자를 출력해내 랜덤한 숫자에 해당되는 인덱스의 숫자와 인덱스 0에 해당하는 숫자를 서로 교환한다
			    //그리고 이것을 배열 안의 모든 숫자가 바뀔 때까지 계속해주세요.
				
				//0부터 30까지의 랜덤 숫자를 넣을 배열 정의
				int[] array2 = new int[30];
				int[] array3 = new int[30];
				boolean check = true;
				//0부터 30까지의 랜덤한 숫자를 배열에 넣는 식
				for(int i = 0; i < array2.length; i++){
					array2[i] = (int)(Math.random() * 30)+0;
				}
				//첫번째 배열을 복사해서 넣을 배열 정의
				//array3 = array2;
				//System.out.println(Arrays.toString(array2));
				for(int i = 0; i < array2.length; i++){
					array3[i] = array2[i];
				}
				System.out.println(Arrays.toString(array2));
				//바꿀 인덱스에 넣을 랜덤한 숫자를 뽑고, 해당하는 숫자의 인덱스와 0 인덱스의 숫자를 서로 교환하는 식
				while(check){
					//숫자뽑기
					int random2 = (int)(Math.random() * array2.length-1 )+1;
					
					//0번 인덱스를 임시로 저장해둘 변수
					int temp = 0;
					//교환하는 식
					temp = array2[random2];
					array2[random2] = array2[0];
					array2[0] = temp;
				
					//인덱스 숫자가 전부 다 바뀌어야지만 빠져나갈 수 있게 해주는 식
					for(int k=0; k<array2.length; k++){
						for(int j=0; j<array3.length; j++){
							if(array2[k] == array3[j]){
								check = true; 
							
						}
					}
					}
					break;
					
				}
				
	
				
				//System.out.println("첫번째 배열은: ");
				//System.out.println(Arrays.toString(array2));
				//System.out.println("마지막 배열은:");
					System.out.println(Arrays.toString(array2));
				//System.out.println("으로 모두 바뀌었습니다.");
				
	
				//System.out.println(Arrays.toString(array2));
	}
}
