package com.orchard.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.orchard.Entity.Patiententity;

@Repository

public interface PatientinfoRepository extends CrudRepository<Patiententity,Integer> {

}