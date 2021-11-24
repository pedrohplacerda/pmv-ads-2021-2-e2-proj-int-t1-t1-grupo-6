package puc.minas.demo.repository;

import org.springframework.data.repository.CrudRepository;
import puc.minas.demo.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Double> {
}
