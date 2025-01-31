package com.btcag.bootcamp;

import java.math.BigDecimal;

public class Robot {
    private String name = null;

    private BigDecimal health = null;

    private BigDecimal attackDamage = null;

    private BigDecimal attackRange = null;

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
}
