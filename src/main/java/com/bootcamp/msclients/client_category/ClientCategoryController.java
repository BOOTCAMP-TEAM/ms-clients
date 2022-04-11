package com.bootcamp.msclients.client_category;

import com.bootcamp.msclients.client_category.dto.Delete_ClientCategoryDto;
import com.bootcamp.msclients.client_category.model.ClientCategory;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/client_category")
@Tag(name = "Client Category", description = "Manage client categories")
@RequiredArgsConstructor
public class ClientCategoryController {

    public final ClientCategoryService service;

    @GetMapping
    public Iterable<ClientCategory> getAll() {
        return service.getAll();
    }

    @PostMapping
    public ClientCategory create(@RequestBody ClientCategory o) {
        return service.create(o);
    }

    @DeleteMapping
    public ResponseEntity<Map<String, Object>> delete(@RequestBody Delete_ClientCategoryDto o) throws Exception { return service.delete(o);}

}