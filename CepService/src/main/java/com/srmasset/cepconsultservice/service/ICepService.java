package com.srmasset.cepconsultservice.service;

import com.srmasset.cepconsultservice.model.Cep;

import java.util.List;

/**
 * @author Victor Kody
 *
 */
public interface ICepService {
    List<Cep> findByList();
    Cep findByCep(String cep);
}
