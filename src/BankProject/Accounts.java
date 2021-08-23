package BankProject;
import java.util.Scanner;

public class Accounts {
    private String accountType;
    private int accountId;
    private double balance;
    private double creditLine;

    /**
     * 1. openAccount
     *      Type (Savings, Checking)
     *      starting deposit
     *      user should get unique account number
     */
    public Accounts(){
        accountId = 13;
        accountType = "NO ACCOUNT OPENED";
    }

    public Accounts(String accountType, int Depositamount){
        this.accountType = accountType;
        accountId = Bank.encrypted++;
        if (accountType.equals("CHECKINGS")){
            if (Depositamount >= 750 || Depositamount <= 850){
                creditLine = 5000.0;
            }
            else if (Depositamount >= 649){
                creditLine = 2500.0;
            }
            else if (Depositamount >= 549){
                creditLine = 1000.0;
            }
            else if (Depositamount >= 300 || Depositamount <= 500){
                creditLine = 300.0;
            }
            else{
                System.out.println("You are not qualified to open an account with us.");
            }
            balance = 0.0;
        }
        else {
            balance = Depositamount;
        }
        this.showBalance();
    }

    protected Accounts openAccount(){
        Scanner input = new Scanner(System.in);
        System.out.println("WHAT TYPE OF ACCOUNT WOULD YOU LIKE TO OPEN? /n"
                + "1. CHECKINGS /n"
                + "2. SAVINGS /n"
                + "PRESS 1 OR 2, THEN PRESS ENTER: ");
        int choice = input.nextInt();
        input.nextLine();
        switch (choice){
            case 1:
                accountType = "CHECKINGS";
                accountId = Bank.encrypted++;
                System.out.println("ENTER DEPOSIT AMOUNT: ");
                balance = input.nextDouble();
                break;

            case 2:
                accountType = "SAVINGS";
                accountId = Bank.encrypted++;
                System.out.println("ENTER DEPOSIT AMOUNT: ");
                balance = input.nextDouble();
                break;



            default:
                System.out.println("INVALID RESPONSE, EXITING PROCESS.");
                break;

        }
        this.showBalance();
        return this;

    }
    /**
     * 2. deposit
     *      account number
     *      amount
     */
    protected void makeDeposit(double amt){
        if (accountType.equals("CHECKINGS")){
            balance -= amt;
        }
        else {
            balance += amt;
        }
        this.showBalance();
        System.out.println("THANK YOU FOR YOUR TRANSACTION.");
    }

    /**
     * 3. withdraw
     *      account number
     *      amount
     */
    protected void makeWithdrawal(double amt){
        if (accountType.equals("CHECKINGS")){
            if (balance + amt >= creditLine){
                System.out.println("THIS CHARGE CANNOT BE COMPLETED BECAUSE YOUR BALANCE WILL EXCEED THE LIMIT.");
            }
            else {
                balance += amt;
            }
        }
        else {
            balance -= amt;
        }
        this.showBalance();
        System.out.println("THANK YOU FOR YOUR TRANSACTION.");
    }
    /**
     * 4. showBalance
     *      account number
     *      sout(balance)
     */
    protected void showBalance(){
        if (accountId == 13){
            System.out.println(accountType);
        }
        else {
            System.out.println("ACCOUNT NUMBER: "+accountId);
            if (accountType.equals("CHECKINGS")){
                System.out.println("CREDIT LINE: $"+creditLine);
            }
            System.out.println("BALANCE: $"+balance);
        }
    }
}
