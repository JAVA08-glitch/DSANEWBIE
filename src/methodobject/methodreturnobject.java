package methodobject;
class object{
    String emp;
    int id;
    int age;
    object(String emp, int id, int age){
        this.emp=emp;
        this.id=id;
        this.age=age;
    }
    public String toString(){
        return "EMPLOYEE DETAILS={"+emp+" "+id+" "+" "+age+"}";//to string must return a string
    }
}
public class methodreturnobject {
    public static object details(){
        return new object("Soumya",585,22);
    }
    public static void main(String[] args){
        object e1=details();
        System.out.println(e1);
    }
}
