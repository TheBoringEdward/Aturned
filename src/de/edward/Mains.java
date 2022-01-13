package de.edward;

import de.edward.menu.ActionSelect;

public class Mains {

    final ActionSelect o1 =  new ActionSelect();

    public void play(){
        o1.dOpti();
    }

    public static void main(String [] args){
        Mains m = new Mains();
        m.play();
        System.out.print("\n\n -- This game has been created by TheBoringEdward with the help of a great fellow -- \n\n");
    }
}

//      This code has been provided by TheBoringEdward with the help of a great fellow
//      This code is under the license of the Unlicense
//      Cheers