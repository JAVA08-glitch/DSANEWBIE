package arrays;
import java.util.*;


public class ClosestElement {
    static int close(int[] arr){
        int start=0,end=arr.length-2,target=arr[arr.length-1];
        int[] ans=new int[arr.length-1];
        for(int i=0; i<ans.length;i++){
            ans[i]=arr[i];
        }
        Arrays.sort(ans);
        while(start<=end){
            int mid=start+(end-start)/2;
            if(ans[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }return ans[start];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] temp=s.split(" ");
        int[] arr=new int[temp.length];
        for(int i=0; i<arr.length; i++){
            arr[i]=Integer.parseInt(temp[i]);
        }
        System.out.println(close(arr));
    }
}
