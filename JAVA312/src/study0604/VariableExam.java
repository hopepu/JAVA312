package study0604;

public class VariableExam {

	public static void main(String[] args) {
		// 리터럴 값을 변수로 출력하는 학습
		
		int mach;
		int distance;
		mach = 340;
		distance = mach *60 *60;
		System.out.println("소리가 1시간 동안 가는 거리 : " + distance + "m");
		// 정수 리터럴 계산 후 출력 -> 정수는 21억까지 계산 가능
		
		double radius; // double -> 실수 표현 변수(소수점 계산용)
		double area;
		radius = 10;
		area = radius * radius * Math.PI;
		System.out.println("반지름이 " + radius + "인 원의 넓이는 "+ area + "m^2");
		
		char firstName; // 문자 표현 타입 -> "(문자열) '(문자)
		char midName;
		char lastName;
		firstName = '조';
		midName = '용';
		lastName  = '재';
		System.out.print(firstName);
		System.out.print(midName);
		System.out.print(lastName);

		
		
		

	}

}
