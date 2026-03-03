package technicalclass;

public class divisibility {
    static void divisible(int num) {
        if (num % 2 == 0 && num %3==0) {
            System.out.println("Divisible by both");
        } else if (num % 3 == 0) {
            System.out.println("divisible by 3");

        } else if(num%2==0){
            System.out.println("Divisible by 2");
        }else {
            System.out.println("Divisible by none");
        }

    }

    public static void main(String[] args) {
       int a= 12;
       divisible(a);
    }
}
