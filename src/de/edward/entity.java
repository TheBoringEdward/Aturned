package de.edward;

public class entity {

    protected String nam; //name
    protected double hp; //health points
    protected double mHp; //max health points
    protected double sp; //stamina points
    protected double mSp; //may stamina points
    protected String brnd; //brand
    protected String hr; //species

    public entity(String nam){
        this.nam = nam;
    }

    public void sHeal(){
        if (hp == mHp) {
            System.out.print("\n\n " + nam + " is already at max health!");
            //System.out.println(mHp);
        }else if(hp+5 > mHp){ //If 5 hp is more than enough, only heal as much as needed
            //double i = hp+5;
            int j = (int) (mHp-hp);
            hp = mHp;
            System.out.print("\n\n "+nam+" heals "+j+" HP. ("+hp+" HP)"); //Kinda pointless but we need those aesthetics
        }else{
            hp = hp+5;
            System.out.print("\n\n "+nam+" heals 5 HP. ("+hp+" HP)");
        }
    }

    public void sRecover() {
        if (sp == mSp) {
            System.out.print("\n\n " + nam + " already has full stamina!");
            //System.out.println(mHp);
        }else if(sp+5 > mSp){
            //double i = sp+5;
            int j = (int) (mSp-sp);
            sp = mSp;
            kurz();
            System.out.print(" recovers "+j+" sp. ("+sp+" SP)");
        }else{
            sp = sp+5;
            kurz();
            System.out.print(" recovers 5 sp. ("+sp+" SP)");
        }
    }

    public void atck(){
        double i = Math.random()*6;
        if (i > 2 && i < 5) {
            kurz();
            System.out.print(" punches the air. They loose 2 SP." + i);
            sp = sp - 2;
        } else if (i<2){
            kurz();
            System.out.print(" tries to punch the air but blunders. They loose 2 SP and 1 HP." + i);
            sp = sp - 2;
            hp = hp - 1;
        }else if(i>4){
            kurz();
            System.out.print(" strikes a critical hit against the air. The atmosphere retreats. They loose 2 SP." + i);
            sp = sp - 2;
        }
    }
    
    public void sStats(){
        System.out.print("\n\n The "+brnd()+" " + nam + " is a " + hr() + " with " + hp + " HP. They have a maximum stamina of " + mSp);
        if(mSp != sp) {
            System.out.print(" of which they have " + sp + " points left.");
            //System.out.print("\n\n " + nam + " is a " + hr() + " with " + hp + " HP. They have a maximum stamina of " + mSp + ".");
        }else{
            System.out.print(".");
        }
            //System.out.print("\n\n " + nam + " is a " + hr() + " with " + hp + " HP. They have a maximum stamina of " + mSp + " of which they have " + sp + " points left.");
    } //TODO: Add stamina system; Add multiple entities

    protected String hr(){
        return hr;
    }

    protected String brnd(){
        return brnd;
    }

    protected void kurz(){
        System.out.print("\n\n "+nam+" the "+hr());
    }

    public void setSp(double sp){
        this.sp = sp;
        System.out.print("\n\n "+nam+"'s SP set to "+this.sp);
    }

    public void setHp(double hp){
        this.hp = hp;
        System.out.print("\n\n "+nam+"'s HP set to "+this.hp);
    }
}