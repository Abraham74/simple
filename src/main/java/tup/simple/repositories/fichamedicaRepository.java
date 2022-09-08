package tup.simple.repositories;

import org.springframework.data.repository.CrudRepository;

import tup.simple.models.fichamedica;

public interface fichamedicaRepository extends CrudRepository<fichamedica, Long> {
    
}