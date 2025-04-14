package stringQue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class dummy {

    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // String str1 = sc.nextLine();
    // String str2 = sc.nextLine();

    // boolean result = isomorphicstring(str1, str2);
    // System.out.println(result);

    // sc.close();

    // Anagrams
    // Scanner sc = new Scanner(System.in);
    // String str1 = sc.nextLine();
    // String str2 = sc.nextLine();

    // str1 = str1.toLowerCase();
    // str2 = str2.toLowerCase();

    // HashMap<Character, Integer> map = new HashMap<>();

    // if (str1.length() != str2.length()) {
    // System.out.println("not Anagrams");
    // } else {
    // for (char c : str1.toCharArray()) {
    // map.put(c, map.getOrDefault(c, 0) + 1);
    // }

    // for (char c : str2.toCharArray()) {
    // map.put(c, map.getOrDefault(c, 0) - 1);
    // }

    // boolean isAnagram = true;
    // for (int value : map.values()) {
    // if (value != 0) {
    // isAnagram =false;
    // break;
    // }
    // }
    // System.out.println(isAnagram);

    // }
    // sc.close();

    // // remove outermost parenthesys
    // Scanner sc = new Scanner(System.in);
    // String str = sc.nextLine(); // (()())(())
    // int cnt = 0;
    // StringBuilder result = new StringBuilder();
    // for (char c : str.toCharArray()) {

    // if (c == '(') {
    // if (cnt > 0) {
    // result.append(c);
    // }
    // cnt++;
    // }
    // if (c == ')') {
    // cnt--;
    // if (cnt > 0) {
    // result.append(c);
    // }
    // }
    // }

    // System.out.println(result.toString());

    // sc.close();

    // longest odd number
    // Scanner sc = new Scanner(System.in);
    // String str = sc.nextLine();
    // String longestodd = "";
    // for (int i = 0; i < str.length(); i++) {
    // for (int j = i + 1; j < str.length(); j++) {
    // String substring = str.substring(i, j);
    // if (Integer.parseInt(substring) % 2 != 0) {
    // if (substring.length() > longestodd.length() || (substring.length() ==
    // longestodd.length()
    // && Integer.parseInt(substring) > Integer.parseInt(longestodd))) {
    // longestodd = substring;
    // }
    // }
    // }
    // }
    // System.out.println(longestodd);
    // sc.close();

    // longest common prefix
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // sc.nextLine();
    // String[] strArray = new String[n];
    // for (int i = 0; i < n; i++) {
    // strArray[i] = sc.nextLine();
    // }

    // Arrays.sort(strArray);
    // String first = strArray[0];
    // String last = strArray[strArray.length - 1];
    // String commonprefix = "";

    // int minlen = Math.min(first.length(), last.length());

    // for (int i = 0; i < minlen; i++) {
    // if (first.charAt(i) == last.charAt(i)) {
    // commonprefix += first.charAt(i);
    // }
    // }
    // System.out.println(commonprefix);
    // sc.close();

    // // Isomorphic
    // Scanner sc = new Scanner(System.in);
    // String str1 = sc.nextLine();
    // String str2 = sc.nextLine();
    // HashMap<Character, Character> map1 = new HashMap<>();
    // HashMap<Character, Character> map2 = new HashMap<>();

    // boolean isomorphicornot = true;
    // if (str1.length() != str2.length()) {
    // isomorphicornot = false;
    // } else {
    // for (int i = 0; i < str1.length(); i++) {
    // char key1 = str1.charAt(i);
    // char key2 = str2.charAt(i);

    // if (map1.containsKey(key1)) {
    // if (map1.get(key1) != key2) {
    // isomorphicornot = false;
    // break;
    // }
    // } else {
    // map1.put(key1, key2);
    // }

    // if (map2.containsKey(key2)) {
    // if (map2.get(key2) != key1) {
    // isomorphicornot = false;
    // break;
    // }
    // } else {
    // map2.put(key2, key1);
    // }
    // }
    // }

    // System.out.println(isomorphicornot);

    // sc.close();

    // right rotation
    // Scanner sc = new Scanner(System.in);
    // String str1 = sc.nextLine();
    // String str2 = sc.nextLine();
    // boolean leftrotation = false;
    // if (str1.length() != str2.length()) {
    // leftrotation = false;
    // } else {
    // for (int i = 0; i < str1.length(); i++) {
    // str1 = str1.charAt(str1.length() - 1) + str1.substring(0, str1.length()-1);
    // if (str1.equals(str2)) {
    // leftrotation = true;
    // break;
    // }
    // }
    // }

    // System.out.println(leftrotation);
    // sc.close();

    //// Anagrams
    // Scanner sc = new Scanner(System.in);
    // String str1 = sc.nextLine();
    // String str2 = sc.nextLine();
    // boolean anagram = true;
    // HashMap<Character, Integer> map = new HashMap<>();
    // if (str1.length() != str2.length()) {
    // anagram = false;
    // } else {
    // for (int i = 0; i < str1.length(); i++) {
    // char c = str1.charAt(i);
    // map.put(c, map.getOrDefault(c, 0) + 1);
    // }
    // for (int i = 0; i < str2.length(); i++) {
    // char c = str2.charAt(i);
    // map.put(c, map.getOrDefault(c, 0) - 1);
    // }
    // for (int c : map.values()) {
    // if (c != 0) {
    // anagram = false;
    // break;
    // }
    // }
    // }

    // System.out.println(anagram);
    // sc.close();

    //// Maximum Nesting Depth of Paranthesys
    // Scanner sc = new Scanner(System.in);
    // String str1 = sc.nextLine();
    // int depth = 0;
    // int cnt = 0;
    // for (char c : str1.toCharArray()) {
    // if (c == '(') {
    // cnt++;
    // if (cnt > depth) {
    // depth = cnt;
    // }
    // }
    // if (c == ')') {
    // cnt--;
    // }
    // }

    // System.out.println(depth);
    // sc.close();

    //// Roman To Integer
    // Scanner sc = new Scanner(System.in);
    // String str = sc.nextLine();
    // Map<Character, Integer> romanMap = new HashMap<>();
    // romanMap.put('I', 1);
    // romanMap.put('V', 5);
    // romanMap.put('X', 10);
    // romanMap.put('L', 50);
    // romanMap.put('C', 100);
    // romanMap.put('D', 500);
    // romanMap.put('M', 1000);

    // int tottal = 0;
    // for (int i = 0; i < str.length() - 1; i++) {
    // if (romanMap.get(str.charAt(i)) < romanMap.get(str.charAt(i + 1))) {
    // tottal -= romanMap.get(str.charAt(i));
    // } else {
    // tottal += romanMap.get(str.charAt(i));
    // }
    // }
    // tottal += romanMap.get(str.charAt(str.length() - 1));

    // System.out.println(tottal);
    // sc.close();

    // // Atoi(String to Integer)
    // Scanner sc = new Scanner(System.in);
    // String str = sc.nextLine();

    // int i = 0;
    // int n = str.length();
    // int sign = 1;
    // int result = 0;

    // // 1. remove whitespaces
    // while (i < n && str.charAt(i) == ' ') {
    // i++;
    // }

    // // 2.sign
    // if (i < n && (str.charAt(i) == '-' || str.charAt(i) == '+')) {
    // sign = (str.charAt(i) == '-') ? -1 : 1;
    // i++;
    // }

    // // 3.convert string to integer

    // while (i < n && Character.isDigit(str.charAt(i))) {
    // result = result * 10 + (str.charAt(i) - '0');

    // if ((result * sign) >= Integer.MAX_VALUE) {
    // result = Integer.MAX_VALUE;
    // break;
    // }
    // if ((result * sign) <= Integer.MIN_VALUE) {
    // result = Integer.MIN_VALUE;
    // break;
    // }
    // i++;
    // }

    // result *= sign;

    // if (result >= Integer.MAX_VALUE) {
    // result = Integer.MAX_VALUE;
    // }
    // if (result <= Integer.MIN_VALUE) {
    // result = Integer.MIN_VALUE;
    // }

    // System.out.println(result);

    // sc.close();

    // // Substring with K distinct
    // Scanner sc = new Scanner(System.in);
    // String str = sc.nextLine();
    // int k = 2;
    // int result = 0;
    // for (int i = 0; i < str.length(); i++) {
    // HashSet<Character> distictChar = new HashSet<>();

    // for (int j = i; j < str.length(); j++) {
    // distictChar.add(str.charAt(j));
    // if (distictChar.size() == k) {
    // result++;
    // }
    // if (distictChar.size() > k) {
    // break;
    // }
    // }

    // }
    // System.out.println(result);

    // sc.close();

    // Scanner sc = new Scanner(System.in);
    // String str = sc.nextLine();
    // int k = 2;
    // int result = 0;
    // for (int i = 0; i < str.length(); i++) {
    // HashSet<Character> distinctChar = new HashSet<>();
    // for (int j = i; j < str.length(); j++) {
    // distinctChar.add(str.charAt(j));
    // if (distinctChar.size() == k) {
    // result++;
    // }
    // if (distinctChar.size() > k) {
    // break;
    // }
    // }
    // }

    // // Output the result
    // System.out.println(result);

    // sc.close();

    //// Longest Palindromic substring
    // Scanner sc = new Scanner(System.in);
    // String str = sc.nextLine();
    // String result = "";
    // for (int i = 0; i < str.length(); i++) {
    // for (int j = i + 1; j < str.length(); j++) {
    // String substr = str.substring(i, j);
    // if (substr.length() > result.length()) {
    // String pallindrome = "";
    // for (int k = substr.length() - 1; k >= 0; k--) {
    // pallindrome += substr.charAt(k);
    // }
    // if (pallindrome.equals(substr)) {
    // result = substr;
    // }
    // }
    // }
    // }
    // System.out.println(result);
    // sc.close();

    //// Sum Of Beauty of all substring
    // Scanner sc = new Scanner(System.in);
    // String str = sc.nextLine();
    // int result = 0;
    // int n = str.length();
    // for (int i = 0; i < n; i++) {
    // HashMap<Character, Integer> map = new HashMap<>();
    // for (int j = i; j < n; j++) {
    // char ch = str.charAt(j);
    // map.put(ch, map.getOrDefault(ch, 0) + 1);
    // int maxFreq = Integer.MIN_VALUE;
    // int minFreq = Integer.MAX_VALUE;

    // for (int freq : map.values()) {
    // maxFreq = Math.max(maxFreq, freq);
    // minFreq = Math.min(minFreq, freq);
    // }
    // result += (maxFreq - minFreq);
    // }
    // }
    // System.out.println(result);
    // sc.close();

    //// reverse string words
    // Scanner sc = new Scanner(System.in);
    // String str = sc.nextLine();
    // String[] strArray = str.split(" ");
    // StringBuilder reverse = new StringBuilder();
    // for (int i = strArray.length - 1; i >= 0; i--) {

    // if (!strArray[i].isEmpty()) {
    // System.out.println(strArray[i]);
    // reverse.append(strArray[i]);
    // if (i > 0) {
    // reverse.append(" ");
    // }
    // }
    // }
    // System.out.println(reverse.toString());
    // System.out.println(strArray.length);
    // sc.close();

    // Scanner sc = new Scanner(System.in);
    // String str = sc.nextLine();
    // int cnt = 0;
    // String result = "";
    // for (int i = 0; i < str.length(); i++) {
    // if (str.charAt(i) == '(') {
    // if (cnt > 0) {
    // result += str.charAt(i);
    // }
    // cnt++;
    // }
    // if (str.charAt(i) == ')') {
    // cnt--;
    // if (cnt > 0) {
    // result += str.charAt(i);
    // }
    // }
    // }
    // System.out.println(result);
    // sc.close();

    // int[] intArray = { 1, 0, 2, 0, 3, 0, 4, 0 };
    // ArrayList<Integer> list = new ArrayList<>();
    // for (int i = 0; i < intArray.length; i++) {
    // if (intArray[i] != 0) {
    // list.add(intArray[i]);
    // }
    // }

    // for (int i = 0; i < list.size(); i++) {
    // intArray[i] = list.get(i);
    // }
    // for (int i = list.size(); i < intArray.length; i++) {
    // intArray[i] = 0;
    // }

    // for (int val : intArray) {
    // System.out.println(val);
    // }

    // int[] intArray = { 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1 };
    // int consecutive = 0;
    // int cnt = 0;
    // for (int val : intArray) {
    // if (val == 1) {
    // cnt++;
    // if (cnt > consecutive) {
    // consecutive = cnt;
    // }
    // } else if (val == 0) {
    // cnt = 0;
    // }
    // }
    // System.out.println(consecutive);

    // int[] intArray = { 1, 0, 2, 3, 0, 4, 5, 0 };
    // List<Integer> listArray = new ArrayList<>();
    // for(int val : intArray){
    // listArray.add(val);
    // }
    // int k = 0;
    // int n = listArray.size();
    // for (int i = 0; i < n; i++) {
    // if (listArray.get(i) == k) {
    // listArray.add(i + 1, k);
    // i++;

    // listArray.remove(listArray.size() - 1);
    // }
    // }

    // for (int val : listArray) {
    // System.out.println(val);
    // }

    // int[] intArray = { 1, 2, 4, 4, 5 };
    // int[] result = new int[2];
    // int n = intArray.length;
    // for (int i = 0; i < n; i++) {
    // int ele = intArray[i];
    // int boolea = 0;
    // for (int j = 0; j < n; j++) {
    // if(intArray[j] == ele){
    // result[0] =ele;
    // }
    // if (intArray[j] == ele + 1) {
    // boolea = 1;
    // break;
    // }
    // }
    // if (boolea == 0) {
    // result[1]=ele+1;
    // break;
    // }
    // }

    // for(int val : result){
    // System.out.println(val);
    // }

    // String str = "geeksforgeeks";
    // int[] freqArray = new int[26];
    // char notrepetedchar = 0;
    // for (char c : str.toCharArray()) {
    // freqArray[c - 'a']++;
    // }
    // for (int i = 0; i < str.length(); i++) {
    // if (freqArray[str.charAt(i) - 'a'] == 1) {
    // notrepetedchar = str.charAt(i);
    // break;
    // }
    // }
    // System.out.println(notrepetedchar);

    // }

    public static void main(String args[]) {
        int[] arr = { 1, 1, 0, 0, 1, 1, 1, 0, 1 };
        int max1 = Integer.MIN_VALUE;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
                max1 = Math.max(max1, cnt);
            } else {
                cnt = 0;
            }
        }
        System.out.println(max1);
    }

}
