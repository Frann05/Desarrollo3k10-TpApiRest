package com.facu.TpAPI.REST.repositories;

import com.facu.TpAPI.REST.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long> {
}
