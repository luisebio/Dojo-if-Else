package com.tripulacao_if_else.Dojo.dto;


import com.tripulacao_if_else.Dojo.Models.Racas;
import com.tripulacao_if_else.Dojo.Models.Status;

import java.util.UUID;

public record PirataDto(UUID id, String nome, Racas raca, Status status){

}
