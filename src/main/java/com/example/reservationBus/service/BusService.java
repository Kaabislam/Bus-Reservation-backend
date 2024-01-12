package com.example.reservationBus.service;

import com.example.reservationBus.entities.Bus;

import java.util.List;

public interface BusService {
    Bus addBus(Bus bus);
    List<Bus> getAllBus();

}
