package com.laxman.BTSbySpringBoot.Response;


import jakarta.persistence.Basic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBusDetails {
    private int busNo;
    private String acType;
    private String seatType;
    private String startingFrom;
    private String endingTo;
    private int fair;
    private int tripId;
    private int availability;
    private LocalDate departureDate;
    @Basic
    private LocalTime departureTime;
    @Basic
    private LocalTime arrivalTime;
    private LocalDate arrivalDate;
}
