package de.edward.players;

public class Knight extends Player {

    public Knight(String nam){
        super(nam);
        this.hp = 100;
        this.sp = 20;
        mSp = sp;
        mHp = hp;
        hr = "Knight";
    }

    public void shield(){
        if(sp>=2){
            sp = sp-2;
            kurz();
            System.out.print(" brandishes their shield. They aren't quite sure why.");
        }else{
            noSP();
        }
    }
}
