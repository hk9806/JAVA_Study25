package ch04;

public enum Ranking {
	//enum타입은 열거 타입으로 자동으로 숫자 판단이 가능
	//enum에 활용되는 부분은 제한된 문자열을 숫자로 판단하는 역할을 많이 함
	//열거 타입에 선언된 실수는 대문자로 사용함(여러 문자인경우"_"으로 구분)
	GUEST, //0
	MEMBER,//1
	VIP,//2
	VVIP,//3
	VVVIP,//4
	
	
}
