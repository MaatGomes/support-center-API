package dto;

import enums.Department;
import enums.Priority;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TicketRequest {

    @NotBlank(message = "Por favor, descreva em detalhes o problema para que nossa equipe consiga te atender da melhor forma possível.")
    private String description;
    @NotBlank(message = "Por favor, nos diga em qual departamento o problema ocorreu ? Exemplo: Financeiro, Logistico, Site, App, etc.")
    private Department tagDepartment;
    @NotBlank(message = "Por favor, nos informe o nome do seu time.")
    private String originTeam;
    @NotBlank(message = "Por favor, nos informe a prioridade do chamado. Exemplo: low, medium ou high")
    private Priority priority;
}
