package org.xproce.demosoap.service.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.xproce.demosoap.dao.entities.Compte;
import org.xproce.demosoap.service.dtos.CompteDTOADD;
import org.xproce.demosoap.service.dtos.CompteDto;
@Component
public class CompteMapper {

    private ModelMapper modelMapper = new ModelMapper();
    public CompteDto fromCompteToCompteDTO(Compte compte){
        return modelMapper.map(compte, CompteDto.class);
    }

    public Compte fromCompteDTOToCompte(CompteDto compteDto){
        return modelMapper.map(compteDto, Compte.class);
    }

    public CompteDTOADD fromCompteToCompteDTOADD(Compte compte){
        return modelMapper.map(compte, CompteDTOADD.class);
    }

    public Compte fromCompteDTOADDToCompte(CompteDTOADD compteDTOADD){
        return modelMapper.map(compteDTOADD, Compte.class);
    }
}
