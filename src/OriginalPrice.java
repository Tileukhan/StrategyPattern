public class OriginalPrice implements Pricing{
    @Override
    public double calculatePrice(double initialPrice) {
        return initialPrice;
    }
}
