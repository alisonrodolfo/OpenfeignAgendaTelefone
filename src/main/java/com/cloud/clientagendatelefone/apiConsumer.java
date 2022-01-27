package com.cloud.clientagendatelefone;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alison
 * @see FeignClient
 * @@version 1.0
 */

// creates a FeignClient to consume the API
@FeignClient(name="agenda",url = "http://localhost:8080/contato")
public interface apiConsumer {


    @RequestMapping(method = RequestMethod.GET, value = "/")
    Contact returnContato();

}
