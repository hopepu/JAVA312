package study0613;

import java.util.Scanner;

public class ExtandSwitchExam {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("찾은 동물의 이름을 입력하세요 >>>");
		String Monster = in.next();
		
		String kind = whoIsIt(Monster);
		System.out.printf("%s는 %s 이다. \n", Monster, kind);
		
		
				

	}
	
	static String whoIsIt(String Monster) {
		String kind = "who are you?";
		switch(Monster) {
		case "호랑이", "사자", "강아지", "고양이" -> kind = "포유류";
		case "독수리", "참새", "비둘기", "까마귀" -> kind = "조류";
		case "고등어", "삼치", "갈치", "참치" -> kind = "어류";
		case "킹크랩", "대게", "새우", "딱새우" -> kind = "갑각류";
		case "매미", "잠자리", "메뚜기", "개미" -> kind = "곤충";
		default -> System.out.println("아이쿠!!!!!!!");
		}
		 return kind;
	}

}
