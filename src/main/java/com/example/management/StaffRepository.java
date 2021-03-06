package com.example.management;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends CrudRepository<Staff, Long> {

	Set<Staff> findBystaffName(String string);

    List<Staff> findAllByHotel(int hotel_id);

    Staff findBystaffId(int staff_id);

}
