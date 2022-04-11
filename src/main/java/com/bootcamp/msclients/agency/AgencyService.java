package com.bootcamp.msclients.agency;

import com.bootcamp.msclients.agency.model.Agency;

public interface AgencyService {

    public Iterable<Agency> getAll();
    public Agency create(Agency o);

}