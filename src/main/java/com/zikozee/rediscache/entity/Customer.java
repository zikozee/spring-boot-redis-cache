package com.zikozee.rediscache.entity;

import lombok.*;

import java.io.Serializable;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Customer implements Serializable {
    //objects saved to cache must be serializable

    private int id;
    private String name;
    private String email;
}
