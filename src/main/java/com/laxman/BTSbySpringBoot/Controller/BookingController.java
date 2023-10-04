package com.laxman.BTSbySpringBoot.Controller;


import com.laxman.BTSbySpringBoot.Entity.Booking;
import com.laxman.BTSbySpringBoot.Response.GetBookingDetails;
import com.laxman.BTSbySpringBoot.Service.BookingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class BookingController {

    @Autowired
    BookingService bookingService;

    private final Logger LOGGER = LoggerFactory.getLogger(BookingController.class);


    @PostMapping("/Booking")
    public Booking saveBooking(@RequestBody Booking booking){
        LOGGER.info("inside a saveBooking");
         return bookingService.saveBooking(booking);
    }

    @GetMapping("/Booking")
    public String printWelcomeMessage(){
        return "welcome to my BTS project!!!";
    }

    @DeleteMapping("/Booking/{tripId}/{seatName}/{serialNO}")
    public String deleteBooking(@PathVariable("tripId") int tripId,
                                @PathVariable("seatName") String seatName,
                                @PathVariable("serialNO") int serialNO){
        return bookingService.deleteBooking(tripId,seatName,serialNO);
    }
    /*@PutMapping("/Booking/{bookingDate}/{id}")
    public String updateBooking(@PathVariable ("bookingDate")  LocalDate bookingDate,
                                @PathVariable ("id") int serialNO){
        return bookingService.updateBooking(bookingDate,serialNO);
    } */
}
