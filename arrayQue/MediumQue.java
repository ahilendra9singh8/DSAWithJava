package arrayQue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MediumQue {
    public static void main(String[] args) {
        // // 1.Two sum problem
        // int[] arr = { 2, 11, 15, 7 };
        // int n = 9;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j <= arr.length; j++) {
        // if ((arr[i] + arr[j]) == n) {
        // System.out.println(i + " : " + j);
        // break;
        // }
        // }
        // }

        // 2. Sort an array of 0s, 1s,2s
        // // 2.1: Broute Force approach - using sort method
        // int[] intArray = { 2, 0, 2, 1, 1, 0 };
        // Arrays.sort(intArray);
        // for (int val : intArray) {
        // System.out.println(val);
        // }

        // // 2.2: Better Approach
        // int[] intArray = { 2, 0, 2, 1, 1, 0 };
        // int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        // for (int i = 0; i < intArray.length; i++) {
        // if (intArray[i] == 0)
        // cnt0++;
        // if (intArray[i] == 1)
        // cnt1++;
        // if (intArray[i] == 2)
        // cnt2++;
        // }
        // for (int i = 0; i < cnt0; i++) {
        // intArray[i] = 0;
        // }
        // for (int i = cnt0; i < cnt0 + cnt1; i++) {
        // intArray[i] = 1;
        // }
        // for (int i = cnt0 + cnt1; i < cnt0 + cnt1 + cnt2; i++) {
        // intArray[i] = 2;
        // }

        // for (int i = 0; i < intArray.length; i++) {
        // System.out.println(intArray[i]);
        // }

        // 3.Majority Element
        // // 3.1: Broute Force Approach
        // int[] intArray = { 2, 2, 1, 1, 1, 2, 2 };
        // int n = intArray.length;
        // int result = 0;
        // for (int i = 0; i < n; i++) {
        // int cnt = 0;
        // for (int j = 0; j < n; j++) {
        // if (intArray[i] == intArray[j]) {
        // cnt++;
        // }
        // if (cnt > n / 2) {
        // result = intArray[i];
        // }
        // }
        // }
        // System.out.println(result);

        // // 3.2: Better Approach
        // int[] intArray = { 2, 2, 1, 1, 1, 2, 2 };
        // int n = intArray.length;
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < n; i++) {
        //     map.put(intArray[i], map.getOrDefault(intArray[i], 0) + 1);
        // }
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if (entry.getValue() > n / 2) {
        //         System.out.println(entry.getKey());
        //     }
        // }

        // 4.

    }
}
