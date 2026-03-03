package arrays;
import java.util.*;
public class SubArraySumK {
    static int subSumK(int[] arr,int target){
        int[] prefixsum=new int[arr.length];
        for(int i=1; i<=arr.length-1;i++){
            prefixsum[i]=arr[i-1]+arr[i];
        }int count=0;
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int j=0;j<prefixsum.length;j++){
            if(target==prefixsum[j])count++;
            int val=prefixsum[j]-target;
            if(ans.containsKey(val)){

                count=ans.get(val)+1;
            }ans.put(prefixsum[j],ans.getOrDefault(prefixsum[j],0)+1);
        }return count;
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] temp=s.split(" ");
        int[] arr=new int[temp.length];
        for(int i=0; i<arr.length; i++){
            arr[i]=Integer.parseInt(temp[i]);
        }
        System.out.println(subSumK(arr,6));

    }
}
