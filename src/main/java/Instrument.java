public abstract class Instrument implements IPlay {

    private String colour;
    private String model;
    private int costPrice;
    private int sellingPrice;

    public Instrument(String colour, String model, int costPrice, int sellingPrice) {
        this.colour = colour;
        this.model = model;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getColour() {
        return this.colour;
    }

    public String getModel() {
        return this.model;
    }


    public  int getCostPrice(){
        return this.costPrice;
    };

    public int getSellingPrice(){
        return this.sellingPrice;
    };

    public void setSellingPrice(int sellingPrice){
        this.sellingPrice = sellingPrice;
    };


}


