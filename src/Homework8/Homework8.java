package Homework8;

import java.lang.String;

public class Homework8 {
    // Due : Aug 01, 2021
    //String message = "Good Day";
    public static void main(String[] args) {
        String s = toTitleCase("happy new year TO You DeaR");
        System.out.println(s);
        System.out.println(reverseString("Happy Holidays"));
        int[] array = {7, 10, 3, 6, 10};
        System.out.println(average(array));
        int arrays[] = {33, 54, 67, 19, 9, 52};
        taskword("dad");
        System.out.println("Maximum Value is: " + getMax(arrays));

    }

    /**
     * Write a method to convert given string into Titlecase
     * <p>
     * Input sentence = "happy new year TO You DeaR"
     * Final answer = "Happy New Year To You Dear"
     */
    public static String toTitleCase(String threeWordSentence_1) {

        System.out.println("Before code : " + threeWordSentence_1);
        // code
        threeWordSentence_1 = threeWordSentence_1.toLowerCase();
        for (int i = 0; i <= threeWordSentence_1.length() - 1; i++) {
            String[] arr1 = threeWordSentence_1.split(" ");
            arr1[0] = arr1[0].substring(0, 1).toUpperCase() + arr1[0].substring(1);
            arr1[1] = arr1[1].substring(0, 1).toUpperCase() + arr1[1].substring(1);
            arr1[2] = arr1[2].substring(0, 1).toUpperCase() + arr1[2].substring(1);
            arr1[3] = arr1[3].substring(0, 1).toUpperCase() + arr1[3].substring(1);
            arr1[4] = arr1[4].substring(0, 1).toUpperCase() + arr1[4].substring(1);
            arr1[5] = arr1[5].substring(0, 1).toUpperCase() + arr1[5].substring(1);
            threeWordSentence_1 = arr1[0] + " " + arr1[1] + " " + arr1[2];
            System.out.println("After code : " + threeWordSentence_1);
            //return threeWordSentence_1;
        }


        /**
         * Write a method to reverse a String
         */
        public static String reverseString (String task3String){
            //String task3String = "happy holidays"; //Storing the backwards strings
            String reverse = "";
            for (int m = task3String.length() - 1; m >= 0; m--) {
                reverse = reverse + task3String.charAt(m);
            }
            System.out.println(reverse);
        }

        /**
         * Write a method which will return the result, if the given string is a Palindrome
         *
         * return type: boolean
         */
        public static String taskword (String task1Word){
            for (int i = 0; i < task1Word.length(); i += 1) {
                boolean isPalindrome = true;
                int forwards = 0;
                int backwards = task1Word.length() - 1;
                while (forwards <= backwards) {
                    if (task1Word.toUpperCase().charAt(forwards) != task1Word.toUpperCase().charAt(backwards)) {
                        isPalindrome = false;
                        break;
                    }
                    forwards += 1;
                    backwards -= 1;
                }
                if (isPalindrome) {
                    System.out.println(task1Word + " is a Palindrome.");
                } else {
                    System.out.println(task1Word + " is not a Palindrome.");
                }
            }

            /**
             * Write a method to return the average of a given int array
             *
             * Input array : {7, 10, 3, 6, 10}
             * ans : 7.2
             *
             */
            public static int average (int[] array){
                int sum = 0;

                for (int i = 0; i < array.length; i++) {

                    sum += array[i];

                }
                int avg = sum / array.length;
                System.out.println("the average of 10 is:" + average);

                System.out.println("sum of 10 is:" + sum);


                return 0;

            }

            /**
             * Write a method to return the maximum value from a given int array
             *
             * Input array: {33, 54, 67, 19, 9, 52}
             * max : 67
             */
            public static int getMax ( int[] inputArray){
                int maxValue = inputArray[0];
                for (int i = 1; i < inputArray.length; i++) {
                    if (inputArray[i] > maxValue) {
                        maxValue = inputArray[i];
                    }
                }
                return maxValue;
            }
        }
    }
}