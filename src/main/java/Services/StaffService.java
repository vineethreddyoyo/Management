package Services;



import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.management.Cluster;
import com.example.management.Hotel;
import com.example.management.HotelRepository;
import com.example.management.Staff;
import com.example.management.StaffRepository;

@Service
public class StaffService {

	@Autowired
	StaffRepository sr;
	
	@Autowired
	HotelRepository hr;

	float minRatio  = 2.5f;
	
	public String addStaff(Staff s,Long hotel_id) {
		System.out.println(hotel_id);
		s.setHotel(hr.findOne(hotel_id));
		sr.save(s);
		return "staff added";
	}
	
	
	public String allocateStaff(Long hotel_id)
	{
		double maxi = 100;
		Hotel AllocatedHotel = hr.findOne(hotel_id);
		Cluster c = AllocatedHotel.getCluster();
		Iterable<Hotel> hotels = hr.findBycluster(c); 
		Hotel currentHotel = null;
		for(Hotel i : hotels){

				System.out.println(i.getHotelId());
	            if((i.getHotelId() != AllocatedHotel.getHotelId()) && ( i.getRatio() < maxi)){

	                currentHotel = i;
	                maxi = i.getRatio();

	            }
	        }
		
		Set<Staff> h_staffs  = currentHotel.getStaffs();
		Staff temp = null;
		for(Staff i : h_staffs) {
			i.setHotel(AllocatedHotel);
			temp = i ;
			break;
			
		}
		
		
		sr.save(temp);
		int c_staff= currentHotel.getCurrentStaff();
		currentHotel.setCurrentStaff(c_staff-1);
		
		hr.save(currentHotel);
		AllocatedHotel.setCurrentStaff(AllocatedHotel.getCurrentStaff()+1);
		hr.save(AllocatedHotel);
		
		
		return "allocated";
	}


	public Staff getStaff() {
		// TODO Auto-generated method stub
		return sr.findOne((long) 1);
	}

	
	//yes
}
