package support_center_API.service;

import support_center_API.dto.TicketRequest;
import support_center_API.dto.TicketResponse;
import support_center_API.entities.Ticket;
import support_center_API.enums.Department;
import support_center_API.enums.Priority;
import support_center_API.enums.Status;
import org.springframework.stereotype.Service;
import support_center_API.repository.TicketRepository;

import java.time.Instant;
import java.util.UUID;

@Service
public class TicketService {

    private final TicketRepository repository;

    public TicketService(TicketRepository repository) {
        this.repository = repository;
    }

    public TicketResponse createTicket (TicketRequest ticketRequest){
        Ticket ticket = new Ticket(ticketRequest.getDescription(), ticketRequest.getTagDepartment(), ticketRequest.getOriginTeam(), ticketRequest.getPriority());
        repository.save(ticket);

       return transformEntityInDTO(ticket.getId(), ticket.getDescription(), ticket.getInitialDate(), ticket.getStatus(), ticket.getTagDepartment(), ticket.getOriginTeam(), ticket.getPriority());
    }

    public TicketResponse transformEntityInDTO (UUID id, String description, Instant initialDate, Status status, Department tagDepartment, String originTeam, Priority priority){

        TicketResponse ticketResponse = new TicketResponse();
        ticketResponse.setId(id);
        ticketResponse.setDescription(description);
        ticketResponse.setInitialDate(initialDate);
        ticketResponse.setStatus(status);
        ticketResponse.setTagDepartment(tagDepartment);
        ticketResponse.setOriginTeam(originTeam);
        ticketResponse.setPriority(priority);

        return ticketResponse;
    }
}
