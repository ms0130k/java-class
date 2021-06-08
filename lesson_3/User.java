package lesson_3;

public class User {

	public static void main(String[] args) {
		Printer pt = new Printer(true);
		pt.checkPower();
		
		pt.print("냐하하");
		pt.print("냐하하");
		pt.print("냐하하");
		pt.print("냐하하");
		
		//Printer와 Ink 클래스를 분석해서 네번째 "냐하하"도 출력시켜보세요.
	}

}
