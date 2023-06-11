public class RewardValue {

    private final int milesValue;
    private final double cashValues;

    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;


    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValues = milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public int getMilesValue() {
        return this.milesValue;
    }

    public RewardValue(double cashValues) {
        this.cashValues = cashValues;
        this.milesValue = (int) (cashValues / MILES_TO_CASH_CONVERSION_RATE);
    }


    public double getCashValue() {
        return this.cashValues;
    }




}
