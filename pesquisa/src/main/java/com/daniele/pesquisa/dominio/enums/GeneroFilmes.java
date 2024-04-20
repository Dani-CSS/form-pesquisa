package com.daniele.pesquisa.dominio.enums;

import lombok.Getter;
import lombok.Setter;

public enum GeneroFilmes {

    FICCAO("Ficcão");
    ACAO("Ação");
    TERROR("Terror");
    ROMANCE("Romance");
    COMEDIA("Comedia");
    ANIMACAO("Animação");

    @Getter @Setter
    private String descricao;

    GeneroFilmes(String descricao){
        this.descricao = descricao;
    }

}
