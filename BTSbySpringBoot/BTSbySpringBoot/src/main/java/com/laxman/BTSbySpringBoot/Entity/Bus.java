package com.laxman.BTSbySpringBoot.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bus {

    @Id
    private int busNo;
    private String acType;
    private String seatType;
    @NotEmpty(message = "please enter departure details")
    private String startingFrom;
    @NotEmpty
    private String endingTo;
    @NotNull
    private int fair;

    @OneToMany(targetEntity = TripDetails.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "bus_no_fk",referencedColumnName = "busNo")
    private List<TripDetails> tripDetails;

}
