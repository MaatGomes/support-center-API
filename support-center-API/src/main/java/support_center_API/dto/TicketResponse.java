package support_center_API.dto;

import support_center_API.enums.Department;
import support_center_API.enums.Priority;
import support_center_API.enums.Status;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
public class TicketResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String description;

    private Instant initialDate;

    private Status status;

    private Department tagDepartment;

    private String originTeam;

    private Priority priority;

}
