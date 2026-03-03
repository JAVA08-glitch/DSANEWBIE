public class bubblesort {
    static int[] sort(int[] arr){
        int n=arr.length;
        for(int i=0; i<n-1;i++){
            boolean start=false;
            for(int j=0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                    start=true;
                }
            }if(start){
                return arr;
            }
        }return arr;
    }

    public static void main(String[] args) {
        int[] a={7,5,4,3};
        int[] ans=sort(a);
        for(int value:ans){
            System.out.print(ans);
        }
    }
}
