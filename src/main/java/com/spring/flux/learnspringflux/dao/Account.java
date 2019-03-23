package com.spring.flux.learnspringflux.dao;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Project: learn-spring-flux
 * Package: com.spring.flux.learnspringflux.dao
 * <p>
 * User: vamshi
 * Date: 2019-03-23
 * Time: 09:12
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Document
@Data
public class Account {

    @Id
    private String id;
    private String owner;
    private Double value;

    // getters and setters
}