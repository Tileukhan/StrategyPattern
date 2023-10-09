public class ReplicaPrice implements Pricing {
    @Override
    public double calculatePrice(double initialPrice) {
        return initialPrice*0.8;
    }
}
