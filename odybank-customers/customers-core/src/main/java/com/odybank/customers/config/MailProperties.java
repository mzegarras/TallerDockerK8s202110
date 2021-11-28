package com.odybank.customers.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "customers.mail")
@Getter
@Setter
@Validated
public class MailProperties {

    @NotNull(message = "Server may not be null")
    @NotEmpty(message = "Server may not be empty")
    private String server;

    @NotNull(message = "User may not be null")
    private String user;

    @Size(min = 8, max = 10)
    private String password;

    @Min(9090)
    @Max(9095)
    private int port;

}
