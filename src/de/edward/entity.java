package de.edward;

public class entity {

    protected String nam; //name
    protected double hp; //health points
    protected double sp; //stamina points
    protected double mSp; //may stamina points
    protected String hr; //species

    public entity(String nam, double hp, double sp){
        this.nam = nam;
        this.hp = hp;
        this.sp = sp;
        mSp = sp;
    }

    //Test

    public void sHeal(){
        hp = hp+5;
        System.out.print("\n\n "+nam+" healed 5 hp. ("+hp+" hp)");
    }
    
    public void sStats(){
        System.out.print("\n\n " + nam + " is a " + hr() + " with " + hp + " HP. They have a maximum stamina of " + mSp);
        if(mSp != sp) {
            System.out.print(" of which they have " + sp + " points left.");
            //System.out.print("\n\n " + nam + " is a " + hr() + " with " + hp + " HP. They have a maximum stamina of " + mSp + ".");
        }else{
            System.out.print(".");
        }
            //System.out.print("\n\n " + nam + " is a " + hr() + " with " + hp + " HP. They have a maximum stamina of " + mSp + " of which they have " + sp + " points left.");
    }

    protected String hr(){
        return hr;
    }

    public void setSp(double sp){
        this.sp = sp;
        System.out.print("\n\n "+nam+"'s SP set to "+this.sp);
    }
}