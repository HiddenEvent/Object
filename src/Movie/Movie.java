package Movie;

import java.time.Duration;

public class Movie {
    private String title;
    private Duration runningTime; //상영시간
    private Money fee; // 요금
    private DefaultDiscountPolicy defaultDiscountPolicy; // 할인정책 = 비율할인 정책, 금액할인 정책
    private DiscountPolicy discountPolicy;

    public void changeDiscountPolicy(DiscountPolicy discountPolicy){
        this.discountPolicy = discountPolicy;
    }

    public Movie(String title, Duration runningTime, Money fee, DefaultDiscountPolicy defaultDiscountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.defaultDiscountPolicy = defaultDiscountPolicy;
    }

    public Money getFee(){
        return fee;
    }

    public Money calculateMovieFee(Screening screening){
        return fee.minus(defaultDiscountPolicy.calculateDiscountAmount(screening));
    }


}
