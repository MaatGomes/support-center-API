package support_center_API.enums;

public enum Department {

    FINANTIAL("Time responsavel pelo setor Financeiro."),
    LOGISTIC("Time responsavel pelo setor Logistico"),
    APP("Time responsavel pelo aplicativo"),
    WEBSITE("Time resposável pelo portal ou site");

    public final String description;

    Department(String description){
        this.description = description;
    }
}
