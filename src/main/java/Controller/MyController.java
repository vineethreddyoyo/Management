package Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.management.HotelRepository;
import com.example.management.StaffRepository;

@RestController
@CrossOrigin
public class MyController {

    @Autowired
    StaffRepository repository;
    @Autowired
    HotelRepository hotel_repository;
   
    /*
    @RequestMapping("/save")
    public String process(Model model) {

        //Staff hyd = repository.save(new Staff(200, "vineeth",5000,1));
       return "done";
        //return (List<Staff>) repository.findAll();
    }
    

    @RequestMapping("/insert")
    public String hotel_entry() {
    	/*
    	Hotel ht = new Hotel((long) 1,1,10,5,3,2.2);
    	//Hotel ht = hotel_repository.findOne((long) 1);
    	Staff st2 = new Staff((long) 5,"subhang",50,10);
    	repository.save(st2);
    	Collection<Staff> cs = new ArrayList<Staff>();
    	cs.add(st2);
    	
    	ht.setStaff(cs);
    	//hotel_repository.save(ht); 
    	//System.out.println(ht.getStaff());
    	/*
    	Staff st2 = new Staff((long) 2,"subhang",50,10);
    	Hotel h = (Hotel)hotel_repository.findOne((long) 1);
    	h.getStaff().add(st2);
    	repository.save(st2);
    	
    	hotel_repository.save(ht);
    	
    	
    	
    	//hotel_repository.deleteAllInBatch();;
    	return "Inserted";
    }
   
    @RequestMapping("/insert")
    public String entry() {
    	Hotel ht = new Hotel((long) 1,1,10,5,3,2.2);
    	hotel_repository.save(ht);
    	Staff s1 = new Staff((long) 5,"subhang",50,10);
    	s1.setHotel(ht);
    	Staff s2 = new Staff((long) 6,"vineeth",50,10);
    	s2.setHotel(ht);
    	repository.save(s1);
    	repository.save(s2);
    	
		return "inserted";
	
}
    @RequestMapping("/hotel")
    public String enter_hotel() {
    	Hotel ht = new Hotel((long) 2,1,10,5,3,2.2);
    	//Hotel ht = hotel_repository.findOne((long) 2);
    	hotel_repository.save(ht);
    	//Staff s1 = new Staff((long) 7,"vineeh",50,10);
    	//s1.setHotel(ht);
    	//repository.save(s1);
    	return "Hotel_inserted";
    	
    }
    
    
    @RequestMapping("/change")
    public String change_staff() {
    	
    	Staff s1 = repository.getOne((long) 5);
    	Hotel ht = hotel_repository.getOne((long) 2);
    	
    	s1.setHotel(ht);
    	repository.save(s1);
    	return "staff changed";
    }
    
    @RequestMapping("/check")
    public String check_mapping() {
    	
    	Staff s1 = new Staff((long) 8,"8",50,10);
    	Staff s2 = new Staff((long) 9,"9",50,10);
    	Hotel ht = new Hotel((long) 1,1,10,5,3,2.2);
    	s1.setHotel(ht);
    	s2.setHotel(ht);
    	ht.getStaff().add(s1);
    	ht.getStaff().add(s2);
    	hotel_repository.save(ht);
    	//repository.save(s1);
    	//repository.save(s1);
    	return "mappings";
 
    }
    @RequestMapping("/get_staff")
    public String getstaff() {
    	
    	Hotel ht = hotel_repository.findOne((long) 2);
    	
    	Set<Staff> hl = ht.getStaff();
    
		for (Staff s : hl) {
    	    System.out.println(s.getName());
    	}
    return "Yes";	
    }
    
    
    */
    
}
