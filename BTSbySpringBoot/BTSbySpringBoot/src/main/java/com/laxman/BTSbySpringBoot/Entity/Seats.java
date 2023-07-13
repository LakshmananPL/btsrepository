package com.laxman.BTSbySpringBoot.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seats {


    @Id
    @SequenceGenerator(name = "SeatsSequence", sequenceName = "SeatsSequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SeatsSequence")
    private int sNo;
    private String seatName;
    private String seatStatus;
    @Column(name = "trip_id_fk")
    private int tripIdFk;


}
