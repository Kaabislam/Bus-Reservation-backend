package com.example.reservationBus.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Customer {
    private Long customerId;
    private String customerName;
    private String mobile;
    private String email;
}
