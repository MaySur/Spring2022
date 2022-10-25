
public class Main{


 public static void main(String[] args) {
     Subject subject = new Subject();

     Obs x = new Obs(subject);
     Obs y = new Obs(subject);
     Obs z = new Obs(subject);

     x.setState(10);
     x.setState(11);

    
}
}