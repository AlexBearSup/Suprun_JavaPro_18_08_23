package homeworks.homework6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

//    task1
    public static boolean palindromCheck(String words){
        words = words.toLowerCase().replaceAll("[^a-z0-9]", "");

        int firstLetter = 0;
        int lastLetter = words.length() - 1;

        while (firstLetter < lastLetter){
            if (words.charAt(firstLetter) != words.charAt(lastLetter)) return false;
            firstLetter++;
            lastLetter--;
        }
        return true;
    }

//    task2

    public static boolean replays(int[] numbers) {
        Set<Integer> unique = new HashSet<>();

        for (int number : numbers) {
            if (unique.contains(number)) {
                return true;
            }
            unique.add(number);
        }
        return false;
    }

//    task 3
//    public static int[] findSum(int[] original, int target) {
//        int[] result = new int[2];
//        HashMap<Integer, Integer> requiredIndexes = new HashMap<>();
//
//        for(int i =0; i < original.length; i++){
//            int first = target - original[i];
//            if(requiredIndexes.containsKey(first)){
//                result[0] = requiredIndexes.get(first);
//                result[1] = i;
//            }else{
//                requiredIndexes.put(original[i], i);
//            }
//        }
//        System.out.println(Arrays.toString(result));
//        return result;
//    }
  





}
