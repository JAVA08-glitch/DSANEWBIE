package collections;
import java.util.*;
public class setExample {
    static void Hasexm(){
        HashSet<Integer> hs= new HashSet<>();
        hs.add(1);
        hs.add(45);
        System.out.println(hs.contains(45));

        System.out.println(hs.remove(1));
        System.out.println(hs);
    }
    static void LinkedH(){
        LinkedHashSet<Integer> lh=new LinkedHashSet<>();

    }
    static void treeh(){
        TreeSet<Integer> ts= new TreeSet<>();
    }
    public static void main(String[] args) {
    Hasexm();
    }
}
