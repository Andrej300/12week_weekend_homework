import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell>stock;
    private double till;

    public Shop(String name) {

        this. name = name;
        this.stock = new ArrayList<ISell>();
        this.till = 0;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<ISell> stockCount() {
        return stock;
    }

    public void addToStock(ISell item) {
        this.stock.add(item);
    }

    public void sell(ISell item) {
        this.stock.remove(item);
        this.till += item.getSellingPrice();
    }
}

