package com.orchard.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.orchard.Entity.Doctorentity;

@Repository
@CrossOrigin

public interface DoctorinfoRepository  extends CrudRepository<Doctorentity,Integer> {
    public Doctorentity findByName(String name);
}
