package OOPs;

class AccessModifiers {
    //private -> within class
    //default -> within package not outside package if we don't mention any specifier then it will be default
    //protected -> within package and outside package if it is subclass
    //public -> everywhere
    public static void main(String[] args) {
        Parent p = new Parent();
        Parent p1 = new Child();
        Child c = new Child();
        c.msg();
        p1.msg();
        p.msg();
        p1.m();
        c.m();
        System.out.println(p.bonus);
        System.out.println(p.name);
    }
}

public class Parent{

    //private
    private int salary = 10000;

    //default
    String name = "Tushar";

    //protected
    protected int bonus = 5000;

    public String animal = "Sher";

    public void msg(){
        System.out.println("HI i am parent");
    }

    void m(){
        System.out.println("Parent's 1 ");
    }

    protected void msg3(){
        System.out.println("Protected method");
    }

}

class Parent2{

}

class Child extends Parent{
    @Override
    public void msg() {
        System.out.println("HI i am child");
    }

    void m(){
        System.out.println("hi second");
    }
}

