package Homework3;

import java.util.Locale;

public class Homework3 {

    public static void main(String[] args) {

        // Due - Jul 14 eod

        // Question - 1
        String sentence_1 = "hello dear, how are you?";
        int result_1 = 0;
        /**
         * Assign result_1 as 100 if the length of sentence_1 is 10 or greater
         * else assign result_1 as 15
         *
         * use: Ternary operator
         *
         */
        result_1 = (sentence_1.length() >= 10) ? 100:15;
        System.out.println("result_1 = " + result_1);

        // Question - 2
       String sentence_2 = "We all ARe GOod ProgrAMmer";
        /**
         * replace all 'R/r' with 'F'
         */
       System.out.println(sentence_2.replaceAll("(?i)r", "F"));     // "We all AFe GOod PFogFAMmeF";

        // Question - 3
       String sentence_3 = "ABC Networks";
       System.out.println("The length of Sentence_3 is " + sentence_3.length() + " characters");
       //boolean ignorecase_A = sentence_3.equalsIgnoreCase(sentence_3);
       //Boolean startswith_A = ignorecase_A;
       System.out.println("Does Sentence _3 start with 'a'? " + sentence_3.toLowerCase(Locale.ROOT).startsWith("a"));
       System.out.println("Does Sentence _3 end with 'K'? " + sentence_3.toUpperCase(Locale.ROOT).endsWith("K"));
       String result_3 = "A car has four wheels";
       result_3 = result_3.toLowerCase(Locale.ROOT).startsWith("a") ? "Media":"Entertainment";
       System.out.println("Is it Media or Entertainment? " + result_3);
       /**
         * 1. Display/Print length of your sentence_3
         * 2. does sentence_3 starts with "a" (ignore cases)
         * 3. does sentence_3 ends with "K" (ignore cases)
         * 4. Assign result_3 as "Media" if sentence_3 starts with 'a' (ignore cases)
         *      else assign "Entertainment"
         *      Print the result_3 in console.
         */





    }

}
