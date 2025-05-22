package ch04;

public class EnumExam0521 {

	public static void main(String[] args) {
		
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println("객체의 이름은: "+name);
		//ordinal 은 전체 열거 객체중 몇 번쨰 열거 객체인지 확인
		//0부터 시작
		int ordinal = today.ordinal();
		System.out.println("열거 순서는: "+ordinal);
		
		//compareTo는 주어진 열거 객체를 기준으로 전후 몇 번쨰에 위치하는지 비교
		//앞에 있으면(<-,작은 값)음수 뒤에 있으면(->,큰 값)양수로 리턴
		Week day1=Week.MONDAY;
		Week day2=Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		//day1(월요일)을 day2(수요일)과 비교했을때 월요일이 이틀 전이므로 -2 출력
		int result2 = day2.compareTo(day1);
		//day2(수요일)을 day1(월요일)과 비교했을때 수요일이 이틀 후이므로 2 출력
		System.out.println(result1);
		System.out.println(result2);
		
		//value of는 매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거객체를 리턴
		//외부로부터 문자열을 입력받아 열거 객체로 변환할 떄 자주 사용
		Week weekday = Week.valueOf("MONDAY");
		if(weekday ==Week.SATURDAY||weekday==Week.SUNDAY) {
			System.out.println("주말입니다");
		}else {
			System.out.println("평일입니다.");
		}
		//values는 열거 타입의 모든 열거 객체들을 배열로 만들어 리턴
		//for each 문 사용
		Week[] days = Week.values();
		for(Week a:days) {
			System.out.print(a+" ");
		}
	}

}
