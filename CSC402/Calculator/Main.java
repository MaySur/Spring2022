public class Main {
    
    public static void main(String [] args){
        Calculator calc1 = new Calculator(new Addition());
        Calculator calc2 = new Calculator(new Subtraction());

        int x=5,y=5;

        System.out.println(calc1.solve(x,y));
        System.out.println(calc2.solve(x,y));
    }
    
}
