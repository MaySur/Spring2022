import java.util.ArrayList;
import java.util.List;

public class Broker {
    private String name;
    private List <Order> orderList = new ArrayList<Order>();
    public Broker(String name){
        this.name = name;
    }

    public void buy(String tickerSymbols, int quantity){
        System.out.println("Stock [Name: "+ tickerSymbols + ", Quantity: "+quantity +" ] bought from "+name);
    }
    
    public void sell(String tickerSymbols, int quantity){
        System.out.println("Stock [Name: "+ tickerSymbols + ", Quantity: "+quantity +" ] sold to "+name);
    }
    public void takeOrder(Order order){
        orderList.add(order);
    }
    public void placeOrder() {
        for (Order o : orderList) o.execute();

        orderList.clear();
        
    }
}
