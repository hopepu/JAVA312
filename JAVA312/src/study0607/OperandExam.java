package study0607;

public class OperandExam {

	public static void main(String[] args) {
//		단항 연산자는 항이 한개로 처리하는 연산 기법
//		부호 연산자(+,-) -> 양수, 음수
//		증감 연산자(++, --) -> 값이 1씩 증가 감소
//		논리 부정 연산자(!) -> True -> False
//		비트 반전 연산자(~) -> 0=>1 , 1=>0
		
		int x = -100;
		int result1 = +x ;
		int result2 = -x ;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("===================");
		
		int a = 10;
		int b = 10;
		int c = 0;
		
		a++;
		++a;
		System.out.println("a = " + a);
		System.out.println("===================");
		
		b--;
		--b;
		System.out.println("b = " + b);
		System.out.println("===================");
		
		c = a++;
		System.out.println("a = " + a);
		System.out.println("c = " + c);
		System.out.println("===================");
		
		c = ++a;
		System.out.println("a = " + a);
		System.out.println("c = " + c);
		System.out.println("===================");
		
		c = ++a + b++;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("===================");
		
		boolean play = true;
		System.out.println("실행중 : " + play);
		
		play = !play;
		System.out.println("실행중 : " + play);
		
		play = !play;
		System.out.println("실행중 : " + play);
		
		
	}

}
