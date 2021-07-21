package Homework5;

public class Homework5 {

    public static void main(String[] args) {

        // Due: July 21

        /**
         * Create variable to store studentScore and maxScore;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90.99
         * Grade C: 71-80.99
         * Grade D: 61-70.99
         * Grade E: 51-60.99
         * Grade F: less than or equal to 50.99
         */
        int studentScore = 80;
        int maxScore = 150;
        String Grade = "";
        double percentage = (studentScore*100.00)/maxScore;
        if (percentage >= 91 && percentage <= 100) {
            Grade = "A";
        } else if (percentage >= 81 && percentage <= 90.99) {
            Grade = "B";
        } else if (percentage >= 71 && percentage <= 80.99) {
            Grade = "C";
        } else if (percentage >= 61 && percentage <= 70.99) {
            Grade = "D";
        } else if (percentage >= 51 && percentage <= 60.99) {
            Grade = "E";
        } else if (percentage <= 50.99) {
            Grade = "F";
        }
        System.out.println("Your percentage: " + percentage + " and your Grade is: " + Grade);
        // calculate percentage --> 80*100/150
        // print result like:
        // Your percentage: XX.yy and your Grade is: Z


        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         */
        int num2 = 16;

        if (num2%3 == 0 && num2%5 == 0) {
            System.out.println("divisible by both");
        } else if (num2%3 == 0) {
            System.out.println("divisible by 3");
        } else if (num2%5 == 0) {
            System.out.println("divisible by 5");
        } else {
            System.out.println(num2);
        }
            }
}
