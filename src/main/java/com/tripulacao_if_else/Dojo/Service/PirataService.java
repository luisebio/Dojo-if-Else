package com.tripulacao_if_else.Dojo.Service;

import com.tripulacao_if_else.Dojo.Models.Pirata;
import com.tripulacao_if_else.Dojo.Repository.PirataRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PirataService {
    private final PirataRepository repository;

    public PirataService(PirataRepository repository) {
        this.repository = repository;
    }

    public Pirata criar(Pirata pirata){
        return repository.save(pirata);
    }
    //public static List<Pirata> listar(){
      //  return repository.findAll();
    //}
    public Pirata buscarPorId(UUID id){
        return repository.findById(id).orElse(null);

    }
}
