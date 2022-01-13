package de.edward.menu;

import java.util.Scanner;

public class OverOptions_Outdated {

    Scanner scn2 = new Scanner(System.in);

    final Options_Outdated o2 = new Options_Outdated();

    public void start(){
        System.out.print("\n\n Choose a class.\n 1: Knight\n 2: Archer\n");
        int clas = scn2.nextInt();
        System.out.print("\n\n Choose a name.\n");
        String name = scn2.nextLine();
        o2.start_opti(name, clas);
    }
}
//          OUTDATED!!!