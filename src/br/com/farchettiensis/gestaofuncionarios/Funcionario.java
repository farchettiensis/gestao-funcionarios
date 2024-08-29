package br.com.farchettiensis.gestaofuncionarios;

public abstract class Funcionario {
    private final String nome;
    private final String cpfCnpj;
    private final TipoFuncionario tipo;

    public Funcionario(String nome, String cpfCnpj, TipoFuncionario tipo) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public String getDescricaoTipo() {
        return tipo.getDescricao();
    }

    public TipoFuncionario getTipo() {
        return tipo;
    }

    public abstract double calcularSalario();
}
