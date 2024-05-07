package org.xproce.demosoap.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.demosoap.dao.entities.Compte;

import javax.annotation.processing.Completion;

public interface CompteRepository extends JpaRepository<Compte, Integer> {
}
