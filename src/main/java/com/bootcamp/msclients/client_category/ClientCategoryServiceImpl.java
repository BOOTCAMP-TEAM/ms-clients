package com.bootcamp.msclients.client_category;

import com.bootcamp.msclients.client_category.dto.Delete_ClientCategoryDto;
import com.bootcamp.msclients.client_category.model.ClientCategory;
import com.bootcamp.msclients.client_category.repository.ClientCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ClientCategoryServiceImpl implements ClientCategoryService {

    public final ClientCategoryRepository repository;

    @Override
    public Iterable<ClientCategory> getAll() {
        return repository.findAll();
    }

    @Override
    public ClientCategory create(ClientCategory o) {
        return repository.save(o);
    }

    @Override
    public ResponseEntity<Map<String, Object>> delete(Delete_ClientCategoryDto o) throws Exception {

        Map<String, Object> response = new HashMap<>();

        try {
            if (repository.findById(o.getId()).isEmpty()) {
                response.put("Message","An error occurred while trying to delete the item with id " + o.getId() + ".");
                response.put("Error", "An item with the id " + o.getId() + " was not found.");
                return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
            }

            ClientCategory p = new ClientCategory();
            p.setId(o.getId());
            repository.delete(p);

            response.put("Message","The item with id " + o.getId() + "was successfully deleted.");
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.put("Message","An error occurred while trying to delete the item with id " + o.getId() + ".");
            response.put("Error", e.getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
