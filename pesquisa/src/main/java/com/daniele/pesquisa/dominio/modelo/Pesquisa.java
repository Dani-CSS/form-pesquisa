package com.daniele.pesquisa.dominio.modelo;

import com.daniele.pesquisa.dominio.enums.GeneroFilmes;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import lombok.EqualsAndHashCode;
import lombok.Getter;

public class Pesquisa {

    @EqualsAndHashCode.Include
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType = IDENTITY)
    private Long id;

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String sexo;

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    private EstadoCivil estadoCivil;

    @Getter
    @Setter
    @ElementCollection(targetClass = GeneroFilmes.class, fetch = FetchType.LAZY)
    @JoinTable(name = "pesquisa_genero_filme_relation", joinColumns = 
        @JoinColumn(name = "pesquisa_id")
    
    )
    @Column(name = "tipo_genero", nullable = false)
    private List<GeneroFilmes> generosFilmes;

    

}
