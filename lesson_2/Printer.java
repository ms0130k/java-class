
public class Printer {
	
	private boolean power;
	Ink ink;
	
	Printer() {
		power = false;
		ink = new Ink();
	}
	
	public boolean checkPower() {
		if (power == true) {
			System.out.println("전원상태: ON");
		} else {
			System.out.println("전원상태: OFF");
		}
		return this.power;
	}
	
	public void powerOn() {
		power = true;
	}
	
	public void powerOff() {
		power = false;
	}
	
	public void print(String str) {
		if (power == false) {
			System.out.println("전원을 켜주세요.");
			return;
		}
		boolean existInk = ink.useInk();
		if (existInk) {
			System.out.println("출력 시작");
			System.out.println("<<" + str + ">>");
			System.out.println("출력 끝");
		}
	}
	
	public void chargeInk(int count) {
		ink.chargeInk(count);
	}
}
