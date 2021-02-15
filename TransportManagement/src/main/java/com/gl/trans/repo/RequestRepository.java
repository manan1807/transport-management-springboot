package com.gl.trans.repo;



import org.springframework.data.repository.CrudRepository;

import com.gl.trans.model.Request;

public interface RequestRepository extends CrudRepository<Request, Integer> {
	

}
