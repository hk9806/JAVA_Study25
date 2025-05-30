package ch04.Person;

public class PersonExam0526 {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567","kkw");//final 필드 객체
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//nation, ssn은 final타입으로 선언되어 값 변경 불가
		//name은 String 타입으로 선언되어 값 변경 가능
	
	}

}
