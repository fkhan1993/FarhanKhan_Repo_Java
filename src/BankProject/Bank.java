package BankProject;
import java.util.Scanner;

public class Bank {
    public static Scanner input = new Scanner(System.in);
    public static int nCrypted = 26012542;
    public static Customer[] database = new Customer[1000];
    public static int cusCount = 0;

    public static void menu (){
        int run = 13;
        while (run == 13){
            System.out.println("WELCOME /n"
                    + "PRESS 1 TO LOGIN /n"
                    + "PRESS 2 TO SIGN UP /n"
                    + "PRESS 3 TO EXIT /n"
                    + ": ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice){
                case 1:

            }
        }
    }

    public static void logIn(String userName){
        for (int i = 0; i <= cusCount; i++){
            if (database[i].getUser().equals(userName)){
                System.out.println("ENTER YOUR PASSWORD: ");
                String passWord = input.nextLine();
                if (database[i].getPass().equals(passWord)){

                }
            }
        }
    }

    public static void main (String[] args){

    }
}
