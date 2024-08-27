package br.com.farchettiensis.gestaofuncionarios;

public abstract class Funcionario {
    private final String nome;
    private final String cpfCnpj;
    private double salarioBase;
    private final TipoFuncionario tipo;

    public Funcionario(String nome, String cpfCnpj, double salarioBase, TipoFuncionario tipo) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.salarioBase = salarioBase;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getDescricaoTipo() {
        return tipo.getDescricao();
    }

    public TipoFuncionario getTipo() {
        return tipo;
    }

    public abstract double calcularSalario();
}
