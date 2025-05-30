package ch05.exam01.package1;

public class B {
	//필드
	
	//생성자 호출
	public B() {
		A a= new A();//A 클래스에 객체 생성
		a.field1 = 1;//public
		a.field2 = 2;//default
		//a.field3 = 3;//private(컴파일 에러)
		
		
		a.method1();//public
		a.method2();//default
		//a.method3();//private (컴파일 에러)
		
	}
	
	
	A a1 = new A(true);//public 접근 제한
	A a2 = new A(1);//default 접근 제한
	//A a3 = new A("문자열");//private 접근제한
	//private는 개인적으로 사용하는 것이라 같은 패키지여도 접근 불가
}
