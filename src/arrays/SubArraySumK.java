package arrays;
import java.util.*;
public class SubArraySumK {
    static int subSumK(int[] arr,int target){
        HashMap<Integer,Integer> hs=new HashMap<>();
        hs.put(0,0);
        int sum=0,count=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(hs.containsKey(sum-target)){
                count=Math.max(count,(i-hs.get(sum-target)+1));
            }hs.put(sum,i+1);
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
