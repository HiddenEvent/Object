package Movie;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PeriodCondition implements DiscountCondition {
    private DayOfWeek dayOfWeek; // 요일
    private LocalTime startTime; // 시작시간
    private LocalTime endTime;   // 종료시간

    public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) && //상영 요일 같은지 비교
                startTime.compareTo(screening.getStartTime().toLocalTime()) <= 0 && // 상영시작시간이 start ~ end 사이이에 있는지 확인
                endTime.compareTo(screening.getStartTime().toLocalTime()) >= 0;
    }
}
