package lesson_1;

public class Printer_1 {
	
	private boolean power;
	Ink ink;
	
	Printer_1() {
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
		ink.useInk();
		System.out.println("출력 시작");
		System.out.println("<<" + str + ">>");
		System.out.println("출력 끝");
	}
}
