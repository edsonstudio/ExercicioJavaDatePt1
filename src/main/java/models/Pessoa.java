package models;

import java.time.LocalDateTime;
import java.util.Date;

public class Pessoa {
    private Long dataNascimento;
    private String nome;

    public Long getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Long dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
