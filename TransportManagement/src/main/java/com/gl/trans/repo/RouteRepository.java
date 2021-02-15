package com.gl.trans.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gl.trans.model.Route;


@Repository
public interface RouteRepository extends CrudRepository<Route, Integer> {
}
