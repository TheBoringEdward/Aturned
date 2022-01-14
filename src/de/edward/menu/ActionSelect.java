package de.edward.menu;

import de.edward.enities.players.Archer;
import de.edward.enities.players.Knight;
import de.edward.enities.players.Player;

//import de.edward.localisation.en_GB;

import java.util.Scanner;

public class ActionSelect {

    Scanner scn2 = new Scanner(System.in);

    private boolean rn = true;
    private boolean strt = true;

    public void dOpti() {

        //knight p1 = new knight ("Player1point2");

        //create an entity
        final Player p1;
        System.out.print("\n\n Choose your class\n 1: Knight\n 2: Archer\n");
        int testing = scn2.nextInt();
        switch (testing) { //TODO: Get the while loop to work
            default -> {
                System.out.print("\n " + testing + " is not a valid command.");
                return;
            }
            case 1 -> {
                System.out.print("\n\n Choose your name:\n");
                scn2.nextLine(); //Why does it have to be this way?
                String nam = scn2.nextLine();
                p1 = new Knight(nam);
            }
            case 2 -> {
                System.out.print("\n\n Choose your name:\n");
                scn2.nextLine();
                String nam = scn2.nextLine();
                p1 = new Archer(nam);  //This is bad.
            }
        }

        //en_GB k = new en_GB(p1.ham(), p1.getSp(), p1.brnd()); //This is really just a proof of concept.
                                                    //It proves that it is shit.
        while (rn) {
            //k.test();
            System.out.print("\n\n Commands at your disposal ("+p1.getNam()+", "+p1.hr()+", "+p1.getSp()+"SP, "+p1.getHp()+"HP):\n 0: Quit\n 1: Check Self\n 2: Attack (2 SP)\n 3: Heal Self\n 4: Recover\n 5: Brandish Shield (2 SP)\n 6: Damage Self (1 SP)\n");
            int a = scn2.nextInt(); // TODO: Make the print above an array. Also limit the options in the "final" version.
            switch (a) {
                default -> System.out.print("\n " + a + " is not a valid command.");
                case 0 -> {
                    System.out.print("\n Are you sure you want to quit? (0 for Yes, 1 for No)\n");
                    int i = scn2.nextInt();
                    switch (i) {
                        case 0 -> {
                            System.out.print("\n Quitting...");
                            rn = false;
                        }
                        case 1 -> System.out.print("\n Didn't quit.");
                        default -> System.out.print("\n " + i + " is not a valid command. Didn't quit by default.");
                    }
                }
                case 1 -> p1.sStats();
                case 2 -> p1.atck();
                case 3 -> p1.sHeal();
                case 4 -> p1.sRecover();
                case 5 -> {
                    if (p1 instanceof final Knight tst) {
                        tst.shield();
                    }
                }
                case 6 -> p1.atckslf();
            }

            if (p1 instanceof Archer) {
                final Archer tst = (Archer) p1;
            }
            //new en_GB(p1.ham(), p1.getSp()); //Gah
            ///System.out.print("\n\n This should show after every command."); //Debug
        }

        System.out.println("\n\n It's Friday my dudes!");

    }
}
