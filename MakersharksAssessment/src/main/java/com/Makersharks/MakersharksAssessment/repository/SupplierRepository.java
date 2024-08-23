package com.Makersharks.MakersharksAssessment.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Makersharks.MakersharksAssessment.model.Supplier;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    @Query("SELECT s FROM Supplier s WHERE s.location = :location AND s.natureOfBusiness = :natureOfBusiness AND :manufacturingProcess MEMBER OF s.manufacturingProcesses")
    Page<Supplier> findSuppliers(@Param("location") String location,
                                 @Param("natureOfBusiness") String natureOfBusiness,
                                 @Param("manufacturingProcess") String manufacturingProcess,
                                 Pageable pageable);
}
