public class Piano extends Instrument {
    private String manufacturer;
    private String model;
    private String colour;
    private int costPrice;
    private int sellingPrice;


    public Piano(String manufacturer, String model, String colour, int costPrice, int sellingPrice) {
        super(colour, model, costPrice, sellingPrice);
        this.manufacturer = manufacturer;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public String play() {
        return "Lalala";}

    public int calculateMarkup() {
        return getSellingPrice() - getCostPrice();

    }
}