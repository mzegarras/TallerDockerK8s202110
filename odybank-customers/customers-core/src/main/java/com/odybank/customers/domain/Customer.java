package com.odybank.customers.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Customer {

    private String id;
    private String nombre;
    private String apellidos;

}
