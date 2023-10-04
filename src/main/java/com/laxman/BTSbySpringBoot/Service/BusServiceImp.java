package com.laxman.BTSbySpringBoot.Service;


import com.laxman.BTSbySpringBoot.Entity.*;
import com.laxman.BTSbySpringBoot.Repository.BusRepository;
import com.laxman.BTSbySpringBoot.Response.GetBusDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class BusServiceImp implements BusService {

    @Autowired
    BusRepository busRepository;

    @Override
    public Bus saveBus(Bus bus) {
        return busRepository.save(bus);
    }

    @Override
    public List<Bus> getAllBus() {
        return busRepository.findAll();
    }

    @Override
    public List<GetBusDetails> getBusDetailsUsingFromToDate(String startingFrom, String endingTo, LocalDate departureDate) {
        return busRepository.getInfoUsingFromToDate(startingFrom,endingTo,departureDate);
    }

    @Override
    public List<GetBusDetails> getBusDetailsUsingFromToDateAc(String startingFrom, String endingTo, LocalDate departureDate, String acType) {
        return busRepository.getInfoUsingFromToDateAc(startingFrom,endingTo,departureDate,acType);
    }

    @Override
    public List<GetBusDetails> getBusDetailsFromStartingFromAndEndingToAndSeatTypes(String startingFrom, String endingTo, LocalDate departureDate, String seatType) {
        return busRepository.getInfoUsingFromToDateSeat(startingFrom,endingTo,departureDate,seatType);
    }

    @Override
    public List<GetBusDetails> getBusDetailsFromStartingFromAndEndingToAndFairs(String startingFrom, String endingTo, LocalDate departureDate, int fair) {
        return busRepository.getInfoUsingFromToDateFair(startingFrom,endingTo,departureDate,fair);
    }

    @Override
    public List<GetBusDetails> getBusDetailsFromStartingFromAndEndingToAndStartingTimes(String startingFrom, String endingTo, LocalDate departureDate, LocalTime startTime) {
        return busRepository.getInfoUsingFromToDateStartTime(startingFrom,endingTo,departureDate,startTime);
    }

    @Override
    public List<GetBusDetails> getBusDetailsFromStartingFromAndEndingToAndEndingTimes(String startingFrom, String endingTo, LocalDate departureDate, LocalTime endingTime) {
        return busRepository.getInfoUsingFromToDateEndTime(startingFrom,endingTo,departureDate,endingTime);
    }

    @Override
    public List<GetBusDetails> getBusDetailsFromStartingFromEndingToSeatTypeActypeFairs(String startingFrom, String endingTo, LocalDate departureDate, String seatType, String acType, int fair) {
        return busRepository.getInfoUsingFromToDateSeatAcFair(startingFrom,endingTo,departureDate,seatType,acType,fair);
    }


}
