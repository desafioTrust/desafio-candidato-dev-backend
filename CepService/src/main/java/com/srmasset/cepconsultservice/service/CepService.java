package com.srmasset.cepconsultservice.service;

/**
 * @author Victor Kody
 * Serviço responsavel por fazer o controle se deve verificar no banco de cache Redis, caso não ache a informação,
 * realizara uma conulsta no MongoDb e se mesmo assim não achar irá retornar uma lista vazia para verificar na API se é um CEP valido.
 */
public class CepService {
    //TODO Implementar sistema de consulta no cache e persistencia
}
