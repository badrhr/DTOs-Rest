package org.xproce.demosoap.service.dtos;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CompteDTOADD {

    private Integer code;
    private double solde;
    private Date dateCreation;
    private String password;
    private String secret ;
}
