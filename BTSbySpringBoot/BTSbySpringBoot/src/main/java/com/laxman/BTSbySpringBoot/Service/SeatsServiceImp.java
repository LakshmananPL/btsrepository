package com.laxman.BTSbySpringBoot.Service;

import com.laxman.BTSbySpringBoot.Entity.Seats;
import com.laxman.BTSbySpringBoot.Repository.SeatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatsServiceImp implements SeatsService{

    @Autowired
    private SeatsRepository seatsRepository;

    /*@Override
    public List<GetSeatsDetails> getSeatsFromBusNoAndSeatBookingDate(int seatBusNo, LocalDate departureDate) {
        return seatsRepository.findBySeatBusNoAndDepartureDate(seatBusNo,departureDate);
    }*/


    @Override
    public String saveSeat(Seats seats) {
        seatsRepository.save(seats);

        return "Seat details saved successfully!!";
    }
}
