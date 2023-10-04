package com.laxman.BTSbySpringBoot.Controller;


import com.laxman.BTSbySpringBoot.Entity.*;
import com.laxman.BTSbySpringBoot.Response.GetBusDetails;
import com.laxman.BTSbySpringBoot.Service.BusService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
public class BusController {

    @Autowired
    private BusService busService;
    @PostMapping("/Bus")
    public Bus saveBus(@RequestBody @Valid Bus bus){
        return busService.saveBus(bus);
    }

    @GetMapping("/Bus/Home")
    public List<Bus> getAllBus(){
        return busService.getAllBus();
    }

   @GetMapping("/Bus/BusDetailsByFromToDate/{startingFrom}/{endingTo}/{departureDate}")
    public List<GetBusDetails> getBusDetailsUsingFromToDate
            (@PathVariable("startingFrom") String startingFrom,
             @PathVariable("endingTo") String endingTo,
             @PathVariable("departureDate")LocalDate departureDate){
        return busService.getBusDetailsUsingFromToDate(startingFrom,endingTo,departureDate);
    }
    @GetMapping("/Bus/BusDetailsByFromAndToAcType/{startingFrom}/{endingTo}/{departureDate}/{acType}")
    public List<GetBusDetails> getBusDetailsUsingFromToDateAc
            (@PathVariable("startingFrom") String startingFrom,
             @PathVariable("endingTo") String endingTo,
             @PathVariable("departureDate")LocalDate departureDate,
             @PathVariable("acType") String acType){
        return busService.getBusDetailsUsingFromToDateAc(startingFrom,endingTo,departureDate,acType);
    }

    @GetMapping("/Bus/BusDetailsByFromAndToSeatType/{startingFrom}/{endingTo}/{departureDate}/{seatType}")
    public List<GetBusDetails> getBusDetailsFromStartingFromAndEndingToAndSeatTypes
            (@PathVariable("startingFrom") String startingFrom,
             @PathVariable("endingTo") String endingTo,
             @PathVariable("departureDate")LocalDate departureDate,
             @PathVariable("seatType") String seatType){
        return busService.getBusDetailsFromStartingFromAndEndingToAndSeatTypes(startingFrom,endingTo,departureDate,seatType);
    }

    @GetMapping("/Bus/BusDetailsByFromAndToFair/{startingFrom}/{endingTo}/{departureDate}/{fair}")
    public List<GetBusDetails> getBusDetailsFromStartingFromAndEndingToAndFairs
            (@PathVariable("startingFrom") String startingFrom,
             @PathVariable("endingTo") String endingTo,
             @PathVariable("departureDate")LocalDate departureDate,
             @PathVariable("fair") int fair){
        return busService.getBusDetailsFromStartingFromAndEndingToAndFairs(startingFrom,endingTo,departureDate,fair);
    }

    @GetMapping("/Bus/BusDetailsByFromAndToStartTime/{startingFrom}/{endingTo}/{departureDate}/{startTime}")
    public List<GetBusDetails> getBusDetailsFromStartingFromAndEndingToAndStartingTimes
            (@PathVariable("startingFrom") String startingFrom,
             @PathVariable("endingTo") String endingTo,
             @PathVariable("departureDate")LocalDate departureDate,
             @PathVariable("startTime") LocalTime startTime){
        return busService.getBusDetailsFromStartingFromAndEndingToAndStartingTimes(startingFrom,endingTo,departureDate,startTime);
    }

    @GetMapping("/Bus/BusDetailsByFromAndToEndTime/{startingFrom}/{endingTo}/{departureDate}/{endingTime}")
    public List<GetBusDetails> getBusDetailsFromStartingFromAndEndingToAndEndingTimes
            (@PathVariable("startingFrom") String startingFrom,
             @PathVariable("endingTo") String endingTo,
             @PathVariable("departureDate")LocalDate departureDate,
             @PathVariable("endingTime") LocalTime endingTime){
        return busService.getBusDetailsFromStartingFromAndEndingToAndEndingTimes(startingFrom,endingTo,departureDate,endingTime);
    }
    @GetMapping("/Bus/BusDetailsByFromAndToSeatAcFair/{startingFrom}/{endingTo}/{departureDate}/{seatType}/{acType}/{fair}")
    public List<GetBusDetails> getBusDetailsFromStartingFromEndingToSeatTypeAcTpeFairs
            (@PathVariable("startingFrom") String startingFrom,
             @PathVariable("endingTo") String endingTo,
             @PathVariable("departureDate")LocalDate departureDate,
             @PathVariable("seatType") String seatType,
             @PathVariable("acType") String acType,
             @PathVariable("fair") int fair){
        return busService.getBusDetailsFromStartingFromEndingToSeatTypeActypeFairs(startingFrom,endingTo,departureDate,seatType,acType,fair);
    }

    public void java(){
        System.out.println("hello");
    }
   /* BusController busController;
    busController.java();*/
}
