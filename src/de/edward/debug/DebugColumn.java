package de.edward.debug;

import de.edward.enities.players.Knight;
import de.edward.enities.enemies.LesserSlime;

public class DebugColumn {
    public void debug(){
        final Knight p2 = new Knight("Harold");
        final LesserSlime e2 = new LesserSlime("Brutus");
        p2.sHeal();
        p2.sStats();
        p2.setSp(10);
        p2.sStats();
        p2.atckAir();
        p2.sStats();
        p2.sRecover();
        p2.sRecover();
        p2.sRecover();
        p2.sRecover();
        p2.setHp(60);
        p2.sHeal();
        p2.sStats();
        e2.sStats();
        e2.atckAir();
        e2.atckslf();
    }
}
