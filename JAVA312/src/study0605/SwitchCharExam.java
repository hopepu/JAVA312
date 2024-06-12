package study0605;

import java.util.Scanner;

public class SwitchCharExam {

	public static void main(String[] args) {
//		switch문은 동등비교 연산자로 문자(char)도 동등비교할 수 있다.
		
		Scanner inChar = new Scanner(System.in);
		
		System.out.print("회원 등급을 입력하세요 (A~C) : ");
		
		char gradeChaStr = inChar.next().charAt(0);
		
		System.out.println("검증 코드용(1줄)	 : " + gradeChaStr);
		
		switch(gradeChaStr) {
		
		}
		
		
	}
}
