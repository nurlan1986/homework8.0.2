package com.geektech.players;


import java.text.MessageFormat;
import java.util.Random;

public class Hulk extends Avenger{

    public Hulk(int health, int damage, String name, EnumSuperAbility SuperAbility) {
        super(health, damage, name, SuperAbility);



    }

    @Override
    public void applySuperAbility(Boss thanos, Avenger[] avengers) {
        Random r = new Random();
        int random = 1 + r.nextInt(2);
        if (this.getHealth() > 0) {
            int temp = avengers[0].getDamage() * random;
            if (thanos.getHealth() - this.getDamage() <= 0)
                thanos.setHealth(0);
            thanos.setHealth(thanos.getHealth() + this.getDamage()-temp);
            System.out.println(avengers[0].getClass().getSimpleName() + " |умножил на " + temp + " урона|");
        }


    }
}

