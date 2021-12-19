package de.edward;

public class mains {

    public void play(){

        final player p1 = new player ("Player1", 50, 20);

        p1.sHeal();
        p1.sStats();
        p1.setSp(10);
        p1.sStats();

        System.out.println("\n\n It's Friday may dudes!");

    }

    public static void main(String [] args){
        mains me = new mains();
        me.play();
        System.out.print("\n\n --This code has been provided by TheBoringEdward with the help of a great fellow-- \n\n"); //I'm being too clingy to that boi, amn't I?
    }
}
