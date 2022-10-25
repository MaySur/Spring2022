import java.util.Arrays;
/**
 * CSC 402-01 Assignment #1
 * 
 * On my honor, Mayur Suresh, this assignment is my own work.  
 * I, Mayur Suresh, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */

public class A1 {    
    // Do NOT change the following line. 3
    public static int SIZE = 4;

    public static void main(String[] args) {
        if(args.length > 0 && args[0] != null)
            SIZE = Integer.parseInt(args[0]);
            topHalf();
            midSec();
            bottom();
            System.out.println();

    }
    public static void topHalf() {
        hash();
        System.out.println();
        for(int line =1;line<=(SIZE*2-2);line++){
            topDot();
            
            for(int colon =0;colon<(SIZE*2-1);colon++) System.out.print(":");

            topDot();             
            System.out.println();
        }
        hash(); 
        System.out.println();      
    }
    public static void topDot() {
        for(int dot =1;dot<=(SIZE*4+2);dot++) {
            System.out.print(".");
        }
    }
    public static void hash(){
        topDot();
        for(int hash =0;hash<(SIZE*2-1);hash++){ 
            System.out.print("#"); 
        }
        topDot();
    }
    public static void midSec(){
        //((Math.pow(SIZE,2))-1)+((Math.pow(SIZE,2))-2)
        double lcount= (Math.pow(SIZE,2)-2);
        for(int line =1;line<=lcount;line++){
            wave();
            System.out.println();
            at();
            System.out.println();
            
        }
        wave();
    }
    public static void Middot() {
        for(int dot=1;dot<=SIZE*4;dot++){
            System.out.print('.');
        } 
    }
    public static void wave() {
        Middot();
        for(int ahh=1;ahh<=SIZE*2+3;ahh++){
            System.out.print('~');
        }
        Middot();          
    }
    public static void at () {
        Middot();
        System.out.print('|');
        //SIZE*2+1
        for(int ahh=1;ahh<=SIZE;ahh++){
            System.out.print("-@");
        }
        System.out.print("-|");
        Middot();
    }
    public static void bottom(){
        System.out.println();
        for(int i=1;i<=SIZE;i++){
            System.out.print('/');
            //SIZE*10+1
            for(int line =1;line<=SIZE*5;line++){
                System.out.print("\"#");
            }
            System.out.println("\"\\");
        }

    }
    
   
}
