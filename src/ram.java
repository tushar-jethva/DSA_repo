import com.sun.source.tree.Tree;

import java.util.*;
import java.util.concurrent.*;



class ram  {
    final static int a = 10;

    public static void main(String args[]){
//        int [] arr={0,1,2,4,2,1};
//        int target=3;
//        int ans=search(target,arr);
//
//        String[] nums = {"3","6","7","10"};
//        kthLargestNumber(nums,2);
//        System.out.println(kthLargestNumber(nums,4));

       // sumOfString("$a4%56");
//        String[] arr = {"a","b","b","d","d"};
//        unique(arr);
//        map.put(new Pair(1,2),1);
//        System.out.println(map);
//        int[] arr = {0,0,1,1,1,2,2,3,4,1,2,3,4,5};
//        System.out.println(mode(arr));

//          String s = "3ab 4bcd";
//          n(s);

//        int[] arr = {1,5,2,41,42,43,42,42,42,42,42,42,42};
//        subseq(arr);
//
//        Stack<Integer> stack = new Stack<>();
//        stack.push(12);


//        ram r = new ram();
//
//        PriorityBlockingQueue p = new PriorityBlockingQueue(10);
//        p.add(10);
//        p.add(20);
//        p.add(15);
//        p.add(14);
//
//
//
//
//        System.out.println(p);
//
//        Set<Integer> set = new HashSet<>();
//        set.add(12);
//        set.add(13);
//        set.add(14);
//
//        Set<Integer> set1  = new HashSet<>();
//        set1.add(14);
//        set1.add(15);
//        set1.add(16);
//
//        set1.add(null);
//        System.out.println(set1);

//        System.out.println(set1.retainAll(set));
//        System.out.println(set1);

//        LinkedHashSet<Integer> l = new LinkedHashSet<>();
//        l.add(10);
//        l.add(20);
//        l.add(30);
//        System.out.println(l);
//
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(12);
//        System.out.println(list.remove((Object)13));


//        TreeSet<Integer> t = new TreeSet<>(Collections.reverseOrder());
//        t.add(10);
//        t.add(9);
//        t.add(2);
//
//        System.out.println(t);
//
//        Map<Integer,Integer> map = new HashMap<>();
//        map.put(1,2);
//        map.put(2,3);
//        map.put(2,map.getOrDefault(2,0)+1);
//
//        for(int i:map.keySet()){
//            System.out.println(map.get(i));
//        }

//        TreeMap<Integer,Integer> m = new TreeMap<>(Collections.reverseOrder());
//        m.put(10,2);
//        m.put(11,3);
//        m.put(1,1);
//
//        System.out.println(m);

//        countB(150000,20000);
//        System.out.println(countB(150000,20000));

//        int n = 5;
//        String s[] = {"aibjg", "agjj", "f", "haee", "iccf"};
//        int k = 3;

//       GetMax(n,k,s);
//        System.out.println(GetMax(n,k,s));
//        List<Integer> list = new ArrayList<>();
//        list.add(3);
//        list.add(1);
//        list.add(2);
//        list.add(1);
//        list.add(3);
////        minOperations(list,2);
//        System.out.println(minOperations(list,3));

//        int[] nums = {2,3,3,2,2,4,2,3,4,4,4,4,4};
//        minOperations(nums);
//        System.out.println(minOperations(nums));
        int[] nums = {12,6,1,2,7};

        maximumTripletValue(nums);
        System.out.println(maximumTripletValue(nums));
    }

    public static long maximumTripletValue(int[] nums){
        int n = nums.length;
        long ans = Integer.MIN_VALUE;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j <n-1 ; j++) {
                for (int k = j+1; k < n; k++) {
                    ans = Math.max (ans, (long) (nums[i] - nums[j]) *nums[k]);
                }
            }
        }
        return ans;
    }

    public static long maximumTriletValue(int[] nums){
        int n = nums.length;
        int a3 = nums[n-1];
        int iIndex = 0;
        int kIndex = n-1;
        int k = n-2;

        while (k>1){
            if(nums[k]>a3){
                a3 = nums[k];
                kIndex = k;
            }
            k--;
        }

        int a1 = Integer.MIN_VALUE;
        for (int j = 0; j < kIndex-1; j++) {
            if(nums[j]>a1){
                a1 = nums[j];
                iIndex = j;
            }
        }


        int a2 = Integer.MAX_VALUE;
        for (int j = iIndex+1; j <kIndex; j++) {
            a2 = Math.min(a2,nums[j]);
        }

        long ans = (long) (a1 - a2) *a3;
        if(ans<0){
            return 0;
        }
        return ans;
    }

        public static long maximumTripletValu(int[] nums) {
        int n = nums.length;
            long a1 = nums[n-3];
            long a2 = nums[n-2];
            long a3 = nums[n-1];

            int i=n-4;
            int j=n-3;
            int k=n-2;

            while(i>=0){
                if(nums[k]>a3){
                    a1 = nums[i];
                    a2 = nums[j];
                    a3 = nums[k];
                }
                else if(nums[j]<a2){
                    a2 = nums[j];
                    a1 = nums[i];
                }
                else if(nums[i]>a1){
                    a1 = nums[i];
                }
                i--;
                j--;
                k--;
            }

            long ans = (a1-a2)*a3;
            if(ans<0){
                return 0;
            }
            return ans;

        }

    public static int minOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i:map.keySet()){
            int val = map.get(i);
            if(val%3==0){
                count+=val/3;
            }
            else if(val>=5){
                int n = val - 2;
                int n1 = (n/3) * 3;
                n = n - n1;
                n+=2;
                count+=n1/3;
                count+=n/2;
            }
            else if(val%2==0){
                count+=val/2;
            }
            else{
                count = -1;
                break;
            }
        }
        return count;
    }

    public static int minOperations(List<Integer> nums, int k) {
        List<Integer> l = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            l.add(i);
        }

        int count = 0;
        for (int i = nums.size()-1; i >=0 ; i--) {
            int ele = nums.get(i);
            if(l.contains(ele)){
                l.remove((Object)ele);
                count++;
                if(l.isEmpty()){
                    break;
                }
            }
            else{
                count++;
            }
        }
        return count;
    }

    public static int GetMax(int n, int k, String s[]){
//        // Code Here.
//        boolean flag = false;
//        int size = 0;
//        for (int i = 0; i < s.length; i++) {
//            if(s[i].length() == k){
//                flag = true;
//                break;
//            }
//            else if(s[i].length()<k){
//                size += s[i].length();
//                if(size == k){
//                    flag = true;
//                    break;
//                }
//            }
//        }
//        if(flag)
        return usingRecursion(0,"",k,s,0);
//        else
//            return 0;
    }

    public static int usingRecursion(int i,String temp,int k,String s[],int hashSize){
        if(i>=s.length){
            return 0;
        }

        String tempS = s[i] + temp;
        HashSet<Character> hashSet = new HashSet<>();

        for (int j = 0; j < tempS.length(); j++) {
            hashSet.add(tempS.charAt(j));
        }

        int include = 0;
        if(hashSet.size()<=k){
            include = 1 + usingRecursion(i+1,tempS,k,s,hashSet.size());

        }
        int exclude = usingRecursion(i+1,temp,k,s,hashSize);
        return Math.max(include,exclude);
    }

    public static long countB(int n, int k){
        // Code Here.
        return solve(n,k);
    }

    public static long solve(int n,int k){
        return 2L *(k-1)+ (long) (n - 2) *(k-2);
    }

    static void subseq(int[] arr){
        Arrays.sort(arr);
        int max_count = 0;
        int count = 1;

        for (int i = 0; i < arr.length-1; i++) {
            if(Math.abs(arr[i]-arr[i+1])==1){
                count++;
                max_count = Math.max(max_count,count);
            }
            else if(arr[i]==arr[i+1]){

            }
            else{
                count = 1;
            }
        }
        System.out.println(max_count);
    }

    static void n(String s){
        String[] arr = s.split(" ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+"->");
//        }
        for (int i = 0; i < arr.length; i++) {
            int l = Integer.parseInt(String.valueOf(arr[i].charAt(0)));
            String substring = arr[i].substring(1);
//            System.out.println(substring);
            for (int j = 0; j < l; j++) {
                System.out.println(substring);
            }
        }
    }

    static int mode(int[] arr){
       Map<Integer,Integer> map = new HashMap<>();

        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        int key = 0;

        for(int i:map.keySet()){
            if(map.get(i) > max){
                max = map.get(i);
                key = i;
            }
        }

        System.out.println(max);
        System.out.println(key);
        return key;
    }

    static void unique(String[] ar){
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < ar.length; i++) {
            set.add(ar[i]);
        }


        for (int i = 0; i < set.size(); i++) {
            System.out.println(set);
        }
    }

    static void sumOfString(String s){
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                int a = Integer.parseInt(String.valueOf(c));
                sum+=a;
            }
        }
        System.out.println(sum);
    }



    static  int maxfinder(int [] mountainArr){
        int start=0;
        int end= mountainArr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if( mountainArr[mid]> mountainArr[mid+1]){
                end=mid;
            }
            else if (mountainArr[mid]< mountainArr[mid+1]){
                start=mid+1;
            }
        }
        return start;
    }
    static int search(int target,int [] mountainArr){
        int peak=maxfinder(mountainArr);

        int firsttry=bs(target,mountainArr,0,peak);
        if(firsttry!=-1){
            return firsttry;
        }
        return bs(target,mountainArr,peak+1,mountainArr.length-1);
    }

    static  int bs(int target,int [] mountainArr,int start,int end){

        while(start<=end){
            int mid=(start)+(end-start)/2;
            if(target==mountainArr[mid]){
                return mid;
            }

            if(mountainArr[0]>mountainArr[mountainArr.length-1]){

                if(target>mountainArr[mid]){
                    end=mid-1;
                } else if(target<mountainArr[mid]) {
                    start=mid+1;

                }}
            else{

                if(target>mountainArr[mid]) {
                    start = mid + 1;
                }
                else if(target<mountainArr[mid]){
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static String kthLargestNumber(String[] nums, int k) {

        int []a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[i] = Integer.parseInt(nums[i]);
        }
        Arrays.sort(a);
        int b = a[a.length-k];
        String c = Integer.toString(b);
        return c;

    }


}