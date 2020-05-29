package Movie;

public class SequenceCondition implements DiscountCondition {
    private int sequence; //할인 여부를 판단하기 위한 순번 변수

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    // 오버라이드
    // screening의 상영 순번과 일치 할 경우 할인 가능여부 판단
    @Override
    public boolean isSatisfiedBy(Screening screening) {  
        return screening.isSequence(sequence);
    }
}
