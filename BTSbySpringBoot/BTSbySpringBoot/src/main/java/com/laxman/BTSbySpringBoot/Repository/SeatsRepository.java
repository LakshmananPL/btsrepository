package com.laxman.BTSbySpringBoot.Repository;

import com.laxman.BTSbySpringBoot.Entity.Seats;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface SeatsRepository extends JpaRepository<Seats, Integer> {

    @Modifying
    @Transactional
    @Query(value = "update Seats set seat_status = ?1 where trip_id_fk = ?2 and seat_name = ?3" ,nativeQuery = true)
    void updateSeatsStatus(String seatStatus, int tripId, String seatName);



   /* @Modifying
    @Transactional
    @Query(value = "update Seats set seat_status = ?1 where seat_bus_no = ?2 and seat_name = ?3 and seat_booking_date = ?4" ,nativeQuery = true)
     void updateSeatsStatus(String seatStatus , int seatBusNo, String seatName, LocalDate seatBookingDate);

    List<GetSeatsDetails> findBySeatBusNoAndDepartureDate(int seatBusNo, LocalDate seatBookingDate);*/
}
