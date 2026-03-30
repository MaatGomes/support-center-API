package support_center_API.controller;

import support_center_API.dto.TicketRequest;
import support_center_API.dto.TicketResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import support_center_API.service.TicketService;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @PostMapping("/create-ticket")
    public ResponseEntity<TicketResponse> createTicket(@RequestBody TicketRequest ticketRequest){
        TicketResponse ticket = ticketService.createTicket(ticketRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(ticket);
    }
}
