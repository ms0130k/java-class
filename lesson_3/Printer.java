package lesson_3;

import lesson_3.Ink;

public class Printer {
	
	private boolean power;
	Ink ink;
	
	public Printer() {
		power = false;
		ink = new Ink();
	}
	
	public Printer(boolean power) {
		this();
		this.power = power;
	}
	
	public boolean checkPower() {
		if (power == true) {
			System.out.println("전원상태: ON");
		} else {
			System.out.println("전원상태: OFF");
		}
		return this.power;
	}
	
	public void changeInk(Ink ink) {
		this.ink = ink;
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
		if (!ink.existInk()) {
			System.out.println("잉크가 없습니다. 교체해주세요.");
			return;
		}
		ink.useInk();
		System.out.println("출력 시작");
		System.out.println("<<" + str + ">>");
		System.out.println("출력 끝");
	}
}
