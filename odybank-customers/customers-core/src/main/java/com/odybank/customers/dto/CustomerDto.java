package com.odybank.customers.dto;


import com.odybank.customers.domain.Customer;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerDto {
    private Customer customer;
}
