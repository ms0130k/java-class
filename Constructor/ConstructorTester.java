package constructor;

public class ConstructorTester {

	public static void main(String[] args) {

		Human hm_1 = new Human("동현", 174);
		int hm_1_height = hm_1.getHeight();
		String hm_1_name = hm_1.getName();
		
		System.out.println("이름: " + hm_1_name + ", 키: " + hm_1_height);
		
		Human hm_2 = new Human("진홍", 178);
		int hm_2_height = hm_2.getHeight();
		String hm_2_name = hm_2.getName();
		
		System.out.println("이름: " + hm_2_name + ", 키: " + hm_2_height);
		
		Human hm_3 = new Human();
		int hm_3_height = hm_3.getHeight();
		String hm_3_name = hm_3.getName();
		
		System.out.println("이름: " + hm_3_name + ", 키: " + hm_3_height);
		
		hm_3.setName("새이름");
		hm_3.setHeight(185);
		hm_3_height = hm_3.getHeight();
		hm_3_name = hm_3.getName();
		System.out.println("이름: " + hm_3_name + ", 키: " + hm_3_height);
	}

}
