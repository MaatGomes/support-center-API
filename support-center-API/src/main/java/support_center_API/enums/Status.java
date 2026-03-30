package support_center_API.enums;

import lombok.Getter;

@Getter
public enum Status {

    CREATED("O chamado foi criado."),
    DEVELOPMENT("O chamado está sendo tratado."),
    VALIDATION("O chamado está sendo validado junto ao usuário."),
    FINALIZED("O chamado foi finalizado."),
    CANCELED("O chamado foi cancelado.");

    public final String description;

    Status(String description){
        this.description = description;
    }

}
