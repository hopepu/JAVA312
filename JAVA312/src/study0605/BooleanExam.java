package study0605;

public class BooleanExam {

	public static void main(String[] args) {
		// 1byte(8bit)값을 갖는다. 참/거짓 처리용
		// 컴퓨터는 if문을 이용해서 참과 거짓을 처리하는데 활용됨
		// "false"는 문자열이고 false 는 거짓 값을 표현
		
		boolean stop = false;
//		stop 변수에 거짓 값을 갖는다.
		boolean start = true;
//		start 변수에 참 값을 갖는다.
		
		if(stop) {
			System.out.println("정지합니다.");
		} else {
			System.out.println("출발합니다.");
		}
		
		if(start) {
			System.out.println("출발합니다.");
//			true
		} else {
			System.out.println("정지합니다");
//			거짓
		}

	}

}
