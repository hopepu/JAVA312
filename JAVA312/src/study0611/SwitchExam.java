package study0611;

public class SwitchExam {
	
	public static void main(String[] args) {
//		switch는 동등비교문으로 같은 값을 찾아 처리를 한다.
//		동등비교값이 많은 경우에 활용
		
		int num = (int)(Math.random()*6)+1;
		
		switch(num) {
		case 1 :
			System.out.println("1번 주사위가 나왔습니다.");
			break;
		case 2 :
			System.out.println("2번 주사위가 나왔습니다.");	
			break;
		case 3 :
			System.out.println("3번 주사위가 나왔습니다.");
			break;
		case 4 :
			System.out.println("4번 주사위가 나왔습니다.");
			break;
		case 5 :
			System.out.println("5번 주사위가 나왔습니다.");
			break;
		case 6 :
			System.out.println("6번 주사위가 나왔습니다.");
			break;
		default :
			System.out.println("프로그램 오류로 주사위가 고장남, 수리요망");
			System.out.println("개발자 이메일 : whdydwo2@gmail.com");
			System.out.println("버그 제공 시 기프티콘을 쏴드립니다.");
			
			
		} // switch 종료
		
	} //main 종료

} //class 종료
