package stringQue;

import java.util.HashMap;
import java.util.Map;

class MedieumQue {

    public static void main(String[] args) {

        // // 1. Reverse String
        // String str = "Hello";
        // String revStr = "";
        // for (int i = str.length()-1; i >= 0; i--) {
        // revStr += str.charAt(i);
        // }
        // System.out.println(revStr);

        // // 2. Reverse words of string
        // String str = "Hello How are you";
        // String[] strArray = str.split(" ");
        // String revStr = "";
        // for (int i = strArray.length - 1; i >= 0; i--) {
        // revStr += strArray[i];
        // if (i > 0) {
        // revStr += " ";
        // }
        // }
        // System.out.println(revStr);

        // // 3. Reverse words and rverse character of word in string
        // String str = "Hello How are you";
        // String[] strArray = str.split(" ");
        // String revStr = "";
        // for (int i = strArray.length - 1; i >= 0; i--) {
        // String word = strArray[i];
        // String reverseWord = "";
        // for (int j = word.length() - 1; j >= 0; j--) {
        // reverseWord += word.charAt(j);
        // }
        // revStr += reverseWord;
        // if (i > 0) {
        // revStr += " ";
        // }
        // }
        // System.out.println(revStr);

        // // 4.Sum of Beauty of All Substrings
        // String s = "aabcbaa";
        // int sum = 0;
        // for (int i = 0; i < s.length(); i++) {
        // for (int j = i; j < s.length(); j++) {
        // String substr = s.substring(i, j + 1);
        // int beauty = getBeauty(substr);
        // sum += beauty;
        // }
        // }
        // System.out.println(sum);

        // //5. Longest Palindromic Substring
        // String s = "cbbd";
        // int n = s.length();
        // int max = Integer.MIN_VALUE;
        // int minIndex = 0;
        // int maxIndex = 0;

        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n; j++) {
        // String subStr = s.substring(i, j);

        // boolean bool = isPallindromic(subStr);
        // if (bool) {
        // if (subStr.length() > max) {
        // max = subStr.length();
        // minIndex = i;
        // maxIndex = j;
        // }
        // }
        // }
        // }
        // System.out.println(s.substring(minIndex, maxIndex));

        // // 6.Atoi
        // String str = " -42";
        // int len = str.length();
        // int i = 0;
        // int sign = 1;
        // int result = 0;
        // while (i < len && str.charAt(i) == ' ') {
        // i++;
        // }

        // if (i < len && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
        // sign = str.charAt(i) == '-' ? -1 : +1;
        // i++;
        // }

        // while (i < len && Character.isDigit(str.charAt(i))) {
        // int digit = str.charAt(i) - '0';

        // if (result > (Integer.MAX_VALUE - result) / 10) {
        // if (sign == 1) {
        // System.out.println(Integer.MAX_VALUE);
        // } else {
        // System.out.println(Integer.MIN_VALUE);
        // }
        // break;
        // }

        // result = result * 10 + digit;
        // i++;
        // }
        // System.out.println(sign * result);

        // // 7.Maximum Nesting Depth of Paranthesis
        // String str = "()(())((()()))";
        // int cnt = 0;
        // int nested = 0;
        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i) == '(') {
        //         cnt++;
        //     } else if (str.charAt(i) == ')') {
        //         cnt--;
        //     }
        //     nested = Math.max(nested, cnt);
        // }
        // System.out.println(nested);
    }

    // Here write start calling functions
    // 4.
    // public static int getBeauty(String substr) {
    // int maxFreq = Integer.MIN_VALUE;
    // int minFreg = Integer.MAX_VALUE;
    // Map<Character, Integer> map = new HashMap<>();
    // for (int i = 0; i < substr.length(); i++) {
    // map.put(substr.charAt(i), map.getOrDefault(substr.charAt(i), 0) + 1);
    // }

    // for (int val : map.values()) {
    // maxFreq = Math.max(maxFreq, val);
    // minFreg = Math.min(minFreg, val);
    // }

    // return maxFreq - minFreg;
    // }

    // // 5.
    // public static boolean isPallindromic(String subStr) {
    // int left = 0;
    // int right = subStr.length() - 1;
    // while (left <= right) {
    // if (subStr.charAt(left) != subStr.charAt(right)) {
    // return false;
    // }
    // left++;
    // right--;
    // }
    // return true;
    // }
}