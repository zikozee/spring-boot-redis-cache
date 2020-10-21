package com.zikozee.rediscache.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements Serializable {
    //objects saved to cache must be serializable

    private int id;
    private String name;
    private String email;
}
