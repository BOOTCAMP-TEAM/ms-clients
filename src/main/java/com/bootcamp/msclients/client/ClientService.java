package com.bootcamp.msclients.client;

import com.bootcamp.msclients.client.model.Client;

public interface ClientService {

    public Iterable<Client> getAll();
    public Client create(Client o);

}
