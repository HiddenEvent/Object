package code;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

public enum TypeEnum {
    ;
    @AllArgsConstructor
    @Getter
    public enum AddSvcType {
        NORMAL("일반"),
        INSURANCE("보험"),
        ;
        private final String statusMsg;
    }
    @AllArgsConstructor
    @Getter
    public enum DeliveryType  {
        UNKNOWN("UNKNOWN"),
        PS("택배"),
        PS_SALES("택배(영업점 발송)"),
        QUICK("퀵"),
        DIRECT("방문수령"),
        ;
        private final String statusMsg;
    }
    @AllArgsConstructor
    @Getter
    public enum UserRoleType  {
        CONSULT( "상담"),
        LOGIS( "물류"),
        OPENING( "개통"),
        ADJUST( "정산"),
        ACCUM("매집"),
        ETC("기타")
        ;
        private final String statusMsg;
    }
}
