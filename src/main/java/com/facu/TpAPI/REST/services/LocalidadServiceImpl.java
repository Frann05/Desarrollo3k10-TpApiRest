package com.facu.TpAPI.REST.services;

import com.facu.TpAPI.REST.entities.Localidad;
import com.facu.TpAPI.REST.repositories.BaseRepository;
import com.facu.TpAPI.REST.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{
    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
