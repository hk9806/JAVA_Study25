package ch04;

public class ThisExam0522 {

	public static void main(String[] args) {
	
		This mycar1 = new This(null);
		System.out.println("mycar1.company: "+mycar1.company);
		System.out.println();
		
		This mycar2 = new This("자가용");
		System.out.println("mycar2.company: "+mycar2.company);
		System.out.println("mycar2.model: "+mycar2.model);
		System.out.println();

		This mycar3 = new This("SUV","빨강");
		System.out.println("mycar3.company: "+mycar3.company);
		System.out.println("mycar3.model: "+mycar3.model);
		System.out.println("mycar3.color: "+mycar3.color);
		System.out.println();
		
		This mycar4 = new This("SuperCar","검정",400);
		System.out.println("mycar4.company: "+mycar4.company);
		System.out.println("mycar4.model: "+mycar4.model);
		System.out.println("mycar4.color: "+mycar4.color);
		System.out.println("mycar4.maxSpeed: "+mycar4.maxSpeed);
		System.out.println();
	System.out.println("--------------------------------------");	
		This myCar1 = new This(null);
		System.out.println("myCar1.company: "+myCar1.company);
		System.out.println();
		
		This myCar2 = new This("자가용");
		System.out.println("myCar2.company:"+myCar2.company);
		System.out.println("myCar2.model: "+myCar2.model);
		System.out.println();
		
	}

}
