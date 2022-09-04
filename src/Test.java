
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2==2);
		System.out.println(2>5);
		System.out.println(3 < 5);
		System.out.println(5<=5);
		// && and || or
		System.out.println(2 ==2 && 3 < 5);
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(false || false);
		
		String name = "Tom";
		
		if (name == "Sam") {
			System.out.println("Hello Sam!");
		}
		else {
			System.out.println("You are not Sam "+name);
			
		}
		int age = 13;
		if (age >= 16) {
			System.out.println("You can get your license.");
		}else {
			System.out.println("Please wait " +( 16- age)+ " years until you are 16 years old to get your drivers license.");
			
		}
		double costOfMilk = 4;
		if (costOfMilk <= 2.50) {
			System.out.println("Buying 2");
		} else if (costOfMilk <=3) {
			System.out.println("Buying 1");
		
		}else {
			System.out.println("Not buying any");
		}
		
		char grade = 'z';
		switch (grade) {
			case 'A':{
				System.out.println("90%");
				break;
			}
			case 'B':{
				System.out.println("80%");
				break;
			}
			case 'C':{
				System.out.println("70%");
				break;
			}
			default: {
				System.out.println("0%");
				break;
			}
		}
	}
	

}
