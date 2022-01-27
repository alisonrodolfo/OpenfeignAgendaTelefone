package com.cloud.clientagendatelefone;

import lombok.Builder;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Alison
 * @see SpringBootApplication
 * @see EnableFeignClients
 * @@version 1.0
 */

@SpringBootApplication
@EnableFeignClients
public class ClientAgendaTelefoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientAgendaTelefoneApplication.class, args);
    }

}
