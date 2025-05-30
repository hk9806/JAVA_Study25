package ch04.Television;

public class Television {
	static String company = "Samsung";
	static String model = "LED";
	static String info;

	

//	정적 메소드 사용시 주의 사항
//	*정적 메소드와 정적 블록을 선언할떄 주의할 점은
//	객체가 없어도 실행된다는 특징 떄문에 내부 인스턴스 필드나
//	인스턴스 메소드를 사용할 수 없다
//	*또한 객체 자신의 참조인 this도 사용 불가
	
	//예시사항
	static {// 정적블록
		info = company + "-" + model;
	}

	
	int field1;// 인스턴스 필드
	void method1() {// 인스턴스 메소드
	}
	
	static int field2;//정적 필드
	static void method2() {//정적메소드		
	}
	
	static {//정적블록
//		field1 = 10;//인스턴스 필드 사용불가
//		method1();//인스턴스 메소드 사용불가
		field2=20;
		method2();
	}
	
	static void Method3() {//정적메소드
		Television tel = new Television();
		tel.field1 =10; //객체 생성하여 변수와 연결
		tel.method1();//컴파일 오류	//인스턴스 멤버는 객체 필요
		field2=10;
		method2();
	}
}
