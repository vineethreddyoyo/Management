package com.example.management;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface HotelRepository extends JpaRepository<Hotel,Long> {


	Set<Hotel> findBytotalRooms(int i);

	Iterable<Hotel> findBycluster(Cluster c);



	Hotel findByhotelId(int hotel_id);
}
