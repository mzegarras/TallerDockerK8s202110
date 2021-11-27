# Create services
1. En el módulo -core, organizarlo por dominio, crear los package
    * com.odybank.customers.domain
    * com.odybank.customers.config
    * com.odybank.customers.dto
    * com.odybank.security.domain
    * com.odybank.security.dto
    * com.odybank.cards.domain
    * com.odybank.cards.dto


1. En el módulo -core, crear la clase: Customer
    ```java
    package com.odybank.customers.domain;

    import lombok.Getter;
    import lombok.Setter;

    @Getter
    @Setter
    public class Customer {
        private String id;
        private String nombres;
        private String paterno;
    }
    ```
1. En el módulo -core, crear la clase: CustomerDto

    ```java
    package com.odybank.customers.dto;

    import com.odybank.customers.domain.Customer;
    import lombok.Builder;
    import lombok.Data;

    @Data
    @Builder
    public class CustomerDto {
        private Customer customer;
    }
    ```