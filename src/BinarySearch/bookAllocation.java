package BinarySearch;
import java.util.*;
public class bookAllocation {

    //Given an array nums of n integers, where nums[i] represents the number of pages in the i-th book,
// and an integer m representing the number of students, allocate all the books to the students so that each student gets at least one book,
// each book is allocated to only one student, and the allocation is contiguous.
//
//
//
//Allocate the books to m students in such a way that the maximum number of pages assigned to a student is minimized.
// If the allocation of books is not possible, return -1.
//
//
//Example 1
//
//Input: nums = [12, 34, 67, 90], m=2
//
//Output: 113
//
//Explanation: The allocation of books will be 12, 34, 67 | 90.
// One student will get the first 3 books and the other will get the last one.
    static int minPage(int[] arr,int num){
        if(arr.length<num)return -1;
        int left=maxPage(arr),right=sumOfPage(arr),ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(check(arr,num,mid)<=num) {
                ans = mid;
                right = mid-1;
            }else{
                left=mid+1;
            }
        }return ans;
    }
    static int check(int[] arr,int num,int mid){
        int pageCount=0,studcount=1;
        for(int val:arr){
            if(pageCount+val>mid){
                studcount++;
                pageCount=val;
            }else{
                pageCount+=val;
            }
        }return studcount;
    }
    static int maxPage(int[] arr){
        int no=0;
        for(int val:arr){
            no=Math.max(no,val);
        }return no;
    }
    static int sumOfPage(int[] arr){
        int sum=0;
        for(int val:arr){
            sum+=val;
        }return sum;
    }

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int size=sc.nextInt();
            int num=sc.nextInt();
            int[] arr=new int[size];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(minPage(arr,num));


        }

}
