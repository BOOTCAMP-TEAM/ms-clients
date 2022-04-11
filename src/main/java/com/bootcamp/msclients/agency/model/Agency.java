package com.bootcamp.msclients.agency.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class Agency {

    @Id
    private String id;
    private String name;
    private String description;
    private String abbreviation;
    private short registrationStatus;
    private Date insertionDate = new Date();
    private String fk_insertionUser;
    private String insertionTerminal;

}