public class OOPs {
    public static void main (String args[]){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
       // p1.setcolor ("Yellow");
       p1.setColor ("Yellow");
       System.out.println(p1.getColor());
       

      // BankAccount myAcc = new BankAccount();
      // myAcc.username = "SahilAgrawal";
     // myAcc.setPassword("abcdefghijk");


        
    }
    
}

/*class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}*/

class Pen {
   String color;
   int tip;

   String  getColor() {
    return this.color;

   }

   int  getTip() {
    return this.tip;

   }
   void setColor(String newColor){
    this.color = newColor;

   }

   void setTip(int tip){
    this.tip = tip;
   }

}

/*class Student {
    String name;
    int age;
    float percentage;  //cgpa

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) / 3.0f;
       System.out.println("Percentage: " + percentage + "%");

        
    } 

} */