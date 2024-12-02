package model;

import java.util.List;

    public class Aluno {
        // Informações pessoais
        private String nome;
        private String email;
        private String telefone;
        private int idade;
        private String endereco;

        // Informações escolares
        private int id;
        private String turma;
        private String serie;
        private List<String> disciplinas;
        private double mediaGeral;

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

        // Getters e Setters para Informações Escolares
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTurma() {
            return turma;
        }

        public void setTurma(String turma) {
            this.turma = turma;
        }

        public String getSerie() {
            return serie;
        }

        public void setSerie(String serie) {
            this.serie = serie;
        }

        public List<String> getDisciplinas() {
            return disciplinas;
        }

        public void setDisciplinas(List<String> disciplinas) {
            this.disciplinas = disciplinas;
        }

        public double getMediaGeral() {
            return mediaGeral;
        }

        public void setMediaGeral(double mediaGeral) {
            this.mediaGeral = mediaGeral;
        }

        public static void main(String[] args) {
            System.out.println("Esta funcionando");
        }
    }
