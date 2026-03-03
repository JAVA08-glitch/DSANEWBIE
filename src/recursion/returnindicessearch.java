package recursion;

public class returnindicessearch {
    static void search(int[] arr,int idx,int target) {
        if (idx == arr.length) {
            return;
            }if(target==arr[idx]){
            System.out.print(idx+" ");

        }
            
                 search(arr, idx + 1, target);

        }

    public static void main(String[] args) {
        int[] arr={1,2,3,2,4,2};
        search(arr,0,2);

    }
}
