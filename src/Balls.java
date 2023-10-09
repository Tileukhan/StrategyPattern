public class Balls implements Items {
    private String category;
    private double initialPrice;

    private double size;
    private Pricing pricing;
    public Balls(String category, double initialPrice, double size,Pricing pricing) {
        this.category = category;
        this.initialPrice = initialPrice;
        this.size = size;
        this.pricing=pricing;
    }

    @Override
    public String getName() {
        return category;
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
