package Services;


import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.management.Hotel;
import com.example.management.HotelRepository;
import com.example.management.Manager;
import com.example.management.ManagerRepository;
import com.example.management.Staff;
import com.example.management.StaffRepository;
import com.example.management.User;

@Service
public class GlobalService {

	@Autowired
	StaffRepository sr;
	
	@Autowired
	HotelRepository hr;
	
	@Autowired
	ManagerRepository mr;
	
	public String login(User user) {
		
		Set<Manager> managers = mr.findBymanagerName(user.getUsername());
		if (managers.isEmpty()) return "no users found";
		else {
			for(Manager i : managers) {
				if( i.getPassword().contentEquals(user.getPassword()) ) return "Yes";
				else return "Wrong password";
	
			}
			
		}

		return "outside";
	}
	
	public String correct_staff() {
		
		Iterable<Hotel> hotels = hr.findAll();				
		for(Hotel i : hotels){
			i.setCurrentStaff(0);
			hr.save(i);
		}
		
		Iterable<Staff> staffs = sr.findAll();
		for(Staff i : staffs) {
			i.getHotel().setCurrentStaff(i.getHotel().getCurrentStaff() + 1);
		}
		
		for(Hotel i : hotels) {
			update_hotel_ratio(i.getHotelId());
			hr.save(i);
		}
		
		
		
		return "CorrectedStaff";				
	}
	
	
	public void update_hotel_ratio(Long hotel_id)
	{
		Hotel ht = hr.findOne(hotel_id);
		ht.setRatio((double)ht.getTotalRooms()/(double)ht.getCurrentStaff());
		hr.save(ht);
		
	}
	
	
}
