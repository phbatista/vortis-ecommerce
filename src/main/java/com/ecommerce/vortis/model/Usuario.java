package com.ecommerce.vortis.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String nome;

    @NotEmpty
    private String cpf;

    @NotEmpty
    private String telefone;

    @NotEmpty
    private String cep;

    @NotEmpty
    private String rua;

    @NotEmpty
    private String bairro;

    @NotEmpty
    private String cidade;

    @NotEmpty
    private String estado;

    @NotEmpty
    private String numero;

    @Email
    @NotEmpty
    private String email;

    @NotEmpty
    private String senha;

    @NotEmpty
    private String confirmarSenha;

    @NotEmpty
    private String numeroCartao;

    @NotEmpty
    private String bandeira;

    @NotEmpty
    private String nomeCartao;

    @NotEmpty
    private String cvv;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotEmpty String getNome() {
        return nome;
    }

    public void setNome(@NotEmpty String nome) {
        this.nome = nome;
    }

    public @NotEmpty String getCpf() {
        return cpf;
    }

    public void setCpf(@NotEmpty String cpf) {
        this.cpf = cpf;
    }

    public @NotEmpty String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotEmpty String telefone) {
        this.telefone = telefone;
    }

    public @NotEmpty String getCep() {
        return cep;
    }

    public void setCep(@NotEmpty String cep) {
        this.cep = cep;
    }

    public @NotEmpty String getRua() {
        return rua;
    }

    public void setRua(@NotEmpty String rua) {
        this.rua = rua;
    }

    public @NotEmpty String getBairro() {
        return bairro;
    }

    public void setBairro(@NotEmpty String bairro) {
        this.bairro = bairro;
    }

    public @NotEmpty String getCidade() {
        return cidade;
    }

    public void setCidade(@NotEmpty String cidade) {
        this.cidade = cidade;
    }

    public @NotEmpty String getEstado() {
        return estado;
    }

    public void setEstado(@NotEmpty String estado) {
        this.estado = estado;
    }

    public @NotEmpty String getNumero() {
        return numero;
    }

    public void setNumero(@NotEmpty String numero) {
        this.numero = numero;
    }

    public @Email @NotEmpty String getEmail() {
        return email;
    }

    public void setEmail(@Email @NotEmpty String email) {
        this.email = email;
    }

    public @NotEmpty String getSenha() {
        return senha;
    }

    public void setSenha(@NotEmpty String senha) {
        this.senha = senha;
    }

    public @NotEmpty String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(@NotEmpty String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }

    public @NotEmpty String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(@NotEmpty String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public @NotEmpty String getBandeira() {
        return bandeira;
    }

    public void setBandeira(@NotEmpty String bandeira) {
        this.bandeira = bandeira;
    }

    public @NotEmpty String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(@NotEmpty String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    public @NotEmpty String getCvv() {
        return cvv;
    }

    public void setCvv(@NotEmpty String cvv) {
        this.cvv = cvv;
    }
}
