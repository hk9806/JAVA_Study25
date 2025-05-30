package ch05.MBC_Bank.SV;

import java.util.Scanner;

import ch05.MBC_Bank.DTO.AccountDTO;

public class WooriBankSV {
	// 필드

	// 생성자

	// 메서드
	public void menu(Scanner inputInt, Scanner inputStr, AccountDTO[] wooribank) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------");
			System.out.println("우리은행 계좌관리 메뉴입니다.");
			System.out.println("1.계좌생성|2.계좌목록|3.입금|4.송금|5.이체|0.이전메뉴");
			System.out.print(">>");
			String select = inputStr.next();
			switch (select) {
			case "1":
				System.out.println("계좌생성 메뉴입니다");
				crateAccount(inputStr, inputStr, wooribank);
				break;
			case "2":
				System.out.println("계좌목록 열람메뉴입니다");
				Accountlists(wooribank);
				break;

			case "3":
				System.out.println("입금메뉴입니다.");
				deposit(inputStr, inputStr, wooribank);
				break;

			case "4":
				System.out.println("출금 메뉴입니다.");
				withdraw(inputStr, inputStr, wooribank);
				break;

			case "5":
				System.out.println("계좌 이체 메뉴입니다.");
				break;

			case "0":
				System.out.println("종료");
				run = false;
				break;
			default:
				System.out.println("0~5까지 숫자만 입력하세요");
			}// switch

		} // while
	}// menu

	private void withdraw(Scanner inputStr, Scanner inputInt, AccountDTO[] wooribank) {
		System.out.println("----출금----");
		System.out.print("계좌번호: ");
		String ano = inputStr.next();
		
		System.out.println("출금액: ");
		int money = inputInt.nextInt();
		
		AccountDTO inputaccount = findAccount(ano, wooribank);
		if (inputaccount ==null) {
			System.out.println("해당 계좌번호를 찾을 수 없습니다");
			return;
			
		}
		inputaccount.setBalance(inputaccount.getBalance()-money);
		System.out.println("출금 처리 후 결과: "+inputaccount.getBalance()+"원");
		System.out.println("--------------------------");
	}

	private void deposit(Scanner inputStr,Scanner inputInt,AccountDTO[] wooribank) {
		System.out.println("-----입금-----"); 
		System.out.print("계좌번호: ");
		String ano = inputStr.next();
		
		System.out.println("입금액: ");
		int money = inputInt.nextInt();
		
		AccountDTO inputaccount = findAccount(ano,wooribank);
		
		if(inputaccount ==null) {
			System.out.println("해당 계좌번호를 찾을 수 없습니다");
			return;
		}
		inputaccount.setBalance(inputaccount.getBalance()+money);
		System.out.println("입금 처리 후 결과: "+inputaccount.getBalance()+"원");
		System.out.println("--------------------------");
		
	}

	private AccountDTO findAccount(String ano, AccountDTO[] wooribank) {
		AccountDTO account = null;
		for(int i=0;i<wooribank.length;i++) {
			if(wooribank[i]!=null) {
				String dbAno = wooribank[i].getAno();
				
				if(dbAno.equals(ano)) {
					account = wooribank[i];
					break;
				}
			}
		}
		return account;
	}

	private void Accountlists(AccountDTO[] wooribank) {
		System.out.println("------우리은행 계좌목록------");
		for (int i = 0; i < wooribank.length; i++) {
			AccountDTO accountlist = wooribank[i];
			if (accountlist != null) {
				System.out.print("계좌번호: " + accountlist.getAno());
				System.out.print("\t");
				System.out.print("예금주: " + accountlist.getOwner());
				System.out.print("\t");
				System.out.println("계좌 잔액: " + accountlist.getBalance());
				System.out.print("\t\n");
				System.out.println("------------------------");

			}//if
		}//for

	}//Accountlist method

	private void crateAccount(Scanner inputInt, Scanner inputStr, AccountDTO[] wooribank) {
		System.out.println("계좌개설 메뉴입니다");
		AccountDTO myAccount = new AccountDTO();

		System.out.println("계좌번호: ");
		myAccount.setAno(inputStr.next());

		System.out.println("계좌 주: ");
		myAccount.setOwner(inputStr.next());

		System.out.println("초기 입금 액: ");
		myAccount.setBalance(inputInt.nextInt());
		myAccount.setBankname("우리은행");

		for (int i = 0; i < wooribank.length; i++) {
			if (wooribank[i] == null) {
				wooribank[i] = myAccount;
				System.out.println("계좌개설 내역: " + wooribank[i]);
				break;
			} // if
		} // for
		System.out.println("계좌가 정상적으로 개설되었습니다.");

	}// createAccount
}// class
