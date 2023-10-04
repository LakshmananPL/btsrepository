package com.laxman.BTSbySpringBoot.Service;


import com.laxman.BTSbySpringBoot.Entity.Booking;
import com.laxman.BTSbySpringBoot.Entity.TripDetails;
import com.laxman.BTSbySpringBoot.Repository.BookingRepository;
import com.laxman.BTSbySpringBoot.Repository.SeatsRepository;
import com.laxman.BTSbySpringBoot.Repository.TripDetailsRepository;
import com.laxman.BTSbySpringBoot.Response.GetBookingDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class BookingServiceImp implements BookingService{

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    TripDetailsRepository tripDetailsRepository;
    @Autowired
    SeatsRepository seatsRepository;
    @Override
    public Booking saveBooking(Booking booking) {

        String seatStatus = "not-available";

        bookingRepository.save(booking);
        seatsRepository.updateSeatsStatus(seatStatus,booking.getTripId(),booking.getSeatName());
        tripDetailsRepository.updateTripDetailsCapacityPlusOne(booking.getTripId());

        System.out.println("Ticket Booked Successfully!!");

        return bookingRepository.save(booking);
    }

    @Override
    public String deleteBooking(int tripId,String seatName, int serialNO) {

        String seatStatus = "available";
        seatsRepository.updateSeatsStatus(seatStatus,tripId,seatName);
        tripDetailsRepository.updateTripDetailsCapacityMinusOne(tripId);
        bookingRepository.deleteById(serialNO);
            return "Your Ticket Cancelled Successfully!!";
    }

    /*@Override
    public String updateBooking(LocalDate bookingDate, int serialNO) {
        int t = bookingRepository.isAvailable(serialNO);
        if(t > 0) {
            bookingRepository.updateBookingBySerialNo(bookingDate,serialNO);
            return "Your Ticket Date is Changed Successfully!!";
        }else {
            return "Please Enter the Correct Ticket Details";
        }
    }*/
}
