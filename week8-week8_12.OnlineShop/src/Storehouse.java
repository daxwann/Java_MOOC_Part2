import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Storehouse() {
        this.prices = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }

    public void addProduct(String name, int price, int stock) {
            this.prices.put(name, price);
            this.stocks.put(name, stock);
    }

    public int price(String name) {
        if (name == null) {
            return -99;
        }

        if (this.prices.containsKey(name)) {
            return this.prices.get(name);
        }

        return -99;
    }

    public int stock(String name) {
        if (name == null) {
            return 0;
        }

        if (this.stocks.containsKey(name)) {
            return this.stocks.get(name);
        }

        return 0;
    }

    public boolean take(String name) {
        if (name == null) {
            return false;
        }

        if (!this.stocks.containsKey(name) || this.stocks.get(name) <= 0) {
            return false;
        }

        this.stocks.put(name, this.stocks.get(name) - 1);

        return true;
    }

    public Set<String> products() {
        return this.prices.keySet();
    }
}
