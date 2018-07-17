package Controller;

import Services.RequestService;
import Services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.management.Request;

import java.util.List;

public class RequestController {

    @Autowired
    RequestService requestService;

    @RequestMapping("/incoming_requests/hotel_id")
    public List<Request> incomingRequests(Long hotel_id){

        return requestService.incomingRequests(hotel_id);


    }

    @RequestMapping("/request_staff/{hotel_id}")
    public String requestStaff(@PathVariable int hotel_id){

        requestService.requestStaff(hotel_id);
        return "Your request is being Processed";
    }

}
