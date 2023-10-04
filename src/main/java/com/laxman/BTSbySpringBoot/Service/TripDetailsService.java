package com.laxman.BTSbySpringBoot.Service;

import com.laxman.BTSbySpringBoot.Entity.TripDetails;
import com.laxman.BTSbySpringBoot.Response.GetSeatsDetails;

import java.util.List;

public interface TripDetailsService {
    String saveAvailability(TripDetails tripDetails);

    List<GetSeatsDetails> getSeatsDetails(int tripId, String seatStatus);
}
