public class Guitar extends Instrument {
    private String name ;
    private String model;
    private String colour;
    private int costPrice;
    private int sellingPrice;




    public Guitar(String name, String model, String colour, int costPrice, int sellingPrice) {
        super(colour, model, costPrice, sellingPrice);
        this.name = name;


    }

    public String getName() {
        return name;
    }

    public String play() {
        return "Dram-dram";
    }



}

