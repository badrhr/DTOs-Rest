package org.xproce.demosoap.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.xproce.demosoap.dao.entities.Compte;
import org.xproce.demosoap.dao.repositories.CompteRepository;
import org.xproce.demosoap.service.CompteManager;
import org.xproce.demosoap.service.dtos.CompteDTOADD;
import org.xproce.demosoap.service.dtos.CompteDto;

import java.util.List;

@RestController
public class BanqueServiceRest {

    @Autowired
    CompteManager compteManager;

    @GetMapping("compte/{code}")
    public CompteDto getCompte(@PathVariable Integer code) {
        return compteManager.getCompte(code);
    }

    @GetMapping("comptes")
    public List<CompteDto> getComptes() {
        return compteManager.getComptes();
    }

    @PostMapping("comptes")
    public CompteDto addCompte(@RequestBody CompteDTOADD compteDTOADD) {
        return compteManager.addCompte(compteDTOADD);
    }

}
