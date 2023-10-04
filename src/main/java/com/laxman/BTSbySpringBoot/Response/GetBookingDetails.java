package com.laxman.BTSbySpringBoot.Response;


import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;



public interface GetBookingDetails{

     String getPassengerName();

     int getBusNo();

     int getTripId();

     String getStartingFrom();
     String getEndingTo();

     String getEmail();
     int getAge();

     String GetSeatName();

}
