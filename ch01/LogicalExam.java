package ch01;

import java.util.Scanner;

public class LogicalExam {

	public static void main(String[] args) {

		String loginid = "dn";
		String loginpw = "wf";

		Scanner input = new Scanner(System.in);

		System.out.print("id�� �Է��ϼ���:");
		String id = input.nextLine();
		System.out.println("�Է��Ͻ� ���̵��" + id + "�Դϴ�");

		System.out.println("�α����� ��ȣ�� �Է��ϼ���:");
		String pw = input.nextLine();
		System.out.println("---�α�����---");

		if ((loginid.equals(id) & (loginpw.equals(pw)))) {
			System.out.println("Ȯ�����Դϴ�.");
			System.out.println("�α��εǾ����ϴ�.");
		} else {
			System.out.println("id�� ��й�ȣ�� �ٽ� Ȯ�����ּ���");
			System.out.println("�α��ν���");
		}
	}

}