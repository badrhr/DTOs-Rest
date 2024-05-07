package org.xproce.demosoap.service;

import org.xproce.demosoap.service.dtos.CompteDTOADD;
import org.xproce.demosoap.service.dtos.CompteDto;

import java.util.List;

public interface CompteManager {

    public CompteDto getCompte(Integer code);
    public List<CompteDto> getComptes();
    public CompteDto addCompte(CompteDTOADD compteDTOADD);
}
