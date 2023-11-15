package API.API.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import API.API.models.Acceso;
import API.API.models.Usuario;
import API.API.repositories.Repositorio_Usuario;
import API.API.repositories.Repositorio_Acceso;

@Service
public class Servicios {
	@Autowired
	Repositorio_Usuario repo_usuario;
	public List<Usuario> SelectAllUsuario(){
		return (List<Usuario>) repo_usuario.findAll();
	}
	@Autowired
	Repositorio_Acceso repo_acceso;
	public List<Acceso> SelectAllAcceso(){
		return (List<Acceso>) repo_acceso.findAll();
	}
}
