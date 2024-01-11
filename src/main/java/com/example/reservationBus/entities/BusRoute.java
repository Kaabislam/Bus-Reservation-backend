package com.example.reservationBus.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class BusRoute {
    private Long routeId;
    private String routeName;
    private String cityFrom;
    private String cityTo;
    private String distanceInKm;
}
