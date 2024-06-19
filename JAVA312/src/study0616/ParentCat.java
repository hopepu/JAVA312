package study0616;

class ParentCat {
	public String breed = "샴 고양이";
	void methodParentCat() {
		System.out.println("어미고양이");
	}
	

}

class Kitten extends ParentCat{
	void methodKitten() {
		System.out.println("아기고양이");
	}
}