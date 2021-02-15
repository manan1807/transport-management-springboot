package com.gl.trans.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gl.trans.model.Shift;

@Repository
public interface ShiftRepository extends CrudRepository<Shift, Integer>{

}
