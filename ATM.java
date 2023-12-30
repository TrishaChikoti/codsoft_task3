import java.util.Scanner;
public class ATM {
	  static double totalAmount=100000;
      static void withdraw(double amount) {
    	  if (amount <= totalAmount) {
              totalAmount=totalAmount-amount;
              System.out.println("Withdrawn amount: " + amount);
          } 
    	  else {
              System.out.println("Insufficient Balance! \nUnable to withdraw.");
          }
      }
      static void deposit(double amount) {
    	  System.out.println("deposited amount :"+amount);
    	  totalAmount= totalAmount+amount;
      }
      static void checkBalance() {
    	  System.out.println("The balance amount in your account is : "+totalAmount);
      }
}
class User{
	static Scanner sc=new Scanner(System.in);
	
    	public static void main(String[] args) {
    	        int choice;

    	        do {
    	            System.out.println("Main menu");
    	            System.out.println("0 - Exit");
    	            System.out.println("1 - Withdraw");
    	            System.out.println("2 - Deposit");
    	            System.out.println("3 - Check Balance");

    	            System.out.print("Enter your choice: ");
    	            choice = sc.nextInt();

    	            switch (choice) {
    	                case 0:
    	                    System.out.println("Thank you for visiting!");
    	                    break;
    	                case 1:
    	                	System.out.println("Enter the amount you would like to withdraw:");
    	                    double amountToWithdraw=sc.nextDouble();
    	                    ATM.withdraw(amountToWithdraw);
    	                    break;
    	                case 2:
    	                	 System.out.println("Enter the amount you would like to deposit:");
    	                	 double amountToDeposit=sc.nextDouble();
    	                     ATM.deposit(amountToDeposit);
    	                     break;
    	                case 3:
                            ATM.checkBalance();
    	                    break;
    	                default:
    	                    System.out.println("Invalid choice. Please enter a valid option.");
    	                    break;
    	            }

    	        } while (choice != 0);
    	    }
}
  

