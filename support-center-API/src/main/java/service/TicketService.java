package service;

import dto.TicketRequest;
import dto.TicketResponse;
import entities.Ticket;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    public TicketResponse createTicket (TicketRequest ticketRequest){
        Ticket ticket = new Ticket(ticketRequest.getDescription(), ticketRequest.getTagDepartment(), ticketRequest.getOriginTeam(), ticketRequest.getPriority());
    }
}
