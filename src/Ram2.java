
import java.util.*;
class Ram2 {


    public static void main(String args[]){
        int [] arr={0,1,2,4,2,1};
        int target=3;
        int ans=search(target,arr);
        System.out.println(ans  );;
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
        if(firsttry!=-1){//aa na kariye tompan chale jo minimum index j gotvi hoy {0,1,2,4,2,1}; aama target =2 hoy and
            // mimimum puhyu hoy to j te 0,peak pela search karo jethi direct je minimum index par 2 hoy te return thay
//            baki jo khali em kidhu hoy k find  to game te search part array no lai  sakiye 0,peak or peak+1,arr.lenght-1
//            and search kari sakiye ahi minimumn index mate aapde kariye etle condition 6 k jo target elemnet no duplicate pan hoy
//            pan aapde evoj target element nu saerch karvanu 6 j minimim index par hoy
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
    }}
//    static  int bs(int target,int [] mountainArr,int start,int end){
//
//        while(start<=end){
//            int mid=(start)+(end-start)/2;
//            if(target==mountainArr[mid]){
//                return mid;
//            }
//            if(mountainArr[0]>mountainArr[mountainArr.length-1]){
//                if(target>mountainArr[mid]){
//                    end=mid-1;
//                } else if (target < mountainArr[mid]) {
//                    start=mid+1;
//
//                }}
//            else{
//                if(target>mountainArr[mid]) {
//                    start = mid + 1;
//                }
//                else if(target<mountainArr[0]){
//                    end=mid-1;
//                }
//            }
//        } return -1;
//    }}