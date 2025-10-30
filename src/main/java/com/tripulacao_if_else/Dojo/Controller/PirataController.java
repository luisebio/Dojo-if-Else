package com.tripulacao_if_else.Dojo.Controller;

import com.tripulacao_if_else.Dojo.Models.Pirata;
import com.tripulacao_if_else.Dojo.Repository.PirataRepository;
import com.tripulacao_if_else.Dojo.Service.PirataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/piratas")
public class PirataController {
    @Autowired
    private PirataRepository repository;

    @PostMapping
    public ResponseEntity<Pirata> CriarPirata(@RequestBody Pirata pirata){
        repository.save(pirata);
        return new ResponseEntity<>(pirata, HttpStatus.CREATED);
    }
}
