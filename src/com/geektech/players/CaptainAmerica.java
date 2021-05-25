package com.geektech.players;

import java.util.Random;

public class CaptainAmerica extends Avenger {


    private int damPoints;

    public CaptainAmerica(int health, int damage, String name, EnumSuperAbility SuperAbility) {
        super(health, damage, name, SuperAbility);

    }

    @Override
    public void applySuperAbility(Boss thanos, Avenger[] avengers) {

        for (int i = 0; i < avengers.length; i++) {
            if (avengers[i].getDamage() > 0 && avengers[i] != this){
                avengers[i].setDamage(damPoints + avengers[i].getHealth());
            }
        }
        System.out.println(this.getName() + " to damage " + damPoints);
    }

}