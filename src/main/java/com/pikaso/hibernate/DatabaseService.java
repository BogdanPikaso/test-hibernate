package com.pikaso.hibernate;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DatabaseService {

    private KeyRepository keyRepository;
    private CompanyRepository companyRepository;

    void run() {
        KeyEntity keyEntity = new KeyEntity();
        keyEntity.setName("key");
        CompanyEntity companyEntity = new CompanyEntity();
        companyEntity.setName("ARX");
        keyEntity.setCompany(companyEntity);
        companyRepository.save(companyEntity);
        keyRepository.save(keyEntity);
    }
}
