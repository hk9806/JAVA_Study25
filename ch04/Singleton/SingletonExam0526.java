package ch04.Singleton;

public class SingletonExam0526 {

	public static void main(String[] args) {
//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton();

		Singleton obj3 = Singleton.getInstance();
		Singleton obj4 = Singleton.getInstance();

		if (obj3 == obj4) {
			System.out.println("같은 싱글톤 객체");
		} else {
			System.out.println("다른 싱글톤 객체");
		}
	}

}
