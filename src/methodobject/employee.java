package methodobject;
class object2{
    String emp;
    int id;
    int age;
    object2(String emp, int id, int age){
        this.emp=emp;
        this.id=id;
        this.age=age;
    }
    public String toString(){
       return "EMPLOYEE DETAILS={"+emp+" "+id+" "+" "+age+"}";//to string must return a string
    }
}
public class employee {
    public static void main(String[] args){
        object e1=new object("Soumya",585,22);
        System.out.println(e1);
    }
}
