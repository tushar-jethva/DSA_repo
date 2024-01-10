package OOPs;

 class Car{
    public String color;
    public String body;

    public Car(String color, String body){
        this.color = color;
        this.body = body;
    }

    public Car(Car c){
        this.color = c.color;
        this.body = c.body;
    }
}

public class Basic {
    public static void main(String[] args) {
        Car c = new Car("Blue","Carbon");
        c.color = "Red";
        Car c1 = new Car(c);
        Car c2 = new Car(c1);
        System.out.println(c1.color);
        System.out.println(c2.body);
    }
}
