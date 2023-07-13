package com.laxman.BTSbySpringBoot.Service;


import com.laxman.BTSbySpringBoot.Entity.*;
import com.laxman.BTSbySpringBoot.Response.GetBusDetails;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface BusService {
     Bus saveBus(Bus bus);

     List<Bus> getAllBus();

     List<GetBusDetails> getBusDetailsUsingFromToDate(String startingFrom, String endingTo, LocalDate departureDate);

     List<GetBusDetails> getBusDetailsUsingFromToDateAc(String startingFrom, String endingTo, LocalDate departureDate, String acType);

     List<GetBusDetails> getBusDetailsFromStartingFromAndEndingToAndSeatTypes(String startingFrom, String endingTo, LocalDate departureDate, String seatType);

     List<GetBusDetails> getBusDetailsFromStartingFromAndEndingToAndFairs(String startingFrom, String endingTo, LocalDate departureDate, int fair);

     List<GetBusDetails> getBusDetailsFromStartingFromAndEndingToAndStartingTimes(String startingFrom, String endingTo, LocalDate departureDate, LocalTime startTime);

     List<GetBusDetails> getBusDetailsFromStartingFromAndEndingToAndEndingTimes(String startingFrom, String endingTo, LocalDate departureDate, LocalTime endingTime);

     List<GetBusDetails> getBusDetailsFromStartingFromEndingToSeatTypeActypeFairs(String startingFrom, String endingTo, LocalDate departureDate, String seatType, String acType, int fair);
}
