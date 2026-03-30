package entities;

import enums.Department;
import enums.Priority;
import enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Entity
@AllArgsConstructor
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
