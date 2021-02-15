package com.gl.trans.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gl.trans.model.CabDriver;

@Repository
public interface CabDriverRepository extends CrudRepository<CabDriver, Integer> {

}
