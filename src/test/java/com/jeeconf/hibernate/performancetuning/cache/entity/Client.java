package com.jeeconf.hibernate.performancetuning.cache.entity;

import com.jeeconf.hibernate.performancetuning.nplusone.entity.Account;
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

    @OneToMany(mappedBy = "client")
    private List<Account> accounts = new ArrayList<>();
}
