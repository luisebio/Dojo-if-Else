package com.tripulacao_if_else.Dojo.Repository;

import com.tripulacao_if_else.Dojo.Models.Pirata;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface PirataRepository extends JpaRepository<Pirata, UUID> {


}
