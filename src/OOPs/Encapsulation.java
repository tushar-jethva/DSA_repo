package OOPs;

class Car4{

    private String key = "SECRETKEY";
    public String getKey(){
        return this.key;
    }
    public void setKey(String key){
        this.key = key;
    }

}

public class Encapsulation {
    //Encapsulation means wrap all data and members into class.
    //But here we open data hiding concept by access modifiers
    public static void main(String[] args) {
        Car4 car4 = new Car4();
        car4.setKey("KEY");
        System.out.println(car4.getKey());
    }
}
