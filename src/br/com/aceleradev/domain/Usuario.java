package br.com.aceleradev.domain;

import br.com.aceleradev.exceptions.LoginInvalidoException;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import static br.com.aceleradev.utils.MensagemException.LOGIN_MENOR_DE_TRES_CARACTERES;

public class Usuario {

    private String nome;
    private String login;
    private String cpf;
    private LocalDate dataNascimento;

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Usuario(String nome, String login, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        setLogin(login);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if(loginInvalido(login)){
            throw new LoginInvalidoException(LOGIN_MENOR_DE_TRES_CARACTERES);
        }

        this.login = login;

    }

    private boolean loginInvalido(String login) {
        return login.length() <= 3;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s; Login: %s; CPF: %s; Data Nascimento: %s; Idade: %d anos.",
                    this.nome,
                    this.login,
                    this.cpf,
                    this.dataNascimento.toString(),
                    this.getIdade()
                );

    }

    public int getIdade(){
        Period periodo = Period.between(this.getDataNascimento(), LocalDate.now());
        return periodo.getYears();
    }

}
