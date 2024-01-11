package com.example.reservationBus.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BusSchedule {
    private Long scheduleId;
    private Bus bus;
    private BusRoute busRoute;
    private String departureTime;
    private Integer ticketPrice;
    private Integer discount;
    private Integer processingFee;
}
