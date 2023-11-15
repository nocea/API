package API.API.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import API.API.models.Acceso;
import API.API.models.Usuario;
import API.API.services.Servicios;

@RestController
@RequestMapping("/api")
public class Controlador {
	@Autowired
	Servicios serv_usuario;
	@GetMapping("/usuarios")
	public List<Usuario> SelectAllUsuario(){
		return serv_usuario.SelectAllUsuario();
	}
	@Autowired
	Servicios serv_acceso;
	@GetMapping("/accesos")
	public List<Acceso> SelectAllAcceso(){
		return serv_acceso.SelectAllAcceso();
	}
}
