package com.jeeconf.hibernate.performancetuning.nplusone.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Igor Dmitriev / Mikalai Alimenkou on 4/29/16
 */
@Entity
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_account")
    private Integer id;

    private int amount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_client")
    private Client client;

}
