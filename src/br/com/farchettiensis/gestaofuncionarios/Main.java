package br.com.farchettiensis.gestaofuncionarios;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Instituto Jamil", "42264699000147");

        FuncionarioHorista horista = new FuncionarioHorista("Charly Garcia", "29611736045", 2400.00, 220, 0, 1);
        FuncionarioMensalista mensalista = new FuncionarioMensalista("Miguel Abuelo", "78186089071", 3000.00, 5000.00);

        empresa.adicionarFuncionario(horista);
        empresa.adicionarFuncionario(mensalista);

        System.out.printf("Funcionário: %s.%nTipo: %s.%nSalário: %.2f.%n", horista.getNome(), horista.getDescricaoTipo(), horista.calcularSalario());
        System.out.println();
        System.out.printf("Funcionário: %s.%nTipo: %s.%nSalário: %.2f.%n", mensalista.getNome(), mensalista.getDescricaoTipo(), mensalista.calcularSalario());
    }
}

