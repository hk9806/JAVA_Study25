package ch04.computer;

public class computer {
	int sum1(int[] values) {
		int sum = 0;
		for(int i =0; i<values.length;i++) {
			sum+=values[i];
			
		}
		return sum;
		
	}
	int sum2(int...values) {//매게값을 확인하여 ㅐ열 생성
		int sum = 0;
		for(int i =0;i<values.length;i++) {
			sum+=values[i];
					
		}
		return sum;
	}
}
