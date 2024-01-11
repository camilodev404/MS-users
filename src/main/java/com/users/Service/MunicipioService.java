package com.users.Service;

import com.users.Model.Municipio;
import com.users.Repository.MunicipioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MunicipioService {

    @Autowired
    MunicipioRepository municipioRepository;

    public List<Municipio> getAll(){
        return municipioRepository.findAll();
    }

    public Optional<Municipio> getById(int idMunicipio){
        return municipioRepository.findById(idMunicipio);
    }

    public List<Municipio> getByDepto(int idDepto){
        return municipioRepository.findByDepto(idDepto);
    }

}
