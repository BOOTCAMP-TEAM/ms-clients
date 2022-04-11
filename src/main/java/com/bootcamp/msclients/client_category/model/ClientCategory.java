package com.bootcamp.msclients.client_category.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class ClientCategory {

    @Id
    private String id;
    private String name;
    private String description;
    private String abbreviation;
    private int minLength;
    private int maxLength;
    private short registrationStatus;
    private Date insertionDate = new Date();
    private String fk_insertionUser;
    private String insertionTerminal;

}