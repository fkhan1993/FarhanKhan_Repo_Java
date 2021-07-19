package Homework4;

import java.util.Locale;

public class Homework4 {

    public static void main(String[] args) {

        // Due: July 18

        // Question - 1:
        /**
         * String threeWordSentence = "hApPy nEW yeAr"
         * // code
         * String threeWordSentence = "Happy New Year"
         */
      String threeWordSentence_1 = "hApPy nEW yeAr";
      System.out.println("Before code : " + threeWordSentence_1);     // "hApPy nEW yeAr"
        // code
        threeWordSentence_1 = threeWordSentence_1.toLowerCase();
        String [] arr1 = threeWordSentence_1.split(" ");
        arr1[0] = arr1[0].substring(0, 1).toUpperCase() + arr1[0].substring(1);
        arr1[1] = arr1[1].substring(0, 1).toUpperCase() + arr1[1].substring(1);
        arr1[2] = arr1[2].substring(0, 1).toUpperCase() + arr1[2].substring(1);
        threeWordSentence_1 = arr1[0] + " "+arr1[1]+" "+arr1[2];
        System.out.println("After code : " + threeWordSentence_1);      // "Happy New Year"


        // Question - 2:
        /**
         * create the abbreviation  // HNY
         */
        String threeWordSentence_2 = "very gOOD MorNING";
        String abbr = "";
        String [] arr2 = threeWordSentence_2.split(" ");
        abbr = arr2[0].substring(0,1).toUpperCase() + arr2[1].substring(0,1).toUpperCase() + arr2[2].substring(0,1).toUpperCase();
        // code

       System.out.println("Abbreviation for '" + threeWordSentence_2 + "' is : " + abbr);
        // Abbreviation for 'very gOOD MorNING' is : VGM


        // Question - 3:
        /**
         * print the number of words in the sentence.
         */
       String sentence_3 = "We all are here to learn programming and testing";
        String [] arr3 = sentence_3.split(" ");
        System.out.println("There are " + arr3.length + " words in sentence_3");







    }
}
