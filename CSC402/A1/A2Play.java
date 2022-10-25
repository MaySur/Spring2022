public class A2Play {
    public static int x =4;
    public static void main( String[]args) {
        //((Math.pow(x,2))-1)+((Math.pow(x,2))-2)
        double lcount= (Math.pow(x, 2)-2);
        for(int line =1;line<=lcount;line++){
            wave();
            System.out.println();
            at();
            System.out.println();
            
        }
        wave();
        
                    
        }
        public static void dot() {
            for(int dot=1;dot<=x*4;dot++)System.out.print('.'); 
        }
        public static void wave() {
            dot();
            for(int ahh=1;ahh<=x*2+3;ahh++)System.out.print('~');            
            dot();    
        }
        public static void at () {
            dot();
            System.out.print('|');
            for(int ahh=1;ahh<=x;ahh++){
               System.out.print("-@");
            }
            System.out.print('-');
            System.out.print('|');
            dot();
        }
    

}