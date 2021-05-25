package com.geektech.players;

import java.util.Random;

public class IronMan extends Avenger{

    public IronMan(int health, int damage, String name, EnumSuperAbility SuperAbility) {
        super(health, damage, name, SuperAbility);



    }

    @Override
    public void applySuperAbility(Boss thanos, Avenger[] avengers) {
        Random r = new Random();
        int heal = 2+r.nextInt(20);
        for (int i = 0; i < avengers.length; i++) {
            if (avengers[i].getHealth() > 0 && thanos.getHealth() > 0) {
                if (this.getHealth() > 0) {
                    thanos.setHealth(thanos.getHealth() - heal);
                    if (thanos.getHealth() - avengers[i].getDamage() <= 0)
                        thanos.setHealth(0);
                }
            }
        }
        if(this.getHealth()>0)
            System.out.println(avengers[1].getClass().getSimpleName() + " |Added  " + heal + " damage for avengers|");

    }
}

