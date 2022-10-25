public class Playbox {
    public static final int SIZE =3;
    public static void main(String [] args) {
        System.out.println((((Math.pow(2,2))-1)+((Math.pow(2,2))-2)));
       // border();
      //  topHalf();
      //  bottomHalf();
       // border();
    }
    public static void border() {
        System.out.print("#");
        for(int i =1;i<=(SIZE*4);i++) System.out.print("=");
        System.out.println("#");
        
    }
    public static void topHalf(){
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            for (int space = 1; space <= (line * -2 + SIZE*2); space++) {
            System.out.print(" ");
            }
            System.out.print("<>");
            for (int dot = 1; dot <= (line * 4 - 4); dot++) {
            System.out.print(".");
            }
            System.out.print("<>");
            for (int space = 1; space <= (line * -2 + SIZE*2); space++) {
            System.out.print(" ");
            }
            System.out.println("|");
            }
            
            
        
    }
    public static void bottomHalf() {
        for (int line = SIZE; line >= 1; line--) {
            System.out.print("|");
            for (int space = 1; space <= (line * -2 + SIZE*2); space++) {
                System.out.print(" ");
                }
                System.out.print("<>");
                for (int dot = 1; dot <= (line * 4 - 4); dot++) {
                System.out.print(".");
                }
                System.out.print("<>");
                for (int space = 1; space <= (line * -2 + SIZE*2); space++) {
                System.out.print(" ");
                }
                System.out.println("|");
                }
                
        

        
    }
}

    

