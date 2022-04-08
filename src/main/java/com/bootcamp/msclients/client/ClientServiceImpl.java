package com.bootcamp.msclients.client;

import com.bootcamp.msclients.client.model.Client;
import com.bootcamp.msclients.client.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    public final ClientRepository repository;

    @Override
    public Iterable<Client> getAll() {
        return repository.findAll();
    }

    @Override
    public Client create(Client client) {
        return repository.save(client);
    }
}
