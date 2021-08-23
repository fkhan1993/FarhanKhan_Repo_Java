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

    public Accounts(String accountType, int scoreOrInDeposit){
        this.accountType = accountType;
        accountId = BankProject.nCrypted++;
        if (accountType.equals("CREDIT CARD")){
            if (scoreOrInDeposit >= 750 || scoreOrInDeposit <= 850){
                creditLine = 5000.0;
            }
            else if (scoreOrInDeposit >= 649){
                creditLine = 2500.0;
            }
            else if (scoreOrInDeposit >= 549){
                creditLine = 1000.0;
            }
            else if (scoreOrInDeposit >= 300 || scoreOrInDeposit <= 500){
                creditLine = 300.0;
            }
            else{
                System.out.println("YOUR CREDIT SCORE IS INVALID OR YOU DO NOT QUALIFY FOR A CREDIT CARD WITH US. EXITING PROCESS.");
            }
            balance = 0.0;
        }
        else {
            balance = scoreOrInDeposit;
        }
        this.showBalance();
    }

    protected Accounts openAccount(){
        Scanner input = new Scanner(System.in);
        System.out.println("WHAT TYPE OF ACCOUNT WOULD YOU LIKE TO OPEN? /n"
                + "1. CHECKINGS /n"
                + "2. SAVINGS /n"
                + "3. CREDIT CARD /n"
                + "PRESS 1,2 OR 3 THEN PRESS ENTER: ");
        int choice = input.nextInt();
        input.nextLine();
        switch (choice){
            case 1:
                accountType = "CHECKINGS";
                accountId = BankProject.nCrypted++;
                System.out.println("ENTER INITIAL DEPOSIT AMOUNT: ");
                balance = input.nextDouble();
                break;

            case 2:
                accountType = "SAVINGS";
                accountId = BankProject.nCrypted++;
                System.out.println("ENTER INITIAL DEPOSIT AMOUNT: ");
                balance = input.nextDouble();
                break;

            case 3:
                accountType = "CREDIT CARD";
                accountId = BankProject.nCrypted++;
                balance = 0.0;
                System.out.println("PLEASE ENTER YOUR CREDIT SCORE: ");
                int cScore = input.nextInt();
                if (cScore >= 750 || cScore <= 850){
                    creditLine = 5000.0;
                }
                else if (cScore >= 649){
                    creditLine = 2500.0;
                }
                else if (cScore >= 549){
                    creditLine = 1000.0;
                }
                else if (cScore >= 300 || cScore <= 500){
                    creditLine = 300.0;
                }
                else{
                    System.out.println("YOUR CREDIT SCORE IS INVALID OR YOU DO NOT QUALIFY FOR A CREDIT CARD WITH US. EXITING PROCESS.");
                }
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
        if (accountType.equals("CREDIT CARD")){
            balance -= amt;
        }
        else {
            balance += amt;
        }
        this.showBalance();
        System.out.println("THANK YOU.");
    }

    /**
     * 3. withdraw
     *      account number
     *      amount
     */
    protected void makeWithdrawal(double amt){
        if (accountType.equals("CREDIT CARD")){
            if (balance + amt >= creditLine){
                System.out.println("THIS CHARGE CANNOT BE COMPLETED BECAUSE YOUR BALANCE WILL BE OVER THE LIMIT.");
            }
            else {
                balance += amt;
            }
        }
        else {
            balance -= amt;
        }
        this.showBalance();
        System.out.println("THANK YOU.");
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
            if (accountType.equals("CREDIT CARD")){
                System.out.println("CREDIT LINE: $"+creditLine);
            }
            System.out.println("BALANCE: $"+balance);
        }
    }
}
