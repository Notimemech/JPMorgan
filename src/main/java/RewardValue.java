public class RewardValue {
    private double cash;
    private double miles;
    private static final double converter = 0.0035;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = cash / converter;
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = miles * converter;
    }
    public double getCashValue() {
        return cash;
    }
    public double getMilesValue() {
        return miles;
    }
}
