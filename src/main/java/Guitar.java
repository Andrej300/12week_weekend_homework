public class Guitar extends Instrument {
    private String name ;
    private String model;
    private String colour;
    private int costPrice;
    private int sellingPrice;




    public Guitar(String name, String model, String colour, int costPrice, int sellingPrice) {
        super(colour, model);
        this.name = name;
        this.model = model;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;



    }

    public String getName() {
        return name;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }
}
