package com.bootcamp.msclients.client.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Client {

    @Id
    private String id;
    private String name;
    private String documentNumber;
    private String documentType;

}
