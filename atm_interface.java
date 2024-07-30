package task3;
import java.util.*;
public class atm_interface {
private static double balance=1000.00;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			showmenu();
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				checkbalance();
				break;
			case 2:
				depositemoney(sc);
				break;
			case 3:
				withdrawmoney(sc);
				break;
			case 4:
				exitatm(sc);
				return;
			default:
				System.out.println("invalid option");
			}
		}
	}
	private static void showmenu() {
		System.out.println("\n ATM Interface");
		System.out.println("1.Check Balance");
		System.out.println("2.Deposite Money");
		System.out.println("3.Withdraw Money");
		System.out.println("4.Exit");
		System.out.println("Choose an option:");
		}
	private static void checkbalance() {
		System.out.println("Your balance is:"+balance);
		}
	private static void depositemoney(Scanner sc){
		System.out.println("Enter the amount to deposite:$");
		double depositeamount=sc.nextDouble();
		if(depositeamount>0) {
			balance+=depositeamount;
			System.out.println("Successfully deposited");
		}
		else {
			System.out.println("Invalid amount.Please enter a positive number");
		}
	}
	private static void withdrawmoney(Scanner sc) {
		System.out.println("Enter the amount to withdraw");
		double withdrawamount =sc.nextDouble();
		if(withdrawamount>0&&withdrawamount<=balance) {
			balance-=withdrawamount;
			System.out.println("Sucessfully withdraw"+withdrawamount);
		}
		else if (withdrawamount >balance) {
			System.out.println("Insufficient balance");
		}
		else {
			System.out.println("Invalid amount please enter a positive number");
		}
	}
	private static void exitatm(Scanner sc) {
		System.out.println("Thank you for Using the Atm.Goodbye");
		sc.close();
		
	}

}
