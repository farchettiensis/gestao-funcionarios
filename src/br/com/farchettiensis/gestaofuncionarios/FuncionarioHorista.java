package br.com.farchettiensis.gestaofuncionarios;

@SuppressWarnings("all")
public class FuncionarioHorista extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas;
    private int horasExtras;
    private int faltas;

    public FuncionarioHorista(String nome, String cpfCnpj, double salarioBase, int horasTrabalhadas, int horasExtras, int faltas) {
        super(nome, cpfCnpj, salarioBase, TipoFuncionario.HORISTA);
        this.horasTrabalhadas = horasTrabalhadas;
        this.horasExtras = horasExtras;
        this.faltas = faltas;
    }

    public FuncionarioHorista(String nome, String cpfCnpj, double salarioBase, int horasTrabalhadas, int horasExtras, int faltas, double valorHora) {
        super(nome, cpfCnpj, salarioBase, TipoFuncionario.HORISTA);
        this.horasTrabalhadas = horasTrabalhadas;
        this.horasExtras = horasExtras;
        this.faltas = faltas;
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
        int horasExtras = horasTrabalhadas - 240;

        if (horasExtras > 0) {
            double valorHoraExtraPrimeiras = valorHora * 1.7;
            double valorHoraExtraDemais = valorHora * 2;
            double valorHorasExtras = 0;

            if (horasExtras <= 2) {
                valorHorasExtras = horasExtras * valorHoraExtraPrimeiras;
            } else {
                valorHorasExtras = 2 * valorHoraExtraPrimeiras + (horasExtras - 2) * valorHoraExtraDemais;
            }

            salarioBase += valorHorasExtras;
        }

        double valorDia = valorHora * 8;
        salarioBase -= faltas * valorDia * 2;

        return salarioBase;
    }

}
