package ch04;

import java.util.Calendar; //내장된 클래스를 활용할 떄 ctrl+shift+o

public class EnumWeekExam0521 {

	public static void main(String[] args) {
		Week today = null; //Week타입에 today변수를 선언, 연결은 나중

		Calendar cal = Calendar.getInstance();//캘린더 인스턴스 생성

		int year = cal.get(Calendar.YEAR);//년도 추출
		int month = cal.get(Calendar.MONTH)+1; //월은 0부터 시작하기 때문에 +1
		int day = cal.get(Calendar.DAY_OF_MONTH);//한달의 일수 계산
		int week = cal.get(Calendar.DAY_OF_WEEK);//요일을 숫자로 출력, 일요일이 1
		
		switch(week) {
		case 1: 
			today = Week.SUNDAY ;break;
		case 2: 
			today = Week.MONDAY ;break;
		case 3: 
			today = Week.TUESDAY ;break;
		case 4: 
			today = Week.WEDNESDAY ;break;
		case 5: 
			today = Week.THURSDAY ;break;
		case 6: 
			today = Week.FRIDAY ;break;
		case 7: 
			today = Week.SATURDAY ;break;
			
		}//switch
		System.out.println("현재 날짜는: "+year+"년 "+month+"월"+day+"일"+"("+today+")");
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println("현재 시간은 "+hour+"시"+minute+"분"+second+"초");
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일 입니다.");
		}else if (today == Week.MONDAY) {
			System.out.println("월요일입니다");
		}else if (today == Week.TUESDAY) {
			System.out.println("화요일입니다");
		}else if (today == Week.WEDNESDAY) {
			System.out.println("수요일입니다");
		}else if (today == Week.THURSDAY) {
			System.out.println("목요일입니다");
		}else if (today == Week.FRIDAY) {
			System.out.println("금요일입니다");
		}else if (today == Week.SATURDAY) {
			System.out.println("토요일입니다");
		}//if
		
	}

}
