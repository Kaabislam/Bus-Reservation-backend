package com.example.reservationBus.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bus {
    private Long busId;
    private String busName;
    private String busType;
    private Integer totalSeat;
    private String busNumber;

}
