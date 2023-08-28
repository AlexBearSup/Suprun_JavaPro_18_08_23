package homeworks.homework3;


import java.util.Arrays;

public class Main {
    public static boolean isAnagram (String s, String t){

        if (s.length() != t.length()){
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }

    public static void main(String[] args) {
        String s = "cat";
        String t = "rat";

        boolean result = isAnagram(s, t);

        if (result) {
            System.out.println(t + " is an anagram of " + s);
        } else {
            System.out.println(t + " is not an anagram of " + s);
        }




    }




}
