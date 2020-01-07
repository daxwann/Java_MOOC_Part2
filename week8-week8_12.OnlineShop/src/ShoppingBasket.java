import java.util.Map;
import java.util.HashMap;

public class ShoppingBasket {
    private Map<String, Purchase> purchases;

    public ShoppingBasket() {
        this.purchases = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if (this.purchases.containsKey(product)) {
            this.purchases.get(product).increaseAmount();
        } else {
            Purchase newPurchase = new Purchase(product, 1, price);
            this.purchases.put(product, newPurchase);
        }
    }

    public int price() {
        int priceTotal = 0;

        for (Purchase purchase : this.purchases.values()) {
            priceTotal += purchase.price();
        }

        return priceTotal;
    }

    public void print() {
        for (Purchase purchase : this.purchases.values()) {
            System.out.println(purchase);
        }
    }
}
