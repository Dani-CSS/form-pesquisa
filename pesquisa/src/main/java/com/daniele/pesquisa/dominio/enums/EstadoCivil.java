package com.daniele.pesquisa.dominio.enums;

import lombok.Getter;

public enum EstadoCivil {

    CASADO("Casado(a)");
    SOLTEIRO("Solteiro(a)");
    VIUVO("Viuvo(s)");
    DIVORCIADO("Divorciado(a)");

    @Getter
    private String descricao;

    EstadoCivil(String descricao){
        this.descricao = descricao;
    }



}
