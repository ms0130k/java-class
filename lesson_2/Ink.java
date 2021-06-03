public class Ink {

	private int inkCount;
	
	public Ink() {
		inkCount = 3;
	}
	
	public boolean useInk() {
		boolean existInk;
		if (inkCount > 0) {
			inkCount--;
			existInk = true;
		} else {
			System.out.println("잉크가 모자랍니다.");
			existInk = false;
		}
		System.out.println("남은 잉크 수량: " + inkCount);
		return existInk;
	}
	
	public void chargeInk(int count) {
		inkCount += count;
		System.out.println("남은 잉크 수량: " + inkCount);
	}
}
