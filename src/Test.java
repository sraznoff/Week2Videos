import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub System.out.println(2==2);
		 * System.out.println(2>5); System.out.println(3 < 5); System.out.println(5<=5);
		 * // && and || or System.out.println(2 ==2 && 3 < 5); System.out.println(true
		 * && true); System.out.println(true && false); System.out.println(true ||
		 * false); System.out.println(false || false);
		 * 
		 * String name = "Tom";
		 * 
		 * if (name == "Sam") { System.out.println("Hello Sam!"); } else {
		 * System.out.println("You are not Sam "+name);
		 * 
		 * } int age = 13; if (age >= 16) {
		 * System.out.println("You can get your license."); }else {
		 * System.out.println("Please wait " +( 16- age)+
		 * " years until you are 16 years old to get your drivers license.");
		 * 
		 * } double costOfMilk = 4; if (costOfMilk <= 2.50) {
		 * System.out.println("Buying 2"); } else if (costOfMilk <=3) {
		 * System.out.println("Buying 1");
		 * 
		 * }else { System.out.println("Not buying any"); }
		 * 
		 * char grade = 'z'; switch (grade) { case 'A':{ System.out.println("90%");
		 * break; } case 'B':{ System.out.println("80%"); break; } case 'C':{
		 * System.out.println("70%"); break; } default: { System.out.println("0%");
		 * break; }
		 * 
		 * }
		 */
/*		for (int i = 0;i<10; i++) {
			System.out.println(i);*/
		//}
		/*
		 * int x = 0; while(x<100) { System.out.println(x); x++; } do {
		 * System.out.println(x); }while (x<10);
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		int selection = 0;
		double total = 0;
		
		while (selection != 4) {
			System.out.println("Welcome " + name);
			System.out.println("Please choose an option:");
			System.out.println("1) Add candybar to the cart: $1.99");
			System.out.println("2) Add Cheese to the cart: $5.95");
			System.out.println("3) Add Soccer Ball to the cart: $12.99");
			System.out.println("4) Checkout.");
			selection = sc.nextInt();
			
			
			switch (selection) {
			case 1:
				total += 1.99;
				break;
			case 2:
				total += 5.95;
				break;
			case 3:
				total += 12.99;
				break;
			case 4:
				break;
			default:
				System.out.println("Please pick a valid option.");
				
			}
		}
		System.out.println("Your current total is "+total);
	}
	

}
