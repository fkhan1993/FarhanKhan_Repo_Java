package Test1;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;


public class Test1 {
    public static void main(String[] args) {
       speed(180);
        int[] input = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        System.out.println("input : " + Arrays.toString(input) + ", remove 24");
        int[] output = remove(input, 24);





        Integer[] arr1 = { 1, 4, 2, -1, 6, 5 };
        System.out.println("The smallest missing positive number from the array is "
              + findSmallestMissing(arr1));
    }


    /**
     * Question 1:
     * Scenario: Traffic ticketing system
     * Write a method, that will print (not return) the points to be charged against
     * the license for over speeding.
     * <p>
     * 1. Speed Limit = 70
     * 2. Every 5 miles over the speed limit will add 1 point
     * 3. If user speed is such that system shows 12 points for a speed
     * then print, license is suspended
     * <p>
     * Example:
     * user speed = 74 ; 0 points
     * user speed = 78 ; 1 points  // 70-75(1) 75-78(0) = 1
     * user speed = 88 ; 3 points  // 70-75(1) 75-80(1) 80-85(1) 85-88(0) = 3
     * user speed = 178 ; 21 points (License suspended).
     * user speed = 70 ; Thank you for driving within the speed limit.
     */
    public static void speed(int user_speed) {
        int speedlimit = 70;
        int points;
        if (user_speed >= 175) {
            points = 21;
            System.out.println("License suspended");
        } else if (user_speed >= 170) {
            points = 20;
        } else if (user_speed >= 165){
            points = 19;
        } else if (user_speed >= 160){
            points = 18;
        } else if (user_speed >= 155){
            points = 17;
        } else if (user_speed >= 150){
            points = 16;
        } else if (user_speed >= 145){
            points = 15;
        } else if (user_speed >= 140){
            points = 14;
        } else if (user_speed >= 135){
            points = 13;
        } else if (user_speed >= 130){
            points = 12;
        } else if (user_speed >= 125){
            points = 11;
        } else if (user_speed >= 120){
            points = 10;
        } else if (user_speed >= 115){
            points = 9;
        } else if (user_speed >= 110){
            points = 8;
        } else if (user_speed >= 105){
            points = 7;
        } else if (user_speed >= 100){
            points = 6;
        } else if (user_speed >= 95){
            points = 5;
        } else if (user_speed >= 90){
            points = 4;
        } else if (user_speed >= 85){
            points = 3;
        } else if (user_speed >= 80){
            points = 2;
        } else if (user_speed >= 75){
            points = 1;
        } else {
            System.out.println("Thank you for driving within the speed limit.");
        }
    }

    /**
     * Question 2:
     * Create a method to return an int-array
     * after removing a given int-value from a given int array.
     * <p>
     * Input array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Input Number: 24
     * Returned array: {32, 14, 98, 56, 148, 78}
     * <p>
     * Input array:     {1, 2, 4, 3, 1, 6, 1}    Input Number: 11
     * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
     */

    public static int[] remove(int[] numbers, int target) {
        int count = 0;

        // loop over array to count number of target values.
        // this required to calculate length of new array
        for (int number: numbers) {
            if (number == target) {
                count++;
            }
        }

        // if original array doesn't contain number to removed
        // return same array
        if (count == 0) {
            return numbers;
        }

        int[] result = new int[numbers.length - count];
        int index = 0;
        for (int value : numbers) {
            if (value != target) {
                result[index] = value;
                index++;
            }
        }
        numbers = null; // make original array eligible for GC
        return result;
    }





    /**
     * Question 3:
     * Create a method to return missing smallest positive integer (greater than 0) from given int-array.
     * <p>
     * Example:
     * For array : {3, 5, 1, 4, 2, 7}
     * Method should return : 6
     * <p>
     * For array : {2, 5, -1, 0, 6}
     * Method should return : 1
     * <p>
     * For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
     * Method should return : 4
     * <p>
     * For array : {-2, -5, -1, -10, -6}
     * Method should return : 1
     */
    public static int findSmallestMissing(Integer[] arr)
    {
        // use a range constructor to initialize the set from array elements
        Set<Integer> distinct = new HashSet<>();
        Collections.addAll(distinct, arr);

        // return first smallest missing positive number from the set
        int index = 1;
        while (true)
        {
            if (!distinct.contains(index)) {
                return index;
            }
            index++;
        }
    }
}
