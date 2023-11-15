package API.API.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import API.API.models.Acceso;

@Repository
public interface Repositorio_Acceso extends CrudRepository<Acceso,Long>{
}