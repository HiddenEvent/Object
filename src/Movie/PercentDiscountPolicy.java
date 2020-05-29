package Movie;

public class PercentDiscountPolicy extends DiscountPolicy{
    private double percent; // 할인 비율

    public PercentDiscountPolicy(DiscountCondition conditions, double percent) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
