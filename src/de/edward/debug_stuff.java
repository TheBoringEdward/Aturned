package de.edward;

import de.edward.players.knight;

public class debug_stuff extends mains{
    public void debug(){
        final knight p2 = new knight ("Harold");
        p2.sHeal();
        p2.sStats();
        p2.setSp(10);
        p2.sStats();
        p2.atck();
        p2.sStats();
        p2.sRecover();
        p2.sRecover();
        p2.sRecover();
        p2.sRecover();
        p2.setHp(60);
        p2.sHeal();
        p2.sStats();
    }
}
