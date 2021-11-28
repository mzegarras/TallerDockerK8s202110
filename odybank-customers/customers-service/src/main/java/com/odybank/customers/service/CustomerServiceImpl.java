package com.odybank.customers.service;

import com.odybank.customers.config.MailProperties;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService{

    private final MailProperties mailProperties;

    @Override
    public String getNombres(int id) {
        return String.format("Nombres: %s %s", id,mailProperties.getServer());
    }

    @Override
    public String getCuenta(int id) {
        return String.format("Cuenta: %s %s", id,"Cuenta");
    }

    @Override
    public int calcular(int n1, int n2) {
        return n1 + n2;
    }
}
