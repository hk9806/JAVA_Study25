package ch05.extended.child;

public class child extends Parent{

	@Override
	public void method2() {
		System.out.println("자식의 메소드2 호출");
		System.out.println("child-method2()");
	}
	public void method3() {
		System.out.println("자식의 메소드3 호출");
		System.out.println("Child-method3()");
	}
}
