package ch02;

public class RandomExam0512 {

	public static void main(String[] args) {

		int num = (int)(Math.random()*6+1);
		if (num == 1) {
			System.out.println("1번.");

		}else if (num==2) {
			System.out.println("2번");
			
		}else if (num==3) {
			System.out.println("3번.");
			
		}else if (num==4) {
			System.out.println("4번.");
		
		}else if (num==5) {
			System.out.println("5번.");
		
		}else if (num==6) {
			System.out.println("6번.");
		}
		System.out.println("--------------------");
		
		int num1=(int)(Math.random()*45)+1;
		int num2=(int)(Math.random()*45)+1;
		int num3=(int)(Math.random()*45)+1;
		int num4=(int)(Math.random()*45)+1;
		int num5=(int)(Math.random()*45)+1;
		int num6=(int)(Math.random()*45)+1;
		
		System.out.println(num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6);

	}

}
