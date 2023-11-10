package API.API.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import API.API.models.Usuario;
import API.API.services.Servicio_Usuario;

@RestController
@RequestMapping("/api/usuarios")
public class Controlador_Usuario {
	@Autowired
	Servicio_Usuario serv_usuario;
	@GetMapping("/get")
	public List<Usuario> SelectAllUsuario(){
		return serv_usuario.SelectAllUsuario();
	}
}
