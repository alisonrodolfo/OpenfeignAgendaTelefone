package com.cloud.clientagendatelefone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alison
 * @see RestController
 * @see RequestMapping
 * @@version 1.0
 */
//to access to use: http://localhost:3000/agenda
@RestController
@RequestMapping("agenda")
public class AgendaController {

    @Autowired
    private apiConsumer apiConsumer;

    @GetMapping
    public Contact returnContato(){
        return apiConsumer.returnContato();
    }

}
