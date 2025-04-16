package stringQue;

import java.util.HashMap;
import java.util.Map;

public class EasyQue {
    public static void main(String[] args) {
        // // 1. Check if two Strings are anagrams of each other or not
        // String str1 = "CAT";
        // String str2 = "ACT";
        // boolean flag = true;
        // if (str1.length() != str2.length()) {
        // flag = false;
        // } else {
        // Map<Character, Integer> freqMap = new HashMap<>();
        // for (int i = 0; i < str1.length(); i++) {
        // freqMap.put(str1.charAt(i), freqMap.getOrDefault(str1.charAt(i), 0) + 1);
        // }
        // for (int i = 0; i < str2.length(); i++) {
        // freqMap.put(str2.charAt(i), freqMap.getOrDefault(str2.charAt(i), 0) - 1);
        // }
        // for (int val : freqMap.values()) {
        // if (val != 0) {
        // flag = false;
        // break;
        // }
        // }
        // }
        // System.out.println(flag);

        // // 2.Isomorphic Strings
        // String str1 = "egg";
        // String str2 = "add";
        // boolean flag = true;
        // if (str1.length() != str2.length()) {
        //     flag = false;
        // } else {
        //     Map<Character, Character> map1 = new HashMap<>();
        //     Map<Character, Character> map2 = new HashMap<>();
        //     for (int i = 0; i < str1.length(); i++) {
        //         char ch1 = str1.charAt(i);
        //         char ch2 = str2.charAt(i);

        //         if (map1.containsKey(ch1) && (map1.get(ch1) != ch2)) {
        //             flag = false;
        //         } else {
        //             map1.put(ch1, ch2);
        //         }

        //         if (map2.containsKey(ch2) && (map2.get(ch2) != ch1)) {
        //             flag = false;
        //         } else {
        //             map2.put(ch2, ch1);
        //         }
        //     }
        // }
        // System.out.println(flag);

        // 3.
    }
}
