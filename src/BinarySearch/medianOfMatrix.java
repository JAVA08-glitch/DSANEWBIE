package BinarySearch;
import java.util.*;
//1,4,9
//2,5,6
//3,7,8

public class medianOfMatrix {
    static int findMedian(int[][] mat){
        int row=mat.length,col=mat[0].length;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<row;i++){
            low=Math.min(mat[i][0],low);
            high=Math.max(mat[i][col-1],high);//O(row)
        }
        int target=(low*high+1)/2;
        while(low<high){
            int mid=low+(high-low)/2;
            if(check(mat,mid,target)){//log(max-min)
                high=mid;
            }else{
                low=mid+1;
            }

        }return high;

    }
    static boolean check(int[][] mat,int num,int k){//O(mlogn)
        int count=0;
        for(int i=0;i<mat.length;i++){
            int low=0,high=mat[i].length-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(mat[i][mid]<=num){

                    low=mid+1;
                }else{
                    high=mid-1;
                }


            }count+=low;
        }return count>=k;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[][] mat=new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println(findMedian(mat));
    }
}
