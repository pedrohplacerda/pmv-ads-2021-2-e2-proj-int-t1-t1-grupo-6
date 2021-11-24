package puc.minas.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import puc.minas.demo.model.EstoqueModel;

@Repository
public interface EstoqueRepository extends CrudRepository<EstoqueModel, Double> {
}
