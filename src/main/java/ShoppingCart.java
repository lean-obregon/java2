import java.util.*;

public class ShoppingCart {
    String name, address, city, state;
    int zip;
    double total = 0;
    private ArrayList<String> Item = new ArrayList<>();

    public ShoppingCart() {
    }

    public ShoppingCart(int shippingCharge){
        if (getTotal() > 10) {
            total += total * .10;
            System.out.println("Free Shipping");
        } else {
            total += total * .10;
            System.out.println("Shipping charge: " + shippingCharge);
        }
    }

    public void addItem(new Item(double price, int quantity, String item)) {
        String addItemString = item + " " + "$" + price + " " + quantity + " = " + (quantity * price);
        Item.add(addItemString);
    }

    public void calculateTotal() {
//        total += price * quantity;
    }

    public double getTotal() {
        return total;
    }

    public void shipOrder(String name, String address, String city, String state, int zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {
        System.out.printf("Ship to:\n %s\n%s\n%s, %s %s", name, address, city, state, zip);

        System.out.println(Item);
        new ShoppingCart();

        return null;
    }
}
