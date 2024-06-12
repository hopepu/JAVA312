package study0605;

public class ByteExam {

	public static void main(String[] args) {
//		byte 타입은 8bit 처리용 타입으로 -128 ~ +127까지의 범위(0포함)을 처리한다.
//		색상정보 cgb, cmvk등 처리용
//		파일 업로드, 다운롣, 그림 사운드 등에 사용
		
		byte var1 = -128;
		byte var2 = 127;
		byte var3 = 0;
//		byte var4 = -129; 범위를 초과하엿기에 오류
//		byte var5 = 128; 범위를 초과하엿기에 오류
		
//		범위를 초과하는 계산을 하게되면 로테이션 한다.
		byte var6 = 125;
		int var7 = 125;
		for(int i=0; i<5; i++) {
//			i가 0부터 5미만으로 1씩 증가해서 반복실행 0 > 1 > 2 > 3 > 4
			var6++;
//			var6값에 1씩 증가
			var7++;
//			var7값에 1씩 증가
			System.out.println("var6 값 : " + var6 + "    var7 값 : " + var7);
		}

	}

}
