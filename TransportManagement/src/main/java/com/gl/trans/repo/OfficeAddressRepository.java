package com.gl.trans.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gl.trans.model.OfficeAddress;;
@Repository
public interface OfficeAddressRepository extends CrudRepository<OfficeAddress, Integer>{

}
