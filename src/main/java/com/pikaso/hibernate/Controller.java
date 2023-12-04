package com.pikaso.hibernate;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class Controller {

    private KeyRepository keyRepository;
    private CompanyRepository companyRepository;

    @GetMapping("/keys")
    List<KeyEntity> getKeys() {
        return keyRepository.findAll();
    }

    @GetMapping("/companies")
    List<CompanyEntity> getCompanies() {
        return companyRepository.findAll();
    }
}
