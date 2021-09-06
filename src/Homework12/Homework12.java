package Homework12;

import java.awt.*;
import java.util.*;
import java.lang.String;
import java.util.List;

public class Homework12 {
    // Sept 01, 2021
    public static void main(String[] args) {
        String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
        List<String> names = Arrays.asList(words);
        System.out.println(countingDuplicates(names));
        String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                "green", "green"};
        Homework12 h = new Homework12();
        h.getColorMaxTimes(arr);
        HashMap<Integer, String> hm12 = new HashMap<Integer, String>();

        hm12.put(101, "happy");
        hm12.put(102, "peace");
        hm12.put(103, "Happy");
        hm12.put(104, "learn");
        hm12.put(105, "PEace");
        hm12.put(106, "HAPPY");
        System.out.println(hm12);

    }

    /**
     * Question:
     * Create a method, that will return all duplicates values with count from the given List<String>
     * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
     * Output:
     *      happy - 2
     *      joy - 3
     *      laugh - 2
     */
    public static Map<String, Integer> countingDuplicates (List<String> words) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            if (!wordCount.containsKey(words.get(i))) {
                int count = 1;
                for (int j = i + 1; j < words.size(); j++) {
                    if (words.get(i).equalsIgnoreCase(words.get(j))) {
                        count++;
                    }
                    if (count > 1) {
                        wordCount.put(words.get(i), count);
                    }
                }
            }
        }
        return wordCount;
    }

    String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
            "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
            "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
            "green", "green"};

  /*  public void MaxRepeatingElement(String [] arr){
        int maxCounter = 0;
        int element=0;
        for (int i = 0; i <arr.length ; i++) {
            int counter =1;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    counter++;
                }
            }
            if(maxCounter<counter){
                maxCounter=counter;

            }
        }
        System.out.println("Element repeating maximum no of times: " + element + ", maximum count: " + maxCounter);
    } */


    /**
     * Question:
     * Create a method that will take String-array as input
     *
     * If there is a color with maximum count, return the color name
     * If there are two or more colors with same number, return all
     *
     * hint: return type as Set/List<String>
     */
    public Set<String> getColorMaxTimes(String[] colors) {

        Map<String, Integer> countforcolor = new HashMap<>();

        for (int i = 0; i < colors.length; i++) {
            if (!countforcolor.containsKey(colors[i])) {
                int count = 1;
                for (int j = i + 1; j < colors.length; j++) {
                    if (colors[j].equalsIgnoreCase(colors[i])) {
                        count++;
                    }
                }
                countforcolor.put(colors[i], count);
            }
        }

        // System.out.println(colorCount);

        Collection<Integer> allColorCount = countforcolor.values();

        Integer maxValue = 0;

        for (Integer value : allColorCount) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        // System.out.println(maxValue);

        Set<String> allColorNames = countforcolor.keySet();
        Set<String> maxColor = new HashSet<>();

        for (String colorName : allColorNames) {
            if (countforcolor.get(colorName) == maxValue) {
                maxColor.add(colorName);
            }
        }

        // System.out.println(maxColor);
        return maxColor;
    }




    /**
     *
     * Question:
     * Create a hashMap with any numbers of key-value pairs from the user
     * Key should be Integer
     * Value should be String
     *
     * Create method that will print the keys with same value, else "All keys have different values"
     *
     * Input to method -> [{101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"}]
     * Output (print) ->
     *      "happy" with keys -> 101, 103, 106
     *      "peace" with keys -> 102, 105
     *
     * Input to method -> [{111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"}]
     * Output (print) ->
     *      All keys have different values
     *
     *
     */
}
