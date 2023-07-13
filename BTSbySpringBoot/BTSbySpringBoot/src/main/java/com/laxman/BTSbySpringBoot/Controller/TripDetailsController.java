package com.laxman.BTSbySpringBoot.Controller;


import com.laxman.BTSbySpringBoot.Entity.TripDetails;
import com.laxman.BTSbySpringBoot.Response.GetSeatsDetails;
import com.laxman.BTSbySpringBoot.Service.TripDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TripDetailsController {


    @Autowired
    TripDetailsService tripDetailsService;
    @PostMapping("/TripDetails")
    public String saveAvailability(@RequestBody TripDetails tripDetails){
        return tripDetailsService.saveAvailability(tripDetails);
    }

    @GetMapping("/TripDetails/Availability/{tripId}/{seatStatus}")
    public List<GetSeatsDetails> getSeatsFromBusNoAndSeatBookingDate(@PathVariable("tripId") int tripId,
                                                                     @PathVariable("seatStatus") String seatStatus){
        System.out.println("a1" + " " + "a2" + "    " + "a3" + " " + "a4" );
        System.out.println("b1" + " " + "b2" + "    " + "b3" + " " + "b4" );
        System.out.println("c1" + " " + "c2" + "    " + "c3" + " " + "c4" );
        System.out.println("d1" + " " + "d2" + "    " + "d3" + " " + "d4" );
        System.out.println("e1" + " " + "e2" + "    " + "e3" + " " + "e4" );
        System.out.println("f1" + " " + "f2" + "    " + "f3" + " " + "f4" );
        System.out.println("g1" + " " + "g2" + "    " + "g3" + " " + "g4" );
        System.out.println("h1" + " " + "h2" + "    " + "h3" + " " + "h4" );
        System.out.println("i1" + " " + "i2" + "    " + "i3" + " " + "i4" );
        System.out.println("j1" + " " + "j2" + "    " + "j3" + " " + "j4" );
        return tripDetailsService.getSeatsDetails(tripId,seatStatus);
    }

}
