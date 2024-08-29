package br.com.farchettiensis.gestaofuncionarios;

public class FuncionarioMensalista extends Funcionario {
    private double bonusAnual;
    private double salarioBase;

    public FuncionarioMensalista(String nome, String cpfCnpj, double salarioBase, double bonusAnual) {
        super(nome, cpfCnpj, TipoFuncionario.MENSALISTA);
        this.bonusAnual = bonusAnual;
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    @Override
    public double calcularSalario() {
        if (this.bonusAnual > 0) {
            return getSalarioBase() + (this.bonusAnual / 12);
        }
        return getSalarioBase();
    }

    public double calcularSalarioAnual() {
        return (getSalarioBase() * 12) + bonusAnual;
    }
}

