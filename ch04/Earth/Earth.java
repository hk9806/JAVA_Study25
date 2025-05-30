package ch04.Earth;

public class Earth {
	//상수 선언 후 정적블럭을 사용하여 계산식 작성
	//Math.PI도 Math라는 내장된 라이브러리에 PI값을 상수로 가지고 있다.
	//PI값과 같은 정확한 계산을 위해서는 Math라이브러리에 있는 상수를 활용
	
	//static final double PI = 3.14159;
	static final double PI = Math.PI;
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4*PI*EARTH_RADIUS*EARTH_RADIUS;		
	}
}
