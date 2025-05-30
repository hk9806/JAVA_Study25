package ch04.marioKart;

import java.util.Scanner;

import ch04.marioKart.DTO.CartDTO;
import ch04.marioKart.DTO.CharacterDTO;
import ch04.marioKart.DTO.GliderDTO;
import ch04.marioKart.DTO.ItemDTO;
import ch04.marioKart.DTO.MemberDTO;
import ch04.marioKart.DTO.TireDTO;
import ch04.marioKart.Service.CarSV;
import ch04.marioKart.Service.MemberSV;

public class MarioKartExam0522 {
	// 필드
	public static Scanner input = new Scanner(System.in);// 키보드 입력
	public static MemberDTO[] memberDTOs = new MemberDTO[10];//회원
	public static CharacterDTO[] characterDTOs = new CharacterDTO[15];//캐릭터
	public static CartDTO[] cartDTOs = new CartDTO[8];//카트
	public static GliderDTO[] gliderDTOs = new GliderDTO[10];//글라이더
	public static TireDTO[] tireDTOs = new TireDTO[10];//타이어
	public static ItemDTO[] itemDTOs = new ItemDTO[10];//아이템

	public static MemberDTO loginState; // 로그인 상태유지 (세션)

	static {
		CharacterDTO characterDTO0 = new CharacterDTO("마리오", 3.0, 4.5, 3.7, 4.1, 3.8);
		CharacterDTO characterDTO1 = new CharacterDTO("루이지", 3.2, 4.4, 3.1, 4.4, 3.2);
		CharacterDTO characterDTO2 = new CharacterDTO("와리오", 3.4, 4.2, 3.2, 4.2, 3.4);
		CharacterDTO characterDTO3 = new CharacterDTO("피치", 3.1, 4.8, 3.4, 4.5, 3.5);

		characterDTOs[0] = characterDTO0;
		characterDTOs[1] = characterDTO1;
		characterDTOs[2] = characterDTO2;
		characterDTOs[3] = characterDTO3;

	}// 스태틱 블럭 => 스태틱으로 만든 클래스의 초기값 배정

	//매서드
	public static void main(String[] args) {
		System.out.println("---마리오 카트 게임---");
		boolean run = true;// 처음 구동
		while (run) {
			System.out.println("1.회원관리|2.카트관리|3.게임실행|0.종료");
			System.out.print(">>");
			String select = input.next();

			switch (select) {
			case "1":
				System.out.println("회원관리 메뉴");
				MemberSV memberSV = new MemberSV();
				loginState = memberSV.menu(input, memberDTOs, loginState);
				break;

			case "2":
				System.out.println("카트관리 메뉴");
				CarSV cartSv = new CarSV();//카트관리 클래스 객체 생성
				cartSv.menu(input,characterDTOs,loginState);
				break;

			case "3":
				System.out.println("게임실행");
				break;

			case "0":
				System.out.println("종료");
				run = false;
				break;

			default:
				System.out.println("0~4까지만 입력하세요.");
			}// switch

		} // while

	}// main

}// class
