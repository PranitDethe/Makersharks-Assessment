package com.Makersharks.MakersharksAssessment.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import com.Makersharks.MakersharksAssessment.model.Supplier;
import com.Makersharks.MakersharksAssessment.service.SupplierService;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    private final SupplierService supplierService;

    @Autowired
    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @PostMapping("/query")
    public Page<Supplier> querySuppliers(@RequestParam String location,
                                         @RequestParam String natureOfBusiness,
                                         @RequestParam String manufacturingProcess,
                                         @RequestParam(defaultValue = "0") int page,
                                         @RequestParam(defaultValue = "10") int size) {
        Pageable pageable = PageRequest.of(page, size);
        return supplierService.searchSuppliers(location, natureOfBusiness, manufacturingProcess, pageable);
    }
}
