package ch05.casting.instance;

public class ChildExam {

	public static void main(String[] args) {
		Parent parent = new Child();
		// 자동타입 변환으로 자식 객체를 통해 부모객체 생성
		parent.field1 = "aaa";
		parent.method1();// 부모클래스 메소드
		parent.method2();// 부모클래스 메소드
//		parent.method3();// 자식 클래슴 메소드
//		parent.field2 = "aaa";// 자식클래스 필드

		Child child = new Child();
		child.method3(); //자식 클래스 메소드
		child.field2 = "aaa";
		
		Child ch = (Child)parent;
		ch.method3();//자식클래스 메소드
		ch.field2 = "aaa";
		
	}

}
