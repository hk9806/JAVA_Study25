package ch01;

public class 삼항연산 {

	public static void main(String[] args) {
		int sco = 91;
		char gra = (sco >= 90) ? 'A' : ((sco >= 80) ? 'B' : 'C');
		System.out.println(sco + "점은 " + gra + " 등급입니다");
		
		
		int point = 180;
		char po = (point >=150)?'A':((point>=100)?'B':'C');
		System.out.println(point+"점은"+po+"등급입니다");
	}

}
