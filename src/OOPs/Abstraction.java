package OOPs;

abstract class Animal{
     void kai(){
         System.out.println("Hello");
     };
    abstract void eats(int a);
    int b;
     Animal(int b){
         this.b = b;
         System.out.println("Animal");
     }
    void walk(){
        System.out.println("Animal is walking"+b);
    }
    abstract int hello();

      final void kill(){
         System.out.println("Animal is killer!");
     }

}

interface Car3{
    //every method is public abstract
    //every variables data are public static final
    int a  = 10;
    void run();
    void petrol();
}

class Tata implements Car3{


    @Override
    public void run() {
        System.out.println("It takes 2 second for going above 100km");
    }

    @Override
    public void petrol() {
        System.out.println(Car3.a);
    }

}

class Horse extends Animal{

    Horse(){
        super(2);
        System.out.println("horse");
    }

    @Override
    void eats(int a) {
        System.out.println("Horse is eating");
    }

    @Override
    int hello() {
        return 0;
    }

}

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.kill();


    }
}
