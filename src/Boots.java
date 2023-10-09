public class Boots implements Items{
    private String category;
    private double initialPrice;
    private double size;
    private Pricing pricing;


    public Boots(String category, double initialPrice, double size,Pricing pricing) {
        this.category = category;
        this.initialPrice = initialPrice;
        this.size = size;
        this.pricing=pricing;
    }

    @Override
    public String getName() {
        return category+"Boots";
    }
    @Override
    public double getPrice() {
        return initialPrice;
    }

    @Override
    public double getSize() {
        return size;
    }
}
