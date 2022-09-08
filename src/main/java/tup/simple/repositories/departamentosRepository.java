package tup.simple.repositories;

import org.springframework.data.repository.CrudRepository;

import tup.simple.models.departamentos;

public interface departamentosRepository extends CrudRepository<departamentos, Long> {
    
}

