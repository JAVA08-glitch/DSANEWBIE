package methodobject;
 interface sim{
     void call();
 }
 class airtelsim implements sim{
    public void call(){
        System.out.println("Calling via airtel");
     }
 }
 class jiosim implements sim{
     public void call(){
         System.out.println("Calling via jiosim");
     }
 }
 class myMobile{
     private sim s1;
     void insertSim(sim s1){
         this.s1=s1;
     }
     void useMobile(){
         this.s1.call();
     }
 }
public class methodoverriding {
    public static void main(String[] args) {


        myMobile m1 = new myMobile();
        m1.insertSim(new jiosim());
        m1.useMobile();
        System.out.println("-----------------------");
        myMobile m2= new myMobile();
        m2.insertSim(new airtelsim());
        m2.useMobile();
    }

}
