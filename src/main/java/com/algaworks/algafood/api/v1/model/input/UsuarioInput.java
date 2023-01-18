package com.algaworks.algafood.api.v1.model.input;

import lombok.Getter;
import lombok.Setter;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Setter
@Getter
public class UsuarioInput {

	@NotBlank
	private String nome;

	@NotBlank
	@Email
	private String email;
	
}