package com.example.demo.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum MensagemEnum {


    SUCESSO("Registro salvo ou atualizo com sucesso");

    @Getter
    private String value;

}
