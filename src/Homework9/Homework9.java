package Homework9;
import java.lang.String;
public class Homework9 {
    public static void main(String[] args) {


        /**
         * Count the words which contains "happy" in the given array.
         *
         * if no word contains 'happy' --> "none"
         * if 1 word contains 'happy' --> word
         * if 2 or more words contain 'happy' --> all the words which happy
         *
         * {"happy holidays" , "how are you", "have a happy vacation", "happyness is the key" , "I want happiness for you"}
         *      {"happy holidays", "have a happy vacation", "happyness is the key"}
         *
         * {"happidays" , "how are you"}
         *      none
         *
         * {"happy holidays" , "happiness is the key" , "I want happiness for you"}
         *      happy holidays
         *
         * input: 2 ( String[] , String )
         * return type: String[] ( {"happy holidays", null, null} )
         *
         *
         */
        boolean flag = false;
        int index = 0;
        int count = 0;
        String[] yourArray = {"happy holidays" , "how are you", "have a happy vacation", "happiness is the key" , "I want happiness for you"};
        String found = "";
        for (int i = 0; i < yourArray.length; i++) {

            if (yourArray[i].contains("happy")) {
                flag = true;
                index = i;
                count++;


            }
        }
        if (flag)
            System.out.println(index);
        else  {
            System.out.println("not found ");
        }

        /**
         * Find the name which has the max length.
         *
         * Note: If 2 or more names has same length (which is max) then send all such names
         *
         * {"happy, "peaceful", "loving", "dear"}
         *      peaceful
         *
         * {"happy, "peace", "love", "dear"}
         *      happy, peace
         *
         * input: 1 (String[])
         * return type: String[]
         *
         */
        String[] namegroupone = {"happy", "peace", "love", "dear"};

       // String[] newnames = {"john", "happy", "peACe", "jOy", "LEarN", "joy", "laugh"};

        String search = "peace";
        //if (numbers.length == newnames.length){

            for (int i = 0; i < namegroupone.length; i++){
                if (namegroupone[i].length() == search.length()){
                    System.out.println(namegroupone[i]+" WAS FOUND AT POSITION "+(i+1));
                    System.out.println("THE WORD ASSOCIATED WITH THIS POSITION IS: "+ namegroupone[i]);
                }
            }
        }
       /* else {
            System.out.println("ERROR: ARRAYS DO NOT HAVE THE SAME LENGTH");
        }*/
    }

