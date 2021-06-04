package lesson_1;

public class User {

	public static void main(String[] args) {
		
		Printer_1 pt_1 = new Printer_1();
		pt_1.powerOn();
		pt_1.print("출력테스트");
		pt_1.print("출력테스트");
		pt_1.print("출력테스트");
		pt_1.print("출력테스트");
		
		Printer_2 pt_2 = new Printer_2();
		pt_2.powerOn();
		pt_2.print("출력테스트2");
		pt_2.print("출력테스트2");
		pt_2.print("출력테스트2");
		pt_2.print("출력테스트2");

		
	}
}
