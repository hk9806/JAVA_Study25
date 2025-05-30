package ch05.lineage;

import java.util.Scanner;

import ch05.lineage.DTO.Account;
import ch05.lineage.DTO.ElfDTO;
import ch05.lineage.DTO.KnightDTO;
import ch05.lineage.service.CharacterService;
import ch05.lineage.service.loginService;

public class LineageExam {

	public static Scanner scanner = new Scanner(System.in);
	public static Account[] accounts = new Account[10];
	public static Account loginAccount;// session
	public static KnightDTO knightDTO = new KnightDTO();
	public static ElfDTO elfDTO = new ElfDTO();

	static {
		knightDTO.setSword("검");
		knightDTO.setArmor("갑옷");
		knightDTO.setShield("방패");
		knightDTO.setName("ddd");
		knightDTO.setSex("남");
		knightDTO.setLevel("1");
		knightDTO.setHp(5000);
		knightDTO.setMp(50);
		knightDTO.setMoney(500000);

		elfDTO.setBow("활");
		elfDTO.setDress("옷");
		elfDTO.setArrow("화살");
		elfDTO.setName("aaa");
		elfDTO.setSex("여");
		elfDTO.setLevel("1");
		elfDTO.setHp(3000);
		elfDTO.setMp(2000);
		elfDTO.setMoney(10000000);

		Account account = new Account();

		account.setId("www");
		account.setPw("www");
		account.setNickName("www");

		accounts[0] = account;
		// 배열 0번에 계정객체 연결
	}// db대신 초기값 지정(생성자 대신)

	public static void main(String[] args) {
		// 객체 간 상속 파악
		// 부모 객체 자식객체에게 모든 정보 상속
		// 자식 객체는 부모 객체 정보를 받아 사용하며 추가적인 정보 생성 및 활용
		System.out.println("-----리니지 게임을 시작합니다-----");
		boolean run = true;
		while (run) {
			System.out.println("1.로그인|2.캐릭터선택|3.게임실행|0.종료");
			System.out.print(">>");
			String select = scanner.next();
			switch (select) {
			case "1":
				System.out.println("로그인 메뉴입니다");
				loginAccount = loginService.menu(scanner, accounts,loginAccount);
				
				break;

			case "2":
				System.out.println("캐릭터를 선택합니다.");
				CharacterService.menu(scanner,loginAccount,knightDTO,elfDTO);
				break;

			case "3":
				System.out.println("게임을 시작합니다");
				break;

			case "0":
				System.out.println("종료");
				run = false;
				break;
				default: 
					System.out.println("0~4까지 숫자만 입력하세요");
				
			}

		}
	}
}
