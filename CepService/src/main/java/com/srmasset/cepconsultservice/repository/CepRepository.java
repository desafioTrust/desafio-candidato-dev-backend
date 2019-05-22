package com.srmasset.cepconsultservice.repository;

import com.srmasset.cepconsultservice.model.Cep;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Victor Kody
 *
 */
@Repository
public interface CepRepository extends CrudRepository <Cep, Integer> {
    //TODO Implementar sistema de consulta no cache e persistencia
}
