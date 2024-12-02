package model;

import java.util.List;

public class secretaria {
    // Informações pessoais
    private String nome;
    private String email;
    private String telefone;
    private int idade;
    private String endereco;

    // Informações profissionais
    private int id;
    private String cargo;
    private String setor;
    private int cargaHoraria;

    //tarefas desempenhadas pelo funcionário
    private List<String> funcoes;

    // Getters e Setters para Informações Pessoais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Getters e Setters para Informações Profissionais
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Getters e Setters para Funções
    public List<String> getFuncoes() {
        return funcoes;
    }

    public void setFuncoes(List<String> funcoes) {
        this.funcoes = funcoes;
    }
}
