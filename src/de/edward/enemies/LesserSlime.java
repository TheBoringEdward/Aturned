package de.edward.enemies;

public class LesserSlime extends Enemy {

    public LesserSlime(String nam){
        super(nam);
        this.hp = 20;
        this.sp = 99999;
        mSp = sp;
        mHp = hp;
        hr = "Lesser Slime";
    }

}
