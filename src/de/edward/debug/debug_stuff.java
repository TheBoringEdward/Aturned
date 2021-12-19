package de.edward.debug;

import de.edward.mains;
import de.edward.players.knight;
import de.edward.enemies.lesser_slime;

public class debug_stuff extends mains {
    public void debug(){
        final knight p2 = new knight ("Harold");
        final lesser_slime e2 = new lesser_slime ("Brutus");
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
        e2.sStats();
    }
}
