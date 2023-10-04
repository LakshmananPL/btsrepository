package com.laxman.BTSbySpringBoot.Service;

import com.laxman.BTSbySpringBoot.Entity.TripDetails;
import com.laxman.BTSbySpringBoot.Repository.TripDetailsRepository;
import com.laxman.BTSbySpringBoot.Response.GetSeatsDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripDetailsServiceImp implements TripDetailsService {

    @Autowired
    TripDetailsRepository tripDetailsRepository;
    @Override
    public String saveAvailability(TripDetails tripDetails) {
        tripDetailsRepository.save(tripDetails);
        return "Availability details saved successfully!!";
    }

    @Override
    public List<GetSeatsDetails> getSeatsDetails(int tripId, String seatStatus) {
        return tripDetailsRepository.getSeatsInfo(tripId,seatStatus);
    }
}
