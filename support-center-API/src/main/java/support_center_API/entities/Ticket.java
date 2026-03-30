package support_center_API.entities;

import support_center_API.enums.Department;
import support_center_API.enums.Priority;
import support_center_API.enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String description;

    private Instant initialDate;

    private Status status;

    private Department tagDepartment;

    private String originTeam;

    private Priority priority;


    public Ticket (String description, Department tagDepartment, String originTeamm, Priority priority){
        this.description = description;
        this.initialDate = Instant.now();
        this.status = Status.CREATED;
        this.tagDepartment = tagDepartment;
        this.originTeam = originTeamm;
        this.priority = priority;
    }
}
