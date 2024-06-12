package study0604;

public class Variable {

	public static void main(String[] args) {
		// 변수의 사용범위를 알아보자.
		// 변수는 괄호 안에서만 효력이 발생한다. 
			int v1 = 15;
			int v2 = 0;
				if(v1>10) {
					v2 = v1 +10;
				}
			int v3 = v1 + v2 + 5;
			System.out.println(v1);
			System.out.println(v2);
			System.out.println(v3);

	}

}
