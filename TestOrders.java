import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    Order order1 = new Order();
    Order order2 = new Order();
    Order order3 = new Order("Brian");
    Order order4 = new Order("Michael");
    Order order5 = new Order("Clara");
    Item item1 = new Item("drip coffee", 3.00);
    Item item2 = new Item("cappucino", 5.50);
    Item item3 = new Item("mocha", 5.00);
    Item item4 = new Item("latte", 4.00);
    order1.addItem(item1);
    order1.addItem(item2);
    order2.addItem(item3);
    order2.addItem(item4);
    order3.addItem(item4);
    order3.addItem(item2);
    order4.addItem(item2);
    order4.addItem(item3);
    order5.addItem(item1);
    order5.addItem(item4);
    order1.display();
    order2.display();
    order3.display();   
    order4.display();
    order5.display();
    order1.setReady(true);
    order2.setReady(true);
    order3.setReady(true);

        
    System.out.println(order1.getName());
    System.out.println(order2.getName());
    System.out.println(order3.getName());
    System.out.println(order4.getName());
    System.out.println(order5.getName());
    System.out.println(order1.isReady());
    System.out.println(order2.isReady());
    System.out.println(order3.isReady());
    System.out.println(order4.isReady());
    System.out.println(order5.isReady());
    System.out.println(order5.getOrderTotal());
    }
}
