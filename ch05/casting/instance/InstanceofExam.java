package ch05.casting.instance;

public class InstanceofExam {

	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			//parent가 부모객체인지 자식객체인지 판단
			Child child = (Child)parent;
			System.out.println("method1 = Child 변환 성공");
			
		}else {
			System.out.println("method1-Child 변환 실패");
		}//if에 대한 종료
	}//검증을 통한 강제 타입 변환
	public static void method2(Parent parent) {//매개값의 다형성
		Child child = (Child)parent;
		System.out.println("method2 = Child 변환성공");
	}
	public static void main(String[] args) {
		Parent parentA = new Child();//자식을 통해 부모도 생성
		method1(parentA);//정상
		method2(parentA);//정상
		
		Child childA = new Child();
		method1(childA);//정상
		method2(childA);//정상
		
		Parent parentB = new Parent();//부모만 객체생성
		method1(parentB);//비정상(검증완료)
		method2(parentB);//예외코드 발생
	}
		
}