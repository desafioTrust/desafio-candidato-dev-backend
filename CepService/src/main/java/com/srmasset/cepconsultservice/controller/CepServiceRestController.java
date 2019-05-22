package com.srmasset.cepconsultservice.controller;

import com.srmasset.cepconsultservice.model.Cep;
import com.srmasset.cepconsultservice.service.CepAPI;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor Kody
 *
 */
@RestController
public class CepServiceRestController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private CepAPI cepAPI;

    @RequestMapping("service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName){
        return this.discoveryClient.getInstances(applicationName);
    }

    /**
     * Endpoint para recuperar as informações de um cep passando o numero na URL
     * @param cep
     * @return cep, estado, cidade, bairro, logradouro
     */
    @GetMapping(
            path = "/get-cep/{cep}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getCep(@PathVariable String cep){
        if(!cep.isEmpty()){
            Cep returnCep = cepAPI.getCepById(cep);
            logger.info("Found cep: " + returnCep.toString());
            return ResponseEntity.ok(returnCep );
        }
        else{
            logger.error("Cep"+ cep +"not found");
            return ResponseEntity.ok("Not Found");
        }

    }

    /**
     * Endpoint para recuperar as informações de uma lista de cep enviado no body da requisição.
     * @param body
     * @return lista de (cep, estado, cidade, bairro, logradouro)
     */
    @PostMapping(
            path = "/get-cep",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getCepList(@RequestBody String body){
        if(!body.isEmpty()){
            try {
                JSONArray cepJsonArray = new JSONArray(body);
                List<String> cepList = new ArrayList<>();
                for(int i = 0; i < cepJsonArray.length(); i ++){
                    cepList.add(cepJsonArray.get(i).toString());
                }
                List<Cep>returnCep = cepAPI.getCepByIdList(cepList);
                return ResponseEntity.ok(returnCep );
            } catch (JSONException e) {
                logger.error("Error while building JsonObject: " + e);
                e.printStackTrace();
                return ResponseEntity.ok("Error while consulting API");
            }
        }
        else{
            return ResponseEntity.ok("Not Found");
        }

    }

}
