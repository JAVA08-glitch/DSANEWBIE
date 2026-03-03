package recursion;

public class findmaxelementsarray {
    static int findmax(int[] arr,int idx,int max){
        if(idx==arr.length-1){
            return (max<arr[idx] ? arr[idx]:max);
        }else{
            if(max<arr[idx]){
                max=arr[idx];
            }return findmax(arr,idx+1,max);

        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.print(findmax(arr,0,0));
    }
}
