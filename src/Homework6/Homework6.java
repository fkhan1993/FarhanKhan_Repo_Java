package Homework6;

import java.util.Arrays;
import java.util.Locale;

public class Homework6 {
    public static void main(String[] args) {


        // Due: Sunday July 25

        /**
         * String sentence = "happy new year TO You DeaR"
         * // code
         * String sentence = "Happy New Year To You Dear"
         *
         * For hint refer: Loops_Concept , Line#34
         */


        /**
         * create the abbreviation  // HNY
         */
        String threeWordSentence_2 = "very gOOD MorNING to You dear";
        String[] arrSentence_2 = threeWordSentence_2.split(" ");
        String formatted = "";
        for (int i = 0; i < arrSentence_2.length; i++) {
            formatted += arrSentence_2[i].substring(0, 1).toUpperCase() + arrSentence_2[i].substring(1).toLowerCase(Locale.ROOT);
            if (i != arrSentence_2.length - 1) {
                formatted += "";
            }
        }
        System.out.println(formatted);

        String abbr = "";
        for (int i = 0; i < arrSentence_2.length; i++) {
            abbr += arrSentence_2[i].toUpperCase(Locale.ROOT).charAt(0);
        }
        // code

        System.out.println("Abbreviation for '" + threeWordSentence_2 + "' is : " + abbr);
        // Abbreviation for 'very gOOD MorNING to You dear' is : VGMTYD


        /**
         * Create variable to store studentScore and maxScore;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90.99
         * Grade C: 71-80.99
         * Grade D: 61-70.99
         * Grade E: 51-60.99
         * Grade F: less than or equal to 50.99
         *
         * student got grade A, gets full scholarship for next year
         *
         * student got better than grade D (i.e. B or C), get half scholarship for next year
         *
         * otherwise no scholarship for next year
         *
         *
         * Sample output:
         *  Your percentage: XX.yy and your Grade is: Z
         *  Based on your grade(Z), you get XXXX scholarship for next year
         *
         */
        int studentScores[] = {80, 112, 97, 62, 143, 133, 18};
        int maxScore = 150;

        for (int student = 0; student < studentScores.length; student++) {
            double percentage = 100.0 * studentScores[student] / maxScore;
            String grade = "";
            String scholarship = "NEXT YEAR, YOU SHALL QUALIFY FOR: ";
            if (percentage >= 91.0) {
                grade = "A";
                scholarship += "FULL";
            } else if (percentage >= 81.0) {
                grade = "B";
                scholarship += "HALF";
            } else if (percentage >= 71.0) {
                grade = "C";
                scholarship += "HALF";
            } else if (percentage >= 61.0) {
                grade = "D";
                scholarship += "NONE";
            } else if (percentage >= 51.0) {
                grade = "E";
                scholarship += "NONE";
            } else if (percentage < 50.9999 && percentage >= 0.0) {
                grade = "F";
                scholarship += "NONE";
            } else {
                grade = "INVALID GRADE";
                scholarship += "NONE";
            }
            System.out.println("HELLO STUDENT #" + (student + 1) + ". YOUR SCORE IS " + studentScores[student] + " OUT OF " + maxScore);
            System.out.println("YOUR PERCENTAGE: " + percentage + "%");
            System.out.println("YOUR GRADE: " + grade);
            System.out.println(scholarship);
        }

        /**
         * Create an array and store 5 int-values.
         * Print the average of numbers in array.
         *
         * sum of values / number of values
         *
         * {10, 20, 30, 40, 50}
         * (10+20+30+40+50)/5
         *
         */
        int[] arrayNum = {10, 20, 30, 40, 50};
        int average = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            average += arrayNum[i];
        }
        average /= (arrayNum.length);
        System.out.println("The average of " + Arrays.toString(arrayNum) + " is " + average);

        /**
         *
         * String[] names = {"john", "happy", "peACe", "jOy", "lui", "harry"}
         * String nameToSearch = "faith";
         *
         * if name found, Print "LUI is at position-5 in the array"
         * if name not found, print "king is not present in the array"
         *
         */
        String[] names = {"john", "happy", "peACe", "jOy", "lui", "harry"};
        boolean is_it_there = false;
        String nameToSearch = "lui";
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(nameToSearch)) {
                System.out.println(nameToSearch.toUpperCase() + " WAS FOUND IN POSITION " + (i + 1));
                is_it_there = true;
            } else if (i == names.length - 1 && !is_it_there) {
                System.out.println(nameToSearch.toUpperCase() + " WAS NOT FOUND IN THE LIST"); //Uppercase looks better
            }
        }
        /**
         *
         * String[] names = {"john", "happy", "peACe", "jOy", "LEarN", "Orange", "king kong", "iRON MAN"};
         * print the names from array if the name-length is >=5 and name contains 'o' or 'O'
         *
         */
        String[] mynames = {"john", "happy", "peACe", "jOy", "LEarN", "Orange", "king kong", "iRON MAN"};
        for (int i = 0; i < mynames.length; i++) {
            if ((mynames[i].toLowerCase().contains("o")) && (mynames[i].length() >= mynames[1].length())) {
                System.out.println(mynames[i]);
            }
        }


        /**
         * int[] numbers = {11, 22, 33, 44, 55, 98, 65};
         * String[] names = {"john", "happy", "peACe", "jOy", "LEarN", "joy", "laugh"};
         *
         * Limitation: both array must be of same length
         *
         * if the numbers-array has 33 in it,
         *      print the index at which 33 is present in numbers array
         *      And, print the name present at same index in names array.
         *
         */


        int[] numbers = {11, 22, 33, 44, 55, 98, 65};
        String[] newnames = {"john", "happy", "peACe", "jOy", "LEarN", "joy", "laugh"};

        int search = 33;
        if (numbers.length == newnames.length){

            for (int i = 0; i < numbers.length; i++){
                if (numbers[i] == search){
                    System.out.println(search+" WAS FOUND AT POSITION "+(i+1));
                    System.out.println("THE WORD ASSOCIATED WITH THIS POSITION IS: "+ newnames[i]);
                }
            }
        }
        else {
            System.out.println("ERROR: ARRAYS DO NOT HAVE THE SAME LENGTH");
        }

        }
}
































