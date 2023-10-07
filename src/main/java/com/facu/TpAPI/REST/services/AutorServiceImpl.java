package com.facu.TpAPI.REST.services;

import com.facu.TpAPI.REST.entities.Autor;
import com.facu.TpAPI.REST.repositories.AutorRepository;
import com.facu.TpAPI.REST.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
