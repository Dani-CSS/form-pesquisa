package com.daniele.pesquisa.servico;

import com.daniele.pesquisa.dominio.dto.UsuarioCadastroDto;
import com.daniele.pesquisa.dominio.dto.UsuarioDto;
import br.com.gva.pesquisa.dominio.modelo.Usuario;

public interface UsusarioServico {

    UsuarioDto salvar(UsuarioCadastroDto dto);

    UsuarioDto atualizar(UsuarioCadastroDto dto);

    void deletar(Long id);

    UsuarioDto procurarPeloId(Long id);

}
