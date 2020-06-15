package Movie;

public class PercentDefaultDiscountPolicy extends DefaultDiscountPolicy {
    private double percent; // 할인 비율

    public PercentDefaultDiscountPolicy(DiscountCondition conditions, double percent) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
