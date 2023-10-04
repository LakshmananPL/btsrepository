package com.laxman.BTSbySpringBoot.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TripDetails {

    @Id
    private int tripId;
    private int availability;
    private LocalDate departureDate;
    @Basic
    private LocalTime departureTime;
    @Basic
    private LocalTime arrivalTime;
    @Basic
    private LocalDate arrivalDate;
    @Column(name = "bus_no_fk")
    private int busNoFk;

    @OneToMany(targetEntity = Seats.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "trip_id_fk", referencedColumnName = "tripId")
    private List<Seats> seats;

}
