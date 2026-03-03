package recursion;

public class sumofelementsarray {
    static int findsum(int[] arr,int idx, int sum){
        if(idx==arr.length-1){
            return sum+arr[arr.length-1];
        }else{
            sum+=arr[idx];
            return findsum(arr,idx+1,sum);
        }

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.print(findsum(arr,0,0));
    }
}
