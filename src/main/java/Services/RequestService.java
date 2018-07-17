package Services;

import com.example.management.HotelRepository;
import com.example.management.RequestRepository;
import com.example.management.Request;
import com.example.management.Hotel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class RequestService {

    @Autowired
    RequestRepository requestRepository;

    @Autowired
    HotelRepository hotelRepository;

    float minRatio = 2;

    public  List<Request> incomingRequests(Long hotel_id) {

        List<Request> requests = new ArrayList<>();
        Hotel current_hotel = hotelRepository.findOne(hotel_id);
        if(current_hotel.getRatio() < minRatio){

            return requests;

        }
        else{

            return requestRepository.findAll();

        }

    }

    public  void requestStaff(int hotel_id){


        Request r = new Request(hotel_id);
        requestRepository.save(r);

    }


}
