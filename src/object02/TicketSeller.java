package object02;

public class TicketSeller { //판매원
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience){
            Ticket ticket = ticketOffice.getTicket();
            ticketOffice.plusAmount(audience.buy(ticket)); // 판매원은 티켓 금액만큼 금액 +
    }

}
