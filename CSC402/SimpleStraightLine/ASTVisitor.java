public class ASTVisitor {
    public ASTVisitor(){}
    private static ASTVisitor instance = null;

    public static ASTVisitor getInstance(){
        if(instance == null) instance = new ASTVisitor(); 
        return instance;
    }
        
    
    boolean visit(Stm node){return true;}
    boolean visit(CompoundStm node){return true;}
    boolean visit(AssignStm node){return true;}
    boolean visit(PrintStm node){return true;}
    boolean visit(Exp node){return true;}
    boolean visit(IdExp node){return true;}
    boolean visit(NumExp node){return true;}
    boolean visit(OpExp node){return true;}
    

    
}
