package com.daniele.pesquisa.dominio.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UsuarioDto {

    private Long id;
    private String nome;

}
