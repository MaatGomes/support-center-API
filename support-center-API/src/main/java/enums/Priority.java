package enums;

public enum Priority {

    LOW("Chamado de baixa prioridade."),
    MEDIUM("Chamado de prioridade média."),
    HIGH("Chamado de alta prioridade.");

    public final String description;

    Priority(String description){
        this.description = description;

    }
}
