package de.edward.localisation;

public class en_GB {

    protected String nam; //This soley meant as a test. It does not seem intuitive, given that I do not know how to update variables reliably.
    protected double sp;

    public en_GB(String nam, double sp){
        this.nam = nam;
        this.sp = sp;
    }
    public void test(){
        System.out.print("\n\n Commands at your disposal ("+nam+"):\n 0: Quit\n 1: Check Self\n 2: Attack (2 SP)\n 3: Heal Self\n 4: Recover\n 5: Brandish Shield (2 SP)\n 6: Damage Self (1 SP)\n");
    }           //I knew this would come back to bite me in the ass. I should prob create arrays, but I'm just lazy af rn.
}           //TODO: Fix list showing actions for wrong class
//System.out.print("\n\n Commands at your disposal ("+p1.getSp()+"):\n 0: Quit\n 1: Check Self\n 2: Attack (2 SP)\n 3: Heal Self\n 4: Recover\n 5: Brandish Shield (2 SP)\n");
