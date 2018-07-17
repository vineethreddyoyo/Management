package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.management.HotelRepository;
import com.example.management.Staff;
import com.example.management.StaffRepository;

import Services.StaffService;

@RestController
@CrossOrigin
public class StaffController {

@Autowired
StaffRepository sr;
@Autowired
HotelRepository hr;

@Autowired
StaffService ss;



@RequestMapping("/get_staff")
public Staff getStaff() {
	
	return ss.getStaff();
}


@RequestMapping("get_staff_cluster")
public String getStaff_Cluster()
{
	
return sr.getOne((long) 1).getHotel().getCluster().getClusterName();
}



@RequestMapping("/allocate")
public String allocate() {
	
	ss.allocate((long) 1);

	return "allocated";
}

/*
@RequestMapping("/findbyid")
public String check()
{
	Set<Staff> staffs = hr.findByTotal_rooms((long) 1);
	for (Iterator<Staff> it = staffs.iterator(); it.hasNext(); ) {
        Staff f = it.next();
        System.out.println(f.getName());
    }
	return "Staff allocated";
}
*/
	
}
