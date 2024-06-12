package study0610;

import java.util.Scanner;

public class LogicalOperatorExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하시면 대소문자나 숫자를 판단합니다. :");
		int charCode = input.nextInt();
		if((charCode>=65) & (charCode<=90)) {
			System.out.println("입력값은 대문자 입니다. : " + ((char)charCode));
		} else if((charCode>=97) & (charCode<=122)) {
			System.out.println("입력값은 소문자 입니다. : " + ((char)charCode));
		} else if((charCode>=49) & (charCode<=58)) {
			System.out.println("입력값은 숫자 입니다. : " + ((char)charCode));
		} else {
			System.out.println("대문자나 숫자가 아닙니다.");
		}
	}

}
