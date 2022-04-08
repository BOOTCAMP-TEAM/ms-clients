package com.bootcamp.msclients.client;

import com.bootcamp.msclients.client.model.Client;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
@Tag(name = "Client", description = "Manage clients")
@RequiredArgsConstructor
public class ClientController {

    public final ClientService service;

    @GetMapping
    public Iterable<Client> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Client create(@RequestBody Client client) {
        return service.create(client);
    }

}
