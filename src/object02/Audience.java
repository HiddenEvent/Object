package object02;

public class Audience { // 관람객
    private Bag bag;
    public Audience(Bag bag){
        this.bag = bag;
    }

    public Long buy(Ticket ticket){
        if (bag.hasInvitation()) { //초대장이 있다면
            bag.setTicket(ticket);
            return 0L;
        } else {
            bag.minusAmount(ticket.getFee()); //관람객 한테 티켓 금액만큼 차감
            bag.setTicket(ticket); // 관람객의 가방에 티켓 지급
            return ticket.getFee();
        }

    };
}
