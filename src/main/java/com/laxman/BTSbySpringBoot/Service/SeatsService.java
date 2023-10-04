package com.laxman.BTSbySpringBoot.Service;

import com.laxman.BTSbySpringBoot.Entity.*;
import com.laxman.BTSbySpringBoot.Entity.Seats;

import java.time.LocalDate;
import java.util.List;

public interface SeatsService {

    /*List<GetSeatsDetails> getSeatsFromBusNoAndSeatBookingDate(int seatBusNo, LocalDate seatBookingDate);*/

    String saveSeat(Seats seats);
}
