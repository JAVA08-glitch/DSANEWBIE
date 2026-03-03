package recursion;

public class fibonnaci {
    static int fiboprint(int n){
        if(n==1)
            return 0;
        else if (n==2) {
            return 1;
        }else{
            return fiboprint(n-1)+fiboprint(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fiboprint(5));
    }
}
