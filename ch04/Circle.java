package ch04;

public class Circle { //라이브러리 클래스로 인스턴스(객체용)
	//필드(클래스에서 사용할 변수)
	public int radius; //main메소드에서 circle.radiut = 10
	public String name; //Circle.name = "김기원"

	//생성자(클래스를 호출할때 new연산자를 사용함)
	public Circle() {//생성자는 클래스명과 같은 메서드
		
	}//main 메서드에서 Circle circle = new Circle();객체 생성용
	
	//메서드(동작부부너)
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}
