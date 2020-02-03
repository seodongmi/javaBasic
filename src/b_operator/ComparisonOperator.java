package b_operator;

public class ComparisonOperator {

	public static void main(String[] args) {
		/*
		 * <<비교 연산자>>
		 * - < : 작다
		 * - > : 크다
		 * - <= : 작거나 같다
		 * - >= : 크거나 같다
		 * - == : 같다
		 * - != : 같지 않다.
		 */
		
		boolean b = 10 < 20;
		System.out.println(b);
		b = 10 <= 20 -15; //산술연산 먼저 수행 
		System.out.println(b);
		
		//float와 double을 비교할 때는 형변환에 주의해야한다
		b = 10.0f == 10.0;
		System.out.println(b);
		
		//실수는 값을 정확하게 표현하지 못하고 값의 근사치를 표현 
		//float은 7 자리 
		//double은 15자리까지 표현 
		b = 10.1f == 10.1;
		System.out.println(b);
		
		//값을 한번 출력해보자 
		System.out.printf("%22.20f%n", 10.1f);
		System.out.printf("%22.20f%n", 10.1);
		
		//double을 float으로 형 변환해야 정확하게 비교할 수 있다. 
		b = 10.1f == (float)10.1;
		System.out.println(b);
		
		b = "abc" == "abc";
		System.out.println(b);//같은 스트림 리터럴은 같은 주소를 같는다.
		b = "abc" == new String("abc");// 저장되어있는 주소가 다르다. new가 새로운 주소를 만드는 역할 
		System.out.println(b);
		//참조형 타입은 저장된 메모리 주소를 비교하기 때문에 
		//String은 등가비교 연산자로 내용을 비교할 수 없다. 
		//String의 내용을 비교하기 위해서는 equals() 메소드를 사용한다. 
		
		b = "abc".equals(new String("abc"));
		System.out.println(b);
		
		b = !"abc". equals(new String("ABC"));
		System.out.println(b);
		
		//다음 문장들을 코드로 작성해주세요 
		//1보다 2가 큰가?
		//0은 100보다 작거나 같은가?
		//3.14f와 3.14는 다른가?
		//"남자"와 "여자"는 다른가?
		
		b = 1 < 2;
		System.out.println(b);
		b = 0 <= 100;
		System.out.println(b);
		b = 3.14f != 3.14;
		System.out.println(b);
		b = !"남자".equals(new String ("여자"));
		System.out.println(b);
		
		
	}
	
	

}
