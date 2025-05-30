package ch05.exam02;

import ch05.exam01.package1.A;

public class C {
	//필드
	
	public C() {
		A a = new A();
		a.field1 =1;//public//접근제한
//		a.field2 = 2; //default 접근제한
//		a.field3=3;//private 접근제한
		
		a.method1();
//		a.method2();//default 접근제한
//		a.method3();//private 접근제한
	}
	A a1 = new A(true);//public 접근가능
//	A a2 = new A(1); //default 접근 불가(동일한 패키지만 접근 가능)
//	A a3 = new A("문자열"); //private 접근 불가 (개인적 접근제한)
}
