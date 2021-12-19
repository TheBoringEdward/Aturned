package de.edward.enemies;

import de.edward.entity;

public class enemy extends entity{

    public enemy(String nam){
        super(nam);
        brnd = "enemy";
    }

    public void sStats(){
        System.out.print("\n\n The "+brnd()+" " + nam + " is a " + hr() + " with " + hp + " HP.");
    } //Enemies do not show stamina. Some very low level enemies shouldn't even require stamina.

}
