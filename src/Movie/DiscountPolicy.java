package Movie;

public interface DiscountPolicy{
    Money calculateDiscountAmount(Screening screening);
}
