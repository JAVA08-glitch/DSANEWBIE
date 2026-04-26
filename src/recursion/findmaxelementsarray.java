package recursion;

public class     findmaxelementsarray {
    static int findmax(int[] arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }else{
            int max=arr[idx];
            return Math.max(max,findmax(arr,idx+1));

        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.print(findmax(arr,0));
    }
}
