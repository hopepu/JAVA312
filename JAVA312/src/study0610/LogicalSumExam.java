package study0610;

import java.util.Scanner;

public class LogicalSumExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하시면 배수를 판단할 수 있습니다.");
		int value = input.nextInt();
		
		if((value%2==0)||(value%3==0)) {
			System.out.println("입력된 값은 2의 배수이거나 3의 배수입니다.");
		} else {
			System.out.println("입력된 값은 2나 3의 배수가 아닙6니다.");
		}

	}

}
