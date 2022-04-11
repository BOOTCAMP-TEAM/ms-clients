package com.bootcamp.msclients.client_category;

import com.bootcamp.msclients.client_category.dto.Delete_ClientCategoryDto;
import com.bootcamp.msclients.client_category.model.ClientCategory;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface ClientCategoryService {

    public Iterable<ClientCategory> getAll();
    public ClientCategory create(ClientCategory o);
    public ResponseEntity<Map<String, Object>> delete(Delete_ClientCategoryDto o) throws Exception;

}
