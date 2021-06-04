package constructor;

public class Human {

	private String name;
	private int height;
	
	public Human() {
		System.out.println("Human 파라미터 없는 생성자 실행");
	}
	
	public Human(String name, int height) {
		/*
		 * 생성자
		 * new 연산자로 객체 생성시에만 실행됨
		 * 리턴 타입이 없다.
		 */
		System.out.println("Human 생성자 실행: " + name);
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
