package com.uniamerica.casadooleo.model;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Objects;

@Entity
@Table(name ="cleinte")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) /** Banco cria o ID autimatico*/
    private Long id;
    private String nome;
    private Data dataNascimento;
    private Integer cpf;
    private String endereco;
    private String email;
    private Long telefone;
    private Usuario usuario;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    @Override /** Metodo para comparar dados no banco */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return id.equals(cliente.id) && nome.equals(cliente.nome) && dataNascimento.equals(cliente.dataNascimento) && cpf.equals(cliente.cpf) && endereco.equals(cliente.endereco) && email.equals(cliente.email) && telefone.equals(cliente.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, dataNascimento, cpf, endereco, email, telefone);
    }

    @Override /**Verificação da leitura do banco com o mouse em cima*/
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", cpf=" + cpf +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
