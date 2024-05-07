package org.xproce.demosoap.service.dtos;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CompteDto {
    private double solde;
    private Date dateCreation;
}
