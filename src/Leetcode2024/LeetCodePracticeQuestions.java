package Leetcode2024;

import java.util.*;

public class LeetCodePracticeQuestions {
    public static void main(String[] args) {
//        int[]g = {1,1,2,1,3,2,4};
//        int[]s = {1,1,2,3,5};
//
//        int ans = findContentChildren(g,s);
//        System.out.println(ans);
//        String[] bank = {"0000","1111","0001","0000","0000","1100"};
//        numberOfBeams(bank);

    }

    //jan1
    public static int findContentChildren(int[] g, int[] s) {
        HashMap<Integer,Integer> m1 = new HashMap<>();
        HashMap<Integer,Integer> m2 = new HashMap<>();

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < g.length; i++) {
            m1.put(g[i],m1.getOrDefault(g[i],0)+1);
            set.add(g[i]);
        }

        for (int i = 0; i < s.length; i++) {
            m2.put(s[i],m2.getOrDefault(s[i],0)+1);
        }

        int count = 0;
        for(int num:set){
            int p = m1.get(num);

            if(m2.containsKey(num)){
                if(p>=m2.get(num)){
                    count+=m2.get(num);
                }
                else{
                    count+=p;
                }
            }
        }
        return count;
    }

    //jan2
    public static List<List<Integer>> findMatrix(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        int j = nums.length-1;
        while (j>=0){
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if(!temp.contains(nums[i]) && nums[i]!=0){
                    temp.add(nums[i]);
                    nums[i] = 0;
                    j--;
                }
            }
            list.add(temp);
        }
        System.out.println(list);
        return list;
    }

    //jan3
    public static int numberOfBeams(String[] bank) {
        int[] freq = new int[bank.length];

        for (int i = 0; i < bank.length; i++) {
            for (int j = 0; j < bank[i].length(); j++) {
                if(bank[i].charAt(j)=='1'){
                    freq[i] += 1;
                }
            }
        }

        int first = 0;
        int index = 0;
        int ans = 0;

        for (int i = 0; i < freq.length; i++) {
            if(freq[i]!=0){
                first = freq[i];
                index = i;
                break;
            }
        }

        for (int i = index+1; i <freq.length ; i++) {
            if(freq[i]!=0){
                ans+=first*freq[i];
                first = freq[i];
            }
        }

        System.out.println(Arrays.toString(freq));
        System.out.println(ans);
        return  0;
    }

    //jan4
    public int minOperations(int[] nums) {
        int count = 0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for(int num:set){
            int n = freq.get(num);
            if(n==1){
                return -1;
            }
            if(n==2){
                count+=1;
            }
            else if(n%3==1){
                count += ((n/3)-1)+2;
            }
            else if(n%3==2){
                count += (n/3)+1;
            }
            else{
                count+=(n/3);
            }
        }
        return  count;
    }
}
