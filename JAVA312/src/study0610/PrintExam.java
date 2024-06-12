package study0610;

import java.util.Scanner;

public class PrintExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = input.next();
		System.out.print("나이 : ");
		int age = input.nextInt();
		System.out.print("평균 : ");
		Double ave = input.nextDouble();
		
		System.out.printf("현재 당신의 이름은 %s\n 당신의 나이는 %d\n 당신의 평균은 %5.2f\n입니다.",name, age, ave);
		

	}

}
