package controller;

import dto.TicketRequest;
import dto.TicketResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.TicketService;

@RestController("/api/ticket")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @PostMapping("/create")
    public ResponseEntity<TicketResponse> createTicket(@RequestBody TicketRequest ticketRequest){
        ticketService.createTicket(ticketRequest);
    }
}
