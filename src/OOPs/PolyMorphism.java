package OOPs;

class Sum{
    //Compile time polymorphism => MethodOverloading
    //Some methods are overload means greater than 1 overload
    //ex. we have to sum of 3 then 4 then 5 numbers, so we have to write its own methods, but we have to give
    //all methods different name and that we want to remember by our selves
    //But there is another way is method overloading,

    //Rules:
    //1. Parameters of methods return type have to be different while they have same return type and same no.of parameters
    //2. If you want same arguments then you have to change its return type and no.of arguments
    //3. If you want same return type then you have to change no.of parameters

    //ex.1
    public int sum(int a, int b){
        return a+b;
    }

    public int sum(float a, float b){
        return (int) ((int)a+b+1);
    }

   public void sum(int a, int b, int c){
       System.out.println(a+b+c);
   }
}
public class PolyMorphism {
    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println( s.sum(1.2f,2.1f));
    }
}
