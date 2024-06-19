package study0616;

public class Object01 {

	public static void main(String[] args) {
		
		Student st0bj1 = new Student();
		st0bj1.id = 20221104;
		st0bj1.name = "홍길순";
		st0bj1.printInfo();
		
		Student st0bj2 = new Student();
		st0bj2.insertRecord(20021005,"홍길동");
		st0bj2.printInfo();
				

	}

}
