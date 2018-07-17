package com.example.management;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RequestRepository extends CrudRepository<Request,Integer> {

    public List<Request> findAll();

}
