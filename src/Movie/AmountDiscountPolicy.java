package Movie;

public class AmountDiscountPolicy extends DiscountPolicy { // 할인정책 구현
    private Money discountAmount; //할인요금

    public AmountDiscountPolicy(DiscountCondition conditions, Money discountAmount) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
