package object;

public class Theater { //소극장
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller){
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience){
        if (audience.getBag().hasInvitation()){ //초대장이 있다면
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else { // 초대장이 없으면
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee()); //관람객 한테 티켓 금액만큼 차감
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee()); // 판매원은 티켓 금액만큼 금액 +
            audience.getBag().setTicket(ticket); // 관람객의 가방에 티켓 지급
        }
    }

}
