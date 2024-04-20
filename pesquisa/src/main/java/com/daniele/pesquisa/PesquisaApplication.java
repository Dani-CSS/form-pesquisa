package com.daniele.pesquisa;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.daniele.pesquisa.dominio.modelo.Usuario;
import com.daniele.pesquisa.repositorio.UsuarioRepositorio;
import com.daniele.pesquisa.servico.impl.UsuarioServicoImpl;

import lombok.Getter;

@SpringBootApplication
public class PesquisaApplication implements CommandLineRunner {

	Logger log = LoggerFactory.getLogger(this.getClass());

	@Getter
	private final UsuarioServico UsuarioServico;

	@Getter
	private final UsuarioRepositorio usuarioRepositorio;

	public PesquisaApplication(UsuarioServico UsuarioServico, UsuarioRepositorio usuarioRepositorio){
		this.UsuarioServico = usuarioServico;
		this.usuarioRepositorio = usuarioRepositorio;
	}

	public static void main(String[] args) {
		SpringApplication.run(PesquisaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		Usuario usuario = Usuario.builder();
		.nome("Daniele Cardoso")
		.senha("1234")
		.build();

		log.info("Usuário criado: " + getUsuarioRepositorio().save(usuario).toString());
		//log.info("Usuario criado pelo serviço " + getUsuarioServico().salvar(usuario).toString());
	}
}
