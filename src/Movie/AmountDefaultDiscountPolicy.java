package Movie;

public class AmountDefaultDiscountPolicy extends DefaultDiscountPolicy { // 할인정책 구현
    private Money discountAmount; //할인요금

    public AmountDefaultDiscountPolicy(Money discountAmount, DiscountCondition conditions ) {
        super(conditions);
        this.discountAmount = discountAmount;
    }
//
//    public AmountDiscountPolicy(Money wons, SequenceCondition sequenceCondition, SequenceCondition sequenceCondition1, PeriodCondition periodCondition, PeriodCondition periodCondition1) {
//        super();
//    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
