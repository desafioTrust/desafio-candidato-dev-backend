package com.srmasset.cepconsultservice.service;

import com.srmasset.cepconsultservice.model.Cep;
import com.srmasset.cepconsultservice.properties.CepApiProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor Kody
 * Servico responsavel por fazer a consulta na Api de CEP,
 */
@Service
public class CepAPI {
    @Autowired
    private CepApiProperties cepApiProperties;

    RestTemplate restTemplate = new RestTemplate();
    StringBuilder urlBuilder = new StringBuilder();

    /**
     * metodo que faz consulta na API e monta 1 CEP de retorno
     * @param cep
     * @return Cep
     */
    public Cep getCepById(String cep){
        urlBuilder.append(cepApiProperties.getBaseUrl());
        urlBuilder.append(cep);
        ResponseEntity<Cep> responseEntity = restTemplate.getForEntity(urlBuilder.toString(),Cep.class);
        responseEntity.getBody().setCep(cep);
        return responseEntity.getBody();
    }

    /**
     * Metodo que faz a consulta multiplas vezes de acordo com a lista de ceps.
     *
     * @param cep
     * @return Lista de Ceps
     */
    public List<Cep> getCepByIdList(List<String> cep){
        List<Cep> returnList = new ArrayList<>();
        urlBuilder.append(cepApiProperties.getBaseUrl());
        for(String cepId : cep) {
            ResponseEntity<Cep> responseEntity = restTemplate.getForEntity(urlBuilder.toString() + cepId, Cep.class);
            responseEntity.getBody().setCep(cepId);
            returnList.add(responseEntity.getBody());
        }
        return returnList;
    }
}
