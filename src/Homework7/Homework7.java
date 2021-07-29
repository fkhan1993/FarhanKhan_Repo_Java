package Homework7;

import java.util.Locale;
import java.lang.*;


public class Homework7 {
  /*  static boolean isPalindrome(String str) {

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }
*/
    public static void main(String[] args) {

        // Due date: July 28

        /**
         * Task 1:
         * Find out if the value stored in word variable is palindrome.
         * And, store the result in "isPalindrome" variable
         * --> palindrome: string which reads the same in reverse
         * eg:
         * level --> level          (palindrome)
         * eye  --> eye             (palindrome)
         * head --> daeh            (not palindrome)
         * racecar --> racecar      (palindrome)
         */
        String task1Word = "Bob";
        for (int i = 0; i < task1Word.length(); i+=1) {
            boolean isPalindrome = true;
            int forwards = 0;
            int backwards = task1Word.length() - 1;
            while (forwards <= backwards){
                if (task1Word.toUpperCase().charAt(forwards) != task1Word.toUpperCase().charAt(backwards)){
                    isPalindrome = false;
                    break;
                }
                forwards+=1;
                backwards-=1;
            }
            if (isPalindrome){
                System.out.println(task1Word+" is a Palindrome.");
            }
            else {
                System.out.println(task1Word+" is not a Palindrome.");
            }
        }


        /**
         * Task2:
         * Find if the value stored in num variable is a prime number or not.
         * And, store the final result in "isPrime" variable
         * --> prime number -> number which is ONLY divisible by 1 and itself.
         * eg:
         * 5 -> prime
         * 7 -> prime
         * 10 -> not a prime
         */
        int num = 5, i = 2;
        boolean flag = false;
        while (i <= num / 2) {
            if (num % i == 0) {
                flag = true;
                break;
            }
            ++i;
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number");



    /**
     * Task3:
     * Write code to reverse a string
     * <p>
     * "happy holidays"
     * <p>
     * "syadiloh yppah"
     */

    String task3String = "happy holidays"; //Storing the backwards strings
    String reverse = "";
    for (int m = task3String.length() - 1; m >= 0; m--) {
        reverse = reverse + task3String.charAt(m);
    }
        System.out.println(reverse);


    String task4Sentence = "hOW arE You My DEAr FRiEnd";    // 9
    int count = 0;
    task4Sentence = task4Sentence.toLowerCase();
        for (int n=0; n < task4Sentence.length(); n++)

    {
        char ch = task4Sentence.charAt(n);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count++;

        }
    }
        System.out.println("Number of vowels in the given sentence is " + count);
}
}




        /**
         * Task4:
         * Count the number of the vowels (a,e,i,o,u) present in the given sentence.
         */



