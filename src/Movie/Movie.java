package Movie;

import java.time.Duration;

public class Movie {
    private String title;
    private Duration runningTime; //상영시간
    private Money fee; // 요금
    private DiscountPolicy discountPolicy; // 할인정책 = 비율할인 정책, 금액할인 정책


    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee(){
        return fee;
    }

    public Money calculateMovieFee(Screening screening){
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }


}
