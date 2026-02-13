/*
Simple Banking System
Author - Marcela
Description - Basic banking operations including:
    account creation, balance inquiry, deposits, and withdrawals.
*/


import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Variables that store the account information
        String accountHolderName = "";
        int accountNumber = 0;
        double accountBalance = 0.0;

        // Variables used to control the menu options and check if an account exists
        int option;
        boolean accountRegistered = false;

        do {
            System.out.println("------- Banking System -------");
            System.out.println("1 - Register Account");
            System.out.println("2 - Check Balance");
            System.out.println("3 - Deposit Amount");
            System.out.println("4 - Withdraw Amount");
            System.out.println("9 - Exit");
            System.out.println();
            System.out.print("Choose an option: ");

            option = sc.nextInt();
            sc.nextLine(); // Clears input buffer

            switch(option) {

                case 1:
                    if (accountRegistered) {
                        System.out.println("An account is already registered.");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("------- Register Account -------");
                        System.out.print("Enter account holder name: ");
                        accountHolderName = sc.nextLine();

                        System.out.print("Enter account number: ");
                        accountNumber = sc.nextInt();

                        System.out.print("Enter initial balance: ");
                        accountBalance = sc.nextDouble();

                        if (accountBalance < 0) {
                            System.out.println();
                            System.out.println("Invalid amount. Please provide a value greater than zero.");
                            System.out.println();
                        } else {
                            accountRegistered = true;
                            System.out.println();
                            System.out.println("Account successfully registered.");
                            System.out.println();
                        }
                    }
                    break;

                case 2:
                    if (!accountRegistered) {
                        System.out.println();
                        System.out.println("No account registered yet.");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("------- Account Balance-------");
                        System.out.println("Account Holder: " + accountHolderName);
                        System.out.println("Account Number: " + accountNumber);
                        System.out.println("Balance: $" + accountBalance);
                        System.out.println();
                    }
                    break;

                case 3:
                    if(!accountRegistered) {
                        System.out.println();
                        System.out.println("Please register an account first.");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("------- Deposit Amount-------");
                        System.out.print("Enter deposit amount: ");
                        double deposit = sc.nextDouble();

                        if (deposit <= 0) {
                            System.out.println();
                            System.out.println("Invalid deposit amount. Please provide a value greater than zero.");
                            System.out.println();
                        } else {
                            accountBalance += deposit;
                            System.out.println();
                            System.out.println("Deposit of $" + deposit + " completed successfully.");
                            System.out.println("Current balance: $" + accountBalance);
                            System.out.println();
                        }
                    }
                    break;
                
                    case 4:
                        if(!accountRegistered) {  
                            System.out.println("Please register an account first.");
                            System.out.println();
                        } else {
                            System.out.println();
                            System.out.println("------- Withdraw Amount-------");
                            System.out.print("Enter withdrawal amount: ");
                            double withdrawal = sc.nextDouble();

                            if (withdrawal <= 0) {
                                System.out.println();
                                System.out.println("Invalid withdrawal amount. Please provide a value greater than zero.");
                            } else if (withdrawal > accountBalance) {
                                System.out.println();
                                System.out.println("Insufficient balance.");
                                System.out.println();
                                System.out.println("Your current balance is: $" + accountBalance);
                                System.out.println();
                            } else {
                                accountBalance -= withdrawal;  
                                System.out.println();
                                System.out.println("Withdrawal successful.");
                                System.out.println("Current balance: $" + accountBalance);
                                System.out.println();
                            }
                        }
                        break;

                    case 9:
                        System.out.println();
                        System.out.println("Exiting the system...");
                        break;
                    
                        default:
                        System.out.println();
                        System.out.println("Invalid option. Please select a valid option (1 to 4) or press 9 to exit.");
                        break;
            }
        } while (option != 9);
        sc.close();
    }
    // Displays the banking system menu
    static void printMenu(){
        System.out.println("------- Banking System -------");
        System.out.println("1 - Register Account");
        System.out.println("2 - Check Balance");
        System.out.println("3 - Deposit Amount");
        System.out.println("4 - Withdraw Amount");
        System.out.println("0 - Exit");
    }

}
