public class ASTVistorEX extends ASTVisitor{
    boolean visit(NumExp node){

        System.out.println(node.num);
        return true;
            
    }

        
    
}
