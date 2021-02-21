public abstract class Instrument {

    private String colour;
    private String model;

    public Instrument(String colour, String model) {
        this.colour = colour;
        this.model = model;
    }

    public String getColour() {
        return this.colour;
    }

    public String getModel() {
        return this.model;
    }

}