import java.lang.reflect.*;

public class main {
    public static void main(String args[]) {
        try{
        Class<?> c = Class.forName("test");
        Method m [] = c.getDeclaredMethods();
        for(int i =0;i<m.length;i++){
            System.out.println(m[i].toString());
        } 
        } catch (Exception e){}
    }
    
}
