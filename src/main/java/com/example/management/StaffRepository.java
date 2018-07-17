package com.example.management;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {

	Set<Staff> findBystaffName(String string);

    List<Staff> findAllByhotelId(int hotel_id);

    Staff findBystaffId();
}
