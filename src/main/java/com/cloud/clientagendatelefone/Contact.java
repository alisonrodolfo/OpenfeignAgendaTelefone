package com.cloud.clientagendatelefone;

import lombok.Builder;
import lombok.Data;

/**
 * @author Alison
 * @see Data
 * @see Builder
 * @@version 1.0
 */

@Data
@Builder
public class Contact {
    private long id;
    private String name;
    private String phone;


}
