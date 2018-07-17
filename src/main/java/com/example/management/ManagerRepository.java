package com.example.management;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ManagerRepository extends JpaRepository<Manager, Long> {

	Set<Manager> findByUsername(String string);

	Set<Manager> findBymanagerName(String username);

}
