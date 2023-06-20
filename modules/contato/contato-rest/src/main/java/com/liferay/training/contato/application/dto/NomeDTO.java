package com.liferay.training.contato.application.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NomeDTO {
    private String nome;

    public String getNome() {
        return this.nome;
    }

}