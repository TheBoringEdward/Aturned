package de.edward.players;

import de.edward.players.player;

public class knight extends player {

    public knight(String nam){
        super(nam);
        this.hp = 100;
        this.sp = 20;
        mSp = sp;
        mHp = hp;
        hr = "Knight";
    }
}
