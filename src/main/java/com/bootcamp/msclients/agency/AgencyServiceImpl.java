package com.bootcamp.msclients.agency;

import com.bootcamp.msclients.agency.model.Agency;
import com.bootcamp.msclients.agency.repository.AgencyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AgencyServiceImpl implements AgencyService {

    public final AgencyRepository repository;

    @Override
    public Iterable<Agency> getAll() {
        return repository.findAll();
    }

    @Override
    public Agency create(Agency o) {
        return repository.save(o);
    }
}
