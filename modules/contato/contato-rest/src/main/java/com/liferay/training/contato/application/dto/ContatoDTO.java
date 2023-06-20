package com.liferay.training.contato.application.dto;


import com.fasterxml.jackson.annotation.JsonRootName;
import com.liferay.training.contato.model.Contato;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@JsonRootName("contatoDTO")
public class ContatoDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private long groupId;
    private String nome;
    private String telefone;
    private String email;
    private int idade;


    public void toDto(Contato contato) {
        this.groupId = contato.getGroupId();
        this.nome = contato.getNome();
        this.telefone = contato.getTelefone();
        this.email = contato.getEmail();
        this.idade = contato.getIdade();
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}