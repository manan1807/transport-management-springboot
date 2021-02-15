package com.gl.trans.repo;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gl.trans.model.Vendor;


@Repository
public interface VendorRepository extends CrudRepository<Vendor, Integer> {
 public Vendor findByVendorName(String s);
}
