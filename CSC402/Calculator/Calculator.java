public class Calculator {

    CalculatorOperation co;

    public Calculator (CalculatorOperation e){
        this.co=e;
    }

    public int solve(int x, int y){
        return this.co.calculate(x,y);
    }
  
    
}
