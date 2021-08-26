package Homework11;
import java.util.*;
import java.util.Map.Entry;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.io.*;
import java.lang.Integer;
import java.lang.String;

public class Homework11 {

    // Due date: Aug 25 '21

    /**
     * Question 1:
     * Create a method that would return the common values between two given arrays
     *
     * ["happy", "King" , "HAPPY", "PEACE"]
     * ["king", "Peace", "happiness", "connection", "learn"]
     *
     * ["king", "peace"]
     *
     * ["happy", "Kingdom" , "HAPPY", "PEACeful"]
     * ["king", "Peace", "happiness", "connection", "learn"]
     *
     * []
     *
     */
    private static void FindCommonElemet(String[] arr1,
                                         String[] arr2)
    {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equalsIgnoreCase(arr1[i]) == arr2[j].equalsIgnoreCase(arr2[j])) {

                    // add common elements
                    set.add(arr1[i]);
                    break;
                }
            }
        }
        for (String i : set) {
            System.out.print(i + " ");
        }
    }
    /**
     * Question 2:
     * Create a method that would return the values occurring more than 1 times in given array
     *  String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
     *  ["happy", "joy" , "laugh"]
     *
     *
     *  String[] words = {"happy", "peace", "laugh", "joy"};
     *  []
     *
     */


   private static void arrayElementCount(int inputArray[])
    {
        //Creating a HashMap object with elements of inputArray as keys and their count as values

        HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();

        //checking every element of the inputArray

        for (int k : inputArray)
        {
            if(elementCountMap.containsKey(k))
            {
                //If element is present in elementCountMap, incrementing it's count by 1

                elementCountMap.put(k, elementCountMap.get(k)+1);
            }
            else
            {
                //If element is not present in elementCountMap,
                //adding this element to elementCountMap with 1 as it's value

               // elementCountMap.put(1);
            }
        }

        System.out.println("Input Array : "+Arrays.toString(inputArray));

        System.out.println("Element Count : "+elementCountMap);
    }


    // main method
    public static void main(String[] args)
    {

        // create Array 1
        String[] arr1
                = { "happy", "King" , "HAPPY", "PEACE"};

        // create Array 2
        String[] arr2 = { "king", "Peace", "happiness", "connection", "learn" };

        // print Array 1
        System.out.println("Array 1: "
                + Arrays.toString(arr1));

        // print Array 2
        System.out.println("Array 2: "
                + Arrays.toString(arr2));

        System.out.print("Common Elements: ");

        // Find the common elements
        FindCommonElemet(arr1, arr2);

        String[] names = { "happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy" };
        System.out.println("Duplicate elements from array using HashSet data structure");
        Set<String> store = new HashSet<>();
        for (String name : names) {
            if (store.add(name) == false) {
                System.out.println("found a duplicate element in array : " + name); } }

        arrayElementCount(new int[] {4, 5, 4, 5, 4, 6});

        System.out.println("-------------------------");

            }
        }

