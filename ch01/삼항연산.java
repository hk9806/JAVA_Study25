package ch01;

public class 삼항연산 {

	public static void main(String[] args) {
		int sco = 91;
		char gra = (sco >= 90) ? 'A' : ((sco >= 80) ? 'B' : 'C');
		System.out.println(sco + "���� " + gra + " ����Դϴ�");
		
		
		int point = 180;
		char po = (point >=150)?'A':((point>=100)?'B':'C');
		System.out.println(point+"����"+po+"����Դϴ�");
	}

}
