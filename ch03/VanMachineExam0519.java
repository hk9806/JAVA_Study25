package ch03;

import java.util.Scanner;

public class VanMachineExam0519 {
	public static void main(String[] args) {
		System.out.println("음료 품목 수를 입력하세요.");
		System.out.print(">>");
		Scanner sc = new Scanner(System.in);
		int select = 0;

		int count = sc.nextInt();
		String[] drinks = new String[count];
		int[] sell = new int[count];
		int[] price = new int[count];
		int[] stock = new int[count];
		int total = 0;

		boolean run = true;
		while (run) {
			System.out.println("---------자판기TEST---------");
			System.out.println("1.관리자모드|2.사용자모드|0.종료");
			System.out.println("----------------------------");
			System.out.print(">>");
			select = sc.nextInt();

			switch (select) {
			case 1:
				ManageMode(drinks, price, stock, sell, total);
				break;

			case 2:
				UserMode(drinks, price, stock, sell, total);
				break;

			case 0:
				run = false;
				break;
			default:
				System.out.println("1,2번 중 선택해주세요");

			}// switch
		} // while

	}// class

	private static void UserMode(String[] drinks, int[] price, int[] stock, int[] sell, int total) {
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);

		boolean user = true;
		while (user) {
			System.out.println("사용자 모드입니다");
			System.out.println("1.메뉴선택|2.재고확인|0.종료");
			System.out.print(">>");

			int select = inputInt.nextInt();
			switch (select) {
			case 1:
				for (int i = 0; i < drinks.length; i++) {
					System.out.println((i + 1) + "." + drinks[i] + "가격: " + price[i] + "원" + "(재고: " + stock[i] + ")");
				} // for
				System.out.println("메뉴를 선택해주세요");
				int choice = inputInt.nextInt() - 1;
			//	-----------------------------------
			

				if (stock[choice] > 0) {

					System.out.println("금액을 넣어주세요");
					System.out.print(">>");
					int money = inputInt.nextInt();

					int change = money - price[choice];

					if (money >= price[choice]) {
						System.out.println(drinks[choice] + "를 구매합니다. 금액은" + price[choice] + "원입니다");
						System.out.println("거스름돈: " + change + "원");
						stock[choice]--;
						sell[choice]++;

						System.out.println("이용해주셔서 감사합니다");
						System.out.println("----------");
					} else {
						System.out.println("금액이 부족합니다");
						continue;
					}

				} else {
					System.out.println("재고가 부족합니다 다른 메뉴를 선택해주세요");
				}
				break;

			case 2:
				System.out.println("--재고--");
				for (int i = 0; i < drinks.length; i++) {
					System.out.println(drinks[i] + "재고" + stock[i]);
				}
				break;
			
			case 0:
				System.out.println("종료");
				user = false;
				break;
			default:
				System.out.println("입력 오류 입니다.1~2숫자를 입력하세요");

			}// switch

		} // while

	}// user method

	private static void ManageMode(String[] drinks, int[] price, int[] stock, int[] sell, int total) {
		// ManageMod

		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		String pw = "1324";
		System.out.println("관리자 인증이 필요합니다");
		System.out.println("설정된 인증값을 입력하세요");

		String input = inputStr.nextLine();
		boolean Manage = true;

		if (input.equals(pw)) {

			System.out.println("인증되었습니다");
			while (Manage) {
				System.out.println("관리자 모드입니다.");
				System.out.println("1.메뉴변경|2.가격변경|3.재고설정|4.통계보기|0.종료하기");
				System.out.print(">>");
				int select = inputInt.nextInt();

				switch (select) {
				case 1:
					for (int i = 0; i < drinks.length; i++) {

						System.out.println("등록하실 상품명을 입력하세요: " + (drinks[i]));
						drinks[i] = inputStr.next();
					} // for
					System.out.println(" 등록완료");
					break;

				case 2:
					for (int i = 0; i < price.length; i++) {
						System.out.println("등록하신 상품" + (drinks[i]) + "의 가격을 입력하세요: " + (price[i]));
						price[i] = inputInt.nextInt();
					} // for
					System.out.println("가격설정 완료");
					break;
				case 3:
					System.out.println("재고설정");
					for (int i = 0; i < stock.length; i++) {
						stock[i] = inputInt.nextInt();
					} // for
					System.out.println("재고설정 완료");
					break;
				case 4:
					System.out.println("총 가격");

					for (int i = 0; i < sell.length; i++) {

						System.out.println(drinks[i] + "총 판매량: " + sell[i]);
						total = sell[i] * price[i];
						System.out.println("총액: " + total);
					} // for
					break;

				case 0:
					System.out.println("메뉴를 종료합니다");
					Manage = false;
					break;
				default:
					System.out.println("0~4까지 입력 가능합니다");

				}// switch
			} // while

		} else {
			System.out.println("인증 실패, 다시 확인해주십시오");

		} // else

	}// Manage
}// class
