package com.jeeconf.hibernate.performancetuning.batching.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Igor Dmitriev on 4/29/16
 */
@Entity
@Getter
@Setter
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String name;
    private int age;

    @OneToMany(mappedBy = "client", cascade = CascadeType.REMOVE)
    private List<Account> accounts = new ArrayList<>();
}
