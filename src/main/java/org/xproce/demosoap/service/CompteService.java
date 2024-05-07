package org.xproce.demosoap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xproce.demosoap.dao.entities.Compte;
import org.xproce.demosoap.dao.repositories.CompteRepository;
import org.xproce.demosoap.service.dtos.CompteDTOADD;
import org.xproce.demosoap.service.dtos.CompteDto;
import org.xproce.demosoap.service.mappers.CompteMapper;

import java.util.ArrayList;
import java.util.List;
@Service
public class CompteService implements CompteManager{

    @Autowired
    private CompteRepository compteRepository ;
    @Autowired
    CompteMapper compteMapper;
    @Override
    public CompteDto getCompte(Integer code) {
        Compte compte = compteRepository.findById(code).get();
        CompteDto compteDto = compteMapper.fromCompteToCompteDTO(compte);
        return compteDto;

        //return compteMapper.fromCompteToCompteDTO(compteRepository.findById(code).get());
    }

    @Override
    public List<CompteDto> getComptes() {

        List<Compte> comptes = compteRepository.findAll();
        List<CompteDto> compteDtos = new ArrayList<>();
        for(Compte compte: comptes){
            CompteDto compteDto = compteMapper.fromCompteToCompteDTO(compte);
            compteDtos.add(compteDto);
        }
        return compteDtos;
    }

    @Override
    public CompteDto addCompte(CompteDTOADD compteDTOADD) {

        Compte compte = compteMapper.fromCompteDTOADDToCompte(compteDTOADD);
        compte = compteRepository.save(compte) ;
        CompteDto compteDto = compteMapper.fromCompteToCompteDTO(compte);
        return compteDto;
    }
}
