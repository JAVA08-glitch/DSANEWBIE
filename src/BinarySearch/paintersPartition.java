package BinarySearch;
import java.util.*;


public class paintersPartition {
    static int minTime(int[] arr,int num,int time){
       int left=maxlengthBoardTime(arr,time),right=Tottime(arr,time);
       while(left<right){
           int mid=left+(right-left)/2;
           if(check(arr,mid,num,time)){
               right=mid;
           }else{
               left=mid+1;
           }
       }return left;

    }
    static boolean check(int[] arr,int mid,int num,int time){
        int sumoftime=0,count=1;
        for(int val:arr){
            if(sumoftime+(val*time)>mid){
                count++;
                sumoftime=val*time;
            }else{
                sumoftime+=val*time;
            }
        }return count<=num;
    }
    static int maxlengthBoardTime(int[] arr,int time){
        int max=0;
        for(int val:arr){
            max=Math.max(max,val);

        }return max*time;
    }
    static int Tottime(int[] arr,int time){
        int sum=0;
        for(int val:arr){
            sum+=val*time;

        }return sum;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int time=sc.nextInt();
        String s=sc.nextLine();
        String[] temp=s.split(" ");
        int[] arr=new int[temp.length];
        for(int i=0;i<temp.length;i++){
            arr[i]=Integer.parseInt(temp[i]);
        }
        System.out.println(minTime(arr,num,time));
    }
}
