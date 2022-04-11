package com.bootcamp.msclients.agency;

import com.bootcamp.msclients.agency.model.Agency;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agency")
@Tag(name = "Agency", description = "Manage agencies")
@RequiredArgsConstructor
public class AgencyController {

    public final AgencyService service;

    @GetMapping
    public Iterable<Agency> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Agency create(@RequestBody Agency o) {
        return service.create(o);
    }

}
