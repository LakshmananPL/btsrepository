package com.laxman.BTSbySpringBoot.Repository;

import com.laxman.BTSbySpringBoot.Entity.*;
import com.laxman.BTSbySpringBoot.Response.GetBusDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Repository
public interface BusRepository  extends JpaRepository<Bus, Integer> {
    /*@Query(value = "select b.capacity from Bus b where bus_no = ?1",nativeQuery = true)
    int checkBusCapacity(int busNo);*/

    @Query("select new com.laxman.BTSbySpringBoot.Response.GetBusDetails (b.busNo, b.acType, b.seatType, b.startingFrom, b.endingTo, b.fair, t.tripId, t.availability,t.departureDate, t.departureTime, t.arrivalTime, t.arrivalDate) from Bus b JOIN b.tripDetails t where b.startingFrom = ?1 and b.endingTo = ?2 and t.departureDate = ?3")
    List<GetBusDetails> getInfoUsingFromToDate(String startingFrom, String endingTo, LocalDate departureDate);

    @Query("select new com.laxman.BTSbySpringBoot.Response.GetBusDetails (b.busNo, b.acType, b.seatType, b.startingFrom, b.endingTo, b.fair, t.tripId, t.availability,t.departureDate, t.departureTime, t.arrivalTime, t.arrivalDate) from Bus b JOIN b.tripDetails t where b.startingFrom = ?1 and b.endingTo = ?2 and t.departureDate = ?3 and b.acType = ?4")
    List<GetBusDetails> getInfoUsingFromToDateAc(String startingFrom, String endingTo, LocalDate departureDate, String acType);

    @Query("select new com.laxman.BTSbySpringBoot.Response.GetBusDetails (b.busNo, b.acType, b.seatType, b.startingFrom, b.endingTo, b.fair, t.tripId, t.availability,t.departureDate, t.departureTime, t.arrivalTime, t.arrivalDate) from Bus b JOIN b.tripDetails t where b.startingFrom = ?1 and b.endingTo = ?2 and t.departureDate = ?3 and b.seatType = ?4")
    List<GetBusDetails> getInfoUsingFromToDateSeat(String startingFrom, String endingTo, LocalDate departureDate, String seatType);

    @Query("select new com.laxman.BTSbySpringBoot.Response.GetBusDetails (b.busNo, b.acType, b.seatType, b.startingFrom, b.endingTo, b.fair, t.tripId, t.availability,t.departureDate, t.departureTime, t.arrivalTime, t.arrivalDate) from Bus b JOIN b.tripDetails t where b.startingFrom = ?1 and b.endingTo = ?2 and t.departureDate = ?3 and b.fair <= ?4")
    List<GetBusDetails> getInfoUsingFromToDateFair(String startingFrom, String endingTo, LocalDate departureDate, int fair);

    @Query("select new com.laxman.BTSbySpringBoot.Response.GetBusDetails (b.busNo, b.acType, b.seatType, b.startingFrom, b.endingTo, b.fair, t.tripId, t.availability,t.departureDate, t.departureTime, t.arrivalTime, t.arrivalDate) from Bus b JOIN b.tripDetails t where b.startingFrom = ?1 and b.endingTo = ?2 and t.departureDate = ?3 and t.departureTime <= ?4")
    List<GetBusDetails> getInfoUsingFromToDateStartTime(String startingFrom, String endingTo, LocalDate departureDate, LocalTime startTime);

    @Query("select new com.laxman.BTSbySpringBoot.Response.GetBusDetails (b.busNo, b.acType, b.seatType, b.startingFrom, b.endingTo, b.fair, t.tripId, t.availability,t.departureDate, t.departureTime, t.arrivalTime, t.arrivalDate) from Bus b JOIN b.tripDetails t where b.startingFrom = ?1 and b.endingTo = ?2 and t.departureDate = ?3 and t.arrivalTime <= ?4")
    List<GetBusDetails> getInfoUsingFromToDateEndTime(String startingFrom, String endingTo, LocalDate departureDate, LocalTime endingTime);

    @Query("select new com.laxman.BTSbySpringBoot.Response.GetBusDetails (b.busNo, b.acType, b.seatType, b.startingFrom, b.endingTo, b.fair, t.tripId, t.availability,t.departureDate, t.departureTime, t.arrivalTime, t.arrivalDate) from Bus b JOIN b.tripDetails t where b.startingFrom = ?1 and b.endingTo = ?2 and t.departureDate = ?3 and b.seatType = ?4 and b.acType = ?5 and b.fair <= ?6")
    List<GetBusDetails> getInfoUsingFromToDateSeatAcFair(String startingFrom, String endingTo, LocalDate departureDate, String seatType, String acType, int fair);
}
