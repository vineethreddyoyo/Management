package Controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.management.Cluster;
import com.example.management.ClusterRepository;
import com.example.management.Hotel;
import com.example.management.HotelRepository;

@RestController
public class HotelController {
@Autowired
HotelRepository hr;
@Autowired
ClusterRepository cr;

@RequestMapping("/create_hotel")
public String create()
{
	Hotel ht = new Hotel((long) 2,0,0,5,1.2);
	Cluster c = cr.findOne((long) 2);
	ht.setCluster(c);
	hr.save(ht);
	return "hotel created";
}

@RequestMapping("/get_hotel")
public String hotel()
{
	
	Hotel ht = hr.getOne((long) 2);
	System.out.println(ht.getTotalRooms());
	return "got hotel";
	
}

@RequestMapping("/hotel_check")
public String check() {
	
	
	Set<Hotel> ht  = hr.findBytotalRooms(5);
	for(Hotel h : ht) {
		System.out.println(h.getHotelId());
	}
	
	
	return "worked";
	
}

	
}
