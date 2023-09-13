package homeworks.homework5.task1_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
//        task 1
        public static int countOccurrence(ArrayList<String> words, String coincidence) {
            int counter = 0;
            for (String word : words) {
                if (words.equals(coincidence)) counter++;
            }
            return counter;
        }
//        task 2
        public static List<String> toLIst(String[] words){
            return Arrays.asList(words);
        }
//        task 3
        public static List<Integer> findUnique (List<Integer> randomN){
            List<Integer> unique =new ArrayList<>();
            for (Integer number : randomN) {
                if (!unique.contains(number)) unique.add(number);
            }
            return unique;
        }
//        task 4**

        public static void calcOccurance (List<String > words){
            List<String> colector = new ArrayList<>();
            for (String word : words){
                if (colector.contains(word)) continue;
                int counter = 0;
                for (String w: words) {
                    if (w.equals(word)) counter++;
                }
                System.out.println(word  + " " +  counter);
                colector.add(word);
            }
        }

//        task 4***

        public static List<String> words (List<String > words){
            List<String> result = new ArrayList<>();
            List<String> colector = new ArrayList<>();
            for (String word : words) {
                if (colector.contains(word)) continue;
                int counter = 0;
                for (String w : words) {
                    if (w.equals(word)) counter++;
                }
                result.add("name: " + "\"" + word + "\"" + "occurence: " + counter);
                colector.add(word);
            }
            return result;
        }

}







