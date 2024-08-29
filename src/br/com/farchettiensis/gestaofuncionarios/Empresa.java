package br.com.farchettiensis.gestaofuncionarios;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class Empresa {
    private String nome;
    private String cnpj;
    private List<Funcionario> funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public Funcionario buscarFuncionarioPorCpf(String cpfCnpj) {
        for (Funcionario f : funcionarios) {
            if (f.getCpfCnpj().equals(cpfCnpj)) {
                return f;
            }
        }
        return null;
    }
}
