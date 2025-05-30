package ch05.extended.child;

public class ChildExam {

	public static void main(String[] args) {
		child ch = new child();
		Parent pr = ch;
		pr.method1();
		pr.method2();
		//pr.method3();	//자식에 있는 method3은 호출불가
	}

}
