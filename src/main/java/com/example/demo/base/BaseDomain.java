package com.example.demo.base;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by song on 17/2/28.
 */
public abstract class BaseDomain implements Serializable{

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
