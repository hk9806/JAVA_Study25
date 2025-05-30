package ch04.Person;

public class Person {
	//필드
	//final: 변하지 않는 값(초기값 설정 후 값 변경x)
	
	//final 필드의 초기값을 줄 수 있는 방법
	//*필드 선언시 초기값 할당 ->단순 초기값 걸정
	//*생성자에서 초기값 할당 ->복잡한 초기화 코드가 필요하거나 객체 생성시 외부 데이터로 초기화
	//생성자는 final필드의 초기화를 마쳐야 하나 초기화되지 않는 final필드를 남겨두면 컴파일 에러 발생
	
	final String nation = "Korea";//초기값
	final String ssn;//초기값 없음(생성자로 초기값 입력)
	
	String name; //일반 필드
	
	//생성자
	public Person(String ssn,String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
