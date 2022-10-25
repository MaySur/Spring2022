public class A3Play {
    public static int x =3;
    public static void main(String [] args ) {
        
        for(int i=1;i<=x;i++){
            System.out.print('/');
            for(int line =1;line<=x*10+1;line++){
                if(line%2!=0) System.out.print('"');
                else System.out.print('#'); 
            }
            System.out.println('/');
        }
    }
    
}
