package br.com.farchettiensis.gestaofuncionarios;

@SuppressWarnings("all")
public class FuncionarioHorista extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas;
    private int horasExtras;
    private int faltas;

    public FuncionarioHorista(String nome, String cpfCnpj, int horasTrabalhadas, int horasExtras, int faltas, double valorHora) {
        super(nome, cpfCnpj, TipoFuncionario.HORISTA);
        this.horasTrabalhadas = horasTrabalhadas;
        this.horasExtras = horasExtras;
        this.faltas = faltas;
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
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
        double salarioBase = horasTrabalhadas * valorHora;

        double valorHorasExtras = 0;
        if (horasExtras > 0) {
            if (horasExtras <= 2) {
                valorHorasExtras = horasExtras * valorHora * 1.7;
            } else {
                valorHorasExtras = 2 * valorHora * 1.7;
                valorHorasExtras += (horasExtras - 2) * valorHora * 2;
            }
        }

        double valorDia = valorHora * 8;
        double deducoesFaltas = faltas * valorDia * 2;

        return salarioBase + valorHorasExtras - deducoesFaltas;
    }
}
