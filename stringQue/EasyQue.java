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
        // flag = false;
        // } else {
        // Map<Character, Character> map1 = new HashMap<>();
        // Map<Character, Character> map2 = new HashMap<>();
        // for (int i = 0; i < str1.length(); i++) {
        // char ch1 = str1.charAt(i);
        // char ch2 = str2.charAt(i);

        // if (map1.containsKey(ch1) && (map1.get(ch1) != ch2)) {
        // flag = false;
        // } else {
        // map1.put(ch1, ch2);
        // }

        // if (map2.containsKey(ch2) && (map2.get(ch2) != ch1)) {
        // flag = false;
        // } else {
        // map2.put(ch2, ch1);
        // }
        // }
        // }
        // System.out.println(flag);

        // // 3.Remove Outermost Parentheses
        // String str = "(()())(())";
        // int cnt = 0;
        // String result = "";
        // for (int i = 0; i < str.length(); i++) {
        // if (str.charAt(i) == '(') {
        // if (cnt > 0) {
        // result += str.charAt(i);
        // cnt++;
        // } else {
        // cnt++;
        // }
        // } else if (str.charAt(i) == ')') {
        // cnt--;
        // if (cnt > 0) {
        // result += str.charAt(i);
        // }
        // }
        // }
        // System.out.println(result);

        // // 4.Largest Odd Number in String
        // String str = "35427";
        // String result = "";
        // for (int i = 0; i < str.length(); i++) {
        // String subStr = "";
        // for (int j = i + 1; j <= str.length(); j++) {
        // subStr = str.substring(i, j);
        // char lastDigit = subStr.charAt(subStr.length() - 1);
        // if ((lastDigit - '0') % 2 == 1) {
        // if (result.equals("") || Long.parseLong(subStr) > Long.parseLong(result)) {
        // result = subStr;
        // }
        // }
        // }
        // }
        // System.out.println(result);

        // // 5.Longest Common Prefix
        // String[] strArray = { "flower", "flow", "flight" };
        // String prefix = strArray[0];
        // for (int i = 1; i < strArray.length; i++) {
        // while (!strArray[i].startsWith(prefix)) {
        // prefix = prefix.substring(0, prefix.length() - 1);
        // }
        // }
        // System.out.println(prefix);

        // // 6.Left Rotate String
        // String str = "Hello";
        // int d = 2;
        // for (int i = 0; i < d; i++) {
        // char first = str.charAt(0);
        // str = str.substring(1) + first;
        // }
        // System.out.println(str);

        // // 7.Right Rotate String
        // String str = "Hello";
        // int d = 2;
        // for (int i = 0; i < d; i++) {
        // char last = str.charAt(str.length() - 1);
        // str = last + str.substring(0, str.length() - 1);
        // }
        // System.out.println(str);

        // 8.check whether one string is a rotation of another
        // // 8.1: 1st approach
        // String str1 = "abcde";
        // String str2 = "cdeab";
        // boolean flag = false;
        // str1 = str1 + str1;
        // if (str1.contains(str2)) {
        // flag = true;
        // }
        // System.out.println(flag);

        // // 8.2:second approach
        // String str1 = "abcde";
        // String str2 = "cdeab";
        // boolean flag = false;
        // for (int i = 0; i < str1.length(); i++) {
        //     char first = str1.charAt(0);
        //     str1 = str1.substring(1) + first;
        //     if (str1.equals(str2)) {
        //         flag = true;
        //         break;
        //     }
        // }
        // System.out.println(flag);
    }
}
