import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int twentyBills, tenBills, fiveBills, singleBills, quarters, dimes, nickels, pennies;

		System.out.print("Enter an item price: ");
		double price = kb.nextDouble();
		System.out.print("How much was tendered? ");
		double tender = kb.nextDouble();

		if (tender < price) {
			System.out.println("Too little money tendered."); // not enough money
		} else if (tender == price) {
			System.out.println("Exact amount given. No change."); // exact amount; no change needed
		} else {
			pennies = (int) ((tender - price + 0.000001) * 100); // multiply by 100 and cast as int. addition corrects
																	// floating point

			if (pennies >= 2000) { // if there are over 2000 pennies, we owe them a twenty
				twentyBills = pennies / 2000; // give them the appropriate number of twenties
				if (twentyBills > 1) {
					System.out.print(twentyBills + " twenties. "); //chooses singular or plural bills/coins
				} else if (twentyBills == 1) {
					System.out.print(twentyBills + " twenty. ");
				}
				pennies = pennies % 2000; // the amount of remaining pennies after taking out the twenties
			}
			if (pennies >= 1000) {
				tenBills = pennies / 1000;
				if (tenBills > 1) {
					System.out.print(tenBills + " tens. ");
				} else if (tenBills == 1) {
					System.out.print(tenBills + " ten. ");
				}
				pennies = pennies % 1000;
			}
			if (pennies >= 500) {
				fiveBills = pennies / 500;
				if (fiveBills > 1) {
					System.out.print(fiveBills + " fives. ");
				} else if (fiveBills == 1) {
					System.out.print(fiveBills + " five. ");
				}
				pennies = pennies % 500;
			}
			if (pennies >= 100) {
				singleBills = pennies / 100;
				if (singleBills > 1) {
					System.out.print(singleBills + " ones. ");
				} else if (singleBills == 1) {
					System.out.print(singleBills + " one. ");
				}
				pennies = pennies % 100;
			}
			if (pennies >= 25) {
				quarters = pennies / 25;
				if (quarters > 1) {
					System.out.print(quarters + " quarters. ");
				} else if (quarters == 1) {
					System.out.print(quarters + " quarter. ");
				}
				pennies = pennies % 25;
			}
			if (pennies >= 10) {
				dimes = pennies / 10;
				if (dimes > 1) {
					System.out.print(dimes + " dimes. ");
				} else if (dimes == 1) {
					System.out.print(dimes + " dime. ");
				}
				pennies = pennies % 10;
			}
			if (pennies >= 5) {
				nickels = pennies / 5;
				if (nickels > 1) {
					System.out.print(nickels + " nickels. ");
				} else if (nickels == 1) {
					System.out.print(nickels + " nickel. ");
				}
				pennies = pennies % 5;
			}
			if (pennies > 1) {
				System.out.print(pennies + " pennies. ");
			} else if (pennies == 1) {
				System.out.print(pennies + " penny. ");
			}

		}
		kb.close();
	}
	
	//add some methods for formatting?

}
