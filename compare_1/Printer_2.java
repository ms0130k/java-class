package lesson_1;

public class Printer_2 {
	
	private boolean power;
	
	Printer_2() {
		power = false;
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
		Ink ink = new Ink();
		ink.useInk();
		System.out.println("출력 시작");
		System.out.println("<<" + str + ">>");
		System.out.println("출력 끝");
	}
}
