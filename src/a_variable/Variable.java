package a_variable;

import java.util.Scanner;

//ctrl + shift + o

public class Variable {
	int a; //전역변수
	public static void main(String[] args){
		/*
		 * <<변수>>
		 * 하나의 데이터를 저장할 수 있는 메모리상의 공간 
		 * 타입(데이터의 종류)과 변수명(변수의 이름)으로 변수를 만들 수 있다. 
		 * 
		 * <<사용가능한 기본형 데이터의 종류>>
		 * - 정수: byte(1byte), short(2byte), int(4byte), long(8byte)
		 * - 실수: float(4byte), double(8byte)
		 * - 문자: char(2byte)
		 * - 논리: boolean(1byte)
		 * 
		 * <<명명규칙>>
		 * - 블럭 안에서 변수명은 중복될 수 없다. 
		 * - 영문 대소문자, 한글, 숫자, 특수문자('_', '$')를 사용할 수 있다. (한글 사용은 자제하자)
		 * - 대소문자가 구분되며 길이에 제한이 없다.
		 * - 숫자로 시작할 수 없다.
		 * - 예약어는 사용할 수 없다. 
		 * - [기본적으로 변수는 소문자를 사용하고, 상수는 대문자를 사용한다.]
		 * - [여러 단어로 이루어진 경우 단어의 첫 글자를 대문자로 한다.(실수는 언더바로 구분)]
		 * - [클래스 명의 첫글자는 대문자로 한다.]
		 * - [패키지명은 모두 소문자로 한다.]
		 */
		
		//변수 선언 방법 : 데이터 타입 + 변수 이름
		byte _byte;
		char _char;
		
		//모든 기본형 타입을 사용해서 8개의 변수를 선언해주세요
		short _short;
		int _int;
		long _long;
		float _float;
		double _double;
		boolean _boolean;
		
		//선언한 이후 변수를 사용할 때는 변수의 이름으로 사용한다. 
		//변수에 값을 저장하지 않으면 변수의 값을 참조할 수 없다.
//		System.out.println(_byte); //컴파일 에러 발생 (문법이 틀렸다)
		
		//=(대입연산자) : 대입 연산자의 오른쪽의 값을 왼쪽(변수)에 저장한다.(오른쪽 먼저 연산)
		_byte = 10; //타입에 맞는 값을 저장해야한다. 
		_short = 20;
		_int = 30;
		_long = 40L; //long 접미사: L
		_float = 3.14f; //float 접미사: f
		_double = 3.14; //double 접미사: d(생략가능)
		_char = '가';
		_boolean = true;
		//초기화: 변수에 처음으로 값을 저장하는 것 
		System.out.println(_int);
		//ctrl + F11 : 프로그램 실행 
		//F11 : 디버그 실행
		
		_int = 100;
		System.out.println(_int);
		_int = 100 + 200;
		System.out.println(_int);
		
		//위에서 초기화한 변수에 새로운 값을 저장하고 출력해주세요 
		_byte = 11; 
		_short = 21;
		_int = 31;
		_long = 41L; 
		_float = 3.15f; 
		_double = 3.15; 
		_char = '나';
		_boolean = false;
		
		System.out.println(_byte);
		System.out.println(_short);
		System.out.println(_int);
		System.out.println(_float);
		System.out.println(_double);
		System.out.println(_char);
		System.out.println(_boolean);
		
		//String: 여러 개의 문자를 편리하게 사용하기 위한 클래스 
		//문자열 : ""(큰 따옴표)로 감싸진 글자
		String _String = new String("abcd");
		System.out.println(_String);
		
		_String = "1234";
		System.out.println(_String);
		
		/*
		 * <<리터럴의 종류>> 
		 * 숫자 : 0, 10, -5, 3.14
		 * 문자 : '가', 'a', '0', ' ' //문자는 반드시 하나의 문자를 표현해야함 
		 * 문자열 : "가나다", "abc", "123", " ", ""
		 * 그외: true, false, null
		 * 
		 * <<참조형타입>>
		 * -기본형 타입을 제외한 모든 데이터 타입(배열, 클래스)
		 * -ex)String, AboutClass, Variable
		 * -값이 변수에 저장되지 않고 따로 저장되며, 그 주소가 변수에 저장된다.
		 * -변수의 크기는 4byte이다.
		 * 
		 */
		
		//기본값: 전역변수에 아무것도 저장하지 않았을 때 저장되어 있는 값 
		_byte = 0;
		_short = 0;
		_int = 0;
		_long = 0L; 
		_float = 0f; 
		_double = 0.0d; 
		_char = '\u0000'; //유니코드
		_boolean = false;
		_String = null;
		
		//경우에 따라 변수에 타입이 다른 값을 저장하기도 한다.
		_byte = 127;
		_int = 128;
		_byte =(byte)_int;// 형변환: 데이터 타입을 변경하는 것
		System.out.println(_byte);
		//byte 타입은 -128~127까지만 표현 가능 127을 넘으면 -128로 돌아간다. (오버플로우)
		
		_byte = -128;
		_int = -129;
		_byte = (byte)_int;
		System.out.println(_byte); //-129 -> 127 (언더플로우)
		//표현 범위가 큰 타입에서 작은 타입으로 형변환 할 경우 데이터가 손실될 수 있다. 
		
		_double = 3.14;
		_int = (int)_double;
		System.out.println(_int); 
		
		//표현범위가 작은 타입에서 큰 타입으로 형 변환 할 경우 데이터가 손실될 염려가 없다. 
		//그러므로 형변환을 생략할 수 있다.
		_int = _byte;
		_long = _int;
		_double = _int;
		_double = _float;
		
		//위에서 만든 변수들을 표현범위가 작은 타입으로 형변환 해주세요(3번)
		_byte = (byte)_double;
		_int = (int)_long;
		_float = (float)_double;
		
		//위에서 만든 변수들을 표현범위가 큰 타입으로 형 변환해주세요(3번)
		_int = _byte;
		_int = _short;
		_double = _float;
		
		/*
		 * <<상수>>
		 * - 값을 한번 저장하면 변경할 수 없는 저장공간
		 * - final int MAX_NUMBER;
		 * - 리터럴에 의미를 부여하기 위해 사용한다. 
		 */
		
		final int MAX_NUMBER;
		MAX_NUMBER = 10;
//		MAX_NUMBER = 100;
		
		//콘솔창에서 입력받는 방법 
		Scanner s = new Scanner(System.in);
		
//		System.out.println("문자열을 입력해주세요>");
//		String input1 = s.nextLine();
//		System.out.println("입력받은 문자열: " + input1);
		
//		System.out.println("숫자를 입력해주세요>");
//		int input2 = Integer.parseInt(s.nextLine());
//		System.out.println("입력받은 숫자: " + input2);
		
//		//문자열을 입력받고 입력받은 문자열을 출력해주세요.
//		System.out.println("문자열을 입력해주세요>");
//		String input = s.nextLine();
//		System.out.println("입력받은 문자열: " + input);
//		
//		//숫자를 입력받고 입력받은 숫자를 출력해주세요.
//		System.out.println("숫자를 입력해주세요>");
//		int input2 = Integer.parseInt(s.nextLine());
//		System.out.println("입력받은 숫자: " + input2);
//		
//		//위에서 입력받은 문자열과 숫자를 더해서 출력해주세요.
//		System.out.println("더한값" + (input2+input));
		
		//3개의 숫자를 입력받고 그 숫자들을 더한 결과를 출력해주세요.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("3개의 숫자를 입력해주세요");
//		int a = Integer.parseInt(sc.nextLine());
//		int b = Integer.parseInt(sc.nextLine());
//		int c = Integer.parseInt(sc.nextLine());
//		System.out.println("더한값:" + (a+b+c));
		
		//아이디, 비밀번호, 이름, 전화번호, 이메일을 입력받고 마지막에 입력받은 내용 전체 출력 
		System.out.println("아이디>");
		String id = s.nextLine();
		System.out.println("비밀번호>");
		String pw = s.nextLine();
		System.out.println("전화번호>");
		int phoneNum = Integer.parseInt(s.nextLine());
		System.out.println("이메일>");
		String mail = s.nextLine();
		System.out.println("아이디:" + id);
		System.out.println("비밀번호:" + pw);
		System.out.println("전화번호:" + phoneNum);
		System.out.println("이메일:" + mail);
		
		//과제: 문제를 복사해서 가져오기 안푸는 문제 2-12
	}
}
