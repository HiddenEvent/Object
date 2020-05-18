## 1. Threader가 Audience와 TicketSeller에 직접 접근 X
- 관람객과 판매원을 자율적인 존재로 만들기
1. Theaterd의 enter메서드에서 TicketOffice에 접근ㅂ하는 모든 코드를 TicketSeller 내부로 숨긴다.
  - TicketSeller에 sellTo 메서드를 추가하고 Theater에 있던 로직을 옮기자.