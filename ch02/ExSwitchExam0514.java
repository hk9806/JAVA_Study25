package ch02;

import java.util.Scanner;

public class ExSwitchExam0514 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //스캐너를 in객체에 연결
		System.out.print("동물의 이름을 입력하세요>");
		String Monster = in.nextLine(); //문자열 입력
		String kind = WhoIsIt(Monster); //메서드 호출 = 실행
		System.out.println(Monster + "는 " + kind + "그룹에 포함된 동물입니다.");
	}// 메인 종료

	static String WhoIsIt(String Monster) {
		String kind = "미지의 생물";
		switch (Monster) {
		case "호랑이", "사자", "강아지", "고양이", "고래" -> kind = "포유류";
		// "->"를 사용하는 스위치문에서는 break;를 사용할 수 없다.
		case "독수리", "참새", "까마귀", "비둘기", "닭" -> kind = "조류";

		case "고등어", "연어", "참치", "갈치" -> kind = "어류";

		default -> System.out.println("사전에 등록되지 않은 동물입니다.");

		}//스위치문 종료
		return kind;//void가 아닌 타입 반환 기법
	}//whoIsIt()종료

}//클래스 종료
