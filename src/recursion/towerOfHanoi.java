package recursion;

public class towerOfHanoi {
    static void hanoi(int plate, String source, String helper, String dest) {
        if (plate == 1) {
            System.out.println("Move plate " + plate + " from " + source + " to " + dest);
            return;
        }
        hanoi(plate - 1, source, dest, helper);
        System.out.println("Move plate " + plate + " from " + source + " to " + dest);
        hanoi(plate - 1, helper, source, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        hanoi(n, "A", "B", "C");
    }
}
