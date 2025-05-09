package ch01;

public class StringExam {

	public static void main(String[] args) {
		String str1="È«°æÈÆ";
		String str2="È«°æÈÆ";
		String str3= new String("È«°æÈÆ");
		System.out.println(str1==str2);
		System.out.println(str1==str3);//µ¿ÀÏÇÑ ¹øÁö
		System.out.println("-------------");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));//µ¿ÀÏ °ª
		

	}

}
