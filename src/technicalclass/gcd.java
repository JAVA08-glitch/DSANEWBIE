package technicalclass;

public class gcd {
    static int gcdCalc(int x, int y) {
        if (y == 0) {
            int swap = y;
            y = x;
            x = swap;

        }
        if (x == 0) {
            return y;
        } int ans=0;
            while (x!=0) {
                int  rem=y%x;
                 if(rem==0){
                     ans=x;
                     break;
                 }
                y=x;
                 x=rem;
            }return ans;

    }

    public static void main(String[] args) {
        System.out.print(gcdCalc(5,7));
    }
}
