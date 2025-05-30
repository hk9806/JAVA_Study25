package ch05.MBC_Bank.SV;

import java.util.Scanner;

import ch05.MBC_Bank.DTO.AccountDTO;

public class NHBankSV {
	// 필드

	// 생성자

	// 메소드
	public void menu(Scanner inputInt, Scanner inputStr, AccountDTO[] nhbank) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------");
			System.out.println("농협은행 메뉴");
			System.out.println("1.계좌생성|2.계좌목록|3.입금|4.출금|5.이체|0.이전메뉴");
			System.out.print(">>");
			String select = inputStr.next();
			switch (select) {
			case "1":
				System.out.println("계좌 개설 메뉴입니다.");
				createAccount(inputInt, inputStr, nhbank);
				break;
			case "2":
				System.out.println("계좌목록 열람 메뉴입니다.");
				Accountlists(inputInt, inputStr, nhbank);
				break;
			case "3":
				System.out.println("입금 메뉴입니다");
				deposit(inputInt, inputStr, nhbank);
				break;
			case "4":
				System.out.println("출금메뉴입니다.");
				withdraw(inputInt, inputStr, nhbank);
				break;
			case "5":
				System.out.println("계좌 이체 메뉴입니다.");

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

	private void withdraw(Scanner inputInt, Scanner inputStr, AccountDTO[] nhbank) {
		System.out.println("-----출금-----");
		System.out.println("계좌번호: ");
		String ano = inputStr.next();

		System.out.println("입금액: ");
		int money = inputInt.nextInt();

		AccountDTO inputaccount = findAccount(ano, nhbank);

		if (inputaccount == null) {
			System.out.println("해당 계좌를 찾을 수 없습니다.");
		}
		inputaccount.setBalance(inputaccount.getBalance() - money);
		System.out.println("입금 후 처리 결과: " + inputaccount.getBalance() + "원");
		System.out.println("--------------------------");
	}

	private void deposit(Scanner inputInt, Scanner inputStr, AccountDTO[] nhbank) {
		System.out.println("-----입금-----");
		System.out.print("계좌번호: ");
		String ano = inputStr.next();

		System.out.println("입금액: ");
		int money = inputInt.nextInt();

		AccountDTO inputaccount = findAccount(ano, nhbank);

		if (inputaccount == null) {
			System.out.println("해당 계좌를 찾을 수 없습니다");
		} // if
		inputaccount.setBalance(inputaccount.getBalance() + money);
		System.out.println("입금 후 처리 결과: " + inputaccount.getBalance() + "원");
		System.out.println("--------------------------");

	}

	private AccountDTO findAccount(String ano, AccountDTO[] nhbank) {
		AccountDTO account = null;
		for (int i = 0; i < nhbank.length; i++) {
			if (nhbank[i] != null) {
				String dbAno = nhbank[i].getAno();

				if (dbAno.equals(ano)) {
					account = nhbank[i];
				} // if
			} // if
		} // for

		return account;
	}

	private void Accountlists(Scanner inputInt, Scanner inputStr, AccountDTO[] nhbank) {
		System.out.println("--------농협은행 계좌목룍--------");
		for (int i = 0; i < nhbank.length; i++) {
			AccountDTO accountlist = new AccountDTO();
			if (accountlist != null) {
				System.out.print("계좌번호: " + accountlist.getAno());
				System.out.print("\t");

				System.out.print("예금주: " + accountlist.getOwner());
				System.out.print("\t");

				System.out.print("계좌잔액: " + accountlist.getBalance());
				System.out.print("\t\n");
				System.out.println("--------------------------");

			} // if
		} // for

	}// Accountlists method

	private void createAccount(Scanner inputInt, Scanner inputStr, AccountDTO[] nhbank) {

		System.out.println(" ----계좌개설----");
		AccountDTO myAccount = new AccountDTO();

		System.out.print("계좌번호: ");
		myAccount.setAno(inputStr.next());

		System.out.println("예금주: ");
		myAccount.setOwner(inputStr.next());

		System.out.println("초기입금 액: ");
		myAccount.setBalance(inputInt.nextInt());
		for (int i = 0; i < nhbank.length; i++) {
			if (nhbank[i] == null) {
				nhbank[i] = myAccount;
				System.out.println("계좌개설 내역: " + nhbank[i]);
				break;
			} // if
		} // for
		System.out.println("계좌가 정상적으로 개설되었습니다");

	}

}// class
