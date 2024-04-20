package com.daniele.pesquisa.servico.impl;

import org.springframework.stereotype.Service;

import com.daniele.pesquisa.dominio.dto.UsuarioCadastroDto;
import com.daniele.pesquisa.dominio.dto.UsuarioDto;
import com.daniele.pesquisa.dominio.modelo.Usuario;
import com.daniele.pesquisa.repositorio.UsuarioRepositorio;
import com.daniele.pesquisa.servico.UsusarioServico;

import lombok.Getter;


@Service
public class UsuarioServicoImpl implements UsusarioServico{

    @Getter
    private final UsuarioRepositorio usuarioRepositorio;

    public UsuarioServicoImpl(UsuarioRepositorio usuarioRepositorio){
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @Override
    public UsuarioDto salvar(UsuarioCadastroDto dto{

        getUsuarioRepositorio().save(converterDtoEmEntidade(dto));

        return null;
        
    }


    @Override
    public UsuarioDto atualizar(UsuarioCadastroDto usuario){

        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");

    }

    @Override
    public UsuarioDto deletar(Long id){
        throw new UnsupportedOperationException("Unimplemented method 'deletar'");
    }

    @Override
    public UsuarioDto procurarPeloId(Long id){
        throw new UnsupportedOperationException("Unimplemented method 'procurarPeloId'");
    }

    private Usuario conveterDtoEmEntidade(UsuarioCadastroDto dto) {
        return Usuario.builder()
        .nome(dto.getNome())
        .senha(dto.getSenha())
        .build();
    }

    private UsuarioDto converterEntidadeEmDto(Usuario usuario){
        return UsuarioDto.builder()
        .id(usuario.getId())
        .nome(usuario.getNome)
        .build();
    }

}
