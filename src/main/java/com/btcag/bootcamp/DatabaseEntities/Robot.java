package com.btcag.bootcamp.DatabaseEntities;

import javax.persistence.Entity;

import javax.persistence.*;

import java.math.BigDecimal;


@Entity
@Table(name = "Robots")
public class Robot {


    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "name")
    private String name = null;

    @Column(name = "health")
    private BigDecimal health = null;

    @Column(name = "attackDamage")
    private BigDecimal attackDamage = null;

    @Column(name = "attackRange")
    private BigDecimal attackRange = null;

    @Column(name = "movementRate")
    private BigDecimal movementRate = null;

    public Robot() {
    }


    public Robot(String name, BigDecimal health, BigDecimal attackDamage, BigDecimal attackRange, BigDecimal movementRate) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
        this.attackRange = attackRange;
        this.movementRate = movementRate;
    }


    public String getName() {
        return name;
    }

    public BigDecimal getHealth() {
        return health;
    }

    public BigDecimal getAttackDamage() {
        return attackDamage;
    }

    public BigDecimal getAttackRange() {
        return attackRange;
    }

    public BigDecimal getMovementRate() {
        return movementRate;
    }

    public String getId() {
        return id;
    }
}
