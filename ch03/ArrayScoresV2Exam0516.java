package ch03;

import java.util.Scanner;

public class ArrayScoresV2Exam0516 {

	public static void main(String[] args) {
		Scanner mainSC = new Scanner(System.in);
		int select = 0;
		System.out.println("초기작업: 학생 수를 입력하세요.");
		System.out.print(">>");
		int count = mainSC.nextInt();// 학생수 등록
		String[] name = new String[count];// 학생수로 이름테이블 생성

		byte[] engScores = new byte[count];// 학생수로 영어 성적 테이블 생성
		byte[] korScores = new byte[count];// 학생수로 국어 성적 테이블 생성
		int[] totalScores = new int[count];// 학생수로 총점 성적 테이블 생성
		double[] avgScores = new double[count];// 학생수로 평균 성적 테이블 생성

		boolean run = true;
		while (run) {
			System.out.println("---------성적관리TEST---------");
			System.out.println("1.학생관리|2.성적관리|3.통계|0.종료");
			System.out.println("----------------------------");
			System.out.print(">>");
			select = mainSC.nextInt();

			switch (select) {

			case 1 -> student(name);

			case 2 -> scores(engScores, korScores, name);

			case 3 -> totalScores(totalScores, engScores, korScores, name);

			case 0 -> {
				System.out.println("프로그램을 종료합니다");
				run = false;
			} // case 0 end

			}// switch end
		} // while end

	}// main end

	public static String[] student(String[] name) {
		//학생 관리용
		Scanner studentSC = new Scanner(System.in);
		
		boolean run = true;
		while (run) {
			System.out.println("------------학생관리-------------");
			System.out.println("1.등록|2.보기|3.수정|4.삭제|5.메인메뉴");
			System.out.println("------------------------------");
			System.out.print(">>");
			int select = studentSC.nextInt();
			switch(select) {
			case 1:
				System.out.println("학생등록을 시작합니다.");
				System.out.println("총 학생 수는"+name.length);
				for(int i =0; i<name.length;i++) {
					System.out.println(i+1+" 번째 학생의 이름을 입력하세요");
					name[i] = studentSC.next();
				}//for
				System.out.println("학생 등록 완료");
				break;
			case 2:
				System.out.println("학생 명부를 불러옵니다.");
				System.out.println("총 학생 수는 "+name.length);
				
				for(int i =0;i<name.length;i++) {
					System.out.println((i+1)+"번: "+name[i]);
				}//for
				break;
			case 3:
				System.out.println("학생 이름 수정");
				System.out.print("수정할 학생 번호를 입력하세요: ");
				int nameNum = studentSC.nextInt();
				System.out.print("수정할 학생 이름을 입력하세요: ");
				String nameMOD = studentSC.next();
				name[nameNum-1]=nameMOD;
				System.out.println("수정완료");
				break;
			case 4:
				System.out.println("삭제할 학생 번호를 입력하세요");
				int deleteNum = studentSC.nextInt();
				name[deleteNum-1]=null;
				break;
			case 5:
				System.out.println("메인메뉴로 돌아갑니다.");
				run = false;
				break;
				default:
					System.out.println("입력값 오류: 1~4번만 입력하세요");
			}//switch
		}//while
		return name;
	}//String student method

	private static Object scores(byte[] engScores, byte[] korScores, String[] name) {
		// 성적관리용 부 메뉴
		Scanner studentSC = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("-----성적관리 메뉴-----");
			System.out.println("1.영어|2.국어|3.메인메뉴");
			System.out.println("-------------------");
			System.out.print(">>");
			
			int select = studentSC.nextInt();
			switch(select) {
			case 1:
				scores(engScores,name);
				break;
			case 2:
				scores2(korScores,name);
				break;
			case 3:
				System.out.println("메인메뉴롷 돌아갑니다");
				run=false;
				break;
				default:
					System.out.println("입력값 오류:1~3번만 입력해주세요 ");
			}//switch
		}//while
		return null;
	}//scores

	private static void scores2(byte[] korScores, String[] name) {
		Scanner studentSC = new Scanner(System.in);
		
		boolean run =true;
		while (run) {
			System.out.println("----------국어성적 메뉴----------");
			System.out.println("1.등록|2.보기|3.수정|4.삭제|5.성적관리");
			System.out.println("-----------------------------");
			System.out.print(">>");
			
			int select = studentSC.nextInt();
			switch (select) {
			case 1:
				System.out.println("국어성적등록을 시작합니다.");
				for(int i=0;i<korScores.length;i++) {
					System.out.println(name[i]+"학생의 성적을 입력하세요");
					korScores[i]=studentSC.nextByte();
				}//for
				System.out.println("국어성적 등록완료");
				break;
			case 2:
				System.out.println("국어 성적을 불러옵니다.");
				for (int i =0;i<korScores.length;i++) {
					int rank = 1;
					for(int a=0;a<korScores.length;a++) {
						if(korScores[i]<korScores[a]) {
							rank++;
						}//if
					}//rank_for
					System.out.println(name[i]+"학생은"+korScores[i]+"점 이고, 등수는"+rank+"위입니다");
				}//for
				int max = korScores[0], min = korScores[0];
				for (int i=1;i<korScores.length;i++) {
					if (korScores[i]>max) {
						max = korScores[i];
					}else if (korScores[i]<min) {
						min = korScores[i];								
					}//if
				}//for
				System.out.println("최고점은 "+max+"점 입니다.");
				System.out.println("최하점은 "+min+"점 입니다.");
				break;
			case 3:
				System.out.println("국어 성적 수정: ");
				System.out.println("수정할 학생 번호를 입력하세요");
				int nameNum = studentSC.nextInt();
				System.out.println("수정할 "+name[nameNum-1]+"의 국어 성적은"+korScores[nameNum-1]);
				System.out.println("수정할 국어 성적을 입력하세요");
				byte korGRADE = studentSC.nextByte();
				korScores[nameNum-1]=korGRADE;
				System.out.println("수정완료");
				break;
			case 4:
				System.out.println("삭제할 학생 번호를 입력하세요");
			 int deleteNum = studentSC.nextInt();
			 korScores[deleteNum-1]=0;
			 break;
			case 5:
				System.out.println("성적관리 메뉴로 돌아갑니다.");
				run = false;
				break;
				default:
					System.out.println("입력값 오류: 1~4번만 입력하세요.");
			}//switch
		}//while
		return;
	}//scores2 method

	private static void scores(byte[] engScores, String[] name) {
		Scanner studentSC = new Scanner(System.in);
		
		boolean run =true;
		
		while(run) {
			System.out.println("-------------영어성적------------");
			System.out.println("1.등록|2.보기|3.수정|4.삭제|5.성적관리");
			System.out.println("-------------------------------");
			System.out.print(">>");
			
			int select = studentSC.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("영어 성적 등록");
				for(int i=0; i<engScores.length;i++) {
					System.out.println(name[i]+"학생의 성적을 입력하세요");
					engScores[i]=studentSC.nextByte();
				}//키보드로 문자갑을 배열[i]에 입력
				System.out.println("영어성적 등록완료");
				break;
			case 2:
				System.out.println("영어 성적을 불러옵니다.");
				for (int i = 0;i<engScores.length;i++){
					int rank =1;
					for (int a=0; a<engScores.length;a++) {
						if(engScores[i]<engScores[a]) {
							rank++;
						}//if
					}//for
					System.out.println(name[i]+"학생은"+engScores[i]+"점 이고, 등수는"+rank+" 위 입니다.");
				}//for_2
				int max = engScores[0],min=engScores[0];
				for(int i =1;i<engScores.length;i++) {
					if(engScores[i]<max) {
						max=engScores[i];
					}else if (engScores[i]<min) {
						min = engScores[i];
					}//if
				}//for
				System.out.println("최고점은"+max+"점 입니다.");
				System.out.println("최하점은"+min+"점 입니다.");
				break;
			case 3:
				System.out.println("영어 성적 수정: ");
				System.out.println("수정할 학생 번호를 입력하세요.");
				int nameNum = studentSC.nextInt();
				System.out.println("수정할" +name[nameNum-1]+"의 영어 성적은"+engScores[nameNum-1]);
				System.out.println("수정할 영어 성적을 입력하세요: ");
				byte engGRADE = studentSC.nextByte();
				engScores[nameNum-1] = engGRADE;
				System.out.println("수정완료");
				break;
			case 4:
				System.out.println("삭제할 학생 번호를 입력하세요");
				int deleteNum = studentSC.nextInt();
				engScores[deleteNum-1]=0;
				break;
			case 5:
				System.out.println("메인메뉴로 돌아갑니다");
				run = false;
				break;
				default:
				System.out.println("입력갑 오류: 1~5번만 입력하세요.");
			}//switch
		}//while
		
	}//score-2

	private static Object totalScores(int[] totalScores, byte[] engScores, byte[] korScores, String[] name) {
	 Scanner studentSC = new Scanner(System.in);
	 boolean run = true;
	 while (run){
		 System.out.println("------------성적관리 메뉴------------");
		 System.out.println("1.전체 성적처리|2.개인 성적 검색|3.메인메뉴");
		 System.out.println("---------------------------------");
		 System.out.print(">>");
		 int select = studentSC.nextInt();
		 switch(select) {
		 case 1:
			 totalScores2(totalScores,engScores,korScores,name);
			 break;
		 case 2:
			 searchScores2(totalScores,engScores,korScores,name);
			 break;
		 case 3: 
			 System.out.println("메인메뉴로 돌아갑니다.");
			 run = false;
			 break;
			 default:
				System.out.println("입력값 오류: 1~3번만 입력.");
		 }//switch
	 }//while
		return null;
	}//total method

	private static void totalScores2(int[] totalScores, byte[] engScores, byte[] korScores, String[] name) {
		System.out.println("-------전체 성적을 처리합니다.-------");
		System.out.println("개개인의 영어 성적과 국어 성적을 합산합니다.");
		
		for (int i = 0;i<totalScores.length;i++) {
			totalScores[i] = engScores[i]+korScores[i];
			System.out.println(name[i]+"학생의 총 점: "+totalScores[i]);
		}//for 
		int max = totalScores[0],min = totalScores[0];
		for(int i=0; i<totalScores.length;i++) {
			if (totalScores[i]>max){
				max = totalScores[i];
			}else if (totalScores[i]<min) {
				min = totalScores[i];
			}//if
		}//for2
		System.out.println("최고총점은 "+(max/2)+"점 이고, 최하총점은 "+(min/2)+"입니다");
		System.out.println("전체 학생의 총점과 평균이 처리되었습니다.");
		
	}//totalScore2 method

	private static void searchScores2(int[] totalScores, byte[] engScores, byte[] korScores, String[] name) {
		Scanner studentSC = new Scanner(System.in);
		System.out.println("검색하실 학생의 번호를 입력해주세요");
		System.out.print(">>>");
		
		int i = studentSC.nextInt();
		
		System.out.println(name[i-1]+"학생의 성적");
		System.out.println("영어점수: "+engScores[i-1]);
		System.out.println("국어점수: "+korScores[i-1]);
		System.out.println("총 점수: "+totalScores[i-1]+"점");
		System.out.println("평균점수: "+totalScores[i-1]/2+"점");
		
		int rank =1;
		
		for(int a=0;a<totalScores.length;a++) {
			if (totalScores[i-1]<totalScores[a]) {
				rank ++;
			}//if
		}//for
		System.out.println("클래스에서의 순위는: "+rank+"위 입니다.");
		
	}//SearchScores2 method

}// class end
