package org.xproce.demosoap.web;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xproce.demosoap.dao.entities.Compte;
import org.xproce.demosoap.dao.repositories.CompteRepository;

import java.util.List;

@AllArgsConstructor
//@WebService(serviceName = "BanqueWS")
public class CompteService {
/*
    CompteRepository compteRepository ;

    @WebMethod(operationName = "convert")
    public double conversion(@WebParam double montant){
        return montant * 10.151 ;
    }

    @WebMethod
    public Compte getCompte(@WebParam Integer code){
        return compteRepository.findById(code).get();
    }
    @WebMethod
    public List<Compte> getComptes(){
        return compteRepository.findAll();
    }*/
}
