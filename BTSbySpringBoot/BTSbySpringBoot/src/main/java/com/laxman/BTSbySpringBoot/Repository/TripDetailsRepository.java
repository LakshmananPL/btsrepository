package com.laxman.BTSbySpringBoot.Repository;

import com.laxman.BTSbySpringBoot.Entity.TripDetails;
import com.laxman.BTSbySpringBoot.Response.GetSeatsDetails;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripDetailsRepository extends JpaRepository<TripDetails,Integer> {

    @Query(" select new com.laxman.BTSbySpringBoot.Response.GetSeatsDetails (s.seatName) from TripDetails t JOIN t.seats s where s.tripIdFk = ?1 and s.seatStatus = ?2")
    List<GetSeatsDetails> getSeatsInfo(int tripId, String seatStatus);

    @Modifying
    @Transactional
    @Query(value = "update trip_details set availability = availability-1 where trip_id = ?1" ,nativeQuery = true)
    void updateTripDetailsCapacityPlusOne(int tripId);

    @Modifying
    @Transactional
    @Query(value = "update trip_details set availability = availability+1 where trip_id = ?1" ,nativeQuery = true)
    void updateTripDetailsCapacityMinusOne(int tripId);
}
