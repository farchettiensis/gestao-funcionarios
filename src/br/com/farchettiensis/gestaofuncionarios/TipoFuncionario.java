package br.com.farchettiensis.gestaofuncionarios;

public enum TipoFuncionario {
    HORISTA("Horista"),
    MENSALISTA("Mensalista");

    private final String descricao;

    TipoFuncionario(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
