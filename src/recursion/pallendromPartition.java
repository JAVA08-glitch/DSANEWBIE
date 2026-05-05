package recursion;

import java.util.*;

public class pallendromPartition {
    static List<List<String>> partition(String s){
        List<List<String>> pile = new ArrayList<>();
        List<String> ls = new ArrayList<>();
        check(pile, ls, s, 0);
        return pile;
    }

    static void check(List<List<String>> pile, List<String> ls, String s, int idx){
        if(idx == s.length()){
            pile.add(new ArrayList<>(ls));
            return;
        }
        for(int i = idx; i < s.length(); i++) {
            String temp = s.substring(idx, i + 1);
            if(isPallindrom(temp)) {
                ls.add(temp);
                check(pile, ls, s, i + 1);
                ls.remove(ls.size() - 1);
            }
        }
    }

    static boolean isPallindrom(String p){
        int l = 0, r = p.length() - 1;
        while(l < r){
            if(p.charAt(l) != p.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> result = partition(s);
        System.out.println("Palindrome partitions of \"" + s + "\":");
        for(List<String> partition : result){
            System.out.println(partition);
        }
    }
}
