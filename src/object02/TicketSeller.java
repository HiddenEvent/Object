package object02;

public class TicketSeller { //판매원
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience){
        ticketOffice.sellTicketTo(audience);
    }

}
