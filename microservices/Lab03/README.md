# Create services
1. En el módulo -service, crear la interface: CustomerService
    ```java
        package com.odybank.customers.service;

        public interface CustomerService {

            String getNombres(int id);
            String getCuenta(int id);
            int calcular(int n1,int n2);

        }
    ```
1. En el módulo -service, crear la clase: CustomerServiceImpl
    ```java
    package com.odybank.customers.service;

    import com.odybank.customers.config.MailProperties;
    import lombok.AllArgsConstructor;
    import org.springframework.stereotype.Service;

    @Service
    @AllArgsConstructor
    public class CustomerServiceImpl implements CustomerService{

        @Override
        public String getNombres(int id) {

            return String.format("Nomnbre: %s %s", id,"demo");
        }

        @Override
        public String getCuenta(int id) {
            return String.format("Cuenta: %s", id);
        }

        @Override
        public int calcular(int n1, int n2) {
            return n1 + n2;
        }
    }
    ```
1. Como agregamos referencia a MailProperties??  