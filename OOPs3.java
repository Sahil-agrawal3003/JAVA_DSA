public class OOPs3 {
// Multi-level Inheritance

    
   public static void main (String args[]){

    //Dog dobby = new Dog();
    //dobby.eat();
    //dobby.legs = 4;
   // System.out.println(dobby.legs);

  // Animal a = new Animal();
  // a.eat();
  // a.breathes();
  /*  Mammal m = new Mammal();
   m.eat();
   m.breathes();
   m.walk();
   Fish f = new Fish();
   f.eat();
   f.breathes();
   f.swim();
    Bird b  = new Bird();
    b.eat();
    b.breathes();
   b.fly(); */

    
    Calculator calc = new Calculator();
    System.out.println(calc.sum(1,2));
    System.out.println(calc.sum((float)1.5, (float)2.5));
    System.out.println(calc.sum(1,2,3));


   


   } 
}

// Base class
/*class Animal{
    String color;

    void eat(){
        System.out.println("eats");

    }

     void breathes(){
        System.out.println("breathe");

     }   

    
}


class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }

}

class Fish extends Animal{
    void swim(){
        System.out.println("swim");

    }

}

class Bird  extends Animal{
    void fly(){
        System.out.println("fly");
        
    }

}

//class Dog extends Mammal{
    String breed;
//}  */

class Calculator{
    int sum(int a, int b){
        return a + b;

    }

    float sum (float a , float b){
        return a + b;

    }

    int sum (int a , int b, int c){
        return a + b + c;
        
    }
}



