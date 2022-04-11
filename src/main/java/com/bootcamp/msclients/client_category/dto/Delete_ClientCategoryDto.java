package com.bootcamp.msclients.client_category.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Delete_ClientCategoryDto {
    @Id
    private String id;
}
