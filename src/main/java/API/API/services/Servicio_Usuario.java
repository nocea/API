package API.API.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import API.API.models.Usuario;
import API.API.repositories.Repositorio_Usuario;

@Service
public class Servicio_Usuario {
	@Autowired
	Repositorio_Usuario repo_usuario;
	public List<Usuario> SelectAllUsuario(){
		return (List<Usuario>) repo_usuario.findAll();
	}
}
