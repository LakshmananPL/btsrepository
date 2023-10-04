package com.laxman.BTSbySpringBoot.Repository;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.laxman.BTSbySpringBoot.Entity.Booking;
import com.laxman.BTSbySpringBoot.Response.GetBookingDetails;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {


    @Modifying
    @Transactional
    @Query(value = "update Booking set booking_date = ?1 where serialNo = ?2" ,nativeQuery = true)
    public void updateBookingBySerialNo(LocalDate bookingDate, int serialNO);


   @Query(value = "select passenger_name, bus_no, trip_id, starting_from, ending_to, age, seat_name, email from Booking b where b.serialNo = ?1", nativeQuery = true)
    GetBookingDetails getBookingDetails(int serialNO);


}
