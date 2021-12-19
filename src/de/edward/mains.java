package de.edward;

import de.edward.debug.d_options;
import de.edward.menu.over_options;

public class mains {

    final d_options o1 =  new d_options();
    final over_options o2 = new over_options();

    public void play(){
        o1.dOpti();
        //o2.start();
    }

    public static void main(String [] args){
        mains m = new mains();
        m.play();
        System.out.print("\n\n -- This game has been created by TheBoringEdward with the help of a great fellow -- \n\n");
    }
}

//      This code has been provided by TheBoringEdward with the help of a great fellow
//      This code is under the license of the Unlicense
//      Cheers