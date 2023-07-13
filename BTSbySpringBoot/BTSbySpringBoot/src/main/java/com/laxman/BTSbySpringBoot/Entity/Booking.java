package com.laxman.BTSbySpringBoot.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {

    @Id
    @SequenceGenerator(name = "BookingSequence", sequenceName = "BookingSequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BookingSequence")
    private int serialNO;

    @NotEmpty(message = "Name may not be empty")
    @Size(min = 2,max = 32)
    private String passengerName;

    @NotNull
    private int busNo;

    private int tripId;

    /*@NotNull
    @Basic
    private LocalDate bookingDate;*/

    @NotEmpty
    private String startingFrom;

    @NotEmpty
    private String endingTo;

    @NotEmpty
    @Email
    private String email;

    //@NotEmpty
    @Min(value = 12, message = "age should be more than 12")
    private int age;

    private String seatName;

}
