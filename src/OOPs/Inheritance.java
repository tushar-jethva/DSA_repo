package OOPs;

class AllCar{
    String color;
    int no_of_seats;
    AllCar(String color, int no_of_seats){
        this.color = color;
        this.no_of_seats = no_of_seats;
        System.out.println("This is parent constructor!");
    }

    protected void hello(int a, int b){
        System.out.println(a+b);
        System.out.println("Hello from parent");
    }

    void kai(){
        System.out.println("kai");
    }
}

class Jaguar extends  AllCar{
    String name;
    int price;
    String color;
    String n;
    Jaguar(String name, int price, String color, int seats){
        super(color,seats);
        this.name = name;
        this.price = price;
        System.out.println("Hello from child constructor!");
    }

    @Override
    protected void hello(int a, int b) {
        super.hello(a, b);
        System.out.println("Hello from child");
    }

    void hi(){
        super.hello(1,2);
    }



}

class MarutiSuzuki extends Jaguar{
    String name;
    int price;
    String color;
    int n;
    MarutiSuzuki(String name,int price, String color,int n){
        super(name,price,color,n);
        System.out.println("this is maruti constructor");
    }

}

public class Inheritance {
    public static void main(String[] args) {

//        AllCar c = new AllCar("Red",2);
//        Jaguar j = new Jaguar("Jaguar",870000,"Grey",5);
          MarutiSuzuki m = new MarutiSuzuki("Mar",777,"blue",7);
          Parent p = new Parent();
          System.out.println(p.bonus);
//        c.hello(10,20);
//        j.hello(1,2);


    }
}
