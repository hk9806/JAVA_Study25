package ch01;

public class 비트반전연산자 {

	public static void main(String[] args) {
		
		int v1 =10; //int v1�� 10
		int v2= ~v1; //int v2�� 10 ��Ʈ ����
		int v3 =~v1+1; //int v2���� +1
		
		System.out.println(toBinaryString(v1)+"(십진수 : "+v1+")");
		System.out.println(toBinaryString(v2)+"(십진수 : "+v2+")");
		System.out.println(toBinaryString(v3)+"(십진수 : "+v3+")");
		
		int v4=-10;
		int v5=~v4;
		int v6=~v4+1;
		
		System.out.println(toBinaryString(v4)+"(십진수 : "+v4+")");
		System.out.println(toBinaryString(v4)+"(십진수 : "+v5+")");
		System.out.println(toBinaryString(v4)+"(십진수 : "+v6+")");
		
	}

	private static String toBinaryString(int value) {
		//9���ٿ� �ִ� v1���� �Է¹޾� 2�� 32���� ���ڷ� ����ϱ� ���� �޼ҵ�
		String str = Integer.toBinaryString(value); //������ 2������ ��ȯ �޼ҵ�
		while (str.length()<32) { //str�� ���� ���̰� 32���� ������ �ݺ�
			str = "0" + str; //32���� �����϶� ���ھտ� 0�� ����
		}
		return str; //����� ��ȯ
	}

	
	}


