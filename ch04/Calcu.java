package ch04;

public class Calcu {//계산기 프로그램
	//메서드 오버로딩 실습
	double areaRectangle(double width) {
		return width*width;
	}//정사각형의 넓이(가로세로의 길이가 같아 1개만 받음)
	
	double areaRectangle(double width, double height) {
		return width*height;
	}

}
