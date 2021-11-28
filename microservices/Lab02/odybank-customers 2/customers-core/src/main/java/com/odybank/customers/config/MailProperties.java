package com.odybank.customers.config;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "customers.mail")
@EnableConfigurationProperties
@Validated
public class MailProperties {

    @NotNull(message = "Server may not be null")
    private String server;

    @NotEmpty(message = "User may not be empty")
    private String user;

    @Size(min = 8, max = 10)
    private String password;

    @NotNull
    @Min(9090)
    @Max(9095)
    private int port;


}
