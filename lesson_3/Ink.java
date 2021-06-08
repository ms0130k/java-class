package lesson_3;

public class Ink {

	private int inkCount;
	
	public Ink() {
		inkCount = 3;
	}
	
	public void charge(int inkCount) {
		this.inkCount += inkCount;
		displayInkCount();
	}
	
	public boolean existInk() {
		boolean result = false;
		if (inkCount > 0) {
			result = true;
		}
		return result;
	}
	
	public void useInk() {
		--inkCount;
		displayInkCount();
	}
	
	public void displayInkCount() {
		System.out.println("남은 잉크 수량: " + inkCount);
	}
}
