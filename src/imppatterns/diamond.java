package imppatterns;

public class diamond {
    static void diamondprint(int n) {
        for (int i = 1; i <= n; i++) {
             if(i<=n/2+1) {
                 for (int j = 1; j <= n / 2 + 1 - i; j++) {
                     System.out.print(" ");
                 }
                 for (int k = 1; k <= i; k++) {
                     System.out.print("* ");
                 } System.out.println();
             }else{
                 for (int l = 1; l <= ((n / 2) + 2 - i); l++) {
                    System.out.print(" ");
                }
                for (int m = 1; m <= n - i+1; m++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }


    public static void main(String[] args) {
        int a =5;
        diamondprint(a);
    }
}
