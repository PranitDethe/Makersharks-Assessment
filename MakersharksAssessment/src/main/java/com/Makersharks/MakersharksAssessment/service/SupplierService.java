package com.Makersharks.MakersharksAssessment.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.Makersharks.MakersharksAssessment.model.Supplier;
import com.Makersharks.MakersharksAssessment.repository.SupplierRepository;


@Service
public class SupplierService {

    private final SupplierRepository supplierRepository;

    @Autowired
    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    public Page<Supplier> searchSuppliers(String location, String natureOfBusiness, String manufacturingProcess, Pageable pageable) {
        return supplierRepository.findSuppliers(location, natureOfBusiness, manufacturingProcess, pageable);
    }
}


