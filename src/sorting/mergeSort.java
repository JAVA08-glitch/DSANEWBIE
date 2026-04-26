package sorting;
import java.util.*;
public class mergeSort {
    static int[] sort(int[] num,int l,int r){
      if(l<r){
          int mid=l+(r-l)/2;
          sort(num,l,mid);
          sort(num,mid+1,r);
          merge(num,l,mid,mid+1,r);

      }return num;
    }
    static void merge(int[] num,int l,int mid,int mid2, int r){
        int[] num1=new int[mid-l+1];
        int[] num2=new int[r-mid2+1];
        int k=0;
        for(int i=l;i<=mid;i++){
            num1[k++]=num[i];
        }int t=0;
        for(int i=mid2;i<=r;i++){
            num2[t++]=num[i];
        }int i=0,j=0;int mI=l;
        while(i<num1.length&&j<num2.length){
            if(num1[i]<num2[j]){
                num[mI++]=num1[i++];
            }else if(num1[i]>num2[j]){
                num[mI++]=num2[j++];
            }else{
                num[mI++]=num1[i++];
            }
        }while(i<num1.length){
            num[mI++]=num1[i++];
        }while(j<num2.length){
            num[mI++]=num2[j++];
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }for(int val:sort(arr,0,size-1)) {
            System.out.println(val);
        }
    }
}
