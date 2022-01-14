package de.edward.enities.players;

public class Archer extends Player {

    public Archer(String nam){
        super(nam);
        this.hp = 70;
        this.sp = 23;
        mSp = sp;
        mHp = hp;
        hr = "Archer";
    }
}
