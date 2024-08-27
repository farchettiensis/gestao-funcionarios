package br.com.farchettiensis.gestaofuncionarios;

public class FuncionarioHorista extends Funcionario {
    private int horasTrabalhadas;
    private int horasExtras;
    private int faltas;

    public FuncionarioHorista(String nome, String cpfCnpj, double salarioBase, int horasTrabalhadas, int horasExtras, int faltas) {
        super(nome, cpfCnpj, salarioBase, TipoFuncionario.HORISTA);
        this.horasTrabalhadas = horasTrabalhadas;
        this.horasExtras = horasExtras;
        this.faltas = faltas;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    @Override
    public double calcularSalario() {
        return 0;
    }

}
