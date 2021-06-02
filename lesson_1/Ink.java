
public class Ink {

	private int inkCount;
	
	public Ink() {
		inkCount = 3;
	}
	
	public void useInk() {
		System.out.println("남은 잉크 수량: " + --inkCount);
	}
}
