package com.facu.TpAPI.REST.repositories;

import com.facu.TpAPI.REST.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {

}

