package com.example.management;

import java.util.HashSet;
import java.util.Set;


import javax.persistence.*;


@Entity
@Table(name = "requests")
public class Request {





        @Id
        @Column(name ="request_id")
        private Long requestId;

        @Column(name="hotel_id")
        private int hotel_id;



        public Request(Long requestId, int hotel_id) {
            this.requestId = requestId;
            this.hotel_id = hotel_id;
        }

        public Request(int hotel_id){

            this.hotel_id = hotel_id;
        }

        public Long getRequestId() {
            return requestId;
        }

        public void setRequestId(Long requestId) {
            this.requestId = requestId;
        }





}
