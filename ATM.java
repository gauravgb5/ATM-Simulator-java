import java.util.Scanner;

public class ATM 
{
    // private float balance = 0;

    private static void transaction(float balance) {
        System.out.println("\nEnter any option to be served!\n");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Balance\n");    
        
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int choice = Integer.parseInt(input);
        int amountToWithDraw, amountToDeposit, anotherTransaction;

        switch( choice )
        {
            case 1:
                System.out.println("\nPlease enter to withdraw: ");
                amountToWithDraw = scanner.nextInt();

                if (amountToWithDraw > balance){
                    System.out.println("There is no insufficient funds in you account");
                    System.out.println("Do you want another transaction?\nPress 1 to proceed and 2 to exit\n");
                    anotherTransaction = scanner.nextInt();

                    if (anotherTransaction == 1){
                        transaction(balance);
                    }
                }
                else {
                    balance -= amountToWithDraw;
                    System.out.println("You have withdrawn $" + amountToWithDraw + ".00 and your new balance is " + balance);
                    System.out.println("Do you want another transaction?\nPress 1 to proceed and 2 to exit\n");
                    anotherTransaction = scanner.nextInt();

                    if (anotherTransaction == 1){
                        transaction(balance);
                    }
                }
                break;

            case 2:
                System.out.println("\nPlease enter amount to deposit: ");
                amountToDeposit = scanner.nextInt();

                balance += amountToDeposit;

                System.out.println("Thank you for depositing" + amountToDeposit + ", new balance is: $" + balance);
                System.out.println("Do you want another transaction?\nPress 1 to proceed and 2 to exit\n");
                anotherTransaction = scanner.nextInt();

                if (anotherTransaction == 1){
                    transaction(balance);
                }
                break;

            case 3:
                System.out.println("\nYour bank balance is: $" + balance);
                System.out.println("Do you want another transaction?\nPress 1 to proceed and 2 to exit\n");
                anotherTransaction = scanner.nextInt();

                if (anotherTransaction == 1){
                    transaction(balance);
                }
                break;
                
        }
        
    }
    public static void main(String args[]) {
        float balance = 0;
        transaction(balance);
    }
    
}