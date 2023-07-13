package com.laxman.BTSbySpringBoot.Service;

import com.laxman.BTSbySpringBoot.Entity.Booking;
import com.laxman.BTSbySpringBoot.Response.GetBookingDetails;

import java.util.Optional;

public interface BookingService {
    Booking saveBooking(Booking booking);

    String deleteBooking(int tripId,String seatName, int serialNO);

    /*String deleteBooking(int serialNO);

    String updateBooking(LocalDate bookingDate, int serialNo);*/
}
