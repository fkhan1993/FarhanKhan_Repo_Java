package Homework8;

import java.lang.String;

public class Homework8 {
 public static void main(String[] args) {

    }

    // Due : Aug 01, 2021

    /**
     * Write a method to convert given string into Titlecase
     *
     * Input sentence = "happy new year TO You DeaR"
     * Final answer = "Happy New Year To You Dear"
     */
public static String toTitleCase(String userStr) {
        String formattedStr = "";
        String[] userStrArray = userStr.toUpperCase().split(" ");
        for (String word : userStrArray) {
        formattedStr = formattedStr + word.charAt(0) + word.substring(1).toLowerCase() + " ";
        // formattedStr+=word.charAt(0)+word.substring(1).toLowerCase()+" ";
        }
        return formattedStr.trim();
        }

/**
 * Write a method to reverse a String
 */
public static String reverseString(String userStr) {
        String reversedStr = "";
        for (int i=0 ; i < userStr.length() ; i++) {
        reversedStr += userStr.charAt(userStr.length()-1-i);
        }
        return reversedStr;
        }

public static String reverseString2(String userStr) {
        String reversedStr = "";
        for (int i=userStr.length()-1 ; i >= 0 ; i--) {
        reversedStr += userStr.charAt(i);
        }
        return reversedStr;
        }
/**
 * Write a method which will return the result, if the given string is a Palindrome
 *
 * return type: boolean
 *
 * 1. reverse the given string
 * 2. if reversedStr is equal to originalString
 *      originalString is Palindrome
 *
 */
public static boolean isStringPalindrome(String userStr) {
        boolean isPalindrome = false;
        String reversedString = reverseString(userStr);
        return userStr.equalsIgnoreCase(reversedString);
        }

public static boolean isStringPalindrome2(String userStr) {
        boolean isPalindrome = true;
        for (int i=0 ; i < userStr.length()/2 ; i++) {
        if(userStr.toLowerCase().charAt(i) != userStr.toLowerCase().charAt(userStr.length()-1-i)) {
        isPalindrome = false;
        break;
        }
        }
        return isPalindrome;
        }

/**
 * Write a method to return the average of a given int array
 *
 * Input array : {7, 10, 3, 6, 10}
 * ans : 7.2
 *
 */
public static double findArrayAverage(int[] userArray) {
        double sum = 0;
        for (int num : userArray) {
        sum+=num;
        }
        return sum/userArray.length;
        }

/**
 * Write a method to return the maximum value from a given int array
 *
 * Input array: {33, 54, 67, 19, 9, 52}
 * max : 67
 */
public static int findMaxFromArray(int[] userArray) {
        int max = userArray[0];
        for (int i=1 ; i < userArray.length ; i++) {
        if (max < userArray[i]) {
        max = userArray[i];
        }
        }
        return max;
        }






        }