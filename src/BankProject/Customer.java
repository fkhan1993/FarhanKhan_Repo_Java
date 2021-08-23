package BankProject;
import java.util.Scanner;
import java.util.Locale;

public class Customer extends Accounts {
    private final String username;
    private String pass;
    private final String name;
    private final String ssn;
    private String phonenumber;
    private String city;
    private int numOfAcc;
    private final Accounts[] acc = new Accounts[5];

    public Customer(String username, String pass, String name, String ssn, String phonenumber) {
        this.username = username;
        this.pass = pass;
        this.name = name;
        this.ssn = ssn;
        this.phonenumber = phonenumber;
        this.numOfAcc = 0;
        this.acc[0] = new Accounts();
        this.acc[1] = new Accounts();
        this.acc[2] = new Accounts();
        this.acc[3] = new Accounts();
        this.acc[4] = new Accounts();
        Bank.database[Bank.cusCount] = this;
        Bank.cusCount++;
    }

    public Customer(String username, String pass, String name, String ssn, String phonenumber, String city) {
        this.username = username;
        this.pass = pass;
        this.name = name;
        this.ssn = ssn;
        this.phonenumber = phonenumber;
        this.numOfAcc = 0;
        this.city = city;
        this.acc[0] = new Accounts();
        this.acc[1] = new Accounts();
        this.acc[2] = new Accounts();
        this.acc[3] = new Accounts();
        this.acc[4] = new Accounts();
        Bank.database[Bank.cusCount] = this;
        Bank.cusCount++;
    }

    public Customer() {
        boolean uExists = true;
        Scanner input = new Scanner(System.in);
        System.out.println("****----    REGISTRATION    ----****");
        System.out.print("ENTER YOUR NAME: ");
        name = input.nextLine();
        System.out.print("CREATE A USERNAME: ");
        String userName = input.nextLine();
        while (uExists) {
            uExists = false;
            for (int i = 0; i <= Bank.cusCount; i++) {
                if (Bank.database[i].getUser().equals(userName)) {
                    uExists = true;
                    System.out.println("USERNAME EXISTS, PLEASE ENTER A NEW USERNAME: ");
                    userName = input.nextLine();
                    break;
                }
            }
        }
        username = userName;
        System.out.println("ENTER A PASSWORD (NO SPACES PERMITTED): ");
        pass = input.next();
        input.nextLine();
        System.out.println("ENTER YOUR SOCIAL SECURITY NUMBER: ");
        ssn = input.nextLine();
        System.out.println("ENTER YOUR PHONE NUMBER: ");
        phonenumber = input.nextLine();
        System.out.println("ENTER YOUR CITY (OPTIONAL): ");
        city = input.nextLine();
        numOfAcc = 0;
        System.out.println("THANK YOU " + name + ". YOUR PROFILE HAS BEEN CREATED.");
    }

    private void updateProfile(String fieldName, String newVal) {
        switch (fieldName.toUpperCase()) {
            case "PASSWORD":
                pass = newVal;
                break;

            case "CITY":
                city = newVal;
                break;

            case "PHONE NUMBER":
                phonenumber = newVal;

            default:
                System.out.println("THE ENTERED FIELD CANNOT BE CHANGED OR DOES NOT EXIST.");
                break;
        }
    }

    private void showProfile() {
        System.out.println("NAME: " + name.toUpperCase());
        System.out.println("PHONE NUMBER: " + phonenumber.toUpperCase());
        System.out.println("CITY: " + city.toUpperCase());
        System.out.println("ACCOUNTS OPENED: " + numOfAcc);
    }

    protected Accounts openAccount() {
        acc[numOfAcc] = super.openAccount();
        numOfAcc++;
        return acc[numOfAcc - 1];
    }

    private void getBankBalance(int accIndex) {
        this.acc[accIndex].showBalance();
    }

    private void getBankBalance() {
        for (Accounts account : this.acc) {
            account.showBalance();
        }
    }

    public String getUser() {
        return username;
    }

    public String getPass() {
        return pass;

    }

    /**
     * Every Customer can have maximum 5 bank account with Bank.
     */

    /**
     * 1. createProfile
     *      name
     *      ssn
     *      phone
     *      cityName (optional)
     */
}
    /**
     * 2. updateProfile()
     *      customer should send fieldName and newValue
     */

    /**
     * 3. showProfile
     *      Name:
     *      Phone number:
     *      (if provided) CityName:
     *      Total number of Accounts:
     */

    /**
     * openAnAccount
     *      pls use openAccount method from Accounts class
     */

    /**
     * makeDeposit
     *      pls use deposit method from Accounts class
     */

    /**
     * makeWithdraw
     *      pls use withdraw method from Accounts class
     */

    /**
     * getBankBalance
     *      with 1 argument
     *      pls use showBalance method from Accounts class
     *
     * Account Number: 1234
     * Balance $ 100.00
     *
     */

    /**
     * getBankBalance
     *      with no arguments
     *      pls use showBalance method to print balance of
     *      all Account with the Customer
     *
     * Total number of Accounts: 5
     *
     * Account Number: 1234
     * Balance $100.00
     *
     * Account Number: 5678
     * Balance $200.00
     *
     * Account Number: 9012
     * Balance $200.00
     *
     * Account Number: 3456
     * Balance $2000.00
     *
     */

