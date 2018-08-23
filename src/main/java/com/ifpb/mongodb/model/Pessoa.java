package com.ifpb.mongodb.model;

import org.bson.Document;

public class Pessoa {

    private String cpf;
    private String nome;
    private int idade;

    public Pessoa(String cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public Document toDocument(){
        return new Document("cpf", cpf)
                .append("nome", nome)
                .append("idade", idade);
    }

    public Pessoa (Document document){
        cpf = document.getString("cpf");
        nome = document.getString("nome");
        idade = document.getInteger("idade");
    }

}
