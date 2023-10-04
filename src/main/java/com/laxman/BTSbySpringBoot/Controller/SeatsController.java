package com.laxman.BTSbySpringBoot.Controller;


import com.laxman.BTSbySpringBoot.Entity.Seats;
import com.laxman.BTSbySpringBoot.Service.SeatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SeatsController {

    @Autowired
    private SeatsService seatsService;

    @PostMapping("/Seats")
    public String saveSeat(@RequestBody Seats seats){
        return seatsService.saveSeat(seats);
    }

}
