package ch2_recursion.ArrayQuestions;

import java.util.ArrayList;

public class LinearSearchInArray {
    public static void main(String[] args) {
        int []arr = {2,3,1,4,6,4,2,3,4,2,4,4,};
        System.out.println(find(arr,3,0));
        System.out.println(findIndex(arr,3,0));
        findAllIndex(arr,4,0);
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1 = findAllIndexArrayList(arr,4,0,list1);
        System.out.println(list1);

        System.out.println(findAllIndexArrayList2(arr,4,0));

    }

    static boolean find(int []arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);
    }

    static int findIndex(int []arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
        return findIndex(arr,target,index+1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int []arr, int target, int index){

        if(index == arr.length){
            return ;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);

    }

    static ArrayList<Integer> findAllIndexArrayList(int []arr, int target, int index, ArrayList<Integer> list1){

        if(index == arr.length){
            return list1;
        }
        if(arr[index] == target){
            list1.add(index);
        }
        return findAllIndexArrayList(arr,target,index+1,list1);

    }

    static ArrayList<Integer> findAllIndexArrayList2(int []arr, int target, int index){

        ArrayList<Integer> list2 = new ArrayList<>();
        if(index == arr.length){
            return list2;
        }

        //this will contain answer for that function call only
        if(arr[index] == target){
            list2.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndexArrayList2(arr,target,index+1);
        list2.addAll(ansFromBelowCalls);
        return list2;

    }
}
