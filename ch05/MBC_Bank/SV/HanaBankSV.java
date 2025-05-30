package ch05.MBC_Bank.SV;

import java.util.Scanner;

import ch05.MBC_Bank.DTO.AccountDTO;

public class HanaBankSV {
	// 필드

	// 생성자

	// 메서드(부메뉴, 계좌생성, 입출금, 삭제, 이체 등..)

	public void menu(Scanner inputInt, Scanner inputStr, AccountDTO[] hanabank) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------");
			System.out.println("하나은행 계좌관리 메뉴입니다.");
			System.out.println("1.계좌생성|2.계좌목록|3.입금|4.출금|5.이체|0.이전메뉴");
			System.out.print(">>");
			String select = inputStr.next();
			switch (select) {
			case "1":
				System.out.println("계좌 개설 메뉴입니다.");
				createAccount(inputInt, inputStr, hanabank);
				break;
			case "2":
				System.out.println("계좌목록 열람 메뉴입니다.");
				Accountlists(inputInt, inputStr, hanabank);
				break;
			case "3":
				System.out.println("입금 메뉴입니다");
				deposit(inputInt, inputStr, hanabank);
				break;
			case "4":
				System.out.println("출금메뉴입니다.");
				withdraw(inputInt, inputStr, hanabank);
				break;
			case "5":
				System.out.println("계좌 이체 메뉴입니다.");
				transfer(inputInt, inputStr, hanabank);
				break;
			case "0":
				System.out.println("메인메뉴로 돌아갑니다.");
				run = false;
				break;
			default:
				System.out.println("0~5까지 숫자만 입력하세요");
			}// switch
		} // while

	}// menu method

	

	private void transfer(Scanner inputInt, Scanner inputStr, AccountDTO[] hanabank) {
		System.out.println("---계좌 이체---");
		
		
	}



	private void withdraw(Scanner inputInt, Scanner inputStr, AccountDTO[] hanabank) {
		// 하나은행 계좌번호 입력 후 출금액 입력 시 입력한 계좌 잔액 감소
		System.out.println("---출금---");
		System.out.print("계좌번호: ");
		String ano = inputStr.next();

		System.out.println("출금액: ");
		int money = inputInt.nextInt();

		AccountDTO inputaccount = findAccount(ano, hanabank);
		// deposit 메서드에서 사용했던 findAccount메서드 사용
		if (inputaccount == null) {
			System.out.println("해당 계좌번호를 찾을 수 없습니다");
			return;
		} // if
		inputaccount.setBalance(inputaccount.getBalance() - money);
		System.out.println("출금 처리 후 결과: " + inputaccount);
		System.out.println(inputaccount.getOwner() + "님 출금이 완료되었습니다.");
		System.out.println("잔액: " + inputaccount.getBalance() + "원");
	}// withdrow method

	private void deposit(Scanner inputInt, Scanner inputStr, AccountDTO[] hanabank) {
		// 하나은행 계좌번호 입력 후 입금액 입력 시 입력한 계좌 잔액 증가
		System.out.println("---예금---");
		System.out.print("계좌번호: ");
		String ano = inputStr.next();

		System.out.println("입금액: ");
		int money = inputInt.nextInt();

		AccountDTO inputaccount = findAccount(ano, hanabank);
		// findAccount 메서드는 배열에서 값을 찾고 리턴해줌(반복코드 배제)
		if (inputaccount == null) {
			System.out.println("해당 계좌번호를 찾을 수 없습니다.");
			return;
		} // if
		inputaccount.setBalance(inputaccount.getBalance() + money);
		System.out.println("입금 처리 후 결과: " + inputaccount);
		// toString으로 결과 출력
		System.out.println(inputaccount.getOwner() + "님 입금되었습니다");
		System.out.println("잔액: " + inputaccount.getBalance() + "원");
		System.out.println("--------------------------");

	}// deposit method

	private AccountDTO findAccount(String ano, AccountDTO[] hanabank) {
		// findAccount 메서드는 배열에서 객체를 찾고 그 객체를 리턴해줌(반복코드 배제)
		AccountDTO account = null;// 빈객체
		for (int i = 0; i < hanabank.length; i++) {
			if (hanabank[i] != null) {
				// 하나은행 배열이 null이 아닐경우
				String dbAno = hanabank[i].getAno();
				// 배열에 있는 객체[계좌번호(변수명: ano)]를 가져와 dbAno변수에 입력
				if (dbAno.equals(ano)) {
					// 키보드로 입력된 ano객체를 dbAno객체와 비교
					account = hanabank[i];
					// 빈 객체에 비교값이 동등하면 객체를 삽입
					break;
				} // if
			} // if
		} // for
		return account;
	}// findAccount method

	private void Accountlists(Scanner inputInt, Scanner inputStr, AccountDTO[] hanabank) {
		System.out.println("------하나은행 계좌목록------");
		for (int i = 0; i < hanabank.length; i++) {
			AccountDTO accountlist = hanabank[i];
			if (accountlist != null) {
				System.out.print("계좌번호: " + accountlist.getAno());
				System.out.print("\t");

				System.out.print("예금주: " + accountlist.getOwner());
				System.out.println("\t");

				System.out.print("잔액: " + accountlist.getBalance());
				System.out.print("\t\n");
				System.out.println("--------------------------");
			} // if
		} // for

	}// Accountlists method

	private void createAccount(Scanner inputInt, Scanner inputStr, AccountDTO[] hanabank) {
		System.out.println("계좌개설 메뉴입니다");
		AccountDTO myAccount = new AccountDTO();

		System.out.println("계좌번호: ");
		myAccount.setAno(inputStr.next());

		System.out.println("계좌주: ");
		myAccount.setOwner(inputStr.next());

		System.out.println("초기입금액: ");
		myAccount.setBalance(inputInt.nextInt());
		myAccount.setBankname("하나은행");

		for (int i = 0; i < hanabank.length; i++) {
			if (hanabank[i] == null) {
				hanabank[i] = myAccount;
				System.out.println("계좌개설 내역: " + hanabank[i]);

				break;
			} // if
		} // for
		System.out.println("계좌가 정상적으로 개설되었습니다.");
	}
}// class
