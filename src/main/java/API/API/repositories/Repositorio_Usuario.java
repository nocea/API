package API.API.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import API.API.models.Usuario;

@Repository
public interface Repositorio_Usuario extends CrudRepository<Usuario,Long>{
}
