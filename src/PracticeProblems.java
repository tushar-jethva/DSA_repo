import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
import OOPs.*;
class Item {
    int value, weight;

    Item(int x, int y) {
        this.value = x;
        this.weight = y;
    }
}
public class PracticeProblems {
    public static void main(String[] args){

//        int a = 10;
//        int x = (++a)+(++a);
//        System.out.println(x);

//    List<Integer> a = new ArrayList<Integer>();
//    a.add(3);
//    if(a.contains(3)){
//        System.out.println("yes");
//    }
//    else{
//        System.out.println("no");
//    }
//
//        List<List<Integer>> list = new ArrayList<>();
//        List<Integer> dp = new ArrayList<>();
//
//        for(int i=0;i<5;i++){
//            list.add(new ArrayList<>());
//        }
//
//        list.get(0).add(1);
//        list.get(1).add(1);
//        list.get(1).add(1);
//
//        System.out.println(list);


//        double a = 0.8888;
//        print(a);
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t--!=0){
//            double d =sc.nextDouble();
//            print(d);
//        }
//
//        String c = sc.next();
//        Scanner sc = new Scanner(System.in);
//        int t =sc.nextInt();
//        while (t--!=0){
//            String c = sc.nextLine();
//            String b = sc.nextLine();
//            pr(c,b);
//        }
        //String[] nums = {"2","21","12","1"};

        // int[]nums = {3,6,7,10};
//        kthLargestNumber(nums,3);
//        System.out.println(kthLargestNumber(nums,3));
//        int[]nums = {1,2,1};
//        nextGreaterElements(nums);
//       char[] s = {'h','e','l','l','o'};
//       reverseString(s);
//
//       String st ="   fly me   to   the moon  ";
//       reverseString2(st);

//        isPalindrome(-121);
        // System.out.println(isPalindrome(10));

//        int[] nums = {1,2,3,4,5,6,7};
//        rotate(nums,3);

//        String s = "loveleetcode";
//        st(s);

//        int[]arr = {5,2,9,1,8,6,4,3,7};
//        int[]nums = {5,8,9};
//        num(arr,nums);

//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t--!=0){
//            int a =sc.nextInt();
//            int b = sc.nextInt();
//            hel(a,b);
//
//        }


//        int[]nums = {1,1,1,2,2,3};
//        topKFrequent(nums,2);
//        ArrayList<Integer> list =  new ArrayList<>();
//        list.add(0,12);
//        list.add(0,13);
//        list.add(0,14);
//        System.out.println(list);

//        isLongPressedName("alex","aaleex");
//        System.out.println(isLongPressedName("alex","aaleex"));

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1st String");
//        String str1 = sc.next();
//        System.out.println("Enter 2nd String");
//        String str2 = sc.next();
//        System.out.println(longestCommonSubsequence(str1,str2));
//
//        Item[] a = {
//                    new Item(2,30),
//                    new Item(3,30),
//                    new Item(1,10),
//                    new Item(5,60)
//        };
//        int w = 60;
//        int n = 4;
//
//        System.out.println( fractionalKnapsack(w,a,n));

//        String txt = "AABAACAADAABAAABAA";
//        String pat = "AABA";
//        search(txt, pat);
//       String strs[] = {"flower","flower flow","flight"};
//        longestCommonPrefix(strs);
//        System.out.println(longestCommonPrefix(strs));
       // isIsomorphic("add","egg");
//        isIsomorphic("bbbaaaba","aaabbbba");
//        System.out.println(isIsomorphic("bbbaaaba","aaabbbba"));

//        String[] post = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
//        postfix(post);
//        System.out.println(postfix(post));
//         int[]temperatures = {73,74,75,71,69,72,76,73};
//         dailyTemperatures(temperatures);
//         System.out.println(Arrays.toString(dailyTemperatures(temperatures)));


//        int[]temperatures = {73,74,75,71,69,72,76,73};
//        dailyTempe(temperatures);
//        System.out.println(Arrays.toString(dailyTempe(temperatures)));

//        String[] strs = {"abc","bce","cae"};
//        String[] strs = {"zyx","wvu","tsr"};
//        minDeletionSize(strs);
//        System.out.println(minDeletionSize(strs));

//        int []tasks = {2,2,3,3,2,4,4,4,4,4};
//        minimumRounds(tasks);
//        System.out.println(minimumRounds(tasks));

//          int[] gas = {1,2,3,4,5};
//          int[] costs = {3,4,5,1,2};
//          canCompleteCircuit(gas,costs);
//        System.out.println(canCompleteCircuit(gas,costs));
//        System.out.println(1000000%3);
//        System.out.println(Math.ceil(10/3.0));
//          int[] nums = {756902131,995414896,95906472,149914376,387433380,848985151
//        };
//          //maxKelements(nums,6);
//        System.out.println(maxKelements(nums,6));
//        int ver = 7;
//        int[][]edges = {
//                {0,1},
//                {0,2},
//                {1,4},
//                {1,5},
//                {2,3},
//                {2,6}
//        };
//        adjacencyList(ver,edges);
//        smallestEquivalentString("parker","morris","parser");
//        System.out.println(smallestEquivalentString("parker","morris","parser"));

//        int [] nums = {1,2,3,4};
//        differenceOfSum(nums);
//        int[][] que = {{0,0,1,1}};
//        rangeAddQueries(2,que);
//        int []nums = {3,1,4,3,2,2,4};
//        System.out.println(countGood(nums,2));
//        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
//        listOfArray(arr);
//        minFlipsMonoIncr("101011");
//        System.out.println(minFlipsMonoIncr("10101100000"));

//        int[]nums = {1,-2,3,-2};
//        maxSubarraySumCircular(nums);
//        alternateDigitSum(111);
//        System.out.println(alternateDigitSum(111));
//        int[][]score = {{64766,11978,20502,21365,79611,36797,58431,89540,59373,25955},{51305,66104,88468,5333,17233,32521,14087,42738,46669,65662},{93306,92793,54009,9715,24354,24895,20069,93332,73836,64359},{23358,84599,4675,20979,76889,34630,64098,23468,71448,17848}
//};
//        int k = 5;
//        sortTheStudents(score,k);
//        System.out.println(Arrays.deepToString(sortTheStudents(score, k)));
//        int[] n = {-1,-2,-3};
//        maximumProduct(n);
//        System.out.println(maximumProduct(n));
//        int n = 3;
//        int[][] trust = {{1,2},{2,3}};
//        findJudge(n,trust);
//        System.out.println(findJudge(n,trust));
//        int[] scores = {1,2,3,5};
//        int[] ages = {8,9,10,1};
//        bestTeamScore(scores,ages);
//        System.out.println(bestTeamScore(scores,ages));

        //System.out.println(gcdOfStrings("CODE","LEET"));
        //int[] banned = {179,266,77,196,59,313,286,41,21,201,57,237,74,333,101,281,227,25,138,10,304,55,50,72,244,113,159,330,154,156,311,170,283,9,224,46,197,2,325,237,54,168,275,166,236,30,250,48,274,331,240,153,312,63,303,342,79,37,165,20,79,293,103,152,215,44,56,196,29,251,264,210,212,135,296,123,289,257,208,309,67,114,170,119,337,163,242,162,109,318,51,105,272,240,107,226,224,188,224,317,27,102,63,128,3,133,27,134,186,220,198,24,274,287,267,8,13,322,278,166,304,165,342,89,184,300,312,339,163,307,123,137,293,227,229,57,66,13,71,233,260,79,228,301,4,4,89,196,193,337,205,51,144,99,104,73,10,311,240,168,77,244,114,217,186,134,229,241,46,89,54,127};
//int[] banned = {1,6,5};
//        maxCount(banned,5,6);
//        checkInclusion("ab","eidabooo");
//        System.out.println(checkInclusion("ab","eidabooo"));
//        int[] gifts = {1,1,1,1};
//        pickGifts(gifts,4);
//        String[] words = {"a","e","i"};
//        int [][] queries = {
//                {0,2},
//                {0,1},
//                {2,2}
//        };
////        vowelStrings(words,queries);
//        int[] arr = {2,7,9,3,1};
//        System.out.println(minCapability(arr,2));
//        minCapability(arr,2);
        //findAnagrams("abab","ab");
//        int[]f = {1,2,3,2,2};
//        totalFruit(f);
//        System.out.println(totalFruit(f));
        //isPalindrome("cbaababbb");
//        int[] nums = {2,3,1,1,4};
//        jump(nums);
//        int[]nums = {5,14,13,8,12};
//        findTheArrayConcVal(nums);
//        System.out.println(findTheArrayConcVal(nums));
//        int[] nums = {1,7,9,2,5};
//        countFairPairs(nums,11,11);
//        System.out.println(countFairPairs(nums,11,11));
//        int[]n ={9,9,9,9,9,9,9,9,9,9}; int k=1;
//        addToArrayForm(n,k);
//        System.out.println(addToArrayForm(n,k));
       // hello("abcdd","ac");


        // your code goes here
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t--!=0){
//            int a = sc.nextInt();
//            int s = sc.nextInt();
//            he(a,s);
//            System.out.println();
//        }
//        int[]n = {10,4,8,3};
//        leftRigthDifference(n);
//            String w = "998244353";
//            divisibilityArray(w,10);
//        System.out.println(Arrays.toString(divisibilityArray(w,3)));
//        List<Integer> a = new ArrayList<>();
//        a.add(3);
//        a.add(1);
//        a.add(2);
//        a.add(5);
//        a.add(3);
//        repeatedNumber(a);
//        System.out.println(repeatedNumber(a));

       // hello(6,89);
//        int[][]intr = {
//                {4,3},
//                {2,5},
//                {7,8},
//        } ;
//overlappedInterval(intr);
      //  System.out.println(Math.ceil(60/25.0));

        //char[]ch = {'a','","b","b","b","b","b","b","b","b","b","b","b"};
//                char[]chr={'a','a','b','b','c','c','c'};
//                compress(chr);
//        System.out.println(compress(chr));
//        String co = 12+"";
//        System.out.println(co);
//        splitNum(100000);
//        System.out.println(splitNum(687));
//        int[]a = {1, 3 ,5 ,8 ,9 ,8};
//        hi(a);

//        divide(-2147483648,-1);
//        System.out.println(divide(-2648,-1));

       // printPattern(3);
//        int[]a = {1,1,2,4,1,2,2};
//        stableArray(7,a);
//        System.out.println(stableArray(7,a));
//        int[]a  = {10,20,30,40,50};
//        int maxValue = Integer.MIN_VALUE;
//       maxi(a.length,a,0,maxValue);
//      //  System.out.println(max);
//        System.out.println(maxValue);
        //subSeq("xy","",0,0);
//        ArrayList<Integer> a = new ArrayList<>();
//        a.add(1);
//        a.add(2);
//        a.add(3);
//        subsets(a);
//        int[]arr = {2};
//        int n = arr.length;
        //hello4(4);
//        int[] spells = {3,1,2};
//        int[] potions = {8,5,8};
//        int[] ans = new int[spells.length];
//        long success = 16;
//        Arrays.sort(potions);
//
//        for (int i = 0; i < spells.length; i++) {
//            int ansToStore = binarySearch(potions,success,0,0,potions.length-1,spells[i]);
//            ans[i] = ansToStore;
//        }
//
//        for (int i = 0; i < ans.length; i++) {
//            System.out.println(ans[i]);
//        }

       // int ans = binarySearch(arr,16,0,0,arr.length-1);
//        List<List<Integer>> list = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(19);
//        list1.add(20);
//        list.add(list1);
//        System.out.println(list.get(0).get(1));

//        int[]arr = {5,1,4,2};
//        int ans = numRescueBoats(arr,6);

//        List<List<Integer>> ans = generate(4);
//        System.out.println(ans);
//        int[] arr  = {1,2,3,4,5};
//        int a = 20;
//        pra(arr,a);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        System.out.println(a);

//        int[] arr = {1,2,2,1,5,5,3,4,5};
//        boolean flag = false;
//        int[] temp = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j <temp.length; j++) {
//                if(temp[j]==arr[i]){
//                    flag = false;
//                    break;
//                }else{
//                    flag = true;
//                }
//            }
//            if(flag){
//                temp[i] = arr[i];
//        kthFactor(7,2);

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        list.get(0).add(3);
        list.get(0).add(6);
        list.get(1).add(1);
        list.get(1).add(5);
        list.get(2).add(4);
        list.get(2).add(7);

        Collections.sort(list,(a,b)->Double.compare(a.get(0),b.get(0)));
        System.out.println(list);

        numberOfPoints(list);
        System.out.println(numberOfPoints(list));

    }

    public static int numberOfPoints(List<List<Integer>> nums) {
        int ans = 0;
        int[][] arr = new int[1][2];
        arr[0][0] = nums.get(0).get(0);
        arr[0][1] = nums.get(0).get(1);

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i).get(0)<=arr[0][1]){
                arr[0][0] = Math.min(nums.get(i).get(0),arr[0][0]);
                arr[0][1] = Math.max(nums.get(i).get(1),arr[0][1]);
            }
            else{
                    ans += Math.abs(arr[0][0] - arr[0][1] + 1);
                    arr[0][0] = -1;
                    arr[0][1] = -1;
            }
        }
        ans += Math.abs(arr[0][0] - arr[0][1] + 1);
        return ans;
    }




    public static int kthFactor(int n, int k) {
        List<Integer> list = new ArrayList<>();

        int start=1;
        int end = n;

        usingRecursion(n,1,n,list);
        System.out.println(list);
        return 1;
    }

    public static void usingRecursion(int n, int start,int end,List<Integer> list){

        if(start>end){
            return;
        }

        int mid = start+(end-start)/2;
        if(n%mid==0){
            list.add(mid);
        }
        usingRecursion(n,start,mid-1,list);
        usingRecursion(n,mid+1,end,list);

    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();



        q.add(10);
        Integer qu = q.poll();
        for(int i=1;i<=numRows;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0 || j==i-1){
                    list.add(1);
                }
                else{
                    list.add(ans.get(i-2).get(j-1)+ans.get(i-2).get(j));

                }
            }
            ans.add(list);
        }
        return ans;
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 1;
        int newLimit = limit;
        for(int i=0;i<people.length-1;i++){
            newLimit-=people[i];
            if(newLimit<people[i+1]){
                boats++;
                newLimit = limit;
            }
        }
        return boats;
    }

    public static int binarySearch(int[] arr,long target,int ans,int s, int e,int value){
        while (s<=e){
            int mid = s+(e-s)/2;
            if((long) arr[mid] *value >= target){
                ans += (e-mid)+1;
                return binarySearch(arr,target,ans,s,mid-1,value);
            }

            if((long) arr[mid] *value < target){
                s = mid+1;
            }
            else{
                e = mid - 1;
            }
        }

        return ans;
    }

    public static void hello4(int n){

        int[][] arr = new int[n][n];

        if(n%2==0){
            //patiyu 1

            for (int i = 0; i < n/2; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = 2*((4*i)+j)+1;
                }
            }

            for (int i = n/2; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = 2*((4*(i-n/2)+j))+2;
                }
            }
        }
        else{
            //patiyu 2

            for (int i = 0; i <2 ; i++) {
                
            }
        }
    }

    public static void hello3(int[] arr, int n){

//        HashSet<Integer> set = new HashSet<>();
//        for(int i=0;i<n;i++){
//            set.add(arr[i]);
//        }

//        int[] b = new int[set.size()];
        int count = 1;
//        int k=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else{
                break;
            }
        }


        System.out.println(n-count);
    }


    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A)
    {
        //code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> l = new ArrayList<>();
        list = helper(A,list,l,0,"");
        return list;

    }

    public static ArrayList<ArrayList<Integer>> helper(ArrayList<Integer>A, ArrayList<ArrayList<Integer>> list,ArrayList<Integer> l, int i,String s){

        if(i==A.size()){
            int n=0;
            if(!s.isEmpty()) {
                n = Integer.parseInt(s);
            }
            l.add(n);
            list.add(l);
            return list;
        }

        helper(A,list,l,i+1,s+A.get(i)+"");
        return helper(A,list,l,i+1,s);
    }

    public static void subSeq(String str,String s,int i,int count){

        if(i==str.length()){
            System.out.println(s+"->");
            return;
        }

        subSeq(str,s+str.charAt(i),i+1,count);
        subSeq(str,s,i+1,count);
    }

    public static void maxi(int n, int[]a, int i, int max){
        if(i>=n){
            return ;
        }

        if(max<a[i]){
            max = a[i];
        }

         maxi(n,a,i+1,max);
    }

    public static int stableArray(int n, int[] a) {
        // code here

        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            set.add(a[i]);
        }

        int[]freq = new int[map.size()];

        int p=0;
        for(int num:set){
            freq[p] = map.get(num);
            p++;
        }

        Arrays.sort(freq);
        int ans = 0;
        int count = 1;
        for (int i = 0; i < freq.length-1; i++) {
            if (freq[i]==freq[i+1]){
                count++;
            }
            else{
                count=1;
            }
           ans = Math.max(ans,count);
        }

        return set.size() - ans;
    }

    public static ArrayList<Character> printPattern(int N) {
        // code here
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i + 1; j++) {
                list.add('*');
            }
            if(i<N-1)
            list.add(' ');
        }

        HashSet<Integer> set = new HashSet<>();


        for (char ch :
                list) {
            System.out.print(ch);
        }

      return list;
    }

    public static int divide(int dividend, int divisor) {

        long s = 0;
        long e = dividend<0?dividend*(-1):dividend;

        while(s<=e){
            long mid = s+(e-s)/2;

            if(Math.abs(mid*divisor) == Math.abs(dividend)){

                if((dividend<0 && divisor<0) || (dividend>0 && divisor>0))
                {
                    return (int)mid;
                }
                else{
                    return (int)mid*(-1);
                }
            }
            else if(Math.abs(mid*divisor)<Math.abs(dividend)){
                s = mid+1;
            }
            else{
                e = mid - 1;
            }
        }

        if((dividend<0 && divisor<0) || (dividend>0 && divisor>0)){
            return (int)e;
        }
        else{
            return (int)-e;
        }
    }

    public static void hi(int[] arr){

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int j=1;
        int c = 0;
        int prev = 1;
        long ans = 0;
        while (true){
            if(map.get(j) == null){
                break;
            }
            else{
                c = map.get(j);
                ans = ans + (long) c *prev;
                prev = c*prev;
                j++;
            }
        }
        ans = (long)((long) ans%(Math.pow(10,9)+7));
        System.out.println(ans);
    }

    public static void sortAll(int[] arr){
        Arrays.sort(arr);
        int maxi = 0;
        int curr = 1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                curr++;
            }
            else{
                curr = 1;
            }

                maxi = Math.max(maxi,curr);

        }
        if(maxi == 1){
            System.out.println(arr.length-1);
        }
        else{
            System.out.println(arr.length - maxi);
        }

    }

    public static int[][] overlappedIntervalp(int[][] Intervals)
    {
        // Code here // Code here
        Arrays.sort(Intervals,(a,b)->Integer.compare(a[0],b[0]));
        //Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        for(int interval[]:Intervals){

            if(result.size()==0 || result.get(result.size()-1)[1] < interval[0]){
                result.add(interval);
            }
            else{
                result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1],interval[1]);
            }
        }

        return result.toArray(new int[result.size()][]);


    }

    public static  int splitNum(int num) {
        String sc = Integer.toString(num);
        char[]ch = sc.toCharArray();
        int sum = 0;
        int n=ch.length;
        Arrays.sort(ch);
        int i=(n/2)+1;
        String a = "";
        String b = "";
        a+=ch[0];
        while(i<n){
            a+=ch[i]+"";
            i++;
        }

        for(int i1=1;i1<=n/2;i1++){
            b+=ch[i1]+"";
        }
//        System.out.print(a);
//        System.out.println();
//        System.out.print(b);
//        System.out.println();
        sum = Integer.parseInt(a)+Integer.parseInt(b);
        return sum;
    }

    public static int compress(char[] chars) {
        Map<Character,Integer> map = new HashMap<>();

        for(char ch: chars){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int ans = 0;
        HashSet<Character> set = new HashSet<>();
        for(char ch: chars){
            set.add(ch);
        }
        for(char ch:set){
            if(map.get(ch)>=2){
                String b = Integer.toString(map.get(ch));
                ans+=b.length()+1;
            }
            else{
                ans+=1;
            }
        }
        return ans;
    }

    public static int[][] overlappedInterval(int[][] Intervals)
    {
        // Code here // Code here
        Arrays.sort(Intervals,(a,b)->Integer.compare(a[0],b[0]));
        //Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        for(int interval[]:Intervals){

            if(result.size()==0 || result.get(result.size()-1)[1] < interval[0]){
                result.add(interval);
            }
            else{
                result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1],interval[1]);
            }
        }

        return result.toArray(new int[result.size()][]);


    }

    static void hello(int a,int b){
        int sec = 1;

        if(a%2==0){
            sec+= (int)Math.ceil((b-(a+2))/2.0);
        }
    }

    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int n = A.size();
        int []a = new int[A.size()];
        for(int i=0;i<n;i++){
            a[i] = A.get(i);
        }


        int k=0;
        while(k<n){
            int correct = a[k]-1;
            if(a[k]!=a[correct]){
                swapn(a,k,correct);
            }
            else{
                k++;
            }
        }

        ArrayList<Integer>list = new ArrayList<>();
        for(int j=0;j<n-1;j++){
            if(a[j]==a[j+1]){
                list.add(a[j]);
                list.add(a[j]+1);
                break;
            }

        }
        return list;
    }

    static void swapn(int[] A,int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;

    }

    public static int[] divisibilityArray(String word, int m) {
        int n = word.length();
        char []c = word.toCharArray();
        int[] arr = new int[n];
        String str = "";
        int lSum = Integer.parseInt(String.valueOf(c[0]));
        arr[0] = Integer.parseInt(String.valueOf(c[0]));
        for (int i = 1; i < n; i++) {
            if(c[i] == '0'){
                lSum = lSum * 10;
            }
            else{
                lSum = (lSum*10)+Integer.parseInt(String.valueOf(c[i]));
            }
            arr[i] = lSum;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%m==0){
                arr[i] = 1;
            }
            else{
                arr[i]=0;
            }

        }
        return arr;
    }

    public static int[] leftRigthDifference(int[] nums) {
        int n = nums.length;
        int[]left = new int[n];
        int[]right = new int[n];
        int lSum = nums[0]; int rSum = nums[n-1];
        for (int i = 1; i < n; i++) {
            left[i] = lSum;
            lSum+=nums[i];
        }
        for (int i = n-2; i >= 0; i--) {
            right[i] = rSum;
            rSum+=nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(left[i]-right[i]);

        }

        return left;
    }

    public static void he(int a, int b){
        boolean isone = false;
        if(b>a+1|| b<(-(a-1))){
            System.out.println(-1);
            isone = true;
        }

        char []plus = new char[a];
        char []minus = new char[a];

        for (int i = 0; i < a; i++) {
            plus[i] = '+';
        }

        for (int i = 0; i < a; i++) {
            minus[i] = '-';
        }
        if(!isone) {
            if (b > 0) {
                int c = a - b;
                for (int i = 0; i < c + 1; i++) {
                    plus[i] = '*';
                }

                for (int i = 0; i < a; i++) {
                    System.out.print(plus[i]);
                }
            } else {
                int c = a + b;
                for (int i = 0; i < c - 1; i++) {
                    minus[i] = '*';
                }
                for (int i = 0; i < a; i++) {
                    System.out.print(minus[i]);
                }
            }
        }
    }

    public static void hello(String a, String b){

        HashSet<Character> set = new HashSet<>();
        HashSet<Character> set1 = new HashSet<>();
        for (int i = 0; i < a.length(); i++) {
            set.add(a.charAt(i));
        }
        for (int i = 0; i < b.length(); i++) {
            set1.add(b.charAt(i));
        }

        boolean isPal = true;
        boolean hove = true;
        if(set.size()>set1.size()){
            for(char c:set1){
                if(!set.contains(c)){
                    isPal =false;
                    System.out.println("NO");
                    break;
                }
            }

            if(!isPal){
                int count = 0;
                String c = a+b;
                HashMap<Character,Integer> m = new HashMap<>();
                for (int i = 0; i < c.length(); i++) {
                    m.put(c.charAt(i),m.getOrDefault(c.charAt(i),0)+1);
                    ArrayList<Integer> list = new ArrayList<>();

                }
                HashSet<Character> s = new HashSet<>();
                for (int i = 0; i < c.length(); i++) {
                    s.add(c.charAt(i));
                }
                for(char c1: s){
                    if(m.get(c1) % 2!=0){
                        count++;
                        if(count>1){
                            System.out.println("NO");
                            hove = false;
                            break;
                        }
                    }
                }
            }
        }
        else{
            for(char c: set){
                if(!set1.contains(c)){
                    isPal =false;
                    System.out.println("NO");
                    break;
                }
            }
            if(!isPal){
                int count = 0;
                String c = a+b;
                HashMap<Character,Integer> m = new HashMap<>();
                for (int i = 0; i < c.length(); i++) {
                    m.put(c.charAt(i),m.getOrDefault(c.charAt(i),0)+1);
                }
                HashSet<Character> s = new HashSet<>();
                for (int i = 0; i < c.length(); i++) {
                    s.add(c.charAt(i));
                }
                for(char c1: s){
                    if(m.get(c1) % 2!=0){
                        count++;
                        if(count>1){
                            System.out.println("NO");
                            hove =false;
                            break;
                        }
                    }
                }
            }
        }

      if(isPal){
          System.out.println("YES");
      }


    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder s = new StringBuilder();
        for(int i:num){
           s.append(i);
        }
        long sum = Long.parseLong(String.valueOf(s))+k;
        String p = Long.toString(sum);
        List<Integer> list = new ArrayList<>(p.length());
        for (int i = 0; i < p.length(); i++) {
            list.add(Integer.parseInt(String.valueOf(p.charAt(i))));
        }
        return list;
    }

    public static long countFairPairs(int[] nums, int lower, int upper) {

        HashMap<Integer,Integer> freq  = new HashMap<>();

        for (int i:nums) {
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<lower){
                int a = lower - nums[i];
                int b = upper - nums[i];

                while(a!=(b+1)){
                    if(freq.containsKey(a)){
                        count+=freq.get(a);
                    }
                    a++;
                }
            }
            else{
                int a = nums[i]-lower;
                if(freq.containsKey(a)){
                    continue;
                }
                if(a<0) continue;
                int b = upper - nums[i];
                if (freq.containsKey(b)){
                    continue;
                }
                if (b<0) continue;
                while (a!=(b+1)){
                    if (freq.containsKey(a)){
                        count+=freq.get(a);
                    }
                    a++;
                }
            }
        }
        return count;
    }

    public static long findTheArrayConcVal(int[] nums) {
        long ans = 0;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(i!=j) {
                String n = Integer.toString(nums[i]);
                String n1 = Integer.toString(nums[j]);
                String s = n + n1;
                ans += Integer.parseInt(s);
            }
            else{
                String n = Integer.toString(nums[i]);
                ans += Integer.parseInt(n);
            }
            i++;
            j--;
        }
        return ans;
    }

    public static int jump(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int count = 0;
        int i=0;
        boolean found = false;
        if (nums.length == 1){
            return 0;
        }

            while(i<nums.length) {
                if (max >= n - i - 1) {
                    count++;
                    found = true;
                    break;
                }

                i = max(nums, i + 1, i + nums[i] + 1);
                max = nums[i];
                count++;
            }

        return count;
    }

    static int max(int[] nums,int start, int end){
        int max = nums[start];
        int index = 0;
        while (start<end){
            if(max<=nums[start]){
                max = nums[start];
                index = start;
            }
            start++;
        }
        return index;
    }

    public static void isPalindrome(String str){

      HashMap<Character,Integer> map = new HashMap<>();
      char[] a = str.toCharArray();

      for (char i:a){
          map.put(i,map.getOrDefault(i,0)+1);
      }

      int min = Integer.MAX_VALUE;
      for (int i=0;i<a.length;i++){
          if((map.get(a[i])<min)){
              if(map.get(a[i])>=2)
              min = map.get(a[i]);
          }
      }
        if (min==Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else{
            System.out.println(a.length-min);
        }


    }

    public static LinkedHashMap sortMap(LinkedHashMap map) {
        List <Map.Entry<Character, Integer>> capitalList = new LinkedList<>(map.entrySet());

        // call the sort() method of Collections
        capitalList.sort(Map.Entry.comparingByValue());

        // create a new map
        LinkedHashMap<Character, Integer> result = new LinkedHashMap();

        // get entry from list to the map
        for (Map.Entry<Character, Integer> entry : capitalList) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }

    public static int totalFruit(int[] fruits) {
        Map<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i:fruits){
            set.add(i);
        }

        for(int i: fruits){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] arr = new int[set.size()];
        int j=0;
        for(int i:set){
            arr[j++] = map.get(i);
        }
        return arr[arr.length-1]+arr[arr.length-2];
    }

    public static List<Integer> findAnagrams(String s, String p) {
        int[] s1 = new int[26];//s string
        int[] s2 = new int[26];//p string
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<p.length();i++){
            s1[s.charAt(i)-'a']++;
            s2[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(s1,s2)) list.add(0);

        for(int i=p.length();i<s.length();i++){
            s1[s.charAt(i-p.length()) - 'a']--;
            s1[s.charAt(i)-'a']++;
            if(Arrays.equals(s1,s2)) list.add(i);
        }

        return list;

    }

//    public static List<Integer> findAnagrams(String s, String p) {
//        Map<Character,Integer> map = new LinkedHashMap<>();
//        Map<Character,Integer> map2 = new LinkedHashMap<>();
//        List<Integer> list = new ArrayList<>();
//        for(int i=0;i<p.length();i++){
//            map.put(s.charAt(i),1);
//            map2.put(p.charAt(i),1);
//        }
//        if(map.equals(map2)){
//            list.add(0);
//        }
//
//            for(int i=p.length();i<s.length();i++){
//
//                    map.remove(s.charAt(i-p.length()));
//                    map.put(s.charAt(i),1);
//
//
//                if(map.equals(map2)) list.add(i);
//            }
//
//        return list;
//
//    }


    public static int minCapability(int[] nums, int k) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - k; i++) {
            if (nums[i]<ans){
                int min = nums[i+2];
                for (int j = i+2; j <nums.length ; j++) {
                    if (nums[j]<min){
                        min = nums[j];
                    }
                }
                if(min<nums[i]){
                    min=nums[i];
                }
                if (min<ans)
                ans = min;
            }
        }
        return ans;
    }

    public static int[] vowelStrings(String[] words, int[][] queries) {

        int[] arr = new int[words.length];
        for(int i=0;i< words.length;i++){
            if (isVowels(words[i].charAt(0)) && isVowels(words[i].charAt(words[i].length()-1))){
                arr[i]++;
            }
        }
        System.out.println(Arrays.toString(arr));
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int count = 0;
            for (int j = a; j <=b ; j++) {
                count+=arr[j];
            }
            ans[i] = count;
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
    public static boolean isVowels(char s){
        if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'){
            return true;
        }
        return false;
    }

    public static long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int i:gifts){
            pQueue.add(i);
        }

        while (k-->0){
            long a = pQueue.remove();
            double b = Math.sqrt(a);
            int c = (int) Math.floor(b);
            pQueue.add(c);
        }
        int sum=0;
        while (!pQueue.isEmpty()){
            sum+=pQueue.poll();
        }
        System.out.println(sum);
        return sum;
    }

    public static boolean checkInclusion(String s1, String s2) {

        int total = 0;
        for(int i=0;i<s1.length();i++){
            total+=s1.charAt(i);
        }


        for(int i=0;i<=s2.length()- s1.length();i++){
            int t1 = 0;
            for(int j=i;j<i+s1.length();j++){
                t1= t1 + s2.charAt(j);

            }
            if(total == t1){
                return true;
            }
        }
        return false;
    }

    public static  int maxCount(int[] banned, int n, int maxSum) {

        Arrays.sort(banned);
        int count = 0;
        for (int i = 0; i < banned.length; i++) {
            if (banned[i]<=n){
                count++;
            }
        }
       // System.out.println(Arrays.toString(banned));
//        System.out.println(banned.length);
//        int[] arr = new int[n-count];

        ArrayList<Integer> list = new ArrayList<>();
       // System.out.println(arr.length);
        //int j=0;
        for (int i = 1; i <= n; i++) {
            if (!bs(banned,i))
            {
                list.add(i);
            }
        }
        //System.out.println(list.size());
        int c2 = 0;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
            if (sum<=maxSum){
                c2++;
            }
        }
        //System.out.println(Arrays.toString(arr));
        System.out.println(c2);
        return c2;
    }

   static boolean bs(int []arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid] == target){
                return true;
            }
            else if(arr[mid] > target){
                end = end - 1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }

    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            while (nums[i]>0) {
                list.add(nums[i] % 10);
                nums[i] /= 10;
            }
            for (int j = list.size()-1; j >= 0; j--) {
                l1.add(list.get(j));
            }
            list.clear();
        }
        int [] arr = new int[l1.size()];
        for (int i = 0; i < l1.size(); i++) {
            arr[i] = l1.get(i);
        }
        return arr;
    }



    public static String gcdOfStrings(String str1, String str2) {

        Map<Character,String> map = new HashMap<>();
        String str = " ";
        if(str1.charAt(0) == str2.charAt(0)){
            for (int i = 0; i < Math.max(str1.length(),str2.length()); i++) {
                if(map.containsKey(str1.charAt(i))){
                    break;
                }
                else{
                    map.put(str1.charAt(i),"0");
                    str= str + str1.charAt(i);
                }
            }
        }
        return str;
    }

    public static int bestTeamScore(int[] scores, int[] ages) {

        int n = ages.length;
        int[][] ageScorePair = new int[n][2];

        for (int i = 0; i < n; i++) {
            ageScorePair[i][0] = ages[i];
            ageScorePair[i][1] = scores[i];
        }
        // Sort in ascending order of age and then by score.
        Arrays.sort(ageScorePair, (a,b) -> a[0] == b[0] ? a[1]-b[1] : a[0]-b[0]);
        Stack<Integer> ageStack = new Stack<>();
        Stack<Integer> scoreStack = new Stack<>();
        Stack<Integer> discardPlayer = new Stack<>();
        ageStack.push(ageScorePair[0][0]);
        scoreStack.push(ageScorePair[0][1]);
        for (int i = 1; i < n; i++) {
            if (ageScorePair[i][0] > ageStack.peek()){
                if (ageScorePair[i][1]>=scoreStack.peek()){
                    ageStack.push(ageScorePair[i][0]);
                    scoreStack.push(ageScorePair[i][1]);
                }
                else{
                    discardPlayer.push(ageScorePair[i][1]);
                }

            }
            else{
                ageStack.push(ageScorePair[i][0]);
                scoreStack.push(ageScorePair[i][1]);
            }
        }
//        System.out.println(scoreStack);
//        System.out.println(discardPlayer);
        int legitPlayerSum = 0;
        while (!scoreStack.isEmpty()){
            legitPlayerSum+=scoreStack.pop();
        }
        int discardPlayerSum = 0;
        while (!discardPlayer.isEmpty()){
            discardPlayerSum+=discardPlayer.pop();
        }
//        System.out.println(legitPlayerSum + " "+ discardPlayerSum);
        return Math.max(legitPlayerSum,discardPlayerSum);
    }



    public static int findJudge(int n, int[][] trust) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <trust.length; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] t: trust){
            adj.get(t[0]).add(t[1]);
        }
        System.out.println(adj);
        return -1;
    }

    public static int maximumProduct(int[] nums){
        Arrays.sort(nums);

        int max =1;
        int count = 3;
        int j = 0;
        int n = nums.length;
        while (count>0){
            if (nums[j] < 0){
                if(nums[j]*-1 > nums[n-1]){
                    max*=nums[j];
                }
                else{
                    max*=nums[n-1];
                    n--;
                }
            }
            else{
                max*=nums[n-1];
                n--;
            }
            j++;
            count--;
        }
        return max;
    }

    public static int[][] sortTheStudents(int[][] score, int k) {

        for (int i = 0; i < score.length; i++) {
            for (int j = i+1; j < score.length; j++) {
                if (score[i][k]<=score[j][k]){
                    //swap
                    swap(i,score,j);
                }
            }
        }
        return score;
    }

    static void swap(int i,int[][] arr,int p){
        for (int j = 0; j < arr[i].length ; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[p][j];
                arr[p][j] = temp;
        }
    }

    public static int alternateDigitSum(int n) {
        String p = Integer.toString(n);
        int k = p.length();
        int sum = 0;
        while (k>0) {
            if (k % 2 == 0) {
                int a = n % 10;
                a = a * (-1);
                sum += a;
                n = n / 10;
            } else {
                int a = n % 10;
                sum += a;
                n = n / 10;
            }
            k--;
        }
        return sum;


    }

    public static int maxSubarraySumCircular(int[] nums) {
        int min_sum = nums[0];
        int min_sum_till_now = nums[0];
        int total_sum = 0;
        for(int i=1;i<nums.length;i++){
            min_sum_till_now+=nums[i];
            min_sum = Math.min(min_sum,min_sum_till_now);

        }

        for (int i = 0; i < nums.length; i++) {
            total_sum+=nums[i];
        }

        int circular_sum = total_sum - min_sum;

        return Math.max(circular_sum,min_sum);
    }

    public static int minFlipsMonoIncr(String s) {

        int zero = 0;
        int oneToZero = 0;


        for(char c : s.toCharArray()){
            if(c == '0'){
                zero++;
            }
            else{
                oneToZero++;
            }

            zero = Math.min(zero,oneToZero);

        }
        return zero;
    }

    public static void listOfArray(int[][] array){
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        System.out.println(list);
    }

    public static long countGood(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
return -1;
    }
    public static int[][] rangeAddQueries(int n, int[][] queries) {

        int [][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }

       int row = 0;
       while(row<queries.length){

           int r1 = queries[row][0];
           int r2 = queries[row][2];
           int c1 = queries[row][1];
           int c2 = queries[row][3];

           for (int i = r1; i <= r2 ; i++) {
               for (int j = c1; j <=c2; j++) {
                   matrix[i][j] += 1;
               }

           }
           row++;
       }
        System.out.println(Arrays.deepToString(matrix));


        return matrix;
    }

    public static int differenceOfSum(int[] nums) {

        int sum = 0,digit_sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];

        }

        int j=0;
        while ( j< nums.length){
            if(nums[j] > 0){
                digit_sum += nums[j]%10;
                nums[j] = nums[j]/10;
            }
            else{
                j++;
            }
        }
        System.out.println(sum+" "+digit_sum);
        return Math.abs(sum - digit_sum);
    }
    
    

    public static String smallestEquivalentString(String s1, String s2, String baseStr) {

        int n = s1.length();
        int m = baseStr.length();

        Map<Character,List<Character>> adj = new HashMap<Character,List<Character>>();

        for(int i=0;i<n;i++){
            char u = s1.charAt(i);
            char v = s2.charAt(i);
            if(!adj.containsKey(u) ){
                adj.put(u,new ArrayList<>());

            }
            if(!adj.containsKey(v)){
                adj.put(v,new ArrayList<>());
            }

            if(!adj.get(u).contains(v)){
                adj.get(u).add(v);
            }
            if(!adj.get(v).contains(u)){
                adj.get(v).add(u);
            }
        }

        String result= " ";

        for (int i = 0; i < m; i++) {
            char curr = baseStr.charAt(i);
            int[] visited = new int[26];
            char minChar = DfsForMinChar(curr,visited,adj);

            result+=minChar;
        }
        System.out.println(adj);
        return result;

    }

    private static char DfsForMinChar(char curr, int[] visited, Map<Character, List<Character>> adj) {

        visited[curr - 'a'] = 1; //mark it as visited;
        char minChar = curr;
        for(char child: adj.get(curr)){

            if(visited[child - 'a'] == 0){
                char now = DfsForMinChar(child,visited,adj);
                if(now < minChar){
                    minChar = now;
                }
            }
        }
        return minChar;
    }

    public static void adjacencyList(int ver,int[][] edges){

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < ver; i++) {
            adj.add(new ArrayList<>());
        }
        // populate the adjacency list
        for(int [] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);

        }
        System.out.println(adj);
    }

    public static long maxKelements(int[] nums, int k) {

        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int num: nums){
            heap.add(num);
        }
        long sum = 0;
        while(k-->0){
            int a = heap.remove();
            sum+=a;
            heap.add((int)Math.ceil(a/(double)3));
        }
        return sum;
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int i=0;
        int k = i;
        int j=0;
        int count = 0;
        int p = 0;
        while (j<gas.length && p < gas.length){
            if(gas[i] - cost[i] + gas[(i+1)% gas.length] >= gas[(i+1)%gas.length]){
                j++;
                i=(i+1)%gas.length;
                count++;
            }
            else{
                i = (k+1)%gas.length;
                //i=(i+1)%gas.length;
                j=0;
                p++;
            }
        }
        if (count == gas.length - 1){
            return i;
        }


        return -1;
    }

    public static int minimumRounds(int[] tasks) {

        Map<Integer,Integer> map = new LinkedHashMap<>();

        for(int t:tasks){
            map.put(t,map.getOrDefault(t,0)+1);
        }


        int sum = 0;

        Arrays.sort(tasks);
        HashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < tasks.length; i++) {
            set.add(tasks[i]);

        }
        Object[] arr = set.toArray();

//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < tasks.length-1; i++) {
//            if(tasks[i] != tasks[i+1]){
//                 list.add(tasks[i]);
//            }
//        }
//        list.add(tasks[tasks.length-1]);
//
//        int []arr = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            arr[i] = list.get(i);
//        }

        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i]) < 2){
                return -1;
            }
            else {
                if (map.get(arr[i]) % 3 == 0) {
                    sum += map.get(arr[i]) / 3;
                }
                else{
                    sum+=(map.get(arr[i]) / 3) + 1;
                }
            }
        }
        return sum;
    }

    public static int minDeletionSize(String[] strs) {
        int count = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            StringBuilder a = new StringBuilder(" ");
            for (int j = 0; j < strs.length; j++) {
                 a.append(strs[j].charAt(i));
            }
            char []temp = a.toString().toCharArray();
            Arrays.sort(temp);
            char[] aa = a.toString().toCharArray();
            if (Arrays.equals(temp, aa)){
                //System.out.println(Arrays.toString(temp) +" "+ Arrays.toString(aa));
                count = count;
            }
            else{
                count++;
            }



        }


        return count;
    }

    public static boolean isCapital(String str){
        String a = str.toUpperCase();
        String b = str.toLowerCase();
        char[] arr = str.toCharArray();

        if(str.equals(a) || str.equals(b)){
            return true;
        }
        else{
            for(int i=1;i<str.length();i++){
                if( str.charAt(i) >= 65 && str.charAt(i)<= 90){
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] dailyTempe(int[] temp){
        Stack<Integer> stack = new Stack<>();
        int [] ans = new int[temp.length];
        int counter = 0;

        for(int i=0;i<temp.length;i++){
            while (!stack.isEmpty() && stack.peek() < temp[i]){
                ans[i] = counter;
                stack.pop();
                counter = 0;
            }
            counter++;
            stack.push(temp[i]);

        }
        return ans;
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack();
        Map<Integer,Integer> map = new LinkedHashMap<>();
        int []answer = new int[temperatures.length];
        int a = 0;
        for(int temp:temperatures){
            while(!stack.isEmpty() && stack.peek()<temp){
                map.put(stack.pop(),a);
                a=0;
            }
            System.out.println(map);

            stack.push(temp);
            a++;
        }
        System.out.println(map);

        for(int i=0;i<temperatures.length;i++){
            answer[i] = map.getOrDefault(temperatures[i],0);
        }
        return answer;
    }

//    public static boolean isIsomorphic(String s, String t) {
//        s = s.toLowerCase();
//        t = t.toLowerCase();
//        char[] arr = s.toCharArray();
//        char[] arr1 = t.toCharArray();
//        HashMap<Character,Integer> map1 = new LinkedHashMap<>();
//        HashMap<Character,Integer> map2 = new LinkedHashMap<>();
//        for(char ch: arr){
//            map1.put(ch,map1.getOrDefault(ch,0)+1);
//        }
//        for(char ch: arr1){
//            map2.put(ch,map2.getOrDefault(ch,0)+1);
//        }
//        String p = "";
//        String k = "";
//        for(int i=0;i<map1.size();i++){
//            p = p +  map1.values();
//        }
//        for(int i=0;i<map2.size();i++){
//            k = k +  map2.values();
//        }
//        if(p.equals(k)){
//            return  true;
//        }
//
//        return false;
//    }

//    public static int postfix(String[] post){
//        if(post == null || post.length == 0){
//            return 0;
//        }
//
//        Stack<Integer> stack = new Stack<>();
//
//        for (int i = 0; i < post.length; i++) {
//            if (post[i].charAt(0) != '*' && post[i].charAt(0) != '/' && post[i].charAt(0) != '+' && post[i].charAt(0) != '-'){
//                stack.push(Integer.parseInt(String.valueOf(post[i].charAt(0))));
//            }
//            else{
//                int a = stack.pop();
//                int b = stack.pop();
//                int ans = 0;
//                if(post[i].charAt(0) == '*' ){
//                    ans = a*b;
//                }
//                else if(post[i].charAt(0) == '/' ){
//                    ans = a/b;
//                }
//                else if(post[i].charAt(0) == '+' ){
//                    ans = a+b;
//                }
//                else{
//                    ans = a-b;
//                }
//                stack.push(ans);
//            }
//        }
//
//        return stack.peek();
//    }




    public static int postfix(String[] post){
        if(post == null || post.length == 0){
            return 0;
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < post.length; i++) {
            if(post[i].length() == 1){
            if (post[i].charAt(0) != '*' && post[i].charAt(0) != '/' && post[i].charAt(0) != '+' && post[i].charAt(0) != '-'){
                stack.push(Integer.parseInt(String.valueOf(post[i])));
            }
            else{
                int a = stack.pop();
                int b = stack.pop();
                int ans = 0;
                if(post[i].charAt(0) == '*' ){
                    ans = a*b;
                }
                else if(post[i].charAt(0) == '/' ){
                    ans = b/a;
                }
                else if(post[i].charAt(0) == '+' ){
                    ans = a+b;
                }
                else{
                    ans = b-a;
                }
                stack.push(ans);
            }}
            else{
                stack.push(Integer.parseInt(String.valueOf(post[i])));
            }
        }


        return stack.peek();
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        Integer a = 0;
        Integer b= 0;
        for(Integer i = 0; i <s.length(); i ++) {
            a= map1.put(s.charAt(i),i);
            b =map2.put(s.charAt(i),i);

            if(map1.put(s.charAt(i), i) != map2.put(t.charAt(i), i)) {
                return false;
            }
        }
        System.out.println(map1);
        System.out.println(map2);
        return true;
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0) {
                System.out.println(strs[i].indexOf(pre));
                pre = pre.substring(0, pre.length() - 1);
            }
            i++;
        }
        return pre;
    }

//    public static String longestCommonPrefix(String[] strs) {
//        String ans = strs[0];
//        String b = "";
//        for(int i=0;i<strs.length;i++){
//            for(int j=0;j<Math.max(strs[i].length(),b.length());j++){
//                //System.out.println(j);
//                if(ans.charAt(j) == strs[i].charAt(j)){
//                    b=ans;
//                    ans = "";
//                    ans = ans + strs[i].charAt(j);
//                }
//            }
//        }
//        return b;
//        return b;
//        return b;
//    }

    public static void search(String str, String pattern)
    {
        int n = str.length();
        int m = pattern.length();

        for (int s = 0; s <= n - m; s++) {
            int j;
            for (j = 0; j < m; j++)
                if (str.charAt(s + j) != pattern.charAt(j))
                    break;
            if (j == m)
                System.out.println("Pattern occurs at index " + s);
        }
    }




    static double fractionalKnapsack(int W, Item arr[], int n)
        {
            double result = 0;
            int curWeight = W;
            Arrays.sort(arr, (i1, i2) -> i2.value * i1.weight - i1.value * i2.weight);
            for (int i = 0; i < n; i++) {
                if (arr[i].weight <= curWeight) {
                    result += arr[i].value;
                    curWeight -= arr[i].weight;
                }
                else {
                    result += (curWeight * arr[i].value) / (double)arr[i].weight;
                    break;
                }
            }
            return result;
        }

    static void pr(String c, String b){


        String d = "";
        for(int i=0;i<b.length();i++){
            for (int j = 0; j < c.length(); j++) {
                if(b.charAt(i) == c.charAt(j)){
                    d = d + b.charAt(i);
                    break;
                }
            }
        }
        if(c.contentEquals(d)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }


    private static final DecimalFormat df = new DecimalFormat("0.0");
    static void print(double b){


        BigDecimal bd = new BigDecimal(b).setScale(1, RoundingMode.HALF_UP);
        double newInput = bd.doubleValue() * 10;
        System.out.println(newInput);
        int c = 10;
        int ans;
        int ans1;

        if(newInput % c == 0) {
            ans = (int)newInput/c;
            ans1 = 1;
        }
        else if(c % newInput == 0){
            ans = 1;
            ans1 = (int)(c/newInput);
        }
        else{
        while (newInput %2 == 0 && c%2==0)
        {
            newInput = newInput/2;
            c = c/2;
        }
        ans = (int)newInput;
        ans1 = c;
        }
        System.out.println(ans+" "+ans1);
    }

    public static String kthLargestNumber(String[] nums, int k) {
       Arrays.sort(nums);
        return nums[nums.length-k];
    }

    public static int[] nextGreaterElements(int[] nums) {

        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums.length];
        stack.push(nums[0]);
        for(int i=1;i<nums.length;i++){

            if(stack.peek()>nums[i]&&!stack.isEmpty()){
                while(!stack.isEmpty() && stack.peek()>nums[i]){
                    stack.pop();
                }
                ans[i] = stack.peek();
            }
            else if(stack.peek()<nums[i] && !stack.isEmpty()){
                ans[i] = stack.peek();
            }
            else{
                ans[i] = -1;
            }

            stack.push(nums[i]);

        }
        return ans;

    }

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        int[] next = new int[n];
        int[] prev = new int[n];

        next = nextSmallerElement(heights,n);
        prev = prevSmallerElement(heights,n);

        int area = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int l = heights[i];

            if (next[i] == -1){
                next[i] = n;
            }
            int b = next[i] - prev[i] - 1;
            int newArea = l*b;
            area = Math.max(area,newArea);

        }
        return area;
    }

    private int[] nextSmallerElement(int[] arr, int n) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int[]ans = new int[n];
        //from behind we start to check smaller element
        for (int i = n-1; i >=0 ; i--){

            int curr = arr[i];
            while (stack.peek()!=-1&&arr[stack.peek()] >= curr)
            {
                stack.pop();
            }
            ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }

    private int[] prevSmallerElement(int[] arr, int n) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int[]ans = new int[n];
        //from behind we start to check smaller element
        for (int i = 0; i <n ; i++) {

            int curr = arr[i];
            while (stack.peek()!=-1&&arr[stack.peek()] >= curr)
            {
                stack.pop();
            }
            ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }

    public static void reverseString(char[] s) {

        int p1 = 0;
        int p2 = s.length-1;

        while(p1<=p2){
            char ch = s[p1];
            s[p1] = s[p2];
            s[p2] = ch;
            p1++;
            p2--;

        }

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }

    public static void reverseString2(String s){
        s = s.strip();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            stack.push(ch);
        }
        System.out.println(stack);
        stack.peek();
        System.out.println(stack.peek());

        int c=0;
       while (!stack.peek().toString().isBlank()){
           c++;
           stack.pop();
       }

        System.out.println(c);
    }

    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);

        int p1=0;
        int p2 = s.length()-1;

        while (p1<=p2){
            if(s.charAt(p1) == s.charAt(p2)){
                p1++;
                p2--;

            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void rotate(int[] nums, int k) {

        Queue<Integer> q = new LinkedList<>();
        for (int i = k+1; i <nums.length ; i++) {
            q.add(nums[i]);
            nums[i] =0;
        }

        int p1=-1;
        int p2= nums.length-1;

        for (int i = 0; nums[i]!=0; i++) {
            p1++;
        }
        while (p1!=-1)
        swap(nums,nums[p1--],nums[p2--]);

        for (int i = 0; i < p2; i++) {
            nums[i] = q.peek();
            q.remove();
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }

    private static void swap(int[] nums,int num, int num1) {
        int temp = nums[num];
        nums[num] = nums[num1];
        nums[num1] = temp;
    }

    public static int st(String s){
        s = s.toLowerCase(Locale.ROOT);
        char[] arr = s.toCharArray();
        HashMap<Character,Integer> map1 = new LinkedHashMap<>();
        for(char ch: arr){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }

        int i=0;
        for (char ch: arr){
            if (map1.get(ch)==1){
                return i;
            }
            else{
                i++;
            }
        }
        return -1;
    }
    
    public static void num(int[]arr, int[]nums){
ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            boolean isCheck = false;
//            for (int j = 0; j < nums.length; j++) {
//                if(arr[i]!=nums[j]){
//                    isCheck = true;
//                }
//                else {
//                    isCheck=false;
//                    break;
//                }
//            }
//            if (isCheck){
//                list.add(arr[i]);
//            }
//            System.out.println(list);
//        }

//        for (int i = 0; i < arr.length; i++) {
//            list.add(arr[i]);
//        }
//
//        int p1=0;
//        int p2=0;
//        while (p2!=nums.length){
//           if(list.get(p1)==nums[p2]){
//               list.remove(p1);
//               System.out.println(list);
//               p1=0;
//               p2++;
//           }
//           else{
//               p1++;
//           }
//        }
//        System.out.println(list);

        HashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int i = 0,j=0; i < set.size()||j<nums.length; i++) {
            if (set.contains(nums[0])){
                set.remove(nums[0]);
            }

        }
        Object[] a = set.toArray();
        int[]b = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) a[i];
        }
        System.out.println(set);

    }

   static int bs(int target, int[]arr){
        int s = 0;
        int e = arr.length-1;

        while(s<=e){
            int mid = s+(e-s)/2;
            if (arr[mid] == target){
                return mid;
            }
            else if(target>arr[mid]){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return -1;
    }

    public static void hel(int a,int b){
        int sum = (b*(b+1))/2;
        if(b>=sum){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static int[] topKFrequent(int[] nums, int k) {
        if(nums.length==1){
            return nums;
        }

        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int num:nums){
            hash.put(num,hash.getOrDefault(num,0)+1);
        }
        int j=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int num:nums){
            while(j!=k+1){
                if(hash.get(num)>1){
                    list.add(num);
                    j++;
                }}
        }
        int p = 0;
        if(list.size()==0){
            for(int num:nums){
                while(p!=j+1){
                    list.add(num);
                    p++;}
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<list.size();i++){
            set.add(list.get(i));
        }
        Object[] a = set.toArray();
        int[]b = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) a[i];
        }
        return b;
    }

    public static boolean isLongPressedName(String name, String typed) {
        int i = 0, m = name.length(), n = typed.length();
        for (int j = 0; j < n; j++)
            if (i < m && name.charAt(i) == typed.charAt(j))
                i++;
            else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1))
                return false;
        return i == m;



    }



    public static int longestCommonSubsequence(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i < s1.length(); ++i){
            for (int j = 0; j < s2.length(); ++j){
                if (s1.charAt(i) == s2.charAt(j)) dp[i + 1][j + 1] = 1 + dp[i][j];
                else dp[i + 1][j + 1] =  Math.max(dp[i][j + 1], dp[i + 1][j]);
            }
        }
        return dp[s1.length()][s2.length()];
    }



    }
