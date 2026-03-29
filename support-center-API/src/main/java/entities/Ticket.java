package entities;

import enums.Priority;
import enums.Status;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.UUID;

public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String description;

    private Date initialDate;

    private Status status;

    private String department;

    private String originTeam;

    private Priority priority;
}
