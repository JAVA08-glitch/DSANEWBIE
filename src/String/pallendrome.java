package String;

public class pallendrome {
    static boolean pallcheck(String s){
        String temp=s.trim();



        int start=0, end=temp.length()-1;
        while(start<end){

            if(temp.charAt(start)!=temp.charAt(end)){
                return false;
            }
            start++;
            end--;

        }return true;

    }

    public static void main(String[] args) {
        String s="roar";
        if(pallcheck(s)){
            System.out.println("Mirror text");
        }else{
            System.out.println("Not a mirror text");
        }
    }
}
