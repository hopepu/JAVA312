package study0607;

public class ArithmticExam {

	public static void main(String[] args) {
//		이항 연산자는 2개의 항으로 계산되어 결과를 산출한다.
//		사칙연산 + 나머지계산 등에 활용
//		자동타입 변환으로 큰 타입으로 변겸됨.
		
		int v1 = 5;
		int v2 = 2;
		int result1 = v1 + v2;
		System.out.println("result1 = " + result1);

		int result2 = v1 - v2;
		System.out.println("result2 = " + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3 = " + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4 = " + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5 = " + result5);
		
		double result6 = v1 / v2;
		System.out.println("result6 = " + result6);
		
		double result7 = (double) v1 / v2;
		System.out.println("result7 = " + result7);
//		강제타입변환 + 자동타입 변환 (int + double -> double + double = double)
//		2.5
//		나누기 할 때 주의사항 -> 소수점 계산
		
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println("백만 * 백만 : " + z);
//		자동변환이 안되어 계산 결과 오류
		long zl = (long)x * y;
		System.out.println("long 강제 + 자동타입 변환 : " + zl);
		
		System.out.println("소수점 정확한 계산은 float, double?");
//		정확한 계산은 부동소수점 (실수) 타입은 사용하지 않는 것이 좋다.
//		사과 1개를 0.1 단위인 10조각으로 보고(piece) 그 중 7개의 조각(0.7)을 뺀 3조각(0.3) 계산
		
		int appleINT = 1 ; 
		int totalPieces = appleINT * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		double resultInt = temp;
		
		System.out.println("사과 1개에서  0.7조각을 빼면 : " + resultInt);
		
		int eng = 90;
		int sol = 80;
		int total = eng + sol;
		
		System.out.println("영어 점수 : " + eng);
		System.out.println("사회 점수 : " + sol);
		System.out.println("총점 : " + total);
		System.out.println((90+80)/2 + " : 평균");
		System.out.println((eng + sol)/2 + " : 평균");
				
		
				

	}

}
