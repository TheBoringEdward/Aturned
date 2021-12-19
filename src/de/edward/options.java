package de.edward;

import de.edward.players.knight;

import java.util.Scanner;

public class options{

    Scanner scn2 = new Scanner(System.in);

    private boolean rn = true;

    public void opti(){

        final knight p1 = new knight ("Player1");

        final debug_stuff a1 = new debug_stuff();

        a1.debug();

        while(rn){
            System.out.print("\n\n Commands at your disposal:\n 0: Quit\n 1: Check Self\n 2: Attack\n 3: Heal Self\n");
            int a = scn2.nextInt();
            switch(a){
                default -> System.out.print("\n " + a + " is not a valid command.");
                case 0 -> {
                    System.out.print("\n Quitting...");
                    rn = false;
                }
                case 1 -> p1.sStats();
                case 2 -> p1.atck();
                case 3 -> p1.sHeal();
            }
        }

        System.out.println("\n\n It's Friday may dudes!");

    }
}
