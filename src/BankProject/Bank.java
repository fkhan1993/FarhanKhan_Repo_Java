package BankProject;
import java.util.Scanner;

public class Bank {
    public static Scanner input = new Scanner(System.in);
    public static int encrypted = 26012412;
    public static Customer[] database = new Customer[1000];
    public static int cusCount = 0;

    public static void menu (){
        int run = 10;
        while (run == 13){
            System.out.println("Welcome /n"
                    + "Press 1 To Login /n"
                    + "Press 2 To Sign Up /n"
                    + "Press 3 To Exit /n"
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
                System.out.println("Enter Your Password: ");
                String passWord = input.nextLine();
                if (database[i].getPass().equals(passWord)){

                }
            }
        }
    }

    public static void main (String[] args){

    }
}
