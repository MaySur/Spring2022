public class Visitor {
    private Visitor(){}
    private static Visitor instance = null;

    public static Visitor getInstance(){
        if(instance == null)    instance = new Visitor();
         return instance;
    }

    

    
}
