package sorting;
import java.util.*;
public class quickSort {
    static void quicksort(int[] arr,int start, int end){
        if(start<end){
            int pivot=arrange(arr,start,end);
            quicksort(arr,start,pivot-1);
            quicksort(arr,pivot+1,end);
        }

    }
    static int arrange(int[] arr,int start,int end){
     int pivot=start+(end-start)/2;//move pivot to end
        int swap=arr[end];
        arr[end]=arr[pivot];
        arr[pivot]=swap;
     int l=start-1;
     for(int i=start;i<=end;i++){
         if(arr[i]<arr[pivot]){
             l++;
             int swapi=arr[i];
             arr[i]=arr[l];
             arr[l]=swapi;
         }
     }if((l+1)!=pivot){
          int swapii=arr[pivot];
          arr[pivot]=arr[l+1];
          arr[l+1]=swapii;
        }return l+1;







    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

    }
}
