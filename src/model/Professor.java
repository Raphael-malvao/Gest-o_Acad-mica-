package model;

import java.util.List;

public class Professor {
    // Informações pessoais
    private String nome;
    private String email;
    private String telefone;
    private int idade;
    private String endereco;

    // Informações profissionais
    private int id;
    private String formacao;
    private String areaDeAtuacao;
    private int cargaHoraria;

    // Salas onde leciona
    private List<String> salasLeciona;

    //Matérias que leciona
    private List<Materia> materias;  // Usando o enum para matérias

    // Métodos abaixo *_*

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

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getAreaDeAtuacao() {
        return areaDeAtuacao;
    }

    public void setAreaDeAtuacao(String areaDeAtuacao) {
        this.areaDeAtuacao = areaDeAtuacao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Getters e Setters para Salas e Matérias
    public List<String> getSalasLeciona() {
        return salasLeciona;
    }

    public void setSalasLeciona(List<String> salasLeciona) {
        this.salasLeciona = salasLeciona;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    //Materias
    public enum Materia {
        LINGUA_PORTUGUESA,
        MATEMATICA,
        CIENCIAS,
        HISTORIA,
        GEOGRAFIA,
        ARTES,
        EDUCACAO_FISICA,
        ENSINO_RELIGIOSO,
        INGLES,
        TECNOLOGIA,
        MUSICA,
        FILOSOFIA,
        SOCIOLOGIA,
        LINGUA_ESTRANGEIRA,
        EDUCACAO_DIGITAL;
    }

}
