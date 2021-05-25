package com.geektech.players;

import com.geektech.game.GameEntity;

public class Avenger extends GameEntity implements SuperAbility{

    private EnumSuperAbility superAbility;

    public Avenger(int health, int damage, String name, EnumSuperAbility SuperAbility) {
        super(health, damage, name);
        this.superAbility = SuperAbility;
    }

    @Override
    public void applySuperAbility(Boss thanos, Avenger[] avengers) {

    }
}
