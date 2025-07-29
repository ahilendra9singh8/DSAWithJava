package arrayQue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HardQue {
    public static void main(String[] args) {

        // 1.Pascal's Triangle
        // // 1.1 -> Variation 1: Given row number r and column number c. Print the
        // element at position (r, c) in Pascal’s triangle.
        // // give r(rows) and c(columns) than i want output direct
        // int r = 5;
        // int c = 3;
        // int result = fun_nCr(r - 1, c - 1);
        // System.out.println(result);

        // 1.2 : Variation 2: Given the row number n. Print the n-th row of Pascal’s
        // Broute Force
        // int r = 5;
        // for (int i = 1; i <= r; i++) {
        // int result = fun_nCr(r - 1, i - 1);
        // System.out.print(result + " ");
        // }

        // // Better Approach
        // int r = 5;
        // int ans = 1;
        // System.out.print(ans + " ");
        // for (int i = 1; i < r; i++) {
        // ans = ans * (r - i);
        // ans = ans / (i);
        // System.out.print(ans + " ");
        // }

        // // 1.3: print pascals Triangle
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // // here i is a row
        // int ans = 1;
        // System.out.print(ans + " ");
        // for (int j = 1; j < i; j++) {
        // ans = ans * (i - j);
        // ans = ans / j;
        // System.out.print(ans + " ");
        // }
        // System.out.println();
        // }

        // 2.Majority Element (n/3 times)
        // int[] nums = {3,2,3};
        // // 2.1 ==>Broute Force Approach
        // int n = nums.length;
        // List<Integer> result = new ArrayList<>();
        // for(int i=0; i<n; i++){
        // int cnt = 0;
        // for(int j=0; j<n; j++){
        // if(nums[i] == nums[j]){
        // cnt++;
        // }
        // }
        // if(cnt > n/3){
        // if(!result.contains(nums[i])){
        // result.add(nums[i]);
        // }
        // }
        // }
        // here print result

        // // 2.2 => Better Approach
        // int n = nums.length;
        // List<Integer> result = new ArrayList<>();
        // HashMap<Integer,Integer> freqMap = new HashMap<>();
        // for(int i=0; i<n; i++) {
        // freqMap.put(nums[i], freqMap.getOrDefault(nums[i],0)+ 1);
        // }

        // for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
        // if(entry.getValue() > n/3){
        // if(!result.contains(entry.getKey())){
        // result.add(entry.getKey());
        // }
        // }
        // }

        // here print result;

        // 3 ==> 3Sum
        // int[] nums = { -1, 0, 1, 2, -1, -4 };
        // 3.1 ==> Broute Force Approach
        // int n = nums.length;
        // Set<List<Integer>> set = new HashSet<>();
        // for(int i=0; i<n; i++){
        // for(int j=i+1; j<n; j++){
        // for(int k=j+1; k<n; k++){
        // if(nums[i] + nums[j] + nums[k] == 0){
        // List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
        // list.sort(null);
        // set.add(list);
        // }
        // }
        // }
        // }
        // List<List<Integer>> result = new ArrayList<>(set);
        // return result;

        // 3.2 ==> Better Approach
        // int n = nums.length;
        // Set<List<Integer>> resultSet = new HashSet<>();
        // for(int i=0; i<n; i++){
        // HashSet<Integer> set = new HashSet<>();
        // for(int j=i+1; j<n; j++){
        // int k = -(nums[i] + nums[j]);
        // if(set.contains(k)){
        // List<Integer> list = Arrays.asList(nums[i], nums[j], k);
        // list.sort(null);
        // resultSet.add(list);
        // }
        // set.add(nums[j]);
        // }
        // }
        // List<List<Integer>> result = new ArrayList<>(resultSet);
        // return result;

        // // 3.3 ==> Optimal Approach
        // int n = nums.length;
        // List<List<Integer>> result = new ArrayList<>();
        // Arrays.sort(nums);
        // for(int i=0; i<n; i++){
        // if(i!=0 && nums[i] == nums[i-1]) continue;
        // int j = i+1;
        // int k = n-1;
        // while(j<k){
        // int sum = nums[i] + nums[j] + nums[k];
        // if(sum>0){
        // k--;
        // while(j<k && nums[k] == nums[k+1]) k--;
        // }else if(sum<0){
        // j++;
        // while(j<k && nums[j] == nums[j-1]) j++;
        // }else{
        // List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
        // result.add(list);
        // j++;
        // k--;

        // while(j<k && nums[j] == nums[j-1]) j++;
        // while(j<k && nums[k] == nums[k+1]) k--;
        // }
        // }
        // }
        // return result;

        // // 4 ==> 4-Sum Problem
        // int[] nums = { 1, 0, -1, 0, -2, 2 };
        // int target = 0;
        // // 4.1 => Broute Force Approach
        // int n = nums.length;
        // Set<List<Integer>> set = new HashSet<>();
        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n; j++) {
        // for (int k = j + 1; k < n; k++) {
        // for (int l = k + 1; l < n; l++) {
        // long sum = nums[i] + nums[j];
        // sum+=nums[k];
        // sum+=nums[l];
        // if (sum == target) {
        // List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
        // Collections.sort(temp);
        // set.add(temp);
        // }
        // }
        // }
        // }
        // }
        // List<List<Integer>> ans = new ArrayList<>(set);
        // return ans;

        // 4.2 => Better Approach
        // int n = nums.length;
        // Set<List<Integer>> st = new HashSet<>();
        // for(int i=0; i<n; i++){
        // for(int j=i+1; j<n; j++){
        // Set<Long> hashset = new HashSet<>();
        // for(int k=j+1; k<n; k++){
        // long sum = nums[i] + nums[j];
        // sum += nums[k];
        // long fourth = target - sum;
        // if (hashset.contains(fourth)) {
        // List<Integer> temp = new ArrayList<>();
        // temp.add(nums[i]);
        // temp.add(nums[j]);
        // temp.add(nums[k]);
        // temp.add((int) fourth);
        // temp.sort(Integer::compareTo);
        // st.add(temp);
        // }
        // hashset.add((long) nums[k]);
        // }
        // }
        // }
        // List<List<Integer>> ans = new ArrayList<>(st);
        // return ans;

        // // 4.3 ==> Better Approach
        // Arrays.sort(nums);
        // int n = nums.length;
        // Set<List<Integer>> st = new HashSet<>();
        // for(int i=0; i<n; i++){
        // if (i > 0 && nums[i] == nums[i - 1]) continue;
        // for(int j=i+1; j<n; j++){
        // if (j > i + 1 && nums[j] == nums[j - 1]) continue;
        // int k=j+1;
        // int l=n-1;
        // while(k<l){
        // long sum = nums[i]+nums[j];
        // sum+=nums[k];
        // sum+=nums[l];
        // if(sum>target){
        // l--;
        // }else if(sum<target){
        // k++;
        // }else{
        // List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
        // st.add(list);
        // k++;
        // l--;

        // while(k<l && nums[k]==nums[k-1]) k++;
        // while(k<l && nums[l]==nums[l+1]) l--;
        // }
        // }
        // }
        // }
        // List<List<Integer>> result = new ArrayList<>(st);
        // return result;

        // // 5.Largest Subarray with 0 Sum
        // // 5.1 ==> Broute Force Approach
        // int[] arr = { 6, -2, 2, -8, 1, 7, 4, -10 };
        // int n = arr.length;
        // int longest = 0;
        // for (int i = 0; i < n; i++) {
        //     int sum = 0;
        //     for (int j = i; j < n; j++) {
        //         sum += arr[j];
        //         if (sum == 0) {
        //             longest = Math.max(longest, j - i + 1);
        //         }
        //     }
        // }
        // System.out.println(longest);

        // 5.2 ==> Optimal Approach
        
    }

    // private static int fun_nCr(int n, int r) { // nCr = n!/r!*(n-r)!
    // int result = 1;
    // for (int i = 0; i < r; i++) {
    // result = result * (n - i);
    // result = result / (i + 1);
    // }
    // return result;
    // }
}
