package de.edward;

import de.edward.debug.DebugColumn;
import de.edward.menu.ActionSelect;

public class MainClass {

    final ActionSelect o1 =  new ActionSelect();
    final DebugColumn a1 = new DebugColumn();


    public void play(){
        a1.debug();
        o1.dOpti();
    }

    public static void main(String [] args){
        MainClass m = new MainClass();
        m.play();
        System.out.print("\n\n -- This game has been created by TheBoringEdward with the help of a great fellow -- \n\n");
    }
}

//      This code has been provided by TheBoringEdward with the help of a great fellow
//      This code is under the license of the Unlicense
//      Cheers