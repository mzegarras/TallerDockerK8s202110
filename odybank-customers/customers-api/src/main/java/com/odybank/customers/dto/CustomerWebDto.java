package com.odybank.customers.dto;

import com.odybank.customers.domain.Customer;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Builder
public class CustomerWebDto {

    private Customer customer;
}
